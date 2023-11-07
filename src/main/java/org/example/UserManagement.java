package org.example;

class Student {

  private String studentname;
  private String password;

  public Student(String studentname, String password) {
   this.studentname = studentname;
   this.password = password;
  }

  public String getStudentname() {
   return studentname;
  }

  public String getPassword() {
   return password;
  }
}
