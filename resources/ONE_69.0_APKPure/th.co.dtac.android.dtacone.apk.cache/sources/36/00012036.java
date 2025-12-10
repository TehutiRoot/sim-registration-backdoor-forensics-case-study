package th.p047co.dtac.android.dtacone.model.rectify;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;

/* renamed from: th.co.dtac.android.dtacone.model.rectify.RectifyResponseCollection */
/* loaded from: classes8.dex */
public class RectifyResponseCollection {
    @SerializedName("message")
    private String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }
}