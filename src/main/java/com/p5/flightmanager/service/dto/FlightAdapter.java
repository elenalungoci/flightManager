package com.p5.flightmanager.service.dto;

import com.p5.flightmanager.repository.models.Flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class FlightAdapter {

    public final static FlightDto toDto(Flight flight) {
        FlightDto flightDto = new FlightDto();
        flightDto.setId(flight.getId().toString());
        flightDto.setDepartureLocation(flight.getDepartureLocation());
        flightDto.setDestinationLocation(flight.getDestinationLocation());
        flightDto.setName(flight.getName());
        flightDto.setFullFlightDescription(flight.getDepartureLocation().concat("-").concat(flight.getDestinationLocation()));
        flightDto.setDurationTime(flight.getDurationTime());
        flightDto.setDepartureDate(flight.getDepartureDate());
        flightDto.setDestinationDate(flight.getDestinationDate());

        return flightDto;
    }

    public final static List<FlightDto> toListDto(Iterable<Flight> flightList){
        List<FlightDto> listDto = new ArrayList<>();
        flightList.forEach(flight -> listDto.add(toDto(flight)));

        return listDto;
    }

    public final static Flight fromDto(FlightDto flightDto){
        Flight flight = new Flight();
        //flight.setId(UUID.fromString(flightDto.getId().toString()));
        flight.setDepartureLocation(flightDto.getDepartureLocation());
        flight.setDestinationLocation(flightDto.getDestinationLocation());
        flight.setName(flightDto.getName());
        flight.setDepartureDate(flightDto.getDepartureDate());
        flight.setDestinationDate(flightDto.getDestinationDate());
        flight.setDurationTime(flightDto.getDurationTime());

        return flight;
    }
}
