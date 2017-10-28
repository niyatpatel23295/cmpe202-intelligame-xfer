## Week #1:

Questions:
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?
 
Answers:

1. In the past week, our team had worked on evaluating the scope of different game engines. We evaluated various game engines like Phaser, Greenfoot, Unity, MelonJs and Unreal. We've created separate wiki pages for each game engine to jot down the results of our evaluation. We have discussed pros and cons of each game engine based on supported platforms, underlying technology stack, complexity, supported IDEs and reviews on the respective forums. Also, each member did a PoC (using open source games) on the respective game engine to understand the complexity and implementation.

2. In the next week, we have to zero in on one game engine. After doing that, we're planning to explore games in that particular game engine. We shall discuss and decide on which game is to be finalized. We shall also study design patterns and figure out what design pattern could be implemented in our project.

3. We found it challenging to zero in on one game engine as we liked several game engines like unity and greenfoot.

## Week #2:

Questions:
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. In the past week, after researching our different options for the game engine, the team decided to implement a game using Greenfoot game engine. We studied several open source games implemented with greenfoot, and agreed on using the Mr.Monkey game as the baseline code, considering its potentials for adding variety of modules, that would allow us implement several design patterns in our project. Also each of us took a different design pattern, evaluated and understood it by implementing an example. 

2. The Team will agree on the features that are going to be implemented in the game. After that every team member will study one or two of those feature(s), and decide using which design pattern that option should be implemented with. We are also going to discuss the design and architechture of the project, but the more detailed discussion and decision will take place in Week#3.

3. As we are in inceptive phase of game development, We are not stuck with any challenging task at this stage. At start of week, we found it challenging to select game that suits our requirement but after we implemented many and many sample games we got better clear idea and finally zeroed on single game.

## Week #3:

Questions:
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. In the past week, our team had brainstormed and proposed many new features to be added into the game. We discussed about design patterns that will fit into different game modules. We divided the task of implementing different design patterns(atleast one design pattern per member) for different features. The outline of our discussion is as follows:
* Menu bar feature uses Composite Pattern.
* Fruits/Rewars and Immunity can be desned by using Abstract Factory pattern.
* Health Status feature can be implemented by using Observer pattern.
* State of the game(Start/Finish/Game Over) can be implented by using State Pattern.
* Backgroung for different levels can be implented by using Decorator pattern.
 
  Apart from this, We decided to remove independent bugs to make the game flow smooth. So, we identified several bugs in the existing game. We have started fixing those bugs from the past week and rest of them will be corrected in upcoming weeks. 
  Additionly, each team member took individual responsibilty of making one UML diagram. 

2. The team will complete implementing UI wireframe(Dhanashree), use case diagram(Ambika), sequence diagram(Niyat), activity diagram(Lavanya) and user stories(Masi) for the game. We shall brainstorm on any other features/modules to be added and the design patterns that can match those features. We shall finalize the design and architecture of the game after final discussion.

3. We found it challenging to match different design patterns to different modules of the game. It was a very good learning experience.

## Week #4:

Questions: 
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. In a past week, We have created different diagrams and Wireframes. We all come up with many more new game features and other purchasing options for improving user engagements.  Major features are as below:
* Health bar - If monkey touches any obstacle, Its health will be degraded by 25%.
* Life - If monkey dies, It can restart level using available lives. Monkey can have 3 lives at max.
* Immunity - When Monkey eats Golden Banana, It can stay immune to any obstacle for 5 seconds.
* Purchase options - User can unlock next level using credit/debit card options or trade his points for the same.
* Score board - Which user is leading the score and whats the current user's highest score.

We also braistormed on architecture of the game as a system. We decided to implement Pause and resume of game and tracking current level of user. We are going to use SQLite as backend database to keep track of user sessions.

2. The team will implement suggested features in the game and implement design patterns on that. Firstly, We will fix remaining few bugs in the system along with making GUI for menu and connect it to all available screens. Every team member will work on one screen and finally we will integrate our design together. Moreover, team members will update UML diagrams accordingly. 

3. One major challenge is to match appropriate design patterns to different features/modules in our game. We'll implement more design patterns as we progress in development of game modules depending on the requirements.

## Week#5:

Questions: 
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. Tasks for this week were mainly to make a template and decide the final modules and start working on that. We have created a GUI for Menu/home screen. We fixed prioritized bugs to make the game operation smooth, we would fix other bugs according to their priority. Along with that, We discussed design patterns and various changes to be made in the game flow, and team worked on implementing the functionalities. We all have decided to work on one module each associated with atleast one design pattern (check [it](https://github.com/nguyensjsu/cmpe202-intelligame/blob/master/Documentation/AssignDesignPatternsToFeatures.md) out). We all are working on making UML Class Design for the game.

2. The team will continue implementing individual modules assigned and will work on choosing design patterns that perfectly fit those modules. UML Class design for respective modules will further progress.

3. Current challenge is to implement design patterns appropriately. We have so far dedided to implement State Design pattern for Score and Decorator for Menu. Other components are being reviewed for the best suitable patterns.
