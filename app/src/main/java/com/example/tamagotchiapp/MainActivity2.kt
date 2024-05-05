package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.max
import kotlin.math.min

private const val HUNGER_DECREASE_ENTERTAIN = 3
private const val CLEANLINESS_DECREASE_ENTERTAIN = 2
private const val HUNGER_INCREASE = 10
private const val CLEANLINESS_INCREASE = 15
private const val HEALTH_INCREASE_ENTERTAIN = 5  // Health increase when conditions met
private const val MIN_HUNGER_FOR_HEALTH_INCREASE = 70  // Minimum hunger for health increase
private const val MIN_CLEANLINESS_FOR_HEALTH_INCREASE = 70 // Minimum cleanliness for health increase

class MainActivity2 : AppCompatActivity() {

    private lateinit var petImageView: ImageView
    private lateinit var hungerText: TextView
    private lateinit var healthText: TextView
    private lateinit var cleanlinessText: TextView
    private lateinit var foodButton: Button
    private lateinit var bathButton: Button
    private lateinit var entertainButton: Button
    private lateinit var newGameButton: Button

    private val initialHealth = 40
    private val initialHunger = 40
    private val initialCleanliness = 40
    private var health = initialHealth
    private var hunger = initialHunger
    private var cleanliness = initialCleanliness

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        petImageView = findViewById(R.id.petImageView)
        hungerText = findViewById(R.id.hungerText)
        healthText = findViewById(R.id.healthText)
        cleanlinessText = findViewById(R.id.cleanlinessText)
        foodButton = findViewById(R.id.foodButton)
        bathButton = findViewById(R.id.bathButton)
        entertainButton = findViewById(R.id.entertainButton)
        newGameButton = findViewById(R.id.newGameButton)  // New game button

        updateTextValues()

        foodButton.setOnClickListener {
            hunger = min(hunger + HUNGER_INCREASE, 100)
            updateTextValues()
            updatePetImage()
        }

        bathButton.setOnClickListener {
            cleanliness = min(cleanliness + CLEANLINESS_INCREASE, 100)
            updateTextValues()
            updatePetImage()
        }

        entertainButton.setOnClickListener {
            if (hunger >= MIN_HUNGER_FOR_HEALTH_INCREASE && cleanliness >= MIN_CLEANLINESS_FOR_HEALTH_INCREASE && health > 0) {
                health = min(health + HEALTH_INCREASE_ENTERTAIN, 100)
            }
            val hungerDecrease = max(hunger - HUNGER_DECREASE_ENTERTAIN, 0)
            val cleanlinessDecrease = max(cleanliness - CLEANLINESS_DECREASE_ENTERTAIN, 0)
            health -= (hungerDecrease + cleanlinessDecrease) // Health decrease
            health = max(health, 0) // Prevent negative health
            hunger = hungerDecrease
            cleanliness = cleanlinessDecrease
            updateTextValues()
            updatePetImage()
        }

        newGameButton.setOnClickListener {  // New game functionality
            health = initialHealth
            hunger = initialHunger
            cleanliness = initialCleanliness
            updateTextValues()
            updatePetImage()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateTextValues() {
        hungerText.text = "Hunger: $hunger"
        healthText.text = "Health: $health"
        cleanlinessText.text = "Cleanliness: $cleanliness"
    }

    private fun updatePetImage() {
        val imageResource = when (health) {
            in 0..33 -> R.drawable.image_sick
            in 34..66 -> R.drawable.image_average
            else -> R.drawable.image_healthy
        }
        petImageView.setImageResource(imageResource)
    }
}
