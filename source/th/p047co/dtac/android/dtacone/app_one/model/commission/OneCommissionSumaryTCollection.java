package th.p047co.dtac.android.dtacone.app_one.model.commission;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b2\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010&\u001a\u0004\bB\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010&\u001a\u0004\bF\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010&\u001a\u0004\bJ\u0010(R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010&\u001a\u0004\bL\u0010(R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010&\u001a\u0004\bN\u0010(R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010&\u001a\u0004\bP\u0010(¨\u0006R"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "Landroid/os/Parcelable;", "", "commissionDate", "totalCommission", "paidDateCurrentLabel", "paidDateByPeriodLabel", "paidDate", "commissionLabel", "commissionValue", "vatLabel", "vatValue", "withholdTaxLabel", "withholdTaxValue", "", "Lth/co/dtac/android/dtacone/app_one/model/commission/PayByCommissionType;", "payByCommissionTypeList", "paidTypeLabel", "paidTypeValue", "dtacOnlinePaidTypeLabel", "dtacOnlinePaidTypeValue", "cashPaidTypeLabel", "cashPaidTypeBankName", "cashPaidTypeBankAccountName", "cashPaidTypeBankAccountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCommissionDate", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTotalCommission", OperatorName.CURVE_TO, "getPaidDateCurrentLabel", "d", "getPaidDateByPeriodLabel", "e", "getPaidDate", OperatorName.FILL_NON_ZERO, "getCommissionLabel", OperatorName.NON_STROKING_GRAY, "getCommissionValue", OperatorName.CLOSE_PATH, "getVatLabel", "i", "getVatValue", OperatorName.SET_LINE_JOINSTYLE, "getWithholdTaxLabel", OperatorName.NON_STROKING_CMYK, "getWithholdTaxValue", OperatorName.LINE_TO, "Ljava/util/List;", "getPayByCommissionTypeList", "()Ljava/util/List;", OperatorName.MOVE_TO, "getPaidTypeLabel", OperatorName.ENDPATH, "getPaidTypeValue", "o", "getDtacOnlinePaidTypeLabel", "p", "getDtacOnlinePaidTypeValue", OperatorName.SAVE, "getCashPaidTypeLabel", PDPageLabelRange.STYLE_ROMAN_LOWER, "getCashPaidTypeBankName", OperatorName.CLOSE_AND_STROKE, "getCashPaidTypeBankAccountName", "t", "getCashPaidTypeBankAccountNumber", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.OneCommissionSumaryTCollection */
/* loaded from: classes7.dex */
public final class OneCommissionSumaryTCollection implements Parcelable {
    @SerializedName("commissionDate")
    @NotNull

    /* renamed from: a */
    private final String f81657a;
    @SerializedName("totalCommission")
    @NotNull

    /* renamed from: b */
    private final String f81658b;
    @SerializedName("paidDateCurrentLabel")
    @NotNull

    /* renamed from: c */
    private final String f81659c;
    @SerializedName("paidDateByPeriodLabel")
    @NotNull

    /* renamed from: d */
    private final String f81660d;
    @SerializedName("paidDate")
    @NotNull

    /* renamed from: e */
    private final String f81661e;
    @SerializedName("commissionLabel")
    @NotNull

    /* renamed from: f */
    private final String f81662f;
    @SerializedName("commissionValue")
    @NotNull

    /* renamed from: g */
    private final String f81663g;
    @SerializedName("vatLabel")
    @NotNull

    /* renamed from: h */
    private final String f81664h;
    @SerializedName("vatValue")
    @NotNull

    /* renamed from: i */
    private final String f81665i;
    @SerializedName("withholdTaxLabel")
    @NotNull

    /* renamed from: j */
    private final String f81666j;
    @SerializedName("withholdTaxValue")
    @NotNull

    /* renamed from: k */
    private final String f81667k;
    @SerializedName("payByCommissionTypeList")
    @NotNull

    /* renamed from: l */
    private final List<PayByCommissionType> f81668l;
    @SerializedName("paidTypeLabel")
    @NotNull

    /* renamed from: m */
    private final String f81669m;
    @SerializedName("paidTypeValue")
    @Nullable

    /* renamed from: n */
    private final String f81670n;
    @SerializedName("dtacOnlinePaidTypeLabel")
    @Nullable

    /* renamed from: o */
    private final String f81671o;
    @SerializedName("dtacOnlinePaidTypeValue")
    @Nullable

    /* renamed from: p */
    private final String f81672p;
    @SerializedName("cashPaidTypeLabel")
    @Nullable

    /* renamed from: q */
    private final String f81673q;
    @SerializedName("cashPaidTypeBankName")
    @Nullable

    /* renamed from: r */
    private final String f81674r;
    @SerializedName("cashPaidTypeBankAccountName")
    @Nullable

    /* renamed from: s */
    private final String f81675s;
    @SerializedName("cashPaidTypeBankAccountNumber")
    @Nullable

    /* renamed from: t */
    private final String f81676t;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.OneCommissionSumaryTCollection$CREATOR */
    /* loaded from: classes7.dex */
    public static final class CREATOR implements Parcelable.Creator<OneCommissionSumaryTCollection> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCommissionSumaryTCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneCommissionSumaryTCollection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCommissionSumaryTCollection[] newArray(int i) {
            return new OneCommissionSumaryTCollection[i];
        }
    }

    public OneCommissionSumaryTCollection(@NotNull String commissionDate, @NotNull String totalCommission, @NotNull String paidDateCurrentLabel, @NotNull String paidDateByPeriodLabel, @NotNull String paidDate, @NotNull String commissionLabel, @NotNull String commissionValue, @NotNull String vatLabel, @NotNull String vatValue, @NotNull String withholdTaxLabel, @NotNull String withholdTaxValue, @NotNull List<PayByCommissionType> payByCommissionTypeList, @NotNull String paidTypeLabel, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkNotNullParameter(commissionDate, "commissionDate");
        Intrinsics.checkNotNullParameter(totalCommission, "totalCommission");
        Intrinsics.checkNotNullParameter(paidDateCurrentLabel, "paidDateCurrentLabel");
        Intrinsics.checkNotNullParameter(paidDateByPeriodLabel, "paidDateByPeriodLabel");
        Intrinsics.checkNotNullParameter(paidDate, "paidDate");
        Intrinsics.checkNotNullParameter(commissionLabel, "commissionLabel");
        Intrinsics.checkNotNullParameter(commissionValue, "commissionValue");
        Intrinsics.checkNotNullParameter(vatLabel, "vatLabel");
        Intrinsics.checkNotNullParameter(vatValue, "vatValue");
        Intrinsics.checkNotNullParameter(withholdTaxLabel, "withholdTaxLabel");
        Intrinsics.checkNotNullParameter(withholdTaxValue, "withholdTaxValue");
        Intrinsics.checkNotNullParameter(payByCommissionTypeList, "payByCommissionTypeList");
        Intrinsics.checkNotNullParameter(paidTypeLabel, "paidTypeLabel");
        this.f81657a = commissionDate;
        this.f81658b = totalCommission;
        this.f81659c = paidDateCurrentLabel;
        this.f81660d = paidDateByPeriodLabel;
        this.f81661e = paidDate;
        this.f81662f = commissionLabel;
        this.f81663g = commissionValue;
        this.f81664h = vatLabel;
        this.f81665i = vatValue;
        this.f81666j = withholdTaxLabel;
        this.f81667k = withholdTaxValue;
        this.f81668l = payByCommissionTypeList;
        this.f81669m = paidTypeLabel;
        this.f81670n = str;
        this.f81671o = str2;
        this.f81672p = str3;
        this.f81673q = str4;
        this.f81674r = str5;
        this.f81675s = str6;
        this.f81676t = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountName() {
        return this.f81675s;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountNumber() {
        return this.f81676t;
    }

    @Nullable
    public final String getCashPaidTypeBankName() {
        return this.f81674r;
    }

    @Nullable
    public final String getCashPaidTypeLabel() {
        return this.f81673q;
    }

    @NotNull
    public final String getCommissionDate() {
        return this.f81657a;
    }

    @NotNull
    public final String getCommissionLabel() {
        return this.f81662f;
    }

    @NotNull
    public final String getCommissionValue() {
        return this.f81663g;
    }

    @Nullable
    public final String getDtacOnlinePaidTypeLabel() {
        return this.f81671o;
    }

    @Nullable
    public final String getDtacOnlinePaidTypeValue() {
        return this.f81672p;
    }

    @NotNull
    public final String getPaidDate() {
        return this.f81661e;
    }

    @NotNull
    public final String getPaidDateByPeriodLabel() {
        return this.f81660d;
    }

    @NotNull
    public final String getPaidDateCurrentLabel() {
        return this.f81659c;
    }

    @NotNull
    public final String getPaidTypeLabel() {
        return this.f81669m;
    }

    @Nullable
    public final String getPaidTypeValue() {
        return this.f81670n;
    }

    @NotNull
    public final List<PayByCommissionType> getPayByCommissionTypeList() {
        return this.f81668l;
    }

    @NotNull
    public final String getTotalCommission() {
        return this.f81658b;
    }

    @NotNull
    public final String getVatLabel() {
        return this.f81664h;
    }

    @NotNull
    public final String getVatValue() {
        return this.f81665i;
    }

    @NotNull
    public final String getWithholdTaxLabel() {
        return this.f81666j;
    }

    @NotNull
    public final String getWithholdTaxValue() {
        return this.f81667k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f81657a);
        parcel.writeString(this.f81658b);
        parcel.writeString(this.f81659c);
        parcel.writeString(this.f81660d);
        parcel.writeString(this.f81661e);
        parcel.writeString(this.f81662f);
        parcel.writeString(this.f81663g);
        parcel.writeString(this.f81664h);
        parcel.writeString(this.f81665i);
        parcel.writeString(this.f81666j);
        parcel.writeString(this.f81667k);
        parcel.writeTypedList(this.f81668l);
        parcel.writeString(this.f81669m);
        parcel.writeString(this.f81670n);
        parcel.writeString(this.f81671o);
        parcel.writeString(this.f81672p);
        parcel.writeString(this.f81673q);
        parcel.writeString(this.f81674r);
        parcel.writeString(this.f81675s);
        parcel.writeString(this.f81676t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneCommissionSumaryTCollection(@org.jetbrains.annotations.NotNull android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.model.commission.OneCommissionSumaryTCollection.<init>(android.os.Parcel):void");
    }
}
