package com.saiprasanth.mark.domain.usecase

import com.saiprasanth.mark.data.data_source.InvalidException
import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidException::class)
    suspend operator fun invoke(note : MarkEntity){
        if(note.title.isBlank()){
            throw InvalidException("The title is empty")
        }
        if (note.description.isBlank()){
            throw  InvalidException("The content is empty")
        }
        repository.insertData(note)
    }
}