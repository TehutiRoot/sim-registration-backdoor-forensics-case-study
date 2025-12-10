package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/VasInfo;", "", "vasOfferCode", "", "vasOfferName", "(Ljava/lang/String;Ljava/lang/String;)V", "getVasOfferCode", "()Ljava/lang/String;", "getVasOfferName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.VasInfo */
/* loaded from: classes8.dex */
public final class VasInfo {
    public static final int $stable = 0;
    @SerializedName("vasOfferCode")
    @NotNull
    private final String vasOfferCode;
    @SerializedName("vasOfferName")
    @NotNull
    private final String vasOfferName;

    public VasInfo() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ VasInfo copy$default(VasInfo vasInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vasInfo.vasOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = vasInfo.vasOfferName;
        }
        return vasInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.vasOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.vasOfferName;
    }

    @NotNull
    public final VasInfo copy(@NotNull String vasOfferCode, @NotNull String vasOfferName) {
        Intrinsics.checkNotNullParameter(vasOfferCode, "vasOfferCode");
        Intrinsics.checkNotNullParameter(vasOfferName, "vasOfferName");
        return new VasInfo(vasOfferCode, vasOfferName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VasInfo) {
            VasInfo vasInfo = (VasInfo) obj;
            return Intrinsics.areEqual(this.vasOfferCode, vasInfo.vasOfferCode) && Intrinsics.areEqual(this.vasOfferName, vasInfo.vasOfferName);
        }
        return false;
    }

    @NotNull
    public final String getVasOfferCode() {
        return this.vasOfferCode;
    }

    @NotNull
    public final String getVasOfferName() {
        return this.vasOfferName;
    }

    public int hashCode() {
        return (this.vasOfferCode.hashCode() * 31) + this.vasOfferName.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.vasOfferCode;
        String str2 = this.vasOfferName;
        return "VasInfo(vasOfferCode=" + str + ", vasOfferName=" + str2 + ")";
    }

    public VasInfo(@NotNull String vasOfferCode, @NotNull String vasOfferName) {
        Intrinsics.checkNotNullParameter(vasOfferCode, "vasOfferCode");
        Intrinsics.checkNotNullParameter(vasOfferName, "vasOfferName");
        this.vasOfferCode = vasOfferCode;
        this.vasOfferName = vasOfferName;
    }

    public /* synthetic */ VasInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
