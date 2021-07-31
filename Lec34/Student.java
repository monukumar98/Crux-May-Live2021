package Lec34;

public class Student {
	private String name = "Motu";
	private int age = 90;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("I am in Set Age");
		try {
			if (age < 0) {
				throw new Exception("-ve age ");// Exception Generate
			}
			this.age = age;

		}
        catch (ArrayStoreException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println("Hello I am finaly ");
		}
		System.out.println("Bye Set Age");

	}

	public void setAge1(int age) throws Exception {
		System.out.println("I am in Set Age");

		if (age < 0) {
			throw new Exception("-ve age ");// Exception Generate
		}

		this.age = age;
		System.out.println("Bye Set Age");

	}

}
