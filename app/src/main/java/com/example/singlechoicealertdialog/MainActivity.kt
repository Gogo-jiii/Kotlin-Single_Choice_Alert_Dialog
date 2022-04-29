package com.example.singlechoicealertdialog

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var data = arrayOf("a", "b", "c")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowSingleChoiceDialog.setOnClickListener(View.OnClickListener {
            val alertDialog = SingleChoiceDialog(this@MainActivity, data)
            alertDialog.show(supportFragmentManager, "single choice dialog")
            alertDialog.isCancelable = false
        })
    }
}