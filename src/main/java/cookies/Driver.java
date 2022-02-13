package cookies;

/*

Package?
organization of my java program structure
allows me to organize related classes together
if there is a class we are using in another package, we will need to import

 */

/*classes?
everything in java's a class!
especially objects, which are instances of classes
 */

import org.apache.log4j.Logger;

public class Driver {
/*main is just the entry point for running our program
we can put all of our code in main i guess, but this is very disorganized
 */
    public static void main(String[] args){
        zoo.Driver.log.info("Hello");



    }

    /*what is a method?
    reusable block of code that is ran when it is called
    you can pass data to method (known as parameters)

    method vs function?
    just a naming thing
    method is a function tied to a class (everything is tied to a class in java)
    function not tied to anything (you see this in js for instance)
     */
    /*static?
    the existence of this method is not tied to the creation of an object:
    rather it is tied to the class in general
    meaning that the method is not individualized to a particular object
    but we can call it as long as the class exists

    return type?
    can be anything
    including void (return nothing)
     */

    public static boolean returnTruePlease(){
        return true;
    }

}
