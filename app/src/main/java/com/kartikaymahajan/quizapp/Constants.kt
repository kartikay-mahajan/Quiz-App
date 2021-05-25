package com.kartikaymahajan.quizapp

object Constants{

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        val que1=Question(1,
            "What country does this flag belong to?",
            R.drawable.ic_australia,
            "Argentina",
            "Australia",
            "Austria",
            "germany",
            2
        )
        questionsList.add(que1)

        val que2=Question(2,
            "What country does this flag belong to?",
            R.drawable.ic_georgia,
            "Argentina",
            "georgia",
            "Austria",
            "germany",
            2
        )
        questionsList.add(que2)

        val que3=Question(3,
            "What country does this flag belong to?",
            R.drawable.ic_france,
            "Argentina",
            "france",
            "Austria",
            "germany",
            2
        )
        questionsList.add(que3)

        val que4=Question(4,
            "What country does this flag belong to?",
            R.drawable.ic_america,
            "Argentina",
            "America",
            "Austria",
            "germany",
            2
        )
        questionsList.add(que4)

        val que5=Question(5,
            "What country does this flag belong to?",
            R.drawable.ic_germany,
            "Argentina",
            "germany",
            "Austria",
            "africa",
            2
        )
        questionsList.add(que5)

        val que6=Question(6,
            "What country does this flag belong to?",
            R.drawable.ic_canada,
            "Argentina",
            "canada",
            "Austria",
            "germany",
            2
        )
        questionsList.add(que6)

        return questionsList
    }
}