package com.saiprasanth.mark.data.data_source

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saiprasanth.mark.ui.theme.Blue
import com.saiprasanth.mark.ui.theme.Green
import com.saiprasanth.mark.ui.theme.Red

@Entity
data class MarkEntity(
    @PrimaryKey
    val id : Int? = null,
    val title : String,
    val description : String,
    val time : Long,
    val color : Int
){
    companion object {
        val noteColor = listOf(
            Red,
            Blue,
            Green,
            Green
        )
    }
}