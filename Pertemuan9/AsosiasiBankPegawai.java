// Program Java
// mengilustrasikan konsep
// asosiasi.
//import java.io.*; 

/* class bank */
class Bank
{
private String name;

/* nama bank */

Bank(String name) {
	this.name = name;
	} 

public String getBankName() {
		return this.name;
	}

} 

/* class pegawai */ 

class Employee 
{
private String name; 

/* nama pegawai */
Employee(String name) {
	this.name = name;
	} 

public String getEmployeeName() {
	return this.name;
	} 

} 

// asosiasi antara kedua class
// pada main method.

public class AsosiasiBankPegawai
{
	public static void main (String[] args)
	{ 
	Bank bank = new Bank("Axis"); 
	Employee emp = new Employee("Neha"); 
	System.out.println(emp.getEmployeeName()+" adalah pegawai dari " +bank.getBankName()); 
	}
	}
