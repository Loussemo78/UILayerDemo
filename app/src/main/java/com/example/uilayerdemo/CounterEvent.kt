package com.example.uilayerdemo

sealed class CounterEvent{
    data class ValueEntered(val value : String):CounterEvent()
    object CounterButtonClicked : CounterEvent()
    object ResetButtonClicked : CounterEvent()

}
