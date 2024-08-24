class buySellStock {
  public int maxProfit(int[] prices) {
    int lowest_price = prices[0], profit = 0;
    for (int i = 0; i < prices.length; i++) {
      int cost = prices[i] - lowest_price;
      profit = Math.max(profit, cost);
      lowest_price = Math.min(lowest_price, prices[i]);
    }
    return profit;
  }

  public static void main(String[] args) {
    buySellStock result = new buySellStock();
    int price[] = { 7, 1, 5, 3, 6, 4 };
    System.out.println(result.maxProfit(price));
  }
}
