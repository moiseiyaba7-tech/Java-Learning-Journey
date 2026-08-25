public class StringMethods {
  public static void main(String[] args){
    String name= "Moise";
    //Here are some of the most useful methods of the string class in java

    System.out.println(name.isEmpty());
    System.out.println(name.equals(name));
    System.out.println(name.charAt(2));
    System.out.println(name.isBlank());
    System.out.println(name.equalsIgnoreCase("moise"));
    System.out.println(name.indexOf("o"));
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.replace("Moise", "Moses"));

  }
}
