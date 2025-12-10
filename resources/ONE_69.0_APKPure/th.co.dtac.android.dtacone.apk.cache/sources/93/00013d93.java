package th.p047co.dtac.android.dtacone.view.appOne.report.adapter;

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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.profit_report.CommissionItem;
import th.p047co.dtac.android.dtacone.databinding.RvOneCommissionReportItemBinding;
import th.p047co.dtac.android.dtacone.view.appOne.report.adapter.OneCommissionSummaryAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.OneReportThemeColorModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$ViewHolder;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$CommissionTheme;", "commissionTheme", "", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/CommissionItem;", FirebaseAnalytics.Param.ITEMS, "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$OnClickItemListener;", "onClickItemListener", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$CommissionTheme;Ljava/util/List;Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$OnClickItemListener;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$CommissionTheme;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$OnClickItemListener;", "OnClickItemListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneCommissionSummaryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCommissionSummaryAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneCommissionSummaryAdapter */
/* loaded from: classes10.dex */
public final class OneCommissionSummaryAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final OneReportThemeColorModel.CommissionTheme f96256a;

    /* renamed from: b */
    public final List f96257b;

    /* renamed from: c */
    public final OnClickItemListener f96258c;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$OnClickItemListener;", "", "onClickCommission", "", "commission", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/CommissionItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneCommissionSummaryAdapter$OnClickItemListener */
    /* loaded from: classes10.dex */
    public interface OnClickItemListener {
        void onClickCommission(@Nullable CommissionItem commissionItem);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneCommissionSummaryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/RvOneCommissionReportItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/RvOneCommissionReportItemBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/CommissionItem;", "item", "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$CommissionTheme;", "commissionTheme", "", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/profit_report/CommissionItem;Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$CommissionTheme;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/RvOneCommissionReportItemBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneCommissionSummaryAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final RvOneCommissionReportItemBinding f96259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull RvOneCommissionReportItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96259a = binding;
        }

        public final void bind(@NotNull CommissionItem item, @NotNull OneReportThemeColorModel.CommissionTheme commissionTheme) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(commissionTheme, "commissionTheme");
            this.f96259a.tvCommissionHeader.setText(item.getCommissionHeaderLabel());
            this.f96259a.tvCommissionRemark.setText(item.getCommissionRemarkLabel());
            this.f96259a.tvCommission.setText(item.getCommission());
            this.f96259a.tvCommissionDisplayLabel.setText(item.getDisplayLabel1());
            this.f96259a.commissionContainer.setBackgroundResource(commissionTheme.getBgRectangle());
            this.f96259a.detailBarCommission.setBackgroundResource(commissionTheme.getBgBoxTailCommission());
        }
    }

    public OneCommissionSummaryAdapter(@NotNull OneReportThemeColorModel.CommissionTheme commissionTheme, @Nullable List<CommissionItem> list, @NotNull OnClickItemListener onClickItemListener) {
        Intrinsics.checkNotNullParameter(commissionTheme, "commissionTheme");
        Intrinsics.checkNotNullParameter(onClickItemListener, "onClickItemListener");
        this.f96256a = commissionTheme;
        this.f96257b = list;
        this.f96258c = onClickItemListener;
    }

    /* renamed from: b */
    public static final void m10404b(OneCommissionSummaryAdapter this$0, int i, View view) {
        CommissionItem commissionItem;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnClickItemListener onClickItemListener = this$0.f96258c;
        List list = this$0.f96257b;
        if (list != null) {
            commissionItem = (CommissionItem) list.get(i);
        } else {
            commissionItem = null;
        }
        onClickItemListener.onClickCommission(commissionItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Integer num;
        List list = this.f96257b;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (num != null) {
            return this.f96257b.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, final int i) {
        CommissionItem commissionItem;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        List list = this.f96257b;
        if (list != null && (commissionItem = (CommissionItem) list.get(i)) != null) {
            viewHolder.bind(commissionItem, this.f96256a);
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: tO0
            {
                OneCommissionSummaryAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneCommissionSummaryAdapter.m10404b(OneCommissionSummaryAdapter.this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RvOneCommissionReportItemBinding inflate = RvOneCommissionReportItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(inflate);
    }
}