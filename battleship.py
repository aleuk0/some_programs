﻿''' Battleship from Codecademy '''

''' 
Make multiple battleships: you'll need to be careful because you need to make sure that you don't place battleships on top of each other on the game board. You'll also want to make sure that you balance the size of the board with the number of ships so the game is still challenging and fun to play.

Make battleships of different sizes: this is trickier than it sounds. All the parts of the battleship need to be vertically or horizontally touching and you'll need to make sure you don't accidentally place part of a ship off the side of the board.

Make your game a two-player game.

Use functions to allow your game to have more features like rematches, statistics and more!
'''

from random import randint

board = []
for x in range(5):
	board.append(['O'] * 5)

def print_board(board):
	for row in board:
		print(" ".join(row))	# return O with space

print("Let's play Battleship!")
print_board(board)

def random_row(board):
	return randint(0, len(board) - 1)
def random_col(board):
	return randint(0, len(board[0]) - 1)

#TODO сделать 5 кораблей - можно сделать 2 поля (для каждого игрока (компа))
ship_row = random_row(board)
ship_col = random_col(board)
print(ship_row + 1)
print(ship_col + 1)

for turn in range(9): 
	guess_row = int(input("Guess Row:")) - 1
	guess_col = int(input("Guess Col:")) - 1

	if guess_row == ship_row and guess_col == ship_col:
		print("Congratulations! You sunk my battleship!")
		break
	else:
		if (guess_row < 0 or guess_row > 4) or (guess_col < 0 or guess_col > 4):
			print("Oops, that's not even in the ocean.")
		elif(board[guess_row][guess_col] == "X"):
			print("You guessed that one already.")
		else:
			print('You missed my battleship!')
			board[guess_row][guess_col] = 'X'
			if turn == 3:
				print('Game Over')
			print('Turn ', turn + 1)
		print_board(board)
		
input()