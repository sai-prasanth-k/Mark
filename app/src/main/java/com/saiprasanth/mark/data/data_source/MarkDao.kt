package com.saiprasanth.mark.data.data_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface MarkDao {

    @Query("SELECT * FROM MarkEntity")
     fun getAllData():Flow<List<MarkEntity>>

     @Query("SELECT * FROM MarkEntity WHERE id = :id")
     suspend fun getDataById(id: Int): MarkEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(entity: MarkEntity)

    @Delete
    suspend fun deleteData(entity: MarkEntity)


}