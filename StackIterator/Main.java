package StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

        CustomStack customStack = new CustomStack();

        while (!(line = reader.readLine()).equals("END")) {
            line = line.replaceAll(",", "");
            String[] tokens = line.split(" ");
            switch (tokens[0]) {

                case "Push":
                    customStack.push(
                            Arrays.stream(tokens)
                                    .skip(1)
                                    .mapToInt(Integer::parseInt)
                                    .boxed()
                                    .toArray(Integer[]::new));
                    break;
                case "Pop":
                    customStack.pop();
                    break;
            }
        }
        for (Integer ints : customStack) {
            System.out.println(ints);
        }
        for (Integer ints : customStack) {
            System.out.println(ints);
        }
    }
}
