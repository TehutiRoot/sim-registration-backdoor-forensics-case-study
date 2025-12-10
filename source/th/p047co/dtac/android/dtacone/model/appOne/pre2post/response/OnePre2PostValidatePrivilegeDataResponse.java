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
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePrivilegeDataResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "aging", "campaignCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAging", "()Ljava/lang/String;", "getCampaignCode", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidatePrivilegeDataResponse */
/* loaded from: classes8.dex */
public final class OnePre2PostValidatePrivilegeDataResponse {
    public static final int $stable = 0;
    @SerializedName("aging")
    @Nullable
    private final String aging;
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public OnePre2PostValidatePrivilegeDataResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OnePre2PostValidatePrivilegeDataResponse copy$default(OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostValidatePrivilegeDataResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostValidatePrivilegeDataResponse.aging;
        }
        if ((i & 4) != 0) {
            str3 = onePre2PostValidatePrivilegeDataResponse.campaignCode;
        }
        return onePre2PostValidatePrivilegeDataResponse.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.status;
    }

    @Nullable
    public final String component2() {
        return this.aging;
    }

    @Nullable
    public final String component3() {
        return this.campaignCode;
    }

    @NotNull
    public final OnePre2PostValidatePrivilegeDataResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new OnePre2PostValidatePrivilegeDataResponse(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostValidatePrivilegeDataResponse) {
            OnePre2PostValidatePrivilegeDataResponse onePre2PostValidatePrivilegeDataResponse = (OnePre2PostValidatePrivilegeDataResponse) obj;
            return Intrinsics.areEqual(this.status, onePre2PostValidatePrivilegeDataResponse.status) && Intrinsics.areEqual(this.aging, onePre2PostValidatePrivilegeDataResponse.aging) && Intrinsics.areEqual(this.campaignCode, onePre2PostValidatePrivilegeDataResponse.campaignCode);
        }
        return false;
    }

    @Nullable
    public final String getAging() {
        return this.aging;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aging;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignCode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.aging;
        String str3 = this.campaignCode;
        return "OnePre2PostValidatePrivilegeDataResponse(status=" + str + ", aging=" + str2 + ", campaignCode=" + str3 + ")";
    }

    public OnePre2PostValidatePrivilegeDataResponse(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.status = str;
        this.aging = str2;
        this.campaignCode = str3;
    }

    public /* synthetic */ OnePre2PostValidatePrivilegeDataResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
