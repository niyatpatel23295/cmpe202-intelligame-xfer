Week #1
----------------------------------------------------------------------------------------------------------
# UNITY

[Official Website](https://unity3d.com/)

[Unity Manual](https://docs.unity3d.com/Manual/index.html)

[Sample Game](https://unity3d.com/learn/tutorials/projects/roll-ball-tutorial) 


##  Evaluation 

1. Supported Platform  : smartphone, virtual reality, desktop computers, console, TV, and web space ( Android, iOS, Windows Phone, Tizen, PC, Mac, Linux, PS4, Xbox One, PlayStation Mobile, PlayStation Vita, Wii U, tvOS, Android Tv, and Samsung Smart TV). 

2. Underlying language : C sharp/ Java script

3. Easy to implement.

4. [Forum support](https://forum.unity.com/) is available.

## Game Ideas

[Asset Store Unity](https://www.assetstore.unity3d.com/en/#!/search/page=4/sortby=relevance/query=game&category:1&price:0)

[https://github.com/leereilly/games](https://github.com/leereilly/games)

[https://github.com/shohan4556/learn-unity-by-making-games](https://github.com/shohan4556/learn-unity-by-making-games)

--------------------------------------------------------------------------------------------------------------

Take a look on my sample game(Roll-A-Ball) built on unity game engine [here](https://github.com/ambikabohra/Roll-A-Ball-Unity).

Week #2
------------------------------------------------------------------------------------------------------------
# Finalizing a game, understanding the base-line code and practising one design pattern

Finalized game : Monkey adventure

# Observer design Pattern

1. It known as a behavioural pattern, as it's used to form relationships between objects at runtime.
2. One-to-many dependency between objects.
2. One object changes state, all of its dependents are notified and updated automatically.
3. Subject is an object which is being watched and observers or listeners are the objects which are watching the state changes.
5. For example, you can define a listener for a button in a user interface. If the button is selected, the listener is notified and performs a certain action.


Example: Assume there is a blog, users are registered to updates on the blog. When a new article is posted in the blog (state change). Registered user will be notified. Here blog is the subject and user is the observer.

Take a look at [Observer Pattern Example](https://github.com/ambikabohra/Design-Pattern-Example).

Week #3
--------------------------------------------------------------------------------------------------------------------
1. Finalize game name : Greedy Monkey

2. Find out bugs in existing game :
   Worked on finding existing bugs and how to remove those bugs for smooth operation. All the bugs found has been listed in      "game analysis" page. 
   
3. Decide new features for the game :
   I have suggested several features for the game and made a list of those in "game analysis" page. I have done analysis to      add different design patterns for new features.
   
4. Make a use case diagram :
   I have made a use case  diagram, including new features finalized by team. I will update this diagram if the team adds    additional features in the game in upcoming weeks.


Week #4
--------------------------------------------------------------------------------------------------------------------
1. Worked on enhancement of "Left arrow key" should work , so that monkey can move backwards. (In review)
2. Added Use Case specification document to describe all the features and flow of game.
3. Enhanced score screen to make it look better visually. (In review)
4. Added health screen to show power level of monkey. (In review)
5. Worked on doing analysis of observer pattern to apply in game.

Week #5
--------------------------------------------------------------------------------------------------------------------
1. Created GUI for the game, which directs to other screens.
2. Fixed bug of monkey and prop size.
3. Fixed bug of left arrow key functionality.
4. Added functionality of sound on and off in the menu screen as well as game play screen.
5. Added purchase screen use case in my Use case specification.
6. Fixed bug of continuous background music.
7. Change the monkey's steps size. Previously, it was not smooth operation.


Week #6
--------------------------------------------------------------------------------------------------------------------
Fix bug of backward movement of monkey.

Added smooth connection between two level.

Added new screens for Game over state and made the game running (even after game is over) and directed to new instance of MyWorld class.

Added observer pattern for Healthscreen.

Week #7
--------------------------------------------------------------------------------------------------------------------

Added observer design pattern for the score(score screen as an observer and monkey as a subject).

Added design pattern for health(health screen as an observer and cactus, trash, power as subjects).

Fixed the bug of repeating bananas.
