package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.validate_existing_customer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/validate_existing_customer/MrtrPostpaidValidateCustomerRequest;", "", "identityType", "", "identityNumber", "userCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdentityNumber", "()Ljava/lang/String;", "getIdentityType", "getUserCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.validate_existing_customer.MrtrPostpaidValidateCustomerRequest */
/* loaded from: classes8.dex */
public final class MrtrPostpaidValidateCustomerRequest {
    public static final int $stable = 0;
    @SerializedName("identityNumber")
    @Nullable
    private final String identityNumber;
    @SerializedName("identityType")
    @Nullable
    private final String identityType;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;

    public MrtrPostpaidValidateCustomerRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MrtrPostpaidValidateCustomerRequest copy$default(MrtrPostpaidValidateCustomerRequest mrtrPostpaidValidateCustomerRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrtrPostpaidValidateCustomerRequest.identityType;
        }
        if ((i & 2) != 0) {
            str2 = mrtrPostpaidValidateCustomerRequest.identityNumber;
        }
        if ((i & 4) != 0) {
            str3 = mrtrPostpaidValidateCustomerRequest.userCode;
        }
        return mrtrPostpaidValidateCustomerRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.identityType;
    }

    @Nullable
    public final String component2() {
        return this.identityNumber;
    }

    @Nullable
    public final String component3() {
        return this.userCode;
    }

    @NotNull
    public final MrtrPostpaidValidateCustomerRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new MrtrPostpaidValidateCustomerRequest(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPostpaidValidateCustomerRequest) {
            MrtrPostpaidValidateCustomerRequest mrtrPostpaidValidateCustomerRequest = (MrtrPostpaidValidateCustomerRequest) obj;
            return Intrinsics.areEqual(this.identityType, mrtrPostpaidValidateCustomerRequest.identityType) && Intrinsics.areEqual(this.identityNumber, mrtrPostpaidValidateCustomerRequest.identityNumber) && Intrinsics.areEqual(this.userCode, mrtrPostpaidValidateCustomerRequest.userCode);
        }
        return false;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        String str = this.identityType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identityNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userCode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.identityType;
        String str2 = this.identityNumber;
        String str3 = this.userCode;
        return "MrtrPostpaidValidateCustomerRequest(identityType=" + str + ", identityNumber=" + str2 + ", userCode=" + str3 + ")";
    }

    public MrtrPostpaidValidateCustomerRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.identityType = str;
        this.identityNumber = str2;
        this.userCode = str3;
    }

    public /* synthetic */ MrtrPostpaidValidateCustomerRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}