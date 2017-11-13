import java.util.Scanner;
import java.util.Stack;

public class Program {
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		char t;
		Stack s = new Stack();

		System.out.println("Programul tau consta din");
		System.out.println("Sa te trezesti la ora 6:30");
		System.out.println("Sa fi gata la ora 6:50");
		System.out.println("Sa ajungi la autobuz la ora 6:55");
		System.out.println("Sa intri in scoala la ora 8:10");
		System.out.println("Sa studiezi pana la ora 14:00");
		System.out.println("Sa mergi acasa la ora 15:00 ");
		System.out.println();

		System.out.println("Te ai trezit ?y/n");
		t = f.next().charAt(0);
		if (t == 'y') {
			s.push("Wake up at 6:30 ");
		} else {
			s.push("You dint wake up");
		}
		System.out.println("Esti gata sa iesi din casa y/n");
		t = f.next().charAt(0);
		if (t == 'y') {
			s.push("Get ready for the school 6:50");
		} else {
			s.push("You got ready at 6:55");
		}
		System.out.println("Ai asuns la autoboz la timp? y/n");
		t = f.next().charAt(0);
		if (t == 'y') {
			s.push("Go to get the buss 6:55");
		} else {
			s.push("you lost the buss");
		}
		System.out.println("Ai ajuns la scoala? y/n");
		t = f.next().charAt(0);
		if (t == 'y') {
			s.push("Arvive at the school at 8:10");
		} else {
			s.push("You arive at school at 10;00");

		}
		System.out.println("Ai studiat pana la ora 14 y/n");
		t = f.next().charAt(0);
		if (t == 'y') {
			s.push("Learn study till 14 ");

			System.out.println();

			System.out.println("Ce ai facut in ziu de azi");
			for (int i = 0; i < s.size(); i++) {
				System.out.println(s.lastElement());
				s.pop();
			}

		}

		System.out.println("Ai ajuns acasa la ora 15?");
		t = f.next().charAt(0);
		if (t == 'y') {
			s.push("Im home at 15:00");

		} else {
			s.push("Im home at 16:00");
		}

	}
}
