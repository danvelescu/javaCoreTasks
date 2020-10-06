package com.company;

public class Main {

    public static void main(String[] args) {
	    Task1 task = new Task1();
	  //  task.get_sum_of_digits();
	  //  task.reverse_string("my string");

		//task.strCounterV2("1231sssaa  aaa}}}}");
		task.checkPalidrome(121);
		int arr[] = {11,2,3,7,0,1};


		task.strCounter("aaa 123 }}'*");
		task.strCounterV2("aaa 123 }}'*");

		arr = task.sort(arr);

		Object[] persons = {
				new Person("pers1",20,"gen1"),
				new Person("pers1",20,"gen1"),
				new Person("pers1",20,"gen1"),
				new Person("pers1",20,"gen1"),
				new Person("pers1",20,"gen1"),
				"sss",
				"ss",
				11,
				22,
				33
		};
		task.sortMyObj(persons);
    }
}
