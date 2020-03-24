package com.tts.MapsApp.Models;

import lombok.Data;

import java.util.List;

@Data
public class GeocodingResponse {
    private List<Geocoding> Results;
}
