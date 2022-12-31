package com.saiprasanth.mark.presentation.notes.components

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.saiprasanth.mark.domain.util.NoteOrder
import com.saiprasanth.mark.domain.util.OrderType
import com.saiprasanth.mark.presentation.notes.NotesEvent

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.DescendingOrder),
    onOrderChange :(NoteOrder) -> Unit
){
    Column(modifier= modifier) {
        Row (
            modifier = Modifier.fillMaxWidth()
                ){
            DefaultRatioButton(text = "Title",
                selected = noteOrder is NoteOrder.Title,
                onSelect = {
                    onOrderChange(NoteOrder.Title(noteOrder.orderType))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))

            DefaultRatioButton(text = "By Date",
                selected = noteOrder is NoteOrder.Date,
                onSelect = {
                    onOrderChange(NoteOrder.Date(noteOrder.orderType))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))

            DefaultRatioButton(text = "Color",
                selected = noteOrder is NoteOrder.Color,
                onSelect = {
                    onOrderChange(NoteOrder.Color(noteOrder.orderType))
                }
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            DefaultRatioButton(text = "Ascending",
                selected = noteOrder.orderType is OrderType.AscendingOrder,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.AscendingOrder))
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRatioButton(text = "Descending",
                selected = noteOrder.orderType is OrderType.DescendingOrder,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.DescendingOrder))
                }
            )
        }
    }
}