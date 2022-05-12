package customer_inventory.client_inventory;

import customer_inventory.seller_inventory.*;
import java.util.*;
public class Client_c extends Seller_s {
	String Item_name;
	int Item_No,Item_Qty;
	public void place_order()
	{
		String Item_name;
		int Item_No,Item_Qty;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Item Name to be Ordered : ");
		Item_name=sc.next();
		System.out.println("Enter the Item No to be placed with order : ");
		Item_No=sc.nextInt();
		System.out.println("Enter the Item Quantity to be Ordered : ");
		Item_Qty=sc.nextInt();
		
		if (Item_No==1001)
		{
			item_no1_balance=item_no1_balance+Item_Qty;
			display_details();
		}
		else if(Item_No==1002)
		{
			item_no2_balance=item_no2_balance+Item_Qty;
			display_details();
		}
		else if(Item_No==1003)
		{
			item_no3_balance=item_no3_balance+Item_Qty;
			display_details();
		}
	}
	public void display_details()
	{
		System.out.println("___Display Item Order Details___");
		System.out.println("Item Name placed for order : "+Item_name);
		System.out.println("Item Number Placed with order : "+Item_No);
		System.out.println("Ordered Item Quantity : "+Item_Qty);
	}
}
