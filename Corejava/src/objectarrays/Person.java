package objectarrays;

public class Person {
    private int height;
    private int weight;
    private int ssn;
    private String phoneNumber;

    public Person(int height, int weight, int ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person otherPerson = (Person) obj;
                return this.ssn == otherPerson.ssn;
    }


    public static void main(String[] args) {
        Person p1 = new Person(5, 170, 4567, "2348596268");
        Person p2 = new Person(6, 190, 4657 , "6148322589");

        boolean isequal = Integer.valueOf(p1.ssn).equals(Integer.valueOf(p2.ssn)); 
        System.out.println(isequal); 
    }
}
