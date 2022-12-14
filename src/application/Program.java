package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.print("Enter the number to find Seller by Id: ");
		int number = sc.nextInt();
		Seller seller = sellerDao.findById(number);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.print("Enter the number to find Seller by Department: ");
		number = sc.nextInt();
		Department department = new Department(number, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== Seller Find by All ===");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
				
	}

}
