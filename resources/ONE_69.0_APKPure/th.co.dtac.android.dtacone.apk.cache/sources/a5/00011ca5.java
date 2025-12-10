package th.p047co.dtac.android.dtacone.model.appOne.transaction_history;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/transaction_history/OneTransactionHistoryReportThemeModel;", "Landroid/os/Parcelable;", "mainTheme", "", "summaryTitleBackground", "fontColor", "errorFontColor", "errorButtonDrawable", "errorButtonBackground", "dateCircleBackground", "(IIIIIII)V", "getDateCircleBackground", "()I", "setDateCircleBackground", "(I)V", "getErrorButtonBackground", "setErrorButtonBackground", "getErrorButtonDrawable", "setErrorButtonDrawable", "getErrorFontColor", "setErrorFontColor", "getFontColor", "setFontColor", "getMainTheme", "setMainTheme", "getSummaryTitleBackground", "setSummaryTitleBackground", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.transaction_history.OneTransactionHistoryReportThemeModel */
/* loaded from: classes8.dex */
public final class OneTransactionHistoryReportThemeModel implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OneTransactionHistoryReportThemeModel> CREATOR = new Creator();
    private int dateCircleBackground;
    private int errorButtonBackground;
    private int errorButtonDrawable;
    private int errorFontColor;
    private int fontColor;
    private int mainTheme;
    private int summaryTitleBackground;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.transaction_history.OneTransactionHistoryReportThemeModel$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<OneTransactionHistoryReportThemeModel> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneTransactionHistoryReportThemeModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneTransactionHistoryReportThemeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneTransactionHistoryReportThemeModel[] newArray(int i) {
            return new OneTransactionHistoryReportThemeModel[i];
        }
    }

    public OneTransactionHistoryReportThemeModel() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ OneTransactionHistoryReportThemeModel copy$default(OneTransactionHistoryReportThemeModel oneTransactionHistoryReportThemeModel, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = oneTransactionHistoryReportThemeModel.mainTheme;
        }
        if ((i8 & 2) != 0) {
            i2 = oneTransactionHistoryReportThemeModel.summaryTitleBackground;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = oneTransactionHistoryReportThemeModel.fontColor;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i4 = oneTransactionHistoryReportThemeModel.errorFontColor;
        }
        int i11 = i4;
        if ((i8 & 16) != 0) {
            i5 = oneTransactionHistoryReportThemeModel.errorButtonDrawable;
        }
        int i12 = i5;
        if ((i8 & 32) != 0) {
            i6 = oneTransactionHistoryReportThemeModel.errorButtonBackground;
        }
        int i13 = i6;
        if ((i8 & 64) != 0) {
            i7 = oneTransactionHistoryReportThemeModel.dateCircleBackground;
        }
        return oneTransactionHistoryReportThemeModel.copy(i, i9, i10, i11, i12, i13, i7);
    }

    public final int component1() {
        return this.mainTheme;
    }

    public final int component2() {
        return this.summaryTitleBackground;
    }

    public final int component3() {
        return this.fontColor;
    }

    public final int component4() {
        return this.errorFontColor;
    }

    public final int component5() {
        return this.errorButtonDrawable;
    }

    public final int component6() {
        return this.errorButtonBackground;
    }

    public final int component7() {
        return this.dateCircleBackground;
    }

    @NotNull
    public final OneTransactionHistoryReportThemeModel copy(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new OneTransactionHistoryReportThemeModel(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTransactionHistoryReportThemeModel) {
            OneTransactionHistoryReportThemeModel oneTransactionHistoryReportThemeModel = (OneTransactionHistoryReportThemeModel) obj;
            return this.mainTheme == oneTransactionHistoryReportThemeModel.mainTheme && this.summaryTitleBackground == oneTransactionHistoryReportThemeModel.summaryTitleBackground && this.fontColor == oneTransactionHistoryReportThemeModel.fontColor && this.errorFontColor == oneTransactionHistoryReportThemeModel.errorFontColor && this.errorButtonDrawable == oneTransactionHistoryReportThemeModel.errorButtonDrawable && this.errorButtonBackground == oneTransactionHistoryReportThemeModel.errorButtonBackground && this.dateCircleBackground == oneTransactionHistoryReportThemeModel.dateCircleBackground;
        }
        return false;
    }

    public final int getDateCircleBackground() {
        return this.dateCircleBackground;
    }

    public final int getErrorButtonBackground() {
        return this.errorButtonBackground;
    }

    public final int getErrorButtonDrawable() {
        return this.errorButtonDrawable;
    }

    public final int getErrorFontColor() {
        return this.errorFontColor;
    }

    public final int getFontColor() {
        return this.fontColor;
    }

    public final int getMainTheme() {
        return this.mainTheme;
    }

    public final int getSummaryTitleBackground() {
        return this.summaryTitleBackground;
    }

    public int hashCode() {
        return (((((((((((this.mainTheme * 31) + this.summaryTitleBackground) * 31) + this.fontColor) * 31) + this.errorFontColor) * 31) + this.errorButtonDrawable) * 31) + this.errorButtonBackground) * 31) + this.dateCircleBackground;
    }

    public final void setDateCircleBackground(int i) {
        this.dateCircleBackground = i;
    }

    public final void setErrorButtonBackground(int i) {
        this.errorButtonBackground = i;
    }

    public final void setErrorButtonDrawable(int i) {
        this.errorButtonDrawable = i;
    }

    public final void setErrorFontColor(int i) {
        this.errorFontColor = i;
    }

    public final void setFontColor(int i) {
        this.fontColor = i;
    }

    public final void setMainTheme(int i) {
        this.mainTheme = i;
    }

    public final void setSummaryTitleBackground(int i) {
        this.summaryTitleBackground = i;
    }

    @NotNull
    public String toString() {
        int i = this.mainTheme;
        int i2 = this.summaryTitleBackground;
        int i3 = this.fontColor;
        int i4 = this.errorFontColor;
        int i5 = this.errorButtonDrawable;
        int i6 = this.errorButtonBackground;
        int i7 = this.dateCircleBackground;
        return "OneTransactionHistoryReportThemeModel(mainTheme=" + i + ", summaryTitleBackground=" + i2 + ", fontColor=" + i3 + ", errorFontColor=" + i4 + ", errorButtonDrawable=" + i5 + ", errorButtonBackground=" + i6 + ", dateCircleBackground=" + i7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.mainTheme);
        out.writeInt(this.summaryTitleBackground);
        out.writeInt(this.fontColor);
        out.writeInt(this.errorFontColor);
        out.writeInt(this.errorButtonDrawable);
        out.writeInt(this.errorButtonBackground);
        out.writeInt(this.dateCircleBackground);
    }

    public OneTransactionHistoryReportThemeModel(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mainTheme = i;
        this.summaryTitleBackground = i2;
        this.fontColor = i3;
        this.errorFontColor = i4;
        this.errorButtonDrawable = i5;
        this.errorButtonBackground = i6;
        this.dateCircleBackground = i7;
    }

    public /* synthetic */ OneTransactionHistoryReportThemeModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? R.style.OneDtacAppTheme : i, (i8 & 2) != 0 ? R.color.colorAccent : i2, (i8 & 4) != 0 ? R.color.colorAccent : i3, (i8 & 8) != 0 ? R.color.niceBlueEleven : i4, (i8 & 16) != 0 ? R.drawable.ic_one_retry_blue : i5, (i8 & 32) != 0 ? R.drawable.bg_one_white_blue_button_border : i6, (i8 & 64) != 0 ? R.color.colorAccent : i7);
    }
}