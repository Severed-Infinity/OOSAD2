//
//  firstlib.cpp
//  firstlib
//
//  Created by david swift on 26/03/2015.
//  Copyright (c) 2015 david swift. All rights reserved.
//

#include "firstlib.h"
#include <iostream>
#include <stdlib.h>
#include <ctime>

void std::weatherForecast(int ndays){
    srand(time(NULL));
    try {
        if(0 < ndays && ndays < 4){
            int weather = ((rand()%4) + 1);
            int temp  = (rand()%35 + 15);
            int rain = (rand()%7 + 1);
            int windspeed = (rand()%80 + 1);
            int direction = (rand()%4 + 1);
            switch (weather) {
                case 1:
                    std::cout << "High in deg C " << temp << std::endl;
                    break;
                case 2:
                    temp = (rand()%14 -2);
                    std::cout << "Low in deg C " << temp << std::endl;
                    break;
                case 3:
                    std::cout << "Predicted Rainfall, " << rain << " inchs" << std::endl;
                    break;
                case 4:
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