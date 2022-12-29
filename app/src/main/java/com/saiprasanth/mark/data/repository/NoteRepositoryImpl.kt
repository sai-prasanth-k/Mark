package com.saiprasanth.mark.data.repository

import android.provider.ContactsContract
import com.saiprasanth.mark.data.data_source.MarkDao
import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: MarkDao
): NoteRepository{
    override fun getAllData(): Flow<List<MarkEntity>> {
        return dao.getAllData()
    }

    override suspend fun getDataById(id: Int): MarkEntity? {
        return dao.getDataById(id)
    }

    override suspend fun insertData(entity: MarkEntity) {
        return dao.insertData(entity)
    }

    override suspend fun deleteData(entity: ContactsContract.CommonDataKinds.Note) {
        return dao.deleteData(entity)
    }
}