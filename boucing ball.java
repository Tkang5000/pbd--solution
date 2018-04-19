import java.util.Random;
Random r = new Random();
int balls = 1+r.nextInt(10);
float x;   // declare globally
float xSpeed;
float y;
float ySpeed;
float gravity = 0.1;

void setup() {
  size(400, 400);
  x = 30;          // initialize in setup
  xSpeed = 3 ;
  y= 50;
  ySpeed = 2 + gravity;
}

void draw() {
  ySpeed = ySpeed + gravity;
  x += xSpeed;
  y+= ySpeed;// update variable
  
  // x boundary check
  if (x >= 375) {
    xSpeed = -xSpeed;
  } else if (x <= 25) {
    xSpeed = -xSpeed;
  }
  
   if (y+25 >= height) {
    ySpeed = -ySpeed;
  } else if (y-25 <= 0) {
    ySpeed = -ySpeed;
  }
  
  
  background(#23395B);
  // draw ball
  noStroke();
  fill(#FFFD98);
  ellipse(x, y, 50, 50);     // use variable to draw
}
