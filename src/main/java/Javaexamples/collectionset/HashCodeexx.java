package Javaexamples.collectionset;
public class HashCodeexx
{
    private int age ;
    public HashCodeexx(int age )
    {
        super();
        this.age = age;
    }
    public int hashCode()
    {
        return age;
    }

    public static void main(String[] args) {
        HashCodeexx emp1 = new HashCodeexx(230);
        System.out.println("Overridden hashCode()--->>>" + emp1.hashCode());
        int originalHashCode = System.identityHashCode(emp1);
        System.out.println("Original hashCode of Emp---->>>" + originalHashCode);
    }
}

/*

Overridden hashCode()--->>>23
Original hashCode of Emp---->>>1198108795

Process finished with exit code 0

 */