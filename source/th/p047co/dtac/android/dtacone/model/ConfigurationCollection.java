package th.p047co.dtac.android.dtacone.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/ConfigurationCollection;", "", ClientCookie.VERSION_ATTR, "", ImagesContract.URL, "", "(ILjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getVersion", "()I", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.ConfigurationCollection */
/* loaded from: classes8.dex */
public final class ConfigurationCollection {
    public static final int $stable = 0;
    @SerializedName(ImagesContract.URL)
    @Nullable
    private final String url;
    @SerializedName(ClientCookie.VERSION_ATTR)
    private final int version;

    public ConfigurationCollection(int i, @Nullable String str) {
        this.version = i;
        this.url = str;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ ConfigurationCollection(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str);
    }
}
