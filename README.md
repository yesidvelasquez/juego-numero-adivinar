# juego-numero-adivinar
juego de adivinar un numero de forma aleatoria
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    import java.util.Scanner;
    import java.util.Random;

    public class AdivinaNumero

    {
        public void Adivina()
        {
            int numero;
            int recibido;
            int Escala = 1000;
            Random aleatorio = new Random();
            Scanner entrada = new Scanner(System.in);

            numero = aleatorio.nextInt(Escala) + 1;

            System.out.printf("\nTengo un numero entero entre 1 y %d. ", Escala);
            System.out.println("Puede adivinarlo?");
            System.out.println("\nPor favor introduzca un numero: \n");
            recibido = entrada.nextInt();

            while ( recibido != numero )
            {
                if ( recibido > numero )
                {
                    System.out.println("\nEl numero es muy grande, por favor intenta de nuevo.");
                    recibido = entrada.nextInt();
                }
                else
                {

                    System.out.println("\nEl numero es muy chico, por favor intenta de nuevo.");
                    recibido = entrada.nextInt();
                }

            }

            System.out.println("\nHAS ADIVINADO EL NUMERO!");

        }
