package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterCreateRetailerProfileResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "message", "", "rtrCode", "clusterCode", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClusterCode", "()Ljava/lang/String;", "getMessage", "getRtrCode", "getStatus", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterCreateRetailerProfileResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegisterCreateRetailerProfileResponse {
    public static final int $stable = 0;
    @SerializedName("clusterCode")
    @NotNull
    private final String clusterCode;
    @SerializedName("message")
    @NotNull
    private final String message;
    @SerializedName("rtrCode")
    @NotNull
    private final String rtrCode;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final int status;

    public OneOnlineRegisterCreateRetailerProfileResponse(int i, @NotNull String message, @NotNull String rtrCode, @NotNull String clusterCode) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(clusterCode, "clusterCode");
        this.status = i;
        this.message = message;
        this.rtrCode = rtrCode;
        this.clusterCode = clusterCode;
    }

    public static /* synthetic */ OneOnlineRegisterCreateRetailerProfileResponse copy$default(OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oneOnlineRegisterCreateRetailerProfileResponse.status;
        }
        if ((i2 & 2) != 0) {
            str = oneOnlineRegisterCreateRetailerProfileResponse.message;
        }
        if ((i2 & 4) != 0) {
            str2 = oneOnlineRegisterCreateRetailerProfileResponse.rtrCode;
        }
        if ((i2 & 8) != 0) {
            str3 = oneOnlineRegisterCreateRetailerProfileResponse.clusterCode;
        }
        return oneOnlineRegisterCreateRetailerProfileResponse.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final String component3() {
        return this.rtrCode;
    }

    @NotNull
    public final String component4() {
        return this.clusterCode;
    }

    @NotNull
    public final OneOnlineRegisterCreateRetailerProfileResponse copy(int i, @NotNull String message, @NotNull String rtrCode, @NotNull String clusterCode) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(clusterCode, "clusterCode");
        return new OneOnlineRegisterCreateRetailerProfileResponse(i, message, rtrCode, clusterCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegisterCreateRetailerProfileResponse) {
            OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse = (OneOnlineRegisterCreateRetailerProfileResponse) obj;
            return this.status == oneOnlineRegisterCreateRetailerProfileResponse.status && Intrinsics.areEqual(this.message, oneOnlineRegisterCreateRetailerProfileResponse.message) && Intrinsics.areEqual(this.rtrCode, oneOnlineRegisterCreateRetailerProfileResponse.rtrCode) && Intrinsics.areEqual(this.clusterCode, oneOnlineRegisterCreateRetailerProfileResponse.clusterCode);
        }
        return false;
    }

    @NotNull
    public final String getClusterCode() {
        return this.clusterCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status * 31) + this.message.hashCode()) * 31) + this.rtrCode.hashCode()) * 31) + this.clusterCode.hashCode();
    }

    @NotNull
    public String toString() {
        int i = this.status;
        String str = this.message;
        String str2 = this.rtrCode;
        String str3 = this.clusterCode;
        return "OneOnlineRegisterCreateRetailerProfileResponse(status=" + i + ", message=" + str + ", rtrCode=" + str2 + ", clusterCode=" + str3 + ")";
    }
}
