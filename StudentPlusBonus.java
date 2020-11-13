
// Let's explain what does mean hierarchy.
//*Hierarchy helps to create relationships between classes. Each class have subclasses, that doing something.
// In Hierarchy first step  is creating Father Class Student. Then, adding another class - StudentPlusBonus class which inherits fields and basic methods from Student.
// Interesting thing: above the inheriting part we can create additional field and methods, that make our program complex and big with new features.
// To create hierarchy in StudentsPlusBonus write key-word 'extends' and writing which classes he want inherit.*

public class StudentPlusBonus extends Student{

    //Additional three private fields with double values
    private boolean PrizePlace;
    private double  PrizeGrant;
    private double SocialPacket;
    private double Bonus;

    //Making constructor. In body of constructor put super(5 elements from inherited Student) + 3 set Methods
    public StudentPlusBonus(String name, String surname, String Fac,String Spec,double grants,double rate,boolean Prize,double PG,double SP)
    {
        //super() - is key word which using from initialisation 5 base fields from Student to include them in current constructor
        super(name,surname,Fac,Spec,grants,rate);
        //setPrizePlace(Prize);
        setPrizeGrant(PG);
        setSocialPacket(SP);

    }

    /*public void setPrizePlace(boolean Prize)
    {
        if (PrizePlace==true)
           System.out.println("Student wined some cash in grant");
        else
            System.out.println("no bonus");
    }*/

    public void setPrizeGrant(double PG)
    {
        if(PG>0)
            PrizeGrant = PG;
        else
            throw new IllegalArgumentException("Bonus must be greater then 0");
    }

    public double getPrizeGrant() {
        return PrizeGrant;
    }

    public void setSocialPacket(double SP)
    {
        if(SP>0)
            SocialPacket = SP;
        else
            throw new IllegalArgumentException("Social Packet must be greater then 0");
    }

    public double getSocialPacket()
    {
        return SocialPacket;
    }

    @Override
    public double Bonus()
    {
        return super.Bonus() + getSocialPacket() + getPrizeGrant();
    }

    @Override
    public String toString()
    {
        return String.format("%s %s\n%s: %.2f\n%s: %.2f",
                super.toString(),
                "Prize Grant:",getPrizeGrant(),
                "Social Packet:",getSocialPacket());
    }


}
