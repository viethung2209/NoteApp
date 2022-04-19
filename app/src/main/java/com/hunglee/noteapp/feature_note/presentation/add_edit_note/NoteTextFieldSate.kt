package com.hunglee.noteapp.feature_note.presentation.add_edit_note

data class NoteTextFieldSate(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)