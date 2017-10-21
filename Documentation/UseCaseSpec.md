## **Use case 1.1: View Menu**

Primary Actors: Player

PreConditions: System supports the game configuration.

Trigger: Player start the game file and game screen appears.

Description/Normal Flow:

1. As the game starts menu screen appears.
     
2. Player clicks on **Play**. Check **Play Level** Use Case.
     
3. Player Clicks on **ScoreBoard**. Check **ScoreBoard** Use Case.
     
4. Player Clicks on **Select Level**. Check **Select Level** Use Case.
     
5. Player Clicks on **Quit**. Exit from the game.

Alternate Flow: Exception in executing the game.



## **Use case 1.2: Play Level**

Primary Actors: Monkey

Initiator: Player

Goal: To finish the level

PreConditions: Level is unlocked

Trigger: Player clicks **Play** on main menu screen.

PostConditions: Redirect to next level / Or game finished after the last level.

Description : 

1. Background music starts.

2. The Player watch score, health, timer and total available lives of monkey top of the screen.

3. Monkey walks/ jumps forward.

4. The player can click on Pause Button available on bottom of the screen. Check **Pause game** use case.

5. Monkey walks backward.

6. He collects banana and increase score (on scoreboard) by one.

7. He Collects Star then life increases by one.

8. He collects heart and power increases by 50% on health screen.

    8a. Max health is 100%.

9. He touches cactus/ trash then

    9a. With every touch power decreases by 25%.

    9b. If power is 0%, then game stops and **Try again** appears on same screen. Lives decrease by one.

    9c. If life is zero, **Game Over** screen.

10. Timer increases if game is in running mode (not paused).

11. Player clicks “ Quit “ in bottom left of screen. Check **Quit Level** Use Case.

Alternate Flow : 

* Music is not running.

* Background is not visible.

* Monkey cannot move forward.

* Unproper Game over/ finish.

* As level finish doesn’t redirect to next level.


## **Use Case 1.3: Pause game**

Primary Actors: Player

Goal: To pause the level in middle and resume later.

PreConditions: Click **Pause** button in specific level.

PostConditions: Resume game.

Description:

1. Game paused (Monkey/background screen stops moving and timer stops  ).

2. Pause button changes to Resume button.

3. Player clicks on Resume button and game start again from the place he paused and timer starts again. 

4. Check Play Level use case.


Alternate Flow: 

* The game doesn’t stop.

* Resume Doesn’t work.


## **Use Case 1.4: Quit Level**

Primary Actors: Player

Goal: To exit from game (level screen)

PreConditions: Click **Quit** Button from Level screen

Description: Game stops running. 

Alternate Flow: Game doesn’t stop running.


## **Use Case 1.5: View ScoreBoard**

Primary Actors: Player

Goal: To check the highest score of player

PreCondition: Click on ScoreBoard button from Main Menu. 

Triggers: ScoreBoard on Main Menu or Game finish/Game Over.

Description:

1. Check top 5 scores of player.

2. Share Score with friends using **Share** button.

3. Exit from Share Screen by clicking on the **Main menu** button.

Alternate Flow : 

* The scoreboard doesn’t appear.

* Share button doesn't work.


## **Use Case 1.6: Select level** 

Primary Actors: Player

Goal: To select one level (unlocked) to play.

Triggers: Click Select level button from Main Menu.

Description : 

1. The player selects a level from unlocked levels. 

2. The Player buys a level to unlock it. 

3. The Player enters into the level. Check **Play Level** Use case.


Alternate Flow : 

* Levels are not visible.
* Not able to buy level.
* Select level button redirects to another screen.
