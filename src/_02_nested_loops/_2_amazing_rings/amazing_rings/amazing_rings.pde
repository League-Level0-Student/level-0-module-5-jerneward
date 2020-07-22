
void setup() {

  size(500, 450);
}
int x1 = 150;
int x2 = 350;
void draw() {
  
  // Go to the recipe to run the demonstration before starting this program
  background(#DEDEDE);
  for (int i = 40; i > 0; i --) { 
    if (i%2 == 0) {
      fill(#DEDEDE);
    } else {
      fill(#030000);
    }
    ellipse(x1, 200, i*5, i*5);
  }
   for (int i = 40; i > 0; i --) { 
    if (i%2 == 0) {
      fill(#DEDEDE);
    } else {
      fill(#030000);
    }
    ellipse(x2, 200, i*5, i*5);
  }
  x1 ++ ;
  if(x1 == 500){
    x1 = 0;
  }   
  x2 --;
  if(x2 == 0){
    x2 = 500;
  }
}
/*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
 You can use the noFill() command to make your ellipses transparent.
 Make the rings move past each other.
 When the rings hit the side of the sketch, make them reverse their direction.
 */
