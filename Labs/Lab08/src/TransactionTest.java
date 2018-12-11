import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class TransactionTest {

	@Test
	public void testTransactions() {

		// int[] arrayOfInts = new int[];
		List<Integer> arrayOfInts = new ArrayList<>();

		// add, remove, get
		// o lista, a doua lista -> addAll, containsAll
		// un set
		// un map
		// o clasa generica
		// stack, queue

		Box<Integer> myIntBox = new Box<>();
		myIntBox.setContent(1);

		Box<String> myStringBox = new Box<>();
		myStringBox.setContent("");


		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "aasdasd");
		map.put(1, "b");

		arrayOfInts.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

		List<Integer> newList = arrayOfInts.stream().map(element -> {
			return element * element;
		}).collect(Collectors.toList());

		System.out.println(newList);
		newList.forEach(alabala -> {System.out.println(alabala);});


		for (Integer key : map.keySet()) {

		}

		for (int i = 0; i < 10; i++) {
			arrayOfInts.add(i);
		}

		Iterator<Integer> iterator = arrayOfInts.iterator();
		while (iterator.hasNext()) {
			Integer currentElement = iterator.next();
			if (currentElement % 2 == 0) {
				iterator.remove();
			} else {
				System.out.println(currentElement);
			}
		}
//
//
//		int index = 0;
//		for (Integer element : arrayOfInts) {
//			if (element % 2 == 0) {
//				arrayOfInts.remove(element);
//			}
//			index++;
//		}
//
//		for (int i = 0; i < 10; i++) {
//			if (i % 2 == 0) {
//				arrayOfInts.remove(i);
//			}
//		}

		map.keySet();

		map.get(0);

		arrayOfInts.add(1);
		arrayOfInts.get(0);

		final Date now = new Date();

		Transaction firstTransaction = new Transaction();
		firstTransaction.setCreationDate(now);
		firstTransaction.setAmount(10.0);
		firstTransaction.setFromAccount("fromAccount");
		firstTransaction.setFromAccount("toAccount");

		Transaction secondTransaction = new Transaction();
		secondTransaction.setCreationDate(now);
		secondTransaction.setAmount(10.0);
		secondTransaction.setFromAccount("fromAccount");
		secondTransaction.setFromAccount("toAccount");

		Set<Transaction> transactions = new HashSet<>();
		transactions.add(firstTransaction);
		transactions.add(secondTransaction);

		Assert.assertEquals(firstTransaction, secondTransaction);
		Assert.assertEquals(1, transactions.size());
	}
}
