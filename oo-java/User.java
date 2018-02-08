public class User {
  // COMPLETED: add private fields for firstName and lastName
  private String firstName;
  private String lastName;

  public User(String firstName, String lastName) {
    // COMPLETED: set and add the private fields
    this.firstName = firstName;
    this.lastName = lastName;

  }

  // COMPLETED: add getters for firstName and lastName
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
