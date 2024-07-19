package cl.praxis.holaSpring.controller.model;

public class Teacher {
   private int id;
   private String name;
   private String lastName;
   private String courseName;

    public Teacher() {
    }

    public Teacher(int id, String name, String lastName, String courseName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
