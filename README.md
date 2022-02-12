# Assessment

This is my solution to designing a fan in Java with two pull cords. 
To use this class, instaniate it with new Fan(). 
Please note that a compiled .class file is provided for use as well.

### Public methods are as follows:

* pullLeftCord():  This method allows the user to increase the speed of the fan.  Possible speeds are OFF, ONE, TWO, THREE. Upon reaching a speed of 3, the call to the method will turn the fun to an off state.  Each pull increases the speed by one.
* pullRightCord(): This method allows the user to change the direction of the fan.  Possible directions are, FORWARD or REVERSE.  Each call to this method will switch the direction from one to the other, not affecting fan speed.
* getDirection(): This method returns a Direction enum of the current instantiated objects direction.
* getSpeed(): This method returns a Speed enum of the current instantiated objects speed.
* toString(): Calling this method provides a clean String representation of the instantiated fan object.

