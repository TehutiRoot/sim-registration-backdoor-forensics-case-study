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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJX\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010\r¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/profit_report/Total;", "", "", "totalProfitLabel", "periodDate", "", "profitPercentValue", "currentMonth", "summaryValue", "displayLabel1", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/profit_report/Total;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getTotalProfitLabel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPeriodDate", OperatorName.CURVE_TO, "Ljava/lang/Integer;", "getProfitPercentValue", "d", "getCurrentMonth", "e", "getSummaryValue", OperatorName.FILL_NON_ZERO, "getDisplayLabel1", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.profit_report.Total */
/* loaded from: classes7.dex */
public final class Total {
    public static final int $stable = 0;
    @SerializedName("total_profit_label")
    @Nullable

    /* renamed from: a */
    private final String f82110a;
    @SerializedName("period_date")
    @Nullable

    /* renamed from: b */
    private final String f82111b;
    @SerializedName("profit_percent_value")
    @Nullable

    /* renamed from: c */
    private final Integer f82112c;
    @SerializedName("current_month")
    @Nullable

    /* renamed from: d */
    private final String f82113d;
    @SerializedName("summary_value")
    @Nullable

    /* renamed from: e */
    private final String f82114e;
    @SerializedName("display_label_1")
    @Nullable

    /* renamed from: f */
    private final String f82115f;

    public Total() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Total copy$default(Total total, String str, String str2, Integer num, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = total.f82110a;
        }
        if ((i & 2) != 0) {
            str2 = total.f82111b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            num = total.f82112c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = total.f82113d;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = total.f82114e;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = total.f82115f;
        }
        return total.copy(str, str6, num2, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82110a;
    }

    @Nullable
    public final String component2() {
        return this.f82111b;
    }

    @Nullable
    public final Integer component3() {
        return this.f82112c;
    }

    @Nullable
    public final String component4() {
        return this.f82113d;
    }

    @Nullable
    public final String component5() {
        return this.f82114e;
    }

    @Nullable
    public final String component6() {
        return this.f82115f;
    }

    @NotNull
    public final Total copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new Total(str, str2, num, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Total) {
            Total total = (Total) obj;
            return Intrinsics.areEqual(this.f82110a, total.f82110a) && Intrinsics.areEqual(this.f82111b, total.f82111b) && Intrinsics.areEqual(this.f82112c, total.f82112c) && Intrinsics.areEqual(this.f82113d, total.f82113d) && Intrinsics.areEqual(this.f82114e, total.f82114e) && Intrinsics.areEqual(this.f82115f, total.f82115f);
        }
        return false;
    }

    @Nullable
    public final String getCurrentMonth() {
        return this.f82113d;
    }

    @Nullable
    public final String getDisplayLabel1() {
        return this.f82115f;
    }

    @Nullable
    public final String getPeriodDate() {
        return this.f82111b;
    }

    @Nullable
    public final Integer getProfitPercentValue() {
        return this.f82112c;
    }

    @Nullable
    public final String getSummaryValue() {
        return this.f82114e;
    }

    @Nullable
    public final String getTotalProfitLabel() {
        return this.f82110a;
    }

    public int hashCode() {
        String str = this.f82110a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82111b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f82112c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f82113d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82114e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82115f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82110a;
        String str2 = this.f82111b;
        Integer num = this.f82112c;
        String str3 = this.f82113d;
        String str4 = this.f82114e;
        String str5 = this.f82115f;
        return "Total(totalProfitLabel=" + str + ", periodDate=" + str2 + ", profitPercentValue=" + num + ", currentMonth=" + str3 + ", summaryValue=" + str4 + ", displayLabel1=" + str5 + ")";
    }

    public Total(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f82110a = str;
        this.f82111b = str2;
        this.f82112c = num;
        this.f82113d = str3;
        this.f82114e = str4;
        this.f82115f = str5;
    }

    public /* synthetic */ Total(String str, String str2, Integer num, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}