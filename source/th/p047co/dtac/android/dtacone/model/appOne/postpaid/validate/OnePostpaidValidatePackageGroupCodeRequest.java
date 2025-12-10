package th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeRequest;", "", "packageGroupType", "", "packageGroupCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "hardwareNumber", "userCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHardwareNumber", "()Ljava/lang/String;", "getPackageGroupCode", "getPackageGroupType", "getSubscriberNumber", "getUserCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidatePackageGroupCodeRequest */
/* loaded from: classes8.dex */
public final class OnePostpaidValidatePackageGroupCodeRequest {
    public static final int $stable = 0;
    @SerializedName("hardwareNumber")
    @Nullable
    private final String hardwareNumber;
    @SerializedName("packageGroupCode")
    @Nullable
    private final String packageGroupCode;
    @SerializedName("packageGroupType")
    @Nullable
    private final String packageGroupType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;

    public OnePostpaidValidatePackageGroupCodeRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OnePostpaidValidatePackageGroupCodeRequest copy$default(OnePostpaidValidatePackageGroupCodeRequest onePostpaidValidatePackageGroupCodeRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostpaidValidatePackageGroupCodeRequest.packageGroupType;
        }
        if ((i & 2) != 0) {
            str2 = onePostpaidValidatePackageGroupCodeRequest.packageGroupCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePostpaidValidatePackageGroupCodeRequest.subscriberNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePostpaidValidatePackageGroupCodeRequest.hardwareNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = onePostpaidValidatePackageGroupCodeRequest.userCode;
        }
        return onePostpaidValidatePackageGroupCodeRequest.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.packageGroupType;
    }

    @Nullable
    public final String component2() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component4() {
        return this.hardwareNumber;
    }

    @Nullable
    public final String component5() {
        return this.userCode;
    }

    @NotNull
    public final OnePostpaidValidatePackageGroupCodeRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new OnePostpaidValidatePackageGroupCodeRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidValidatePackageGroupCodeRequest) {
            OnePostpaidValidatePackageGroupCodeRequest onePostpaidValidatePackageGroupCodeRequest = (OnePostpaidValidatePackageGroupCodeRequest) obj;
            return Intrinsics.areEqual(this.packageGroupType, onePostpaidValidatePackageGroupCodeRequest.packageGroupType) && Intrinsics.areEqual(this.packageGroupCode, onePostpaidValidatePackageGroupCodeRequest.packageGroupCode) && Intrinsics.areEqual(this.subscriberNumber, onePostpaidValidatePackageGroupCodeRequest.subscriberNumber) && Intrinsics.areEqual(this.hardwareNumber, onePostpaidValidatePackageGroupCodeRequest.hardwareNumber) && Intrinsics.areEqual(this.userCode, onePostpaidValidatePackageGroupCodeRequest.userCode);
        }
        return false;
    }

    @Nullable
    public final String getHardwareNumber() {
        return this.hardwareNumber;
    }

    @Nullable
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String getPackageGroupType() {
        return this.packageGroupType;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        String str = this.packageGroupType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageGroupCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscriberNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hardwareNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userCode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupType;
        String str2 = this.packageGroupCode;
        String str3 = this.subscriberNumber;
        String str4 = this.hardwareNumber;
        String str5 = this.userCode;
        return "OnePostpaidValidatePackageGroupCodeRequest(packageGroupType=" + str + ", packageGroupCode=" + str2 + ", subscriberNumber=" + str3 + ", hardwareNumber=" + str4 + ", userCode=" + str5 + ")";
    }

    public OnePostpaidValidatePackageGroupCodeRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.packageGroupType = str;
        this.packageGroupCode = str2;
        this.subscriberNumber = str3;
        this.hardwareNumber = str4;
        this.userCode = str5;
    }

    public /* synthetic */ OnePostpaidValidatePackageGroupCodeRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
