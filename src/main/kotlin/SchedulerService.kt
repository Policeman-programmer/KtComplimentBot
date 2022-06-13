import com.github.kotlintelegrambot.entities.ChatId
import java.time.LocalTime
import java.util.*
import kotlin.concurrent.thread
import kotlin.random.Random.Default.nextInt

private var timeForNextCompliment: Long = System.currentTimeMillis()

val maxTimeToNextCompliment = HOURS_6_MS

val randomScheduler = thread {
    while (true) {
        if (LocalTime.now(KYIV_ZONE_ID).isAfter(BEGIN_OF_DAY) && LocalTime.now(KYIV_ZONE_ID).isBefore(END_OF_DAY)) {
            if (System.currentTimeMillis() > timeForNextCompliment) {
                complimentBot.sendMessage(chatId = ChatId.fromId(MY_CHAT_ID), text = getCompliment())
                calculateTimeForNextCompliment()
            }
        }
    }
}

private fun calculateTimeForNextCompliment() {
    val delay = nextInt(maxTimeToNextCompliment)
    println("delay is: " + delay / 1000 / 60 + " minutes")
    timeForNextCompliment = System.currentTimeMillis() + delay
    println("Next compliment will be at: " + Date(timeForNextCompliment))
}
