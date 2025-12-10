package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/MrtrPackageInfoRequest;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "customerNumber", "userCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "setCustomerNumber", "(Ljava/lang/String;)V", "getSubscriberNumber", "setSubscriberNumber", "getUserCode", "setUserCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.MrtrPackageInfoRequest */
/* loaded from: classes8.dex */
public final class MrtrPackageInfoRequest {
    public static final int $stable = 8;
    @SerializedName("customerNumber")
    @Nullable
    private String customerNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private String subscriberNumber;
    @SerializedName("userCode")
    @Nullable
    private String userCode;

    public MrtrPackageInfoRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MrtrPackageInfoRequest copy$default(MrtrPackageInfoRequest mrtrPackageInfoRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrtrPackageInfoRequest.subscriberNumber;
        }
        if ((i & 2) != 0) {
            str2 = mrtrPackageInfoRequest.customerNumber;
        }
        if ((i & 4) != 0) {
            str3 = mrtrPackageInfoRequest.userCode;
        }
        return mrtrPackageInfoRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component2() {
        return this.customerNumber;
    }

    @Nullable
    public final String component3() {
        return this.userCode;
    }

    @NotNull
    public final MrtrPackageInfoRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new MrtrPackageInfoRequest(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPackageInfoRequest) {
            MrtrPackageInfoRequest mrtrPackageInfoRequest = (MrtrPackageInfoRequest) obj;
            return Intrinsics.areEqual(this.subscriberNumber, mrtrPackageInfoRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, mrtrPackageInfoRequest.customerNumber) && Intrinsics.areEqual(this.userCode, mrtrPackageInfoRequest.userCode);
        }
        return false;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
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
        String str = this.subscriberNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userCode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCustomerNumber(@Nullable String str) {
        this.customerNumber = str;
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.subscriberNumber = str;
    }

    public final void setUserCode(@Nullable String str) {
        this.userCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        String str2 = this.customerNumber;
        String str3 = this.userCode;
        return "MrtrPackageInfoRequest(subscriberNumber=" + str + ", customerNumber=" + str2 + ", userCode=" + str3 + ")";
    }

    public MrtrPackageInfoRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.subscriberNumber = str;
        this.customerNumber = str2;
        this.userCode = str3;
    }

    public /* synthetic */ MrtrPackageInfoRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}