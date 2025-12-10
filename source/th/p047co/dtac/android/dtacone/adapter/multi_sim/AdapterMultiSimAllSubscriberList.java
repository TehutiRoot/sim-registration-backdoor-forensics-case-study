package th.p047co.dtac.android.dtacone.adapter.multi_sim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidRegisterType;
import th.p047co.dtac.android.dtacone.util.p052enum.ViewTypeList;
import th.p047co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/multi_sim/AdapterMultiSimAllSubscriberList;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/multi_sim/AdapterMultiSimAllSubscriberList$ViewHolder;", "Lth/co/dtac/android/dtacone/view/activity/multi_sim/MrtrPrepaidMultiSimActivity;", "activity", "", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSubscriber;", "listSubscriber", "Lth/co/dtac/android/dtacone/util/enum/ViewTypeList;", "viewType", "<init>", "(Lth/co/dtac/android/dtacone/view/activity/multi_sim/MrtrPrepaidMultiSimActivity;Ljava/util/List;Lth/co/dtac/android/dtacone/util/enum/ViewTypeList;)V", "Landroid/view/ViewGroup;", "parent", "", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/multi_sim/AdapterMultiSimAllSubscriberList$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/multi_sim/AdapterMultiSimAllSubscriberList$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/activity/multi_sim/MrtrPrepaidMultiSimActivity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/util/enum/ViewTypeList;", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.multi_sim.AdapterMultiSimAllSubscriberList */
/* loaded from: classes7.dex */
public final class AdapterMultiSimAllSubscriberList extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final MrtrPrepaidMultiSimActivity f81274a;

    /* renamed from: b */
    public final List f81275b;

    /* renamed from: c */
    public final ViewTypeList f81276c;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/multi_sim/AdapterMultiSimAllSubscriberList$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutItemSubscriber", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutItemSubscriber", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "getTvItemSubscriberValue", "()Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvItemSubscriberValue", OperatorName.CURVE_TO, "Landroid/view/View;", "getVSeparateLine", "()Landroid/view/View;", "vSeparateLine", "d", "getTvItemAct", "tvItemAct", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.multi_sim.AdapterMultiSimAllSubscriberList$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ConstraintLayout f81277a;

        /* renamed from: b */
        public final DtacFontTextView f81278b;

        /* renamed from: c */
        public final View f81279c;

        /* renamed from: d */
        public final DtacFontTextView f81280d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.layoutItemSubscriber);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.layoutItemSubscriber)");
            this.f81277a = (ConstraintLayout) findViewById;
            View findViewById2 = itemView.findViewById(R.id.tvItemSubscriberValue);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.tvItemSubscriberValue)");
            this.f81278b = (DtacFontTextView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.vSeparateLine);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.vSeparateLine)");
            this.f81279c = findViewById3;
            View findViewById4 = itemView.findViewById(R.id.tvItemAct);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.tvItemAct)");
            this.f81280d = (DtacFontTextView) findViewById4;
        }

        @NotNull
        public final ConstraintLayout getLayoutItemSubscriber() {
            return this.f81277a;
        }

        @NotNull
        public final DtacFontTextView getTvItemAct() {
            return this.f81280d;
        }

        @NotNull
        public final DtacFontTextView getTvItemSubscriberValue() {
            return this.f81278b;
        }

        @NotNull
        public final View getVSeparateLine() {
            return this.f81279c;
        }
    }

    public /* synthetic */ AdapterMultiSimAllSubscriberList(MrtrPrepaidMultiSimActivity mrtrPrepaidMultiSimActivity, List list, ViewTypeList viewTypeList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mrtrPrepaidMultiSimActivity, list, (i & 4) != 0 ? ViewTypeList.ERROR : viewTypeList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81275b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        MultiSubscriber multiSubscriber = (MultiSubscriber) this.f81275b.get(i);
        DtacFontTextView tvItemSubscriberValue = holder.getTvItemSubscriberValue();
        MrtrPrepaidMultiSimViewModel viewModel = this.f81274a.getViewModel();
        MrtrPrepaidValidateBarcodeResponse validateBarcodeResponse = multiSubscriber.getValidateBarcodeResponse();
        if (validateBarcodeResponse == null || (str = validateBarcodeResponse.getDisplaySubscriberNumber()) == null) {
            str = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        tvItemSubscriberValue.setText(PhoneNumberExtKt.toPretty(viewModel.decrypt(str)));
        if (i == this.f81275b.size() - 1) {
            ViewVisibleExtKt.toInVisible(holder.getVSeparateLine());
        }
        if (Intrinsics.areEqual(multiSubscriber.getRegisterType(), PrepaidRegisterType.REGISTER_ACTIVATION) && this.f81276c == ViewTypeList.SUCESS) {
            ViewVisibleExtKt.toVisible(holder.getTvItemAct());
            Boolean activateStatus = multiSubscriber.getActivateStatus();
            StringBuilder sb = new StringBuilder();
            sb.append("activateStatus:");
            sb.append(activateStatus);
            if (Intrinsics.areEqual(multiSubscriber.getActivateStatus(), Boolean.TRUE)) {
                holder.getTvItemAct().setText(this.f81274a.getResources().getString(R.string.act_success));
                holder.getTvItemAct().setTextColor(ContextCompat.getColor(this.f81274a, R.color.green2));
                return;
            }
            holder.getTvItemAct().setText(this.f81274a.getResources().getString(R.string.act_fail));
            holder.getTvItemAct().setTextColor(ContextCompat.getColor(this.f81274a, R.color.red));
            return;
        }
        ViewVisibleExtKt.toGone(holder.getTvItemAct());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_multi_sim_subscriber_for_summary, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    public AdapterMultiSimAllSubscriberList(@NotNull MrtrPrepaidMultiSimActivity activity, @NotNull List<MultiSubscriber> listSubscriber, @Nullable ViewTypeList viewTypeList) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listSubscriber, "listSubscriber");
        this.f81274a = activity;
        this.f81275b = listSubscriber;
        this.f81276c = viewTypeList;
    }
}
