package uz.datatalim.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnFirst:Button=findViewById(R.id.btnFirst)
        val btnSec:Button=findViewById(R.id.btnSec)

        btnFirst.setOnClickListener {

            val first=FirstFragment()
            setFragment(first)

        }

        btnSec.setOnClickListener {

            val sec=SecondFragment()
            setFragment(sec)

        }

    }

    private fun setFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.frFirst,fragment).commit()

    }
}