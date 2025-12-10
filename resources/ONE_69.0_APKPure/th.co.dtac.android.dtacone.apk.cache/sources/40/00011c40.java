package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpAvailableTelNumberRequest;", "", "prefix", "", "suffix", "province", "khet", "khwang", "buildName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildName", "()Ljava/lang/String;", "getKhet", "getKhwang", "getPrefix", "getProvince", "getSuffix", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpAvailableTelNumberRequest */
/* loaded from: classes8.dex */
public final class FlpAvailableTelNumberRequest {
    public static final int $stable = 0;
    @SerializedName("buildName")
    @NotNull
    private final String buildName;
    @SerializedName("khet")
    @NotNull
    private final String khet;
    @SerializedName("khwang")
    @NotNull
    private final String khwang;
    @SerializedName("prefix")
    @NotNull
    private final String prefix;
    @SerializedName("province")
    @NotNull
    private final String province;
    @SerializedName("suffix")
    @NotNull
    private final String suffix;

    public FlpAvailableTelNumberRequest(@NotNull String prefix, @NotNull String suffix, @NotNull String province, @NotNull String khet, @NotNull String khwang, @NotNull String buildName) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(khet, "khet");
        Intrinsics.checkNotNullParameter(khwang, "khwang");
        Intrinsics.checkNotNullParameter(buildName, "buildName");
        this.prefix = prefix;
        this.suffix = suffix;
        this.province = province;
        this.khet = khet;
        this.khwang = khwang;
        this.buildName = buildName;
    }

    public static /* synthetic */ FlpAvailableTelNumberRequest copy$default(FlpAvailableTelNumberRequest flpAvailableTelNumberRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flpAvailableTelNumberRequest.prefix;
        }
        if ((i & 2) != 0) {
            str2 = flpAvailableTelNumberRequest.suffix;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = flpAvailableTelNumberRequest.province;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = flpAvailableTelNumberRequest.khet;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = flpAvailableTelNumberRequest.khwang;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = flpAvailableTelNumberRequest.buildName;
        }
        return flpAvailableTelNumberRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.prefix;
    }

    @NotNull
    public final String component2() {
        return this.suffix;
    }

    @NotNull
    public final String component3() {
        return this.province;
    }

    @NotNull
    public final String component4() {
        return this.khet;
    }

    @NotNull
    public final String component5() {
        return this.khwang;
    }

    @NotNull
    public final String component6() {
        return this.buildName;
    }

    @NotNull
    public final FlpAvailableTelNumberRequest copy(@NotNull String prefix, @NotNull String suffix, @NotNull String province, @NotNull String khet, @NotNull String khwang, @NotNull String buildName) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(khet, "khet");
        Intrinsics.checkNotNullParameter(khwang, "khwang");
        Intrinsics.checkNotNullParameter(buildName, "buildName");
        return new FlpAvailableTelNumberRequest(prefix, suffix, province, khet, khwang, buildName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlpAvailableTelNumberRequest) {
            FlpAvailableTelNumberRequest flpAvailableTelNumberRequest = (FlpAvailableTelNumberRequest) obj;
            return Intrinsics.areEqual(this.prefix, flpAvailableTelNumberRequest.prefix) && Intrinsics.areEqual(this.suffix, flpAvailableTelNumberRequest.suffix) && Intrinsics.areEqual(this.province, flpAvailableTelNumberRequest.province) && Intrinsics.areEqual(this.khet, flpAvailableTelNumberRequest.khet) && Intrinsics.areEqual(this.khwang, flpAvailableTelNumberRequest.khwang) && Intrinsics.areEqual(this.buildName, flpAvailableTelNumberRequest.buildName);
        }
        return false;
    }

    @NotNull
    public final String getBuildName() {
        return this.buildName;
    }

    @NotNull
    public final String getKhet() {
        return this.khet;
    }

    @NotNull
    public final String getKhwang() {
        return this.khwang;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    @NotNull
    public final String getProvince() {
        return this.province;
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        return (((((((((this.prefix.hashCode() * 31) + this.suffix.hashCode()) * 31) + this.province.hashCode()) * 31) + this.khet.hashCode()) * 31) + this.khwang.hashCode()) * 31) + this.buildName.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.prefix;
        String str2 = this.suffix;
        String str3 = this.province;
        String str4 = this.khet;
        String str5 = this.khwang;
        String str6 = this.buildName;
        return "FlpAvailableTelNumberRequest(prefix=" + str + ", suffix=" + str2 + ", province=" + str3 + ", khet=" + str4 + ", khwang=" + str5 + ", buildName=" + str6 + ")";
    }
}