package projekat1;

public class Student {

	
	
	public Student(String ime,String prezime,int br) {
		super();
		this.ime=ime;
		this.prezime=prezime;
				brIndeksa=br;
		
	}
	String ime;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	String prezime;
	int brIndeksa;
	
}
