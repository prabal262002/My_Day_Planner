package com.example.mydayplanner

import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class TaskItem (var name:String,
                var desc:String,
                var duetime:LocalTime?,
                var compleetedDate:LocalDate?,
                var id:UUID = UUID.randomUUID())   {

}