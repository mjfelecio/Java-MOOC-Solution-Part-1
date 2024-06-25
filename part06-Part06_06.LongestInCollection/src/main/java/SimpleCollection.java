
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        // returns null if there is no elements in the array
        if (this.elements.isEmpty()) {
            return null;
        }
        // initializes the first index as the longest
        String returnObject = this.elements.get(0);

        // iterates through the elements
        for (String element: elements) {

            // if there is an element that is longer than the first index,
            // it is now assigned as the longest word.
            if (returnObject.length() < element.length()) {
                returnObject = element;
            }
            //this repeats on all the elements until the longest is determined
        }


        return returnObject;
    }

}
