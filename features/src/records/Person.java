package records;

public record Person(String nome, String email, int age) {

    public Person {
        // validations in compact constructor
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative");
        if(email == null || !email.contains("@")) throw new IllegalArgumentException("Invalid email");
    }

    public boolean isAdult(){
        return age >= 18;
    }

}
