package com.example.guessingnumbergame

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    var randomNumber :  Int = Random.nextInt(1,1000)
    var intentos : Int = 0
    fun doClick(view: View) {
        val numberUser : Int
        val Texbox : EditText = findViewById(R.id.text1)
        numberUser= Integer.parseInt( Texbox.getText().toString())
        println("El numero es : $randomNumber")
        if (numberUser < randomNumber)
        {
            Toast.makeText(this, "El numero es mayor", Toast.LENGTH_SHORT).show()
            intentos++
        }
        else if  (numberUser > randomNumber)
        {
            Toast.makeText(this, "El numero es menor", Toast.LENGTH_SHORT).show()
            intentos++
        }
        else if(numberUser == randomNumber)
        {
            Toast.makeText(this, "¡Has adivinado el numero! y tu numero de intentos fueron $intentos", Toast.LENGTH_LONG).show()
        }
    }

    fun reset (v: View)
    {
        Toast.makeText(this,"¡El numero era $randomNumber , Tus intentos fueron $intentos! ", Toast.LENGTH_LONG).show()
        val i = Intent(this, MainActivity::class.java)
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(i)
    }
}
