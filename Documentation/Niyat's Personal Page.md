# 4 Agile Core Values

## 1. Individuals and Interactions Over Processes and Tools
People is values more rather than process or tools as the people are the ones who will eventually responds to business requirements and needs. If process or tools drives the development, people will become less respondus and less like to meet the needs of customer. Communication is the example of difference between valuing individual vs process. In case of individuals, Communication is more prompt and done when needed. While in case of process, It requires scheduling.

## 2. Working software over Comprehensive Documentation
Historic developments tend to Documents a lot and required detailing of very small events or functions of the project. It hinders the developments. While Agile doesn't eliminates the documentation but try to maintain it minimal and only as much as required. This makes development quicker. Agile developments give preference to working software rather than comprehensive documentation.

## 3. Customer Collaboration Over Contract Negotiation
In a Simple SDSL life cycle development, Customer specifies all the requirements and details before any development starts. Customer is not involved during the process of development. Agile manifesto describes customer who is engaged and collaborates during development. This makes easier for developers to meet the needs of customer.

## 4. Responding to Change Over Following a Plan
In traditional development, Change in need regarded as an expense and thus avoided. The intention in traditional development is to develop detailed plan of everything - having highest priority of anything else. In Agile, Developments are done through iterations and new development needs can be accommodated in next iteration. In Agile methodology it a belief that change always improves the product and thus are always welcomed.

***

## Evaluation of "Unreal" and "Unity" game engines


[UnityEngine](https://unity3d.com/) and [Unreal](https://www.unrealengine.com/en-US/blog) are two most used Game engines in the industry. Unity is for small to medium size game development while unreal is large game development. We can make incredibly awesome graphics intensive game with unreal but for smaller games it is way more difficult to develop. Unity on the other hand light weight game engine and very easy to develop.

## Evaluation of Unreal:
1. Language: UnrealScript(UScript) and C++
2. Difficult to implement but community is very active and support is also very good.
3. Deployment is paid
4. Supported Platforms: Windows PC, PlayStation 4, Xbox One, Mac OS X, iOS, Android, VR (including but not limited to SteamVR/HTC Vive, Oculus Rift, PlayStation VR, Google VR/Daydream, OSVR and Samsung Gear VR), Linux, SteamOS, and HTML5. You can run the Unreal Editor on Windows, OS X and Linux.

**Unreal Documentation:** [https://docs.unrealengine.com/latest/INT/](https://docs.unrealengine.com/latest/INT/)

**Forum:** [https://forums.unrealengine.com/](https://forums.unrealengine.com/)

***

# Week #2: decide a game, understand the base-line code and implement state design pattern

## Game Decided: Monkey adventure

## Design Pattern: State

# Introduction

State design patern allows object to alter its behaviour when its internal state changes. The object will appear to change its class. State design pattern is concerned with behaviour of object and can be implemented as a [strategy pattern](https://en.wikipedia.org/wiki/Strategy_pattern).

The [state pattern](https://en.wikipedia.org/wiki/State_pattern) is a behavioral software design pattern that implements a state machine in an object-oriented way. With the state pattern, a state machine is implemented by implementing each individual state as a derived class of the state pattern interface, and implementing state transitions by invoking methods defined by the pattern's superclass.

![State in UML](https://upload.wikimedia.org/wikipedia/commons/e/e8/State_Design_Pattern_UML_Class_Diagram.svg "Fig 1. State Design Pattern UML")


Sample Code in JAVA: [Design Pattern State Java](https://github.com/niyatpatel23295/Design_pattern_State_Java)


Week #3
--------------------------------------------------------------------------------------------------------------------
1. Finalize game name

2. Find out bugs in existing game :
   Worked on finding existing bugs and how to remove those bugs for smooth operation. All the bugs found has been listed in      "game analysis" page. 
   
3. Decide new features for the game :
   I have suggested several features for the game and made a list of those in "game analysis" page. I have done analysis to      add different design patterns for new features.
   
4. Make a use case spec diagram :
   I have made a sequence diagram. Diagram will have to be to accomodate future changes.

Week #4
--------------------------------------------------------------------------------------------------------------------
1. Changed Sequence Diagram for new Bugs

2. Started working on BUGs
   
3. Started anylysing sequence diagram's implementation in code
   
4. Started anlysing assigned design pattern - State Design pattern and its implementation in code.

Week #5
--------------------------------------------------------------------------------------------------------------------
1. Fixed App crashing after game over.

2. When game gets over it redirects to start or quit.
   
3. Added Timer in game.

4. Started working on state design pattern to be implements on score board.


Week #6
--------------------------------------------------------------------------------------------------------------------
1. Add State Design pattern

2. Implement State design pattern for Game Start, Running, Stopped, Paused, LevelCompleted and GameOver states
   
3. Other minor bug Fixes.

Week #7
--------------------------------------------------------------------------------------------------------------------

1. Modified state design pattern for changing code accomodation.

2. Created new files for implementing state design pattern of game flow.

3. Fixed other bugs and improvements.

4. Other minor bug Fixes.

Week #8
--------------------------------------------------------------------------------------------------------------------

1. Worked on final integration of state design pattern.
2. Resolved BUGs after integrating other design patterns
3. Created Final Class Diagram.
