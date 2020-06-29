class Robot(val name: String)
{
    fun about()
    {
        println("Hi Kartikey !")
        println("I am your Kotlin Robot. My name is ${this.name}")
        println("I will help you in your day to day tasks!")
        println("You have asked me the following")
    }

    fun alarm(time:String,day:String)
    {
        println("SET ALARM:")
        println("Alarm set for ${time} and Day: ${day}")
    }
    fun coffee(way:String,sugar:Int)
    {
        println("MAKE COFFEE")
        println("Preparing your coffee ${way} and will add ${sugar} sugar cubes.")
    }
    fun heatwater(temp: Int)
    {
        val tempstr: String
        if(temp>100)
            tempstr="Very Hot"
        else if(temp<=100 && temp>50)
            tempstr="Mild"
        else
            tempstr="Cold"

        println("HEAT WATER")
        println("Ok. I will prepare the water at a temperature of "+temp+" ,ie, at "+ tempstr+" condition")
    }
    fun packbag(day:Int)
    {
        var dayl:String = "Monday"
        when(day)
        {
            0 -> dayl="Monday"
            1 -> dayl="Tuesday"
            2 -> dayl="Wednesday"
            3 -> dayl="Thursday"
            4 -> dayl="Friday"
            5 -> dayl="Saturday"
            6 -> dayl="Sunday"
        }
        println("PACK BAG")
        println("Ok. Packing your bag according to the timetable of $dayl")
    }
    fun cook(food:String)
    {
        println("COOK FOOD")
        println("Today, I will cook $food for you!")
    }
    fun iron(cloth: String)
    {
        println("IRON CLOTHES")
        println("Ok. I will iron your clothes for you. Today, you have chosen to wear $cloth")
    }
    fun end()
    {
        println("I hope I didn't dissapoint you. Going to recharge myself. See you later Kartikey!")
    }
}