package cinema

const val ACTION_SHOW = 1
const val ACTION_BUY = 2
const val ACTION_STATS = 3
const val ACTION_EXIT = 0

const val SYMBOL_VACANT_SEAT = "S"
const val SYMBOL_BOOKED_SEAT = "B"

const val PRICE_IN_FRONT = 10
const val PRICE_IN_BACK = 8
const val SMALL_CINEMA_MAX_SEAT_COUNT = 60


fun initCinema(): MutableList<MutableList<String>> {

    println("Enter the number of rows:")
    val rowsInCinema = readln().toInt()
    println("Enter the number of seats in each row:")
    val seatsInRow = readln().toInt()

    val cinema = mutableListOf<MutableList<String>>()

    for (r in 0..rowsInCinema) {
        cinema.add(MutableList(seatsInRow + 1) { "" })
        for (s in 0..seatsInRow) {
            when (r) {
                0 -> {
                    if (s == 0) cinema[r][s] = " " else cinema[r][s] = s.toString()
                }
                else -> {
                    if (s == 0) cinema[r][s] = r.toString() else cinema[r][s] = SYMBOL_VACANT_SEAT
                }
            }
        }
    }

    return cinema
}

fun showMenu(): Int {
    println("$ACTION_SHOW. Show the seats")
    println("$ACTION_BUY. Buy a ticket")
    println("$ACTION_STATS. Statistics")
    println("$ACTION_EXIT. Exit")
    return readln().toInt()
}

fun showSeats(cinema: MutableList<MutableList<String>>) {
    println("Cinema:")
    for (row in cinema) {
        println(row.joinToString(" "))
    }
}

fun buyTicket(cinema: MutableList<MutableList<String>>) {

    while (true) {
        println("Enter a row number:")
        val r = readln().toInt()
        println("Enter a seat number in that row:")
        val s = readln().toInt()

        var price: Int = PRICE_IN_FRONT

        val rowCount = cinema.size - 1
        val seatCount = cinema[1].size - 1

        if (rowCount * seatCount > SMALL_CINEMA_MAX_SEAT_COUNT && r > rowCount / 2) {
            price = PRICE_IN_BACK
        }

        if (r > rowCount || s > seatCount) {
            println("Wrong input!")
        } else if (cinema[r][s] == SYMBOL_BOOKED_SEAT) {
            println("That ticket has already been purchased!")
        } else {
            println("Ticket price: $$price")
            cinema[r][s] = SYMBOL_BOOKED_SEAT
            break
        }
    }
}

fun showStats(cinema: MutableList<MutableList<String>>) {

    val rowCount = cinema.size - 1
    val seatCount = (cinema[1].size - 1)
    val totalSeatCount = rowCount * seatCount

    var ticketsBot = 0
    var currentIncome = 0
    var totalIncome = 0

    var price: Int = PRICE_IN_FRONT

    for (r in 1..rowCount) {
        for (s in 1..seatCount) {

            if (rowCount * seatCount > SMALL_CINEMA_MAX_SEAT_COUNT && r > rowCount / 2) {
                price = PRICE_IN_BACK
            }

            totalIncome += price

            if (cinema[r][s] == SYMBOL_BOOKED_SEAT) {
                ticketsBot += 1
                currentIncome += price
            }
        }
    }

    val percentageBot: String = "%.2f".format(ticketsBot * 100.00/ totalSeatCount)

    println("Number of purchased tickets: $ticketsBot")
    println("Percentage: $percentageBot%")
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")

}

fun main() {

    val cinema = initCinema()

    while (true) {
        when (showMenu()) {
           ACTION_SHOW -> showSeats(cinema)
           ACTION_BUY -> buyTicket(cinema)
           ACTION_STATS -> showStats(cinema)
           ACTION_EXIT -> break
       }
   }
}