# SampleGithubApp README

SampleGithubApp is a Jetpack Compose application that interacts with GitHub APIs to search for users, repositories, and find repositories of users. It follows the MVVM (Model-View-ViewModel) architecture pattern with repositories, use cases, UI State, and UI events. Using Hilt for dependency injection


## Table of Contents

1. [Introduction](#introduction)
2. [Architecture Overview](#architecture-overview)
3. [Key Components](#key-components)
    - [Repositories](#repositories)
    - [Use Cases (Interactors)](#use-cases-interactors)
    - [ViewModel](#viewmodel)
    - [UI State](#ui-state)
    - [UI Events](#ui-events)
4. [Project Structure](#project-structure)
5. [Setup and Dependencies](#setup-and-dependencies)
6. [Usage and Development](#usage-and-development)
7. [Testing](#testing)
8. [Deployment](#deployment)
9. [Troubleshooting](#troubleshooting)
10. [Contributing](#contributing)
11. [License](#license)

---

## 1. Introduction

This Jetpack Compose application follows the MVVM architecture pattern, which separates concerns into Model (data), View (UI), and ViewModel (business logic and UI state management). It leverages repositories to handle data operations, use cases to encapsulate business logic, and manages UI state and events to provide a responsive and efficient user interface.

## 2. Architecture Overview

### MVVM Architecture

MVVM stands for Model-View-ViewModel:
- **Model**: Represents the data and business logic.
- **View**: Renders the UI and delegates user interactions to the ViewModel.
- **ViewModel**: Acts as an intermediary between the Model and the View, managing UI-related logic and state.

### Flow of Data
- **Repositories**: Handle data operations (e.g., fetching from APIs, local databases).
- **Use Cases (Interactors)**: Contain business logic, orchestrate data operations, and prepare data for presentation.
- **ViewModel**: Maintains UI-related data and communicates with repositories and use cases.
- **UI State**: Represents the current state of the UI, observable by the View.
- **UI Events**: Triggered by user interactions, processed by the ViewModel to update UI State.

## 3. Key Components

### Repositories

Repositories abstract the data sources (e.g., remote API, local database) and provide a clean API for the rest of the application to interact with. They manage data retrieval and caching strategies.

### Use Cases (Interactors)

Use cases encapsulate business logic and define operations that can be performed in the application. They utilize repositories to fetch data, apply business rules, and prepare data for presentation.

### ViewModel

ViewModels manage UI-related data and state across configuration changes (e.g., device rotation). They observe changes in data and propagate state updates to the UI via observable properties.

### UI State

UI State represents the current state of the UI elements (e.g., loading, data available, error). It is managed by the ViewModel and observed by the UI components to update their appearance and behavior accordingly.

### UI Events

UI Events are triggered by user interactions (e.g., button clicks, text input). They are handled by the ViewModel to perform corresponding actions, such as fetching data or navigating to another screen.

## 4. Project Structure

- **`app/`**: Contains the main application code.
    - **`src/`**: Source files for different components.
        - **`main/`**: Main source code.
            - **`java/com/example/samplegithubapp/`**: Java/Kotlin codebase.
                - **`data/`**: Data layer.
                - **`di/`**: Dependency Injection Module.
                - **`domain/`**: Domain layer (use cases, models).
                - **`presentation/`**: UI layer (Compose UI, ViewModels).
        - **`test/`**: Unit tests.
        - **`androidTest/`**: Instrumented tests.

## 5. Setup and Dependencies

- Ensure JDK, Android Studio, and the necessary Android SDK are installed.
- Configure dependencies in `build.gradle` files for Jetpack Compose, ViewModel, LiveData, Hilt (optional), etc.
- Set up repositories for third-party libraries (e.g., Retrofit for networking, Room for local database).

## 6. Usage and Development

- Clone the repository and open the project in Android Studio.
- Ensure that gradle builds successfully, you might need to invalidate cache for a fresh build if it doesn't
- Run Application

## 7. Testing

- Run Unit test ViewModelUseCaseTest to test all the core business logic of the application



