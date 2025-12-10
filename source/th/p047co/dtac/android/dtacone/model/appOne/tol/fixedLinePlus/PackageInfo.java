package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/PackageInfo;", "", "targetOfferCode", "", "targetOfferName", "targetOfferType", "packageCategoryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageCategoryCode", "()Ljava/lang/String;", "getTargetOfferCode", "getTargetOfferName", "getTargetOfferType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.PackageInfo */
/* loaded from: classes8.dex */
public final class PackageInfo {
    public static final int $stable = 0;
    @SerializedName("packageCategoryCode")
    @NotNull
    private final String packageCategoryCode;
    @SerializedName("targetOfferCode")
    @NotNull
    private final String targetOfferCode;
    @SerializedName("targetOfferName")
    @NotNull
    private final String targetOfferName;
    @SerializedName("targetOfferType")
    @NotNull
    private final String targetOfferType;

    public PackageInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PackageInfo copy$default(PackageInfo packageInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packageInfo.targetOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = packageInfo.targetOfferName;
        }
        if ((i & 4) != 0) {
            str3 = packageInfo.targetOfferType;
        }
        if ((i & 8) != 0) {
            str4 = packageInfo.packageCategoryCode;
        }
        return packageInfo.copy(str, str2, str3, str4);
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
    public final PackageInfo copy(@NotNull String targetOfferCode, @NotNull String targetOfferName, @NotNull String targetOfferType, @NotNull String packageCategoryCode) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(targetOfferName, "targetOfferName");
        Intrinsics.checkNotNullParameter(targetOfferType, "targetOfferType");
        Intrinsics.checkNotNullParameter(packageCategoryCode, "packageCategoryCode");
        return new PackageInfo(targetOfferCode, targetOfferName, targetOfferType, packageCategoryCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackageInfo) {
            PackageInfo packageInfo = (PackageInfo) obj;
            return Intrinsics.areEqual(this.targetOfferCode, packageInfo.targetOfferCode) && Intrinsics.areEqual(this.targetOfferName, packageInfo.targetOfferName) && Intrinsics.areEqual(this.targetOfferType, packageInfo.targetOfferType) && Intrinsics.areEqual(this.packageCategoryCode, packageInfo.packageCategoryCode);
        }
        return false;
    }

    @NotNull
    public final String getPackageCategoryCode() {
        return this.packageCategoryCode;
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
        return (((((this.targetOfferCode.hashCode() * 31) + this.targetOfferName.hashCode()) * 31) + this.targetOfferType.hashCode()) * 31) + this.packageCategoryCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.targetOfferCode;
        String str2 = this.targetOfferName;
        String str3 = this.targetOfferType;
        String str4 = this.packageCategoryCode;
        return "PackageInfo(targetOfferCode=" + str + ", targetOfferName=" + str2 + ", targetOfferType=" + str3 + ", packageCategoryCode=" + str4 + ")";
    }

    public PackageInfo(@NotNull String targetOfferCode, @NotNull String targetOfferName, @NotNull String targetOfferType, @NotNull String packageCategoryCode) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(targetOfferName, "targetOfferName");
        Intrinsics.checkNotNullParameter(targetOfferType, "targetOfferType");
        Intrinsics.checkNotNullParameter(packageCategoryCode, "packageCategoryCode");
        this.targetOfferCode = targetOfferCode;
        this.targetOfferName = targetOfferName;
        this.targetOfferType = targetOfferType;
        this.packageCategoryCode = packageCategoryCode;
    }

    public /* synthetic */ PackageInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
