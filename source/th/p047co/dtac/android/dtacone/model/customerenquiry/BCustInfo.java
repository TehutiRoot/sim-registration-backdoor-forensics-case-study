package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/BCustInfo;", "", "customerNumber", "", "blacklistAmount", "blacklistOtherChange", "blacklistNetAmount", "isLoading", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBlacklistAmount", "()Ljava/lang/String;", "getBlacklistNetAmount", "getBlacklistOtherChange", "getCustomerNumber", "()Z", "setLoading", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.BCustInfo */
/* loaded from: classes8.dex */
public final class BCustInfo {
    public static final int $stable = 8;
    @SerializedName("blacklistAmount")
    @Nullable
    private final String blacklistAmount;
    @SerializedName("blacklistNetAmount")
    @Nullable
    private final String blacklistNetAmount;
    @SerializedName("blacklistOtherChange")
    @Nullable
    private final String blacklistOtherChange;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("isLoading")
    private boolean isLoading;

    public BCustInfo(@NotNull String customerNumber, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        this.customerNumber = customerNumber;
        this.blacklistAmount = str;
        this.blacklistOtherChange = str2;
        this.blacklistNetAmount = str3;
        this.isLoading = z;
    }

    public static /* synthetic */ BCustInfo copy$default(BCustInfo bCustInfo, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bCustInfo.customerNumber;
        }
        if ((i & 2) != 0) {
            str2 = bCustInfo.blacklistAmount;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bCustInfo.blacklistOtherChange;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bCustInfo.blacklistNetAmount;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = bCustInfo.isLoading;
        }
        return bCustInfo.copy(str, str5, str6, str7, z);
    }

    @NotNull
    public final String component1() {
        return this.customerNumber;
    }

    @Nullable
    public final String component2() {
        return this.blacklistAmount;
    }

    @Nullable
    public final String component3() {
        return this.blacklistOtherChange;
    }

    @Nullable
    public final String component4() {
        return this.blacklistNetAmount;
    }

    public final boolean component5() {
        return this.isLoading;
    }

    @NotNull
    public final BCustInfo copy(@NotNull String customerNumber, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        return new BCustInfo(customerNumber, str, str2, str3, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BCustInfo) {
            BCustInfo bCustInfo = (BCustInfo) obj;
            return Intrinsics.areEqual(this.customerNumber, bCustInfo.customerNumber) && Intrinsics.areEqual(this.blacklistAmount, bCustInfo.blacklistAmount) && Intrinsics.areEqual(this.blacklistOtherChange, bCustInfo.blacklistOtherChange) && Intrinsics.areEqual(this.blacklistNetAmount, bCustInfo.blacklistNetAmount) && this.isLoading == bCustInfo.isLoading;
        }
        return false;
    }

    @Nullable
    public final String getBlacklistAmount() {
        return this.blacklistAmount;
    }

    @Nullable
    public final String getBlacklistNetAmount() {
        return this.blacklistNetAmount;
    }

    @Nullable
    public final String getBlacklistOtherChange() {
        return this.blacklistOtherChange;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.customerNumber.hashCode() * 31;
        String str = this.blacklistAmount;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blacklistOtherChange;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blacklistNetAmount;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isLoading;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    @NotNull
    public String toString() {
        String str = this.customerNumber;
        String str2 = this.blacklistAmount;
        String str3 = this.blacklistOtherChange;
        String str4 = this.blacklistNetAmount;
        boolean z = this.isLoading;
        return "BCustInfo(customerNumber=" + str + ", blacklistAmount=" + str2 + ", blacklistOtherChange=" + str3 + ", blacklistNetAmount=" + str4 + ", isLoading=" + z + ")";
    }

    public /* synthetic */ BCustInfo(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z);
    }
}
