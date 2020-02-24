import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact c = new Contact();
        Contact c1 = new Contact();
        Contact c2 = new Contact();
        Node n1 = new Node(c);
        Node n2 = new Node(c1);
        Node n3 = new Node(c2);
        Operation op = new Operation();
        boolean s = true;
        while (s == true)
        {
            System.out.println("Welcome to contact list...");
            System.out.println("Press 1 to add a new Contact\nPress 2 to view all contacts");
            System.out.println("Press 3 to search for a contact\nPress 4 to delete a contact");
            System.out.println("Press 5 to exit program");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1: {
                    c.getNewContact();
                    c1.getNewContact();
                    c2.getNewContact();
                    op.setDetails(n1);
                    op.setDetails(n2);
                    op.setDetails(n3);
                    break;
                }
                case 2: {
                    System.out.println("----Here are all your Contact----");
                    System.out.println("-------- * -------- * -------- * --------");
                    op.getDetails();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    op.getDetails();
                    op.deleteContact();
                }
                case 5: {
                    System.out.println("You Exit from program...!");
                    s = false;
                    break;
                }
                default: {
                    System.out.println("Please enter a valid Input");
                    break;
                }
            }
        }

    }
}
