// Separate Odd and Even numbers
Map<Boolean, List<Integer>> oddEvenNumbersMap = listOfIntegers.stream().collect(Collectors.partioningBy(num -> num%2 == 0));

//Filter Odd numbers
List<Integer> evenNumbers = listOfIntegers.stream().filter(num -> num%2 == 0).collect(Collectors.toList());

//Remove duplicate elements from List
List<Integer> uniqueNumbers = listOfIntegers.stream().distinct().collect(Collectors.toList());
Set<Integer> uniqueNumbers = listOfIntegers.stream().collect(Collectors.toSet());
Set<Integer> uniqueNumbers = new HashSet<>(listOfIntegers);

//Frequency of each element in an Array
Map<String, Integer> frequencyCounter = elementsInArray.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//Join list of strings with prefix,suffix and delimiter
listOfStrings.stream().collect(Collectors.joining(delimiter,prefix,suffix));

//Sort the list in reverse order.
listOfStrings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
Collections.sort(listOfStrings,Collections.reverseOrder());

//Maximum in a list
listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(1);
listOfIntegers.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
people.stream().min(Comparator.comparing(Person::getAge)).orElseThrow(NoSuchElementException::new);

//Minimum in a list
listOfIntegers.stream().sorted().limit(1);
listOfIntegers.stream().min(Comparator.naturalOrder()).get();

//Merge two sorted Arrays into sorted array
IntStream.concat(Arrays.stream(input1),Arrays.stream(input2)).sorted().toArray()

//Merge two sorted Arrays into sorted array without duplicates
IntStream.concat(Arrays.stream(input1),Arrays.stream(input2)).sorted().distinct().toArray()





