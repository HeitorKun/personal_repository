# PDDL Formalization (RPG Domain)
##### Due to: 19/6/2020
### Author: Heitor Feijó Kunrath
### Domain
The domain was created by making an abstraction of the problem sent by professor Meneguzzi. Based on that problem's objects were simplified by just making "maze" object predicates. Due to this object simplification, other object types didn't have to be created, such as sword, monster ,or hero. 


##### Actions
- move_hero: Moves hero from one "maze piece" to another, given that there is no monster where the here was, that there was no trap, and that the hero hasn't already been on the destination maze .
- pick_sword: picks sword from a given maze, given that the sword is present .
- skay_monster: Kills the monster, given that the hero has the sword .
- drop_sword: drops the sword in the maze where the hero is at if the hero has it.
- untrap: Removes trap if the hero does not have sword when he arrived on the maze which contains the trap.
- 
#####  Predicates 

- hero_at: Shows that the hero is in a given maze.
- s_with : Shows that the sword is with the hero.
- s_at :  Shows that the sword is in a given maze location
- near: Concets two distinct mazes, this is how I managed to restric the hero from moving from the beginning straight to the goal maze. This way, when the program uses the action "move_hero" one of the preconditions is that the maze where the hero is at (hero_at) is near the the maze where the hero wants to move to.
- hero_has_been: Shows that the hero has already been in a given maze location, so that he can't go there again.
- monster_at: Shows that there is a monster in a given maze.
- trap_at: Shows that there is a trap in a given maze.

### Problems 
The problems were created using the predicate "near" from the domain and other predicates such as "trap_at", "s_at", and "monster_at". There were created six maze locations conected to each other for each problem as the project guidelines given by professor Meneguzzi showed with the exception of the second problem. The second problem for planning purposes is identical to the proposed problem by professor Meneguzzi, but ,due to compilation and exeeded run time problems, it was simply reversed so it's structure remains intact, but it is only nominally altered. 



  