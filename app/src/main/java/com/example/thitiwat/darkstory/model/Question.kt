package com.example.thitiwat.darkstory.model

class Question(var id: Int=0 ,var topic:String ,var keyword:Array<String>,var answer:String,var story:String) {

    fun isMatchKeyWord(answer: String):Boolean {
        var userAnswer = answer
        var corrent: Boolean = false
        userAnswer = answer.trim()

        this.keyword.forEach {
            if (userAnswer.contains(it))
                corrent = true
        }

        return corrent
    }
}