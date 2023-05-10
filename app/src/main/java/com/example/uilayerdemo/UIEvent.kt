package com.example.uilayerdemo

sealed class UIEvent{
  data class ShowMessage(val message:String):UIEvent()
}
