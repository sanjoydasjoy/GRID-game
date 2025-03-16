# Grid Game

A JavaFX-based interactive grid game with multiple scenes and strategic gameplay elements.

## Project Structure

```
├── src/
│   └── application/
│       ├── Core Game Files
│       │   ├── Main.java                 # Application entry point and JavaFX initialization
│       │   ├── Grid.java                 # Core game logic and grid mechanics
│       │   ├── GridBuild.java            # Grid construction and game state management
│       │   └── SceneController.java      # Scene transition and UI event handling
│       │
│       ├── FXML Layout Files
│       │   ├── first.fxml               # Welcome/Start screen layout
│       │   ├── sample.fxml              # Main game screen layout
│       │   ├── newscene.fxml            # Additional game scene layout
│       │   └── gameover.fxml            # Game over screen layout
│       │
│       ├── Styling
│       │   ├── application.css          # Main application styling
│       │   ├── first.css               # Welcome screen styling
│       │   ├── xtra.css                # Additional UI elements styling
│       │   └── gamover.css             # Game over screen styling
│       │
│       └── Assets
│           ├── gird.jpg                # Game grid background
│           ├── rr.png                  # Game sprite/element
│           ├── gamo.png                # Game over screen asset
│           └── peo.mp3                 # Background music/sound effects
│
└── build.fxbuild                       # JavaFX build configuration file
```

## Game Components

### Core Components
- **Main.java**: Initializes the JavaFX application and sets up the primary stage
- **Grid.java**: Implements the core game mechanics and grid-based gameplay logic
- **GridBuild.java**: Handles grid construction, cell management, and game state
- **SceneController.java**: Manages scene transitions and user interface interactions

### User Interface
- Multiple game scenes with dedicated FXML layouts for different game states
- Custom CSS styling for each scene ensuring a cohesive visual experience
- Responsive grid-based gameplay interface
- Interactive elements for user engagement

### Assets
- Custom images for game elements and backgrounds
- Audio files for enhanced gaming experience
- Carefully designed UI elements for better user experience

## Prerequisites

- Java Development Kit (JDK) 8 or later
  - If using JDK 8, JavaFX is included
  - If using JDK 11 or later, you'll need to install JavaFX separately
- JavaFX SDK (if using JDK 11+)

## Setup Instructions

### 1. Installing Java
- Download and install JDK from [Oracle's website](https://www.oracle.com/java/technologies/downloads/) or use OpenJDK
- Verify installation by running:
  ```bash
  java --version
  ```

### 2. Installing JavaFX (if using JDK 11+)
- Download JavaFX SDK from [Gluon's website](https://gluonhq.com/products/javafx/)
- Extract the downloaded ZIP file
- Set up the environment variable:
  ```bash
  # Windows
  set PATH_TO_FX="path\to\javafx-sdk\lib"
  
  ```

## Running the Game

### Method 1: Using Terminal

1. Create a bin directory for compiled files:
   ```bash
   mkdir bin
   ```

2. Compile the source files:
   ```bash
   # If using JDK 8
   javac -d bin src/application/*.java

   # If using JDK 11+
   javac --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml,javafx.media -d bin src/application/*.java
   ```

3. Run the game:
   ```bash
   # If using JDK 8
   java -cp bin application.Main

   # If using JDK 11+
   java --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml,javafx.media -cp bin application.Main
   ```

### Method 2: Using an IDE

1. Open the project in your preferred Java IDE (Eclipse, IntelliJ IDEA, or VS Code)
2. Configure the project as a JavaFX project
3. Set up the required JavaFX dependencies
4. Run `Main.java`

## Game Features

- Interactive grid-based gameplay
- Multiple game scenes
- Custom styling with CSS
- Background music support
- Score tracking
- Game over screen

## Troubleshooting

1. **Java not found**: Ensure Java is properly installed and added to your system's PATH
2. **JavaFX missing**: If using JDK 11+, make sure JavaFX is installed and PATH_TO_FX is correctly set
3. **Compilation errors**: Verify all source files are in the correct directory structure
4. **Runtime errors**: Check if all resource files (images, audio, FXML) are in the correct locations

## Additional Notes

- The game window resolution is set to 1385x750 pixels
- Audio features may be commented out in the current version
- The game includes multiple FXML scenes for different game states 
