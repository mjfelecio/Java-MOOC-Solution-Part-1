import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {
                System.out.print("Word:");
                String word = scanner.nextLine();

                System.out.print("Translation:");
                String translation = scanner.nextLine();

                dictionary.add(word, translation);

                continue;

            } else if (command.equals("search")) {
                System.out.print("To be translated:");
                String wordToTranslate = scanner.nextLine();

                if (dictionary.translate(wordToTranslate) == null) {
                    System.out.println("Word " + (wordToTranslate) + " was not found");

                } else {
                    System.out.println("Translation: " + dictionary.translate(wordToTranslate));
                }

            } else {
                System.out.println("Unknown command");
            }

        }
    }



}