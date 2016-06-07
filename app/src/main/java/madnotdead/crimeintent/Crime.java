package madnotdead.crimeintent;

import java.util.UUID;

/**
 * Created by thecocacolauser on 6/7/16.
 */
public class Crime {

    private UUID mId;
    private String title;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
