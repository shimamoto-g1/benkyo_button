package jp.shimamoto.benkyo_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch3.text = "すいっち"


        var pm: Boolean = false

        var y = 0
        button.setOnClickListener {
            pm = toggleButton3.isChecked
            if (pm) {
                y--
            } else {
                y++
            }
            button.text = "${y}杯\n88.8ドリンク\n生ビール"
        }

        var x = 0
        line1.setOnClickListener {
            pm = toggleButton3.isChecked
            if (pm) {
                x--
            } else {
                x++
            }

            textView4.text = x.toString()
            textView5.text = "test"
            textView6.text = "test"
        }



    }
}