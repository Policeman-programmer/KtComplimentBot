import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import java.io.File

val complimentIterator = File("./src/main/resources/compliments.txt").bufferedReader().readLines().shuffled()
    .iterator()


val complimentBot = bot {
    println("Building bot")
    token = "5190160613:AAEptI8l0_IJqsH-M6c_38rqFXzxCgKAPQE"
    dispatch {

        text(COMPLIMENT_AGAIN) {
            println(message.chat.id)
            bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = getCompliment())
        }

        command("start") {
            val result = bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Hello there!")
        }
    }
}

fun main() {

    if(randomScheduler.isAlive) randomScheduler.interrupt() else randomScheduler.start()
    println("random Scheduler started")

    complimentBot.startPolling()

}

fun getCompliment(): String {
    val compliment = complimentIterator.next()
    println("Compliment to send: $compliment")
    return "Koхана, $compliment"
}

