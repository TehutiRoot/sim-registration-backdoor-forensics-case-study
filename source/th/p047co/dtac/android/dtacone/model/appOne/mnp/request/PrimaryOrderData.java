package th.p047co.dtac.android.dtacone.model.appOne.mnp.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/request/PrimaryOrderData;", "", "accountSubTypeDesc", "", "accountSubType", "companyCode", "mobileServiceType", "priceplanDesc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountSubType", "()Ljava/lang/String;", "getAccountSubTypeDesc", "getCompanyCode", "getMobileServiceType", "getPriceplanDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.request.PrimaryOrderData */
/* loaded from: classes8.dex */
public final class PrimaryOrderData {
    public static final int $stable = 0;
    @SerializedName("accountSubType")
    @Nullable
    private final String accountSubType;
    @SerializedName("accountSubTypeDesc")
    @Nullable
    private final String accountSubTypeDesc;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("mobileServiceType")
    @NotNull
    private final String mobileServiceType;
    @SerializedName("priceplanDesc")
    @Nullable
    private final String priceplanDesc;

    public PrimaryOrderData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PrimaryOrderData copy$default(PrimaryOrderData primaryOrderData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primaryOrderData.accountSubTypeDesc;
        }
        if ((i & 2) != 0) {
            str2 = primaryOrderData.accountSubType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = primaryOrderData.companyCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = primaryOrderData.mobileServiceType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = primaryOrderData.priceplanDesc;
        }
        return primaryOrderData.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.accountSubTypeDesc;
    }

    @Nullable
    public final String component2() {
        return this.accountSubType;
    }

    @Nullable
    public final String component3() {
        return this.companyCode;
    }

    @NotNull
    public final String component4() {
        return this.mobileServiceType;
    }

    @Nullable
    public final String component5() {
        return this.priceplanDesc;
    }

    @NotNull
    public final PrimaryOrderData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String mobileServiceType, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(mobileServiceType, "mobileServiceType");
        return new PrimaryOrderData(str, str2, str3, mobileServiceType, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimaryOrderData) {
            PrimaryOrderData primaryOrderData = (PrimaryOrderData) obj;
            return Intrinsics.areEqual(this.accountSubTypeDesc, primaryOrderData.accountSubTypeDesc) && Intrinsics.areEqual(this.accountSubType, primaryOrderData.accountSubType) && Intrinsics.areEqual(this.companyCode, primaryOrderData.companyCode) && Intrinsics.areEqual(this.mobileServiceType, primaryOrderData.mobileServiceType) && Intrinsics.areEqual(this.priceplanDesc, primaryOrderData.priceplanDesc);
        }
        return false;
    }

    @Nullable
    public final String getAccountSubType() {
        return this.accountSubType;
    }

    @Nullable
    public final String getAccountSubTypeDesc() {
        return this.accountSubTypeDesc;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getMobileServiceType() {
        return this.mobileServiceType;
    }

    @Nullable
    public final String getPriceplanDesc() {
        return this.priceplanDesc;
    }

    public int hashCode() {
        String str = this.accountSubTypeDesc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountSubType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.companyCode;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.mobileServiceType.hashCode()) * 31;
        String str4 = this.priceplanDesc;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accountSubTypeDesc;
        String str2 = this.accountSubType;
        String str3 = this.companyCode;
        String str4 = this.mobileServiceType;
        String str5 = this.priceplanDesc;
        return "PrimaryOrderData(accountSubTypeDesc=" + str + ", accountSubType=" + str2 + ", companyCode=" + str3 + ", mobileServiceType=" + str4 + ", priceplanDesc=" + str5 + ")";
    }

    public PrimaryOrderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String mobileServiceType, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(mobileServiceType, "mobileServiceType");
        this.accountSubTypeDesc = str;
        this.accountSubType = str2;
        this.companyCode = str3;
        this.mobileServiceType = mobileServiceType;
        this.priceplanDesc = str4;
    }

    public /* synthetic */ PrimaryOrderData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "POSTPAID" : str4, (i & 16) != 0 ? null : str5);
    }
}
