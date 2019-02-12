
/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 */
public class StockMaxProfit {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));

	}

	/**
	 * Function to calculate the max profit in Buy and Sell stocks Time
	 * Complexity: O(N) - N is number of prices Sapce Complexity: O(1)
	 * 
	 * @param prices
	 * @return
	 */
	private static int maxProfit(int prices[]) {

		if (prices.length < 2) {
			return 0;
		}

		int min_price = prices[0], max_profit = Integer.MIN_VALUE, curr_profit = 0;

		for (int i = 1; i < prices.length; i++) {

			curr_profit = prices[i] - min_price;

			min_price = Math.min(min_price, prices[i]);
			max_profit = Math.max(max_profit, curr_profit);
		}

		// if max profit is negative, return 0
		max_profit = (max_profit < 0) ? 0 : max_profit;

		return max_profit;

	}

}
