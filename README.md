# Selection

The concept of *selection* is the idea that you can evaluate a certain condition and depending on the outcome execute different instructions. 

The scope of the GCSE course covers so-called `if`-statements, including 
* pure `if`-statements, which evaluate one condition and "if" it evaluates to the Boolean `True`, a block of code is executed, otherwise this code is simply skipped. 
* `if-else`-statements, which evaluate one condition and execute one block of code if the condition evaluates to the Boolean `True` and execute another if it evaluates to the Boolean `False`
* `if-elseif-else`-statements, which evaluate a condition and execute a given block of code if this evaluates to `True`, but then continue to evaluate conditions until one is either `True` or until an `else` statement is found. 

The A-Level also requires you to understand these and have an ability to apply these flexibly, however also introduces another kind of  structure for selection. 

`switch`-statements compare the value of a given expression to a series of given values and specify given behaviour for each possible `case`, including a `default` behaviour. Examples of this in pseudocode as well as real programming languages may be found in the lesson slides and other teaching materials. 

## Tasks

### Boolean Operators

1) Edit the file `src/booleanoperators1.py` to replace `None` in the `print` statements with the Boolean values that result from the Boolean expressions in the comments above them.
2) Complete the `if`-statement in `src/booleanoperators2.py` to check for the exclusive or of the variables `bool1` and `bool2`. That is, the program should print `XOR!` when exactly one of the two given inputs is `True`.

### `if`-Statements
1) In the file `src/if1.py`, write a program that accepts two integers from the user and outputs `The first number is larger!` if the first input was larger than the second, `The numbers were equally big!` if they were equally big and `The second number was larger!` if the second number was larger.
2) In the file `src/if2.py`, write a program that asks the user for their age and outputs which of the following things the user would be allowed to do in the United States of America:
    - Take a driving exam
    - Vote in federal elections
    - Buy and consume alcoholic beverages

   If the user would be too young to do any of these, output `You can't do anything in America!`
3) In the file `src/if3.py`, write a program that
    - asks the user for three numbers between 0 and 180
    - outputs `A triangle could have these angles.` if it is possible that a tringle would have these angles and otherwise outputs `No triangle could have these angles.`. 

    *Hint: Recall that the sum of angles within a triangle must be 180 degrees.*
4) In the file `src\if4.py`, write a program that 
    - asks the user for three numbers, `a`, `b` and `c`
    - determines the roots of the polynomial 
      
      $$f(x) = ax^2 + bx + c$$
      
      and outputs 
        - `There are no real roots.` if this is the case,
        - `There is one real root at ` followed by the value of $x$ at which the function has a root or
        - `There are two real roots at (...) and (...)` where `(...)` should be replaced by the values of $x$ at which the function has roots. (Smaller $x$ first!) 

      *Hint: Recall the quadratic formula:*
      
      $$f(x) = 0 \implies x = \frac{-b \pm\sqrt{b^2-4ac}}{2a}$$ 
      
      *which can be used to determine the roots of a quadratic, if they exist.*
5) In the file `src/if5.py`, write a program that asks the user for their name, tells the user how many letters there are in their name and then says
    - `That is a short name.` if the name is at most four letters long.
    - `That is a common length for a name.` if the name is between 5 and 7 letters long. 
    - `That is a long name.` if the name is at least 8 letters long.

### `switch`-Statements
These tasks require you to *read* code in Java and replace Strings with other Strings, but you do not need to write any extensive code. This is because Python does not have `switch` statements yet you need to be aware of them for the exam!

1) Look at the file `src/Switch1.java`. It contains a switch statement the behaviour of which depends on two variables, `x` and `y`. In the file `src/switch1.py`, complete the first five print statements to describe which letters are printed depending on the values of `x` and `y` an complete the last three print statements with Booleans to answer whether the given statements are true or false, respectively.
2) Look at the file `src/Switch2.java`. It contains a switch statement which is used to answer the question "How many days does a given month of the year have?". Fill in the cases so that the program would work in 2022! 

   *Ignore the file `src/Switch2Test.java`, it just serves the purpose of running the automated tests for this task.* 