''' Fibonacci series: '''

print("Write first number: ")
first_number = int(input())
print("Write last number: ")
last_number = int(input())

def fib(first, last):
	a = 0
	while first < last:	
		 print(first, end=', ')
		 a, first = first, first + a
		 
fib(first_number, last_number)
input()