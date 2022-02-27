package korben;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Photo {

    @Id
    private String id;
    private String extension;
    private String fileName;
    private MediaType media_type;
    private List<File> processedFiles;
    private String url;

    public Photo(String extension, String fileName, MediaType media_type, List<File> processedFiles, String url) {
        this.extension = extension;
        this.fileName = fileName;
        this.media_type = media_type;
        this.processedFiles = processedFiles;
        this.url = url;
    }
}

