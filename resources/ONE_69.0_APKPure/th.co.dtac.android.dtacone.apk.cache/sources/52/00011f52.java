package th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/request/CheckSimStockRequest;", "", "simCardNumber", "", "userLan", "locationCode", "priceLevel", "userCode", "eSIMFlag", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getESIMFlag", "()Z", "getLocationCode", "()Ljava/lang/String;", "getPriceLevel", "getSimCardNumber", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.request.CheckSimStockRequest */
/* loaded from: classes8.dex */
public final class CheckSimStockRequest {
    public static final int $stable = 0;
    @SerializedName("eSIMFlag")
    private final boolean eSIMFlag;
    @SerializedName("locationCode")
    @Nullable
    private final String locationCode;
    @SerializedName("priceLevel")
    @Nullable
    private final String priceLevel;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;

    public CheckSimStockRequest() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ CheckSimStockRequest copy$default(CheckSimStockRequest checkSimStockRequest, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkSimStockRequest.simCardNumber;
        }
        if ((i & 2) != 0) {
            str2 = checkSimStockRequest.userLan;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = checkSimStockRequest.locationCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = checkSimStockRequest.priceLevel;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = checkSimStockRequest.userCode;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = checkSimStockRequest.eSIMFlag;
        }
        return checkSimStockRequest.copy(str, str6, str7, str8, str9, z);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.userLan;
    }

    @Nullable
    public final String component3() {
        return this.locationCode;
    }

    @Nullable
    public final String component4() {
        return this.priceLevel;
    }

    @Nullable
    public final String component5() {
        return this.userCode;
    }

    public final boolean component6() {
        return this.eSIMFlag;
    }

    @NotNull
    public final CheckSimStockRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z) {
        return new CheckSimStockRequest(str, str2, str3, str4, str5, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckSimStockRequest) {
            CheckSimStockRequest checkSimStockRequest = (CheckSimStockRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, checkSimStockRequest.simCardNumber) && Intrinsics.areEqual(this.userLan, checkSimStockRequest.userLan) && Intrinsics.areEqual(this.locationCode, checkSimStockRequest.locationCode) && Intrinsics.areEqual(this.priceLevel, checkSimStockRequest.priceLevel) && Intrinsics.areEqual(this.userCode, checkSimStockRequest.userCode) && this.eSIMFlag == checkSimStockRequest.eSIMFlag;
        }
        return false;
    }

    public final boolean getESIMFlag() {
        return this.eSIMFlag;
    }

    @Nullable
    public final String getLocationCode() {
        return this.locationCode;
    }

    @Nullable
    public final String getPriceLevel() {
        return this.priceLevel;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userLan;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locationCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceLevel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userCode;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.eSIMFlag;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.userLan;
        String str3 = this.locationCode;
        String str4 = this.priceLevel;
        String str5 = this.userCode;
        boolean z = this.eSIMFlag;
        return "CheckSimStockRequest(simCardNumber=" + str + ", userLan=" + str2 + ", locationCode=" + str3 + ", priceLevel=" + str4 + ", userCode=" + str5 + ", eSIMFlag=" + z + ")";
    }

    public CheckSimStockRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z) {
        this.simCardNumber = str;
        this.userLan = str2;
        this.locationCode = str3;
        this.priceLevel = str4;
        this.userCode = str5;
        this.eSIMFlag = z;
    }

    public /* synthetic */ CheckSimStockRequest(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null, (i & 32) != 0 ? false : z);
    }
}