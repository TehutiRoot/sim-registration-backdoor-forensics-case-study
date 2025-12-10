package th.p047co.dtac.android.dtacone.view.appOne.report.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.animation.ProgressBarAnimation;
import th.p047co.dtac.android.dtacone.app_one.model.profit_report.DataItem;
import th.p047co.dtac.android.dtacone.app_one.model.profit_report.Total;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.RvOneProfitSummaryItemBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.OneReportThemeColorModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneProfitSummaryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneProfitSummaryAdapter$ViewHolder;", "", "isCompanyTrue", "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$SummaryTheme;", "theme", "", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/DataItem;", FirebaseAnalytics.Param.ITEMS, "<init>", "(ZLth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$SummaryTheme;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneProfitSummaryAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneProfitSummaryAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$SummaryTheme;", OperatorName.CURVE_TO, "Ljava/util/List;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneProfitSummaryAdapter */
/* loaded from: classes10.dex */
public final class OneProfitSummaryAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final boolean f96300a;

    /* renamed from: b */
    public final OneReportThemeColorModel.SummaryTheme f96301b;

    /* renamed from: c */
    public final List f96302c;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneProfitSummaryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/RvOneProfitSummaryItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/RvOneProfitSummaryItemBinding;)V", "Lth/co/dtac/android/dtacone/app_one/model/profit_report/DataItem;", "item", "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$SummaryTheme;", "theme", "", "isCompanyTrue", "", "bind", "(Lth/co/dtac/android/dtacone/app_one/model/profit_report/DataItem;Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel$SummaryTheme;Z)V", "startAnimation", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/RvOneProfitSummaryItemBinding;", "Lth/co/dtac/android/dtacone/animation/ProgressBarAnimation;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/animation/ProgressBarAnimation;", "progressBarAnimation", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneProfitSummaryAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final RvOneProfitSummaryItemBinding f96303a;

        /* renamed from: b */
        public ProgressBarAnimation f96304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull RvOneProfitSummaryItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96303a = binding;
        }

        public static /* synthetic */ void bind$default(ViewHolder viewHolder, DataItem dataItem, OneReportThemeColorModel.SummaryTheme summaryTheme, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                dataItem = null;
            }
            viewHolder.bind(dataItem, summaryTheme, z);
        }

        public final void bind(@Nullable DataItem dataItem, @NotNull OneReportThemeColorModel.SummaryTheme theme, boolean z) {
            String str;
            String str2;
            Object obj;
            Integer profitPercentValue;
            Intrinsics.checkNotNullParameter(theme, "theme");
            RvOneProfitSummaryItemBinding rvOneProfitSummaryItemBinding = this.f96303a;
            if (dataItem != null) {
                String str3 = null;
                rvOneProfitSummaryItemBinding.tvMonthly.setTextColor(ResourcesCompat.getColor(rvOneProfitSummaryItemBinding.getRoot().getResources(), theme.getFontColor(), null));
                rvOneProfitSummaryItemBinding.tvSummary.setTextColor(ResourcesCompat.getColor(rvOneProfitSummaryItemBinding.getRoot().getResources(), theme.getFontColor(), null));
                if (z) {
                    ProgressBar backgroundProgressbar = rvOneProfitSummaryItemBinding.backgroundProgressbar;
                    Intrinsics.checkNotNullExpressionValue(backgroundProgressbar, "backgroundProgressbar");
                    ViewVisibleExtKt.toGone(backgroundProgressbar);
                    ProgressBar backgroundProgressbarTrue = rvOneProfitSummaryItemBinding.backgroundProgressbarTrue;
                    Intrinsics.checkNotNullExpressionValue(backgroundProgressbarTrue, "backgroundProgressbarTrue");
                    ViewVisibleExtKt.toVisible(backgroundProgressbarTrue);
                } else {
                    ProgressBar backgroundProgressbar2 = rvOneProfitSummaryItemBinding.backgroundProgressbar;
                    Intrinsics.checkNotNullExpressionValue(backgroundProgressbar2, "backgroundProgressbar");
                    ViewVisibleExtKt.toVisible(backgroundProgressbar2);
                    ProgressBar backgroundProgressbarTrue2 = rvOneProfitSummaryItemBinding.backgroundProgressbarTrue;
                    Intrinsics.checkNotNullExpressionValue(backgroundProgressbarTrue2, "backgroundProgressbarTrue");
                    ViewVisibleExtKt.toGone(backgroundProgressbarTrue2);
                }
                rvOneProfitSummaryItemBinding.statsProgressbar.setProgressDrawable(ResourcesCompat.getDrawable(rvOneProfitSummaryItemBinding.getRoot().getResources(), theme.getProgressDrawableStats(), null));
                rvOneProfitSummaryItemBinding.imgBgChart.setImageResource(theme.getGraphArrowImg());
                OneFontTextView oneFontTextView = rvOneProfitSummaryItemBinding.tvMonthly;
                Total total = dataItem.getTotal();
                if (total != null) {
                    str = total.getPeriodDate();
                } else {
                    str = null;
                }
                oneFontTextView.setText(str);
                OneFontTextView oneFontTextView2 = rvOneProfitSummaryItemBinding.tvSummary;
                Total total2 = dataItem.getTotal();
                if (total2 != null) {
                    str2 = total2.getSummaryValue();
                } else {
                    str2 = null;
                }
                oneFontTextView2.setText(str2);
                OneFontTextView oneFontTextView3 = rvOneProfitSummaryItemBinding.tvDisplayLabel1;
                Total total3 = dataItem.getTotal();
                if (total3 != null) {
                    str3 = total3.getDisplayLabel1();
                }
                oneFontTextView3.setText(str3);
                ProgressBar statsProgressbar = rvOneProfitSummaryItemBinding.statsProgressbar;
                Intrinsics.checkNotNullExpressionValue(statsProgressbar, "statsProgressbar");
                Total total4 = dataItem.getTotal();
                if (total4 != null && (profitPercentValue = total4.getProfitPercentValue()) != null) {
                    obj = Float.valueOf(profitPercentValue.intValue());
                } else {
                    obj = "0";
                }
                ProgressBarAnimation progressBarAnimation = new ProgressBarAnimation(statsProgressbar, 0.0f, ((Float) obj).floatValue());
                this.f96304b = progressBarAnimation;
                progressBarAnimation.setDuration(1000L);
                startAnimation();
            }
        }

        public final void startAnimation() {
            ProgressBar progressBar = this.f96303a.statsProgressbar;
            ProgressBarAnimation progressBarAnimation = this.f96304b;
            if (progressBarAnimation == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBarAnimation");
                progressBarAnimation = null;
            }
            progressBar.startAnimation(progressBarAnimation);
        }
    }

    public OneProfitSummaryAdapter(boolean z, @NotNull OneReportThemeColorModel.SummaryTheme theme, @Nullable List<DataItem> list) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f96300a = z;
        this.f96301b = theme;
        this.f96302c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f96302c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        List list = this.f96302c;
        viewHolder.bind(list != null ? (DataItem) list.get(i) : null, this.f96301b, this.f96300a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RvOneProfitSummaryItemBinding inflate = RvOneProfitSummaryItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(inflate);
    }
}