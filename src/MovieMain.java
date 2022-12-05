import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] seat = new String[3][5];
		int reservationSeatNum = 1000;
		Reservation reser = new Reservation();

		while (true) {
			System.out.print("1.상영중인 영화 2.좌석보기 3.영화예매 4.취소 5.종료 : ");
			int choice = sc.nextInt();
			System.out.println();
			
			if (choice == 1) {
//				System.out.println();
				System.out.println("================ 상영중인 영화 =================");
				System.out.println();
				System.out.println("제목 \t 상영시간 \t  장르 \t 감독 \t등급");
				System.out.println(reser.todayShow());
				System.out.println();
				System.out.println("===========================================");
				System.out.println();
			} else if (choice == 2) {
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						System.out.print((char) ('A' + i));
						System.out.print(reser.SeatCheck(seat[i][j], j) + "\t");
					}
					System.out.println();
				}
				System.out.println();
			} else if (choice == 3) {
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						System.out.print((char) ('A' + i));
						System.out.print(reser.SeatCheck(seat[i][j], j) + "\t");
					}
					System.out.println();
				}
				System.out.println();
				System.out.print("좌석번호를 선택해주세요. >> ");
				String seatNum = sc.next();
				char[] reservationSeat = seatNum.toCharArray();
				System.out.println();

				int line = reservationSeat[0] - 'A';
				int num = reservationSeat[1] - '0';
				seat[line][num] = reservationSeat[0] + String.valueOf(reservationSeatNum);
				reservationSeatNum++;

				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						System.out.print((char) ('A' + i));
						System.out.print(reser.SeatCheck(seat[i][j], j) + "\t");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("고객님의 예약번호는 " + seat[line][num] + "입니다.");
				System.out.println();
			} else if (choice == 4) {
				System.out.print("취소하실 예약번호를 입력해주세요 >> ");
				String seatNum = sc.next();
				System.out.println();

				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if (seatNum.equals(seat[i][j])) {
							seat[i][j] = null;
						}
					}
				}

				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						System.out.print((char) ('A' + i));
						System.out.print(reser.SeatCheck(seat[i][j], j) + "\t");
					}
					System.out.println();
				}
			} else if (choice == 5) {
				System.out.println("프로그램이 종료 됩니다. 감사합니다.");
				return;
			} else {
				System.out.println("잘못된 입력띠");
				System.out.println();
			}
		}
	}
}