# Floor Tiling Checkerboard Pattern Pseudocode

This pseudocode outlines a script for creating a checkerboard pattern of tiles on a floor.

<br  />

## Objectives

- Create a checkerboard pattern of tiles on a floor
- Validate that the floor dimensions are multiples of 4
- Visualize the tiled floor through a 2D representation


<br  />

## Meta-Analysis of Approach

### Big Picture: Develop a script that assists users in creating a checkerboard pattern for floor tiling by validating the floor dimensions and properly arranging black and white tiles in a 2D array


<br  />

### Define a class for the Floor Tiling Checkerboard Pattern Utility

```
START:

CLASS FloorTilingCheckerboard
```

<br  />

### Define the main function to execute the utility

```
METHOD Main():

    // Initialize Variables
    SET floorLength to 20
    SET floorWidth to 16
    
    // Validate Floor Dimensions
    IF floorLength modulo 4 is not equal to 0 OR floorWidth modulo 4 is not equal to 0 THEN
        PRINT "Floor dimensions must be multiples of 4"
        EXIT PROGRAM
    
    // Initialize the Tiles Array
    SET tiles to a 2D array with dimensions floorLength/4 by floorWidth/4
    
    // Place the First Tile
    SET tiles[0][0] to 'B'
    
    // Fill the Tiles Array with Checkerboard Pattern
    FOR i from 0 to number of rows in tiles:
        FOR j from 0 to number of columns in tiles[i]:
            IF i is 0 AND j is 0 THEN
                CONTINUE // skip this iteration because the first tile is already placed
            
            // Determine the color of the previous tile
            IF j is 0 THEN
                SET previousTile to tiles[i - 1][0]
            ELSE
                SET previousTile to tiles[i][j - 1]
                
            // Determine the color of the current tile based on the color of the previous tile
            IF previousTile is 'B' THEN
                SET tiles[i][j] to 'W'
            ELSE
                SET tiles[i][j] to 'B'
    
    // Display the Tiled Floor
    FOR each row in tiles:
        FOR each column in row:
            PRINT column followed by a space
        PRINT a new line
```

<br  />

### Finalize the class definition

```
ENDCLASS

END
```

