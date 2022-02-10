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

import java.util.Arrays;

public class Driver {
/*main is just the entry point for running our program
we can put all of our code in main i guess, but this is very disorganized
 */
    public static void main(String[] args){

        //Create a list for testing.
       CookieArrayList myCookieArray = new CookieArrayList(4);
       CookieArrayList myOtherCArray = new CookieArrayList(4);
       //Add 3 cookies.
        Cookie cookie1 = new Cookie("Sugar");
        Cookie cookie2 = new Cookie("Sugar2");
        Cookie cookie3 = new Cookie("Oatmeal");

        Cookie cookieO1 =  new Cookie("Sugar");
        Cookie cookieO2 =  new Cookie("Sugar2");
        Cookie cookieO3 =  new Cookie("Oatmeal");

        myCookieArray.addToCookieArray(cookie1);
        myCookieArray.addToCookieArray(cookie2);
        myCookieArray.addToCookieArray(cookie3);

        myOtherCArray.addToCookieArray(cookieO1);
        myOtherCArray.addToCookieArray(cookieO2);
        myOtherCArray.addToCookieArray(cookieO3);

        System.out.println(Arrays.toString(myCookieArray.cookieArray));
        System.out.println(Arrays.toString(myOtherCArray.cookieArray));
        //Test if equal.
        System.out.println("Are they same? " + myCookieArray.areCookieArraysSame(myOtherCArray));

        //Test position.
        Cookie lookCookie = myCookieArray.getArrayCookie(1);
        System.out.println("Which cookie? " + lookCookie);
        System.out.println(Arrays.toString(myCookieArray.cookieArray));
        //Add 2 more.

        Cookie cookie4 = new Cookie("Chocolate");
        Cookie cookie5 = new Cookie("No Bake");

        myCookieArray.addToCookieArray(cookie4);
        myCookieArray.addToCookieArray(cookie5);
        System.out.println(Arrays.toString(myCookieArray.cookieArray));
        System.out.println("Are they same? " + myCookieArray.areCookieArraysSame(myOtherCArray));

        //Test if cookie is there.
        Cookie testCookie1 = new Cookie("Sugar");
        System.out.println(myCookieArray.isCookieHere(testCookie1));
        Cookie testCookie2 = new Cookie("Chocolate2");
        System.out.println(myCookieArray.isCookieHere(testCookie2));

        //Test setting a new cookie in array
        myCookieArray.setCookieHere(5, testCookie2);
        System.out.println(Arrays.toString(myCookieArray.cookieArray));


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
