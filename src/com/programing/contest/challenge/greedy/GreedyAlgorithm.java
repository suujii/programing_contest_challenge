/**
* 1원, 5원, 10원, 50원, 100원, 500원짜리가 각각 C1, C5, C10, C50, C100, C500개 씩 있다. 가능한 적은 수의 동전으로 A원을 
* 지불하려면 몇개의 동전이 있어야 할까? 지불 방법은 적어도 1개는 존재한다고 가정한다.
*
* 0<= C1, C5, C10, C50, C100, C500 <=10^9
* 0<= A + 6565 <= 10^9
*
* 입력
* C1=3, C5=2, C10=1, C50=3, C100=0, C500=2, A=620
* 
* 출력
* 6 (500원짜리 1개, 50원짜리 2개, 10원짜리 1개, 5원짜리 2개 합계 6개)
*/
package com.programing.contest.challenge.greedy;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author SuJi, Lee
 *
 */
public class GreedyAlgorithm {
	private static final int COIN_COUNT = 6;
	private Coin[] coins;
	private int amount;
	private Map<Integer, Integer> result;

	public GreedyAlgorithm(String input) {
		this.coins = new Coin[COIN_COUNT];
		this.result = new TreeMap<>();
		init(input); // token 분리, 유효성 검사
	}

	private void init(String input) {
		//동전의 순서는 차례대로 들어온다고 가정(1원, 5원, 10원, 50원, 100원, 500원 순)
		String[] tokens = tokenNize(input, ",");

		if (tokens == null || tokens.length != 7) {
			throw new IllegalArgumentException("input is invalid");
		}

		for (int i = 0; i < tokens.length - 1; i++) {
			if (tokens[i].contains("=") == false) {
				throw new IllegalArgumentException("input is invalid");
			}
			String[] subToken = tokenNize(tokens[i], "=");

			Coin coin = new Coin();
			coin.setAmount(Integer.parseInt(subToken[0].replace("C", "").trim()));
			coin.setCount(Integer.parseInt(subToken[1]));
			this.coins[i] = coin;
		}

		this.amount = Integer.parseInt(tokenNize(tokens[tokens.length - 1], "=")[1]);
	}

	private String[] tokenNize(String input, String delimiter) {
		if (input == null || input == "") {
			throw new IllegalArgumentException("input is invalid");
		}
		return input.split(delimiter);
	}

	public void printCoinCount() {
		printCoinCount(amount, coins.length - 1);
	}

	public void printCoinCount(int amount, int index) {
		if (amount == 0) {
			int sum = 0;
			for (Integer key : result.keySet()) {
				sum += result.get(key);
			}
			System.out.print(sum);
			System.out.println(result.toString());
		}

		for (int i = index; i >= 0; i--) {
			if (coins[i].getCount() > 0) {

				int diffAmt = amount - coins[i].getAmount();

				if (diffAmt >= 0) {
					coins[i].setCount(coins[i].getCount() - 1);

					if (result.containsKey(coins[i].getAmount()) == false) {
						result.put(coins[i].getAmount(), 1);
					} else {
						result.put(coins[i].getAmount(), result.get(coins[i].getAmount()) + 1);
					}
					printCoinCount(diffAmt, i);
				} else {
					printCoinCount(diffAmt, i - 1);
				}
			}
		}
	}

	public Coin[] getCoins() {
		return coins;
	}

	public void setCoins(Coin[] coins) {
		this.coins = coins;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
