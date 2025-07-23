# 🧀 Cheese Race  
**Developed by Thiago Bührer (2025)**

---

## **Project Summary**
This CLI game was created to showcase object-oriented programming concepts through interactive gameplay in the console. 
It demonstrates class design, inheritance, and encapsulation while providing a simple, engaging user experience. 
The entire project was developed in **Java**.

---

## **How to start the game?**
1. Clone this repository and open the project (you may use Visual Studio Code or a Java IDE like IntelliJ IDEA).  
2. Find the file **`Main.java`** located in: Cheese_Race > src > CheeseRace > GamePlay.
3. Run the **`Main`** class to start the game.  
It runs directly in the console, where you can interact by typing commands and reading the text output.

---

## **Plot**
Deep in the Sewer World’s shadows, you’re thrust into a ruthless race for glory. Guided by sly rat hustlers Bobbie and Jimmy, you must shatter records, earn cheese currency, and upgrade your ride at Mozzarato’s gritty garage. Each lap pushes you closer to the edge. Only those who master all four challenges can carve their names into Sewer World legend.

---

## **Rules and Final Goal**
- Rat pilots may choose **_Vehicles_** (either **_Cars_** or **_Motorcycles_**), **_Items_** and **_Tracks_** they want to ride.  
- There are **09 different Tracks** available. Each one has **02 _Moments_ ⛔** associated with it.  
- **_Moments_ ⛔** have attributes that cause delays for a **_Vehicle_** at certain points on a track.  
- Some **_Moments_** favor **lighter vehicles**, others favor **more powerful vehicles**.  
- Be mindful when choosing the **_Tracks_**, considering your current **_Vehicle_** and special **_Items_** attached.  
- Whenever you **beat the current record** of any **_Track_**, you will be awarded **Cheese Pieces 🧀**.  
- **Cheese Pieces 🧀** can be exchanged for **_Items_** and **_Vehicles_** at the mechanic shop.  
- Your final goal: beat the record of 04 different Tracks and become the greatest rat pilot in the **Sewer World**.

---

## **Structure (Packages)**
- **`GamePlay`** → Contains the **`Main`** class and classes responsible for handling the overall game flow and story progression.  
- **`GameDesign`** → Contains all classes that handle visual outputs like ASCII art, text and dialogue, as well as user interactions through the console.  
- **`Items`** → Contains all classes related to **_Item_** objects, including instantiation, attributes, stock management, and **interactions with vehicles**.  
- **`Pilots`** → Contains all classes related to **_Pilot_** objects, including instantiation, attributes, and **status tracking**.  
- **`Tracks`** → Contains all classes related to **_Track_** and **_Moment_** objects, including instantiation and **functions combining Tracks and Moments**.  
- **`Vehicles`** → Contains all classes related to **_Vehicle_** objects, including instantiation, **categorisation**, and attributes.  

---

## **Design Patterns Applied**
- Factory 
- Facade

---

## **Observations**
- The **`.txt` files** found inside the project's folders correspond to all the ASCII art displayed during gameplay.
- You may find a **JavaDoc** folder alongside the game for detailed documentation of the classes and methods used throughout the project.
  
