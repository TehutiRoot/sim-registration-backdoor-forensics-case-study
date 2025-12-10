package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/PackagePriceInfo;", "", "targetOfferCode", "", "targetOfferName", "targetOfferType", "packageCategoryCode", "recurringChargeAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageCategoryCode", "()Ljava/lang/String;", "getRecurringChargeAmount", "getTargetOfferCode", "getTargetOfferName", "getTargetOfferType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.PackagePriceInfo */
/* loaded from: classes8.dex */
public final class PackagePriceInfo {
    public static final int $stable = 0;
    @SerializedName("packageCategoryCode")
    @NotNull
    private final String packageCategoryCode;
    @SerializedName("recurringChargeAmount")
    @NotNull
    private final String recurringChargeAmount;
    @SerializedName("targetOfferCode")
    @NotNull
    private final String targetOfferCode;
    @SerializedName("targetOfferName")
    @NotNull
    private final String targetOfferName;
    @SerializedName("targetOfferType")
    @NotNull
    private final String targetOfferType;

    public PackagePriceInfo(@NotNull String targetOfferCode, @NotNull String targetOfferName, @NotNull String targetOfferType, @NotNull String packageCategoryCode, @NotNull String recurringChargeAmount) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(targetOfferName, "targetOfferName");
        Intrinsics.checkNotNullParameter(targetOfferType, "targetOfferType");
        Intrinsics.checkNotNullParameter(packageCategoryCode, "packageCategoryCode");
        Intrinsics.checkNotNullParameter(recurringChargeAmount, "recurringChargeAmount");
        this.targetOfferCode = targetOfferCode;
        this.targetOfferName = targetOfferName;
        this.targetOfferType = targetOfferType;
        this.packageCategoryCode = packageCategoryCode;
        this.recurringChargeAmount = recurringChargeAmount;
    }

    public static /* synthetic */ PackagePriceInfo copy$default(PackagePriceInfo packagePriceInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packagePriceInfo.targetOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = packagePriceInfo.targetOfferName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = packagePriceInfo.targetOfferType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = packagePriceInfo.packageCategoryCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = packagePriceInfo.recurringChargeAmount;
        }
        return packagePriceInfo.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.targetOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.targetOfferName;
    }

    @NotNull
    public final String component3() {
        return this.targetOfferType;
    }

    @NotNull
    public final String component4() {
        return this.packageCategoryCode;
    }

    @NotNull
    public final String component5() {
        return this.recurringChargeAmount;
    }

    @NotNull
    public final PackagePriceInfo copy(@NotNull String targetOfferCode, @NotNull String targetOfferName, @NotNull String targetOfferType, @NotNull String packageCategoryCode, @NotNull String recurringChargeAmount) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(targetOfferName, "targetOfferName");
        Intrinsics.checkNotNullParameter(targetOfferType, "targetOfferType");
        Intrinsics.checkNotNullParameter(packageCategoryCode, "packageCategoryCode");
        Intrinsics.checkNotNullParameter(recurringChargeAmount, "recurringChargeAmount");
        return new PackagePriceInfo(targetOfferCode, targetOfferName, targetOfferType, packageCategoryCode, recurringChargeAmount);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackagePriceInfo) {
            PackagePriceInfo packagePriceInfo = (PackagePriceInfo) obj;
            return Intrinsics.areEqual(this.targetOfferCode, packagePriceInfo.targetOfferCode) && Intrinsics.areEqual(this.targetOfferName, packagePriceInfo.targetOfferName) && Intrinsics.areEqual(this.targetOfferType, packagePriceInfo.targetOfferType) && Intrinsics.areEqual(this.packageCategoryCode, packagePriceInfo.packageCategoryCode) && Intrinsics.areEqual(this.recurringChargeAmount, packagePriceInfo.recurringChargeAmount);
        }
        return false;
    }

    @NotNull
    public final String getPackageCategoryCode() {
        return this.packageCategoryCode;
    }

    @NotNull
    public final String getRecurringChargeAmount() {
        return this.recurringChargeAmount;
    }

    @NotNull
    public final String getTargetOfferCode() {
        return this.targetOfferCode;
    }

    @NotNull
    public final String getTargetOfferName() {
        return this.targetOfferName;
    }

    @NotNull
    public final String getTargetOfferType() {
        return this.targetOfferType;
    }

    public int hashCode() {
        return (((((((this.targetOfferCode.hashCode() * 31) + this.targetOfferName.hashCode()) * 31) + this.targetOfferType.hashCode()) * 31) + this.packageCategoryCode.hashCode()) * 31) + this.recurringChargeAmount.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.targetOfferCode;
        String str2 = this.targetOfferName;
        String str3 = this.targetOfferType;
        String str4 = this.packageCategoryCode;
        String str5 = this.recurringChargeAmount;
        return "PackagePriceInfo(targetOfferCode=" + str + ", targetOfferName=" + str2 + ", targetOfferType=" + str3 + ", packageCategoryCode=" + str4 + ", recurringChargeAmount=" + str5 + ")";
    }
}