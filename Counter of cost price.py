''' Counter of cost price '''

invoice = float(input("Your invoice price: "))
eur_rub = float(input("eur/rub: "))
customs = float(input("Customs price: "))

total_price = invoice * eur_rub + customs

count_of_goods = int(input("How much goods bought: "))
prices = []
summ_price_of_goods = 0
for i in range(count_of_goods):
	price = float(input("Cost of commodity: "))
	summ_price_of_goods += price
	prices.append(price)
	
for i in range(count_of_goods):
	print(round((prices[i] * total_price)/summ_price_of_goods, 2))
	
input()