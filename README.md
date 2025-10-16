👋 Introduction
Welcome to the GitHub repository for Pet Health & Wellness Tracker!

This is my mobile application development project for the CP3406 / CP5307 subject. The app is built using Kotlin and Jetpack Compose.

The goal of this application is to serve as a simple, all-in-one personal assistant for pet owners, helping them track their pets' health, manage appointments, and remember crucial tasks like vaccinations and walks.





✨ Core Features (Proposed Features)
The app is built around the following key functionalities, which address the problem of owners forgetting pet care tasks:



Pet Profiles & Health Logs: Users can create profiles for their pets, tracking essential data like weight and viewing their medical history.


Reminders and Schedule: Features a dedicated Calendar to display upcoming tasks, including vet appointments, vaccinations, and daily exercise.





Data Synchronization: Ensures critical data is always available by fetching fresh information from an external API (Network Connectivity) and storing it locally (Room Database).



Dashboard View: A clean Dashboard screen provides a quick overview of pet statistics and current health status.


🛠️ Technical Implementation Details (App Architecture)
This project strictly follows modern Android Architecture best practices and incorporates the required Advanced APIs.


1. Architecture

Jetpack Compose & Material Design: The entire user interface is constructed using Jetpack Compose, ensuring a clean, responsive, and user-friendly experience that adheres to Material Design principles.


App Structure: We employ the MVVM (Model-View-ViewModel) approach with a Repository Pattern to ensure excellent separation of concerns.

ViewModels: Manage UI-related data and lifecycle.

Repository Pattern: Acts as the single source of truth, abstracting data access from the UI.


Dependency Injection (DI): Simple dependency provision (via a custom AppContainer/Factory) is used to manage and provide singleton instances of the Repository and DAOs, supporting modular and maintainable code.

2. Advanced APIs
   The following APIs are integrated to fulfill the assignment requirements:


Room Database: Used for local, persistent storage of the Pet profiles, health logs, and task data.


Network Connectivity (Retrofit): Configured to connect to an external API (e.g., fetching general pet status or care tips) to provide novel features.


Data Syncing: The Repository implements an Offline-First strategy where the UI observes data from Room, and a refreshData() function handles fetching network data, converting it, and saving it to the local database for proper synchronization.

3. Navigation

Jetpack Compose Navigation: Used to manage all screen transitions, supporting smooth navigation between the top-level screens (Dashboard, Calendar, Profile).


Argument Passing: The navigation graph is set up to safely pass data, such as a petId, to the PetDetailScreen.

🚀 Getting Started
To clone and run the application in Android Studio:

Clone this repository: git clone [Your Repository URL]

Open the project in Android Studio and wait for Gradle synchronization.

Ensure you have the latest Android SDK and Kotlin plugin installed.

Run the app on an emulator or a physical Android device.

📝 Version Control & Development Progress
This project's development is documented on GitHub using Git.


Commit History: I am committed to making regular and descriptive commits (at least a few times each week) to clearly track development progress.

Branching: [Optional: Mention if you plan to use feature branches, e.g., "Feature development, such as the reminder-feature, will be conducted on separate branches before merging into the main branch."]