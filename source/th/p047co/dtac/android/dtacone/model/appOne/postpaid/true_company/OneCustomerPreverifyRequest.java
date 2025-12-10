package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyRequest;", "", "identityNumber", "", "identityType", "dtrCode", "flow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDtrCode", "()Ljava/lang/String;", "getFlow", "getIdentityNumber", "getIdentityType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCustomerPreverifyRequest */
/* loaded from: classes8.dex */
public final class OneCustomerPreverifyRequest {
    public static final int $stable = 0;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("flow")
    @Nullable
    private final String flow;
    @SerializedName("identityNumber")
    @Nullable
    private final String identityNumber;
    @SerializedName("identityType")
    @Nullable
    private final String identityType;

    public OneCustomerPreverifyRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OneCustomerPreverifyRequest copy$default(OneCustomerPreverifyRequest oneCustomerPreverifyRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCustomerPreverifyRequest.identityNumber;
        }
        if ((i & 2) != 0) {
            str2 = oneCustomerPreverifyRequest.identityType;
        }
        if ((i & 4) != 0) {
            str3 = oneCustomerPreverifyRequest.dtrCode;
        }
        if ((i & 8) != 0) {
            str4 = oneCustomerPreverifyRequest.flow;
        }
        return oneCustomerPreverifyRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.identityNumber;
    }

    @Nullable
    public final String component2() {
        return this.identityType;
    }

    @Nullable
    public final String component3() {
        return this.dtrCode;
    }

    @Nullable
    public final String component4() {
        return this.flow;
    }

    @NotNull
    public final OneCustomerPreverifyRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneCustomerPreverifyRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCustomerPreverifyRequest) {
            OneCustomerPreverifyRequest oneCustomerPreverifyRequest = (OneCustomerPreverifyRequest) obj;
            return Intrinsics.areEqual(this.identityNumber, oneCustomerPreverifyRequest.identityNumber) && Intrinsics.areEqual(this.identityType, oneCustomerPreverifyRequest.identityType) && Intrinsics.areEqual(this.dtrCode, oneCustomerPreverifyRequest.dtrCode) && Intrinsics.areEqual(this.flow, oneCustomerPreverifyRequest.flow);
        }
        return false;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getFlow() {
        return this.flow;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    public int hashCode() {
        String str = this.identityNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identityType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dtrCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flow;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.identityNumber;
        String str2 = this.identityType;
        String str3 = this.dtrCode;
        String str4 = this.flow;
        return "OneCustomerPreverifyRequest(identityNumber=" + str + ", identityType=" + str2 + ", dtrCode=" + str3 + ", flow=" + str4 + ")";
    }

    public OneCustomerPreverifyRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.identityNumber = str;
        this.identityType = str2;
        this.dtrCode = str3;
        this.flow = str4;
    }

    public /* synthetic */ OneCustomerPreverifyRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
