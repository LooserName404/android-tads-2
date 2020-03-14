package dev.loosername.helloworldnoite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)
        val output = findViewById<TextView>(R.id.output)

        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusButton)
        val timesButton: Button = findViewById(R.id.timesButton)
        val divisionButton: Button = findViewById(R.id.divisionButton)

        plusButton.setOnClickListener { output.setText((convertInt(input1) + convertInt(input2)).toString())}
        minusButton.setOnClickListener { output.setText((convertInt(input1) - convertInt(input2)).toString())}
        timesButton.setOnClickListener { output.setText((convertInt(input1) * convertInt(input2)).toString())}
        divisionButton.setOnClickListener { output.setText((convertInt(input1) / convertInt(input2)).toString())}
    }

    private fun convertInt(input: EditText): Float = input.text.toString().toFloat()
}
