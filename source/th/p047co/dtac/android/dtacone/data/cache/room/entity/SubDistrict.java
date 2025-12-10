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
@Entity(tableName = "sub_district")
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u000b¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/cache/room/entity/SubDistrict;", "", "", "subDistrictId", "", "subDistrictNameTh", "subDistrictNameEn", "districtId", "<init>", "(JLjava/lang/String;Ljava/lang/String;J)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(JLjava/lang/String;Ljava/lang/String;J)Lth/co/dtac/android/dtacone/data/cache/room/entity/SubDistrict;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getSubDistrictId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getSubDistrictNameTh", OperatorName.CURVE_TO, "getSubDistrictNameEn", "d", "getDistrictId", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.data.cache.room.entity.SubDistrict */
/* loaded from: classes7.dex */
public final class SubDistrict {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f83493a;

    /* renamed from: b */
    public final String f83494b;

    /* renamed from: c */
    public final String f83495c;

    /* renamed from: d */
    public final long f83496d;

    public SubDistrict(long j, @Nullable String str, @Nullable String str2, long j2) {
        this.f83493a = j;
        this.f83494b = str;
        this.f83495c = str2;
        this.f83496d = j2;
    }

    public static /* synthetic */ SubDistrict copy$default(SubDistrict subDistrict, long j, String str, String str2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = subDistrict.f83493a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = subDistrict.f83494b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = subDistrict.f83495c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            j2 = subDistrict.f83496d;
        }
        return subDistrict.copy(j3, str3, str4, j2);
    }

    public final long component1() {
        return this.f83493a;
    }

    @Nullable
    public final String component2() {
        return this.f83494b;
    }

    @Nullable
    public final String component3() {
        return this.f83495c;
    }

    public final long component4() {
        return this.f83496d;
    }

    @NotNull
    public final SubDistrict copy(long j, @Nullable String str, @Nullable String str2, long j2) {
        return new SubDistrict(j, str, str2, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubDistrict) {
            SubDistrict subDistrict = (SubDistrict) obj;
            return this.f83493a == subDistrict.f83493a && Intrinsics.areEqual(this.f83494b, subDistrict.f83494b) && Intrinsics.areEqual(this.f83495c, subDistrict.f83495c) && this.f83496d == subDistrict.f83496d;
        }
        return false;
    }

    public final long getDistrictId() {
        return this.f83496d;
    }

    public final long getSubDistrictId() {
        return this.f83493a;
    }

    @Nullable
    public final String getSubDistrictNameEn() {
        return this.f83495c;
    }

    @Nullable
    public final String getSubDistrictNameTh() {
        return this.f83494b;
    }

    public int hashCode() {
        int m67882a = AbstractC17792Ig1.m67882a(this.f83493a) * 31;
        String str = this.f83494b;
        int hashCode = (m67882a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83495c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + AbstractC17792Ig1.m67882a(this.f83496d);
    }

    @NotNull
    public String toString() {
        long j = this.f83493a;
        String str = this.f83494b;
        String str2 = this.f83495c;
        long j2 = this.f83496d;
        return "SubDistrict(subDistrictId=" + j + ", subDistrictNameTh=" + str + ", subDistrictNameEn=" + str2 + ", districtId=" + j2 + ")";
    }
}
