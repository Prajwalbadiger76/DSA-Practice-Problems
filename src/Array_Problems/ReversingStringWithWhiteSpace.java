package Array_Problems;

import java.util.Scanner;

public class ReversingStringWithWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        System.out.println("Enter a Sentence : ");
        String input = sc.nextLine();

        char[] str = input.toCharArray();
        char[] res = new char[str.length];

        //to store exact spaces like the original one with same index
        for(int i=0; i<str.length; i++) {
            if(str[i] == ' ') {
                res[i] = ' ';
            }
        }

        //to store letters in reverse order
        int j = str.length - 1;
        for(int i=0; i<str.length; i++) {
            if(str[i] != ' ') {
                while(j>=0 && res[j]==' ') {
                    j--;
                }
                res[j] = str[i];
                j--;
            }
        }
        //To print output 
        System.out.println("Reversed String: " + new String(res));
    }
}

//Input 1 : Hello World
//Reversed String: dlroW olleH

//Input 2 : I love programming
//Reversed String: g nimm argorpevolI