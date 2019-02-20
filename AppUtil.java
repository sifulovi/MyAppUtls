import java.sql.Timestamp
import java.text.SimpleDateFormat

class AppUtil {

//get date from timestamp
    static getDateToTimestamp(){
        Date date = new Date()
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S")
        def currentDate = dateFormat.format(date)
        Date parsedDate = dateFormat.parse(currentDate)
        Timestamp timestamp = new Timestamp(parsedDate.getTime())
        return timestamp
    }
}
