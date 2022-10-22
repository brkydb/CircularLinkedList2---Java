import java.util.Scanner;

public class BagliListe {

	Scanner scan = new Scanner(System.in);

	Node head = null;
	Node tail = null;

	void basaekle() {

		int data;
		System.out.println("Data: ");
		data = scan.nextInt();

		Node eleman = new Node(data);

		if (head == null) {

			head = eleman;
			tail = eleman;
			tail.next = head;

		} else if (head != null) {

			eleman.next = head;
			head = eleman;
			tail.next = head;

		}

	}

	void sonaekle() {

		int data;
		System.out.println("Data: ");
		data = scan.nextInt();

		Node eleman = new Node(data);

		if (head == null) {

			head = eleman;
			tail = eleman;
			tail.next = head;

		} else  {

			tail.next = eleman;
			tail = eleman;
			tail.next = head;

		}

	}

	void arayaekle() {

		int data, indis;

		System.out.println("indis: ");
		indis = scan.nextInt();
		System.out.println("data: ");
		data = scan.nextInt();

		Node eleman = new Node(data);

		if (head == null) {

			head = eleman;
			tail = eleman;
			tail.next = head;

		}

		else if (indis == 0) {

			eleman.next = head;
			head = eleman;
			tail.next = eleman;

		} else {
			int n = 0;
			Node temp = head;
			Node temp2 = head;
			while (temp != tail) {
				temp = temp.next;
				n++;
			}
			n++;

			if (indis >= n) {

				tail.next = eleman;
				tail = eleman;
				tail.next = head;
			} else {
				temp = head;
				temp2 = temp;

				int i = 0;
				while (i < indis) {

					i++;
					temp2 = temp;
					temp = temp.next;

				}

				temp2.next = eleman;
				eleman.next = temp;

			}

		}

	}

	void yazdir () {
		
		if(head == null) {
			
			System.out.println("Liste bos.");
		}
		else {
			Node temp = head;
			System.out.print("bas -> " );
			while (temp != tail) {
				
				System.out.print(temp.data + " - ");
				temp = temp.next;
				
			}
			System.out.println(temp.data + " -> son ");
		}
	}
}
