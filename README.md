# 🧠 AI Agent App in Java

A simple **Java console-based AI application** built using **Google’s Gemini API** through the official `google-adk` client library.
The project allows users to interact with Gemini models directly from the terminal using plain text input.

---

## 🚀 Overview

This application enables you to send queries to Google’s **Gemini 2.5 Flash** model and receive intelligent, AI-generated responses in real time.
It’s lightweight, runs entirely in your terminal, and serves as a great starting point for experimenting with **Google Generative AI** in Java.

---

## 🏗️ Project Structure

```
AIAgentTestingApp/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   ├── Main.java        ← Main program logic
│                   └── Keys.java        ← Contains your Google API key
│
├── pom.xml                              ← Maven configuration file
└── README.md                            ← Project documentation
```

---

## ⚙️ Prerequisites

Before you begin, make sure you have the following installed:

* **IntelliJ IDEA (Community or Ultimate)**
* **Java 21 or later (JDK 25 recommended)**
* **Maven 3.9+**
* A valid **Google API Key** (get it from [Google AI Studio](https://aistudio.google.com/app/apikey))

---

## 💻 Setup in IntelliJ IDEA

Follow these steps to open and run the project inside IntelliJ IDEA:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/infopkrajput/AI-Agent-App-In-Java.git
   ```

2. **Open the project in IntelliJ IDEA:**

    * Launch IntelliJ.
    * Choose **File → Open...**
    * Select the cloned `AI-Agent-App-In-Java` folder.

3. **Wait for Maven to import dependencies.**
   IntelliJ will automatically detect the `pom.xml` file and download all required libraries.

4. **Create the `Keys.java` file** (if not already present) inside
   `src/main/java/org/example/`:

   ```java
   package org.example;

   public class Keys {
       public static final String GOOGLE_API_KEY = "YOUR_API_KEY_HERE";
   }
   ```

5. **Run the application:**

    * Open `Main.java`.
    * Click the green ▶️ **Run** button near the `main` method.
    * The console will open, prompting:

      ```
      Enter your query (or type 'exit' to quit):
      ```

6. **Start chatting with Gemini!**

    * Type any question or prompt.
    * The model will respond directly in the terminal.
    * Type `exit` to quit.

---

## 💬 Example Usage

**Console session:**

```
Enter your query (or type 'exit' to quit): Write a haiku about Java
Golden code flows free,
Logic hums through crafted lines,
Java dreams awake.
```

## 💼 Connect With Me

I’m always open to collaborating, discussing programming concepts, or exploring new opportunities.
You can find me on LinkedIn:

[![LinkedIn Profile](https://img.shields.io/badge/LinkedIn-View%20Profile-blue?logo=linkedin)](https://www.linkedin.com/in/pknatic/)