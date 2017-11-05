# Battleship

Battleship is a game that you probably played as kids. It’s a guessing game between 2 players. You have to implement this on the computer. 
The game itself involves two grids positioned over locations in the ocean. Each player may only see the ships that are in their own grid and their own attacks on the opponent’s screen. Players take turns launching missiles into individual grid locations with the goal of sinking the opponent’s ships. When a missile is launched, the player is told whether the missile “hit” or “missed”. The game also says on a “hit” if the ship was “sunk”, meaning that all of the locations the ship occupies have been hit. The game is won when all locations that the enemy’s ships cover have been “hit”.

 The requirements of the game are as follows.
●	2 Players
●	Each player has a 10X10 board to place the ships. 
●	Players will be given 5 ships that are 3 units long and 1 unit wide
●	Ships can be oriented vertically or horizontally. 
●	Each player sees 2 grids - their own with the ships placed and their opponent’s grid with a Record of where they have attacked. 
●	Each player takes turn attacking the opponents ships. 
●	The result of an attack can be one of:
●	A ‘Hit’ if the opponent has a ship covering the coordinate
●	A ‘Miss’ if there is no ship covering the coordinate
●	‘Sunk’ if all coordinates a ship covers have been hit
●	‘Win’ if all ships on the opponent’s board have been sunk
The game ends when all of a player’s ships have been sunk.
