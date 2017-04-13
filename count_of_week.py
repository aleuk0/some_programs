# this script can show, how much weeks you need to run X km.
# base_km - what you can run
# wish_km - what you want to run


print("How much km you can run?")		
base_km = int(input())		
print("How much km you want to run?")	
wish_km = int(input())

def count_of_week(base_km, wish_km):
	week = 0
	while base_km < wish_km:
		base_km = base_km * 1.1
		week += 1
		print("On week", week, "you can run", round(base_km, 2), "km;")

	

count_of_week(base_km, wish_km)
input()