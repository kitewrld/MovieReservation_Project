//package MovieReservation_Project;

public class Reservation {
    private String[][] seat;    
    private String seatNum;
    private int reservationSeatNum;
    private MovieVo movie;

    public Reservation() {
        super();
        movie = new MovieVo("올빼미", 118, "스릴러", "안태진", 15);
        seat = new String[5][5];
        reservationSeatNum = 1000;
    }

    public MovieVo todayShow() {
        return movie;
    }

    public String SeatCheck(String seat, int j) {
        if (seat == null) {
            return j + "[====]";
        } else {
            return j + "[XXXX]";
        }
    }
}