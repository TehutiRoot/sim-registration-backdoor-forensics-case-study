package th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\n¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/District;", "", "", "id", "", "name", "provinceId", "<init>", "(ILjava/lang/String;I)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;I)Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/District;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getName", OperatorName.CURVE_TO, "getProvinceId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District */
/* loaded from: classes10.dex */
public final class District {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f98001a;

    /* renamed from: b */
    public final String f98002b;

    /* renamed from: c */
    public final int f98003c;

    public District(int i, @NotNull String name, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f98001a = i;
        this.f98002b = name;
        this.f98003c = i2;
    }

    public static /* synthetic */ District copy$default(District district, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = district.f98001a;
        }
        if ((i3 & 2) != 0) {
            str = district.f98002b;
        }
        if ((i3 & 4) != 0) {
            i2 = district.f98003c;
        }
        return district.copy(i, str, i2);
    }

    public final int component1() {
        return this.f98001a;
    }

    @NotNull
    public final String component2() {
        return this.f98002b;
    }

    public final int component3() {
        return this.f98003c;
    }

    @NotNull
    public final District copy(int i, @NotNull String name, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new District(i, name, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof District) {
            District district = (District) obj;
            return this.f98001a == district.f98001a && Intrinsics.areEqual(this.f98002b, district.f98002b) && this.f98003c == district.f98003c;
        }
        return false;
    }

    public final int getId() {
        return this.f98001a;
    }

    @NotNull
    public final String getName() {
        return this.f98002b;
    }

    public final int getProvinceId() {
        return this.f98003c;
    }

    public int hashCode() {
        return (((this.f98001a * 31) + this.f98002b.hashCode()) * 31) + this.f98003c;
    }

    @NotNull
    public String toString() {
        int i = this.f98001a;
        String str = this.f98002b;
        int i2 = this.f98003c;
        return "District(id=" + i + ", name=" + str + ", provinceId=" + i2 + ")";
    }
}