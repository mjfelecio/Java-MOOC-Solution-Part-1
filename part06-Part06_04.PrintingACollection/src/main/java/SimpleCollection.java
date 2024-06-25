
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


    public String toString() {
        String listOfElements = "";
        String stringOutput;

        for (String element : elements) {

            if (element.equals(elements.get(elements.size() - 1))) {
                listOfElements += element;
            } else {
                listOfElements += element + "\n";
            }
        }

        if (elements.isEmpty()) {
            stringOutput = "The collection " + this.name + " is empty.";

        } else if (elements.size() == 1) {
            stringOutput = "The collection " + this.name + " has 1 element:\n" + listOfElements;

        } else {
            stringOutput = "The collection " + this.name + " has " + elements.size() + " elements:\n" + listOfElements;

        }

        return stringOutput;
        }
}
