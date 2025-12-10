package th.p047co.dtac.android.dtacone.view.appOne.about.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u001a¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/about/model/ThemeColorModel;", "", "", "topBarBackground", "fontColor", "bgTapTitle", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lth/co/dtac/android/dtacone/view/appOne/about/model/ThemeColorModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getTopBarBackground", "setTopBarBackground", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFontColor", "setFontColor", OperatorName.CURVE_TO, "getBgTapTitle", "setBgTapTitle", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.about.model.ThemeColorModel */
/* loaded from: classes10.dex */
public final class ThemeColorModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f88102a;

    /* renamed from: b */
    public int f88103b;

    /* renamed from: c */
    public int f88104c;

    public ThemeColorModel() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ ThemeColorModel copy$default(ThemeColorModel themeColorModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = themeColorModel.f88102a;
        }
        if ((i4 & 2) != 0) {
            i2 = themeColorModel.f88103b;
        }
        if ((i4 & 4) != 0) {
            i3 = themeColorModel.f88104c;
        }
        return themeColorModel.copy(i, i2, i3);
    }

    public final int component1() {
        return this.f88102a;
    }

    public final int component2() {
        return this.f88103b;
    }

    public final int component3() {
        return this.f88104c;
    }

    @NotNull
    public final ThemeColorModel copy(int i, int i2, int i3) {
        return new ThemeColorModel(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThemeColorModel) {
            ThemeColorModel themeColorModel = (ThemeColorModel) obj;
            return this.f88102a == themeColorModel.f88102a && this.f88103b == themeColorModel.f88103b && this.f88104c == themeColorModel.f88104c;
        }
        return false;
    }

    public final int getBgTapTitle() {
        return this.f88104c;
    }

    public final int getFontColor() {
        return this.f88103b;
    }

    public final int getTopBarBackground() {
        return this.f88102a;
    }

    public int hashCode() {
        return (((this.f88102a * 31) + this.f88103b) * 31) + this.f88104c;
    }

    public final void setBgTapTitle(int i) {
        this.f88104c = i;
    }

    public final void setFontColor(int i) {
        this.f88103b = i;
    }

    public final void setTopBarBackground(int i) {
        this.f88102a = i;
    }

    @NotNull
    public String toString() {
        int i = this.f88102a;
        int i2 = this.f88103b;
        int i3 = this.f88104c;
        return "ThemeColorModel(topBarBackground=" + i + ", fontColor=" + i2 + ", bgTapTitle=" + i3 + ")";
    }

    public ThemeColorModel(int i, int i2, int i3) {
        this.f88102a = i;
        this.f88103b = i2;
        this.f88104c = i3;
    }

    public /* synthetic */ ThemeColorModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? R.color.colorAccent : i, (i4 & 2) != 0 ? R.color.niceBlue : i2, (i4 & 4) != 0 ? R.drawable.bg_tap_rtr_true : i3);
    }
}