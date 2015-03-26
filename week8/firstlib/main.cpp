//
//  main.cpp
//  firstlib
//
//  Created by david swift on 26/03/2015.
//  Copyright (c) 2015 david swift. All rights reserved.
//

#include <iostream>
#include "firstlib.h"

int main(int argc, const char * argv[]) {
    // insert code here...
    std::cout << "Hello, how many days would like to check the weather for?\n";
    
    int days;
    std::cin >> days;
    std::weatherForecast(days);
    
    return 0;
}
