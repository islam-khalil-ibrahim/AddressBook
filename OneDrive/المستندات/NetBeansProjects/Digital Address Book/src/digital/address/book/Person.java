/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digital.address.book;

/**
 *
 * @author Microsoft
 */
public class Person extends Both{
    private String FirstName ;
    private String LastName;
    private String BD ;

    public Person(String FirstName, String LasrName, String BD, String City, String Country, String Email, String Postlcode, int Telphone) {
        super(City, Country, Email, Postlcode, Telphone);
        this.FirstName = FirstName;
        this.LastName = LasrName;
        this.BD = BD;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLasrName() {
        return LastName;
    }

    public void setLasrName(String LasrName) {
        this.LastName = LasrName;
    }

    public String getBD() {
        return BD;
    }

    public void setBD(String BD) {
        this.BD = BD;
    }
    @Override
    public String toString (){
        return "name"+this.FirstName+" "+ this.LastName+ " birthdate "+ BD + super.toString() ;
    }
}
