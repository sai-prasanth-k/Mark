package com.saiprasanth.mark.presentation.editNotes

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent{
    data class EnterTitle(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnterDescription(val value: String): AddEditNoteEvent()
    data class ChangeDescriptionFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote : AddEditNoteEvent()
}