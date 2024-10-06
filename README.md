# RecursiveSierpinskiCarpet
This JavaFX program recursively draws a Sierpinski carpet fractal, using colored rectangles to create a visually striking pattern within a 729x729 pixel window.

## Overview

- **Application Structure**: The program extends the `Application` class from JavaFX, which is the entry point for JavaFX applications. The `main` method launches the application.
  
- **Stage and Scene**: In the `start` method, a `Pane` is created to hold the graphical elements. The `drawCarpet` method is called to initiate drawing the Sierpinski carpet starting from coordinates (0, 0) with an initial side length of 243 pixels. A `Scene` with dimensions 729x729 pixels is set up and displayed.

## Drawing the Sierpinski Carpet

### Recursive Method: `drawCarpet`

- **Parameters**:
  - `Pane root`: The container where rectangles will be drawn.
  - `int x`, `int y`: The coordinates for the top-left corner of the current rectangle.
  - `int side`: The length of the sides of the square to be drawn.

- **Base Case**: If `side < 1`, the method returns, stopping further drawing.

- **Rectangle Creation**: A rectangle is created at position `(x + side, y + side)` with dimensions equal to `side`. The color of the rectangle changes based on its size:
  - **Orange** for side 81
  - **Blue** for side 27
  - **Yellow** for side 9
  - **Green** for side 3
  - **Red** for side 1

- **Recursive Calls**: The method makes eight recursive calls to draw smaller squares (each with a side length of one-third of the current square) in a specific pattern that forms the Sierpinski carpet.

### Visual Representation

The Sierpinski carpet is constructed by recursively removing squares from a larger square. Each level of recursion divides the current square into nine smaller squares and removes the center square, creating a fractal pattern.



