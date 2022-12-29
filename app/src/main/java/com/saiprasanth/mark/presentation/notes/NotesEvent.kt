package com.saiprasanth.mark.presentation.notes

import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note : MarkEntity): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
