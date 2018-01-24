import java.awt.*;
import java.util.*;

public class SandLab
{
  public static void main(String[] args)
  {
    SandLab lab = new SandLab(120, 80);
    lab.run();
  }
  
  //add constants for particle types here
  public static final int EMPTY = 0;
  public static final int METAL = 1;
  public static final int SAND = 2;
  public static final Color[] COLORS = {Color.BLACK, Color.GRAY, Color.YELLOW};
  
  //do not add any more fields
  private int[][] grid;
  private SandDisplay display;
  
  public SandLab(int numRows, int numCols)
  {
    String[] names;
    names = new String[3];
    names[EMPTY] = "Empty";
    names[METAL] = "Metal";
    names[SAND] = "Sand";
    display = new SandDisplay("Falling Sand", numRows, numCols, names);
    grid = new int[numRows][numCols];
  }
  
  //called when the user clicks on a location using the given tool
  private void locationClicked(int row, int col, int tool)
  {	
	 grid[row][col] = tool;
  }

  //copies each element of grid into the display
  public void updateDisplay()
  {
	  for (int i = 0; i < grid.length; i++) {
		  for (int k = 0; k < grid[i].length; k++) {
			  Color c = COLORS[grid[i][k]];
			  display.setColor(i, k, c);
		  }
	  }
  }

  //called repeatedly.
  //causes one random particle to maybe do something.
  public void step()
  {
	  int width = grid[0].length;
	  int height = grid.length;
	  int rand_y = (int)(Math.random()*height);
	  int rand_x = (int)(Math.random()*width);
	  if (rand_y < (height - 1)) {
		  if (grid[rand_y][rand_x] == SAND && grid[rand_y + 1][rand_x] == EMPTY) {
			  grid[rand_y][rand_x] = EMPTY;
			  grid[rand_y + 1][rand_x] = SAND;
		  }
	  } else {
		  
	  }
  }
  
  //do not modify
  public void run()
  {
    while (true)
    {
      for (int i = 0; i < display.getSpeed(); i++)
        step();
      updateDisplay();
      display.repaint();
      display.pause(1);  //wait for redrawing and for mouse
      int[] mouseLoc = display.getMouseLocation();
      if (mouseLoc != null)  //test if mouse clicked
        locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
    }
  }
}
