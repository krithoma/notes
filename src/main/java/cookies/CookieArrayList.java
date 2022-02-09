package cookies;

public class CookieArrayList {
    //    pseudocode

//    variables needed:
//    Array of something;
//    The current amount of somethings;

    static Cookie[] cookieArray;
    static int nextIndex = 0;

    //    Constructor that creates an initial array of some size;

    public CookieArrayList(int size){
        cookieArray = new Cookie[size];
    }

//    Get method that returns the something of a given index;

    public static Cookie getArrayCookie(int index){
        return cookieArray[index];
    }

//    Add method
//    First, check that the arraylist will not break if we try to add at the next index:
//    IE, check if the current amount of somethings+1 is not greater that the array size
//    if it is greater:
//          Copy the elements of the current array to a new array.
//          set the pointer of the arrayList's internal array to the new array.
//    that adds things at an index that is currently unused
//    (this will be the current size)

    public static void addToCookieArray(Cookie newCookie){

        while(cookieArray[nextIndex] != null || cookieArray.length <= nextIndex) {
            if(cookieArray[nextIndex] != null){
                nextIndex++;
            }
            if (cookieArray.length <= nextIndex){
                //This is where the array gets expanded.
                Cookie[] tempCookieArray = new Cookie[nextIndex];
                //Loop through old array and copy into new.
                for(int x =0; x < nextIndex; x++){
                    tempCookieArray[x] = cookieArray[x];
                }
                //Set pointer to new array.
                cookieArray = tempCookieArray;
            }
        }

        if(cookieArray[nextIndex] == null){
            cookieArray[nextIndex] = newCookie;
            nextIndex++;
        }

    }



//    a method that can return a boolean determining if your array list contains a certain item
//    (if you had an arraylist of objects, as opposed to primitives, you may need to implement and use .equals)
//    a method that can determine if your arraylist is identical to another one
//    (again, .equals)
//    a method that sets a given index to a particular value





}
