#!/usr/bin/env python
# -*- coding: utf-8 -*-


invoice = float(input("Итоговая цена Инвойса (в eur): "))
eur_rub = float(input("Курс eur/rub: "))
customs = float(input("Цена таможни: "))

total_price = invoice * eur_rub + customs

count_of_goods = int(input("Количество товаров: "))
prices = []
summ_price_of_goods = 0
for i in range(count_of_goods):
	price = float(input("Цена позиции (в eur): "))
	summ_price_of_goods += price
	prices.append(price)
	
for i in range(count_of_goods):
	print(round((prices[i] * total_price)/summ_price_of_goods, 2))
	
input()