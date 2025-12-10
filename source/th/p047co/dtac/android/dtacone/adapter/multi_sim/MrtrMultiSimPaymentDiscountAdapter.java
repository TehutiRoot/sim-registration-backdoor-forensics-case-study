package th.p047co.dtac.android.dtacone.adapter.multi_sim;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSimDisCountItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/multi_sim/MrtrMultiSimPaymentDiscountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSimDisCountItem;", "discountList", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "Companion", "DiscountItemViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.multi_sim.MrtrMultiSimPaymentDiscountAdapter */
/* loaded from: classes7.dex */
public final class MrtrMultiSimPaymentDiscountAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f81285a;

    /* renamed from: b */
    public final List f81286b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/multi_sim/MrtrMultiSimPaymentDiscountAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.multi_sim.MrtrMultiSimPaymentDiscountAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/multi_sim/MrtrMultiSimPaymentDiscountAdapter$DiscountItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/multi_sim/MrtrMultiSimPaymentDiscountAdapter;Landroid/view/View;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvDisCountLabel", "()Landroid/widget/TextView;", "tvDisCountLabel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTvDisCountNumber", "tvDisCountNumber", OperatorName.CURVE_TO, "getTvDisCountValue", "tvDisCountValue", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.multi_sim.MrtrMultiSimPaymentDiscountAdapter$DiscountItemViewHolder */
    /* loaded from: classes7.dex */
    public final class DiscountItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f81287a;

        /* renamed from: b */
        public final TextView f81288b;

        /* renamed from: c */
        public final TextView f81289c;

        /* renamed from: d */
        public final /* synthetic */ MrtrMultiSimPaymentDiscountAdapter f81290d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscountItemViewHolder(@NotNull MrtrMultiSimPaymentDiscountAdapter mrtrMultiSimPaymentDiscountAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81290d = mrtrMultiSimPaymentDiscountAdapter;
            View findViewById = view.findViewById(R.id.tvDisCountLabel);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f81287a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvDisCountNumber);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81288b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvDisCountValue);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81289c = (TextView) findViewById3;
        }

        @NotNull
        public final TextView getTvDisCountLabel() {
            return this.f81287a;
        }

        @NotNull
        public final TextView getTvDisCountNumber() {
            return this.f81288b;
        }

        @NotNull
        public final TextView getTvDisCountValue() {
            return this.f81289c;
        }
    }

    public MrtrMultiSimPaymentDiscountAdapter(@NotNull Activity activity, @NotNull List<MultiSimDisCountItem> discountList) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(discountList, "discountList");
        this.f81285a = activity;
        this.f81286b = discountList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81286b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MultiSimDisCountItem multiSimDisCountItem = (MultiSimDisCountItem) this.f81286b.get(i);
        if (holder instanceof DiscountItemViewHolder) {
            DiscountItemViewHolder discountItemViewHolder = (DiscountItemViewHolder) holder;
            discountItemViewHolder.getTvDisCountLabel().setText(multiSimDisCountItem.getName());
            discountItemViewHolder.getTvDisCountNumber().setText(String.valueOf(multiSimDisCountItem.getCountNumber()));
            discountItemViewHolder.getTvDisCountValue().setText(this.f81285a.getString(R.string.negative_value, MoneyFormatExtKt.toMoneyFormatNoFloating(multiSimDisCountItem.getCountValue())));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81285a).inflate(R.layout.item_multi_sim_discount, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DiscountItemViewHolder(this, view);
    }
}
