// Andrew Kinney
// 8.19.2024
// Cracking the Coding Interview
// Chapter 1: Arrays and Strings
// Problem 1.2: reverse a null-terminated string

#include <iostream>

using namespace std;

void reverse(char* str) {

    // Obtain str size
    int size = 0;
    while (str[size] != '\0') {
        size++;
    }

    // Swap first and last elements to median
    int j = size - 1;
    for (int i = 0; i < size / 2; i++) {
        
        // Swap
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        j--;

        // Break before median
        if (j % 2 != 0 && i == size / 2 - 1) {
            break;
        }
    }
}

int main()
{
    // Create string to reverse 
    char str[] = "reverse this!!\0";
    cout << "Original string: " << str << endl;
    
    // Reverse it
    reverse(str);
    cout << "Reversed string: " << str << endl;
}