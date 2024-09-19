public class Person {
  private String name; // private = restricted access
  private int age;

  // Getter
  public String getName() {
    return name;
  }
  
  public int getAge(){
    return age;	
  }

  // Setter
  public void sett(String newName,int newAge) {
    this.name = newName;
    this.age = newAge;
  }
}