package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.print("Enter the number to find Department by Id: ");
		int number = sc.nextInt();
		Department dep = depDao.findById(number);
		System.out.println(dep);

		System.out.println();
		System.out.println("=== Department Find by All ===");
		List<Department> list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println();
		System.out.println("=== Department Insert ===");
		Department newDep = new Department(null, "Aeromodel");
		depDao.insert(newDep);
		System.out.println("Inserted! New id: " + newDep.getId());

		System.out.println();
		System.out.println("=== Department Update ===");
		dep = depDao.findById(5);
		dep.setName("Aeromodel");
		depDao.update(dep);
		System.out.println("Update completed");

		System.out.println("=== Department Delete ===");
		System.out.print("Enter Id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}

}
