package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPropositionRequest;", "", "flow", "", "companyCode", "customerType", "propoType", "mobileServieceType", "dtrCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCustomerType", "getDtrCode", "getFlow", "getMobileServieceType", "getPropoType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpPropositionRequest */
/* loaded from: classes8.dex */
public final class OneMnpPropositionRequest {
    public static final int $stable = 0;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("customerType")
    @NotNull
    private final String customerType;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("flow")
    @Nullable
    private final String flow;
    @SerializedName("mobileServiceType")
    @NotNull
    private final String mobileServieceType;
    @SerializedName("propoType")
    @NotNull
    private final String propoType;

    public OneMnpPropositionRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneMnpPropositionRequest copy$default(OneMnpPropositionRequest oneMnpPropositionRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneMnpPropositionRequest.flow;
        }
        if ((i & 2) != 0) {
            str2 = oneMnpPropositionRequest.companyCode;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneMnpPropositionRequest.customerType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneMnpPropositionRequest.propoType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneMnpPropositionRequest.mobileServieceType;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneMnpPropositionRequest.dtrCode;
        }
        return oneMnpPropositionRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.flow;
    }

    @NotNull
    public final String component2() {
        return this.companyCode;
    }

    @NotNull
    public final String component3() {
        return this.customerType;
    }

    @NotNull
    public final String component4() {
        return this.propoType;
    }

    @NotNull
    public final String component5() {
        return this.mobileServieceType;
    }

    @Nullable
    public final String component6() {
        return this.dtrCode;
    }

    @NotNull
    public final OneMnpPropositionRequest copy(@Nullable String str, @NotNull String companyCode, @NotNull String customerType, @NotNull String propoType, @NotNull String mobileServieceType, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        Intrinsics.checkNotNullParameter(propoType, "propoType");
        Intrinsics.checkNotNullParameter(mobileServieceType, "mobileServieceType");
        return new OneMnpPropositionRequest(str, companyCode, customerType, propoType, mobileServieceType, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpPropositionRequest) {
            OneMnpPropositionRequest oneMnpPropositionRequest = (OneMnpPropositionRequest) obj;
            return Intrinsics.areEqual(this.flow, oneMnpPropositionRequest.flow) && Intrinsics.areEqual(this.companyCode, oneMnpPropositionRequest.companyCode) && Intrinsics.areEqual(this.customerType, oneMnpPropositionRequest.customerType) && Intrinsics.areEqual(this.propoType, oneMnpPropositionRequest.propoType) && Intrinsics.areEqual(this.mobileServieceType, oneMnpPropositionRequest.mobileServieceType) && Intrinsics.areEqual(this.dtrCode, oneMnpPropositionRequest.dtrCode);
        }
        return false;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerType() {
        return this.customerType;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getFlow() {
        return this.flow;
    }

    @NotNull
    public final String getMobileServieceType() {
        return this.mobileServieceType;
    }

    @NotNull
    public final String getPropoType() {
        return this.propoType;
    }

    public int hashCode() {
        String str = this.flow;
        int hashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.customerType.hashCode()) * 31) + this.propoType.hashCode()) * 31) + this.mobileServieceType.hashCode()) * 31;
        String str2 = this.dtrCode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.flow;
        String str2 = this.companyCode;
        String str3 = this.customerType;
        String str4 = this.propoType;
        String str5 = this.mobileServieceType;
        String str6 = this.dtrCode;
        return "OneMnpPropositionRequest(flow=" + str + ", companyCode=" + str2 + ", customerType=" + str3 + ", propoType=" + str4 + ", mobileServieceType=" + str5 + ", dtrCode=" + str6 + ")";
    }

    public OneMnpPropositionRequest(@Nullable String str, @NotNull String companyCode, @NotNull String customerType, @NotNull String propoType, @NotNull String mobileServieceType, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        Intrinsics.checkNotNullParameter(propoType, "propoType");
        Intrinsics.checkNotNullParameter(mobileServieceType, "mobileServieceType");
        this.flow = str;
        this.companyCode = companyCode;
        this.customerType = customerType;
        this.propoType = propoType;
        this.mobileServieceType = mobileServieceType;
        this.dtrCode = str2;
    }

    public /* synthetic */ OneMnpPropositionRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "RF" : str2, (i & 4) != 0 ? "I" : str3, (i & 8) != 0 ? "MNP" : str4, (i & 16) != 0 ? "POSTPAID" : str5, (i & 32) != 0 ? null : str6);
    }
}