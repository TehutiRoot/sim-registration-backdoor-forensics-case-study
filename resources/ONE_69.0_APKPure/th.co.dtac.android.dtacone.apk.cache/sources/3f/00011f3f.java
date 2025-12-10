package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetAllPackageGroupPre2PostRetailerRequest;", "", "simType", "", "packageGroupCode", "minPriceValue", "", "transactionType", "withDevice", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getMinPriceValue", "()I", "getPackageGroupCode", "()Ljava/lang/String;", "getSimType", "getTransactionType", "getWithDevice", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetAllPackageGroupPre2PostRetailerRequest */
/* loaded from: classes8.dex */
public final class GetAllPackageGroupPre2PostRetailerRequest {
    public static final int $stable = 0;
    @SerializedName("minPriceValue")
    private final int minPriceValue;
    @SerializedName("packageGroupCode")
    @NotNull
    private final String packageGroupCode;
    @SerializedName("simType")
    @NotNull
    private final String simType;
    @SerializedName("transactionType")
    @NotNull
    private final String transactionType;
    @SerializedName("withDevice")
    private final boolean withDevice;

    public GetAllPackageGroupPre2PostRetailerRequest(@NotNull String simType, @NotNull String packageGroupCode, int i, @NotNull String transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.simType = simType;
        this.packageGroupCode = packageGroupCode;
        this.minPriceValue = i;
        this.transactionType = transactionType;
        this.withDevice = z;
    }

    public static /* synthetic */ GetAllPackageGroupPre2PostRetailerRequest copy$default(GetAllPackageGroupPre2PostRetailerRequest getAllPackageGroupPre2PostRetailerRequest, String str, String str2, int i, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getAllPackageGroupPre2PostRetailerRequest.simType;
        }
        if ((i2 & 2) != 0) {
            str2 = getAllPackageGroupPre2PostRetailerRequest.packageGroupCode;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = getAllPackageGroupPre2PostRetailerRequest.minPriceValue;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = getAllPackageGroupPre2PostRetailerRequest.transactionType;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            z = getAllPackageGroupPre2PostRetailerRequest.withDevice;
        }
        return getAllPackageGroupPre2PostRetailerRequest.copy(str, str4, i3, str5, z);
    }

    @NotNull
    public final String component1() {
        return this.simType;
    }

    @NotNull
    public final String component2() {
        return this.packageGroupCode;
    }

    public final int component3() {
        return this.minPriceValue;
    }

    @NotNull
    public final String component4() {
        return this.transactionType;
    }

    public final boolean component5() {
        return this.withDevice;
    }

    @NotNull
    public final GetAllPackageGroupPre2PostRetailerRequest copy(@NotNull String simType, @NotNull String packageGroupCode, int i, @NotNull String transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        return new GetAllPackageGroupPre2PostRetailerRequest(simType, packageGroupCode, i, transactionType, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAllPackageGroupPre2PostRetailerRequest) {
            GetAllPackageGroupPre2PostRetailerRequest getAllPackageGroupPre2PostRetailerRequest = (GetAllPackageGroupPre2PostRetailerRequest) obj;
            return Intrinsics.areEqual(this.simType, getAllPackageGroupPre2PostRetailerRequest.simType) && Intrinsics.areEqual(this.packageGroupCode, getAllPackageGroupPre2PostRetailerRequest.packageGroupCode) && this.minPriceValue == getAllPackageGroupPre2PostRetailerRequest.minPriceValue && Intrinsics.areEqual(this.transactionType, getAllPackageGroupPre2PostRetailerRequest.transactionType) && this.withDevice == getAllPackageGroupPre2PostRetailerRequest.withDevice;
        }
        return false;
    }

    public final int getMinPriceValue() {
        return this.minPriceValue;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
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
        int hashCode = ((((((this.simType.hashCode() * 31) + this.packageGroupCode.hashCode()) * 31) + this.minPriceValue) * 31) + this.transactionType.hashCode()) * 31;
        boolean z = this.withDevice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        String str = this.simType;
        String str2 = this.packageGroupCode;
        int i = this.minPriceValue;
        String str3 = this.transactionType;
        boolean z = this.withDevice;
        return "GetAllPackageGroupPre2PostRetailerRequest(simType=" + str + ", packageGroupCode=" + str2 + ", minPriceValue=" + i + ", transactionType=" + str3 + ", withDevice=" + z + ")";
    }
}