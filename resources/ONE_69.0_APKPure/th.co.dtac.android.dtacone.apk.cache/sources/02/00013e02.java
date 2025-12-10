package th.p047co.dtac.android.dtacone.view.appOne.report.model.response.commision;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0001VB»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJÄ\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bE\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bG\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bK\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bM\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\bO\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u00108\u001a\u0004\bQ\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u00108\u001a\u0004\bS\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bU\u0010\u001f¨\u0006W"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionHistoryResponse;", "Landroid/os/Parcelable;", "", "paidStatus", "paidErrorMessage", "commissionPeriod", "commissionDate", "paidDate", "totalCommission", "paidTypeLabel", "paidTypeValue", "dtacOnlinePaidTypeLabel", "dtacOnlinePaidTypeValue", "cashPaidTypeLabel", "cashPaidTypeBankName", "cashPaidTypeBankAccountName", "cashPaidTypeBankAccountNumber", "flagGeneratedPdf", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionHistoryResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPaidStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPaidErrorMessage", OperatorName.CURVE_TO, "getCommissionPeriod", "d", "getCommissionDate", "e", "getPaidDate", OperatorName.FILL_NON_ZERO, "getTotalCommission", OperatorName.NON_STROKING_GRAY, "getPaidTypeLabel", OperatorName.CLOSE_PATH, "getPaidTypeValue", "i", "getDtacOnlinePaidTypeLabel", OperatorName.SET_LINE_JOINSTYLE, "getDtacOnlinePaidTypeValue", OperatorName.NON_STROKING_CMYK, "getCashPaidTypeLabel", OperatorName.LINE_TO, "getCashPaidTypeBankName", OperatorName.MOVE_TO, "getCashPaidTypeBankAccountName", OperatorName.ENDPATH, "getCashPaidTypeBankAccountNumber", "o", "getFlagGeneratedPdf", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionHistoryResponse */
/* loaded from: classes10.dex */
public final class OneCommissionHistoryResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("paidStatus")
    @Nullable

    /* renamed from: a */
    private final String f96621a;
    @SerializedName("paidErrorMessage")
    @Nullable

    /* renamed from: b */
    private final String f96622b;
    @SerializedName("commissionPeriod")
    @Nullable

    /* renamed from: c */
    private final String f96623c;
    @SerializedName("commissionDate")
    @Nullable

    /* renamed from: d */
    private final String f96624d;
    @SerializedName("paidDate")
    @Nullable

    /* renamed from: e */
    private final String f96625e;
    @SerializedName("totalCommission")
    @Nullable

    /* renamed from: f */
    private final String f96626f;
    @SerializedName("paidTypeLabel")
    @Nullable

    /* renamed from: g */
    private final String f96627g;
    @SerializedName("paidTypeValue")
    @Nullable

    /* renamed from: h */
    private final String f96628h;
    @SerializedName("dtacOnlinePaidTypeLabel")
    @Nullable

    /* renamed from: i */
    private final String f96629i;
    @SerializedName("dtacOnlinePaidTypeValue")
    @Nullable

    /* renamed from: j */
    private final String f96630j;
    @SerializedName("cashPaidTypeLabel")
    @Nullable

    /* renamed from: k */
    private final String f96631k;
    @SerializedName("cashPaidTypeBankName")
    @Nullable

    /* renamed from: l */
    private final String f96632l;
    @SerializedName("cashPaidTypeBankAccountName")
    @Nullable

    /* renamed from: m */
    private final String f96633m;
    @SerializedName("cashPaidTypeBankAccountNumber")
    @Nullable

    /* renamed from: n */
    private final String f96634n;
    @SerializedName("flagGeneratedPdf")
    @Nullable

    /* renamed from: o */
    private final String f96635o;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionHistoryResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionHistoryResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/view/appOne/report/model/response/commision/OneCommissionHistoryResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.model.response.commision.OneCommissionHistoryResponse$CREATOR */
    /* loaded from: classes10.dex */
    public static final class CREATOR implements Parcelable.Creator<OneCommissionHistoryResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCommissionHistoryResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneCommissionHistoryResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneCommissionHistoryResponse[] newArray(int i) {
            return new OneCommissionHistoryResponse[i];
        }
    }

    public OneCommissionHistoryResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Nullable
    public final String component1() {
        return this.f96621a;
    }

    @Nullable
    public final String component10() {
        return this.f96630j;
    }

    @Nullable
    public final String component11() {
        return this.f96631k;
    }

    @Nullable
    public final String component12() {
        return this.f96632l;
    }

    @Nullable
    public final String component13() {
        return this.f96633m;
    }

    @Nullable
    public final String component14() {
        return this.f96634n;
    }

    @Nullable
    public final String component15() {
        return this.f96635o;
    }

    @Nullable
    public final String component2() {
        return this.f96622b;
    }

    @Nullable
    public final String component3() {
        return this.f96623c;
    }

    @Nullable
    public final String component4() {
        return this.f96624d;
    }

    @Nullable
    public final String component5() {
        return this.f96625e;
    }

    @Nullable
    public final String component6() {
        return this.f96626f;
    }

    @Nullable
    public final String component7() {
        return this.f96627g;
    }

    @Nullable
    public final String component8() {
        return this.f96628h;
    }

    @Nullable
    public final String component9() {
        return this.f96629i;
    }

    @NotNull
    public final OneCommissionHistoryResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        return new OneCommissionHistoryResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCommissionHistoryResponse) {
            OneCommissionHistoryResponse oneCommissionHistoryResponse = (OneCommissionHistoryResponse) obj;
            return Intrinsics.areEqual(this.f96621a, oneCommissionHistoryResponse.f96621a) && Intrinsics.areEqual(this.f96622b, oneCommissionHistoryResponse.f96622b) && Intrinsics.areEqual(this.f96623c, oneCommissionHistoryResponse.f96623c) && Intrinsics.areEqual(this.f96624d, oneCommissionHistoryResponse.f96624d) && Intrinsics.areEqual(this.f96625e, oneCommissionHistoryResponse.f96625e) && Intrinsics.areEqual(this.f96626f, oneCommissionHistoryResponse.f96626f) && Intrinsics.areEqual(this.f96627g, oneCommissionHistoryResponse.f96627g) && Intrinsics.areEqual(this.f96628h, oneCommissionHistoryResponse.f96628h) && Intrinsics.areEqual(this.f96629i, oneCommissionHistoryResponse.f96629i) && Intrinsics.areEqual(this.f96630j, oneCommissionHistoryResponse.f96630j) && Intrinsics.areEqual(this.f96631k, oneCommissionHistoryResponse.f96631k) && Intrinsics.areEqual(this.f96632l, oneCommissionHistoryResponse.f96632l) && Intrinsics.areEqual(this.f96633m, oneCommissionHistoryResponse.f96633m) && Intrinsics.areEqual(this.f96634n, oneCommissionHistoryResponse.f96634n) && Intrinsics.areEqual(this.f96635o, oneCommissionHistoryResponse.f96635o);
        }
        return false;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountName() {
        return this.f96633m;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountNumber() {
        return this.f96634n;
    }

    @Nullable
    public final String getCashPaidTypeBankName() {
        return this.f96632l;
    }

    @Nullable
    public final String getCashPaidTypeLabel() {
        return this.f96631k;
    }

    @Nullable
    public final String getCommissionDate() {
        return this.f96624d;
    }

    @Nullable
    public final String getCommissionPeriod() {
        return this.f96623c;
    }

    @Nullable
    public final String getDtacOnlinePaidTypeLabel() {
        return this.f96629i;
    }

    @Nullable
    public final String getDtacOnlinePaidTypeValue() {
        return this.f96630j;
    }

    @Nullable
    public final String getFlagGeneratedPdf() {
        return this.f96635o;
    }

    @Nullable
    public final String getPaidDate() {
        return this.f96625e;
    }

    @Nullable
    public final String getPaidErrorMessage() {
        return this.f96622b;
    }

    @Nullable
    public final String getPaidStatus() {
        return this.f96621a;
    }

    @Nullable
    public final String getPaidTypeLabel() {
        return this.f96627g;
    }

    @Nullable
    public final String getPaidTypeValue() {
        return this.f96628h;
    }

    @Nullable
    public final String getTotalCommission() {
        return this.f96626f;
    }

    public int hashCode() {
        String str = this.f96621a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f96622b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96623c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f96624d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f96625e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f96626f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f96627g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f96628h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f96629i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f96630j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f96631k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f96632l;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f96633m;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f96634n;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f96635o;
        return hashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f96621a;
        String str2 = this.f96622b;
        String str3 = this.f96623c;
        String str4 = this.f96624d;
        String str5 = this.f96625e;
        String str6 = this.f96626f;
        String str7 = this.f96627g;
        String str8 = this.f96628h;
        String str9 = this.f96629i;
        String str10 = this.f96630j;
        String str11 = this.f96631k;
        String str12 = this.f96632l;
        String str13 = this.f96633m;
        String str14 = this.f96634n;
        String str15 = this.f96635o;
        return "OneCommissionHistoryResponse(paidStatus=" + str + ", paidErrorMessage=" + str2 + ", commissionPeriod=" + str3 + ", commissionDate=" + str4 + ", paidDate=" + str5 + ", totalCommission=" + str6 + ", paidTypeLabel=" + str7 + ", paidTypeValue=" + str8 + ", dtacOnlinePaidTypeLabel=" + str9 + ", dtacOnlinePaidTypeValue=" + str10 + ", cashPaidTypeLabel=" + str11 + ", cashPaidTypeBankName=" + str12 + ", cashPaidTypeBankAccountName=" + str13 + ", cashPaidTypeBankAccountNumber=" + str14 + ", flagGeneratedPdf=" + str15 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f96621a);
        parcel.writeString(this.f96622b);
        parcel.writeString(this.f96623c);
        parcel.writeString(this.f96624d);
        parcel.writeString(this.f96625e);
        parcel.writeString(this.f96626f);
        parcel.writeString(this.f96627g);
        parcel.writeString(this.f96628h);
        parcel.writeString(this.f96629i);
        parcel.writeString(this.f96630j);
        parcel.writeString(this.f96631k);
        parcel.writeString(this.f96632l);
        parcel.writeString(this.f96633m);
        parcel.writeString(this.f96634n);
        parcel.writeString(this.f96635o);
    }

    public OneCommissionHistoryResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
        this.f96621a = str;
        this.f96622b = str2;
        this.f96623c = str3;
        this.f96624d = str4;
        this.f96625e = str5;
        this.f96626f = str6;
        this.f96627g = str7;
        this.f96628h = str8;
        this.f96629i = str9;
        this.f96630j = str10;
        this.f96631k = str11;
        this.f96632l = str12;
        this.f96633m = str13;
        this.f96634n = str14;
        this.f96635o = str15;
    }

    public /* synthetic */ OneCommissionHistoryResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) == 0 ? str15 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneCommissionHistoryResponse(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}