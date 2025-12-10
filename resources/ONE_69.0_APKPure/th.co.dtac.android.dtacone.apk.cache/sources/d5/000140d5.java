package th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u000b¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/SubDistrict;", "", "", "id", "", "name", "districtId", "provinceId", "<init>", "(ILjava/lang/String;II)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;II)Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/SubDistrict;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getName", OperatorName.CURVE_TO, "getDistrictId", "d", "getProvinceId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict */
/* loaded from: classes10.dex */
public final class SubDistrict {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f98011a;

    /* renamed from: b */
    public final String f98012b;

    /* renamed from: c */
    public final int f98013c;

    /* renamed from: d */
    public final int f98014d;

    public SubDistrict(int i, @NotNull String name, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f98011a = i;
        this.f98012b = name;
        this.f98013c = i2;
        this.f98014d = i3;
    }

    public static /* synthetic */ SubDistrict copy$default(SubDistrict subDistrict, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = subDistrict.f98011a;
        }
        if ((i4 & 2) != 0) {
            str = subDistrict.f98012b;
        }
        if ((i4 & 4) != 0) {
            i2 = subDistrict.f98013c;
        }
        if ((i4 & 8) != 0) {
            i3 = subDistrict.f98014d;
        }
        return subDistrict.copy(i, str, i2, i3);
    }

    public final int component1() {
        return this.f98011a;
    }

    @NotNull
    public final String component2() {
        return this.f98012b;
    }

    public final int component3() {
        return this.f98013c;
    }

    public final int component4() {
        return this.f98014d;
    }

    @NotNull
    public final SubDistrict copy(int i, @NotNull String name, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SubDistrict(i, name, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubDistrict) {
            SubDistrict subDistrict = (SubDistrict) obj;
            return this.f98011a == subDistrict.f98011a && Intrinsics.areEqual(this.f98012b, subDistrict.f98012b) && this.f98013c == subDistrict.f98013c && this.f98014d == subDistrict.f98014d;
        }
        return false;
    }

    public final int getDistrictId() {
        return this.f98013c;
    }

    public final int getId() {
        return this.f98011a;
    }

    @NotNull
    public final String getName() {
        return this.f98012b;
    }

    public final int getProvinceId() {
        return this.f98014d;
    }

    public int hashCode() {
        return (((((this.f98011a * 31) + this.f98012b.hashCode()) * 31) + this.f98013c) * 31) + this.f98014d;
    }

    @NotNull
    public String toString() {
        int i = this.f98011a;
        String str = this.f98012b;
        int i2 = this.f98013c;
        int i3 = this.f98014d;
        return "SubDistrict(id=" + i + ", name=" + str + ", districtId=" + i2 + ", provinceId=" + i3 + ")";
    }
}