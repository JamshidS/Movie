package com.movie.movieservice.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_preferences")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "preference_id")
    private Preference preference;


}
