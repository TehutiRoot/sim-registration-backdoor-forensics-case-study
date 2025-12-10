package th.p047co.dtac.android.dtacone.data.cache.room.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Entity(tableName = "district")
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u000b¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/data/cache/room/entity/District;", "", "", "districtId", "", "districtNameTh", "districtNameEn", "provinceId", "<init>", "(JLjava/lang/String;Ljava/lang/String;J)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/String;J)Lth/co/dtac/android/dtacone/data/cache/room/entity/District;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getDistrictId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getDistrictNameTh", OperatorName.CURVE_TO, "getDistrictNameEn", "d", "getProvinceId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.data.cache.room.entity.District */
/* loaded from: classes7.dex */
public final class District {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f83579a;

    /* renamed from: b */
    public final String f83580b;

    /* renamed from: c */
    public final String f83581c;

    /* renamed from: d */
    public final long f83582d;

    public District(long j, @Nullable String str, @Nullable String str2, long j2) {
        this.f83579a = j;
        this.f83580b = str;
        this.f83581c = str2;
        this.f83582d = j2;
    }

    public static /* synthetic */ District copy$default(District district, long j, String str, String str2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = district.f83579a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = district.f83580b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = district.f83581c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            j2 = district.f83582d;
        }
        return district.copy(j3, str3, str4, j2);
    }

    public final long component1() {
        return this.f83579a;
    }

    @Nullable
    public final String component2() {
        return this.f83580b;
    }

    @Nullable
    public final String component3() {
        return this.f83581c;
    }

    public final long component4() {
        return this.f83582d;
    }

    @NotNull
    public final District copy(long j, @Nullable String str, @Nullable String str2, long j2) {
        return new District(j, str, str2, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof District) {
            District district = (District) obj;
            return this.f83579a == district.f83579a && Intrinsics.areEqual(this.f83580b, district.f83580b) && Intrinsics.areEqual(this.f83581c, district.f83581c) && this.f83582d == district.f83582d;
        }
        return false;
    }

    public final long getDistrictId() {
        return this.f83579a;
    }

    @Nullable
    public final String getDistrictNameEn() {
        return this.f83581c;
    }

    @Nullable
    public final String getDistrictNameTh() {
        return this.f83580b;
    }

    public final long getProvinceId() {
        return this.f83582d;
    }

    public int hashCode() {
        int m68395a = AbstractC17631Fh1.m68395a(this.f83579a) * 31;
        String str = this.f83580b;
        int hashCode = (m68395a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83581c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + AbstractC17631Fh1.m68395a(this.f83582d);
    }

    @NotNull
    public String toString() {
        long j = this.f83579a;
        String str = this.f83580b;
        String str2 = this.f83581c;
        long j2 = this.f83582d;
        return "District(districtId=" + j + ", districtNameTh=" + str + ", districtNameEn=" + str2 + ", provinceId=" + j2 + ")";
    }
}