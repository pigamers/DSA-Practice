 class Strings {
    public static void main(String[] args){
        String name="Debayan";
String name1="Mayank";
System.out.println(name.charAt(4));
System.out.println(name.compareTo(name1));                                           
System.out.println(name.equals(name1));
System.out.println(name.equalsIgnoreCase(name1));
System.out.println(name.indexOf('b'));
System.out.println(name.length());
String substr=name.substring(3,5);
System.out.println(substr);
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());
System.out.println(name.trim());
}
}