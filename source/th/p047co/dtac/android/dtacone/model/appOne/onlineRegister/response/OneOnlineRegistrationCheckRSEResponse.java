package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationCheckRSEResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "message", "dtrCode", "dtrID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "setDtrCode", "(Ljava/lang/String;)V", "getDtrID", "setDtrID", "getMessage", "setMessage", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationCheckRSEResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegistrationCheckRSEResponse {
    public static final int $stable = 8;
    @SerializedName("DTRCode")
    @NotNull
    private String dtrCode;
    @SerializedName("DTRID")
    @NotNull
    private String dtrID;
    @SerializedName("message")
    @NotNull
    private String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private String status;

    public OneOnlineRegistrationCheckRSEResponse(@NotNull String status, @NotNull String message, @NotNull String dtrCode, @NotNull String dtrID) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dtrCode, "dtrCode");
        Intrinsics.checkNotNullParameter(dtrID, "dtrID");
        this.status = status;
        this.message = message;
        this.dtrCode = dtrCode;
        this.dtrID = dtrID;
    }

    public static /* synthetic */ OneOnlineRegistrationCheckRSEResponse copy$default(OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOnlineRegistrationCheckRSEResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = oneOnlineRegistrationCheckRSEResponse.message;
        }
        if ((i & 4) != 0) {
            str3 = oneOnlineRegistrationCheckRSEResponse.dtrCode;
        }
        if ((i & 8) != 0) {
            str4 = oneOnlineRegistrationCheckRSEResponse.dtrID;
        }
        return oneOnlineRegistrationCheckRSEResponse.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final String component3() {
        return this.dtrCode;
    }

    @NotNull
    public final String component4() {
        return this.dtrID;
    }

    @NotNull
    public final OneOnlineRegistrationCheckRSEResponse copy(@NotNull String status, @NotNull String message, @NotNull String dtrCode, @NotNull String dtrID) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(dtrCode, "dtrCode");
        Intrinsics.checkNotNullParameter(dtrID, "dtrID");
        return new OneOnlineRegistrationCheckRSEResponse(status, message, dtrCode, dtrID);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegistrationCheckRSEResponse) {
            OneOnlineRegistrationCheckRSEResponse oneOnlineRegistrationCheckRSEResponse = (OneOnlineRegistrationCheckRSEResponse) obj;
            return Intrinsics.areEqual(this.status, oneOnlineRegistrationCheckRSEResponse.status) && Intrinsics.areEqual(this.message, oneOnlineRegistrationCheckRSEResponse.message) && Intrinsics.areEqual(this.dtrCode, oneOnlineRegistrationCheckRSEResponse.dtrCode) && Intrinsics.areEqual(this.dtrID, oneOnlineRegistrationCheckRSEResponse.dtrID);
        }
        return false;
    }

    @NotNull
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @NotNull
    public final String getDtrID() {
        return this.dtrID;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.dtrCode.hashCode()) * 31) + this.dtrID.hashCode();
    }

    public final void setDtrCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dtrCode = str;
    }

    public final void setDtrID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dtrID = str;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.message;
        String str3 = this.dtrCode;
        String str4 = this.dtrID;
        return "OneOnlineRegistrationCheckRSEResponse(status=" + str + ", message=" + str2 + ", dtrCode=" + str3 + ", dtrID=" + str4 + ")";
    }
}
