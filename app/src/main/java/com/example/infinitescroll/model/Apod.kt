package com.example.infinitescroll.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "apods")
data class Apod(
    val copyright : String,
    @PrimaryKey val date : Calendar,
    val explanation : String,
    val hdUrl : String,
    val mediaType : String,
    val serviceVersion : String,
    val title : String,
    val url : String
)