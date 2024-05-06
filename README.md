Tamagotchi App in Kotlin : A digital Pet Companion
This README delves into a Kotlin-based Android application that brings the essence of the classic Tamagotchi to life. Users nurture a virtual pet by fulfilling its basic needs and monitoring its health through interactive elements.

Getting started:
Before embarking on your Tamagotchi journey, ensure you have the following:
•	Android Studio: Download and install the latest version from the official Android developer website https://developer.android.com/studio.

Project Setup
•	Clone the Repository:
o	Utilize Git to clone the project's repository onto your local machine.
•	Open Project in Android Studio:
o	Launch Android Studio.
o	From the welcome screen, select "Open an existing Android Studio project".
o	Navigate to the directory containing the downloaded project files.
o	Click "Open" to import the project into Android Studio.
•	Run the App:
o	Ensure an Android device or emulator is connected and configured within Android Studio.
o	Click the "Run" button (usually a green play icon) on the toolbar.
o	Select your preferred launch configuration (device or emulator).
o	The Tamagotchi app will install and launch on the chosen device.

Features
•	Track your Tamagotchi's hunger, health, and cleanliness levels.
•	Feed your Tamagotchi to increase its hunger and revive it if health is critically low.
•	Bathe your Tamagotchi to increase its cleanliness and revive it if health is critically low.
•	Entertain your Tamagotchi to increase its health and slightly decrease its hunger and cleanliness. However, health will only increase significantly if hunger and cleanliness are above a certain threshold.
![image](https://github.com/TeniqueC/TamagotchiApp/assets/163857386/65c21237-35ff-4b8c-9cb2-cda8f86375dd)

Gameplay 
•	The buttons on the screen correspond to feeding, bathing, and entertaining your Tamagotchi.
•	Tapping a button will update the corresponding stat and the pet's image based on its health.
•	The goal is to maintain your Tamagotchi's hunger, health, and cleanliness within healthy ranges.
Note: If your Tamagotchi's health reaches 0, it will die (the app won't crash though).
![image](https://github.com/TeniqueC/TamagotchiApp/assets/163857386/c004baf9-8f9f-4655-be0e-72c81c2acb9e)
![image](https://github.com/TeniqueC/TamagotchiApp/assets/163857386/fa7df6c8-1deb-4f15-8dc6-42d46f750e4b)
![image](https://github.com/TeniqueC/TamagotchiApp/assets/163857386/3633c5e1-e6a3-44ff-9230-1d2cc62d9aa4)

Code Structure
The main activity (MainActivity2.kt) handles the core functionality of the app. It manages the Tamagotchi's stats (hunger, health, cleanliness), updates the UI text views, and changes the pet image based on health.
•	Variables: 
o	health: Represents the Tamagotchi's health level (0-100).
o	hunger: Represents the Tamagotchi's hunger level (0-100).
o	cleanliness: Represents the Tamagotchi's cleanliness level (0-100).
•	Button click listeners: 
o	Each button click listener updates the corresponding stat and calls methods to update the UI text and pet image.
o	The entertain button considers hunger and cleanliness thresholds before awarding a health bonus.
Further Development
•	Implement a death state for the Tamagotchi with a restart option.
•	Add animations or sound effects for user interaction.
•	Introduce new activities or mini-games to improve the Tamagotchi's stats.

Referencing:
Adams, S. (2011). Android for dummies. Wiley Publishing.
The Kotlin Programming Language (https://kotlinlang.org/). Retrieved May 6, 2024, from https://kotlinlang.org/ 
Google Developers. (n.d.). Android developer documentation. Retrieved May 6, 2024, from https://developer.android.com/develop
Stack Overflow. (n.d.). Android. [Question and answer forum]. Retrieved May 6, 2024, from https://stackoverflow.com/questions/tagged/android
GitHub. (n.d.). Explore. Retrieved May 6, 2024, from https://github.com/ 

YouTube Link: 
https://youtu.be/k7rlHZ_hp9Q
