package com.microservice.rating.RatingService.service;

import com.microservice.rating.RatingService.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating create(Rating rating);
    List<Rating> getRatings();
    List<Rating> getRatingUserId(String userId);
    List<Rating> getRatingByHotelId(String hotelId);

}
