public class StudentTest {
    public static void main(String[]args)
    {
        Student john = new Student("john","lengli","Informatics","web-design",355,0.5);

        System.out.println("Student name:" + john.getFirstName());
        System.out.println("Student surname:" + john.getLastName());
        System.out.println("Student faculty:" + john.getFaculty());
        System.out.println("Student specility:" + john.getSpeciality());
        System.out.println("Student Grant" + john.getGrants());
        System.out.println("Student rate" + john.getComissionRate());


    }
}
