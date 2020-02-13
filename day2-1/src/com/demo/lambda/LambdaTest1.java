package com.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaTest1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Shantanu","Pavan","Arun","Sanket","Pallavi","Parul","Aniket");
	
		//names.stream().forEach(s->System.out.println(s));
		names.stream().filter(s->s.startsWith("P")).map(s->"Welcome to the group "+s).forEach(s->System.out.println(s));
		Long count=names.stream().filter(s->s.startsWith("P")).count();
		System.out.println(count);
		
		names.stream().filter(s->s.contains("an")||s.contains("An")).forEach(s->System.out.println(s));
		
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,11,34,56,79,23,12,3);
		
		//find the even numbers
		//sum of all the numbers
		//max of the numbers
		
		nums.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		int sum=nums.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		System.out.println(sum);
		Optional<Integer> op=nums.stream().max((a,b)->{return a.compareTo(b);});
		if(op.isPresent()) {
			System.out.println("max value "+op.get());
		}
	}
}
