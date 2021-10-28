package io.sahil.barbelldrive.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "week_table")
data class WeekEntity(
    @PrimaryKey(autoGenerate = true) private val id: Int,
    @ColumnInfo(name = "week") private val week: Int
) {
}