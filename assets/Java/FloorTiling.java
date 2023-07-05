package src.assets.java;

public class FloorTiling {

    public static void main(String[] args) {
        int floorLength = 20; // For example, 20 inches
        int floorWidth = 16; // For example, 16 inches
        
        // Make sure that the dimensions are multiples of 4
        if (floorLength % 4 != 0 || floorWidth % 4 != 0) {
            System.out.println("Floor dimensions must be multiples of 4");
            return;
        }
        
        // Tiles array representing the floor, 'W' for white and 'B' for black
        char[][] tiles = new char[floorLength / 4][floorWidth / 4];
        
        // Place the first tile in the northwest corner
        tiles[0][0] = 'B'; // starting with a black tile
        
        // Fill the tiles array
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                // If it's the first tile, it's already placed
                if (i == 0 && j == 0) continue;
                
                // Determine the color of the tile
                char previousTile;
                if (j == 0) {
                    previousTile = tiles[i - 1][0];
                } else {
                    previousTile = tiles[i][j - 1];
                }
                
                tiles[i][j] = (previousTile == 'B') ? 'W' : 'B';
            }
        }
        
        // Display the tiled floor
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                System.out.print(tiles[i][j] + " ");
            }
            System.out.println();
        }
    }
}
