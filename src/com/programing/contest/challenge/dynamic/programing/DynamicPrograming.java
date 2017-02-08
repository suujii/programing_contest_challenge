/**
* 무게와 가격이 각각 w, v인 n개의 물건이 있다. 무게의 총합이 W를 초과하지 않도록 물건을 선택했을 때의 가격 총합의 최대치를 구하세요.
*
* 1<=n<=100
* 1<=w,v<=100
* 1<=W<=10000
*
* 입력
* n = 4
* (w, v) = {(2,3), (1,2), (3,4), (2,2)}; 무게, 가격
* W = 5
* 
* 출력
* 7(0, 1, 3 번인 물건을 고른다)
*/
package com.programing.contest.challenge.dynamic.programing;

/**
 * @author SuJi, Lee
 * 
 */
public class DynamicPrograming {
	private int count;
	private Product[] products;
	private int totalWeight;

	public DynamicPrograming(int count, Product[] products, int totalWeight) {
		if (count != products.length) {
			throw new IllegalArgumentException("invalid parameter");
		}

		this.count = count;
		this.products = products;
		this.totalWeight = totalWeight;
	}

	public void printMaxTotalPrice() {
		int maxPrice = 0;
		for (int i = 0; i < products.length; i++) {
			int sumPrice = sumPrice(i);
			if (maxPrice < sumPrice) {
				maxPrice = sumPrice;
			}
		}
		System.out.println(maxPrice);
	}

	public int sumPrice(int firstIndex) {
		Product[] sums = new Product[products.length]; // 누적합계 집합
		boolean intoYn = false;

		int index = 0;
		for (int i = firstIndex; i < products.length; i++) {

			if (intoYn == false && products[i].getWeight() <= totalWeight) {
				Product p = new Product();
				p.setWeight(products[i].getWeight());
				p.setPrice(products[i].getPrice());

				sums[index] = p;
				index++;
				intoYn = true;

			} else if (intoYn && sums[index - 1].getWeight() + products[i].getWeight() <= totalWeight) {

				Product p = new Product();
				p.setWeight(sums[index - 1].getWeight() + products[i].getWeight());
				p.setPrice(sums[index - 1].getPrice() + products[i].getPrice());

				sums[index] = p;
				index++;
			}
		}
		if (index == 0) {
			return index;
		} else {
			return sums[index - 1].getPrice();
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
}
