package th.p047co.dtac.android.dtacone.adapter.report;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.animation.ProgressBarAnimation;
import th.p047co.dtac.android.dtacone.databinding.RvProfitSummaryItemBinding;
import th.p047co.dtac.android.dtacone.model.rtr_performance.ProfitSummaryReport;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/report/ProfitSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/report/ProfitSummaryAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/report/ProfitSummaryAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/report/ProfitSummaryAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.report.ProfitSummaryAdapter */
/* loaded from: classes7.dex */
public final class ProfitSummaryAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f81480a;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/report/ProfitSummaryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/RvProfitSummaryItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/RvProfitSummaryItemBinding;)V", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitSummaryReport$Data;)V", "startAnimation", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/RvProfitSummaryItemBinding;", "Lth/co/dtac/android/dtacone/animation/ProgressBarAnimation;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/animation/ProgressBarAnimation;", "progressBarAnimation", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.ProfitSummaryAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final RvProfitSummaryItemBinding f81481a;

        /* renamed from: b */
        public ProgressBarAnimation f81482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull RvProfitSummaryItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81481a = binding;
        }

        public final void bind(@NotNull ProfitSummaryReport.Data item) {
            Intrinsics.checkNotNullParameter(item, "item");
            RvProfitSummaryItemBinding rvProfitSummaryItemBinding = this.f81481a;
            rvProfitSummaryItemBinding.tvMonthly.setText(item.getTotal().getPeriodDate());
            rvProfitSummaryItemBinding.tvSummary.setText(item.getTotal().getSummaryValue());
            rvProfitSummaryItemBinding.tvDisplayLabel1.setText(item.getTotal().getDisplayLabel1());
            ProgressBar statsProgressbar = rvProfitSummaryItemBinding.statsProgressbar;
            Intrinsics.checkNotNullExpressionValue(statsProgressbar, "statsProgressbar");
            ProgressBarAnimation progressBarAnimation = new ProgressBarAnimation(statsProgressbar, 0.0f, item.getTotal().getProfitPercentValue());
            this.f81482b = progressBarAnimation;
            progressBarAnimation.setDuration(1000L);
            startAnimation();
        }

        public final void startAnimation() {
            ProgressBar progressBar = this.f81481a.statsProgressbar;
            ProgressBarAnimation progressBarAnimation = this.f81482b;
            if (progressBarAnimation == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBarAnimation");
                progressBarAnimation = null;
            }
            progressBar.startAnimation(progressBarAnimation);
        }
    }

    public ProfitSummaryAdapter(@NotNull ArrayList<ProfitSummaryReport.Data> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f81480a = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81480a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Object obj = this.f81480a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
        viewHolder.bind((ProfitSummaryReport.Data) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RvProfitSummaryItemBinding inflate = RvProfitSummaryItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay….context) ,parent, false)");
        return new ViewHolder(inflate);
    }
}
