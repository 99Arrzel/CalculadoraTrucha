package com.example.silvacalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var valorA = ""
        var valorB = "" // solo para que se parezca a la de windows
        var valorDiv = ""
        var lastop = ""
        var resultado: Float = 0.00f
        var cadena = ""
        var cambionumero = 1
        var sgtNega = 0
        bttn7.setOnClickListener {
            valorA += "7"
            cadena += "7"
            lblresult.text = valorA
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn8.setOnClickListener {
            valorA += "8"
            cadena += "8"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn9.setOnClickListener {
            valorA += "9"
            cadena += "9"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn4.setOnClickListener {
            valorA += "4"
            cadena += "4"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn5.setOnClickListener {
            valorA += "5"
            cadena += "5"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn6.setOnClickListener {
            valorA += "6"
            cadena += "6"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn1.setOnClickListener {
            valorA += "1"
            cadena += "1"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn2.setOnClickListener {
            valorA += "2"
            cadena += "2"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn3.setOnClickListener {
            valorA += "3"
            cadena += "3"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }
        bttn0.setOnClickListener {
            valorA += "0"
            cadena += "0"
            lblresult.text = resultado.toString()
            lblresult2.text = cadena
            cambionumero = 1
        }

        bttnsum.setOnClickListener {
            if (valorA != "") {
                if (sgtNega == 1) {
                    valorA = "-$valorA"
                    sgtNega = 0
                }
                resultado += valorA.toFloat()
                lblresult.text = resultado.toString()
            }
            if (cambionumero == 1) {
                cambionumero = 0
                cadena += "+"
                lblresult.text = resultado.toString()
            }
            lblresult2.text = cadena
            valorA = ""

            lastop = "suma"
        }
        bttnrest.setOnClickListener {
            if (valorA != "") {
                if (sgtNega == 1) {
                    valorA = (valorA.toFloat() * -1).toString()
                    sgtNega = 0
                }
                resultado -= valorA.toFloat()
                lblresult.text = resultado.toString()
            }
            if (cambionumero == 1) {
                cambionumero = 0
                cadena += "-"
                lblresult.text = resultado.toString()
            }
            lblresult2.text = cadena
            valorA = ""
            lastop = "resta"
            sgtNega = 1
        }
        bttnmult.setOnClickListener {
            if (valorA != "") {
                if (sgtNega == 1) {
                    valorA = (valorA.toFloat() * -1).toString()
                    sgtNega = 0
                }
                resultado = (resultado + 1) * valorA.toFloat()
                lblresult.text = resultado.toString()
            }
            if (cambionumero == 1) {
                cambionumero = 0
                cadena += "*"
                lblresult.text = resultado.toString()
            }
            lblresult2.text = cadena
            valorA = ""
            lastop = "multi"
        }

        bttndiv.setOnClickListener {
            if (valorA != "") {
                if (sgtNega == 1) {
                    valorA = (valorA.toFloat() * -1).toString()
                    sgtNega = 0
                }
                if (resultado == 0.0f)
                {
                    resultado = 1f
                }
                resultado = valorA.toFloat() / resultado

                lblresult.text = resultado.toString()
            }
            if (cambionumero == 1) {
                cambionumero = 0
                cadena += "/"
                lblresult.text = resultado.toString()
            }
            lblresult2.text = cadena
            valorA = ""
            lastop = "divi"
            lblresult.text = resultado.toString()
        }

        bttnC.setOnClickListener {
            valorA = ""
            resultado = 0.00f
            cadena = ""
            lblresult2.text = ""
            lblresult.text = ""
            cambionumero = 1
            sgtNega = 0

        }
        bttnequal.setOnClickListener {
            if (valorA != "") {
                valorB = valorA
            }
            if (valorB != "") {
                if (lastop == "suma") {
                    resultado += valorB.toFloat()
                }
                if (lastop == "resta") {
                    resultado -= valorB.toFloat()
                }
                if (lastop == "multi") {
                    resultado *= valorB.toFloat()
                }
                if (lastop == "divi") {
                    resultado /= valorB.toFloat()
                }
                valorA = ""
            }

            lblresult.text = resultado.toString()
        }
    }
}

