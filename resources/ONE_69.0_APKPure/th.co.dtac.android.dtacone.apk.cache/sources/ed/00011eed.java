package th.p047co.dtac.android.dtacone.model.mrtr_online_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/CheckRSEResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "message", "DTRCode", "DTRID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDTRCode", "()Ljava/lang/String;", "setDTRCode", "(Ljava/lang/String;)V", "getDTRID", "setDTRID", "getMessage", "setMessage", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.CheckRSEResponse */
/* loaded from: classes8.dex */
public final class CheckRSEResponse {
    public static final int $stable = 8;
    @SerializedName("DTRCode")
    @NotNull
    private String DTRCode;
    @SerializedName("DTRID")
    @NotNull
    private String DTRID;
    @SerializedName("message")
    @NotNull
    private String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private String status;

    public CheckRSEResponse(@NotNull String status, @NotNull String message, @NotNull String DTRCode, @NotNull String DTRID) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(DTRCode, "DTRCode");
        Intrinsics.checkNotNullParameter(DTRID, "DTRID");
        this.status = status;
        this.message = message;
        this.DTRCode = DTRCode;
        this.DTRID = DTRID;
    }

    public static /* synthetic */ CheckRSEResponse copy$default(CheckRSEResponse checkRSEResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkRSEResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = checkRSEResponse.message;
        }
        if ((i & 4) != 0) {
            str3 = checkRSEResponse.DTRCode;
        }
        if ((i & 8) != 0) {
            str4 = checkRSEResponse.DTRID;
        }
        return checkRSEResponse.copy(str, str2, str3, str4);
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
        return this.DTRCode;
    }

    @NotNull
    public final String component4() {
        return this.DTRID;
    }

    @NotNull
    public final CheckRSEResponse copy(@NotNull String status, @NotNull String message, @NotNull String DTRCode, @NotNull String DTRID) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(DTRCode, "DTRCode");
        Intrinsics.checkNotNullParameter(DTRID, "DTRID");
        return new CheckRSEResponse(status, message, DTRCode, DTRID);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckRSEResponse) {
            CheckRSEResponse checkRSEResponse = (CheckRSEResponse) obj;
            return Intrinsics.areEqual(this.status, checkRSEResponse.status) && Intrinsics.areEqual(this.message, checkRSEResponse.message) && Intrinsics.areEqual(this.DTRCode, checkRSEResponse.DTRCode) && Intrinsics.areEqual(this.DTRID, checkRSEResponse.DTRID);
        }
        return false;
    }

    @NotNull
    public final String getDTRCode() {
        return this.DTRCode;
    }

    @NotNull
    public final String getDTRID() {
        return this.DTRID;
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
        return (((((this.status.hashCode() * 31) + this.message.hashCode()) * 31) + this.DTRCode.hashCode()) * 31) + this.DTRID.hashCode();
    }

    public final void setDTRCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.DTRCode = str;
    }

    public final void setDTRID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.DTRID = str;
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
        String str3 = this.DTRCode;
        String str4 = this.DTRID;
        return "CheckRSEResponse(status=" + str + ", message=" + str2 + ", DTRCode=" + str3 + ", DTRID=" + str4 + ")";
    }
}