//
//  firstlib.cpp
//  firstlib
//
//  Created by david swift on 26/03/2015.
//  Copyright (c) 2015 david swift. All rights reserved.
//

#include "firstlib.h"
#include <iostream>

void std::weatherForecast(int ndays){
    try {
        if(1 < ndays && ndays < 3){
            int weather = (1 + (rand()%5));
            switch (weather) {
                case 1:
                    std::cout << "High in deg C" << std::endl;
                    break;
                case 2:
                    std::cout << "Low in deg C" << std::endl;
                    break;
                case 3:
                    std::cout << "Predicted Rainfall" << std::endl;
                    break;
                case 4:
                    std::cout << "Windspeed" << std::endl;
                    break;
                case 5:
                    std::cout << "Wind-direction" << std::endl;
                    break;
                default:
                    break;
            }
            
        } else {
            throw ndays;
        }
    } catch (int ndays) {
        std::cout << ndays << " days is out of range" << std::endl;
    }
    
}