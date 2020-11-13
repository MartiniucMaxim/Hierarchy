


//Here i show you how working simple hierarchy. At first, lets create base class
public class Student {
    private String firstName;
    private String lastName;
    private String Faculty;
    private String Speciality;
    private double Grants;
    private double comissionRate;


    //This part creates constructor of class, which containing 5 key-field elements
    //We link 5 to object.
    public Student(String name, String surname,String Fac,String Spec,double grants,double rate)
    {
        firstName = name;
        lastName = surname;
        Faculty = Fac;
        Speciality = Spec;
        setGrants(grants);
        setComissionRate(rate);

    }
    //Set method SetFirstName where we set name of variable
    public void setFirstName(String name)
    {
        firstName = name;
    }
    //Get and return value of method
    public String getFirstName()
    {
        return firstName;
    }

    //Last three String methods going in the same way as FirstName
    public void setLastName(String surname) {
        lastName = surname;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFaculty(String Fac) {
        Faculty = Fac;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setSpeciality(String Spec) {
        Speciality = Spec;
    }

    public String getSpeciality()
    {
        return Speciality;
    }

    //That part of code describe more widely setGrants-methode
    //We put if-else condition of setting Grants variable
    //If Grants higher then zero, we set value
    //In another option add Exception and warn user to input another Grant value.
    public void setGrants(double grants)
    {
        if(Grants>=0)
            this.Grants = grants;
        else
            throw new IllegalArgumentException("Grants must be higher then 0");
    }

    public double getGrants() {
        return Grants;
    }

    public void setComissionRate(double rate)
    {
        if(rate >=0 && rate <1.0)
            comissionRate = rate;
        else
            throw new IllegalArgumentException("Rate must be greater then zero");
    }
    public double getComissionRate()
    {
        return comissionRate;
    }


    public double Bonus()
    {
        return getGrants() * getComissionRate();
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %s\n%s :%.2f\n%s :%.2f",
                "Student name",getFirstName(),getLastName(),
                "Faculty",getFaculty(),
                "Speciality",getSpeciality(),
                "Grant",getGrants(),
                "Comission",getComissionRate());
    }


}
