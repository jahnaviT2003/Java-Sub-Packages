package customer_inventory.seller_inventory;

import customer_inventory.client_inventory.*;
import java.util.*;

public class Seller_s {
	public int item_no1_balance=19;
	public int item_no2_balance=17;
	public int item_no3_balance=15;
	public int item_no1=1001;
	public int item_no2=1002;
	public int item_no3=1003;
	public int check_availability(int item_no , int item_quantity)
	{
		int flag=0;
		if(item_no==item_no1 && item_quantity < item_no1_balance)
		{
			flag=1;
			item_no1_balance=item_no1_balance-item_quantity;
			System.out.println("___Display Item-1 Balance Quantity Details___");
			System.out.println("Item-1 Balance Quantity : "+item_no1_balance+"\n");
			if(item_no1_balance < 8)
			{
				System.out.println("Quatity is less than thresold value,Hence Place a Order..!"+"\n");
				issue_order();
			}
		}
		if(item_no==item_no2 && item_quantity < item_no2_balance)
		{
			flag=1;
			item_no2_balance=item_no2_balance-item_quantity;
			System.out.println("___Display Item-2 Balance Quantity Details___");
			System.out.println("Item-2 Balance Quantity : "+item_no2_balance+"\n");
			if(item_no2_balance < 8)
			{
				System.out.println("Quatity is less than thresold value,Hence Place a Order..!"+"\n");
				issue_order();
			}
		}
		if(item_no==item_no3 && item_quantity < item_no3_balance)
		{
			flag=1;
			item_no3_balance=item_no3_balance-item_quantity;
			System.out.println("___Display Item-3 Balance Quantity Details___");
			System.out.println("Item-3 Balance Quantity : "+item_no3_balance+"\n");
			if(item_no3_balance < 8)
			{
				System.out.println("Quatity is less than thresold value,Hence Place a Order..!"+"\n");
				issue_order();
			}
		}
		return flag;
		
	}
	public void issue_order()
	{
		Client_c ob = new Client_c();
		ob.place_order();
	}

}
