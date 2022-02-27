package korben.user;

import korben.Photo;
import korben.provider.Provider;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection="users")
public class User {

    @Id
    private String id;
    private int age_filter_max;
    private int age_filter_min;
    private int distance_mi;
    private String birth_date;
    private LocalDateTime create_date;
    private boolean discoverable;
    private short distance_filter;
    private Gender gender;
    private int gender_filter;
    private int[] interested_in;
    private String custom_gender;
    private String name;
    private Position pos;
    private PositionInfo pos_info;
    private String bio;
    private String city;
    private boolean snow_gender_on_profile;
    private Photo photos;

    public User(int age_filter_max, int age_filter_min, int distance_mi, String birth_date, LocalDateTime create_date, boolean discoverable, short distance_filter, Gender gender, int gender_filter, int[] interested_in, String custom_gender, String name, Position pos, PositionInfo pos_info, String bio, String city, boolean snow_gender_on_profile, Photo photos) {
        this.age_filter_max = age_filter_max;
        this.age_filter_min = age_filter_min;
        this.distance_mi = distance_mi;
        this.birth_date = birth_date;
        this.create_date = create_date;
        this.discoverable = discoverable;
        this.distance_filter = distance_filter;
        this.gender = gender;
        this.gender_filter = gender_filter;
        this.interested_in = interested_in;
        this.custom_gender = custom_gender;
        this.name = name;
        this.pos = pos;
        this.pos_info = pos_info;
        this.bio = bio;
        this.city = city;
        this.snow_gender_on_profile = snow_gender_on_profile;
        this.photos = photos;
    }


}

