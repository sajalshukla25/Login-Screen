package com.example.loginjetpackcompose.ui.theme

import androidx.lifecycle.ViewModel

class FactsViewModel : ViewModel() {



    fun getDogFacts() : List<String>{
        val dogFacts = listOf(
            "Dogs have a 'ruff' time understanding why squirrels dont't want to play fetch.",
            "If dogs could text , their message would be mostly 'food?' , 'walk?' , and 'belly rubs?'.",
            "Dogs have a 'pawsitive' outlook on life.",
            "Dogs think we're amazing just because we can open a can.",
            "To a dog, car ride is like the ultimate roller coaster."
        )
        return dogFacts
    }
}