package customer_inventory;

import customer_inventory.seller_inventory.*;
import customer_inventory.client_inventory.*;
import java.util.*;

public class Customer_c {
	public static void main(String[] args)
	{
		String item_name;
		int item_no,item_quantity;
		Scanner sc = new Scanner(System.in);
		System.out.println("___Enter the ITEM Details___");
		System.out.println("Enter the Item Name : ");
		item_name=sc.next();
		System.out.println("Enter the Item No : ");
		item_no=sc.nextInt();
		System.out.println("Enter the Item Quantity : ");
		item_quantity=sc.nextInt();
		
		Seller_s s = new Seller_s();
		Client_c c= new Client_c();
		
		int check = s.check_availability(item_no,item_quantity);
		if(check==0)
			System.out.println("Item not available under specified category..!!");
		
	}
}
