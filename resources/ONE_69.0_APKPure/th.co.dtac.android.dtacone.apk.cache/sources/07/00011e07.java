package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/AdditionalPromotionPackage;", "", "packageCode", "", "packageType", "packageDesc", "amount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getAmount", "()F", "getPackageCode", "()Ljava/lang/String;", "getPackageDesc", "getPackageType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.AdditionalPromotionPackage */
/* loaded from: classes8.dex */
public final class AdditionalPromotionPackage {
    public static final int $stable = 0;
    @SerializedName("amount")
    private final float amount;
    @SerializedName("packageCode")
    @NotNull
    private final String packageCode;
    @SerializedName("packageDesc")
    @NotNull
    private final String packageDesc;
    @SerializedName("packageType")
    @NotNull
    private final String packageType;

    public AdditionalPromotionPackage(@NotNull String packageCode, @NotNull String packageType, @NotNull String packageDesc, float f) {
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(packageDesc, "packageDesc");
        this.packageCode = packageCode;
        this.packageType = packageType;
        this.packageDesc = packageDesc;
        this.amount = f;
    }

    public static /* synthetic */ AdditionalPromotionPackage copy$default(AdditionalPromotionPackage additionalPromotionPackage, String str, String str2, String str3, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalPromotionPackage.packageCode;
        }
        if ((i & 2) != 0) {
            str2 = additionalPromotionPackage.packageType;
        }
        if ((i & 4) != 0) {
            str3 = additionalPromotionPackage.packageDesc;
        }
        if ((i & 8) != 0) {
            f = additionalPromotionPackage.amount;
        }
        return additionalPromotionPackage.copy(str, str2, str3, f);
    }

    @NotNull
    public final String component1() {
        return this.packageCode;
    }

    @NotNull
    public final String component2() {
        return this.packageType;
    }

    @NotNull
    public final String component3() {
        return this.packageDesc;
    }

    public final float component4() {
        return this.amount;
    }

    @NotNull
    public final AdditionalPromotionPackage copy(@NotNull String packageCode, @NotNull String packageType, @NotNull String packageDesc, float f) {
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(packageDesc, "packageDesc");
        return new AdditionalPromotionPackage(packageCode, packageType, packageDesc, f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdditionalPromotionPackage) {
            AdditionalPromotionPackage additionalPromotionPackage = (AdditionalPromotionPackage) obj;
            return Intrinsics.areEqual(this.packageCode, additionalPromotionPackage.packageCode) && Intrinsics.areEqual(this.packageType, additionalPromotionPackage.packageType) && Intrinsics.areEqual(this.packageDesc, additionalPromotionPackage.packageDesc) && Float.compare(this.amount, additionalPromotionPackage.amount) == 0;
        }
        return false;
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageDesc() {
        return this.packageDesc;
    }

    @NotNull
    public final String getPackageType() {
        return this.packageType;
    }

    public int hashCode() {
        return (((((this.packageCode.hashCode() * 31) + this.packageType.hashCode()) * 31) + this.packageDesc.hashCode()) * 31) + Float.floatToIntBits(this.amount);
    }

    @NotNull
    public String toString() {
        String str = this.packageCode;
        String str2 = this.packageType;
        String str3 = this.packageDesc;
        float f = this.amount;
        return "AdditionalPromotionPackage(packageCode=" + str + ", packageType=" + str2 + ", packageDesc=" + str3 + ", amount=" + f + ")";
    }

    public /* synthetic */ AdditionalPromotionPackage(String str, String str2, String str3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0.0f : f);
    }
}