#!/bin/bash
# Script to compile and run the ListExample class
# To Execute the command:
# > run projectName executableClass
# where projectName is the name of the GitHub repo and
# executableClass is the name of the class containing the
# main method.
# Note: Do not include the .class suffix on the name of
#       the executable class.

# 1. Compile all .java files in src folder
echo "Compiling Java files:"
javac -d ~/$1/out ~/$1/src/*.java

# 2. Execute the program
echo "Running the program ..."
java -cp ~/$1/out $2