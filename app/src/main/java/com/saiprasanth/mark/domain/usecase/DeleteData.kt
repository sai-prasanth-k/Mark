package com.saiprasanth.mark.domain.usecase

import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.repository.NoteRepository

class DeleteData(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(entity: MarkEntity){
        return repository.deleteData(entity)
    }
}