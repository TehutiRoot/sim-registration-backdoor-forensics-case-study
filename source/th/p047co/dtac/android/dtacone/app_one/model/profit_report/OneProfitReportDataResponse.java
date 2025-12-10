package th.p047co.dtac.android.dtacone.app_one.model.profit_report;

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
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJT\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010\r¨\u0006)"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/profit_report/OneProfitReportDataResponse;", "", "", "cutOffDate", "", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/DataItem;", "profitSummaryList", "createdDate", "lastPeriodDate", "dataAt", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/profit_report/OneProfitReportDataResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCutOffDate", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getProfitSummaryList", OperatorName.CURVE_TO, "getCreatedDate", "d", "getLastPeriodDate", "e", "getDataAt", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.profit_report.OneProfitReportDataResponse */
/* loaded from: classes7.dex */
public final class OneProfitReportDataResponse {
    public static final int $stable = 8;
    @SerializedName("cut_off_date")
    @Nullable

    /* renamed from: a */
    private final String f82001a;
    @SerializedName("data")
    @Nullable

    /* renamed from: b */
    private final List<DataItem> f82002b;
    @SerializedName("created_date")
    @Nullable

    /* renamed from: c */
    private final String f82003c;
    @SerializedName("last_period_date")
    @Nullable

    /* renamed from: d */
    private final String f82004d;
    @SerializedName("data_at")
    @Nullable

    /* renamed from: e */
    private final String f82005e;

    public OneProfitReportDataResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OneProfitReportDataResponse copy$default(OneProfitReportDataResponse oneProfitReportDataResponse, String str, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneProfitReportDataResponse.f82001a;
        }
        List<DataItem> list2 = list;
        if ((i & 2) != 0) {
            list2 = oneProfitReportDataResponse.f82002b;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str2 = oneProfitReportDataResponse.f82003c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = oneProfitReportDataResponse.f82004d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = oneProfitReportDataResponse.f82005e;
        }
        return oneProfitReportDataResponse.copy(str, list3, str5, str6, str4);
    }

    @Nullable
    public final String component1() {
        return this.f82001a;
    }

    @Nullable
    public final List<DataItem> component2() {
        return this.f82002b;
    }

    @Nullable
    public final String component3() {
        return this.f82003c;
    }

    @Nullable
    public final String component4() {
        return this.f82004d;
    }

    @Nullable
    public final String component5() {
        return this.f82005e;
    }

    @NotNull
    public final OneProfitReportDataResponse copy(@Nullable String str, @Nullable List<DataItem> list, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneProfitReportDataResponse(str, list, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneProfitReportDataResponse) {
            OneProfitReportDataResponse oneProfitReportDataResponse = (OneProfitReportDataResponse) obj;
            return Intrinsics.areEqual(this.f82001a, oneProfitReportDataResponse.f82001a) && Intrinsics.areEqual(this.f82002b, oneProfitReportDataResponse.f82002b) && Intrinsics.areEqual(this.f82003c, oneProfitReportDataResponse.f82003c) && Intrinsics.areEqual(this.f82004d, oneProfitReportDataResponse.f82004d) && Intrinsics.areEqual(this.f82005e, oneProfitReportDataResponse.f82005e);
        }
        return false;
    }

    @Nullable
    public final String getCreatedDate() {
        return this.f82003c;
    }

    @Nullable
    public final String getCutOffDate() {
        return this.f82001a;
    }

    @Nullable
    public final String getDataAt() {
        return this.f82005e;
    }

    @Nullable
    public final String getLastPeriodDate() {
        return this.f82004d;
    }

    @Nullable
    public final List<DataItem> getProfitSummaryList() {
        return this.f82002b;
    }

    public int hashCode() {
        String str = this.f82001a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DataItem> list = this.f82002b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f82003c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82004d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82005e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82001a;
        List<DataItem> list = this.f82002b;
        String str2 = this.f82003c;
        String str3 = this.f82004d;
        String str4 = this.f82005e;
        return "OneProfitReportDataResponse(cutOffDate=" + str + ", profitSummaryList=" + list + ", createdDate=" + str2 + ", lastPeriodDate=" + str3 + ", dataAt=" + str4 + ")";
    }

    public OneProfitReportDataResponse(@Nullable String str, @Nullable List<DataItem> list, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f82001a = str;
        this.f82002b = list;
        this.f82003c = str2;
        this.f82004d = str3;
        this.f82005e = str4;
    }

    public /* synthetic */ OneProfitReportDataResponse(String str, List list, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
