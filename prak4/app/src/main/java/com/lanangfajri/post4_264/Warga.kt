package com.lanangfajri.post4_264

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabel_warga")
data class Warga(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "nama")
    var nama: String? = null,
    @ColumnInfo(name = "nik")
    var nik: String? = null,
    @ColumnInfo(name = "kabupaten")
    var kabupaten: String? = null,
    @ColumnInfo(name = "kecamatan")
    var kecamatan: String? = null,
    @ColumnInfo(name = "desa")
    var desa: String? = null,
    @ColumnInfo(name = "rt")
    var rt: String? = null,
    @ColumnInfo(name = "rw")
    var rw: String? = null,
    @ColumnInfo(name = "jenis_kelamin")
    var jenisKelamin: String? = null,
    @ColumnInfo(name = "status_pernikahan")
    var statusPernikahan: String? = null
)