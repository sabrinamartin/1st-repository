import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Flag extends Applet {
	
	final Color OLD_GLORY_RED = new Color(0xB22234);
	final Color OLD_GLORY_BLUE = new Color(0x3C3B6E);
	
	public void paint (Graphics g) {
		
		//height and width are the same as the width and height of the window
		double height = getHeight();
		double width = getWidth();
		
		double a; //width of the flag
		double b; //length of the flag
	
		//Sets the height and width of the actual flag according to the height and width
		//of the window as it changes
		if (width > 1.9*height) {
			a = height;
			b = 1.9*a; //a:b is 1:1.9
		} else {
			b = width;
			a = width/1.9;
		}
		
		setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, (int) b, (int) a); //creates white rectangle for the 1st layer of flag
		
		double l = a/13; //width of a stripe
		g.setColor(OLD_GLORY_RED);
		paint_red_stripes(g, a, b, l);
		
		double c = (a*7)/13; //width of Union
		double d = (0.76)*a; //length of Union
		g.setColor(OLD_GLORY_BLUE);
		g.fillRect(0, 0, (int) d, (int) c); //Creates the Union
		
		double e = (0.054)*a; //distance between top of flag and center of stars in first row
		double h = (0.063)*a; //distance between center of stars in adjacent columns
		double k = (0.0616)*a; //diameter of star
		
		paint_stars(g, a, e, h, k);
		
	}
	
	/**
	 * Paints the red stripes through a for loop. A red rectangle
	 * is painted every other line while y is less than a, the width of the flag. 
	 * @param g An instance of the Graphics class
	 * @param a The width of the flag
	 * @param b The height of the flag (determines length of stripe)
	 * @param l	The width of each stripe
	 */
	public void paint_red_stripes(Graphics g, double a, double b, double l) {
		g.setColor(OLD_GLORY_RED);
		for (double y = 0; y < a; y+=2*l) {
			g.fillRect(0, (int) y, (int) b, (int) l);
		}
	}
	
	/**
	 * Paints the stars through two for loops. The first one paints the rows with 6 stars each, 
	 * starting a new row when there is no longer space in the current row. The second loop
	 * accomplishes the same task, yet there are 5 stars per row. Each loop starts their new rows
	 * by skipping a row to make space for each other. In result, the rows of 6 and 5 stars alternate.
	 * This method also incorporates the draw_star method by passing it the coordinates (i, j) of the star 
	 * to be drawn.
	 * @param g An instance of the Graphics class
	 * @param a Width of the flag
	 * @param e Sets how far away from the edge of the flag the stars will be drawn
	 * @param h Interval on which the stars are drawn separate from each other
	 * @param k Diameter of star to be passed into draw_star() method
	 */
	public void paint_stars(Graphics g, double a, double e, double h, double k) {
		g.setColor(Color.WHITE);
		//6 Star Row
		//First star is drawn at (i, j) and then drawn at every other interval of h (change in x-value)
		//When a new row is started, the y-value increases by intervals of e
		for (double i = h; i < 12*h; i += 2*h) {
			for (double j = e; j < 10*e; j += 2*e) {
				draw_star(k, g, i, j);
			}
		}
		//5 Star Row
		//First star is drawn at (i, j) and then drawn at every other interval of h (change in x-value)
		//When a new row is started, the y-value increases by intervals of e
		for (double i = 2*h; i < 11*h; i += 2*h) {
			for (double j = 2*e; j < 9*e; j += 2*e) {
				draw_star(k, g, i, j);
			}
		}
	}
	
	/**
	 * This method completes the trigonometric calculations needed to draw each individual star. 
	 * It is a helper method for paint_stars().
	 * It also creates an array of x-values and an array of y-values which are the 10-points of 
	 * the star. When these arrays are used as arguments in the g.fillPolygon() method, it creates
	 * a filled shape, and in this case a star.
	 * @param k The diameter of each star
	 * @param g Instance of the Graphics class
	 * @param i The x-coordinate for the center of the star
	 * @param j The y-coordinate for the center of the star
	 */
	public void draw_star(double k, Graphics g, double i, double j) {
		//Necessary values to obtain coordinates of each point
		final double SIN18 = Math.sin(18*Math.PI/180);
		final double COS18 = Math.cos(18*Math.PI/180);
		final double SIN36 = Math.sin(36*Math.PI/180);
		final double COS36 = Math.cos(36*Math.PI/180);
		final double TAN36 = Math.tan(36*Math.PI/180);
		
		double s = ((TAN36) * (k/2*SIN18)); //half the side length of the pentagon inside the star
		double r = (Math.sqrt((k/2*SIN18)*(k/2*SIN18)+(s*s))); //radius of the pentagon inside star
		
		int []x_pts = {(int) (i-k/2*COS18),
				(int) (i-s),
				(int) (i), 
				(int) (i+s),
				(int) (i+k/2*COS18),
				(int) (i+r*COS18),
				(int) (i+k/2*SIN36),
				(int) (i),
				(int) (i-k/2*SIN36),
				(int) (i-r*COS18)};
		int []y_pts = {(int) (j-k/2*SIN18),
				(int) (j-k/2*SIN18),
				(int) (j-k/2),
				(int) (j-k/2*SIN18),
				(int) (j-k/2*SIN18),
				(int) (j+r*SIN18),
				(int) (j+k/2*COS36),
				(int) (j+r),
				(int) (j+k/2*COS36),
				(int) (j+r*SIN18)};
		g.fillPolygon(x_pts, y_pts, 10);
	}
	

}
