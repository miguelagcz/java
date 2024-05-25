import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("hola mundo");


    String myString = "Esto es una cadena de texto";
    myString = "aqui cambio el valor de la cadena de texto";
    System.out.println(myString);

    Integer myInt = 7;
    myInt = myInt + 4;
    System.out.println(myInt);
    System.out.println(myInt - 1);

    Double myDouble = 6.5;
    System.out.println(myDouble);
    
    Float myFloat = 6.5f;
    System.out.println(myFloat);

    System.out.println(myDouble + " " +myString + " " + myFloat + " "+ myInt);

    Boolean myBoolean = true;
    myBoolean = false;
    System.out.println(myBoolean);

    myBoolean = null;
    System.out.println(myBoolean);

    myFloat = null;
    if (myFloat  != null) {
        System.out.println(myFloat + 10);   
        System.out.println("my float  es distinto de nulo");
    }else {
        System.out.println("My float es nulo");
    }
    
    if (myInt == 11) {
        System.out.println("myInt == 11");

    }else if (myInt == 12) {
        System.out.println("myInt == 11");

    }else{
        System.out.println("el valor no es ni 11 ni 12");
    }


    list myArray = new ArrayList();
    myList.add(myString);
    myList.add(myInt.toString())
    System.out.println(myList);

    Map myMap = new HashMap();
    myMap.put("string", myString);
    myMap.put(int, myInt);
    System.out.println(myMap.get(int));


    for (int index = 0; index < myList.size(); index++) {
        System.out.println(myList.get(index));

        while (condition) {
            
        }
        
    }
        
    public void myFuntion(int myFisterNumber,int mySecondNumber){
        System.out.println(myFisterNumber + mySecondNumber);
    
    }

    
    }

}

