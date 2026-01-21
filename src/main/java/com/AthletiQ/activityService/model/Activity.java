package com.AthletiQ.activityService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Map;


@Data
@Document(collection="Activity")
@Builder //Generate the patter to make the object
@AllArgsConstructor
@NoArgsConstructor
public class Activity {
    private String id;
    private String userId;
    private ActivityType activityType;
    private Integer Duration;
    private Integer CaloriesBurned;
    private LocalDateTime localDateTime;
    @Field("Metrics")
    private Map<String,Object>AdditionalInfo;
    @CreatedDate //Automatically inserted when new record is inserted
    private LocalDateTime createdAt;
    @LastModifiedDate  //Automatically inserted when update happen
    private LocalDateTime updatedAt;
}
//1:30 00