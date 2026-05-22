

//String Creation
class StringCretaion{
    public static void main(String[] args) {
        //The Variables (firstname , lastName) both are stored in the Stack Memory 
        String firstname = "Sachin"; // In this case the value - "Sachin" is stored in the String Pool inside Heap Memory 
        String lastName = new String("Kumar"); // In this case the value - "Kumar" is directly stored in the Heap Memory

        System.err.println(firstname + lastName);
    }
}

// Strings are Immutable
// String cannot be mutated in the Example below the String is not changed instead the Refrence is changed
//Variable "name" which was previously pointing to Satyam is now pointing to "Raj" in String Pool
class Basics{
    public static void main(String[] args){
        String name = "Satyam";
        name = "Raj";
        System.err.println(name);
    }
}