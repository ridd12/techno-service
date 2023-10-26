package com.techno.technoservice.entity;

//import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@Data
@Document(collection = "users")
public class User {
    @MongoId
    String id;
    String email;
    String password;
}
