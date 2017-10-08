
# Week #1: Game Engine Evaluations

## Phaser Game Engine Evaluation

Phaser is a fun, free and fast 2D game framework for making HTML5 games for desktop and mobile web browsers, supporting Canvas and WebGL rendering. Phaser is based heavily on [Flixel](http://www.flixel.org/). The engine is relatively new, but has been actively maintained by Richard Davey ([Photon Storm](http://www.photonstorm.com/)). Development can be done using TypeScript or JavaScript. 

##  Evaluation 

Flash-like, 2D, Sounds, Collisions, Physics, JavaScript, Typescript, WebGL, Free.

## Links

**Visit:** [Phaser's Official Site](http://phaser.io/) and overview of [HTML5 Game Engines](https://html5gameengine.com/)

**Community:** [API Docs](http://phaser.io/docs), [Support Forum](http://www.html5gamedevs.com/forum/14-phaser/) and [StackOverflow](http://stackoverflow.com/questions/tagged/phaser-framework)

**Extend:** With [Phaser Plugins](http://phaser.io/shop/plugins)

## Sample Games

700+ [Examples](http://phaser.io/examples] (source available in this [repo](https://github.com/photonstorm/phaser-examples))


# Week #2: Finalizing a game, understanding the base-line code and practising one design pattern

** Game Finalized: ** Monkey Adventure

## Composite Design Pattern Evaluation: [source](https://en.wikipedia.org/wiki/Composite_pattern)

### Overview 

The composite pattern describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

Define a unified Component interface for both part (Leaf) objects and whole (Composite) objects.
Individual Leaf objects implement the Component interface directly, and Composite objects forward requests to their child components.
This enables clients to work through the Component interface to treat Leaf and Composite objects uniformly: Leaf objects perform a request directly, and Composite objects forward the request to their child components recursively downwards the tree structure. This makes client classes easier to implement, change, test, and reuse.

Fig 1. Composite Design Pattern UML Class Diagram

![composite_uml_class_diagram_ fixed](https://user-images.githubusercontent.com/16696260/31052570-0a88a780-a63d-11e7-90ef-818dc481fac2.png)

** Component **
- is the abstraction for all components, including composite ones
- declares the interface for objects in the composition
- (optional) defines an interface for accessing a component's parent in the recursive structure, and implements it if that's appropriate

** Leaf **
- represents leaf objects in the composition
- implements all Component methods

** Composite **
- represents a composite Component (component having children)
- implements methods to manipulate children
- implements all Component methods, generally by delegating them to its children

[Sample Code for Composite Design Pattern in Java](https://github.com/Masea/DesignPatterns_Composite)

# Week #3: Assigning design patterns to features, evaluating a new design pattern, writing user stories for the game.

1. Evaluated the composite design pattern which is useful for implementing the menu feature. 
An example of implementing the menu options using composite design pattern can be found [here](https://github.com/Masea/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/composite).
2. Contributed in determining initial features to be in the game, and their respective design patterns.
3. Suggested few new game names. We have to finalize appropriate name.
4. Suggested some new features to be added into the game. Updated them in the GameAnalysis page.
5. Prepared the user stories based on the agreed-upon features (UserStories.md file is added in Documentation). This will be modified when new features or modules are proposed and approved by the team.
