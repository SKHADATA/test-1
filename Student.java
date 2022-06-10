package NIITEXAM;
import java.util.ArrayList;
public class Student {

		int regdNo;
		  String stdName;
		  String branch;
		  int mark;
		  
		  ArrayList<Student> database = new ArrayList<Student>();
		  
		  public Student(int regdNo, String database, String branch, int mark) {
		    super();
		    this.regdNo = regdNo;
		    this.stdName = stdName;
		    this.branch = branch;
		    this.mark = mark;
		  }
		  
		  public int getRegdNo() {
		    return regdNo;
		  }

		  public void setRegdNo(int regdNo) {
		    this.regdNo = regdNo;
		  }

		  public String getStdName() {
		    return stdName;
		  }
		  
		  public void setStdName(String stdName) {
		    this.stdName = stdName;
		  }

		  public String getBranch() {
		    return branch;
		  }

		  public void setBranch(String branch) {
		    this.branch = branch;
		  }

		  public int getMark() {
		    return mark;
		  }

		  public void setMark(int mark) {
		    this.mark = mark;
		  }


		  public void insert(Student s) {
		    database.add(s);
		  }
		  
		  public void update(Student s) {
		    for(Student i : database) {
		      if(i.getRegdNo()==s.getRegdNo()) {
		        i = s;
		      }
		    }
		  }
		  
		  public void retrive(int reg) {
		    for(Student i : database) {
		      if(i.getRegdNo()==reg) {
		        System.out.println(i);
		      }
		    }
		  }
		  
		  public void delete(Student s) {
		    database.remove(s);
		  }

	}


