package listPractice;

public class Anagram {

    public static char[] charArray;

    public Anagram(String word) {
    	System.out.println("Word :" +word);
        charArray = word.toCharArray();
        System.out.println("character array:"+ charArray);
        doAnagram(charArray.length);
    }

    public void changeOrder(int newsize) {
    	System.out.println("I just came to change the order");
        int j;
        int pointAt = charArray.length - newsize;
        char temp = charArray[pointAt];

        for (j = pointAt + 1; j < charArray.length; j++) {
            charArray[j - 1] = charArray[j];
            System.out.println("am here changing"+charArray[j-1]);
        }

        charArray[j - 1] = temp;

    }

    public void doAnagram(int newsize) {
    	int count = 0;
    	System.out.println("In anagram"+ count++);
        if (newsize == 1) {
            return;
        }
        for (int i = 0; i < newsize; i++) {
            doAnagram(newsize - 1);
            if (newsize == 2) {
            	System.out.println("Why did I enter here");
                display();
            }
            changeOrder(newsize);
        }
    }

    public void display() {
        for (int i = 0; i < charArray.length; i++) {
         System.out.print(charArray[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Anagram test1 = new Anagram("Love");



    }
}
