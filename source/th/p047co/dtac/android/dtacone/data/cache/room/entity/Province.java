package th.p047co.dtac.android.dtacone.data.cache.room.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Entity(tableName = "province")
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/cache/room/entity/Province;", "", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "provinceNameTh", "provinceNameEn", "", "provinceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lth/co/dtac/android/dtacone/data/cache/room/entity/Province;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCountryCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getProvinceNameTh", OperatorName.CURVE_TO, "getProvinceNameEn", "d", OperatorName.SET_LINE_CAPSTYLE, "getProvinceId", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.data.cache.room.entity.Province */
/* loaded from: classes7.dex */
public final class Province {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f83489a;

    /* renamed from: b */
    public final String f83490b;

    /* renamed from: c */
    public final String f83491c;

    /* renamed from: d */
    public final long f83492d;

    public Province(@NotNull String countryCode, @NotNull String provinceNameTh, @NotNull String provinceNameEn, long j) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provinceNameTh, "provinceNameTh");
        Intrinsics.checkNotNullParameter(provinceNameEn, "provinceNameEn");
        this.f83489a = countryCode;
        this.f83490b = provinceNameTh;
        this.f83491c = provinceNameEn;
        this.f83492d = j;
    }

    public static /* synthetic */ Province copy$default(Province province, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = province.f83489a;
        }
        if ((i & 2) != 0) {
            str2 = province.f83490b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = province.f83491c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = province.f83492d;
        }
        return province.copy(str, str4, str5, j);
    }

    @NotNull
    public final String component1() {
        return this.f83489a;
    }

    @NotNull
    public final String component2() {
        return this.f83490b;
    }

    @NotNull
    public final String component3() {
        return this.f83491c;
    }

    public final long component4() {
        return this.f83492d;
    }

    @NotNull
    public final Province copy(@NotNull String countryCode, @NotNull String provinceNameTh, @NotNull String provinceNameEn, long j) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provinceNameTh, "provinceNameTh");
        Intrinsics.checkNotNullParameter(provinceNameEn, "provinceNameEn");
        return new Province(countryCode, provinceNameTh, provinceNameEn, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Province) {
            Province province = (Province) obj;
            return Intrinsics.areEqual(this.f83489a, province.f83489a) && Intrinsics.areEqual(this.f83490b, province.f83490b) && Intrinsics.areEqual(this.f83491c, province.f83491c) && this.f83492d == province.f83492d;
        }
        return false;
    }

    @NotNull
    public final String getCountryCode() {
        return this.f83489a;
    }

    public final long getProvinceId() {
        return this.f83492d;
    }

    @NotNull
    public final String getProvinceNameEn() {
        return this.f83491c;
    }

    @NotNull
    public final String getProvinceNameTh() {
        return this.f83490b;
    }

    public int hashCode() {
        return (((((this.f83489a.hashCode() * 31) + this.f83490b.hashCode()) * 31) + this.f83491c.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.f83492d);
    }

    @NotNull
    public String toString() {
        String str = this.f83489a;
        String str2 = this.f83490b;
        String str3 = this.f83491c;
        long j = this.f83492d;
        return "Province(countryCode=" + str + ", provinceNameTh=" + str2 + ", provinceNameEn=" + str3 + ", provinceId=" + j + ")";
    }
}
