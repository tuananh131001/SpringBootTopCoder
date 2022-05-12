package com.example.demo.train;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column( length=10485760)
    private String description;

    @JsonProperty("distance-between-stop")
    private String distanceBetweenStop;

    @JsonProperty("max-speed")
    private String maxSpeed;

    @JsonProperty("sharing-tracks")
    private String sharingTracks;

    @JsonProperty("grade-crossing")
    private String gradeCrossing;

    @JsonProperty("train-frequency")
    private String trainFrequency;

    private String amenities;

    public Train() {
    }
}
