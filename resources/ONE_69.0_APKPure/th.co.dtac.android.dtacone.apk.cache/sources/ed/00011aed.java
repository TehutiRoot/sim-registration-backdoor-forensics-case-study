package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateD1ProfileResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "message", "", "(ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterCreateD1ProfileResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegisterCreateD1ProfileResponse {
    public static final int $stable = 0;
    @SerializedName("message")
    @NotNull
    private final String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final int status;

    public OneOnlineRegisterCreateD1ProfileResponse(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = i;
        this.message = message;
    }

    public static /* synthetic */ OneOnlineRegisterCreateD1ProfileResponse copy$default(OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oneOnlineRegisterCreateD1ProfileResponse.status;
        }
        if ((i2 & 2) != 0) {
            str = oneOnlineRegisterCreateD1ProfileResponse.message;
        }
        return oneOnlineRegisterCreateD1ProfileResponse.copy(i, str);
    }

    public final int component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final OneOnlineRegisterCreateD1ProfileResponse copy(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new OneOnlineRegisterCreateD1ProfileResponse(i, message);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegisterCreateD1ProfileResponse) {
            OneOnlineRegisterCreateD1ProfileResponse oneOnlineRegisterCreateD1ProfileResponse = (OneOnlineRegisterCreateD1ProfileResponse) obj;
            return this.status == oneOnlineRegisterCreateD1ProfileResponse.status && Intrinsics.areEqual(this.message, oneOnlineRegisterCreateD1ProfileResponse.message);
        }
        return false;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status * 31) + this.message.hashCode();
    }

    @NotNull
    public String toString() {
        int i = this.status;
        String str = this.message;
        return "OneOnlineRegisterCreateD1ProfileResponse(status=" + i + ", message=" + str + ")";
    }
}