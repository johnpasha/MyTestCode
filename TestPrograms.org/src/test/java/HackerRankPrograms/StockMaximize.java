package HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StockMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> prices = new ArrayList<Integer>(Arrays.asList(1,5,2,3));;
		System.out.println(stockmax(prices));
	}
	
	public static long stockmax(List<Integer> prices) {
	    // Write your code here
		int Curr_stocks = 0;
		int max_price = 0;
		int bought_cost = 0;
		int profit = 0;
		for (int i=0;i<prices.size();i++) {
			max_price = Collections.max(prices.subList(i, prices.size()));
			if(prices.get(i) < max_price) {
				Curr_stocks++;
				bought_cost += prices.get(i);
			}else {
				profit += (max_price*Curr_stocks)-bought_cost;
				Curr_stocks=0;
				bought_cost=0;
			}
		}
		
		return profit;
	    }

}
