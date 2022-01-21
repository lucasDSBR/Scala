import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.text.DateFormat._

object DataBrasil {
  def main(args: Array[String]) = {
    val now = new Date
    val df = new SimpleDateFormat("dd/MM/yyyy")
    println(df format now)
  }
}
