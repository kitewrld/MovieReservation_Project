import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] seat = new String[3][5];
		int reservationSeatNum = 1000;
		Reservation reser = new Reservation();

		while (true) {
			System.out.print("1.������ ��ȭ 2.�¼����� 3.��ȭ���� 4.��� 5.���� : ");
			int choice = sc.nextInt();
			System.out.println();
			
			if (choice == 1) {
//				System.out.println();
				System.out.println("================ ������ ��ȭ =================");
				System.out.println();
				System.out.println("���� \t �󿵽ð� \t  �帣 \t ���� \t���");
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
				System.out.print("�¼���ȣ�� �������ּ���. >> ");
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
				System.out.println("������ �����ȣ�� " + seat[line][num] + "�Դϴ�.");
				System.out.println();
			} else if (choice == 4) {
				System.out.print("����Ͻ� �����ȣ�� �Է����ּ��� >> ");
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
				System.out.println("���α׷��� ���� �˴ϴ�. �����մϴ�.");
				return;
			} else {
				System.out.println("�߸��� �Է¶�");
				System.out.println();
			}
		}
	}
}