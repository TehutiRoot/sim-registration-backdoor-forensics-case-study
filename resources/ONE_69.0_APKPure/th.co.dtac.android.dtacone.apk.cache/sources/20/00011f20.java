package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrRetailerAllPackageGroupRequest;", "", "simType", "", "packageGroupCode", "withDevice", "", "minPriceValue", "transactionType", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getMinPriceValue", "()Ljava/lang/String;", "getPackageGroupCode", "getSimType", "getTransactionType", "getWithDevice", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrRetailerAllPackageGroupRequest */
/* loaded from: classes8.dex */
public final class MrtrRetailerAllPackageGroupRequest {
    public static final int $stable = 0;
    @SerializedName("minPriceValue")
    @Nullable
    private final String minPriceValue;
    @SerializedName("packageGroupCode")
    @Nullable
    private final String packageGroupCode;
    @SerializedName("simType")
    @Nullable
    private final String simType;
    @SerializedName("transactionType")
    @Nullable
    private final String transactionType;
    @SerializedName("withDevice")
    private final boolean withDevice;

    public MrtrRetailerAllPackageGroupRequest() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ MrtrRetailerAllPackageGroupRequest copy$default(MrtrRetailerAllPackageGroupRequest mrtrRetailerAllPackageGroupRequest, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrtrRetailerAllPackageGroupRequest.simType;
        }
        if ((i & 2) != 0) {
            str2 = mrtrRetailerAllPackageGroupRequest.packageGroupCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = mrtrRetailerAllPackageGroupRequest.withDevice;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = mrtrRetailerAllPackageGroupRequest.minPriceValue;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = mrtrRetailerAllPackageGroupRequest.transactionType;
        }
        return mrtrRetailerAllPackageGroupRequest.copy(str, str5, z2, str6, str4);
    }

    @Nullable
    public final String component1() {
        return this.simType;
    }

    @Nullable
    public final String component2() {
        return this.packageGroupCode;
    }

    public final boolean component3() {
        return this.withDevice;
    }

    @Nullable
    public final String component4() {
        return this.minPriceValue;
    }

    @Nullable
    public final String component5() {
        return this.transactionType;
    }

    @NotNull
    public final MrtrRetailerAllPackageGroupRequest copy(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4) {
        return new MrtrRetailerAllPackageGroupRequest(str, str2, z, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrRetailerAllPackageGroupRequest) {
            MrtrRetailerAllPackageGroupRequest mrtrRetailerAllPackageGroupRequest = (MrtrRetailerAllPackageGroupRequest) obj;
            return Intrinsics.areEqual(this.simType, mrtrRetailerAllPackageGroupRequest.simType) && Intrinsics.areEqual(this.packageGroupCode, mrtrRetailerAllPackageGroupRequest.packageGroupCode) && this.withDevice == mrtrRetailerAllPackageGroupRequest.withDevice && Intrinsics.areEqual(this.minPriceValue, mrtrRetailerAllPackageGroupRequest.minPriceValue) && Intrinsics.areEqual(this.transactionType, mrtrRetailerAllPackageGroupRequest.transactionType);
        }
        return false;
    }

    @Nullable
    public final String getMinPriceValue() {
        return this.minPriceValue;
    }

    @Nullable
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final boolean getWithDevice() {
        return this.withDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.simType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageGroupCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.withDevice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str3 = this.minPriceValue;
        int hashCode3 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.transactionType;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simType;
        String str2 = this.packageGroupCode;
        boolean z = this.withDevice;
        String str3 = this.minPriceValue;
        String str4 = this.transactionType;
        return "MrtrRetailerAllPackageGroupRequest(simType=" + str + ", packageGroupCode=" + str2 + ", withDevice=" + z + ", minPriceValue=" + str3 + ", transactionType=" + str4 + ")";
    }

    public MrtrRetailerAllPackageGroupRequest(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4) {
        this.simType = str;
        this.packageGroupCode = str2;
        this.withDevice = z;
        this.minPriceValue = str3;
        this.transactionType = str4;
    }

    public /* synthetic */ MrtrRetailerAllPackageGroupRequest(String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? "POSTPAID" : str4);
    }
}