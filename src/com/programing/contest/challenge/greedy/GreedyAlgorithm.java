/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.greedy;

import java.util.HashMap;
import java.util.Map;

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
		this.result = new HashMap<>();
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
			coin.setAmount(Integer.parseInt(subToken[0].replace("c", "").trim()));
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
