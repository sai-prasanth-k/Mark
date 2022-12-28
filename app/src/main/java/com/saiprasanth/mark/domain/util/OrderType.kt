package com.saiprasanth.mark.domain.util

sealed class OrderType(){
    object AscendingOrder: OrderType()
    object DescendingOrder: OrderType()
}
