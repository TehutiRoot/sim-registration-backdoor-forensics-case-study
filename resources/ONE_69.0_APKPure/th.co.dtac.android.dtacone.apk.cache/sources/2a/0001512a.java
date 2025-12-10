package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration;

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
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.DiscountItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPaymentDiscountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/DiscountItem;", "discountList", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "Companion", "DiscountItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPaymentDiscountAdapter */
/* loaded from: classes9.dex */
public final class MrtrPaymentDiscountAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f103452a;

    /* renamed from: b */
    public final List f103453b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPaymentDiscountAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPaymentDiscountAdapter$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPaymentDiscountAdapter$DiscountItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_registration/MrtrPaymentDiscountAdapter;Landroid/view/View;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvDisCountLabel", "()Landroid/widget/TextView;", "tvDisCountLabel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTvDisCountValue", "tvDisCountValue", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.MrtrPaymentDiscountAdapter$DiscountItemViewHolder */
    /* loaded from: classes9.dex */
    public final class DiscountItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f103454a;

        /* renamed from: b */
        public final TextView f103455b;

        /* renamed from: c */
        public final /* synthetic */ MrtrPaymentDiscountAdapter f103456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscountItemViewHolder(@NotNull MrtrPaymentDiscountAdapter mrtrPaymentDiscountAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f103456c = mrtrPaymentDiscountAdapter;
            View findViewById = view.findViewById(R.id.tvDisCountLabel);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f103454a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvDisCountValue);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f103455b = (TextView) findViewById2;
        }

        @NotNull
        public final TextView getTvDisCountLabel() {
            return this.f103454a;
        }

        @NotNull
        public final TextView getTvDisCountValue() {
            return this.f103455b;
        }
    }

    public MrtrPaymentDiscountAdapter(@NotNull Activity activity, @Nullable List<DiscountItem> list) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f103452a = activity;
        this.f103453b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f103453b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f103453b;
        Intrinsics.checkNotNull(list);
        DiscountItem discountItem = (DiscountItem) list.get(i);
        if (holder instanceof DiscountItemViewHolder) {
            TextView tvDisCountValue = ((DiscountItemViewHolder) holder).getTvDisCountValue();
            Integer lineAmount = discountItem.getLineAmount();
            String str = (lineAmount == null || (str = MoneyFormatExtKt.toMoneyFormatNoFloating(lineAmount.intValue())) == null) ? "0" : "0";
            tvDisCountValue.setText(HelpFormatter.DEFAULT_OPT_PREFIX + str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f103452a).inflate(R.layout.item_discount, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DiscountItemViewHolder(this, view);
    }
}