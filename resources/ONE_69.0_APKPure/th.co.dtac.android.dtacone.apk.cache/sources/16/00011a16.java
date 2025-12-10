package th.p047co.dtac.android.dtacone.model.appOne.change_owner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0019HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003Já\u0001\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001J\t\u0010a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010eHÖ\u0003J\t\u0010f\u001a\u00020\u0003HÖ\u0001J\t\u0010g\u001a\u00020hHÖ\u0001J\u0019\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010\u001eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001c\"\u0004\bJ\u0010\u001e¨\u0006n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/change_owner/OneChangeOwnerThemeColorModel;", "Landroid/os/Parcelable;", "mainTheme", "", "topBarBackground", "editTextColor", "editTextHighlightColor", "editTextBackground", "editTextCursor", "fontColor", "buttonBackground", "otpEditTextBackground", "switchModeBackground", "switchModeFontColor", "formTabColor", "fontColorDialog", "buttonBackgroundRounded", "tabBackgroundColors", "", "backgroundTitleForm", "dotColor", "successIconColor", "tabBarFontColor", "tabColor", "tabConsentBackgroundColors", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "(IIIIIIIIIIIIIILjava/util/List;IIIIILth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;)V", "getBackgroundTitleForm", "()I", "setBackgroundTitleForm", "(I)V", "getButtonBackground", "setButtonBackground", "getButtonBackgroundRounded", "setButtonBackgroundRounded", "getDotColor", "setDotColor", "getEditTextBackground", "setEditTextBackground", "getEditTextColor", "setEditTextColor", "getEditTextCursor", "setEditTextCursor", "getEditTextHighlightColor", "setEditTextHighlightColor", "getFontColor", "setFontColor", "getFontColorDialog", "setFontColorDialog", "getFormTabColor", "setFormTabColor", "getMainTheme", "setMainTheme", "getOtpEditTextBackground", "setOtpEditTextBackground", "getSuccessIconColor", "setSuccessIconColor", "getSwitchModeBackground", "setSwitchModeBackground", "getSwitchModeFontColor", "setSwitchModeFontColor", "getTabBackgroundColors", "()Ljava/util/List;", "setTabBackgroundColors", "(Ljava/util/List;)V", "getTabBarFontColor", "setTabBarFontColor", "getTabColor", "setTabColor", "getTabConsentBackgroundColors", "()Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "setTabConsentBackgroundColors", "(Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;)V", "getTopBarBackground", "setTopBarBackground", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.change_owner.OneChangeOwnerThemeColorModel */
/* loaded from: classes8.dex */
public final class OneChangeOwnerThemeColorModel implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OneChangeOwnerThemeColorModel> CREATOR = new Creator();
    private int backgroundTitleForm;
    private int buttonBackground;
    private int buttonBackgroundRounded;
    private int dotColor;
    private int editTextBackground;
    private int editTextColor;
    private int editTextCursor;
    private int editTextHighlightColor;
    private int fontColor;
    private int fontColorDialog;
    private int formTabColor;
    private int mainTheme;
    private int otpEditTextBackground;
    private int successIconColor;
    private int switchModeBackground;
    private int switchModeFontColor;
    @NotNull
    private List<Integer> tabBackgroundColors;
    private int tabBarFontColor;
    private int tabColor;
    @NotNull
    private TabBackgroundColors tabConsentBackgroundColors;
    private int topBarBackground;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.change_owner.OneChangeOwnerThemeColorModel$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<OneChangeOwnerThemeColorModel> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneChangeOwnerThemeColorModel createFromParcel(@NotNull Parcel parcel) {
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
            ArrayList arrayList = new ArrayList(readInt15);
            int i = 0;
            while (i != readInt15) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
                i++;
                readInt15 = readInt15;
            }
            return new OneChangeOwnerThemeColorModel(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, readInt13, readInt14, arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), TabBackgroundColors.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneChangeOwnerThemeColorModel[] newArray(int i) {
            return new OneChangeOwnerThemeColorModel[i];
        }
    }

    public OneChangeOwnerThemeColorModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 2097151, null);
    }

    public final int component1() {
        return this.mainTheme;
    }

    public final int component10() {
        return this.switchModeBackground;
    }

    public final int component11() {
        return this.switchModeFontColor;
    }

    public final int component12() {
        return this.formTabColor;
    }

    public final int component13() {
        return this.fontColorDialog;
    }

    public final int component14() {
        return this.buttonBackgroundRounded;
    }

    @NotNull
    public final List<Integer> component15() {
        return this.tabBackgroundColors;
    }

    public final int component16() {
        return this.backgroundTitleForm;
    }

    public final int component17() {
        return this.dotColor;
    }

    public final int component18() {
        return this.successIconColor;
    }

    public final int component19() {
        return this.tabBarFontColor;
    }

    public final int component2() {
        return this.topBarBackground;
    }

    public final int component20() {
        return this.tabColor;
    }

    @NotNull
    public final TabBackgroundColors component21() {
        return this.tabConsentBackgroundColors;
    }

    public final int component3() {
        return this.editTextColor;
    }

    public final int component4() {
        return this.editTextHighlightColor;
    }

    public final int component5() {
        return this.editTextBackground;
    }

    public final int component6() {
        return this.editTextCursor;
    }

    public final int component7() {
        return this.fontColor;
    }

    public final int component8() {
        return this.buttonBackground;
    }

    public final int component9() {
        return this.otpEditTextBackground;
    }

    @NotNull
    public final OneChangeOwnerThemeColorModel copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, @NotNull List<Integer> tabBackgroundColors, int i15, int i16, int i17, int i18, int i19, @NotNull TabBackgroundColors tabConsentBackgroundColors) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "tabBackgroundColors");
        Intrinsics.checkNotNullParameter(tabConsentBackgroundColors, "tabConsentBackgroundColors");
        return new OneChangeOwnerThemeColorModel(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, tabBackgroundColors, i15, i16, i17, i18, i19, tabConsentBackgroundColors);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneChangeOwnerThemeColorModel) {
            OneChangeOwnerThemeColorModel oneChangeOwnerThemeColorModel = (OneChangeOwnerThemeColorModel) obj;
            return this.mainTheme == oneChangeOwnerThemeColorModel.mainTheme && this.topBarBackground == oneChangeOwnerThemeColorModel.topBarBackground && this.editTextColor == oneChangeOwnerThemeColorModel.editTextColor && this.editTextHighlightColor == oneChangeOwnerThemeColorModel.editTextHighlightColor && this.editTextBackground == oneChangeOwnerThemeColorModel.editTextBackground && this.editTextCursor == oneChangeOwnerThemeColorModel.editTextCursor && this.fontColor == oneChangeOwnerThemeColorModel.fontColor && this.buttonBackground == oneChangeOwnerThemeColorModel.buttonBackground && this.otpEditTextBackground == oneChangeOwnerThemeColorModel.otpEditTextBackground && this.switchModeBackground == oneChangeOwnerThemeColorModel.switchModeBackground && this.switchModeFontColor == oneChangeOwnerThemeColorModel.switchModeFontColor && this.formTabColor == oneChangeOwnerThemeColorModel.formTabColor && this.fontColorDialog == oneChangeOwnerThemeColorModel.fontColorDialog && this.buttonBackgroundRounded == oneChangeOwnerThemeColorModel.buttonBackgroundRounded && Intrinsics.areEqual(this.tabBackgroundColors, oneChangeOwnerThemeColorModel.tabBackgroundColors) && this.backgroundTitleForm == oneChangeOwnerThemeColorModel.backgroundTitleForm && this.dotColor == oneChangeOwnerThemeColorModel.dotColor && this.successIconColor == oneChangeOwnerThemeColorModel.successIconColor && this.tabBarFontColor == oneChangeOwnerThemeColorModel.tabBarFontColor && this.tabColor == oneChangeOwnerThemeColorModel.tabColor && Intrinsics.areEqual(this.tabConsentBackgroundColors, oneChangeOwnerThemeColorModel.tabConsentBackgroundColors);
        }
        return false;
    }

    public final int getBackgroundTitleForm() {
        return this.backgroundTitleForm;
    }

    public final int getButtonBackground() {
        return this.buttonBackground;
    }

    public final int getButtonBackgroundRounded() {
        return this.buttonBackgroundRounded;
    }

    public final int getDotColor() {
        return this.dotColor;
    }

    public final int getEditTextBackground() {
        return this.editTextBackground;
    }

    public final int getEditTextColor() {
        return this.editTextColor;
    }

    public final int getEditTextCursor() {
        return this.editTextCursor;
    }

    public final int getEditTextHighlightColor() {
        return this.editTextHighlightColor;
    }

    public final int getFontColor() {
        return this.fontColor;
    }

    public final int getFontColorDialog() {
        return this.fontColorDialog;
    }

    public final int getFormTabColor() {
        return this.formTabColor;
    }

    public final int getMainTheme() {
        return this.mainTheme;
    }

    public final int getOtpEditTextBackground() {
        return this.otpEditTextBackground;
    }

    public final int getSuccessIconColor() {
        return this.successIconColor;
    }

    public final int getSwitchModeBackground() {
        return this.switchModeBackground;
    }

    public final int getSwitchModeFontColor() {
        return this.switchModeFontColor;
    }

    @NotNull
    public final List<Integer> getTabBackgroundColors() {
        return this.tabBackgroundColors;
    }

    public final int getTabBarFontColor() {
        return this.tabBarFontColor;
    }

    public final int getTabColor() {
        return this.tabColor;
    }

    @NotNull
    public final TabBackgroundColors getTabConsentBackgroundColors() {
        return this.tabConsentBackgroundColors;
    }

    public final int getTopBarBackground() {
        return this.topBarBackground;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.mainTheme * 31) + this.topBarBackground) * 31) + this.editTextColor) * 31) + this.editTextHighlightColor) * 31) + this.editTextBackground) * 31) + this.editTextCursor) * 31) + this.fontColor) * 31) + this.buttonBackground) * 31) + this.otpEditTextBackground) * 31) + this.switchModeBackground) * 31) + this.switchModeFontColor) * 31) + this.formTabColor) * 31) + this.fontColorDialog) * 31) + this.buttonBackgroundRounded) * 31) + this.tabBackgroundColors.hashCode()) * 31) + this.backgroundTitleForm) * 31) + this.dotColor) * 31) + this.successIconColor) * 31) + this.tabBarFontColor) * 31) + this.tabColor) * 31) + this.tabConsentBackgroundColors.hashCode();
    }

    public final void setBackgroundTitleForm(int i) {
        this.backgroundTitleForm = i;
    }

    public final void setButtonBackground(int i) {
        this.buttonBackground = i;
    }

    public final void setButtonBackgroundRounded(int i) {
        this.buttonBackgroundRounded = i;
    }

    public final void setDotColor(int i) {
        this.dotColor = i;
    }

    public final void setEditTextBackground(int i) {
        this.editTextBackground = i;
    }

    public final void setEditTextColor(int i) {
        this.editTextColor = i;
    }

    public final void setEditTextCursor(int i) {
        this.editTextCursor = i;
    }

    public final void setEditTextHighlightColor(int i) {
        this.editTextHighlightColor = i;
    }

    public final void setFontColor(int i) {
        this.fontColor = i;
    }

    public final void setFontColorDialog(int i) {
        this.fontColorDialog = i;
    }

    public final void setFormTabColor(int i) {
        this.formTabColor = i;
    }

    public final void setMainTheme(int i) {
        this.mainTheme = i;
    }

    public final void setOtpEditTextBackground(int i) {
        this.otpEditTextBackground = i;
    }

    public final void setSuccessIconColor(int i) {
        this.successIconColor = i;
    }

    public final void setSwitchModeBackground(int i) {
        this.switchModeBackground = i;
    }

    public final void setSwitchModeFontColor(int i) {
        this.switchModeFontColor = i;
    }

    public final void setTabBackgroundColors(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tabBackgroundColors = list;
    }

    public final void setTabBarFontColor(int i) {
        this.tabBarFontColor = i;
    }

    public final void setTabColor(int i) {
        this.tabColor = i;
    }

    public final void setTabConsentBackgroundColors(@NotNull TabBackgroundColors tabBackgroundColors) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "<set-?>");
        this.tabConsentBackgroundColors = tabBackgroundColors;
    }

    public final void setTopBarBackground(int i) {
        this.topBarBackground = i;
    }

    @NotNull
    public String toString() {
        int i = this.mainTheme;
        int i2 = this.topBarBackground;
        int i3 = this.editTextColor;
        int i4 = this.editTextHighlightColor;
        int i5 = this.editTextBackground;
        int i6 = this.editTextCursor;
        int i7 = this.fontColor;
        int i8 = this.buttonBackground;
        int i9 = this.otpEditTextBackground;
        int i10 = this.switchModeBackground;
        int i11 = this.switchModeFontColor;
        int i12 = this.formTabColor;
        int i13 = this.fontColorDialog;
        int i14 = this.buttonBackgroundRounded;
        List<Integer> list = this.tabBackgroundColors;
        int i15 = this.backgroundTitleForm;
        int i16 = this.dotColor;
        int i17 = this.successIconColor;
        int i18 = this.tabBarFontColor;
        int i19 = this.tabColor;
        TabBackgroundColors tabBackgroundColors = this.tabConsentBackgroundColors;
        return "OneChangeOwnerThemeColorModel(mainTheme=" + i + ", topBarBackground=" + i2 + ", editTextColor=" + i3 + ", editTextHighlightColor=" + i4 + ", editTextBackground=" + i5 + ", editTextCursor=" + i6 + ", fontColor=" + i7 + ", buttonBackground=" + i8 + ", otpEditTextBackground=" + i9 + ", switchModeBackground=" + i10 + ", switchModeFontColor=" + i11 + ", formTabColor=" + i12 + ", fontColorDialog=" + i13 + ", buttonBackgroundRounded=" + i14 + ", tabBackgroundColors=" + list + ", backgroundTitleForm=" + i15 + ", dotColor=" + i16 + ", successIconColor=" + i17 + ", tabBarFontColor=" + i18 + ", tabColor=" + i19 + ", tabConsentBackgroundColors=" + tabBackgroundColors + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.mainTheme);
        out.writeInt(this.topBarBackground);
        out.writeInt(this.editTextColor);
        out.writeInt(this.editTextHighlightColor);
        out.writeInt(this.editTextBackground);
        out.writeInt(this.editTextCursor);
        out.writeInt(this.fontColor);
        out.writeInt(this.buttonBackground);
        out.writeInt(this.otpEditTextBackground);
        out.writeInt(this.switchModeBackground);
        out.writeInt(this.switchModeFontColor);
        out.writeInt(this.formTabColor);
        out.writeInt(this.fontColorDialog);
        out.writeInt(this.buttonBackgroundRounded);
        List<Integer> list = this.tabBackgroundColors;
        out.writeInt(list.size());
        for (Integer num : list) {
            out.writeInt(num.intValue());
        }
        out.writeInt(this.backgroundTitleForm);
        out.writeInt(this.dotColor);
        out.writeInt(this.successIconColor);
        out.writeInt(this.tabBarFontColor);
        out.writeInt(this.tabColor);
        this.tabConsentBackgroundColors.writeToParcel(out, i);
    }

    public OneChangeOwnerThemeColorModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, @NotNull List<Integer> tabBackgroundColors, int i15, int i16, int i17, int i18, int i19, @NotNull TabBackgroundColors tabConsentBackgroundColors) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "tabBackgroundColors");
        Intrinsics.checkNotNullParameter(tabConsentBackgroundColors, "tabConsentBackgroundColors");
        this.mainTheme = i;
        this.topBarBackground = i2;
        this.editTextColor = i3;
        this.editTextHighlightColor = i4;
        this.editTextBackground = i5;
        this.editTextCursor = i6;
        this.fontColor = i7;
        this.buttonBackground = i8;
        this.otpEditTextBackground = i9;
        this.switchModeBackground = i10;
        this.switchModeFontColor = i11;
        this.formTabColor = i12;
        this.fontColorDialog = i13;
        this.buttonBackgroundRounded = i14;
        this.tabBackgroundColors = tabBackgroundColors;
        this.backgroundTitleForm = i15;
        this.dotColor = i16;
        this.successIconColor = i17;
        this.tabBarFontColor = i18;
        this.tabColor = i19;
        this.tabConsentBackgroundColors = tabConsentBackgroundColors;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ OneChangeOwnerThemeColorModel(int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, java.util.List r39, int r40, int r41, int r42, int r43, int r44, th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.appOne.change_owner.OneChangeOwnerThemeColorModel.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, java.util.List, int, int, int, int, int, th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}