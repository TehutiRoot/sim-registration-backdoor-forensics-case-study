package th.p047co.dtac.android.dtacone.model.appOne.pre2post.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGenAppFormDataResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "reportId", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getReportId", "()Ljava/lang/String;", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGenAppFormDataResponse;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostGenAppFormDataResponse */
/* loaded from: classes8.dex */
public final class OnePre2PostGenAppFormDataResponse {
    public static final int $stable = 0;
    @SerializedName("reportId")
    @Nullable
    private final String reportId;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final Boolean status;

    public OnePre2PostGenAppFormDataResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OnePre2PostGenAppFormDataResponse copy$default(OnePre2PostGenAppFormDataResponse onePre2PostGenAppFormDataResponse, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = onePre2PostGenAppFormDataResponse.status;
        }
        if ((i & 2) != 0) {
            str = onePre2PostGenAppFormDataResponse.reportId;
        }
        return onePre2PostGenAppFormDataResponse.copy(bool, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.status;
    }

    @Nullable
    public final String component2() {
        return this.reportId;
    }

    @NotNull
    public final OnePre2PostGenAppFormDataResponse copy(@Nullable Boolean bool, @Nullable String str) {
        return new OnePre2PostGenAppFormDataResponse(bool, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostGenAppFormDataResponse) {
            OnePre2PostGenAppFormDataResponse onePre2PostGenAppFormDataResponse = (OnePre2PostGenAppFormDataResponse) obj;
            return Intrinsics.areEqual(this.status, onePre2PostGenAppFormDataResponse.status) && Intrinsics.areEqual(this.reportId, onePre2PostGenAppFormDataResponse.reportId);
        }
        return false;
    }

    @Nullable
    public final String getReportId() {
        return this.reportId;
    }

    @Nullable
    public final Boolean getStatus() {
        return this.status;
    }

    public int hashCode() {
        Boolean bool = this.status;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.reportId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.status;
        String str = this.reportId;
        return "OnePre2PostGenAppFormDataResponse(status=" + bool + ", reportId=" + str + ")";
    }

    public OnePre2PostGenAppFormDataResponse(@Nullable Boolean bool, @Nullable String str) {
        this.status = bool;
        this.reportId = str;
    }

    public /* synthetic */ OnePre2PostGenAppFormDataResponse(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str);
    }
}
