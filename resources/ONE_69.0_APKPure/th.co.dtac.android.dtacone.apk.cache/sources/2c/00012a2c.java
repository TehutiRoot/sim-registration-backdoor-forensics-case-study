package th.p047co.dtac.android.dtacone.view.appOne.buyDol.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OnePriceListData;", "", "", "amount", "", "fee", "total", "<init>", "(IFF)V", "component1", "()I", "component2", "()F", "component3", "copy", "(IFF)Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OnePriceListData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getAmount", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getFee", OperatorName.CURVE_TO, "getTotal", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.OnePriceListData */
/* loaded from: classes10.dex */
public final class OnePriceListData {
    public static final int $stable = 0;
    @SerializedName("amount")

    /* renamed from: a */
    private final int f88535a;
    @SerializedName("fee")

    /* renamed from: b */
    private final float f88536b;
    @SerializedName("total")

    /* renamed from: c */
    private final float f88537c;

    public OnePriceListData(int i, float f, float f2) {
        this.f88535a = i;
        this.f88536b = f;
        this.f88537c = f2;
    }

    public static /* synthetic */ OnePriceListData copy$default(OnePriceListData onePriceListData, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = onePriceListData.f88535a;
        }
        if ((i2 & 2) != 0) {
            f = onePriceListData.f88536b;
        }
        if ((i2 & 4) != 0) {
            f2 = onePriceListData.f88537c;
        }
        return onePriceListData.copy(i, f, f2);
    }

    public final int component1() {
        return this.f88535a;
    }

    public final float component2() {
        return this.f88536b;
    }

    public final float component3() {
        return this.f88537c;
    }

    @NotNull
    public final OnePriceListData copy(int i, float f, float f2) {
        return new OnePriceListData(i, f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePriceListData) {
            OnePriceListData onePriceListData = (OnePriceListData) obj;
            return this.f88535a == onePriceListData.f88535a && Float.compare(this.f88536b, onePriceListData.f88536b) == 0 && Float.compare(this.f88537c, onePriceListData.f88537c) == 0;
        }
        return false;
    }

    public final int getAmount() {
        return this.f88535a;
    }

    public final float getFee() {
        return this.f88536b;
    }

    public final float getTotal() {
        return this.f88537c;
    }

    public int hashCode() {
        return (((this.f88535a * 31) + Float.floatToIntBits(this.f88536b)) * 31) + Float.floatToIntBits(this.f88537c);
    }

    @NotNull
    public String toString() {
        int i = this.f88535a;
        float f = this.f88536b;
        float f2 = this.f88537c;
        return "OnePriceListData(amount=" + i + ", fee=" + f + ", total=" + f2 + ")";
    }
}