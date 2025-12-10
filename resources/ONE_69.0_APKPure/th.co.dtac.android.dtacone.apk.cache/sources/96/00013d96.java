package th.p047co.dtac.android.dtacone.view.appOne.report.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.animation.ExpandAnimation;
import th.p047co.dtac.android.dtacone.databinding.RvOneCommissionReportDetailItemBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.rtr_performance.ProfitDetailReport;
import th.p047co.dtac.android.dtacone.view.appOne.report.adapter.OneDetailProfitReportAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.OneReportThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.report.model.response.profit.OneProfitReportDetailDataResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneDetailProfitReportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneDetailProfitReportAdapter$ViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/profit/OneProfitReportDetailDataResponse;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.ITEMS, "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel;", "themeColorModel", "", "isCompanyTrue", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel;Z)V", "Landroid/view/ViewGroup;", "parent", "", "position", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneDetailProfitReportAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneDetailProfitReportAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/ArrayList;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel;", "d", "Z", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneDetailProfitReportAdapter */
/* loaded from: classes10.dex */
public final class OneDetailProfitReportAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f96260a;

    /* renamed from: b */
    public final ArrayList f96261b;

    /* renamed from: c */
    public final OneReportThemeColorModel f96262c;

    /* renamed from: d */
    public final boolean f96263d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneDetailProfitReportAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/RvOneCommissionReportDetailItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/RvOneCommissionReportDetailItemBinding;)V", "", OperatorName.FILL_NON_ZERO, "()V", "Lth/co/dtac/android/dtacone/view/appOne/report/model/response/profit/OneProfitReportDetailDataResponse;", "item", "Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel;", "themeColorModel", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isCompanyTrue", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/report/model/response/profit/OneProfitReportDetailDataResponse;Lth/co/dtac/android/dtacone/view/appOne/report/model/OneReportThemeColorModel;Landroid/content/Context;Z)V", "", "typeName", "", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/String;Z)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/RvOneCommissionReportDetailItemBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isExpand", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneDetailProfitReportAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final long animatedDuration = 500;
        public static final int hiddenSubProdHeight = 136;

        /* renamed from: a */
        public final RvOneCommissionReportDetailItemBinding f96264a;

        /* renamed from: b */
        public boolean f96265b;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/report/adapter/OneDetailProfitReportAdapter$ViewHolder$Companion;", "", "()V", "animatedDuration", "", "hiddenSubProdHeight", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.report.adapter.OneDetailProfitReportAdapter$ViewHolder$Companion */
        /* loaded from: classes10.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull RvOneCommissionReportDetailItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f96264a = binding;
        }

        /* renamed from: d */
        public static final void m10401d(ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m10399f();
        }

        /* renamed from: e */
        public static final void m10400e(ViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m10399f();
        }

        /* renamed from: f */
        private final void m10399f() {
            int measuredHeight;
            Animation loadAnimation;
            int height = this.f96264a.innerContainer.getHeight();
            if (this.f96265b) {
                measuredHeight = (int) (136 * this.itemView.getContext().getResources().getDisplayMetrics().density);
            } else {
                this.f96264a.innerContainer.getLayoutParams().height = -2;
                this.f96264a.innerContainer.measure(View.MeasureSpec.makeMeasureSpec(this.f96264a.innerContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = this.f96264a.innerContainer.getMeasuredHeight();
            }
            ConstraintLayout constraintLayout = this.f96264a.innerContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.innerContainer");
            ExpandAnimation expandAnimation = new ExpandAnimation(constraintLayout, height, measuredHeight);
            expandAnimation.setDuration(500L);
            if (this.f96265b) {
                loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.rotate_anti_clockwise);
            } else {
                loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.rotate_clockwise);
            }
            loadAnimation.setDuration(500L);
            loadAnimation.setRepeatCount(0);
            loadAnimation.setFillEnabled(true);
            loadAnimation.setFillAfter(true);
            this.f96265b = true ^ this.f96265b;
            this.f96264a.profitItemExpandImageView.startAnimation(loadAnimation);
            this.f96264a.innerContainer.startAnimation(expandAnimation);
        }

        public final void bind(@Nullable OneProfitReportDetailDataResponse oneProfitReportDetailDataResponse, @NotNull OneReportThemeColorModel themeColorModel, @NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(themeColorModel, "themeColorModel");
            Intrinsics.checkNotNullParameter(context, "context");
            RvOneCommissionReportDetailItemBinding rvOneCommissionReportDetailItemBinding = this.f96264a;
            rvOneCommissionReportDetailItemBinding.profitItemTotalTextView.setTextColor(ResourcesCompat.getColor(context.getResources(), themeColorModel.getFontColor(), null));
            rvOneCommissionReportDetailItemBinding.profitItemExpandImageView.setImageResource(themeColorModel.getIvExpand());
            rvOneCommissionReportDetailItemBinding.profitItemPatternImageView.setImageResource(themeColorModel.getImgPattern());
            rvOneCommissionReportDetailItemBinding.profitItemLabelView.setBackgroundResource(themeColorModel.getBgLineTabDetail());
            if (oneProfitReportDetailDataResponse != null) {
                RvOneCommissionReportDetailItemBinding rvOneCommissionReportDetailItemBinding2 = this.f96264a;
                ImageView imageView = rvOneCommissionReportDetailItemBinding2.profitItemTypeImageView;
                String prodType = oneProfitReportDetailDataResponse.getProdType();
                if (prodType == null) {
                    prodType = "";
                }
                imageView.setImageResource(m10398g(prodType, z));
                rvOneCommissionReportDetailItemBinding2.profitItemTypeTextView.setText(oneProfitReportDetailDataResponse.getProdLabel());
                rvOneCommissionReportDetailItemBinding2.profitItemDateTextView.setText(oneProfitReportDetailDataResponse.getAsofdataLabel());
                rvOneCommissionReportDetailItemBinding2.profitItemTotalTextView.setText(oneProfitReportDetailDataResponse.getInfoValueLabel1());
                rvOneCommissionReportDetailItemBinding2.profitItemLabelTextView.setText(oneProfitReportDetailDataResponse.getInfoLabel2());
                rvOneCommissionReportDetailItemBinding2.profitItemValueTextView.setText(oneProfitReportDetailDataResponse.getInfoValueLabel2());
                rvOneCommissionReportDetailItemBinding2.profitItemLabelLeftTextView.setText(oneProfitReportDetailDataResponse.getInfoLabel3());
                rvOneCommissionReportDetailItemBinding2.profitItemValueRightTextView.setText(oneProfitReportDetailDataResponse.getInfoValueLabel3());
                if (oneProfitReportDetailDataResponse.getSubProd() != null) {
                    ImageView profitItemExpandImageView = rvOneCommissionReportDetailItemBinding2.profitItemExpandImageView;
                    Intrinsics.checkNotNullExpressionValue(profitItemExpandImageView, "profitItemExpandImageView");
                    ViewVisibleExtKt.toVisible(profitItemExpandImageView);
                    if (!oneProfitReportDetailDataResponse.getSubProd().isEmpty()) {
                        RecyclerView recyclerView = rvOneCommissionReportDetailItemBinding2.profitDetailRecyclerView;
                        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                        recyclerView.setAdapter(new OneProfitDetailSubProdAdapter(oneProfitReportDetailDataResponse.getSubProd(), themeColorModel));
                        rvOneCommissionReportDetailItemBinding2.profitItemExpandImageView.setOnClickListener(new View.OnClickListener() { // from class: bP0
                            {
                                OneDetailProfitReportAdapter.ViewHolder.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OneDetailProfitReportAdapter.ViewHolder.m10401d(OneDetailProfitReportAdapter.ViewHolder.this, view);
                            }
                        });
                        rvOneCommissionReportDetailItemBinding2.profitItemView.setOnClickListener(new View.OnClickListener() { // from class: cP0
                            {
                                OneDetailProfitReportAdapter.ViewHolder.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OneDetailProfitReportAdapter.ViewHolder.m10400e(OneDetailProfitReportAdapter.ViewHolder.this, view);
                            }
                        });
                    }
                }
            }
        }

        /* renamed from: g */
        public final int m10398g(String str, boolean z) {
            if (z) {
                switch (str.hashCode()) {
                    case -224762042:
                        if (str.equals(ProfitDetailReport.Data.PROD_TYPE_PROSERM)) {
                            return R.drawable.ic_one_red_stv;
                        }
                        break;
                    case 99649:
                        if (str.equals(ProfitDetailReport.Data.PROD_TYPE_DOL)) {
                            return R.drawable.ic_one_d_online_true;
                        }
                        break;
                    case 24519875:
                        if (str.equals(ProfitDetailReport.Data.PROD_TYPE_CASHCARD)) {
                            return R.drawable.ic_cash_card_true;
                        }
                        break;
                    case 2091870123:
                        if (str.equals(ProfitDetailReport.Data.PROD_TYPE_SIM_ALL)) {
                            return R.drawable.ic_one_red_change_sim;
                        }
                        break;
                }
                return R.drawable.ic_one_red_change_sim;
            }
            switch (str.hashCode()) {
                case -224762042:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_PROSERM)) {
                        return R.drawable.ic_one_blue_stv;
                    }
                    break;
                case 99649:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_DOL)) {
                        return R.drawable.ic_one_d_online;
                    }
                    break;
                case 24519875:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_CASHCARD)) {
                        return R.drawable.ic_cash_card;
                    }
                    break;
                case 2091870123:
                    if (str.equals(ProfitDetailReport.Data.PROD_TYPE_SIM_ALL)) {
                        return R.drawable.ic_one_blue_change_sim;
                    }
                    break;
            }
            return R.drawable.ic_one_blue_change_sim;
        }
    }

    public OneDetailProfitReportAdapter(@NotNull Context context, @Nullable ArrayList<OneProfitReportDetailDataResponse> arrayList, @NotNull OneReportThemeColorModel themeColorModel, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(themeColorModel, "themeColorModel");
        this.f96260a = context;
        this.f96261b = arrayList;
        this.f96262c = themeColorModel;
        this.f96263d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f96261b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        ArrayList arrayList = this.f96261b;
        viewHolder.bind(arrayList != null ? (OneProfitReportDetailDataResponse) arrayList.get(i) : null, this.f96262c, this.f96260a, this.f96263d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RvOneCommissionReportDetailItemBinding inflate = RvOneCommissionReportDetailItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(inflate);
    }
}