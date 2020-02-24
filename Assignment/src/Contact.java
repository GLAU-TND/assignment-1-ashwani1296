import java.util.Scanner;
public class Contact {
    Scanner sc = new Scanner(System.in);
    public String First_name;
    public String Last_name;
    public String Phone_number;
    public String Email_id;
    public Contact()
    {
        this.First_name = "Ashwani";
        this.Last_name = "Sharma";
        this.Phone_number = "8077043271";
        this.Email_id = "sharmaashwani384@gmail.com";
    }
    public void getNewContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        First_name = sc.nextLine();
        System.out.println("Enter Last Name");
        Last_name = sc.nextLine();
        System.out.println("Enter Phone number");
        Phone_number = sc.nextLine();
        System.out.println("Enter Email Address");
        Email_id = sc.nextLine();
    }
}
