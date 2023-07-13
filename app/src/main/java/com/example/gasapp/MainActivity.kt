package com.example.gasapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var editAlcool: EditText
    private lateinit var editGasolina: EditText
    private lateinit var button2: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editAlcool = findViewById(R.id.editAlcool)
        editGasolina = findViewById(R.id.editGasolina)
        button2 = findViewById(R.id.button2)
        textResultado = findViewById(R.id.textResultado)

        button2.setOnClickListener {
            val precoAlcool = editAlcool.text.toString().toDouble()
            val precoGasolina = editGasolina.text.toString().toDouble()

            val resultado = compararPrecos(precoAlcool, precoGasolina)

            textResultado.text = resultado
        }
    }

    private fun compararPrecos(precoAlcool: Double, precoGasolina: Double): String {

    val proporcao = precoAlcool / precoGasolina

    return if (proporcao < 0.7) {
        "Compensa abastecer com Álcool!"
    } else {
        "Compensa abastecer com Gasolina!"
    }
}
}
    
    
