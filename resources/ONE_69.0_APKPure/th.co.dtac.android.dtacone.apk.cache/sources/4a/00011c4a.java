package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/OfferCode;", "", "targetOfferCode", "", "packageCategoryCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getPackageCategoryCode", "()Ljava/lang/String;", "getTargetOfferCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.OfferCode */
/* loaded from: classes8.dex */
public final class OfferCode {
    public static final int $stable = 0;
    @SerializedName("packageCategoryCode")
    @NotNull
    private final String packageCategoryCode;
    @SerializedName("targetOfferCode")
    @NotNull
    private final String targetOfferCode;

    public OfferCode(@NotNull String targetOfferCode, @NotNull String packageCategoryCode) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(packageCategoryCode, "packageCategoryCode");
        this.targetOfferCode = targetOfferCode;
        this.packageCategoryCode = packageCategoryCode;
    }

    public static /* synthetic */ OfferCode copy$default(OfferCode offerCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerCode.targetOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = offerCode.packageCategoryCode;
        }
        return offerCode.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.targetOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.packageCategoryCode;
    }

    @NotNull
    public final OfferCode copy(@NotNull String targetOfferCode, @NotNull String packageCategoryCode) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(packageCategoryCode, "packageCategoryCode");
        return new OfferCode(targetOfferCode, packageCategoryCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfferCode) {
            OfferCode offerCode = (OfferCode) obj;
            return Intrinsics.areEqual(this.targetOfferCode, offerCode.targetOfferCode) && Intrinsics.areEqual(this.packageCategoryCode, offerCode.packageCategoryCode);
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

    public int hashCode() {
        return (this.targetOfferCode.hashCode() * 31) + this.packageCategoryCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.targetOfferCode;
        String str2 = this.packageCategoryCode;
        return "OfferCode(targetOfferCode=" + str + ", packageCategoryCode=" + str2 + ")";
    }
}