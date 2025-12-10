package th.p047co.dtac.android.dtacone.model.appOne.pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansRequest;", "", "propositionCode", "", "activityFunction", "activityFunctionType", "dtrCode", "companyCode", "customerSubType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityFunction", "()Ljava/lang/String;", "getActivityFunctionType", "getCompanyCode", "getCustomerSubType", "getDtrCode", "getPropositionCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansRequest */
/* loaded from: classes8.dex */
public final class OneGetPricePlansRequest {
    public static final int $stable = 0;
    @SerializedName("activityFunction")
    @Nullable
    private final String activityFunction;
    @SerializedName("activityFunctionType")
    @Nullable
    private final String activityFunctionType;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("customerSubType")
    @Nullable
    private final String customerSubType;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("propositionCode")
    @Nullable
    private final String propositionCode;

    public OneGetPricePlansRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneGetPricePlansRequest copy$default(OneGetPricePlansRequest oneGetPricePlansRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneGetPricePlansRequest.propositionCode;
        }
        if ((i & 2) != 0) {
            str2 = oneGetPricePlansRequest.activityFunction;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = oneGetPricePlansRequest.activityFunctionType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = oneGetPricePlansRequest.dtrCode;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = oneGetPricePlansRequest.companyCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = oneGetPricePlansRequest.customerSubType;
        }
        return oneGetPricePlansRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.propositionCode;
    }

    @Nullable
    public final String component2() {
        return this.activityFunction;
    }

    @Nullable
    public final String component3() {
        return this.activityFunctionType;
    }

    @Nullable
    public final String component4() {
        return this.dtrCode;
    }

    @Nullable
    public final String component5() {
        return this.companyCode;
    }

    @Nullable
    public final String component6() {
        return this.customerSubType;
    }

    @NotNull
    public final OneGetPricePlansRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OneGetPricePlansRequest(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneGetPricePlansRequest) {
            OneGetPricePlansRequest oneGetPricePlansRequest = (OneGetPricePlansRequest) obj;
            return Intrinsics.areEqual(this.propositionCode, oneGetPricePlansRequest.propositionCode) && Intrinsics.areEqual(this.activityFunction, oneGetPricePlansRequest.activityFunction) && Intrinsics.areEqual(this.activityFunctionType, oneGetPricePlansRequest.activityFunctionType) && Intrinsics.areEqual(this.dtrCode, oneGetPricePlansRequest.dtrCode) && Intrinsics.areEqual(this.companyCode, oneGetPricePlansRequest.companyCode) && Intrinsics.areEqual(this.customerSubType, oneGetPricePlansRequest.customerSubType);
        }
        return false;
    }

    @Nullable
    public final String getActivityFunction() {
        return this.activityFunction;
    }

    @Nullable
    public final String getActivityFunctionType() {
        return this.activityFunctionType;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
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
        String str = this.propositionCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.activityFunction;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.activityFunctionType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dtrCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.companyCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.customerSubType;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.propositionCode;
        String str2 = this.activityFunction;
        String str3 = this.activityFunctionType;
        String str4 = this.dtrCode;
        String str5 = this.companyCode;
        String str6 = this.customerSubType;
        return "OneGetPricePlansRequest(propositionCode=" + str + ", activityFunction=" + str2 + ", activityFunctionType=" + str3 + ", dtrCode=" + str4 + ", companyCode=" + str5 + ", customerSubType=" + str6 + ")";
    }

    public OneGetPricePlansRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.propositionCode = str;
        this.activityFunction = str2;
        this.activityFunctionType = str3;
        this.dtrCode = str4;
        this.companyCode = str5;
        this.customerSubType = str6;
    }

    public /* synthetic */ OneGetPricePlansRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
