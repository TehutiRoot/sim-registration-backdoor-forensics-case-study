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
@Entity(tableName = "postcode")
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/data/cache/room/entity/PostCode;", "", "", "postcodeId", "", "postcode", "districtId", "<init>", "(JLjava/lang/String;J)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;J)Lth/co/dtac/android/dtacone/data/cache/room/entity/PostCode;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getPostcodeId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getPostcode", OperatorName.CURVE_TO, "getDistrictId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.data.cache.room.entity.PostCode */
/* loaded from: classes7.dex */
public final class PostCode {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f83583a;

    /* renamed from: b */
    public final String f83584b;

    /* renamed from: c */
    public final long f83585c;

    public PostCode(long j, @NotNull String postcode, long j2) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        this.f83583a = j;
        this.f83584b = postcode;
        this.f83585c = j2;
    }

    public static /* synthetic */ PostCode copy$default(PostCode postCode, long j, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = postCode.f83583a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = postCode.f83584b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = postCode.f83585c;
        }
        return postCode.copy(j3, str2, j2);
    }

    public final long component1() {
        return this.f83583a;
    }

    @NotNull
    public final String component2() {
        return this.f83584b;
    }

    public final long component3() {
        return this.f83585c;
    }

    @NotNull
    public final PostCode copy(long j, @NotNull String postcode, long j2) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        return new PostCode(j, postcode, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostCode) {
            PostCode postCode = (PostCode) obj;
            return this.f83583a == postCode.f83583a && Intrinsics.areEqual(this.f83584b, postCode.f83584b) && this.f83585c == postCode.f83585c;
        }
        return false;
    }

    public final long getDistrictId() {
        return this.f83585c;
    }

    @NotNull
    public final String getPostcode() {
        return this.f83584b;
    }

    public final long getPostcodeId() {
        return this.f83583a;
    }

    public int hashCode() {
        return (((AbstractC17631Fh1.m68395a(this.f83583a) * 31) + this.f83584b.hashCode()) * 31) + AbstractC17631Fh1.m68395a(this.f83585c);
    }

    @NotNull
    public String toString() {
        long j = this.f83583a;
        String str = this.f83584b;
        long j2 = this.f83585c;
        return "PostCode(postcodeId=" + j + ", postcode=" + str + ", districtId=" + j2 + ")";
    }
}