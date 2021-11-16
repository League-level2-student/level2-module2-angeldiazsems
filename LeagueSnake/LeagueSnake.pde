//*
// ***** SEGMENT CLASS *****
// This class will be used to represent each part of the moving snake.
//*
int x;
int y;
class Segment {

//Add x and y member variables. They will hold the corner location of each segment of the snake.


// Add a constructor with parameters to initialize each variable.

}

//*
// ***** GAME VARIABLES *****
// All the game variables that will be shared by the game methods are here
//*





//*
// ***** SETUP METHODS *****
// These methods are called at the start of the game.
//*

void setup() {
size(300,300);
}

void dropFood() {
  //Set the food in a new random location
    
}



//*
// ***** DRAW METHODS *****
// These methods are used to draw the snake and its food 
//*

void draw() {
  drawFood();
  drawSnake();
}

void drawFood() {
  //Draw the food
  fill(#F20707);
  ellipse(25,25,25,25);
}

void drawSnake() {
  //Draw the head of the snake followed by its tail
  fill(#25F207);
  square(40,100,20);
  rect(60,100,30,20);
}


//*
// ***** TAIL MANAGEMENT METHODS *****
// These methods make sure the tail is the correct length.
//*

void drawTail() {
  //Draw each segment of the tail 

}

void manageTail() {
  //After drawing the tail, add a new segment at the "start" of the tail and remove the one at the "end" 
  //This produces the illusion of the snake tail moving.
  
}

void checkTailCollision() {
  //If the snake crosses its own tail, shrink the tail back to one segment
  
}



//*
// ***** CONTROL METHODS *****
// These methods are used to change what is happening to the snake
//*

void keyPressed() {
  //Set the direction of the snake according to the arrow keys pressed
  
}

void move() {
  //Change the location of the Snake head based on the direction it is moving.
  
    /*
  switch(direction) {
  case UP:
    // move head up here 
    break;
  case DOWN:
    // move head down here 
    break;
  case LEFT:
   // figure it out 
    break;
  case RIGHT:
    // mystery code goes here 
    break;
  }
  */
}

void checkBoundaries() {
 //If the snake leaves the frame, make it reappear on the other side
 
}



void eat() {
  //When the snake eats the food, its tail should grow and more food appear

}
