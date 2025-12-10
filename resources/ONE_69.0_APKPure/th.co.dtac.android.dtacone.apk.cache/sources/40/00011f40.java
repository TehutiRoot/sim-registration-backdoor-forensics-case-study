package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPackageDetailRequest;", "", "minPriceValue", "", "packageCode", "", "simType", "transactionType", "withDevice", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getMinPriceValue", "()I", "getPackageCode", "()Ljava/lang/String;", "getSimType", "getTransactionType", "getWithDevice", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetPackageDetailRequest */
/* loaded from: classes8.dex */
public final class GetPackageDetailRequest {
    public static final int $stable = 0;
    @SerializedName("minPriceValue")
    private final int minPriceValue;
    @SerializedName("packageCode")
    @NotNull
    private final String packageCode;
    @SerializedName("simType")
    @NotNull
    private final String simType;
    @SerializedName("transactionType")
    @NotNull
    private final String transactionType;
    @SerializedName("withDevice")
    private final boolean withDevice;

    public GetPackageDetailRequest(int i, @NotNull String packageCode, @NotNull String simType, @NotNull String transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.minPriceValue = i;
        this.packageCode = packageCode;
        this.simType = simType;
        this.transactionType = transactionType;
        this.withDevice = z;
    }

    public static /* synthetic */ GetPackageDetailRequest copy$default(GetPackageDetailRequest getPackageDetailRequest, int i, String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getPackageDetailRequest.minPriceValue;
        }
        if ((i2 & 2) != 0) {
            str = getPackageDetailRequest.packageCode;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = getPackageDetailRequest.simType;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = getPackageDetailRequest.transactionType;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            z = getPackageDetailRequest.withDevice;
        }
        return getPackageDetailRequest.copy(i, str4, str5, str6, z);
    }

    public final int component1() {
        return this.minPriceValue;
    }

    @NotNull
    public final String component2() {
        return this.packageCode;
    }

    @NotNull
    public final String component3() {
        return this.simType;
    }

    @NotNull
    public final String component4() {
        return this.transactionType;
    }

    public final boolean component5() {
        return this.withDevice;
    }

    @NotNull
    public final GetPackageDetailRequest copy(int i, @NotNull String packageCode, @NotNull String simType, @NotNull String transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        return new GetPackageDetailRequest(i, packageCode, simType, transactionType, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPackageDetailRequest) {
            GetPackageDetailRequest getPackageDetailRequest = (GetPackageDetailRequest) obj;
            return this.minPriceValue == getPackageDetailRequest.minPriceValue && Intrinsics.areEqual(this.packageCode, getPackageDetailRequest.packageCode) && Intrinsics.areEqual(this.simType, getPackageDetailRequest.simType) && Intrinsics.areEqual(this.transactionType, getPackageDetailRequest.transactionType) && this.withDevice == getPackageDetailRequest.withDevice;
        }
        return false;
    }

    public final int getMinPriceValue() {
        return this.minPriceValue;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getSimType() {
        return this.simType;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final boolean getWithDevice() {
        return this.withDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.minPriceValue * 31) + this.packageCode.hashCode()) * 31) + this.simType.hashCode()) * 31) + this.transactionType.hashCode()) * 31;
        boolean z = this.withDevice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        int i = this.minPriceValue;
        String str = this.packageCode;
        String str2 = this.simType;
        String str3 = this.transactionType;
        boolean z = this.withDevice;
        return "GetPackageDetailRequest(minPriceValue=" + i + ", packageCode=" + str + ", simType=" + str2 + ", transactionType=" + str3 + ", withDevice=" + z + ")";
    }
}