package com.saiprasanth.mark.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.saiprasanth.mark.ui.theme.Blue
import com.saiprasanth.mark.ui.theme.Green
import com.saiprasanth.mark.ui.theme.Grey
import com.saiprasanth.mark.ui.theme.Red

@Entity
data class Notes(
    @PrimaryKey
    val id : Int? = null,
    val title : String,
    val description :String,
    val time : Long,
    val color : Int
    ){
    companion object{
        val colorNote = listOf(
            Red,
            Blue,
            Green,
            Grey
        )
    }
}

