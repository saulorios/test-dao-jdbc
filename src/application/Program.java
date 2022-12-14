package application;

import java.util.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.print("Enter the number to find by Id: ");
		int number = sc.nextInt();
		Seller seller = sellerDao.findById(number);
				
		System.out.println(seller);
	}

}
