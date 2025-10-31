// Kotlin
        package com.lanangfajri.post4_264

        import android.os.Bundle
        import android.widget.Toast
        import androidx.appcompat.app.AppCompatActivity
        import com.lanangfajri.post4_264.databinding.ActivityMainBinding

        class MainActivity : AppCompatActivity() {

            private lateinit var binding: ActivityMainBinding
            private lateinit var db: WargaDatabase
            private lateinit var dao: WargaDao

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)

                db = WargaDatabase.getDatabase(applicationContext)
                dao = db.wargaDao()

                loadDataWarga()

                binding.btnSimpanData.setOnClickListener {
                    simpanData()
                }

                binding.btnResetData.setOnClickListener {
                    resetData()
                }
            }

            private fun clearForm() {
                binding.etNamaLengkap.text?.clear()
                binding.etNIK.text?.clear()
                binding.etKabupaten.text?.clear()
                binding.etKecamatan.text?.clear()
                binding.etDesa.text?.clear()
                binding.etRT.text?.clear()
                binding.etRW.text?.clear()
                binding.rgJenisKelamin.check(R.id.rbLakiLaki)
                binding.spinnerStatusPernikahan.setSelection(0)
            }

            private fun loadDataWarga() {
                val wargaList = dao.getAllWarga()
                if (wargaList.isEmpty()) {
                    binding.tvDaftarWarga.text = "Belum ada data warga yang tersimpan."
                } else {
                    val stringBuilder = StringBuilder()
                    wargaList.forEachIndexed { index, warga ->
                        stringBuilder.append("${index + 1}. ${warga.nama} (${warga.jenisKelamin}) - ${warga.statusPernikahan}\n")
                        stringBuilder.append("   NIK: ${warga.nik}\n")
                        stringBuilder.append("   Alamat: RT ${warga.rt}/RW ${warga.rw}, ${warga.desa}, ${warga.kecamatan}, ${warga.kabupaten}\n\n")
                    }
                    binding.tvDaftarWarga.text = stringBuilder.toString()
                }
            }

            private fun simpanData() {
                val nama = binding.etNamaLengkap.text?.toString()?.trim().orEmpty()
                val nik = binding.etNIK.text?.toString()?.trim().orEmpty()
                val kabupaten = binding.etKabupaten.text?.toString()?.trim().orEmpty()
                val kecamatan = binding.etKecamatan.text?.toString()?.trim().orEmpty()
                val desa = binding.etDesa.text?.toString()?.trim().orEmpty()
                val rt = binding.etRT.text?.toString()?.trim().orEmpty()
                val rw = binding.etRW.text?.toString()?.trim().orEmpty()
                val selectedJenisKelaminId = binding.rgJenisKelamin.checkedRadioButtonId
                val jenisKelamin = if (selectedJenisKelaminId == R.id.rbLakiLaki) "Laki-Laki" else "Perempuan"
                val statusPernikahan = binding.spinnerStatusPernikahan.selectedItem?.toString().orEmpty()

                if (nama.isEmpty() || nik.isEmpty() || kabupaten.isEmpty() || kecamatan.isEmpty() ||
                    desa.isEmpty() || rt.isEmpty() || rw.isEmpty()) {
                    Toast.makeText(this, "Semua data harus diisi!", Toast.LENGTH_SHORT).show()
                    return
                }

                if (nik.length != 16) {
                    Toast.makeText(this, "NIK harus terdiri dari 16 digit!", Toast.LENGTH_SHORT).show()
                    return
                }

                val warga = Warga(
                    nama = nama, nik = nik, kabupaten = kabupaten, kecamatan = kecamatan,
                    desa = desa, rt = rt, rw = rw, jenisKelamin = jenisKelamin,
                    statusPernikahan = statusPernikahan
                )

                dao.insert(warga)
                Toast.makeText(this, "Data berhasil disimpan!", Toast.LENGTH_SHORT).show()
                loadDataWarga()
                clearForm()
            }

            private fun resetData() {
                dao.clearAndResetAllData()
                Toast.makeText(this, "Semua data berhasil dihapus!", Toast.LENGTH_SHORT).show()
                clearForm()
                loadDataWarga()
            }
        }