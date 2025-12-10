package th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\f¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/PostCode;", "", "", "id", "", "postCode", "subDistrictId", "districtId", "provinceId", "<init>", "(ILjava/lang/String;III)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ILjava/lang/String;III)Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/PostCode;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getPostCode", OperatorName.CURVE_TO, "getSubDistrictId", "d", "getDistrictId", "e", "getProvinceId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode */
/* loaded from: classes10.dex */
public final class PostCode {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f98004a;

    /* renamed from: b */
    public final String f98005b;

    /* renamed from: c */
    public final int f98006c;

    /* renamed from: d */
    public final int f98007d;

    /* renamed from: e */
    public final int f98008e;

    public PostCode(int i, @NotNull String postCode, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        this.f98004a = i;
        this.f98005b = postCode;
        this.f98006c = i2;
        this.f98007d = i3;
        this.f98008e = i4;
    }

    public static /* synthetic */ PostCode copy$default(PostCode postCode, int i, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = postCode.f98004a;
        }
        if ((i5 & 2) != 0) {
            str = postCode.f98005b;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = postCode.f98006c;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = postCode.f98007d;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = postCode.f98008e;
        }
        return postCode.copy(i, str2, i6, i7, i4);
    }

    public final int component1() {
        return this.f98004a;
    }

    @NotNull
    public final String component2() {
        return this.f98005b;
    }

    public final int component3() {
        return this.f98006c;
    }

    public final int component4() {
        return this.f98007d;
    }

    public final int component5() {
        return this.f98008e;
    }

    @NotNull
    public final PostCode copy(int i, @NotNull String postCode, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        return new PostCode(i, postCode, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostCode) {
            PostCode postCode = (PostCode) obj;
            return this.f98004a == postCode.f98004a && Intrinsics.areEqual(this.f98005b, postCode.f98005b) && this.f98006c == postCode.f98006c && this.f98007d == postCode.f98007d && this.f98008e == postCode.f98008e;
        }
        return false;
    }

    public final int getDistrictId() {
        return this.f98007d;
    }

    public final int getId() {
        return this.f98004a;
    }

    @NotNull
    public final String getPostCode() {
        return this.f98005b;
    }

    public final int getProvinceId() {
        return this.f98008e;
    }

    public final int getSubDistrictId() {
        return this.f98006c;
    }

    public int hashCode() {
        return (((((((this.f98004a * 31) + this.f98005b.hashCode()) * 31) + this.f98006c) * 31) + this.f98007d) * 31) + this.f98008e;
    }

    @NotNull
    public String toString() {
        int i = this.f98004a;
        String str = this.f98005b;
        int i2 = this.f98006c;
        int i3 = this.f98007d;
        int i4 = this.f98008e;
        return "PostCode(id=" + i + ", postCode=" + str + ", subDistrictId=" + i2 + ", districtId=" + i3 + ", provinceId=" + i4 + ")";
    }
}