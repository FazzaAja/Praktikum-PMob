package com.lanangfajri.post4_264

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface WargaDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(warga: Warga)

    @Query("DELETE FROM tabel_warga")
    fun deleteAll()

    @Query("SELECT * from tabel_warga ORDER BY id ASC")
    fun getAllWarga(): List<Warga>

    @Query("DELETE FROM sqlite_sequence WHERE name = 'tabel_warga'")
    fun resetAutoIncrementSequence()

    @Transaction
    fun clearAndResetAllData() {
        deleteAll()
        resetAutoIncrementSequence()
    }
}