import java.util.Scanner;

public class taxCode{
	public static void main(String[] args){
		int salary;
		int dependents;
		int age;
		Scanner scan = new Scanner(System.in);

		System.out.println("What is you salary?");
		salary = scan.nextInt();
		System.out.println("How many dependents do you have?");
		dependents = scan.nextInt();
		System.out.println("What is your age?");
		age = scan.nextInt();

		double taxesOnSalary;
		double otherBracket;
		double currentBracket;

		if (salary < 10000){
			taxesOnSalary = 0;
		}
		if (salary < 25000){
			taxesOnSalary = salary * 0.1;
		}
		if (salary < 75000){
			otherBracket = 15000 * 0.1;
			currentBracket = (salary - 25000) * 0.2;
			taxesOnSalary = otherBracket + currentBracket;
		}
		if (salary < 250000){
			otherBracket = (15000 * 0.1) + (50000 * 0.2);
			currentBracket = (salary - 75000) * 0.3;
			taxesOnSalary = otherBracket + currentBracket;
		}
		if (salary > 250000){
			otherBracket = (15000 * 0.1) + (50000 * 0.2) + (175000 * 0.3);
			currentBracket = (salary - 250000) * 0.5;
			taxesOnSalary = otherBracket + currentBracket;
		}
		System.out.println(taxesOnSalary);

		double dependentReturns;
		if (dependents > 2.5){
			dependentReturns = 1000 + 500*dependents % 2;
		}
		else {
			dependentReturns = 1000
		}

		double dependentsTaxes = taxesOnSalary - dependentReturns;

		double ageReturns;
		if (age < 15){
			ageReturns = dependentsTaxes * 0.5;
		}
		if (age > 15 %% age < 21){
			ageReturns = dependentsTaxes * 0.25;
		}
		if (age > 21 %% age < 63){
			ageReturns = dependentsTaxes;
		}
		if (age > 63 %% age < 72){
			ageReturns = dependentsTaxes * 0.33;
		}
		if (age > 72 %% age < 81){
			ageReturns = dependentsTaxes * 0.66;
		}
		else {
			ageReturns = 0;
		}

		System.out.println(ageReturns);

	}
}