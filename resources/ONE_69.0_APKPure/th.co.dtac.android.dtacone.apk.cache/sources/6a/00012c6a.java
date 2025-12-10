package th.p047co.dtac.android.dtacone.view.appOne.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/common/model/OneDialogThemeColors;", "", "", "fontColor", "buttonBackground", "topBarBackground", "<init>", "(III)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getFontColor", "()I", "setFontColor", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getButtonBackground", "setButtonBackground", OperatorName.CURVE_TO, "getTopBarBackground", "setTopBarBackground", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.common.model.OneDialogThemeColors */
/* loaded from: classes10.dex */
public final class OneDialogThemeColors {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f89598a;

    /* renamed from: b */
    public int f89599b;

    /* renamed from: c */
    public int f89600c;

    public OneDialogThemeColors() {
        this(0, 0, 0, 7, null);
    }

    public final int getButtonBackground() {
        return this.f89599b;
    }

    public final int getFontColor() {
        return this.f89598a;
    }

    public final int getTopBarBackground() {
        return this.f89600c;
    }

    public final void setButtonBackground(int i) {
        this.f89599b = i;
    }

    public final void setFontColor(int i) {
        this.f89598a = i;
    }

    public final void setTopBarBackground(int i) {
        this.f89600c = i;
    }

    public OneDialogThemeColors(int i, int i2, int i3) {
        this.f89598a = i;
        this.f89599b = i2;
        this.f89600c = i3;
    }

    public /* synthetic */ OneDialogThemeColors(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? R.color.darkBlueFive : i, (i4 & 2) != 0 ? R.drawable.background_one_button_blue : i2, (i4 & 4) != 0 ? R.drawable.background_one_toolbar_blue : i3);
    }
}