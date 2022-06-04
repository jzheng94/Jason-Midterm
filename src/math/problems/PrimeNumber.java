package math.problems;
import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

//		ConnectToSqlDB sql = new ConnectToSqlDB();
//		sql.insertDataFromArrayListToSqlTable(list, "PrimeNumber", "Numbers");
//		sql.readDataBase("PrimeNumber", "Numbers");
//		ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();
//		connectToMongoDB.insertIntoMongoDB(list,"PrimeNumbers");
//		connectToMongoDB.readStudentListFromMongoDB("PrimeNumbers");
		List<Integer> arrayprime = new ArrayList<>();
		for (int i = 2; i <= 1000000; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				}
				if (i % j == 0)
					break;
			}
		}
		List list = arrayprime;

	}

}
