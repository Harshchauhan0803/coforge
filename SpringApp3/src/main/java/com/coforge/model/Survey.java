package com.coforge.model;



import java.time.LocalDate;

import lombok.Data;

@Data

public class Survey {

 private long surveyId;

 private String surveyName;

 private LocalDate surveyDate;

}