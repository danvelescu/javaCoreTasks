package com.company;

public class Main {

    public static void main(String[] args) {
	    Task1 task = new Task1();
	    task.get_sum_of_digits(6666);
	    task.reverse_string("my string");
		System.out.println(task.checkPalidrome(11));
		task.strCounter("1231sssaa  aaa}}}}");
		task.strCounterV2("1231sssaa  aaa}}}}");
		int arr[] = {11,2,3,7,0,1};

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
