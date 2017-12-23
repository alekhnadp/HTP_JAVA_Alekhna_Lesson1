import java.util.Scanner;

//���� ����
//����� ���
public class MainApp {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.age = 20;
		student1.avgMark = 7.5;
		student1.name = "Ivan";
		System.out.println("student1 name: " + student1.name);
		System.out.println("student1 age: " + student1.age);
		System.out.println("student1 avgMark: " + student1.avgMark);

		calculate();
	}

	// ������� 1
	static void hello() {
		System.out.println("Hello Java!");
		return;
	}

	// ������� 2
	static void fio() {
		System.out.println("������\n�������\n��������");
		return;
	}

	// ������� 3
	static void summ() {
		int three = 3, five = 5;
		System.out.println(three + five + " ������");
		return;
	}

	// �������4
	static void hundred() {
		int t = 0;
		for (int i = 0; i <= 100; i++) {
			t = t + i;
		}
		System.out.println(t);
		return;
	}

	// ������� 4.1
	static void calculate() {
		for (;;) {
			Scanner sc = new Scanner(System.in);
			String scc = sc.nextLine();
			if (scc.indexOf(' ') != -1) {
				break;
			} else {
				String[] string = scc.split("\\+|\\*|\\-|\\/");
				int a = Integer.valueOf(string[0]);
				int b = Integer.valueOf(string[1]);
				if (scc.indexOf('*') != -1) {
					System.out.println(a * b);
				} else if (scc.indexOf('+') != -1) {
					System.out.println(a + b);
				} else if (scc.indexOf('-') != -1) {
					System.out.println(a - b);
				} else if (scc.indexOf('/') != -1) {
					System.out.println(a / b);
				}
			}
		}
	}

	// ������� 5
	static void number() {
		Scanner sc5 = new Scanner(System.in);
		int z5 = sc5.nextInt();
		switch (z5) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("���");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("����");
			break;
		case 6:
			System.out.println("�����");
			break;
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("������");
			break;
		case 9:
			System.out.println("������");
			break;
		}
		return;
	}

	// ������� 6
	static void chetn() {
		Scanner sc6 = new Scanner(System.in);
		int z6 = sc6.nextInt();
		if (z6 % 2 == 0) {
			System.out.println("����� ������");
		} else
			System.out.println("����� �� ������");
		return;
	}

	// ������ 7
	static void chetnNull() {
		Scanner sc7 = new Scanner(System.in);
		int z7 = sc7.nextInt();
		if (z7 % 2 == 0 && z7 > 0) {
			System.out.println("����� ������ � ������ ����");
		} else
			System.out.println("����� �� ������");
		return;
	}

	// ������ 8
	static void big() {
		int max8;
		int sc81 = 10, sc82 = 5, sc83 = 7;
		if (sc81 > sc82 && sc81 > sc83) {
			System.out.println(sc81);
		} else if (sc82 > sc83) {
			System.out.println(sc82);
		} else
			System.out.println(sc83);
		return;
	}

	// ������ 9
	static void timeYear() {
		Scanner sc9 = new Scanner(System.in);
		String mounth = sc9.nextLine();

		switch (mounth) {
		case "December":
			System.out.println("Whinter");
			break;
		case "January":
			System.out.println("Whinter");
			break;
		case "February":
			System.out.println("Whinter");
			break;
		case "Mart":
			System.out.println("Spring");
			break;
		case "April":
			System.out.println("Spring");
			break;
		case "May":
			System.out.println("Spring");
			break;
		case "June":
			System.out.println("Summer");
			break;
		case "Jule":
			System.out.println("Summer");
			break;
		case "August":
			System.out.println("Summer");
			break;
		case "September":
			System.out.println("Autumn");
			break;
		case "October":
			System.out.println("Autumn");
			break;
		case "November":
			System.out.println("Autumn");
			break;
		}
		return;
	}

	// ����� � ������ �� ������� �����
	static void lesson() {
		int[] z = new int[5]; // ���������� ������� c ��������� �����������
		// �������

		for (int i = 0; i < 4; i++) {
			System.out.println(i);

		}

		int j = 0;

		while (j < 5) {
			System.out.println("j=" + j);
			j = j + 3;
		}

		/*
		 * do { j = j++; System.out.println("new j=" + j); } while (j < 8);
		 */
		int k = z[0];
		z[1] = 15;
		return;
	}

}

/*
 * �������� �������� � ���������� �����������, ������� ������������ ����
 * ����������� �����, �������� int - Integer � �������� ���� ���� ������,
 * �������� ����� valueOf �������� ��������� ���������� ���� �� ��������� ���
 * (�������� � ������ ����� ����� ��������� ����(���� ����� �������������
 * ��������� ���������� ����, ������ �������))
 */