package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/DiscountPackage;", "", "packageCode", "", "packageType", "packageExpire", "packageStart", "packageEnd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageCode", "()Ljava/lang/String;", "getPackageEnd", "getPackageExpire", "getPackageStart", "getPackageType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.DiscountPackage */
/* loaded from: classes8.dex */
public final class DiscountPackage {
    public static final int $stable = 0;
    @SerializedName("packageCode")
    @NotNull
    private final String packageCode;
    @SerializedName("packageEnd")
    @NotNull
    private final String packageEnd;
    @SerializedName("packageExpire")
    @NotNull
    private final String packageExpire;
    @SerializedName("packageStart")
    @NotNull
    private final String packageStart;
    @SerializedName("packageType")
    @NotNull
    private final String packageType;

    public DiscountPackage(@NotNull String packageCode, @NotNull String packageType, @NotNull String packageExpire, @NotNull String packageStart, @NotNull String packageEnd) {
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(packageExpire, "packageExpire");
        Intrinsics.checkNotNullParameter(packageStart, "packageStart");
        Intrinsics.checkNotNullParameter(packageEnd, "packageEnd");
        this.packageCode = packageCode;
        this.packageType = packageType;
        this.packageExpire = packageExpire;
        this.packageStart = packageStart;
        this.packageEnd = packageEnd;
    }

    public static /* synthetic */ DiscountPackage copy$default(DiscountPackage discountPackage, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountPackage.packageCode;
        }
        if ((i & 2) != 0) {
            str2 = discountPackage.packageType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = discountPackage.packageExpire;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = discountPackage.packageStart;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = discountPackage.packageEnd;
        }
        return discountPackage.copy(str, str6, str7, str8, str5);
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
        return this.packageExpire;
    }

    @NotNull
    public final String component4() {
        return this.packageStart;
    }

    @NotNull
    public final String component5() {
        return this.packageEnd;
    }

    @NotNull
    public final DiscountPackage copy(@NotNull String packageCode, @NotNull String packageType, @NotNull String packageExpire, @NotNull String packageStart, @NotNull String packageEnd) {
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(packageExpire, "packageExpire");
        Intrinsics.checkNotNullParameter(packageStart, "packageStart");
        Intrinsics.checkNotNullParameter(packageEnd, "packageEnd");
        return new DiscountPackage(packageCode, packageType, packageExpire, packageStart, packageEnd);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscountPackage) {
            DiscountPackage discountPackage = (DiscountPackage) obj;
            return Intrinsics.areEqual(this.packageCode, discountPackage.packageCode) && Intrinsics.areEqual(this.packageType, discountPackage.packageType) && Intrinsics.areEqual(this.packageExpire, discountPackage.packageExpire) && Intrinsics.areEqual(this.packageStart, discountPackage.packageStart) && Intrinsics.areEqual(this.packageEnd, discountPackage.packageEnd);
        }
        return false;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageEnd() {
        return this.packageEnd;
    }

    @NotNull
    public final String getPackageExpire() {
        return this.packageExpire;
    }

    @NotNull
    public final String getPackageStart() {
        return this.packageStart;
    }

    @NotNull
    public final String getPackageType() {
        return this.packageType;
    }

    public int hashCode() {
        return (((((((this.packageCode.hashCode() * 31) + this.packageType.hashCode()) * 31) + this.packageExpire.hashCode()) * 31) + this.packageStart.hashCode()) * 31) + this.packageEnd.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.packageCode;
        String str2 = this.packageType;
        String str3 = this.packageExpire;
        String str4 = this.packageStart;
        String str5 = this.packageEnd;
        return "DiscountPackage(packageCode=" + str + ", packageType=" + str2 + ", packageExpire=" + str3 + ", packageStart=" + str4 + ", packageEnd=" + str5 + ")";
    }
}