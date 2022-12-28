package com.saiprasanth.mark.domain.usecase

import com.saiprasanth.mark.data.data_source.MarkEntity
import com.saiprasanth.mark.domain.repository.NoteRepository
import com.saiprasanth.mark.domain.util.NoteOrder
import com.saiprasanth.mark.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetData(
    private val repository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(orderType = OrderType.DescendingOrder)
    ): Flow<List<MarkEntity>>{
        return repository.getAllData().map {notes ->
            when(noteOrder.orderType){
                is OrderType.AscendingOrder ->{
                    when(noteOrder){
                        is NoteOrder.Title-> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date->notes.sortedBy { it.time }
                        is NoteOrder.Color->notes.sortedBy { it.color }
                    }
                }
                is OrderType.DescendingOrder -> {
                    when(noteOrder){
                        is NoteOrder.Title-> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date->notes.sortedByDescending { it.time }
                        is NoteOrder.Color->notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}