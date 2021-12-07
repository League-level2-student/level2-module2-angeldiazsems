//*
// ***** SEGMENT CLASS *****
// This class will be used to represent each part of the moving snake.
//*

class Segment {
int x;
int y;
//Add x and y member variables. They will hold the corner location of each segment of the snake.


// Add a constructor with parameters to initialize each variable.
Segment(int x, int y){
this.x = x;  
this.y = y;
}

}

//*
// ***** GAME VARIABLES *****
// All the game variables that will be shared by the game methods are here
//*
int foodX;
int foodY;
Segment head;
int direction = UP;
int foodEaten = 0;
ArrayList<Segment> tail = new ArrayList<Segment>();


//*
// ***** SETUP METHODS *****
// These methods are called at the start of the game.
//*

void setup() {
size(500,500);
head = new Segment(100,100);
frameRate(20);
dropFood();
}

void dropFood() {
  //Set the food in a new random location
 foodX = (int)random(40)*10;
 foodY = (int)random(40)*10;
}



//*
// ***** DRAW METHODS *****
// These methods are used to draw the snake and its food 
//*

void draw() {
  background(#000000);
    drawFood();
    move();
    drawSnake();
    eat();
    text(""+foodEaten ,50,50);
}

void drawFood() {
  //Draw the food
  fill(#F20707);
  rect(foodX,foodY,10,10);
}

void drawSnake() {
  //Draw the head of the snake followed by its tail
  fill(#25F207);
  rect(head.x,head.y,10,10);
  manageTail();
}


//*
// ***** TAIL MANAGEMENT METHODS *****
// These methods make sure the tail is the correct length.
//*

void drawTail() {
  //Draw each segment of the tail 
  fill(#25F207);
for(Segment s : tail){
rect(s.x,s.y,10,10);
}
  
}

void manageTail() {
  //After drawing the tail, add a new segment at the "start" of the tail and remove the one at the "end" 
  //This produces the illusion of the snake tail moving.
  checkTailCollision();
  drawTail();
  tail.add(new Segment(head.x,head.y));
  tail.remove(0);
  
}

void checkTailCollision() {
  //If the snake crosses its own tail, shrink the tail back to one segment
 for(Segment tailSegment: tail){
  
  if(head.x == tailSegment.x && head.y == tailSegment.y){
 foodEaten = 1;
 tail.clear();
 tail.add(new Segment(head.x,head.y));
break;
}

 }
}



//*
// ***** CONTROL METHODS *****
// These methods are used to change what is happening to the snake
//*

void keyPressed() {
  //Set the direction of the snake according to the arrow keys pressed
if(keyCode == UP&& direction != DOWN){
  direction = UP;
}
if(keyCode == DOWN && direction != UP){
  direction = DOWN;
}
if(keyCode == LEFT && direction != RIGHT){
 direction = LEFT;
}
if(keyCode == RIGHT && direction != LEFT){
  direction = RIGHT;
}
}

void move() {
  //Change the location of the Snake head based on the direction it is moving.
  
    
  switch(direction) {
  case UP:
   head.y-=10;
    break;
  case DOWN:
  head.y+=10;
    break;
  case LEFT:
  head.x-=10;
    break;
  case RIGHT:
   head.x+=10;
    break;
  }
  checkBoundaries();
}

void checkBoundaries() {
 //If the snake leaves the frame, make it reappear on the other side
 if(head.x <= 0 && direction == LEFT){
 head.x = 490;
 }
 if(head.x >= 500 && direction== RIGHT){
   head.x = 10;
 }
 if(head.y <=0 && direction == UP){
 head.y = 490;
 }
 if(head.y >= 500 && direction == DOWN){
   head.y = 10;
 }
}



void eat() {
  //When the snake eats the food, its tail should grow and more food appear
if(head.x == foodX && head.y == foodY){
  foodEaten++;
  dropFood();
  tail.add(new Segment(head.x,head.y));
}


}
