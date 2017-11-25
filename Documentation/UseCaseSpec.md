## **Use case 1.1: View Menu**

Primary Actors: Player

PreConditions: System supports the game configuration.

Trigger: Player start the game file and game screen appears.

Description/Normal Flow:

1. As the game starts menu screen appears.
     
2. Player clicks on **Play**. Check **Play Level** use Case.
      
3. Player clicks on **Select Level**. Check **Select Level** use Case.

4. Player clicks on **Quit**. Exit from the game.

Alternate Flow: Exception in executing the game.



## **Use case 1.2: Play Level**

Primary Actors: Monkey

Initiator: Player

Goal: To finish the level

PreConditions: NA

Trigger: Player clicks **Play** on main menu screen.

PostConditions: Redirect to " game finished ".

Description : 

1. Background music starts.

2. The Player watch score, health of monkey at top of the screen.

3. Monkey walks/ jumps forward.

4. The player can click on Pause Button available on bottom of the screen. Check **Pause game** use case.

5. Monkey walks backward.

6. He collects banana and increase score (on scoreboard) by one.


7. He collects **Star** and power increases by 50% on health screen.

    8a. Max health is 100%.
    
8. Player clicks “ Quit “ in bottom left of screen. Check **Quit Level** Use Case.

9. He touches cactus/ trash then

    9a. With every touch power decreases by 25%.

    9b. If power is 0%, then game stops and **Try again** appears on same screen. Lives decrease by one.

    9c. If life is zero, **Game Over** screen.



Alternate Flow : 

* Music is not running.

* Background is not visible.

* Monkey cannot move forward.

* Unproper Game over/ finish.

* As level finish doesn’t redirect to next level.




## **Use Case 1.3: Quit Level**

Primary Actors: Player

Goal: To exit from game (level screen)

PreConditions: Click **Quit** Button from Level screen

Description: Game stops running. 

Alternate Flow: Game doesn’t stop running.



## **Use Case 1.4: Select level** 

Primary Actors: Player

Goal: To select one level (unlocked) to play.

Triggers: Click Select level button from Main Menu.

Description : 

1. The player selects a level. 

2. The Player enters into the level. Check **Play Level** Use case.


Alternate Flow : 

* Levels are not visible.
* Not able to buy level.
* Select level button redirects to another screen.



