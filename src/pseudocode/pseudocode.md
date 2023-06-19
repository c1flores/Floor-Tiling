# Floor Tiling Checkerboard Pattern Pseudocode

This document outlines the pseudocode for creating a checkerboard pattern of tiles on a floor.

<br  />

## Pseudocode


<br  />

### Initialize Variables

1. Set the `floorLength` to 20 units.
2. Set the `floorWidth` to 16 units.

<br  />


### Validate Floor Dimensions

3. Check if the floor dimensions are multiples of 4.
    - If not, display an error message "Floor dimensions must be multiples of 4" and exit the program.


<br  />

### Initialize the Tiles Array

4. Initialize a 2D array called `tiles` with dimensions `floorLength/4` by `floorWidth/4` to represent the floor. Each element represents a tile, with 'W' for white and 'B' for black.


<br  />

### Place the First Tile

5. Place the first tile in the northwest corner of the floor.
    - Set `tiles[0][0]` to 'B' to represent a black tile.


<br  />

### Fill the Tiles Array with Checkerboard Pattern

6. Loop through each element of the `tiles` array to fill it with alternating black and white tiles.
    - For each row `i` from 0 to number of rows in `tiles`:
        - For each column `j` from 0 to number of columns in `tiles[i]`:
            - If `i` is 0 and `j` is 0, skip this iteration because the first tile is already placed.
            - Determine the color of the tile based on the color of the previous tile.
                - If `j` is 0, set `previousTile` to the color of the tile directly above (`tiles[i - 1][0]`).
                - Otherwise, set `previousTile` to the color of the tile to the left (`tiles[i][j - 1]`).
            - If `previousTile` is 'B', set `tiles[i][j]` to 'W'.
            - Otherwise, set `tiles[i][j]` to 'B'.


<br  />

### Display the Tiled Floor

7. Display the `tiles` array to visualize the tiled floor.
    - For each row `i` in `tiles`:
        - For each column `j` in `tiles[i]`:
            - Print `tiles[i][j]` followed by a space.
        - Print a new line after each row to format the output.

