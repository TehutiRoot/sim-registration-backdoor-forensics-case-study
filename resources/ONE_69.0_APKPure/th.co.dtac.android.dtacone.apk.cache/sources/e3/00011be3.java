package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGetPropositionRequest;", "", "companyCode", "", "customerType", "mobileServiceType", "propoType", "privilege", "dtrCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCustomerType", "getDtrCode", "getMobileServiceType", "getPrivilege", "getPropoType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostGetPropositionRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostGetPropositionRequest {
    public static final int $stable = 0;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("customerType")
    @Nullable
    private final String customerType;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("mobileServiceType")
    @Nullable
    private final String mobileServiceType;
    @SerializedName("privilege")
    @Nullable
    private final String privilege;
    @SerializedName("propoType")
    @Nullable
    private final String propoType;

    public OnePre2PostGetPropositionRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OnePre2PostGetPropositionRequest copy$default(OnePre2PostGetPropositionRequest onePre2PostGetPropositionRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostGetPropositionRequest.companyCode;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostGetPropositionRequest.customerType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onePre2PostGetPropositionRequest.mobileServiceType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onePre2PostGetPropositionRequest.propoType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onePre2PostGetPropositionRequest.privilege;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onePre2PostGetPropositionRequest.dtrCode;
        }
        return onePre2PostGetPropositionRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.companyCode;
    }

    @Nullable
    public final String component2() {
        return this.customerType;
    }

    @Nullable
    public final String component3() {
        return this.mobileServiceType;
    }

    @Nullable
    public final String component4() {
        return this.propoType;
    }

    @Nullable
    public final String component5() {
        return this.privilege;
    }

    @Nullable
    public final String component6() {
        return this.dtrCode;
    }

    @NotNull
    public final OnePre2PostGetPropositionRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OnePre2PostGetPropositionRequest(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostGetPropositionRequest) {
            OnePre2PostGetPropositionRequest onePre2PostGetPropositionRequest = (OnePre2PostGetPropositionRequest) obj;
            return Intrinsics.areEqual(this.companyCode, onePre2PostGetPropositionRequest.companyCode) && Intrinsics.areEqual(this.customerType, onePre2PostGetPropositionRequest.customerType) && Intrinsics.areEqual(this.mobileServiceType, onePre2PostGetPropositionRequest.mobileServiceType) && Intrinsics.areEqual(this.propoType, onePre2PostGetPropositionRequest.propoType) && Intrinsics.areEqual(this.privilege, onePre2PostGetPropositionRequest.privilege) && Intrinsics.areEqual(this.dtrCode, onePre2PostGetPropositionRequest.dtrCode);
        }
        return false;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final String getCustomerType() {
        return this.customerType;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getMobileServiceType() {
        return this.mobileServiceType;
    }

    @Nullable
    public final String getPrivilege() {
        return this.privilege;
    }

    @Nullable
    public final String getPropoType() {
        return this.propoType;
    }

    public int hashCode() {
        String str = this.companyCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mobileServiceType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.propoType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.privilege;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dtrCode;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        String str2 = this.customerType;
        String str3 = this.mobileServiceType;
        String str4 = this.propoType;
        String str5 = this.privilege;
        String str6 = this.dtrCode;
        return "OnePre2PostGetPropositionRequest(companyCode=" + str + ", customerType=" + str2 + ", mobileServiceType=" + str3 + ", propoType=" + str4 + ", privilege=" + str5 + ", dtrCode=" + str6 + ")";
    }

    public OnePre2PostGetPropositionRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.companyCode = str;
        this.customerType = str2;
        this.mobileServiceType = str3;
        this.propoType = str4;
        this.privilege = str5;
        this.dtrCode = str6;
    }

    public /* synthetic */ OnePre2PostGetPropositionRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}