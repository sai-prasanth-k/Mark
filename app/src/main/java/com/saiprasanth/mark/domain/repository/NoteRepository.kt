package com.saiprasanth.mark.domain.repository

import com.saiprasanth.mark.data.data_source.MarkEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

     fun getAllData():Flow<List<MarkEntity>>

     suspend fun getDataById(id: Int):MarkEntity?

     suspend fun insertData(entity: MarkEntity)

     suspend fun deleteData(entity: MarkEntity)
}