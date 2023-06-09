package ru.otus.hotelsbooker.repository;

import ru.otus.hotelsbooker.model.Hotel;

import java.util.List;

public interface HotelRepository {
    List<Hotel> findAllByCityIgnoreCase(String name);
}
