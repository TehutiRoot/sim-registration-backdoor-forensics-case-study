package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\\\b\u0007\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#\"\u0004\b-\u0010.R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b0\u0010#\"\u0004\b1\u0010.R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u0010#\"\u0004\b4\u0010.R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010#\"\u0004\b7\u0010.R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010#\"\u0004\b:\u0010.R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010+\u001a\u0004\b<\u0010#\"\u0004\b=\u0010.R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010+\u001a\u0004\b?\u0010#\"\u0004\b@\u0010.R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010+\u001a\u0004\bB\u0010#\"\u0004\bC\u0010.R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010+\u001a\u0004\bE\u0010#\"\u0004\bF\u0010.R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010+\u001a\u0004\bH\u0010#\"\u0004\bI\u0010.R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010#\"\u0004\bL\u0010.R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010+\u001a\u0004\bN\u0010#\"\u0004\bO\u0010.R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010+\u001a\u0004\bQ\u0010#\"\u0004\bR\u0010.R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010+\u001a\u0004\bT\u0010#\"\u0004\bU\u0010.R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010+\u001a\u0004\bW\u0010#\"\u0004\bX\u0010.R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010+\u001a\u0004\b`\u0010#\"\u0004\ba\u0010.R\"\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010Z\u001a\u0004\bc\u0010\\\"\u0004\bd\u0010^R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010+\u001a\u0004\bf\u0010#\"\u0004\bg\u0010.R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010+\u001a\u0004\bi\u0010#\"\u0004\bj\u0010.R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010+\u001a\u0004\bl\u0010#\"\u0004\bm\u0010.R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010+\u001a\u0004\bo\u0010#\"\u0004\bp\u0010.R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010+\u001a\u0004\br\u0010#\"\u0004\bs\u0010.R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010+\u001a\u0004\bu\u0010#\"\u0004\bv\u0010.R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010+\u001a\u0004\bx\u0010#\"\u0004\by\u0010.R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010+\u001a\u0004\b{\u0010#\"\u0004\b|\u0010.R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010+\u001a\u0004\b~\u0010#\"\u0004\b\u007f\u0010.R%\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010+\u001a\u0005\b\u0081\u0001\u0010#\"\u0005\b\u0082\u0001\u0010.¨\u0006\u0083\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/PrepaidThemeColorModel;", "Landroid/os/Parcelable;", "", "topBarBackground", "editTextColor", "editTextHighlightColor", "editTextBackground", "editTextCursor", "dialogSuccessIcon", "buttonBackground", "buttonBackgroundRegis", "buttonBackgroundRounded", "fontColor", "fontColorDialog", "titleBackground", "switchSmartCardBackground", "switchButtonSmartCardBackground", "tabColor", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "tabBackgroundColors", "dotColor", "tabConsentBackgroundColors", "icConsentTelco", "icConsentNonTelco", "icConsentTMN", "icLogoTMN", "icLogo", "buttonBackgroundNotallow", "icPrint", "icTopup", "icProserm", "icChangePro", "<init>", "(IIIIIIIIIIIIIIILth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;ILth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;IIIIIIIIII)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getTopBarBackground", "setTopBarBackground", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEditTextColor", "setEditTextColor", OperatorName.CURVE_TO, "getEditTextHighlightColor", "setEditTextHighlightColor", "d", "getEditTextBackground", "setEditTextBackground", "e", "getEditTextCursor", "setEditTextCursor", OperatorName.FILL_NON_ZERO, "getDialogSuccessIcon", "setDialogSuccessIcon", OperatorName.NON_STROKING_GRAY, "getButtonBackground", "setButtonBackground", OperatorName.CLOSE_PATH, "getButtonBackgroundRegis", "setButtonBackgroundRegis", "i", "getButtonBackgroundRounded", "setButtonBackgroundRounded", OperatorName.SET_LINE_JOINSTYLE, "getFontColor", "setFontColor", OperatorName.NON_STROKING_CMYK, "getFontColorDialog", "setFontColorDialog", OperatorName.LINE_TO, "getTitleBackground", "setTitleBackground", OperatorName.MOVE_TO, "getSwitchSmartCardBackground", "setSwitchSmartCardBackground", OperatorName.ENDPATH, "getSwitchButtonSmartCardBackground", "setSwitchButtonSmartCardBackground", "o", "getTabColor", "setTabColor", "p", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "getTabBackgroundColors", "()Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "setTabBackgroundColors", "(Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;)V", OperatorName.SAVE, "getDotColor", "setDotColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getTabConsentBackgroundColors", "setTabConsentBackgroundColors", OperatorName.CLOSE_AND_STROKE, "getIcConsentTelco", "setIcConsentTelco", "t", "getIcConsentNonTelco", "setIcConsentNonTelco", "u", "getIcConsentTMN", "setIcConsentTMN", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getIcLogoTMN", "setIcLogoTMN", OperatorName.SET_LINE_WIDTH, "getIcLogo", "setIcLogo", "x", "getButtonBackgroundNotallow", "setButtonBackgroundNotallow", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getIcPrint", "setIcPrint", "z", "getIcTopup", "setIcTopup", "A", "getIcProserm", "setIcProserm", "B", "getIcChangePro", "setIcChangePro", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.PrepaidThemeColorModel */
/* loaded from: classes10.dex */
public final class PrepaidThemeColorModel implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<PrepaidThemeColorModel> CREATOR = new Creator();

    /* renamed from: A */
    public int f95905A;

    /* renamed from: B */
    public int f95906B;

    /* renamed from: a */
    public int f95907a;

    /* renamed from: b */
    public int f95908b;

    /* renamed from: c */
    public int f95909c;

    /* renamed from: d */
    public int f95910d;

    /* renamed from: e */
    public int f95911e;

    /* renamed from: f */
    public int f95912f;

    /* renamed from: g */
    public int f95913g;

    /* renamed from: h */
    public int f95914h;

    /* renamed from: i */
    public int f95915i;

    /* renamed from: j */
    public int f95916j;

    /* renamed from: k */
    public int f95917k;

    /* renamed from: l */
    public int f95918l;

    /* renamed from: m */
    public int f95919m;

    /* renamed from: n */
    public int f95920n;

    /* renamed from: o */
    public int f95921o;

    /* renamed from: p */
    public TabBackgroundColors f95922p;

    /* renamed from: q */
    public int f95923q;

    /* renamed from: r */
    public TabBackgroundColors f95924r;

    /* renamed from: s */
    public int f95925s;

    /* renamed from: t */
    public int f95926t;

    /* renamed from: u */
    public int f95927u;

    /* renamed from: v */
    public int f95928v;

    /* renamed from: w */
    public int f95929w;

    /* renamed from: x */
    public int f95930x;

    /* renamed from: y */
    public int f95931y;

    /* renamed from: z */
    public int f95932z;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.PrepaidThemeColorModel$Creator */
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<PrepaidThemeColorModel> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrepaidThemeColorModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            int readInt8 = parcel.readInt();
            int readInt9 = parcel.readInt();
            int readInt10 = parcel.readInt();
            int readInt11 = parcel.readInt();
            int readInt12 = parcel.readInt();
            int readInt13 = parcel.readInt();
            int readInt14 = parcel.readInt();
            int readInt15 = parcel.readInt();
            Parcelable.Creator<TabBackgroundColors> creator = TabBackgroundColors.CREATOR;
            return new PrepaidThemeColorModel(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, readInt13, readInt14, readInt15, creator.createFromParcel(parcel), parcel.readInt(), creator.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PrepaidThemeColorModel[] newArray(int i) {
            return new PrepaidThemeColorModel[i];
        }
    }

    public PrepaidThemeColorModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 268435455, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getButtonBackground() {
        return this.f95913g;
    }

    public final int getButtonBackgroundNotallow() {
        return this.f95930x;
    }

    public final int getButtonBackgroundRegis() {
        return this.f95914h;
    }

    public final int getButtonBackgroundRounded() {
        return this.f95915i;
    }

    public final int getDialogSuccessIcon() {
        return this.f95912f;
    }

    public final int getDotColor() {
        return this.f95923q;
    }

    public final int getEditTextBackground() {
        return this.f95910d;
    }

    public final int getEditTextColor() {
        return this.f95908b;
    }

    public final int getEditTextCursor() {
        return this.f95911e;
    }

    public final int getEditTextHighlightColor() {
        return this.f95909c;
    }

    public final int getFontColor() {
        return this.f95916j;
    }

    public final int getFontColorDialog() {
        return this.f95917k;
    }

    public final int getIcChangePro() {
        return this.f95906B;
    }

    public final int getIcConsentNonTelco() {
        return this.f95926t;
    }

    public final int getIcConsentTMN() {
        return this.f95927u;
    }

    public final int getIcConsentTelco() {
        return this.f95925s;
    }

    public final int getIcLogo() {
        return this.f95929w;
    }

    public final int getIcLogoTMN() {
        return this.f95928v;
    }

    public final int getIcPrint() {
        return this.f95931y;
    }

    public final int getIcProserm() {
        return this.f95905A;
    }

    public final int getIcTopup() {
        return this.f95932z;
    }

    public final int getSwitchButtonSmartCardBackground() {
        return this.f95920n;
    }

    public final int getSwitchSmartCardBackground() {
        return this.f95919m;
    }

    @NotNull
    public final TabBackgroundColors getTabBackgroundColors() {
        return this.f95922p;
    }

    public final int getTabColor() {
        return this.f95921o;
    }

    @NotNull
    public final TabBackgroundColors getTabConsentBackgroundColors() {
        return this.f95924r;
    }

    public final int getTitleBackground() {
        return this.f95918l;
    }

    public final int getTopBarBackground() {
        return this.f95907a;
    }

    public final void setButtonBackground(int i) {
        this.f95913g = i;
    }

    public final void setButtonBackgroundNotallow(int i) {
        this.f95930x = i;
    }

    public final void setButtonBackgroundRegis(int i) {
        this.f95914h = i;
    }

    public final void setButtonBackgroundRounded(int i) {
        this.f95915i = i;
    }

    public final void setDialogSuccessIcon(int i) {
        this.f95912f = i;
    }

    public final void setDotColor(int i) {
        this.f95923q = i;
    }

    public final void setEditTextBackground(int i) {
        this.f95910d = i;
    }

    public final void setEditTextColor(int i) {
        this.f95908b = i;
    }

    public final void setEditTextCursor(int i) {
        this.f95911e = i;
    }

    public final void setEditTextHighlightColor(int i) {
        this.f95909c = i;
    }

    public final void setFontColor(int i) {
        this.f95916j = i;
    }

    public final void setFontColorDialog(int i) {
        this.f95917k = i;
    }

    public final void setIcChangePro(int i) {
        this.f95906B = i;
    }

    public final void setIcConsentNonTelco(int i) {
        this.f95926t = i;
    }

    public final void setIcConsentTMN(int i) {
        this.f95927u = i;
    }

    public final void setIcConsentTelco(int i) {
        this.f95925s = i;
    }

    public final void setIcLogo(int i) {
        this.f95929w = i;
    }

    public final void setIcLogoTMN(int i) {
        this.f95928v = i;
    }

    public final void setIcPrint(int i) {
        this.f95931y = i;
    }

    public final void setIcProserm(int i) {
        this.f95905A = i;
    }

    public final void setIcTopup(int i) {
        this.f95932z = i;
    }

    public final void setSwitchButtonSmartCardBackground(int i) {
        this.f95920n = i;
    }

    public final void setSwitchSmartCardBackground(int i) {
        this.f95919m = i;
    }

    public final void setTabBackgroundColors(@NotNull TabBackgroundColors tabBackgroundColors) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "<set-?>");
        this.f95922p = tabBackgroundColors;
    }

    public final void setTabColor(int i) {
        this.f95921o = i;
    }

    public final void setTabConsentBackgroundColors(@NotNull TabBackgroundColors tabBackgroundColors) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "<set-?>");
        this.f95924r = tabBackgroundColors;
    }

    public final void setTitleBackground(int i) {
        this.f95918l = i;
    }

    public final void setTopBarBackground(int i) {
        this.f95907a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f95907a);
        out.writeInt(this.f95908b);
        out.writeInt(this.f95909c);
        out.writeInt(this.f95910d);
        out.writeInt(this.f95911e);
        out.writeInt(this.f95912f);
        out.writeInt(this.f95913g);
        out.writeInt(this.f95914h);
        out.writeInt(this.f95915i);
        out.writeInt(this.f95916j);
        out.writeInt(this.f95917k);
        out.writeInt(this.f95918l);
        out.writeInt(this.f95919m);
        out.writeInt(this.f95920n);
        out.writeInt(this.f95921o);
        this.f95922p.writeToParcel(out, i);
        out.writeInt(this.f95923q);
        this.f95924r.writeToParcel(out, i);
        out.writeInt(this.f95925s);
        out.writeInt(this.f95926t);
        out.writeInt(this.f95927u);
        out.writeInt(this.f95928v);
        out.writeInt(this.f95929w);
        out.writeInt(this.f95930x);
        out.writeInt(this.f95931y);
        out.writeInt(this.f95932z);
        out.writeInt(this.f95905A);
        out.writeInt(this.f95906B);
    }

    public PrepaidThemeColorModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, @NotNull TabBackgroundColors tabBackgroundColors, int i16, @NotNull TabBackgroundColors tabConsentBackgroundColors, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "tabBackgroundColors");
        Intrinsics.checkNotNullParameter(tabConsentBackgroundColors, "tabConsentBackgroundColors");
        this.f95907a = i;
        this.f95908b = i2;
        this.f95909c = i3;
        this.f95910d = i4;
        this.f95911e = i5;
        this.f95912f = i6;
        this.f95913g = i7;
        this.f95914h = i8;
        this.f95915i = i9;
        this.f95916j = i10;
        this.f95917k = i11;
        this.f95918l = i12;
        this.f95919m = i13;
        this.f95920n = i14;
        this.f95921o = i15;
        this.f95922p = tabBackgroundColors;
        this.f95923q = i16;
        this.f95924r = tabConsentBackgroundColors;
        this.f95925s = i17;
        this.f95926t = i18;
        this.f95927u = i19;
        this.f95928v = i20;
        this.f95929w = i21;
        this.f95930x = i22;
        this.f95931y = i23;
        this.f95932z = i24;
        this.f95905A = i25;
        this.f95906B = i26;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ PrepaidThemeColorModel(int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors r44, int r45, th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, kotlin.jvm.internal.DefaultConstructorMarker r58) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.PrepaidThemeColorModel.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors, int, th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors, int, int, int, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}