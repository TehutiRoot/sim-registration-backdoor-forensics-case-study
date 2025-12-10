package th.p047co.dtac.android.dtacone.model.retailer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/retailer/RetailerResponse;", "", "retailerSubType", "", "retailerType", "rtrCode", "rtrName", "simR", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRetailerSubType", "()Ljava/lang/String;", "getRetailerType", "getRtrCode", "getRtrName", "getSimR", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.retailer.RetailerResponse */
/* loaded from: classes8.dex */
public final class RetailerResponse {
    public static final int $stable = 0;
    @SerializedName("retailerSubType")
    @NotNull
    private final String retailerSubType;
    @SerializedName("retailerType")
    @NotNull
    private final String retailerType;
    @SerializedName("rtrCode")
    @NotNull
    private final String rtrCode;
    @SerializedName("rtrName")
    @NotNull
    private final String rtrName;
    @SerializedName("simR")
    @NotNull
    private final String simR;

    public RetailerResponse(@NotNull String retailerSubType, @NotNull String retailerType, @NotNull String rtrCode, @NotNull String rtrName, @NotNull String simR) {
        Intrinsics.checkNotNullParameter(retailerSubType, "retailerSubType");
        Intrinsics.checkNotNullParameter(retailerType, "retailerType");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(simR, "simR");
        this.retailerSubType = retailerSubType;
        this.retailerType = retailerType;
        this.rtrCode = rtrCode;
        this.rtrName = rtrName;
        this.simR = simR;
    }

    public static /* synthetic */ RetailerResponse copy$default(RetailerResponse retailerResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retailerResponse.retailerSubType;
        }
        if ((i & 2) != 0) {
            str2 = retailerResponse.retailerType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = retailerResponse.rtrCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = retailerResponse.rtrName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = retailerResponse.simR;
        }
        return retailerResponse.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.retailerSubType;
    }

    @NotNull
    public final String component2() {
        return this.retailerType;
    }

    @NotNull
    public final String component3() {
        return this.rtrCode;
    }

    @NotNull
    public final String component4() {
        return this.rtrName;
    }

    @NotNull
    public final String component5() {
        return this.simR;
    }

    @NotNull
    public final RetailerResponse copy(@NotNull String retailerSubType, @NotNull String retailerType, @NotNull String rtrCode, @NotNull String rtrName, @NotNull String simR) {
        Intrinsics.checkNotNullParameter(retailerSubType, "retailerSubType");
        Intrinsics.checkNotNullParameter(retailerType, "retailerType");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(simR, "simR");
        return new RetailerResponse(retailerSubType, retailerType, rtrCode, rtrName, simR);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RetailerResponse) {
            RetailerResponse retailerResponse = (RetailerResponse) obj;
            return Intrinsics.areEqual(this.retailerSubType, retailerResponse.retailerSubType) && Intrinsics.areEqual(this.retailerType, retailerResponse.retailerType) && Intrinsics.areEqual(this.rtrCode, retailerResponse.rtrCode) && Intrinsics.areEqual(this.rtrName, retailerResponse.rtrName) && Intrinsics.areEqual(this.simR, retailerResponse.simR);
        }
        return false;
    }

    @NotNull
    public final String getRetailerSubType() {
        return this.retailerSubType;
    }

    @NotNull
    public final String getRetailerType() {
        return this.retailerType;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @NotNull
    public final String getRtrName() {
        return this.rtrName;
    }

    @NotNull
    public final String getSimR() {
        return this.simR;
    }

    public int hashCode() {
        return (((((((this.retailerSubType.hashCode() * 31) + this.retailerType.hashCode()) * 31) + this.rtrCode.hashCode()) * 31) + this.rtrName.hashCode()) * 31) + this.simR.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.retailerSubType;
        String str2 = this.retailerType;
        String str3 = this.rtrCode;
        String str4 = this.rtrName;
        String str5 = this.simR;
        return "RetailerResponse(retailerSubType=" + str + ", retailerType=" + str2 + ", rtrCode=" + str3 + ", rtrName=" + str4 + ", simR=" + str5 + ")";
    }
}