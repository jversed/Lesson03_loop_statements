# Lesson03_loop_statements
Loops and some tasks from Abramyan

--------------------------------------------------------

Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly while some condition evaluates to true.
Java provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.

## 1. while loop: ##
A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement.

      Syntax:
      
                          while (boolean condition)
                          {
                             loop statements...
                            }


  Flowchart:
    
  ![alt text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/Loop1.png)
    
► While loop starts with the checking of condition. If it evaluated to true, then the loop body statements are executed otherwise first statement following the loop is executed. For this reason it is also called Entry control loop.
    
► Once the condition is evaluated to true, the statements in the loop body are executed. Normally the statements contain an update value for the variable being processed for the next iteration.

► When the condition becomes false, the loop terminates which marks the end of its life cycle.

        // Java program to illustrate while loop
        class whileLoopDemo
        {
            public static void main(String args[])
            {
                int x = 1;

                // Exit when x becomes greater than 4
                while (x <= 4)
                {
                    System.out.println("Value of x:" + x);

                    // Increment the value of x for
                    // next iteration
                    x++;
                }
            }
        }
        
Output:

          Value of x:1
          Value of x:2
          Value of x:3
          Value of x:4
          
## 2. for loop ##
for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.
Syntax:

              for (initialization condition; testing condition; 
                                            increment/decrement)
              {
                  statement(s)
              }
Flowchart:

![alt text](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/loop2.png)

► Initialization condition:
Here, we initialize the variable in use. It marks the start of a for loop. An already declared variable can be used or a variable can be declared, local to loop only.

► Testing Condition: 
It is used for testing the exit condition for a loop. It must return a boolean value. It is also an Entry Control Loop as the condition is checked prior to the execution of the loop statements.

► Statement execution: 
Once the condition is evaluated to true, the statements in the loop body are executed.

► Increment/ Decrement: 
It is used for updating the variable for next iteration.

► Loop termination:
When the condition becomes false, the loop terminates marking the end of its life cycle.

      // Java program to illustrate for loop.
      class forLoopDemo
      {
          public static void main(String args[])
          {
              // for loop begins when x=2
              // and runs till x <=4
              for (int x = 2; x <= 4; x++)
                  System.out.println("Value of x:" + x);
          }
      }

Output:

      Value of x:2
      Value of x:3
      Value of x:4

