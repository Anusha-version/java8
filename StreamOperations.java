filter(predicate) -> filter(transaction -> transaction.getYear() == 2011)
sorted(comparator) -> sorted(),sorted(comparing(Transaction::getValue))
distinct()
collect(toList())
collect(joining())
collect(groupingBy(Employee::getDepartment))
reduce("", (n1, n2) -> n1 + n2)
forEach()
limit()
skip()

//Get Highest transaction
 public Optional<Integer> getHigestTransaction()
    {
        Optional<Integer> highestValue =
                SetUp.getTransactions().stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);
        return highestValue;
    }

//Get Smallest transaction
 public Optional<Transaction> getSmallestTransaction()
    {
        Optional<Transaction> smallestTransaction =
                SetUp.getTransactions().stream()
                        .reduce((t1, t2) ->
                                t1.getValue() < t2.getValue() ? t1 : t2);
        return smallestTransaction;
    }

//Group transactions by currencies.
Map<Currency, List<Transaction>> transactionsByCurrencies =
        transactions.stream().collect(groupingBy(Transaction::getCurrency));
