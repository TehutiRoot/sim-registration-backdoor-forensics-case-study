package th.p047co.dtac.android.dtacone.view.appOne.device_sale.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u008a\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010\"J\u001a\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010:R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u0010:R$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00107\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010:R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b\r\u0010\u001f\"\u0004\bC\u0010DR\"\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010B\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010DR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010L¨\u0006M"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/model/OneProductPaymentSummary;", "", "", "productPrice", "discountSum", "extraAdvancePrice", "extraAdvanceAmount", "totalPaymentAmount", "", "paymentMethod", "credit4Digits", TypedValues.CycleType.S_WAVE_PERIOD, "", "isReceipt", "hasEfrom", "", "totalSumPrice", "<init>", "(FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V", "component1", "()F", "component2", "()Ljava/lang/Float;", "component3", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "()Z", "component10", "component11", "()I", "copy", "(FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)Lth/co/dtac/android/dtacone/view/appOne/device_sale/model/OneProductPaymentSummary;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getProductPrice", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Float;", "getDiscountSum", OperatorName.CURVE_TO, "getExtraAdvancePrice", "d", "getExtraAdvanceAmount", "e", "getTotalPaymentAmount", OperatorName.FILL_NON_ZERO, "Ljava/lang/String;", "getPaymentMethod", "setPaymentMethod", "(Ljava/lang/String;)V", OperatorName.NON_STROKING_GRAY, "getCredit4Digits", "setCredit4Digits", OperatorName.CLOSE_PATH, "getPeriod", "setPeriod", "i", "Z", "setReceipt", "(Z)V", OperatorName.SET_LINE_JOINSTYLE, "getHasEfrom", "setHasEfrom", OperatorName.NON_STROKING_CMYK, "I", "getTotalSumPrice", "setTotalSumPrice", "(I)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.model.OneProductPaymentSummary */
/* loaded from: classes10.dex */
public final class OneProductPaymentSummary {
    public static final int $stable = 8;

    /* renamed from: a */
    public final float f90514a;

    /* renamed from: b */
    public final Float f90515b;

    /* renamed from: c */
    public final Float f90516c;

    /* renamed from: d */
    public final Float f90517d;

    /* renamed from: e */
    public final float f90518e;

    /* renamed from: f */
    public String f90519f;

    /* renamed from: g */
    public String f90520g;

    /* renamed from: h */
    public String f90521h;

    /* renamed from: i */
    public boolean f90522i;

    /* renamed from: j */
    public boolean f90523j;

    /* renamed from: k */
    public int f90524k;

    public OneProductPaymentSummary(float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, float f5, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, boolean z2, int i) {
        this.f90514a = f;
        this.f90515b = f2;
        this.f90516c = f3;
        this.f90517d = f4;
        this.f90518e = f5;
        this.f90519f = str;
        this.f90520g = str2;
        this.f90521h = str3;
        this.f90522i = z;
        this.f90523j = z2;
        this.f90524k = i;
    }

    public final float component1() {
        return this.f90514a;
    }

    public final boolean component10() {
        return this.f90523j;
    }

    public final int component11() {
        return this.f90524k;
    }

    @Nullable
    public final Float component2() {
        return this.f90515b;
    }

    @Nullable
    public final Float component3() {
        return this.f90516c;
    }

    @Nullable
    public final Float component4() {
        return this.f90517d;
    }

    public final float component5() {
        return this.f90518e;
    }

    @Nullable
    public final String component6() {
        return this.f90519f;
    }

    @Nullable
    public final String component7() {
        return this.f90520g;
    }

    @Nullable
    public final String component8() {
        return this.f90521h;
    }

    public final boolean component9() {
        return this.f90522i;
    }

    @NotNull
    public final OneProductPaymentSummary copy(float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, float f5, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, boolean z2, int i) {
        return new OneProductPaymentSummary(f, f2, f3, f4, f5, str, str2, str3, z, z2, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneProductPaymentSummary) {
            OneProductPaymentSummary oneProductPaymentSummary = (OneProductPaymentSummary) obj;
            return Float.compare(this.f90514a, oneProductPaymentSummary.f90514a) == 0 && Intrinsics.areEqual((Object) this.f90515b, (Object) oneProductPaymentSummary.f90515b) && Intrinsics.areEqual((Object) this.f90516c, (Object) oneProductPaymentSummary.f90516c) && Intrinsics.areEqual((Object) this.f90517d, (Object) oneProductPaymentSummary.f90517d) && Float.compare(this.f90518e, oneProductPaymentSummary.f90518e) == 0 && Intrinsics.areEqual(this.f90519f, oneProductPaymentSummary.f90519f) && Intrinsics.areEqual(this.f90520g, oneProductPaymentSummary.f90520g) && Intrinsics.areEqual(this.f90521h, oneProductPaymentSummary.f90521h) && this.f90522i == oneProductPaymentSummary.f90522i && this.f90523j == oneProductPaymentSummary.f90523j && this.f90524k == oneProductPaymentSummary.f90524k;
        }
        return false;
    }

    @Nullable
    public final String getCredit4Digits() {
        return this.f90520g;
    }

    @Nullable
    public final Float getDiscountSum() {
        return this.f90515b;
    }

    @Nullable
    public final Float getExtraAdvanceAmount() {
        return this.f90517d;
    }

    @Nullable
    public final Float getExtraAdvancePrice() {
        return this.f90516c;
    }

    public final boolean getHasEfrom() {
        return this.f90523j;
    }

    @Nullable
    public final String getPaymentMethod() {
        return this.f90519f;
    }

    @Nullable
    public final String getPeriod() {
        return this.f90521h;
    }

    public final float getProductPrice() {
        return this.f90514a;
    }

    public final float getTotalPaymentAmount() {
        return this.f90518e;
    }

    public final int getTotalSumPrice() {
        return this.f90524k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int floatToIntBits = Float.floatToIntBits(this.f90514a) * 31;
        Float f = this.f90515b;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (floatToIntBits + hashCode) * 31;
        Float f2 = this.f90516c;
        if (f2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Float f3 = this.f90517d;
        if (f3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f3.hashCode();
        }
        int floatToIntBits2 = (((i3 + hashCode3) * 31) + Float.floatToIntBits(this.f90518e)) * 31;
        String str = this.f90519f;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i4 = (floatToIntBits2 + hashCode4) * 31;
        String str2 = this.f90520g;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str3 = this.f90521h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z = this.f90522i;
        int i7 = 1;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (i6 + i8) * 31;
        boolean z2 = this.f90523j;
        if (!z2) {
            i7 = z2 ? 1 : 0;
        }
        return ((i9 + i7) * 31) + this.f90524k;
    }

    public final boolean isReceipt() {
        return this.f90522i;
    }

    public final void setCredit4Digits(@Nullable String str) {
        this.f90520g = str;
    }

    public final void setHasEfrom(boolean z) {
        this.f90523j = z;
    }

    public final void setPaymentMethod(@Nullable String str) {
        this.f90519f = str;
    }

    public final void setPeriod(@Nullable String str) {
        this.f90521h = str;
    }

    public final void setReceipt(boolean z) {
        this.f90522i = z;
    }

    public final void setTotalSumPrice(int i) {
        this.f90524k = i;
    }

    @NotNull
    public String toString() {
        float f = this.f90514a;
        Float f2 = this.f90515b;
        Float f3 = this.f90516c;
        Float f4 = this.f90517d;
        float f5 = this.f90518e;
        String str = this.f90519f;
        String str2 = this.f90520g;
        String str3 = this.f90521h;
        boolean z = this.f90522i;
        boolean z2 = this.f90523j;
        int i = this.f90524k;
        return "OneProductPaymentSummary(productPrice=" + f + ", discountSum=" + f2 + ", extraAdvancePrice=" + f3 + ", extraAdvanceAmount=" + f4 + ", totalPaymentAmount=" + f5 + ", paymentMethod=" + str + ", credit4Digits=" + str2 + ", period=" + str3 + ", isReceipt=" + z + ", hasEfrom=" + z2 + ", totalSumPrice=" + i + ")";
    }

    public /* synthetic */ OneProductPaymentSummary(float f, Float f2, Float f3, Float f4, float f5, String str, String str2, String str3, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i2 & 2) != 0 ? null : f2, (i2 & 4) != 0 ? null : f3, (i2 & 8) != 0 ? null : f4, f5, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? 0 : i);
    }
}