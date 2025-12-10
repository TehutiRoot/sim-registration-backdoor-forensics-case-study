package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrRetailerPackageDetail;", "", "packageCode", "", "simType", "withDevice", "", "minPriceValue", "transactionType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getMinPriceValue", "()Ljava/lang/String;", "getPackageCode", "getSimType", "getTransactionType", "getWithDevice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrRetailerPackageDetail;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrRetailerPackageDetail */
/* loaded from: classes8.dex */
public final class MrtrRetailerPackageDetail {
    public static final int $stable = 0;
    @SerializedName("minPriceValue")
    @Nullable
    private final String minPriceValue;
    @SerializedName("packageCode")
    @Nullable
    private final String packageCode;
    @SerializedName("simType")
    @Nullable
    private final String simType;
    @SerializedName("transactionType")
    @Nullable
    private final String transactionType;
    @SerializedName("withDevice")
    @Nullable
    private final Boolean withDevice;

    public MrtrRetailerPackageDetail() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MrtrRetailerPackageDetail copy$default(MrtrRetailerPackageDetail mrtrRetailerPackageDetail, String str, String str2, Boolean bool, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrtrRetailerPackageDetail.packageCode;
        }
        if ((i & 2) != 0) {
            str2 = mrtrRetailerPackageDetail.simType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            bool = mrtrRetailerPackageDetail.withDevice;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str3 = mrtrRetailerPackageDetail.minPriceValue;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = mrtrRetailerPackageDetail.transactionType;
        }
        return mrtrRetailerPackageDetail.copy(str, str5, bool2, str6, str4);
    }

    @Nullable
    public final String component1() {
        return this.packageCode;
    }

    @Nullable
    public final String component2() {
        return this.simType;
    }

    @Nullable
    public final Boolean component3() {
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
    public final MrtrRetailerPackageDetail copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4) {
        return new MrtrRetailerPackageDetail(str, str2, bool, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrRetailerPackageDetail) {
            MrtrRetailerPackageDetail mrtrRetailerPackageDetail = (MrtrRetailerPackageDetail) obj;
            return Intrinsics.areEqual(this.packageCode, mrtrRetailerPackageDetail.packageCode) && Intrinsics.areEqual(this.simType, mrtrRetailerPackageDetail.simType) && Intrinsics.areEqual(this.withDevice, mrtrRetailerPackageDetail.withDevice) && Intrinsics.areEqual(this.minPriceValue, mrtrRetailerPackageDetail.minPriceValue) && Intrinsics.areEqual(this.transactionType, mrtrRetailerPackageDetail.transactionType);
        }
        return false;
    }

    @Nullable
    public final String getMinPriceValue() {
        return this.minPriceValue;
    }

    @Nullable
    public final String getPackageCode() {
        return this.packageCode;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final Boolean getWithDevice() {
        return this.withDevice;
    }

    public int hashCode() {
        String str = this.packageCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.simType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.withDevice;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.minPriceValue;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.transactionType;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageCode;
        String str2 = this.simType;
        Boolean bool = this.withDevice;
        String str3 = this.minPriceValue;
        String str4 = this.transactionType;
        return "MrtrRetailerPackageDetail(packageCode=" + str + ", simType=" + str2 + ", withDevice=" + bool + ", minPriceValue=" + str3 + ", transactionType=" + str4 + ")";
    }

    public MrtrRetailerPackageDetail(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4) {
        this.packageCode = str;
        this.simType = str2;
        this.withDevice = bool;
        this.minPriceValue = str3;
        this.transactionType = str4;
    }

    public /* synthetic */ MrtrRetailerPackageDetail(String str, String str2, Boolean bool, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? "POSTPAID" : str4);
    }
}