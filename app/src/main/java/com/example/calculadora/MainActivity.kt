package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
   private var varAnt:Double=0.0
    private var operador:Char='?'
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn0.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"0")
        }
        binding.btnpunto.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+".")

        }
        binding.btn1.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"1")
        }
        binding.btn2.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"2")
        }
        binding.btn3.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"3")
        }
        binding.btn4.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"4")
        }
        binding.btn5.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"5")
        }
        binding.btn6.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"6")
        }
        binding.btn7.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"7")
        }
        binding.btn8.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"8")
        }
        binding.btn9.setOnClickListener {
            binding.text.setText(binding.text.text.toString()+"9")

        }
        binding.btnmas.setOnClickListener {

            if (operador != '?') {
                var resultado = varAnt + (binding.text.text.toString().toDouble())
                varAnt = resultado
                operador = '+'
                binding.text.setText(" ")
            } else {
                varAnt = binding.text.text.toString().toDouble()
                operador = '+'
                binding.text.setText(" ")
            }

        }
        binding.btnmenos.setOnClickListener {

            if (operador != '?') {
                var resultado = varAnt - (binding.text.text.toString().toDouble())
                varAnt = resultado
                operador = '-'
                binding.text.setText(" ")
            } else {
                varAnt = binding.text.text.toString().toDouble()
                operador = '-'
                binding.text.setText(" ")
            }

        }
        binding.btnpor.setOnClickListener {

            if (operador != '?') {
                var resultado = varAnt * (binding.text.text.toString().toDouble())
                varAnt = resultado
                operador = '*'
                binding.text.setText(" ")
            } else {
                varAnt = binding.text.text.toString().toDouble()
                operador = '*'
                binding.text.setText(" ")
            }

        }
        binding.btnentre.setOnClickListener {

            if (operador != '?') {
                var resultado = varAnt / (binding.text.text.toString().toDouble())
                varAnt = resultado
                operador = '/'
                binding.text.setText(" ")
            } else {
                varAnt = binding.text.text.toString().toDouble()
                operador = '/'
                binding.text.setText(" ")
            }

        }
        binding.btnigual.setOnClickListener {
            if (operador != '?') {
                when (operador) {
                    '+' -> {
                        var result = varAnt + binding.text.text.toString().toDouble()
                        binding.text.setText("" + result)
                        operador = '?'
                    }
                    '-' -> {
                        var result = varAnt - binding.text.text.toString().toDouble()
                        binding.text.setText("" + result)
                        operador = '?'
                    }
                    '*' -> {
                        var result = varAnt * binding.text.text.toString().toDouble()
                        binding.text.setText("" + result)
                        operador = '?'
                    }
                    '/' -> {
                        var result = varAnt / binding.text.text.toString().toDouble()
                        binding.text.setText("" + result)
                        operador = '?'
                    }

                }
            }
        }
        binding.btnac.setOnClickListener{
            binding.text.setText(" ")
            varAnt=0.0
            operador='?'
        }
        binding.btnmasmenos.setOnClickListener{
            binding.text.setText(""+(binding.text.text.toString().toDouble())*(-1))
        }
        binding.btnporcentaje.setOnClickListener{
            binding.text.setText(""+(binding.text.text.toString().toDouble())/100)
        }
    }
    private fun numeroPresionado(digito: String){

    }
}