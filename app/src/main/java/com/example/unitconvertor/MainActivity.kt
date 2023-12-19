package com.example.unitconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input : TextView = findViewById(R.id.editText)
        var result : TextView = findViewById(R.id.resultText)
        var check1 : RadioButton = findViewById(R.id.f_to_c_Check)
        var check2 : RadioButton = findViewById(R.id.c_to_f_Check)
        var convert : Button = findViewById(R.id.button)





        convert.setOnClickListener {
            if (check1.isChecked) {

                var text: Double = input.text.toString().toDouble()

                result.setText(" " +output1(text)+"ºC")

            }else if (check2.isChecked){

                var text: Double = input.text.toString().toDouble()

                result.setText(" " +output2(text)+"ºF")
                
            }
            
            else{
                Toast.makeText(this, "Please Select the Conversion", Toast.LENGTH_SHORT).show()
            }
        }




    }
    fun output1 (text : Double) : Double {


        var finalresult  = text
        return (finalresult-32)/1.8000


    }

    fun output2 (text : Double) : Double {


        var finalresult1  = text
        return finalresult1*1.8+32


    }
}
