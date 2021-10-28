package io.sahil.barbelldrive.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_table")
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true) private val id: Int,
    @ColumnInfo(name = "week") private var week: Int,
    @ColumnInfo(name = "day") private var day: Int,
    @ColumnInfo(name = "order_number") private var order: Int,
    @ColumnInfo(name = "name") private var name: String,
    @ColumnInfo(name = "weight") private var weight: String,
    @ColumnInfo(name = "sets") private var sets: String,
    @ColumnInfo(name = "reps") private var reps: String,
    @ColumnInfo(name = "rpe") private var rpe: String,
) {
}