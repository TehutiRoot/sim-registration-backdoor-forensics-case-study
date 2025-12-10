package th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterValidateNumberResponse;", "", "message", "", NotificationCompat.CATEGORY_STATUS, "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/appOne/onlineRegister/response/OneOnlineRegisterValidateNumberResponse;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterValidateNumberResponse */
/* loaded from: classes8.dex */
public final class OneOnlineRegisterValidateNumberResponse {
    public static final int $stable = 0;
    @SerializedName("message")
    @Nullable
    private final String message;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final Integer status;

    public OneOnlineRegisterValidateNumberResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OneOnlineRegisterValidateNumberResponse copy$default(OneOnlineRegisterValidateNumberResponse oneOnlineRegisterValidateNumberResponse, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneOnlineRegisterValidateNumberResponse.message;
        }
        if ((i & 2) != 0) {
            num = oneOnlineRegisterValidateNumberResponse.status;
        }
        return oneOnlineRegisterValidateNumberResponse.copy(str, num);
    }

    @Nullable
    public final String component1() {
        return this.message;
    }

    @Nullable
    public final Integer component2() {
        return this.status;
    }

    @NotNull
    public final OneOnlineRegisterValidateNumberResponse copy(@Nullable String str, @Nullable Integer num) {
        return new OneOnlineRegisterValidateNumberResponse(str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOnlineRegisterValidateNumberResponse) {
            OneOnlineRegisterValidateNumberResponse oneOnlineRegisterValidateNumberResponse = (OneOnlineRegisterValidateNumberResponse) obj;
            return Intrinsics.areEqual(this.message, oneOnlineRegisterValidateNumberResponse.message) && Intrinsics.areEqual(this.status, oneOnlineRegisterValidateNumberResponse.status);
        }
        return false;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.message;
        Integer num = this.status;
        return "OneOnlineRegisterValidateNumberResponse(message=" + str + ", status=" + num + ")";
    }

    public OneOnlineRegisterValidateNumberResponse(@Nullable String str, @Nullable Integer num) {
        this.message = str;
        this.status = num;
    }

    public /* synthetic */ OneOnlineRegisterValidateNumberResponse(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
