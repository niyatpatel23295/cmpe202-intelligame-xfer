# cmpe202-intelligame

## About

Welcome to the cmpe202-intelligame Home Page!

Take a look at IntelliGame's [Task Board](https://github.com/nguyensjsu/cmpe202-intelligame/projects/1), [Sprint burndown chart](https://docs.google.com/a/sjsu.edu/spreadsheets/d/1-ly4D-oXPEhyvYskkFmsm8n3-NE6Tz2ICrFPRniC6k8/edit?usp=sharing) and  [Kanban CFD/burndown chart](https://docs.google.com/a/sjsu.edu/spreadsheets/d/1dHsh0lqHa1oSwWzEw4BaylPXvOu0yQg38ygP4IT3L7g/edit?usp=sharing). 

IntelliGame is a web-based fun and interactive game that is currently under development at [Computer Engineering Department](https://cmpe.sjsu.edu/)  of [San Jose State University](http://www.sjsu.edu/). It is a team project for the graduate course "CMPE-202 Software Systems Engineering" instructed by [Paul Nguyen](https://github.com/paulnguyen/) during Fall 2017. 

IntelliGame is going to be developed within an 8-week plan. Two different agile methodologies are going to be practiced during this project: Kanban for the first half, and Scrum for the second half. 

**Meet IntelliGame Team:**
* [Niyat Patel](https://github.com/niyatpatel23295)
* [Masi Nazarian](https://github.com/Masea)
* [Dhanashree Goankar](https://github.com/dgaonkar17)
* [Ambika Bohra](https://github.com/ambikabohra)
* [Lavanya Kandukuri](https://github.com/lkandukuri)


Stay tuned with our exciting project! :)

## Documentation 

For detailed documentation go to [Documentation](/Documentation) and [Presentation](https://docs.google.com/presentation/d/1hr2QsRz1jWoiiEijMMzYTL_2kigXGd1ZSww9GGx6gT4/edit#slide=id.g2a5157d878_0_0)


## Existing features:

1. Monkey can walk and jump forward.
2. If monkey touches dustbin or cactus, then game is over.
3. Monkey can collect bananas and each banana is a score point.
4. Score board is available on top right.

## Existing bugs:

1. Not a smooth finish of the game. [fixed]
2. No option to "Play game" or starting a game. [fixed]
3. Background music is running continuously. It should not start if game has not started. [fixed]
5. Props and monkey size should be small compared to background. [fixed]
6. Monkey should not be killed, once he touches prop. His health status should be decreased by X%. [fixed]
7. Left button is not working, monkey should go back when left button is pressed. [fixed]
8. Decrease the jump width (x parameter).[fixed]
9. Once game is over, it should redirect to "Try again" or "Quit". [fixed]
10. Change the background and props to make it visually attractive. [fixed]
11. Even after the game is over, monkey moves till it reaches ground if the run button is pressed without reset. [fixed]
12. There are a total of 41 bananas in the game. Even if we miss collecting one banana, the final score is still 41. Score should be adjusted depending on the number of bananas collected. [fixed]
13. Music should stop if the game is paused for easy identification. 

## New features planned to be implemented:

1. Adding health status and showing monkey's health status in a different bar. [done]
2. Adding more levels into the game (levels to be called "Saga" in our game i.e. The Adventur Saga, The War Saga, The Power Saga, The Marathon Saga, and so on). [in process]
3. Giving more lifes and improve score board for displaying life and score both. [done]
4. As the levels progress, increase the difficuly of the game by placing more dustbins/cactus. 
5. Change the background/ look and feel of every level. [done]
6. Adding different fun voices for whenever the monkey eats different kinds of items i.e. banana, other regular fruits, heart (immunity), spark (power), rotten fruits (weakness).  [done]

# 4 Agile Core Values

## 1. Individuals and Interactions Over Processes and Tools
People is values more rather than process or tools as the people are the ones who will eventually responds to business requirements and needs. If process or tools drives the development, people will become less respondus and less like to meet the needs of customer. Communication is the example of difference between valuing individual vs process. In case of individuals, Communication is more prompt and done when needed. While in case of process, It requires scheduling.

## 2. Working software over Comprehensive Documentation
Historic developments tend to Documents a lot and required detailing of very small events or functions of the project. It hinders the developments. While Agile doesn't eliminates the documentation but try to maintain it minimal and only as much as required. This makes development quicker. Agile developments give preference to working software rather than comprehensive documentation.

## 3. Customer Collaboration Over Contract Negotiation
In a Simple SDSL life cycle development, Customer specifies all the requirements and details before any development starts. Customer is not involved during the process of development. Agile manifesto describes customer who is engaged and collaborates during development. This makes easier for developers to meet the needs of customer.

## 4. Responding to Change Over Following a Plan
In traditional development, Change in need regarded as an expense and thus avoided. The intention in traditional development is to develop detailed plan of everything - having highest priority of anything else. In Agile, Developments are done through iterations and new development needs can be accommodated in next iteration. In Agile methodology it a belief that change always improves the product and thus are always welcomed.


## Scrum Weeks

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


## Kanban Weeks

## Week#5:

Questions: 
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. Tasks for this week were mainly to make a template and decide the final modules and start working on that. We have created a GUI for Menu/home screen. We fixed prioritized bugs to make the game operation smooth, we would fix other bugs according to their priority. Along with that, We discussed design patterns and various changes to be make in the game flow, and team worked on implementing the functionalities. We all have decided to work on one module each associated with atleast one design pattern (check [it](https://github.com/nguyensjsu/cmpe202-intelligame/blob/master/Documentation/AssignDesignPatternsToFeatures.md) out). We all are working on making UML Class Design for the game.

2. The team will continue implementing individual modules assigned and will work on choosing design patterns that perfectly fit those modules.

3. Current challenge is to implement design patterns appropriately. We have so far decided to implement State Design pattern for Score and Decorator for Menu. Other components are being reviewed for the best suitable patterns.We have decided to implement state,proxy and observer design pattern for user authentication.

## Week#6:

Questions: 
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. In the past week, we worked on creating different modules which included new functionalities like new levels, Power ups, Menu screen, user login and score screen. We discussed about the dependencies between each of these modules and made sure that development tasks are not affected by these dependencies. We created separate folders and started working on individual assigned modules on respective folder.

2. In the next week, we are planning to finalize the development of different modules using appropriate design patterns and to work on integration of different modules.

3. Current blocker is to manage the integration of all modules and refactoring code to implement design patterns. We have to ensure it doesn't create any bugs. Similarly we will make new enhancement as the project requires to keep the integration smooth. 


## Week #7:
Questions: 
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. Our team implemented various design patterns in their modules. We integrated our pattern in the baseline code ensuring the code quality. While some design patterns have not yet been integrated fully, We will continue working on it.

2. The next step would be to finalize the integration of modules, and then take care of any bugs that may appear as a result of integration. We will also add some final touches to the GUI (Graphical User Interface). Apart from this, we'll star working on the final integration of class diagram of the game.

3. Some design pattern implementations are not completely imtegrated, so we are going to discuss that, and make sure everything works fine.

## Week #8:
Questions: 
1.  What did the team do the past week?
2.  What is the team going to do next week?
3.  What are the current blockers/challenges the team is facing?

Answers:

1. Our team worked on integration of different modules this week. We fixed all the bugs generated due to integration. All the assigned design patterns were implemented and integrated successfully. We worked on generating the final class diagram of the game showing all the design patterns.

2. The team is going to generate a document having all the UML diagrams and we shall start working on the presentation and demonstration. We will continue to contribute in codebase if any bug or feature requirement comes.

3. We don't have any block or challenge currently. The integration problem is resolved successfully now.

