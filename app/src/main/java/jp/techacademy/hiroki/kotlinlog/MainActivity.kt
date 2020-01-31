package jp.techacademy.hiroki.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("谷瀬", 23,"サッカー")
        human.say()
        human.think()

        val human2 = Human("山田", 30,"野球")
        human2.say()
        human2.think()
    }
}