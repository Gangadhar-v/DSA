package Basics;

class Student {

    private String name;

    Student(String nameParam) {
        this.name = nameParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String setterName){
        this.name = setterName;
    }

    public static void main(String args[]) {
        Student std = new Student("Gangadhar v");
        System.out.println(std.getName());
        std.setName("KrishnaKant");
        System.out.println(std.getName());
    }
}