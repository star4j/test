package com.example.test;

import lombok.Data;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "friend")
@Data
@Accessors(chain = true)
public class Friend {

    @MongoId
    private ObjectId id;
}
