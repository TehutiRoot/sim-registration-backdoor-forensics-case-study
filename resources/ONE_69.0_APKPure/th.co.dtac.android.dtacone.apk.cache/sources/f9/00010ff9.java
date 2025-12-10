package th.p047co.dtac.android.dtacone.adapter.report;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;
import th.p047co.dtac.android.dtacone.animation.ExpandAnimation;
import th.p047co.dtac.android.dtacone.databinding.RvCommissionReportDetailItemBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.rtr_performance.ProfitDetailReport;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/DetailProfitReportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/report/DetailProfitReportAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitDetailReport$Data;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/report/DetailProfitReportAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/report/DetailProfitReportAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter */
/* loaded from: classes7.dex */
public final class DetailProfitReportAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f81539a;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/DetailProfitReportAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/RvCommissionReportDetailItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/RvCommissionReportDetailItemBinding;)V", "Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitDetailReport$Data;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/rtr_performance/ProfitDetailReport$Data;)V", OperatorName.FILL_NON_ZERO, "()V", "", "typeName", "", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/String;)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/RvCommissionReportDetailItemBinding;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isExpand", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final long animatedDuration = 500;
        public static final int hiddenSubProdHeight = 140;

        /* renamed from: a */
        public final RvCommissionReportDetailItemBinding f81540a;

        /* renamed from: b */
        public boolean f81541b;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/report/DetailProfitReportAdapter$ViewHolder$Companion;", "", "()V", "animatedDuration", "", "hiddenSubProdHeight", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter$ViewHolder$Companion */
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull RvCommissionReportDetailItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81540a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20437b(ViewHolder viewHolder, View view) {
            m20434e(viewHolder, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20436c(ViewHolder viewHolder, View view) {
            m20435d(viewHolder, view);
        }

        /* renamed from: d */
        public static final void m20435d(ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m20433f();
        }

        /* renamed from: e */
        public static final void m20434e(ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m20433f();
        }

        public final void bind(@NotNull ProfitDetailReport.Data item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f81540a.ivTypeIcon.setImageResource(m20432g(item.getProdType()));
            this.f81540a.tvTypeTitle.setText(item.getProdLabel());
            this.f81540a.tvDateAt.setText(item.getAsOfDataLabel());
            this.f81540a.tvTotal.setText(item.getInfoValueLabel1());
            this.f81540a.tvLeftLabel.setText(item.getInfoLabel2());
            this.f81540a.tvLeftValue.setText(item.getInfoValueLabel2());
            this.f81540a.tvRightLabel.setText(item.getInfoLabel3());
            this.f81540a.tvRightValue.setText(item.getInfoValueLabel3());
            if (item.getSubProd() != null) {
                ImageView imageView = this.f81540a.ivExpand;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivExpand");
                ViewVisibleExtKt.toVisible(imageView);
                if (!item.getSubProd().isEmpty()) {
                    RecyclerView recyclerView = this.f81540a.rvDetailItems;
                    recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                    recyclerView.setAdapter(new ProfitDetailSubProdAdapter(item.getSubProd()));
                    this.f81540a.ivExpand.setOnClickListener(new View.OnClickListener() { // from class: pG
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DetailProfitReportAdapter.ViewHolder.m20436c(DetailProfitReportAdapter.ViewHolder.this, view);
                        }
                    });
                    this.f81540a.vgExpandBox.setOnClickListener(new View.OnClickListener() { // from class: qG
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DetailProfitReportAdapter.ViewHolder.m20437b(DetailProfitReportAdapter.ViewHolder.this, view);
                        }
                    });
                }
            }
        }

        /* renamed from: f */
        public final void m20433f() {
            int measuredHeight;
            Animation loadAnimation;
            int height = this.f81540a.innerContainer.getHeight();
            if (this.f81541b) {
                measuredHeight = (int) (((float) hiddenSubProdHeight) * this.itemView.getContext().getResources().getDisplayMetrics().density);
            } else {
                this.f81540a.innerContainer.getLayoutParams().height = -2;
                this.f81540a.innerContainer.measure(View.MeasureSpec.makeMeasureSpec(this.f81540a.innerContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = this.f81540a.innerContainer.getMeasuredHeight();
            }
            ConstraintLayout constraintLayout = this.f81540a.innerContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.innerContainer");
            ExpandAnimation expandAnimation = new ExpandAnimation(constraintLayout, height, measuredHeight);
            expandAnimation.setDuration(500L);
            if (this.f81541b) {
                loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.rotate_anti_clockwise);
            } else {
                loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.rotate_clockwise);
            }
            loadAnimation.setDuration(500L);
            loadAnimation.setRepeatCount(0);
            loadAnimation.setFillEnabled(true);
            loadAnimation.setFillAfter(true);
            this.f81541b = true ^ this.f81541b;
            this.f81540a.ivExpand.startAnimation(loadAnimation);
            this.f81540a.innerContainer.startAnimation(expandAnimation);
        }

        /* renamed from: g */
        public final int m20432g(String str) {
            switch (str.hashCode()) {
                case -224762042:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_PROSERM)) {
                        return R.drawable.ic_cmdt_proserm;
                    }
                    break;
                case 99649:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_DOL)) {
                        return R.drawable.ic_cmdt_d_online;
                    }
                    break;
                case 24519875:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_CASHCARD)) {
                        return R.drawable.ic_cmdt_epin;
                    }
                    break;
                case 2091870123:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_SIM_ALL)) {
                        return R.drawable.ic_cmdt_sim_change;
                    }
                    break;
            }
            return R.drawable.ic_cmdt_sim_change;
        }
    }

    public DetailProfitReportAdapter(@NotNull ArrayList<ProfitDetailReport.Data> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f81539a = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81539a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Object obj = this.f81539a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
        viewHolder.bind((ProfitDetailReport.Data) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RvCommissionReportDetailItemBinding inflate = RvCommissionReportDetailItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay….context), parent, false)");
        return new ViewHolder(inflate);
    }
}