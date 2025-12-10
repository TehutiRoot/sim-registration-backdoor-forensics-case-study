package th.p047co.dtac.android.dtacone.model;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import org.apache.http.cookie.ClientCookie;

/* renamed from: th.co.dtac.android.dtacone.model.ServerVersionCollection */
/* loaded from: classes8.dex */
public class ServerVersionCollection {
    @SerializedName(ImagesContract.URL)
    private String url;
    @SerializedName(ClientCookie.VERSION_ATTR)
    private String version;

    public ServerVersionCollection(String str, String str2) {
        this.version = str;
        this.url = str2;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }
}