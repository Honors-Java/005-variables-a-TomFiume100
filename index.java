int color = 1;
int color2 = 3;
int color3 = 5;
int color =  color2 + 100;
int color2 = color3 + 150;
int color3 = color - 200;
int sizeX = 75;
int sizeY = 400;
int diamenter = 75;

void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

  background(255);
  stroke(0);
  fill(color,color2,color3);
  ellipse(sizeX , sizeX , diamenter , diamenter);
  ellipse(sizeX , sizeY , diamenter , diamenter);
  ellipse(sizeY , sizeX , diamenter , diamenter);
  ellipse(sizeY , sizeY , diamenter , diamenter);



  
 
}