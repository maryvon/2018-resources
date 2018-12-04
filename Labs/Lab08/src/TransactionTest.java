import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class TransactionTest {

	@Test
	public void testTransactions() {

		// int[] arrayOfInts = new int[];
		List<Integer> arrayOfInts = new ArrayList<>();

		Set<Integer> mySet = new HashSet<>();

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(1, "b");


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
//				arrayOfInts.set(index, element);
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
