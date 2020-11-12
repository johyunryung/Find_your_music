package kr.hs.emirim.s2019w37.findyoumusic

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class logo_page : AppCompatActivity(){
    private val SPLASH_TIME_OUT : Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logo_page)

        Handler().postDelayed({
            startActivity(Intent(this, main_page::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}