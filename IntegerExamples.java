import java.util.*;
import java.util.stream.*;

public class IntegerExamples{
    public static void main(String args[]) {
     
        }
     
     public static void printFirstElement(){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
            list.stream().findFirst().ifPresent(System.out::println);

     }
  
    public static void printElementsCOunt(){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
       long count =  myList.stream().count();
        System.out.println(count);  
     }
  
    public static void printMaxElement() {
          List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
          int max =  myList.stream()
                           .max(Integer::compare)
                           .get();
          System.out.println(max);                    
     }
  
     public static void printEvenNumbers(){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
            list.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
     }
  
     public static void printNumbersStartWithOne(){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
            list.stream()
                .map(String::valueOf)
                .filter(str-> str.startsWith("1"))
                .forEach(System.out::println);
     } 
  
     public static void printDuplicateElements(){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
       
        //Approach 1: Using Set inbuilt add method.
        Set<Integer> uniqueElements = new HashSet<>();
            list.stream()
                .filter(i -> !uniqueElements.add(i))
                .forEach(System.out::println);
     }
  
     public static void printFrequencyOfElements(){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
       
        //Approach 1: Using Map
        Map<Integer, Integer> elementsFrequency = new HashMap<>();
        for(Integer i : list){
          Integer count = elementsFrequency.get(i);
          if(count == null){
            count==0;
          }
          elementsFrequency.put(i,count+1);
        }
       for(Map.Entry<Integer,Integer> entry : elementsFrequency.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
       }
       
       //Approach 2: Using Set and Collections.frequency
       Set<Integer> uniqueElements = new HashSet<>(list);
       for(Integer i: uniqueElements){
         Integer count = Collections.frequency(list,i);
            System.out.println(i + ": " + count);
       }
       
       //Approach 3: Using Java 8
       list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((k, v) -> System.out.println((k + ":" + v)));
       //Function.identity() is same as i -> i
     }
  
 

  
    }
