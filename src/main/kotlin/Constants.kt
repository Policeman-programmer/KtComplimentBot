import java.time.LocalTime
import java.time.ZoneId

var COMPLIMENT_AGAIN = "А можна ще компліментик? :)"

var START = "/start"

var KYIV_ZONE_ID = ZoneId.of("Europe/Kiev")

var BEGIN_OF_DAY = LocalTime.of(8, 0)

var END_OF_DAY = LocalTime.of(22, 0)

var MY_USER_NAME = "Yevhenii_Tr"

var DI_USER_NAME = "TrDiana"

var DI_CHAT_ID = "302864380"

var MY_CHAT_ID = 272231277L

var REGISTER =
   "/register" //register as bot owner. When compliment receiver will send the reply Bot Owner will receive this reply


var OTHER_TEXT_REPLY = "Я розумію лише певні команди, тож я передам це послання вашому коханому"

var CHANGE_COMPLIMENT_INTERVAL = "Хочу змінити інтервал отримання компліментів"

var DAY = "добу"

var HOURS_12 = "12 годин"

var HOURS_6 = "6 годин"

var HOURS_3 = "3 години"

var DAY_MILLS = 86400000

var HOURS_12_MS = 43200000

var HOURS_6_MS = 21600000

var HOURS_3_MS = 10800000

var NEXT_COMPLIMENT_TIME_NOTIFICATION = "Інтервал змінено. Наступний комплімент буде не пізніше ніж через "