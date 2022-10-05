package granicus;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {

	public static void main(String[] args) {

		String[] groceries1 = { "apples 5 1", "oranges 6 1" };
		String[] groceries2 = { "bread -1;1", "milk - 2;1" };
		String[] groceries3 = { "butter M N", "milk 1 1" };
		String[] groceries4 = { "cucumber - 2 1" };

		System.out.println(total(groceries1));
		System.out.println(total(groceries2));
		System.out.println(total(groceries3));
		System.out.println(total(groceries4));
	}

	private static String total(String[] groceries) {

		List<Integer> prices = new ArrayList<Integer>();

		for (String str : groceries) {

			String[] nums = str.replaceAll("[^0-9]", " ").replaceAll(" +", " ").split(" ");
			try {
				prices.add(Integer.parseInt(nums[1]) * Integer.parseInt(nums[2]));
			} catch (Exception e) {
				//means only one valid product, prices size is 1
			}
		}

		if (prices.size() == 1) {
			return prices.get(0) + "=" + prices.get(0);
		}

		return prices.get(0) + "+" + prices.get(1) + "=" + (prices.get(0) + prices.get(1));
	}
}
