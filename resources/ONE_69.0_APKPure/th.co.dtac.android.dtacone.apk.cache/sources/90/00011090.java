package th.p047co.dtac.android.dtacone.app_one.model.profit_report;

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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011J\u0094\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010'\u001a\u0004\b8\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b<\u0010\u0011¨\u0006="}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/profit_report/CommissionItem;", "", "", "paidStatus", "paidErrorMessage", "commissionPeriod", "paidStatusLabel", "commissionValue", "flagGeneratedPdf", "commission", "commissionMonthYear", "commissionHeaderLabel", "commissionRemarkLabel", "displayLabel1", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/profit_report/CommissionItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPaidStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPaidErrorMessage", OperatorName.CURVE_TO, "getCommissionPeriod", "d", "getPaidStatusLabel", "e", "getCommissionValue", OperatorName.FILL_NON_ZERO, "getFlagGeneratedPdf", OperatorName.NON_STROKING_GRAY, "getCommission", OperatorName.CLOSE_PATH, "getCommissionMonthYear", "i", "getCommissionHeaderLabel", OperatorName.SET_LINE_JOINSTYLE, "getCommissionRemarkLabel", OperatorName.NON_STROKING_CMYK, "getDisplayLabel1", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.profit_report.CommissionItem */
/* loaded from: classes7.dex */
public final class CommissionItem {
    public static final int $stable = 0;
    @SerializedName("paid_status")
    @Nullable

    /* renamed from: a */
    private final String f82078a;
    @SerializedName("paid_error_message")
    @Nullable

    /* renamed from: b */
    private final String f82079b;
    @SerializedName("commission_period")
    @Nullable

    /* renamed from: c */
    private final String f82080c;
    @SerializedName("paid_status_label")
    @Nullable

    /* renamed from: d */
    private final String f82081d;
    @SerializedName("commission_value")
    @Nullable

    /* renamed from: e */
    private final String f82082e;
    @SerializedName("flag_generated_pdf")
    @Nullable

    /* renamed from: f */
    private final String f82083f;
    @SerializedName("commission")
    @Nullable

    /* renamed from: g */
    private final String f82084g;
    @SerializedName("commission_month_year")
    @Nullable

    /* renamed from: h */
    private final String f82085h;
    @SerializedName("commission_header_label")
    @Nullable

    /* renamed from: i */
    private final String f82086i;
    @SerializedName("commission_remark_label")
    @Nullable

    /* renamed from: j */
    private final String f82087j;
    @SerializedName("display_label_1")
    @Nullable

    /* renamed from: k */
    private final String f82088k;

    public CommissionItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Nullable
    public final String component1() {
        return this.f82078a;
    }

    @Nullable
    public final String component10() {
        return this.f82087j;
    }

    @Nullable
    public final String component11() {
        return this.f82088k;
    }

    @Nullable
    public final String component2() {
        return this.f82079b;
    }

    @Nullable
    public final String component3() {
        return this.f82080c;
    }

    @Nullable
    public final String component4() {
        return this.f82081d;
    }

    @Nullable
    public final String component5() {
        return this.f82082e;
    }

    @Nullable
    public final String component6() {
        return this.f82083f;
    }

    @Nullable
    public final String component7() {
        return this.f82084g;
    }

    @Nullable
    public final String component8() {
        return this.f82085h;
    }

    @Nullable
    public final String component9() {
        return this.f82086i;
    }

    @NotNull
    public final CommissionItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        return new CommissionItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommissionItem) {
            CommissionItem commissionItem = (CommissionItem) obj;
            return Intrinsics.areEqual(this.f82078a, commissionItem.f82078a) && Intrinsics.areEqual(this.f82079b, commissionItem.f82079b) && Intrinsics.areEqual(this.f82080c, commissionItem.f82080c) && Intrinsics.areEqual(this.f82081d, commissionItem.f82081d) && Intrinsics.areEqual(this.f82082e, commissionItem.f82082e) && Intrinsics.areEqual(this.f82083f, commissionItem.f82083f) && Intrinsics.areEqual(this.f82084g, commissionItem.f82084g) && Intrinsics.areEqual(this.f82085h, commissionItem.f82085h) && Intrinsics.areEqual(this.f82086i, commissionItem.f82086i) && Intrinsics.areEqual(this.f82087j, commissionItem.f82087j) && Intrinsics.areEqual(this.f82088k, commissionItem.f82088k);
        }
        return false;
    }

    @Nullable
    public final String getCommission() {
        return this.f82084g;
    }

    @Nullable
    public final String getCommissionHeaderLabel() {
        return this.f82086i;
    }

    @Nullable
    public final String getCommissionMonthYear() {
        return this.f82085h;
    }

    @Nullable
    public final String getCommissionPeriod() {
        return this.f82080c;
    }

    @Nullable
    public final String getCommissionRemarkLabel() {
        return this.f82087j;
    }

    @Nullable
    public final String getCommissionValue() {
        return this.f82082e;
    }

    @Nullable
    public final String getDisplayLabel1() {
        return this.f82088k;
    }

    @Nullable
    public final String getFlagGeneratedPdf() {
        return this.f82083f;
    }

    @Nullable
    public final String getPaidErrorMessage() {
        return this.f82079b;
    }

    @Nullable
    public final String getPaidStatus() {
        return this.f82078a;
    }

    @Nullable
    public final String getPaidStatusLabel() {
        return this.f82081d;
    }

    public int hashCode() {
        String str = this.f82078a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82079b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82080c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82081d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82082e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82083f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f82084g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f82085h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f82086i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f82087j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f82088k;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82078a;
        String str2 = this.f82079b;
        String str3 = this.f82080c;
        String str4 = this.f82081d;
        String str5 = this.f82082e;
        String str6 = this.f82083f;
        String str7 = this.f82084g;
        String str8 = this.f82085h;
        String str9 = this.f82086i;
        String str10 = this.f82087j;
        String str11 = this.f82088k;
        return "CommissionItem(paidStatus=" + str + ", paidErrorMessage=" + str2 + ", commissionPeriod=" + str3 + ", paidStatusLabel=" + str4 + ", commissionValue=" + str5 + ", flagGeneratedPdf=" + str6 + ", commission=" + str7 + ", commissionMonthYear=" + str8 + ", commissionHeaderLabel=" + str9 + ", commissionRemarkLabel=" + str10 + ", displayLabel1=" + str11 + ")";
    }

    public CommissionItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.f82078a = str;
        this.f82079b = str2;
        this.f82080c = str3;
        this.f82081d = str4;
        this.f82082e = str5;
        this.f82083f = str6;
        this.f82084g = str7;
        this.f82085h = str8;
        this.f82086i = str9;
        this.f82087j = str10;
        this.f82088k = str11;
    }

    public /* synthetic */ CommissionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) == 0 ? str11 : null);
    }
}