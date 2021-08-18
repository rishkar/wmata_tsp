package main.java.wmata_tsp;

import java.util.ArrayList;

public class WmataTsp {
    class Station {
        String name;
        boolean transfer_station; //Can we split off at this point?
        int used_counter; //How many times have we hit this station?
        ArrayList<Station> connected_stations;

        Station(String name, ArrayList<Station> connected_stations, boolean transfer_station) {
            // I shouldn't be modifying the original objects so I don't feel *too* horrible about doing this.
            this.name = name;
            this.connected_stations = connected_stations;
            this.transfer_station = transfer_station;
            this.used_counter = 0;
        }

        //Overloaded constructor with a default transfer_station value cause I'm lazy
        Station(String name, ArrayList<Station> connected_stations) {
            // I shouldn't be modifying the original objects so I don't feel *too* horrible about doing this.
            this.name = name;
            this.connected_stations = connected_stations;
            this.transfer_station = false;
            this.used_counter = 0;
        }

    }
}
