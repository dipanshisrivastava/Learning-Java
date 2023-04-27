/******************************************************************************
 * 
1. Abstract classes are declared with abstract keyword.
2. Java abstract classes are used to declare common charactertics of subclasses.
3. It can only be used as a superclass for other classes that extend the abstract class.
4. Like any other class, an abstract class can contain fields that describe the characteristics and methods that describe the actins that a class can perform.
5. You can not create object of abstract class but you can create reference variable of abstract class.

*******************************************************************************/
abstract class person
{
    //name
    //age
}

class students extends person                     
{
    //person class
   //roll
} 

class teachers extends person                     
{
   //person class
   //Position(professor, Ass. professor)
} 


public class abstractClass
{
	public static void main(String[] args) {
	   // person s = new person();                         // Can not be created.
	   person p = new students();                         // 5th point
	}
}
