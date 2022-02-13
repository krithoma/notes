package cookies;

public class CookieArrayList {
//    pseudocode
//    variables needed:
//    Array of something;
//    The current amount of somethings;

    Cookie[] cookieArray;
    int nextIndex = 0;

    //    Constructor that creates an initial array of some size;

    public CookieArrayList(int size){
        cookieArray = new Cookie[size];
    }

//    Get method that returns the something of a given index;

    public Cookie getArrayCookie(int index){
        return this.cookieArray[index];
    }

//    Add method
//    First, check that the arraylist will not break if we try to add at the next index:
//    IE, check if the current amount of somethings+1 is not greater that the array size
//    if it is greater:
//          Copy the elements of the current array to a new array.
//          set the pointer of the arrayList's internal array to the new array.
//    that adds things at an index that is currently unused
//    (this will be the current size)

    public void addToCookieArray(Cookie newCookie){
        while(cookieArray.length <= nextIndex) {

            //This is where the array gets expanded.
            Cookie[] tempCookieArray = new Cookie[cookieArray.length*2];
            //Loop through old array and copy into new.
            for(int x =0; x < nextIndex; x++){
                tempCookieArray[x] = cookieArray[x];
            }
            //Set pointer to new array.
            cookieArray = tempCookieArray;

        }
        if(cookieArray[nextIndex] != null){
            nextIndex++;
            cookieArray[nextIndex] = newCookie;
            nextIndex++;
        }
        else {
            cookieArray[nextIndex] = newCookie;
            nextIndex++;
        }

    }

    //    a method that can return a boolean determining if your array list contains a certain item
    //    (if you had an arraylist of objects, as opposed to primitives, you may need to implement and use .equals)

    public boolean isCookieHere(Cookie testCookie){

        //Iterate through the list and compare against testCookie.
        for(int x=0; x < cookieArray.length;x++){
            if(cookieArray[x] != null) {
                if (cookieArray[x].equals(testCookie)) {
                    return true;
                }
            }
        }

        return false;
    }


//    a method that can determine if your arraylist is identical to another one
//    (again, .equals)
    public boolean areCookieArraysSame(CookieArrayList testList){
        boolean isCookieSame = false;
        if(cookieArray.length == testList.cookieArray.length) {
            for (int x = 0; x < cookieArray.length; x++) {
                if (cookieArray[x] != null && testList.cookieArray[x] != null) {
                    if (cookieArray[x].equals(testList.cookieArray[x])) {
                        isCookieSame = true;
                    }
                    else{isCookieSame=false;}
                }
                else if(cookieArray[x] == null && testList.cookieArray[x] == null) {
                    isCookieSame = true;
                }
                else {isCookieSame =false;}
            }
        }
        if(isCookieSame){return true;}
        return false;
    }


//    a method that sets a given index to a particular value

    public void setCookieHere(int index, Cookie aGivenCookie){
        if(index>0 && index< cookieArray.length){
            cookieArray[index] = aGivenCookie;
        }
        else{
            Driver.log.info("[" + index + "]: " + "Address out of bounds.");
        }
    }

    Cookie[] cookieList = new Cookie[16];
    public Cookie get(int i){
        return cookieList[i];
//        in a particular index in cookielist, we have a memory address
//        pointing to a cookie object
//        by returning a index, we can recieve the memory address into a cookie
//        object in whatever object is calling arrayList.get();

        /*
        the reason why java may ask you to use static methods and object:
        you're likely trying to use methods that arent actually tied to the existence
        of a real object
        and rather trying to call the class's methods directly

        > make objects!!! <
         */
    }

}
