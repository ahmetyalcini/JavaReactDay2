

public class Main {

	public static void main(String[] args) {
		System.out.println("Kurslar");
		System.out.println();
		Course c1 = new Course(0, "C# & Angular", "Engin Demirog");
		Course c2 = new Course(1, "Java & React", "Engin Demirog");
		Course c3 = new Course(2, "Programlamaya Giris", "Engin Demirog");
		
		
		Course[] courses = {c1,c2,c3};
		
		for ( Course course : courses ) {
			System.out.println(course.name);
		}
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		System.out.println("Kategoriler");
		System.out.println();
		Category category1 = new Category(0, "Kampa Hazirlik");
		Category category2 = new Category(1, "Sikca Sorulan Sorular");
		
		Category[] categories = {category1, category2};
		
		for(Category category : categories) {
			System.out.println(category.name);
		}
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		
		System.out.println("Constructor method");
		System.out.println();
		CourseManager cM = new CourseManager();
		cM.add(c1);
		cM.delete(c2);
		cM.update(c3);
 
	}

}
