package th.p047co.dtac.android.dtacone.model.mrtr_change_sim.submit.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_change_sim/submit/request/Profile;", "", "companyCode", "", "subscriberStatus", ConstsKt.TELEPHONE_TYPE, "customerNumber", "currentSIMCardNumber", "subscriberLastChangeDateTime", "groupCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCurrentSIMCardNumber", "getCustomerNumber", "getGroupCode", "getSubscriberLastChangeDateTime", "getSubscriberStatus", "getTelephoneType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_change_sim.submit.request.Profile */
/* loaded from: classes8.dex */
public final class Profile {
    public static final int $stable = 0;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("currentSIMCardNumber")
    @Nullable
    private final String currentSIMCardNumber;
    @SerializedName("customerNumber")
    @Nullable
    private final String customerNumber;
    @SerializedName("groupCode")
    @Nullable
    private final String groupCode;
    @SerializedName("subscriberLastChangeDateTime")
    @Nullable
    private final String subscriberLastChangeDateTime;
    @SerializedName("subscriberStatus")
    @Nullable
    private final String subscriberStatus;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @Nullable
    private final String telephoneType;

    public Profile() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.companyCode;
        }
        if ((i & 2) != 0) {
            str2 = profile.subscriberStatus;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = profile.telephoneType;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = profile.customerNumber;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = profile.currentSIMCardNumber;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = profile.subscriberLastChangeDateTime;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = profile.groupCode;
        }
        return profile.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.companyCode;
    }

    @Nullable
    public final String component2() {
        return this.subscriberStatus;
    }

    @Nullable
    public final String component3() {
        return this.telephoneType;
    }

    @Nullable
    public final String component4() {
        return this.customerNumber;
    }

    @Nullable
    public final String component5() {
        return this.currentSIMCardNumber;
    }

    @Nullable
    public final String component6() {
        return this.subscriberLastChangeDateTime;
    }

    @Nullable
    public final String component7() {
        return this.groupCode;
    }

    @NotNull
    public final Profile copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new Profile(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Profile) {
            Profile profile = (Profile) obj;
            return Intrinsics.areEqual(this.companyCode, profile.companyCode) && Intrinsics.areEqual(this.subscriberStatus, profile.subscriberStatus) && Intrinsics.areEqual(this.telephoneType, profile.telephoneType) && Intrinsics.areEqual(this.customerNumber, profile.customerNumber) && Intrinsics.areEqual(this.currentSIMCardNumber, profile.currentSIMCardNumber) && Intrinsics.areEqual(this.subscriberLastChangeDateTime, profile.subscriberLastChangeDateTime) && Intrinsics.areEqual(this.groupCode, profile.groupCode);
        }
        return false;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getCurrentSIMCardNumber() {
        return this.currentSIMCardNumber;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getGroupCode() {
        return this.groupCode;
    }

    @Nullable
    public final String getSubscriberLastChangeDateTime() {
        return this.subscriberLastChangeDateTime;
    }

    @Nullable
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    @Nullable
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    public int hashCode() {
        String str = this.companyCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriberStatus;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.telephoneType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currentSIMCardNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subscriberLastChangeDateTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.groupCode;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.subscriberStatus;
        String str3 = this.telephoneType;
        String str4 = this.customerNumber;
        String str5 = this.currentSIMCardNumber;
        String str6 = this.subscriberLastChangeDateTime;
        String str7 = this.groupCode;
        return "Profile(companyCode=" + str + ", subscriberStatus=" + str2 + ", telephoneType=" + str3 + ", customerNumber=" + str4 + ", currentSIMCardNumber=" + str5 + ", subscriberLastChangeDateTime=" + str6 + ", groupCode=" + str7 + ")";
    }

    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.companyCode = str;
        this.subscriberStatus = str2;
        this.telephoneType = str3;
        this.customerNumber = str4;
        this.currentSIMCardNumber = str5;
        this.subscriberLastChangeDateTime = str6;
        this.groupCode = str7;
    }

    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}