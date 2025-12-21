package com.example.demo.util;

public class ValidationUtil {

    private ValidationUtil() {
        // Prevent object creation
    }

    // Validate ID
    public static void validateId(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid ID provided");
        }
    }

    // Validate String
    public static void validateString(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }

    // Validate Double value
    public static void validateDouble(Double value, String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " cannot be null");
        }
    }

    // Validate Min & Max
    public static void validateRange(Double min, Double max) {
        if (min == null || max == null) {
            throw new IllegalArgumentException("Min and Max values cannot be null");
        }
        if (min > max) {
            throw new IllegalArgumentException("Min value cannot be greater than Max value");
        }
    }
}
