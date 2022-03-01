package korben.user;

import com.mongodb.lang.Nullable;

import korben.positionInfos.models.PositionInfo;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document(collection="users")
public class User {

    @Id
    private String id;

    @NonNull
    private int age_filter_max;

    @NonNull
    private int age_filter_min;

    @NonNull
    private LocalDateTime birth_date;

    @NonNull
    private LocalDateTime create_date;

    @NonNull
    private boolean discoverable;

    @NonNull
    private short distance_filter;

    @NonNull
    private String gender;

    @NonNull
    private String[] interested_in;

    @Nullable
    private String custom_gender;

    @NonNull
    private String name;

    @NonNull
    private Point pos;

    @NonNull
    private PositionInfo pos_info;

    @NonNull
    private String bio;

    @NonNull
    private String city;

    @NonNull
    private boolean snow_gender_on_profile;

    public User(int age_filter_max, int age_filter_min, LocalDateTime birth_date, LocalDateTime create_date, boolean discoverable, short distance_filter, String gender, String[] interested_in, String custom_gender, String name, Point pos, PositionInfo pos_info, String bio, String city, boolean snow_gender_on_profile) {
        this.age_filter_max = age_filter_max;
        this.age_filter_min = age_filter_min;
        this.birth_date = birth_date;
        this.create_date = create_date;
        this.discoverable = discoverable;
        this.distance_filter = distance_filter;
        this.gender = gender;
        this.interested_in = interested_in;
        this.custom_gender = custom_gender;
        this.name = name;
        this.pos = pos;
        this.pos_info = pos_info;
        this.bio = bio;
        this.city = city;
        this.snow_gender_on_profile = snow_gender_on_profile;
    }
}

