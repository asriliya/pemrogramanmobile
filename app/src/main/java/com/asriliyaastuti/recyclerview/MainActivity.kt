package com.asriliyaastuti.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asriliyaastuti.recyclerview.adapter.AdapterTeamBola
import com.asriliyaastuti.recyclerview.databinding.ActivityMainBinding
import com.asriliyaastuti.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Thibaut Courtois",R.drawable.courtois, "Penjaga gawang", "2.00 m", "Bree(Belgia)","11 Mei 1992"))
        listPemain.add(Pemain("Karim Benzema",R.drawable.benzema, "Penyerang", "1,85 m", "Lyon(Perancis)","19 Desember 1987"))
        listPemain.add(Pemain("Marcelo Vieira da Silvia",R.drawable.marcello, "Belakang", "1,74 m", "Rio de Janeiro(Brasil)","12 Mei 1988"))
        listPemain.add(Pemain("Sergio Ramos Garcia",R.drawable.ramos, "Belakang", "1,84 m", "Camas(Sevilla)","30 Marety 1986"))
        listPemain.add(Pemain("Zinedine Yazid Zidane",R.drawable.zidan, "Pelatih", "1,85 m", "Marseille(Perancis)","23 Juni 1972"))

        binding.list.adapter = AdapterTeamBola(this,listPemain,object : AdapterTeamBola.OnClickListener {
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })


    }
}