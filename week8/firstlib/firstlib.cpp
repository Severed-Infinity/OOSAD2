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
        if(0 < ndays && ndays < 3){
            int weather = (1 + (rand()%4));
            int temp;
            int rain;
            int windspeed;
            int direction;
            switch (weather) {
                case 1:
                    temp = (15 + (rand()% 35));
                    std::cout << "High in deg C " << temp << std::endl;
                    break;
                case 2:
                    temp = (-2 + (rand()% 14));
                    std::cout << "Low in deg C " << temp << std::endl;
                    break;
                case 3:
                    rain = (1 + (rand()%7));
                    std::cout << "Predicted Rainfall, " << rain << " inchs" << std::endl;
                    break;
                case 4:
                    windspeed = (1 + (rand()%80));
                    direction = (1 + (rand()%4));
                    std::cout << "Windspeed " << windspeed << " KPH"<< std::endl;
                    std::cout << "Wind-direction ";
                    switch (direction) {
                        case 1:
                            std::cout << " North" << std::endl;
                            break;
                        case 2:
                            std::cout << " West" << std::endl;
                            break;
                        case 3:
                            std::cout << " South" << std::endl;
                            break;
                        case 4:
                            std::cout << " East" << std::endl;
                            break;
                        default:
                            break;
                    }
                    
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