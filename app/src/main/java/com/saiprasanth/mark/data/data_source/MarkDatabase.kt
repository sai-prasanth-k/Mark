package com.saiprasanth.mark.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [
        MarkEntity::class
    ],
    version = 1
)
abstract class MarkDatabase: RoomDatabase() {
    abstract val databaseDao : MarkDao

    companion object {
        val DATABASE_NAME = "mark_db"
    }
}