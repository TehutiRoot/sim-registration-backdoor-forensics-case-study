package th.p047co.dtac.android.dtacone.view.appOne.report.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.commission.OneCommissionSumaryTCollection;
import th.p047co.dtac.android.dtacone.model.rtr_performance.CommissionSummaryCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010.R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0012\"\u0004\b1\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010\u0012\"\u0004\b7\u0010.¨\u00068"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/model/OneCommissionModel;", "", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "commissionSumaryTCollectionT", "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummaryCollection;", "commissionSumaryCollection", "", "selectedPeriod", "selectedPeriodTH", "taxFile", "statementFile", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummaryCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "component2", "()Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummaryCollection;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummaryCollection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/report/model/OneCommissionModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "getCommissionSumaryTCollectionT", "setCommissionSumaryTCollectionT", "(Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummaryCollection;", "getCommissionSumaryCollection", "setCommissionSumaryCollection", "(Lth/co/dtac/android/dtacone/model/rtr_performance/CommissionSummaryCollection;)V", OperatorName.CURVE_TO, "Ljava/lang/String;", "getSelectedPeriod", "setSelectedPeriod", "(Ljava/lang/String;)V", "d", "getSelectedPeriodTH", "setSelectedPeriodTH", "e", "getTaxFile", "setTaxFile", OperatorName.FILL_NON_ZERO, "getStatementFile", "setStatementFile", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.model.OneCommissionModel */
/* loaded from: classes10.dex */
public final class OneCommissionModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public OneCommissionSumaryTCollection f96523a;

    /* renamed from: b */
    public CommissionSummaryCollection f96524b;

    /* renamed from: c */
    public String f96525c;

    /* renamed from: d */
    public String f96526d;

    /* renamed from: e */
    public String f96527e;

    /* renamed from: f */
    public String f96528f;

    public OneCommissionModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OneCommissionModel copy$default(OneCommissionModel oneCommissionModel, OneCommissionSumaryTCollection oneCommissionSumaryTCollection, CommissionSummaryCollection commissionSummaryCollection, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            oneCommissionSumaryTCollection = oneCommissionModel.f96523a;
        }
        if ((i & 2) != 0) {
            commissionSummaryCollection = oneCommissionModel.f96524b;
        }
        CommissionSummaryCollection commissionSummaryCollection2 = commissionSummaryCollection;
        if ((i & 4) != 0) {
            str = oneCommissionModel.f96525c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = oneCommissionModel.f96526d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = oneCommissionModel.f96527e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = oneCommissionModel.f96528f;
        }
        return oneCommissionModel.copy(oneCommissionSumaryTCollection, commissionSummaryCollection2, str5, str6, str7, str4);
    }

    @Nullable
    public final OneCommissionSumaryTCollection component1() {
        return this.f96523a;
    }

    @Nullable
    public final CommissionSummaryCollection component2() {
        return this.f96524b;
    }

    @Nullable
    public final String component3() {
        return this.f96525c;
    }

    @Nullable
    public final String component4() {
        return this.f96526d;
    }

    @Nullable
    public final String component5() {
        return this.f96527e;
    }

    @Nullable
    public final String component6() {
        return this.f96528f;
    }

    @NotNull
    public final OneCommissionModel copy(@Nullable OneCommissionSumaryTCollection oneCommissionSumaryTCollection, @Nullable CommissionSummaryCollection commissionSummaryCollection, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneCommissionModel(oneCommissionSumaryTCollection, commissionSummaryCollection, str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCommissionModel) {
            OneCommissionModel oneCommissionModel = (OneCommissionModel) obj;
            return Intrinsics.areEqual(this.f96523a, oneCommissionModel.f96523a) && Intrinsics.areEqual(this.f96524b, oneCommissionModel.f96524b) && Intrinsics.areEqual(this.f96525c, oneCommissionModel.f96525c) && Intrinsics.areEqual(this.f96526d, oneCommissionModel.f96526d) && Intrinsics.areEqual(this.f96527e, oneCommissionModel.f96527e) && Intrinsics.areEqual(this.f96528f, oneCommissionModel.f96528f);
        }
        return false;
    }

    @Nullable
    public final CommissionSummaryCollection getCommissionSumaryCollection() {
        return this.f96524b;
    }

    @Nullable
    public final OneCommissionSumaryTCollection getCommissionSumaryTCollectionT() {
        return this.f96523a;
    }

    @Nullable
    public final String getSelectedPeriod() {
        return this.f96525c;
    }

    @Nullable
    public final String getSelectedPeriodTH() {
        return this.f96526d;
    }

    @Nullable
    public final String getStatementFile() {
        return this.f96528f;
    }

    @Nullable
    public final String getTaxFile() {
        return this.f96527e;
    }

    public int hashCode() {
        OneCommissionSumaryTCollection oneCommissionSumaryTCollection = this.f96523a;
        int hashCode = (oneCommissionSumaryTCollection == null ? 0 : oneCommissionSumaryTCollection.hashCode()) * 31;
        CommissionSummaryCollection commissionSummaryCollection = this.f96524b;
        int hashCode2 = (hashCode + (commissionSummaryCollection == null ? 0 : commissionSummaryCollection.hashCode())) * 31;
        String str = this.f96525c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96526d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96527e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f96528f;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCommissionSumaryCollection(@Nullable CommissionSummaryCollection commissionSummaryCollection) {
        this.f96524b = commissionSummaryCollection;
    }

    public final void setCommissionSumaryTCollectionT(@Nullable OneCommissionSumaryTCollection oneCommissionSumaryTCollection) {
        this.f96523a = oneCommissionSumaryTCollection;
    }

    public final void setSelectedPeriod(@Nullable String str) {
        this.f96525c = str;
    }

    public final void setSelectedPeriodTH(@Nullable String str) {
        this.f96526d = str;
    }

    public final void setStatementFile(@Nullable String str) {
        this.f96528f = str;
    }

    public final void setTaxFile(@Nullable String str) {
        this.f96527e = str;
    }

    @NotNull
    public String toString() {
        OneCommissionSumaryTCollection oneCommissionSumaryTCollection = this.f96523a;
        CommissionSummaryCollection commissionSummaryCollection = this.f96524b;
        String str = this.f96525c;
        String str2 = this.f96526d;
        String str3 = this.f96527e;
        String str4 = this.f96528f;
        return "OneCommissionModel(commissionSumaryTCollectionT=" + oneCommissionSumaryTCollection + ", commissionSumaryCollection=" + commissionSummaryCollection + ", selectedPeriod=" + str + ", selectedPeriodTH=" + str2 + ", taxFile=" + str3 + ", statementFile=" + str4 + ")";
    }

    public OneCommissionModel(@Nullable OneCommissionSumaryTCollection oneCommissionSumaryTCollection, @Nullable CommissionSummaryCollection commissionSummaryCollection, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f96523a = oneCommissionSumaryTCollection;
        this.f96524b = commissionSummaryCollection;
        this.f96525c = str;
        this.f96526d = str2;
        this.f96527e = str3;
        this.f96528f = str4;
    }

    public /* synthetic */ OneCommissionModel(OneCommissionSumaryTCollection oneCommissionSumaryTCollection, CommissionSummaryCollection commissionSummaryCollection, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneCommissionSumaryTCollection, (i & 2) == 0 ? commissionSummaryCollection : null, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }
}