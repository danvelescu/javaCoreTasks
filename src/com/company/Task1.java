package com.company;

import javax.swing.text.html.HTMLDocument;
import java.awt.font.NumericShaper;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public int get_sum_of_digits(){
        System.out.println("Hey , give me a number please ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number<=0 || number>=1000) return 0;
        int sum=0;
    while(number>0) {
        sum += number % 10;
        number = number / 10;
    }
        System.out.println(sum);
        return sum;
    }


    public char[] reverse_string(String sir){
       char[] s = sir.toCharArray();
       char[] returnSir= new char[sir.length()];
       int j=0;
       for(int i = s.length - 1; i >= 0; i--){
            returnSir[j] = s[i];
            j++;
       }
       System.out.println(returnSir);
       return returnSir;
    }

    public boolean checkPalidrome(Integer number){
           String strNum = number.toString();
           char[] chars = strNum.toCharArray();
           for(int i = 0,j = chars.length-1;i<=chars.length/2;i++){
               if(chars[i]!=chars[j])return false;
               j--;
           }
        return true;
    }

    public void strCounter(String str){
        String str1 = str.replaceAll("[0-9]","");
        int len = str.length()-str1.length();
        System.out.println("Numbers = " + len);
        str1 = str.replaceAll(" ","");
        len = str.length() - str1.length();
        System.out.println("Spaces = "+len);
        str1 = str.replaceAll("[A-z]","");
        len = str.length() - str1.length();
        System.out.println("Letters = " + len);
        str1 = str.replaceAll("[^[\\s][A-z][0-9]]","");
        len = str.length() - str1.length();
        System.out.println("Other = "+len);
    }
    public void strCounterV2(String str){
        int numbers = 0;
        int letters = 0;
        int spaces = 0;
        int others = 0;

        for(Character s:str.toCharArray()){
            if(Character.isLetter(s))
                letters++;
            else if(Character.isDigit(s))
                numbers++;
            else if(Character.isWhitespace(s))
                spaces++;
            else
                others++;
        }
        System.out.println("Numbers "+numbers);
        System.out.println("Spaces "+spaces);
        System.out.println("Letters "+letters);
        System.out.println("Other "+others);

    }

    public int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr [j - 1]) {
                    arr = reverse(arr,j);
                }
            }
        }
        return arr;
    }
    public int[] reverse(int arr[],int k){
        int temp;
        temp = arr[k];
        arr[k] = arr[k - 1];
        arr[k - 1] = temp;
        return arr;
    }

    public void sortMyObj(Object[] objArr){
        List<Person> prsons = new ArrayList<>();
        int summ = 0;

        String str ="";
        for(Object obj:objArr){
            if(obj.getClass() == Integer.class){
                summ+=(Integer)obj;
            }else
            if(obj.getClass() == String.class){
                str+=(String)obj;
            }else
            {
               prsons.add((Person) obj);
            }
        }
        System.out.println(summ);
        System.out.println(str);
        for (Person p:prsons)
            System.out.println(p);
    }

}
