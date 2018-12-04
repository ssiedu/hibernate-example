package mypkg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "empdata" )
public class Emp {
    @Id
    @Column(name="ecode")
    private int eno;
    @Column(name="empname")
    private String ename;
    @Column(name="salary")
    private int sal;

    public Emp() {
    }

    public Emp(int eno, String ename, int sal) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    
    
    
}
