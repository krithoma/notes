import cookies.Cookie;
import cookies.CookieArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookieArrayListTest {

    CookieArrayList myCookieArray = new CookieArrayList(4);
    CookieArrayList myOtherCArray = new CookieArrayList(4);

    Cookie testCookie1 = new Cookie("Sugar");
    Cookie testCookie2 = new Cookie("Chocolate2");

    Cookie cookie4 = new Cookie("Peanut Butter");
    Cookie cookie5 = new Cookie("No Bake");

    @BeforeEach
    void setUp() {
        //Create a list for testing.

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
    }

    @Test
    void testExpandArray() {
        myCookieArray.addToCookieArray(cookie4);
        myCookieArray.addToCookieArray(cookie5);
        //test if array expanded
        myCookieArray.setCookieHere(5, testCookie2);
        assertTrue(myCookieArray.isCookieHere(testCookie2));
    }

    @Test
    void testIsCookieHere() {
        assertFalse(myCookieArray.isCookieHere(testCookie2));
        assertTrue(myCookieArray.isCookieHere(testCookie1));
    }

    @Test
    void testSameCookieArray() {
        assertTrue(myCookieArray.areCookieArraysSame(myOtherCArray));
    }

    @Test
    void testDiffCookieArray(){
        myCookieArray.addToCookieArray(cookie4);
        myCookieArray.addToCookieArray(cookie5);
        assertFalse(myCookieArray.areCookieArraysSame(myOtherCArray));
    }

    @Test
    void testSetCookieHere() {
        //Index is out of bounds for starting array
        myCookieArray.setCookieHere(5, testCookie2);
        assertFalse(myCookieArray.isCookieHere(testCookie2));
        //Index is in bounds.
        myCookieArray.setCookieHere(3, testCookie2);
        assertTrue(myCookieArray.isCookieHere(testCookie2));
    }
}