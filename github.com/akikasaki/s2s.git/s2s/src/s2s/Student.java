package s2s;

public class Student {
 private String ime;
 private String prezime;
 private String brojIndexa;
 private int datumUpisa;
 
public Student(String ime, String prezime, String brojIndexa, int datumUpisa) {
	super();
	this.ime = ime;
	this.prezime = prezime;
	this.brojIndexa = brojIndexa;
	this.datumUpisa = datumUpisa;
}
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
public String getBrojIndexa() {
	return brojIndexa;
}
public void setBrojIndexa(String brojIndexa) {
	this.brojIndexa = brojIndexa;
}
public int getDatumUpisa() {
	return datumUpisa;
}
public void setDatumUpisa(int datumUpisa) {
	this.datumUpisa = datumUpisa;
}
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
 
}
