package th.p047co.dtac.android.dtacone.adapter.report;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.adapter.report.CommissionSummaryAdapter;
import th.p047co.dtac.android.dtacone.databinding.RvCommissionReportItemBinding;
import th.p047co.dtac.android.dtacone.model.rtr_performance.ProfitSummaryReport;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Commission;", FirebaseAnalytics.Param.ITEMS, "Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$OnClickItemListener;", "onClickItemListener", "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$OnClickItemListener;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$OnClickItemListener;", "OnClickItemListener", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.report.CommissionSummaryAdapter */
/* loaded from: classes7.dex */
public final class CommissionSummaryAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f81445a;

    /* renamed from: b */
    public final OnClickItemListener f81446b;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$OnClickItemListener;", "", "onClickCommission", "", "commission", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Commission;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.CommissionSummaryAdapter$OnClickItemListener */
    /* loaded from: classes7.dex */
    public interface OnClickItemListener {
        void onClickCommission(@NotNull ProfitSummaryReport.Data.Commission commission);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/report/CommissionSummaryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/RvCommissionReportItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/RvCommissionReportItemBinding;)V", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Commission;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data$Commission;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/RvCommissionReportItemBinding;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.CommissionSummaryAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final RvCommissionReportItemBinding f81447a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull RvCommissionReportItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81447a = binding;
        }

        public final void bind(@NotNull ProfitSummaryReport.Data.Commission item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f81447a.tvCommissionHeader.setText(item.getCommissionHeaderLabel());
            this.f81447a.tvCommissionRemark.setText(item.getCommissionRemarkLabel());
            this.f81447a.tvCommission.setText(item.getCommission());
            this.f81447a.tvCommissionDisplayLabel.setText(item.getDisplayLabel1());
        }
    }

    public CommissionSummaryAdapter(@NotNull List<ProfitSummaryReport.Data.Commission> items, @NotNull OnClickItemListener onClickItemListener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onClickItemListener, "onClickItemListener");
        this.f81445a = items;
        this.f81446b = onClickItemListener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20264a(CommissionSummaryAdapter commissionSummaryAdapter, int i, View view) {
        m20263b(commissionSummaryAdapter, i, view);
    }

    /* renamed from: b */
    public static final void m20263b(CommissionSummaryAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f81446b.onClickCommission((ProfitSummaryReport.Data.Commission) this$0.f81445a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81445a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, final int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind((ProfitSummaryReport.Data.Commission) this.f81445a.get(i));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: fu
            {
                CommissionSummaryAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommissionSummaryAdapter.m20264a(CommissionSummaryAdapter.this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RvCommissionReportItemBinding inflate = RvCommissionReportItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay….context) ,parent, false)");
        return new ViewHolder(inflate);
    }
}
