USA Flag Project README

Introduction
-----------------------------------
This purpose of this java program is to display the American flag using
built-in graphics libraries and math mostly compromised of trigonometry.

Specifications
-----------------------------------
This program fulfills all of the requirements by successfully displaying the US 
flag with all of the correct ratios for each of the elements. When the applet
window is resized, the flag adjusts its proportions accordingly. The flag
also has the most accurate colors possible because the correct hex color codes
were used to replicate "Old Glory Red" and "Old Glory Blue".

Errors
-----------------------------------
Overall, the program lacks any errors worth noting.

Overview of Code
-----------------------------------
In the program, there are two classes. The Flag class extends the built-in 
Java Applet class. There is also a Main class which contains a JFrame. The bulk
of the code is in the Flag class. This classes' paint() method is what draws the 
flag. The Union and stripes are drawn with filled rectangles using g.fillRect() and 
the stars are drawn with filled stars - g.fillPolygon(). All of the different components 
are drawn in respect to the height of the flag. As the height changes, due to the 
resizing of the applet window, the shapes that make up the flag also change to keep 
the same proportions. The method that draws the stripes is the paint_red_stripes() method
through the use of a for loop. The stars are drawn in the draw_star() method which returns
the coordinates of the 10 points of the star in an x-value and y-value array. Then those 
arrays are passed into the paint_stars() method which designates the center of each star
and draws 50.

Major Challenges
-----------------------------------
Getting my feet off the ground for this project was definitely hard for me and I had to think 
for a while as to how I was going to execute the creation of this program. I had never 
created an Applet before and I had not worked with graphics very much in Java. After a little
bit of googling, I was able to create the applet pretty easily. Making the rectangles were also
a basic task but once the stars came along, I was stumped for a little bit. It helped me to draw
many diagrams of a 5-point star to figure out the trigonometry and the dimensions since I am a 
very visual person. After much trial and error, I was finally able to create a 5 point star
and after being able to draw one, the rest came more easily.

Acknowledgments
-----------------------------------
I would like to thank the vast amount of resources available on the internet that helped me 
complete this project such as the JavaDocs (docs.oracle.com) for looking-up built-in methods 
and stackoverflow.com for finding solutions to problems similar to mine. I would also like to 
thank my geometry and Alg2/Trig teachers for teaching me the necessary math to complete the program.
