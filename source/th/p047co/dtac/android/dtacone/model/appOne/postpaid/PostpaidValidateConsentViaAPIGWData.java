package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;", "", "consentFlag", "", "consentTMN", "existingCustomer", "customerScreening", "", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getConsentFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getConsentTMN", "getCustomerScreening", "()Ljava/lang/String;", "getExistingCustomer", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.PostpaidValidateConsentViaAPIGWData */
/* loaded from: classes8.dex */
public final class PostpaidValidateConsentViaAPIGWData {
    public static final int $stable = 0;
    @SerializedName("consentFlag")
    @Nullable
    private final Boolean consentFlag;
    @SerializedName("consentTMN")
    @Nullable
    private final Boolean consentTMN;
    @SerializedName("customerScreening")
    @Nullable
    private final String customerScreening;
    @SerializedName("existingCustomer")
    @Nullable
    private final Boolean existingCustomer;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public PostpaidValidateConsentViaAPIGWData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PostpaidValidateConsentViaAPIGWData copy$default(PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = postpaidValidateConsentViaAPIGWData.consentFlag;
        }
        if ((i & 2) != 0) {
            bool2 = postpaidValidateConsentViaAPIGWData.consentTMN;
        }
        Boolean bool4 = bool2;
        if ((i & 4) != 0) {
            bool3 = postpaidValidateConsentViaAPIGWData.existingCustomer;
        }
        Boolean bool5 = bool3;
        if ((i & 8) != 0) {
            str = postpaidValidateConsentViaAPIGWData.customerScreening;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = postpaidValidateConsentViaAPIGWData.status;
        }
        return postpaidValidateConsentViaAPIGWData.copy(bool, bool4, bool5, str3, str2);
    }

    @Nullable
    public final Boolean component1() {
        return this.consentFlag;
    }

    @Nullable
    public final Boolean component2() {
        return this.consentTMN;
    }

    @Nullable
    public final Boolean component3() {
        return this.existingCustomer;
    }

    @Nullable
    public final String component4() {
        return this.customerScreening;
    }

    @Nullable
    public final String component5() {
        return this.status;
    }

    @NotNull
    public final PostpaidValidateConsentViaAPIGWData copy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable String str2) {
        return new PostpaidValidateConsentViaAPIGWData(bool, bool2, bool3, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostpaidValidateConsentViaAPIGWData) {
            PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData = (PostpaidValidateConsentViaAPIGWData) obj;
            return Intrinsics.areEqual(this.consentFlag, postpaidValidateConsentViaAPIGWData.consentFlag) && Intrinsics.areEqual(this.consentTMN, postpaidValidateConsentViaAPIGWData.consentTMN) && Intrinsics.areEqual(this.existingCustomer, postpaidValidateConsentViaAPIGWData.existingCustomer) && Intrinsics.areEqual(this.customerScreening, postpaidValidateConsentViaAPIGWData.customerScreening) && Intrinsics.areEqual(this.status, postpaidValidateConsentViaAPIGWData.status);
        }
        return false;
    }

    @Nullable
    public final Boolean getConsentFlag() {
        return this.consentFlag;
    }

    @Nullable
    public final Boolean getConsentTMN() {
        return this.consentTMN;
    }

    @Nullable
    public final String getCustomerScreening() {
        return this.customerScreening;
    }

    @Nullable
    public final Boolean getExistingCustomer() {
        return this.existingCustomer;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Boolean bool = this.consentFlag;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.consentTMN;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.existingCustomer;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.customerScreening;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.consentFlag;
        Boolean bool2 = this.consentTMN;
        Boolean bool3 = this.existingCustomer;
        String str = this.customerScreening;
        String str2 = this.status;
        return "PostpaidValidateConsentViaAPIGWData(consentFlag=" + bool + ", consentTMN=" + bool2 + ", existingCustomer=" + bool3 + ", customerScreening=" + str + ", status=" + str2 + ")";
    }

    public PostpaidValidateConsentViaAPIGWData(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable String str2) {
        this.consentFlag = bool;
        this.consentTMN = bool2;
        this.existingCustomer = bool3;
        this.customerScreening = str;
        this.status = str2;
    }

    public /* synthetic */ PostpaidValidateConsentViaAPIGWData(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
