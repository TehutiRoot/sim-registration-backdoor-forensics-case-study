package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegistrationValidateMobileResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus", "setStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationValidateMobileResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegistrationValidateMobileResponse {
    public static final int $stable = 8;
    @SerializedName("message")
    @NotNull
    private String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private String status;

    public OneOnlineRegistrationValidateMobileResponse(@NotNull String status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        this.status = status;
        this.message = message;
    }

    public static /* synthetic */ OneOnlineRegistrationValidateMobileResponse copy$default(OneOnlineRegistrationValidateMobileResponse oneOnlineRegistrationValidateMobileResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOnlineRegistrationValidateMobileResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = oneOnlineRegistrationValidateMobileResponse.message;
        }
        return oneOnlineRegistrationValidateMobileResponse.copy(str, str2);
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
    public final OneOnlineRegistrationValidateMobileResponse copy(@NotNull String status, @NotNull String message) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        return new OneOnlineRegistrationValidateMobileResponse(status, message);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegistrationValidateMobileResponse) {
            OneOnlineRegistrationValidateMobileResponse oneOnlineRegistrationValidateMobileResponse = (OneOnlineRegistrationValidateMobileResponse) obj;
            return Intrinsics.areEqual(this.status, oneOnlineRegistrationValidateMobileResponse.status) && Intrinsics.areEqual(this.message, oneOnlineRegistrationValidateMobileResponse.message);
        }
        return false;
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
        return (this.status.hashCode() * 31) + this.message.hashCode();
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
        return "OneOnlineRegistrationValidateMobileResponse(status=" + str + ", message=" + str2 + ")";
    }
}
