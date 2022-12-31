package com.saiprasanth.mark.domain.usecase

import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.model.Notes
import com.saiprasanth.mark.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id : Int):MarkEntity?{
        return repository.getDataById(id)
    }
}