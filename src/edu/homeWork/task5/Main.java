package edu.homeWork.task5;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String strUserRespons = in.nextLine();

        List<String> stringList = new ArrayList<>();
        List<String> stringBuf = new ArrayList<>();

        StringBuilder buffer = new StringBuilder();
        String[] words = strUserRespons.split(" ");
        String output = "";
        for (String word : words) {
            stringList.add(word);
        }
        int numVowels = 0;
        for (int y = 0; y < stringList.size(); y++) {
            for (int i = 0; i < stringList.get(y).length(); i++) {
                char v = stringList.get(y).charAt(i);
                if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u'
                        || v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U') {
                    buffer.append(v);
                    numVowels++;
                }
            }
            if (numVowels != 0) {
                stringBuf.add(buffer.toString());
                output = stringBuf.get(y);

                List<String> list = new ArrayList<String>();
                list.add(output);
                Comparator<String> comparator = new Comparator<String>() {
                    @Override
                    public int compare(String left, String right) {
                        return left.length() - right.length();
                    }
                };
                Collections.sort(list, comparator);


                y = y + 1;
                System.out.print(" В строке № " + y + ": " + numVowels + " гласных " + output.substring(0, 1).toUpperCase() + output.substring(1) + "\n");
                y = y - 1;
                buffer.delete(0, 10000);
                numVowels = 0;
            } else {
                stringBuf.add("");
                y = y + 1;
                System.out.println(" В строке № " + y + ": гласных нет");
                y = y - 1;
            }
        }
    }
}
