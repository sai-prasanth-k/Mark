package com.saiprasanth.mark.presentation.editNotes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.ViewModel
import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.usecase.DataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

@HiltViewModel
class AddEditViewModel @Inject constructor(
    private val dataUseCase: DataUseCase
):ViewModel() {
    private val _noteTitle = mutableStateOf(
        NoteTextFieldState(
        hint = "Enter title..."
    )
    )
    val noteTitle: State<NoteTextFieldState> = _noteTitle

    private val _noteDescription = mutableStateOf(
        NoteTextFieldState(
        hint = "Enter some Content"
    )
    )
    val noteDescription : State<NoteTextFieldState> = _noteDescription

    private val _noteColor = mutableStateOf(MarkEntity.noteColor.random().toArgb())
    val noteColor: State<Int> = _noteColor

    private val _eventFlow = MutableSharedFlow<UiEvent>()

//    fun onEvent(event: )

    sealed class UiEvent{
        data class ShowSnackBar(val message : String): UiEvent()
            object SaveNote : UiEvent()
    }
}