package com.saiprasanth.mark.presentation.editNotes

data class NoteTextFieldState(
    val text : String = "",
    val hint : String = "",
    val isHintVisible : Boolean = true
)