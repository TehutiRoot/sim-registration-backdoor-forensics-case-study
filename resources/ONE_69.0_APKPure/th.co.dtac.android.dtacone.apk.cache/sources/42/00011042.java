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
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0001gBç\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J\u001a\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010%J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010%J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010%J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010%Jð\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010%J\u0010\u0010;\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b;\u0010\u001eJ\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010B\u001a\u0004\bI\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010B\u001a\u0004\bM\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010B\u001a\u0004\bO\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010B\u001a\u0004\bS\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010B\u001a\u0004\bU\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010B\u001a\u0004\bW\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010B\u001a\u0004\bY\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010B\u001a\u0004\b[\u0010%R$\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010B\u001a\u0004\b`\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010B\u001a\u0004\bb\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010B\u001a\u0004\bd\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010B\u001a\u0004\bf\u0010%¨\u0006h"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;", "Landroid/os/Parcelable;", "", "paidDateByPeriodLabel", "cashPaidTypeLabel", "vatValue", "withholdTaxValue", "totalCommission", "cashPaidTypeBankAccountName", "commissionValue", "paidDateCurrentLabel", "commissionLabel", "paidDate", "paidTypeValue", "commissionDate", "cashPaidTypeBankName", "", "Lth/co/dtac/android/dtacone/app_one/model/commission/PayByCommissionTypeListItem;", "payByCommissionTypeList", "paidTypeLabel", "cashPaidTypeBankAccountNumber", "withholdTaxLabel", "vatLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "p0", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/util/List;", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPaidDateByPeriodLabel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCashPaidTypeLabel", OperatorName.CURVE_TO, "getVatValue", "d", "getWithholdTaxValue", "e", "getTotalCommission", OperatorName.FILL_NON_ZERO, "getCashPaidTypeBankAccountName", OperatorName.NON_STROKING_GRAY, "getCommissionValue", OperatorName.CLOSE_PATH, "getPaidDateCurrentLabel", "i", "getCommissionLabel", OperatorName.SET_LINE_JOINSTYLE, "getPaidDate", OperatorName.NON_STROKING_CMYK, "getPaidTypeValue", OperatorName.LINE_TO, "getCommissionDate", OperatorName.MOVE_TO, "getCashPaidTypeBankName", OperatorName.ENDPATH, "Ljava/util/List;", "getPayByCommissionTypeList", "o", "getPaidTypeLabel", "p", "getCashPaidTypeBankAccountNumber", OperatorName.SAVE, "getWithholdTaxLabel", PDPageLabelRange.STYLE_ROMAN_LOWER, "getVatLabel", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.Commission */
/* loaded from: classes7.dex */
public final class Commission implements Parcelable {
    @SerializedName("paidDateByPeriodLabel")
    @Nullable

    /* renamed from: a */
    private final String f81705a;
    @SerializedName("cashPaidTypeLabel")
    @Nullable

    /* renamed from: b */
    private final String f81706b;
    @SerializedName("vatValue")
    @Nullable

    /* renamed from: c */
    private final String f81707c;
    @SerializedName("withholdTaxValue")
    @Nullable

    /* renamed from: d */
    private final String f81708d;
    @SerializedName("totalCommission")
    @Nullable

    /* renamed from: e */
    private final String f81709e;
    @SerializedName("cashPaidTypeBankAccountName")
    @Nullable

    /* renamed from: f */
    private final String f81710f;
    @SerializedName("commissionValue")
    @Nullable

    /* renamed from: g */
    private final String f81711g;
    @SerializedName("paidDateCurrentLabel")
    @Nullable

    /* renamed from: h */
    private final String f81712h;
    @SerializedName("commissionLabel")
    @Nullable

    /* renamed from: i */
    private final String f81713i;
    @SerializedName("paidDate")
    @Nullable

    /* renamed from: j */
    private final String f81714j;
    @SerializedName("paidTypeValue")
    @Nullable

    /* renamed from: k */
    private final String f81715k;
    @SerializedName("commissionDate")
    @Nullable

    /* renamed from: l */
    private final String f81716l;
    @SerializedName("cashPaidTypeBankName")
    @Nullable

    /* renamed from: m */
    private final String f81717m;
    @SerializedName("payByCommissionTypeList")
    @Nullable

    /* renamed from: n */
    private final List<PayByCommissionTypeListItem> f81718n;
    @SerializedName("paidTypeLabel")
    @Nullable

    /* renamed from: o */
    private final String f81719o;
    @SerializedName("cashPaidTypeBankAccountNumber")
    @Nullable

    /* renamed from: p */
    private final String f81720p;
    @SerializedName("withholdTaxLabel")
    @Nullable

    /* renamed from: q */
    private final String f81721q;
    @SerializedName("vatLabel")
    @Nullable

    /* renamed from: r */
    private final String f81722r;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/Commission$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/app_one/model/commission/Commission;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.Commission$CREATOR */
    /* loaded from: classes7.dex */
    public static final class CREATOR implements Parcelable.Creator<Commission> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Commission createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Commission(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Commission[] newArray(int i) {
            return new Commission[i];
        }
    }

    public Commission() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    @Nullable
    public final String component1() {
        return this.f81705a;
    }

    @Nullable
    public final String component10() {
        return this.f81714j;
    }

    @Nullable
    public final String component11() {
        return this.f81715k;
    }

    @Nullable
    public final String component12() {
        return this.f81716l;
    }

    @Nullable
    public final String component13() {
        return this.f81717m;
    }

    @Nullable
    public final List<PayByCommissionTypeListItem> component14() {
        return this.f81718n;
    }

    @Nullable
    public final String component15() {
        return this.f81719o;
    }

    @Nullable
    public final String component16() {
        return this.f81720p;
    }

    @Nullable
    public final String component17() {
        return this.f81721q;
    }

    @Nullable
    public final String component18() {
        return this.f81722r;
    }

    @Nullable
    public final String component2() {
        return this.f81706b;
    }

    @Nullable
    public final String component3() {
        return this.f81707c;
    }

    @Nullable
    public final String component4() {
        return this.f81708d;
    }

    @Nullable
    public final String component5() {
        return this.f81709e;
    }

    @Nullable
    public final String component6() {
        return this.f81710f;
    }

    @Nullable
    public final String component7() {
        return this.f81711g;
    }

    @Nullable
    public final String component8() {
        return this.f81712h;
    }

    @Nullable
    public final String component9() {
        return this.f81713i;
    }

    @NotNull
    public final Commission copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable List<PayByCommissionTypeListItem> list, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
        return new Commission(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, str14, str15, str16, str17);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Commission) {
            Commission commission = (Commission) obj;
            return Intrinsics.areEqual(this.f81705a, commission.f81705a) && Intrinsics.areEqual(this.f81706b, commission.f81706b) && Intrinsics.areEqual(this.f81707c, commission.f81707c) && Intrinsics.areEqual(this.f81708d, commission.f81708d) && Intrinsics.areEqual(this.f81709e, commission.f81709e) && Intrinsics.areEqual(this.f81710f, commission.f81710f) && Intrinsics.areEqual(this.f81711g, commission.f81711g) && Intrinsics.areEqual(this.f81712h, commission.f81712h) && Intrinsics.areEqual(this.f81713i, commission.f81713i) && Intrinsics.areEqual(this.f81714j, commission.f81714j) && Intrinsics.areEqual(this.f81715k, commission.f81715k) && Intrinsics.areEqual(this.f81716l, commission.f81716l) && Intrinsics.areEqual(this.f81717m, commission.f81717m) && Intrinsics.areEqual(this.f81718n, commission.f81718n) && Intrinsics.areEqual(this.f81719o, commission.f81719o) && Intrinsics.areEqual(this.f81720p, commission.f81720p) && Intrinsics.areEqual(this.f81721q, commission.f81721q) && Intrinsics.areEqual(this.f81722r, commission.f81722r);
        }
        return false;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountName() {
        return this.f81710f;
    }

    @Nullable
    public final String getCashPaidTypeBankAccountNumber() {
        return this.f81720p;
    }

    @Nullable
    public final String getCashPaidTypeBankName() {
        return this.f81717m;
    }

    @Nullable
    public final String getCashPaidTypeLabel() {
        return this.f81706b;
    }

    @Nullable
    public final String getCommissionDate() {
        return this.f81716l;
    }

    @Nullable
    public final String getCommissionLabel() {
        return this.f81713i;
    }

    @Nullable
    public final String getCommissionValue() {
        return this.f81711g;
    }

    @Nullable
    public final String getPaidDate() {
        return this.f81714j;
    }

    @Nullable
    public final String getPaidDateByPeriodLabel() {
        return this.f81705a;
    }

    @Nullable
    public final String getPaidDateCurrentLabel() {
        return this.f81712h;
    }

    @Nullable
    public final String getPaidTypeLabel() {
        return this.f81719o;
    }

    @Nullable
    public final String getPaidTypeValue() {
        return this.f81715k;
    }

    @Nullable
    public final List<PayByCommissionTypeListItem> getPayByCommissionTypeList() {
        return this.f81718n;
    }

    @Nullable
    public final String getTotalCommission() {
        return this.f81709e;
    }

    @Nullable
    public final String getVatLabel() {
        return this.f81722r;
    }

    @Nullable
    public final String getVatValue() {
        return this.f81707c;
    }

    @Nullable
    public final String getWithholdTaxLabel() {
        return this.f81721q;
    }

    @Nullable
    public final String getWithholdTaxValue() {
        return this.f81708d;
    }

    public int hashCode() {
        String str = this.f81705a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81706b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81707c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81708d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81709e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f81710f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f81711g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f81712h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f81713i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f81714j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f81715k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f81716l;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f81717m;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<PayByCommissionTypeListItem> list = this.f81718n;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        String str14 = this.f81719o;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f81720p;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f81721q;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f81722r;
        return hashCode17 + (str17 != null ? str17.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81705a;
        String str2 = this.f81706b;
        String str3 = this.f81707c;
        String str4 = this.f81708d;
        String str5 = this.f81709e;
        String str6 = this.f81710f;
        String str7 = this.f81711g;
        String str8 = this.f81712h;
        String str9 = this.f81713i;
        String str10 = this.f81714j;
        String str11 = this.f81715k;
        String str12 = this.f81716l;
        String str13 = this.f81717m;
        List<PayByCommissionTypeListItem> list = this.f81718n;
        String str14 = this.f81719o;
        String str15 = this.f81720p;
        String str16 = this.f81721q;
        String str17 = this.f81722r;
        return "Commission(paidDateByPeriodLabel=" + str + ", cashPaidTypeLabel=" + str2 + ", vatValue=" + str3 + ", withholdTaxValue=" + str4 + ", totalCommission=" + str5 + ", cashPaidTypeBankAccountName=" + str6 + ", commissionValue=" + str7 + ", paidDateCurrentLabel=" + str8 + ", commissionLabel=" + str9 + ", paidDate=" + str10 + ", paidTypeValue=" + str11 + ", commissionDate=" + str12 + ", cashPaidTypeBankName=" + str13 + ", payByCommissionTypeList=" + list + ", paidTypeLabel=" + str14 + ", cashPaidTypeBankAccountNumber=" + str15 + ", withholdTaxLabel=" + str16 + ", vatLabel=" + str17 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    public Commission(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable List<PayByCommissionTypeListItem> list, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
        this.f81705a = str;
        this.f81706b = str2;
        this.f81707c = str3;
        this.f81708d = str4;
        this.f81709e = str5;
        this.f81710f = str6;
        this.f81711g = str7;
        this.f81712h = str8;
        this.f81713i = str9;
        this.f81714j = str10;
        this.f81715k = str11;
        this.f81716l = str12;
        this.f81717m = str13;
        this.f81718n = list;
        this.f81719o = str14;
        this.f81720p = str15;
        this.f81721q = str16;
        this.f81722r = str17;
    }

    public /* synthetic */ Commission(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Commission(@org.jetbrains.annotations.NotNull android.os.Parcel r23) {
        /*
            r22 = this;
            java.lang.String r0 = "parcel"
            r1 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r23.readString()
            java.lang.String r2 = ""
            if (r0 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r0
        L1b:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L23
            r6 = r2
            goto L24
        L23:
            r6 = r0
        L24:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L2c
            r7 = r2
            goto L2d
        L2c:
            r7 = r0
        L2d:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L35
            r8 = r2
            goto L36
        L35:
            r8 = r0
        L36:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L3e
            r9 = r2
            goto L3f
        L3e:
            r9 = r0
        L3f:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L47
            r10 = r2
            goto L48
        L47:
            r10 = r0
        L48:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L50
            r11 = r2
            goto L51
        L50:
            r11 = r0
        L51:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L59
            r12 = r2
            goto L5a
        L59:
            r12 = r0
        L5a:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L62
            r13 = r2
            goto L63
        L62:
            r13 = r0
        L63:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L6b
            r14 = r2
            goto L6c
        L6b:
            r14 = r0
        L6c:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L74
            r15 = r2
            goto L75
        L74:
            r15 = r0
        L75:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L7e
            r16 = r2
            goto L80
        L7e:
            r16 = r0
        L80:
            java.util.List r17 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L8d
            r18 = r2
            goto L8f
        L8d:
            r18 = r0
        L8f:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto L98
            r19 = r2
            goto L9a
        L98:
            r19 = r0
        L9a:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto La3
            r20 = r2
            goto La5
        La3:
            r20 = r0
        La5:
            java.lang.String r0 = r23.readString()
            if (r0 != 0) goto Lae
            r21 = r2
            goto Lb0
        Lae:
            r21 = r0
        Lb0:
            r3 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.model.commission.Commission.<init>(android.os.Parcel):void");
    }
}