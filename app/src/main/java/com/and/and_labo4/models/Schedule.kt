package com.and.and_labo4.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


/**
 * Schedule model
 */
@Entity
data class Schedule(
    @PrimaryKey(autoGenerate = true) var scheduleId : Long?,
    var ownerId : Long,
    var date : Calendar
)