package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/OneMnpPricePlanRequest;", "", "activityFunction", "", "activityFunctionType", "propositionCode", "companyCode", "customerSubType", "dtrCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityFunction", "()Ljava/lang/String;", "getActivityFunctionType", "getCompanyCode", "getCustomerSubType", "getDtrCode", "getPropositionCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.OneMnpPricePlanRequest */
/* loaded from: classes8.dex */
public final class OneMnpPricePlanRequest {
    public static final int $stable = 0;
    @SerializedName("activityFunction")
    @NotNull
    private final String activityFunction;
    @SerializedName("activityFunctionType")
    @Nullable
    private final String activityFunctionType;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("customerSubType")
    @NotNull
    private final String customerSubType;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("propositionCode")
    @Nullable
    private final String propositionCode;

    public OneMnpPricePlanRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneMnpPricePlanRequest copy$default(OneMnpPricePlanRequest oneMnpPricePlanRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneMnpPricePlanRequest.activityFunction;
        }
        if ((i & 2) != 0) {
            str2 = oneMnpPricePlanRequest.activityFunctionType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneMnpPricePlanRequest.propositionCode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneMnpPricePlanRequest.companyCode;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneMnpPricePlanRequest.customerSubType;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneMnpPricePlanRequest.dtrCode;
        }
        return oneMnpPricePlanRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.activityFunction;
    }

    @Nullable
    public final String component2() {
        return this.activityFunctionType;
    }

    @Nullable
    public final String component3() {
        return this.propositionCode;
    }

    @NotNull
    public final String component4() {
        return this.companyCode;
    }

    @NotNull
    public final String component5() {
        return this.customerSubType;
    }

    @Nullable
    public final String component6() {
        return this.dtrCode;
    }

    @NotNull
    public final OneMnpPricePlanRequest copy(@NotNull String activityFunction, @Nullable String str, @Nullable String str2, @NotNull String companyCode, @NotNull String customerSubType, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(activityFunction, "activityFunction");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerSubType, "customerSubType");
        return new OneMnpPricePlanRequest(activityFunction, str, str2, companyCode, customerSubType, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneMnpPricePlanRequest) {
            OneMnpPricePlanRequest oneMnpPricePlanRequest = (OneMnpPricePlanRequest) obj;
            return Intrinsics.areEqual(this.activityFunction, oneMnpPricePlanRequest.activityFunction) && Intrinsics.areEqual(this.activityFunctionType, oneMnpPricePlanRequest.activityFunctionType) && Intrinsics.areEqual(this.propositionCode, oneMnpPricePlanRequest.propositionCode) && Intrinsics.areEqual(this.companyCode, oneMnpPricePlanRequest.companyCode) && Intrinsics.areEqual(this.customerSubType, oneMnpPricePlanRequest.customerSubType) && Intrinsics.areEqual(this.dtrCode, oneMnpPricePlanRequest.dtrCode);
        }
        return false;
    }

    @NotNull
    public final String getActivityFunction() {
        return this.activityFunction;
    }

    @Nullable
    public final String getActivityFunctionType() {
        return this.activityFunctionType;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerSubType() {
        return this.customerSubType;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getPropositionCode() {
        return this.propositionCode;
    }

    public int hashCode() {
        int hashCode = this.activityFunction.hashCode() * 31;
        String str = this.activityFunctionType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.propositionCode;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.companyCode.hashCode()) * 31) + this.customerSubType.hashCode()) * 31;
        String str3 = this.dtrCode;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.activityFunction;
        String str2 = this.activityFunctionType;
        String str3 = this.propositionCode;
        String str4 = this.companyCode;
        String str5 = this.customerSubType;
        String str6 = this.dtrCode;
        return "OneMnpPricePlanRequest(activityFunction=" + str + ", activityFunctionType=" + str2 + ", propositionCode=" + str3 + ", companyCode=" + str4 + ", customerSubType=" + str5 + ", dtrCode=" + str6 + ")";
    }

    public OneMnpPricePlanRequest(@NotNull String activityFunction, @Nullable String str, @Nullable String str2, @NotNull String companyCode, @NotNull String customerSubType, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(activityFunction, "activityFunction");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(customerSubType, "customerSubType");
        this.activityFunction = activityFunction;
        this.activityFunctionType = str;
        this.propositionCode = str2;
        this.companyCode = companyCode;
        this.customerSubType = customerSubType;
        this.dtrCode = str3;
    }

    public /* synthetic */ OneMnpPricePlanRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "MNP" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "RF" : str4, (i & 16) != 0 ? "I" : str5, (i & 32) == 0 ? str6 : null);
    }
}