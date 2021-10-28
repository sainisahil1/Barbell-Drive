package io.sahil.barbelldrive.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import io.sahil.barbelldrive.data.db.entities.ExerciseEntity

@Dao()
interface ExerciseDao {

    @Query("SELECT * FROM exercise_table WHERE week LIKE :week GROUP BY day ORDER BY order_number")
    fun getByWeekGroupByDayOrderByOrder(week: Int): List<ExerciseEntity>

    @Update
    fun updateExercise(exerciseEntity: ExerciseEntity)

    @Query("DELETE FROM exercise_table")
    fun clearTable()

}