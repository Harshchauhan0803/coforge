package com.coforge.config;



import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Survey;

@Configuration

public class AppConfig {
@Bean
 public Survey getSurvey() {

 Survey survey=new Survey();

 survey.setSurveyId(1);

 survey.setSurveyDate(LocalDate.of(2011, 12, 12));

 survey.setSurveyName("Education Survey");

 return survey;

 }

}











