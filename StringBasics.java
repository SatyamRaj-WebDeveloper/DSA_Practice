

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

//String Comparisons ( == , .equals() , .equalsIgnoreCase())
class StringComparisons{
    public static void main(String[] args) {
        String name1 = "Satyam";
        String name2 = "Satyam";
        
        /*Using "==" does not actualy compares the values instead it just compares whether 
        both the variables are refering to the same value in String Pool or not ? */
        if(name1 == name2){
            System.out.print("Strings are Equal");  // This prints Strings are Equal
        }

        //Using .equals() --> this actually compares the Values for the Variables ,
        // It is Case Sensitive ( Character from both Strings should be either UpperCase or LowerCase)
        //Love will not be equal to LOVE , Love will be only equal to Love
        if(name1.equals(name2)){
            System.err.println("Strings are Equals using .equals()");
        }

        //Using EqualsIgnoreCase() --> this is not Case Sensitive 
        // LOVE will be qual to Love in this case 

        //.trim() --> removes Leading Spaces and Trailing Spaces and returns a new space
        //.empty() --> if length is 0
        //.blank() --> empty or sirf spaces ho String me
        //.substring(startIndex , EndIndex+1)--> start is inclusive and end index is exclusive
        //.contains() --> to check if any String contains a specific word ?
        //.startsWith() , .endsWith() -- to check starting or ending
        //.toCharArray() --> to convert any String to a Character Array
        //.split() --> to Split a String on basis of any Regex , it return an array of Strings
        //.replace(old Char , new Char ) --> replaces old character with the new one 
    }
}

//Practice Questions
class PrintChar{
    public static void main(String[] args) {
        String name = "Babbar";
        for(int i = 0 ; i<name.length() ; i++){
            System.err.println(name.charAt(i));
        }
    }
}
