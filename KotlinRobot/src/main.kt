// Kotlin Robot Submission

fun main()
{
    val bot = Robot("Sophia")
    val mycoffee=Coffee("Without Milk",2)
    val food= arrayListOf<String>("Pad Thai","Rajma Chawal","Cheeseburger","Dosa","Idli Sambhar","Chole Chawal","McD")
    val day = listOf(0,1,2,3,4,5,6)
    val heat= listOf(40,60,80,100,10,25,75,85)
    val timetable = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val time= listOf("4:30 pm","8:00 am","5:30 pm","10 am","12 noon")
    val cloth= listOf("Formals","Casuals","PJs","Chinos")

    //Functions
    bot.about()
    bot.alarm(time.random(),timetable.random())
    bot.coffee(mycoffee.way,mycoffee.sugar)
    bot.heatwater(heat.random())
    bot.packbag(day.random())
    bot.cook(food.random())
    bot.iron(cloth.random())

}