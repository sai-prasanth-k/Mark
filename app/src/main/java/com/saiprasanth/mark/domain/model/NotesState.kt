package com.saiprasanth.mark.domain.model

import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.util.NoteOrder
import com.saiprasanth.mark.domain.util.OrderType

data class NotesState(
    val notes : List<MarkEntity> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.DescendingOrder),
    val isOrderSectionVisible : Boolean = false
)
