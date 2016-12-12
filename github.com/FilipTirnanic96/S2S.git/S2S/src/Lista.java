import java.util.LinkedList;
public class Lista {
	public LinkedList<Student> studenti=new LinkedList<Student>();
	
	public void napraviListu(Student s){
		if(s==null){
			System.out.println("Greska");
			return;
		}
		studenti.add(s);
		
	}
	
}
