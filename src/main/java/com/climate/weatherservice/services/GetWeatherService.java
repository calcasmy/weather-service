package com.climate.weatherservice.services;

import com.climate.weatherservice.entities.Today;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Date;

@Service
public class GetWeatherService {

    private final String WEATHER_API_URL = "https://api.weatherapi.com/";
    private final String API_KEY = "2479c2188b1046dc993232431233107";
    private final String API_LANG_LONG = "6.0753,116.5588";

    private final WebClient webClient;

    @Autowired
    public GetWeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl
                        (WEATHER_API_URL)
                .build();
    }

    public String makeApiCall() {
        return webClient
                .get()
//                .uri("/v1/forecast.json?key="+ API_KEY +"&q="+ API_LANG_LONG +"&days=1&aqi=no&alerts=no") // Replace with your API endpoint path
//                .uri("/v1/forecast.json?key={API_KEY}&q={API_LANG_LONG}&days=1&aqi=no&alerts=no", API_KEY, API_LANG_LONG) // Replace with your API endpoint path
                .uri("/v1/forecast.json?key=2479c2188b1046dc993232431233107&q=6.0753,116.5588&days=1&aqi=no&alerts=no")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
//
//package com.climate.weatherservice.services;
//
//        import com.climate.weatherservice.entities.Today;
////import com.climate.weatherservice.utilities.SecureUtil;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.beans.factory.annotation.Value;
//        import org.springframework.boot.context.properties.ConfigurationProperties;
//        import org.springframework.context.annotation.Configuration;
//        import org.springframework.context.annotation.PropertySource;
//        import org.springframework.core.env.Environment;
//        import org.springframework.stereotype.Component;
//        import org.springframework.stereotype.Service;
//        import org.springframework.web.reactive.function.client.WebClient;
//
//        import java.util.Date;
//
//@Service
//public class WeatherService {
//
////    private final WeatherDAO weatherDAO;
////
////    @Autowired
////    private SecureUtil secureUtil = new SecureUtil();
//////    @Value("${api.WEATHER_API_URL}")
////     String WEATHER_API_URL = secureUtil.getWEATHER_API_URL();
//////    @Value("${api.WEATHERA_API_KEY}")
////     String WEATHER_API_KEY = secureUtil.getWEATHER_API_KEY();
//////    @Value("${api.WEATHER_API_LAT_LONG}")
////     String WEATHER_API_LAT_LONG = secureUtil.getWEATHER_API_LAT_LONG();
//
//    @Autowired
//    Environment environment;
//
////    private String WEATHER_API_URL = environment.getProperty("api.WEATHER_API_URL");
////    private String WEATHER_API_KEY = environment.getProperty("api.WEATHERA_API_KEY");
////    private String WEATHER_API_LAT_LONG = environment.getProperty("api.WEATHER_API_LAT_LONG");
////
//
//    private final String WEATHER_API_URL = "https://api.weatherapi.com/";
////    private final String WEATHER_API_KEY = "2479c2188b1046dc993232431233107";
////    private final String WEATHER_API_LAT_LONG = "6.0753,116.5588";
//
//    //    public String apiURI = "/v1/forecast.json?key=%s&q=%s&days=1&aqi=no&alerts=no".formatted(WEATHER_API_KEY, WEATHER_API_LAT_LONG);
//    private final WebClient webClient;
//
//    @Autowired
//    public WeatherService(WebClient.Builder webClientBuilder) {
//        this.webClient = webClientBuilder.baseUrl
//                        (WEATHER_API_URL)
//                .build();
//    }
//
//    public Date getDate() {
//        Date date = new Date();
//        return date;
//    }
//
//    public Today getWeather() {
//        String todayWeather = "";
//        Today today = new Today();
//        try {
//            todayWeather = makeApiCall();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        today.setDate(getDate());
//        today.setLocation("Kinabalu");
//        today.setRawdata(todayWeather);
//        return today;
//    }
//
//    public String makeApiCall() {
//        return webClient
//                .get()
//                .uri("/v1/forecast.json?key=%s&q=%s&days=1&aqi=no&alerts=no".formatted(environment.getProperty("api.WEATHERA_API_KEY"), environment.getProperty("api.WEATHER_API_LAT_LONG"))) // Replace with your API endpoint path
////                .uri("/v1/forecast.json?key={WEATHER_API_KEY}&q={WEATHER_API_LAT_LONG}&days=1&aqi=no&alerts=no", WEATHER_API_KEY, WEATHER_API_LAT_LONG) // Replace with your API endpoint path
////                .uri("/v1/forecast.json?key=2479c2188b1046dc993232431233107&q=6.0753,116.5588&days=1&aqi=no&alerts=no")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//    }
//
//
//}
