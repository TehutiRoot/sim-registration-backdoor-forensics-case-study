package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0092\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0014J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010/R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010/R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010/R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u0010/R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010,\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010/R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010/R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010,\u001a\u0004\bC\u0010\u0014\"\u0004\bD\u0010/R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\b\f\u0010\u001d\"\u0004\bG\u0010HR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010,\u001a\u0004\bJ\u0010\u0014\"\u0004\bK\u0010/R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010,\u001a\u0004\bM\u0010\u0014\"\u0004\bN\u0010/R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010,\u001a\u0004\bP\u0010\u0014\"\u0004\bQ\u0010/R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010,\u001a\u0004\bS\u0010\u0014\"\u0004\bT\u0010/¨\u0006U"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/OneOwnerManagementThemeColorModel;", "", "", "topBarBackground", "editTextColor", "editTextBackground", "editTextCursor", "fontColor", "priceSelectBackground", "buttonBackground", "confirmTitleBackground", "", "isEnableAutoRefill", "selectedBackground", "profileImageIcon", "arrowImageIcon", "buttonBackgroundImage", "<init>", "(IIIIIIIIZIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "component10", "component11", "component12", "component13", "copy", "(IIIIIIIIZIIII)Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/OneOwnerManagementThemeColorModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getTopBarBackground", "setTopBarBackground", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEditTextColor", "setEditTextColor", OperatorName.CURVE_TO, "getEditTextBackground", "setEditTextBackground", "d", "getEditTextCursor", "setEditTextCursor", "e", "getFontColor", "setFontColor", OperatorName.FILL_NON_ZERO, "getPriceSelectBackground", "setPriceSelectBackground", OperatorName.NON_STROKING_GRAY, "getButtonBackground", "setButtonBackground", OperatorName.CLOSE_PATH, "getConfirmTitleBackground", "setConfirmTitleBackground", "i", "Z", "setEnableAutoRefill", "(Z)V", OperatorName.SET_LINE_JOINSTYLE, "getSelectedBackground", "setSelectedBackground", OperatorName.NON_STROKING_CMYK, "getProfileImageIcon", "setProfileImageIcon", OperatorName.LINE_TO, "getArrowImageIcon", "setArrowImageIcon", OperatorName.MOVE_TO, "getButtonBackgroundImage", "setButtonBackgroundImage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.OneOwnerManagementThemeColorModel */
/* loaded from: classes10.dex */
public final class OneOwnerManagementThemeColorModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f93101a;

    /* renamed from: b */
    public int f93102b;

    /* renamed from: c */
    public int f93103c;

    /* renamed from: d */
    public int f93104d;

    /* renamed from: e */
    public int f93105e;

    /* renamed from: f */
    public int f93106f;

    /* renamed from: g */
    public int f93107g;

    /* renamed from: h */
    public int f93108h;

    /* renamed from: i */
    public boolean f93109i;

    /* renamed from: j */
    public int f93110j;

    /* renamed from: k */
    public int f93111k;

    /* renamed from: l */
    public int f93112l;

    /* renamed from: m */
    public int f93113m;

    public OneOwnerManagementThemeColorModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0, 8191, null);
    }

    public final int component1() {
        return this.f93101a;
    }

    public final int component10() {
        return this.f93110j;
    }

    public final int component11() {
        return this.f93111k;
    }

    public final int component12() {
        return this.f93112l;
    }

    public final int component13() {
        return this.f93113m;
    }

    public final int component2() {
        return this.f93102b;
    }

    public final int component3() {
        return this.f93103c;
    }

    public final int component4() {
        return this.f93104d;
    }

    public final int component5() {
        return this.f93105e;
    }

    public final int component6() {
        return this.f93106f;
    }

    public final int component7() {
        return this.f93107g;
    }

    public final int component8() {
        return this.f93108h;
    }

    public final boolean component9() {
        return this.f93109i;
    }

    @NotNull
    public final OneOwnerManagementThemeColorModel copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, int i10, int i11, int i12) {
        return new OneOwnerManagementThemeColorModel(i, i2, i3, i4, i5, i6, i7, i8, z, i9, i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOwnerManagementThemeColorModel) {
            OneOwnerManagementThemeColorModel oneOwnerManagementThemeColorModel = (OneOwnerManagementThemeColorModel) obj;
            return this.f93101a == oneOwnerManagementThemeColorModel.f93101a && this.f93102b == oneOwnerManagementThemeColorModel.f93102b && this.f93103c == oneOwnerManagementThemeColorModel.f93103c && this.f93104d == oneOwnerManagementThemeColorModel.f93104d && this.f93105e == oneOwnerManagementThemeColorModel.f93105e && this.f93106f == oneOwnerManagementThemeColorModel.f93106f && this.f93107g == oneOwnerManagementThemeColorModel.f93107g && this.f93108h == oneOwnerManagementThemeColorModel.f93108h && this.f93109i == oneOwnerManagementThemeColorModel.f93109i && this.f93110j == oneOwnerManagementThemeColorModel.f93110j && this.f93111k == oneOwnerManagementThemeColorModel.f93111k && this.f93112l == oneOwnerManagementThemeColorModel.f93112l && this.f93113m == oneOwnerManagementThemeColorModel.f93113m;
        }
        return false;
    }

    public final int getArrowImageIcon() {
        return this.f93112l;
    }

    public final int getButtonBackground() {
        return this.f93107g;
    }

    public final int getButtonBackgroundImage() {
        return this.f93113m;
    }

    public final int getConfirmTitleBackground() {
        return this.f93108h;
    }

    public final int getEditTextBackground() {
        return this.f93103c;
    }

    public final int getEditTextColor() {
        return this.f93102b;
    }

    public final int getEditTextCursor() {
        return this.f93104d;
    }

    public final int getFontColor() {
        return this.f93105e;
    }

    public final int getPriceSelectBackground() {
        return this.f93106f;
    }

    public final int getProfileImageIcon() {
        return this.f93111k;
    }

    public final int getSelectedBackground() {
        return this.f93110j;
    }

    public final int getTopBarBackground() {
        return this.f93101a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((((((((((((((this.f93101a * 31) + this.f93102b) * 31) + this.f93103c) * 31) + this.f93104d) * 31) + this.f93105e) * 31) + this.f93106f) * 31) + this.f93107g) * 31) + this.f93108h) * 31;
        boolean z = this.f93109i;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((((((((i + i2) * 31) + this.f93110j) * 31) + this.f93111k) * 31) + this.f93112l) * 31) + this.f93113m;
    }

    public final boolean isEnableAutoRefill() {
        return this.f93109i;
    }

    public final void setArrowImageIcon(int i) {
        this.f93112l = i;
    }

    public final void setButtonBackground(int i) {
        this.f93107g = i;
    }

    public final void setButtonBackgroundImage(int i) {
        this.f93113m = i;
    }

    public final void setConfirmTitleBackground(int i) {
        this.f93108h = i;
    }

    public final void setEditTextBackground(int i) {
        this.f93103c = i;
    }

    public final void setEditTextColor(int i) {
        this.f93102b = i;
    }

    public final void setEditTextCursor(int i) {
        this.f93104d = i;
    }

    public final void setEnableAutoRefill(boolean z) {
        this.f93109i = z;
    }

    public final void setFontColor(int i) {
        this.f93105e = i;
    }

    public final void setPriceSelectBackground(int i) {
        this.f93106f = i;
    }

    public final void setProfileImageIcon(int i) {
        this.f93111k = i;
    }

    public final void setSelectedBackground(int i) {
        this.f93110j = i;
    }

    public final void setTopBarBackground(int i) {
        this.f93101a = i;
    }

    @NotNull
    public String toString() {
        int i = this.f93101a;
        int i2 = this.f93102b;
        int i3 = this.f93103c;
        int i4 = this.f93104d;
        int i5 = this.f93105e;
        int i6 = this.f93106f;
        int i7 = this.f93107g;
        int i8 = this.f93108h;
        boolean z = this.f93109i;
        int i9 = this.f93110j;
        int i10 = this.f93111k;
        int i11 = this.f93112l;
        int i12 = this.f93113m;
        return "OneOwnerManagementThemeColorModel(topBarBackground=" + i + ", editTextColor=" + i2 + ", editTextBackground=" + i3 + ", editTextCursor=" + i4 + ", fontColor=" + i5 + ", priceSelectBackground=" + i6 + ", buttonBackground=" + i7 + ", confirmTitleBackground=" + i8 + ", isEnableAutoRefill=" + z + ", selectedBackground=" + i9 + ", profileImageIcon=" + i10 + ", arrowImageIcon=" + i11 + ", buttonBackgroundImage=" + i12 + ")";
    }

    public OneOwnerManagementThemeColorModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, int i10, int i11, int i12) {
        this.f93101a = i;
        this.f93102b = i2;
        this.f93103c = i3;
        this.f93104d = i4;
        this.f93105e = i5;
        this.f93106f = i6;
        this.f93107g = i7;
        this.f93108h = i8;
        this.f93109i = z;
        this.f93110j = i9;
        this.f93111k = i10;
        this.f93112l = i11;
        this.f93113m = i12;
    }

    public /* synthetic */ OneOwnerManagementThemeColorModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R.color.colorAccent : i, (i13 & 2) != 0 ? R.color.colorAccent : i2, (i13 & 4) != 0 ? R.color.colorAccent : i3, (i13 & 8) != 0 ? R.color.colorAccent : i4, (i13 & 16) != 0 ? R.color.colorAccent : i5, (i13 & 32) != 0 ? R.color.colorAccent : i6, (i13 & 64) != 0 ? R.color.colorAccent : i7, (i13 & 128) != 0 ? R.color.colorAccent : i8, (i13 & 256) != 0 ? true : z, (i13 & 512) != 0 ? R.color.colorAccent : i9, (i13 & 1024) != 0 ? R.drawable.ic_profile_blue : i10, (i13 & 2048) != 0 ? R.drawable.ic_arrow_right_one_blue : i11, (i13 & 4096) != 0 ? R.drawable.background_white_button_one_blue_border : i12);
    }
}