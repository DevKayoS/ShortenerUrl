package com.shortenerUrl;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UrlData {
    public String originalUrl;
    public long expirationTime;

    public UrlData(String originalUrl, long expirationTimeInSeconds) {
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTimeInSeconds;
    }
}
