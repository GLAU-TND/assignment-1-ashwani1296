public class Operation {
    Node head;
    public Operation()
    {
        this.head = null;
    }
    public boolean isListEmpty()
    {
        return (head == null);
    }
    public void setDetails(Node newnode)
    {
        if(isListEmpty())
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while (temp.next!= null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void getDetails()
    {
        if(isListEmpty())
        {
            System.out.println("List has no Contact");
        }
        else
        {
            Node temp = head;
            while (temp!=null)
            {
                temp = temp.next;
                System.out.println("First Name : "+temp.c.First_name);
                System.out.println("Last Name : "+temp.c.Last_name);
                System.out.println("Phone Number : "+temp.c.Phone_number);
                System.out.println("Email Address : "+temp.c.Email_id);
            }
            System.out.println("-----------");
        }
    }
    public void deleteContact()
    {
        Node temp = head;
        System.out.println("Contact deleted is "+temp);
        head = temp.next;
    }
}
