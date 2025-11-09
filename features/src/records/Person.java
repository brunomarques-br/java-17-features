package records;


/**
 * Description: Records (immutable data)
 * When to use it?
 * -> DTOs
 * -> API responses
 * -> Value Objects
 * -> Pure data classes
 *
 * @param nome
 * @param email
 * @param age
 */
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
