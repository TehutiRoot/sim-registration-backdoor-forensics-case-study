package th.p047co.dtac.android.dtacone.view.appOne.topup.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J\u009c\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0015J\u001a\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u00101R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u00101R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010.\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u00101R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u0010\u0015\"\u0004\b:\u00101R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010.\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u00101R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010.\u001a\u0004\b?\u0010\u0015\"\u0004\b@\u00101R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010.\u001a\u0004\bB\u0010\u0015\"\u0004\bC\u00101R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010.\u001a\u0004\bE\u0010\u0015\"\u0004\bF\u00101R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010.\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u00101R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010.\u001a\u0004\bK\u0010\u0015\"\u0004\bL\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\b\u000e\u0010 \"\u0004\bO\u0010PR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010.\u001a\u0004\bR\u0010\u0015\"\u0004\bS\u00101R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010.\u001a\u0004\bU\u0010\u0015\"\u0004\bV\u00101R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010.\u001a\u0004\bX\u0010\u0015\"\u0004\bY\u00101¨\u0006Z"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/topup/model/TopupThemeColorModel;", "", "", "topBarBackground", "buyDolBackground", "editTextColor", "editTextHighlightColor", "editTextBackground", "editTextCursor", "fontColor", "priceSelectBackground", "buttonBackground", "confirmTitleBackground", "", "isEnableAutoRefill", "selectedBackground", "dialogSuccessIcon", "iconRetry", "<init>", "(IIIIIIIIIIZIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "component14", "copy", "(IIIIIIIIIIZIII)Lth/co/dtac/android/dtacone/view/appOne/topup/model/TopupThemeColorModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getTopBarBackground", "setTopBarBackground", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBuyDolBackground", "setBuyDolBackground", OperatorName.CURVE_TO, "getEditTextColor", "setEditTextColor", "d", "getEditTextHighlightColor", "setEditTextHighlightColor", "e", "getEditTextBackground", "setEditTextBackground", OperatorName.FILL_NON_ZERO, "getEditTextCursor", "setEditTextCursor", OperatorName.NON_STROKING_GRAY, "getFontColor", "setFontColor", OperatorName.CLOSE_PATH, "getPriceSelectBackground", "setPriceSelectBackground", "i", "getButtonBackground", "setButtonBackground", OperatorName.SET_LINE_JOINSTYLE, "getConfirmTitleBackground", "setConfirmTitleBackground", OperatorName.NON_STROKING_CMYK, "Z", "setEnableAutoRefill", "(Z)V", OperatorName.LINE_TO, "getSelectedBackground", "setSelectedBackground", OperatorName.MOVE_TO, "getDialogSuccessIcon", "setDialogSuccessIcon", OperatorName.ENDPATH, "getIconRetry", "setIconRetry", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.model.TopupThemeColorModel */
/* loaded from: classes10.dex */
public final class TopupThemeColorModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f98505a;

    /* renamed from: b */
    public int f98506b;

    /* renamed from: c */
    public int f98507c;

    /* renamed from: d */
    public int f98508d;

    /* renamed from: e */
    public int f98509e;

    /* renamed from: f */
    public int f98510f;

    /* renamed from: g */
    public int f98511g;

    /* renamed from: h */
    public int f98512h;

    /* renamed from: i */
    public int f98513i;

    /* renamed from: j */
    public int f98514j;

    /* renamed from: k */
    public boolean f98515k;

    /* renamed from: l */
    public int f98516l;

    /* renamed from: m */
    public int f98517m;

    /* renamed from: n */
    public int f98518n;

    public TopupThemeColorModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 16383, null);
    }

    public final int component1() {
        return this.f98505a;
    }

    public final int component10() {
        return this.f98514j;
    }

    public final boolean component11() {
        return this.f98515k;
    }

    public final int component12() {
        return this.f98516l;
    }

    public final int component13() {
        return this.f98517m;
    }

    public final int component14() {
        return this.f98518n;
    }

    public final int component2() {
        return this.f98506b;
    }

    public final int component3() {
        return this.f98507c;
    }

    public final int component4() {
        return this.f98508d;
    }

    public final int component5() {
        return this.f98509e;
    }

    public final int component6() {
        return this.f98510f;
    }

    public final int component7() {
        return this.f98511g;
    }

    public final int component8() {
        return this.f98512h;
    }

    public final int component9() {
        return this.f98513i;
    }

    @NotNull
    public final TopupThemeColorModel copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, int i12, int i13) {
        return new TopupThemeColorModel(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, z, i11, i12, i13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopupThemeColorModel) {
            TopupThemeColorModel topupThemeColorModel = (TopupThemeColorModel) obj;
            return this.f98505a == topupThemeColorModel.f98505a && this.f98506b == topupThemeColorModel.f98506b && this.f98507c == topupThemeColorModel.f98507c && this.f98508d == topupThemeColorModel.f98508d && this.f98509e == topupThemeColorModel.f98509e && this.f98510f == topupThemeColorModel.f98510f && this.f98511g == topupThemeColorModel.f98511g && this.f98512h == topupThemeColorModel.f98512h && this.f98513i == topupThemeColorModel.f98513i && this.f98514j == topupThemeColorModel.f98514j && this.f98515k == topupThemeColorModel.f98515k && this.f98516l == topupThemeColorModel.f98516l && this.f98517m == topupThemeColorModel.f98517m && this.f98518n == topupThemeColorModel.f98518n;
        }
        return false;
    }

    public final int getButtonBackground() {
        return this.f98513i;
    }

    public final int getBuyDolBackground() {
        return this.f98506b;
    }

    public final int getConfirmTitleBackground() {
        return this.f98514j;
    }

    public final int getDialogSuccessIcon() {
        return this.f98517m;
    }

    public final int getEditTextBackground() {
        return this.f98509e;
    }

    public final int getEditTextColor() {
        return this.f98507c;
    }

    public final int getEditTextCursor() {
        return this.f98510f;
    }

    public final int getEditTextHighlightColor() {
        return this.f98508d;
    }

    public final int getFontColor() {
        return this.f98511g;
    }

    public final int getIconRetry() {
        return this.f98518n;
    }

    public final int getPriceSelectBackground() {
        return this.f98512h;
    }

    public final int getSelectedBackground() {
        return this.f98516l;
    }

    public final int getTopBarBackground() {
        return this.f98505a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((((((((((((((((((this.f98505a * 31) + this.f98506b) * 31) + this.f98507c) * 31) + this.f98508d) * 31) + this.f98509e) * 31) + this.f98510f) * 31) + this.f98511g) * 31) + this.f98512h) * 31) + this.f98513i) * 31) + this.f98514j) * 31;
        boolean z = this.f98515k;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((((((i + i2) * 31) + this.f98516l) * 31) + this.f98517m) * 31) + this.f98518n;
    }

    public final boolean isEnableAutoRefill() {
        return this.f98515k;
    }

    public final void setButtonBackground(int i) {
        this.f98513i = i;
    }

    public final void setBuyDolBackground(int i) {
        this.f98506b = i;
    }

    public final void setConfirmTitleBackground(int i) {
        this.f98514j = i;
    }

    public final void setDialogSuccessIcon(int i) {
        this.f98517m = i;
    }

    public final void setEditTextBackground(int i) {
        this.f98509e = i;
    }

    public final void setEditTextColor(int i) {
        this.f98507c = i;
    }

    public final void setEditTextCursor(int i) {
        this.f98510f = i;
    }

    public final void setEditTextHighlightColor(int i) {
        this.f98508d = i;
    }

    public final void setEnableAutoRefill(boolean z) {
        this.f98515k = z;
    }

    public final void setFontColor(int i) {
        this.f98511g = i;
    }

    public final void setIconRetry(int i) {
        this.f98518n = i;
    }

    public final void setPriceSelectBackground(int i) {
        this.f98512h = i;
    }

    public final void setSelectedBackground(int i) {
        this.f98516l = i;
    }

    public final void setTopBarBackground(int i) {
        this.f98505a = i;
    }

    @NotNull
    public String toString() {
        int i = this.f98505a;
        int i2 = this.f98506b;
        int i3 = this.f98507c;
        int i4 = this.f98508d;
        int i5 = this.f98509e;
        int i6 = this.f98510f;
        int i7 = this.f98511g;
        int i8 = this.f98512h;
        int i9 = this.f98513i;
        int i10 = this.f98514j;
        boolean z = this.f98515k;
        int i11 = this.f98516l;
        int i12 = this.f98517m;
        int i13 = this.f98518n;
        return "TopupThemeColorModel(topBarBackground=" + i + ", buyDolBackground=" + i2 + ", editTextColor=" + i3 + ", editTextHighlightColor=" + i4 + ", editTextBackground=" + i5 + ", editTextCursor=" + i6 + ", fontColor=" + i7 + ", priceSelectBackground=" + i8 + ", buttonBackground=" + i9 + ", confirmTitleBackground=" + i10 + ", isEnableAutoRefill=" + z + ", selectedBackground=" + i11 + ", dialogSuccessIcon=" + i12 + ", iconRetry=" + i13 + ")";
    }

    public TopupThemeColorModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, int i12, int i13) {
        this.f98505a = i;
        this.f98506b = i2;
        this.f98507c = i3;
        this.f98508d = i4;
        this.f98509e = i5;
        this.f98510f = i6;
        this.f98511g = i7;
        this.f98512h = i8;
        this.f98513i = i9;
        this.f98514j = i10;
        this.f98515k = z;
        this.f98516l = i11;
        this.f98517m = i12;
        this.f98518n = i13;
    }

    public /* synthetic */ TopupThemeColorModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? R.color.colorAccent : i, (i14 & 2) != 0 ? R.color.colorAccent : i2, (i14 & 4) != 0 ? R.color.colorAccent : i3, (i14 & 8) != 0 ? R.color.highlightColor : i4, (i14 & 16) != 0 ? R.color.colorAccent : i5, (i14 & 32) != 0 ? R.color.colorAccent : i6, (i14 & 64) != 0 ? R.color.colorAccent : i7, (i14 & 128) != 0 ? R.color.colorAccent : i8, (i14 & 256) != 0 ? R.color.colorAccent : i9, (i14 & 512) != 0 ? R.color.colorAccent : i10, (i14 & 1024) != 0 ? true : z, (i14 & 2048) != 0 ? R.color.colorAccent : i11, (i14 & 4096) != 0 ? R.drawable.success_dialog : i12, (i14 & 8192) != 0 ? R.drawable.ic_one_retry : i13);
    }
}