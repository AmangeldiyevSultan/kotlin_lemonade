package com.example.kotlin_lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Image(){

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lemonadeButton: ImageButton = findViewById(R.id.imageButton)
        lemonadeButton.setOnClickListener{ lemonadeButton();};
    }
    var counter = 0;
    private fun lemonadeButton(){

        val resultImageView: ImageView =findViewById(R.id.imageButton)
        if(counter == 0) {
            resultImageView.setImageResource(R.drawable.tree)
            counter++;
        }
        else if(counter == 1){
            resultImageView.setImageResource(R.drawable.limon)
            counter++;
        }
        else if(counter == 2){
            resultImageView.setImageResource(R.drawable.water)
            counter++;
        }
        else if(counter == 3){
            resultImageView.setImageResource(R.drawable.lemwater)
            counter++;
        } else{
            counter = 0;
        }

    }
}