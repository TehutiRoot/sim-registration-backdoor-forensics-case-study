package th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemOneBuyDolHistoryBinding;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.util.constant.Status;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolChargeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceResponse;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolChargeResponse;", "item", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolHistoryListAdapter */
/* loaded from: classes10.dex */
public final class OneBuyDolHistoryListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f88333a;

    /* renamed from: b */
    public OnClickListener f88334b;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$OnClickListener;", "", "onSelectHistoryItem", "", "position", "", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolChargeResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolHistoryListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onSelectHistoryItem(int i, @NotNull OneBuyDolChargeResponse oneBuyDolChargeResponse);
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneBuyDolHistoryBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneBuyDolHistoryBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolChargeResponse;", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$OnClickListener;", "onClickListener", "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolChargeResponse;Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolHistoryListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneBuyDolHistoryBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolHistoryListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneBuyDolHistoryBinding f88335a;

        /* renamed from: b */
        public final /* synthetic */ OneBuyDolHistoryListAdapter f88336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneBuyDolHistoryListAdapter oneBuyDolHistoryListAdapter, ItemOneBuyDolHistoryBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f88336b = oneBuyDolHistoryListAdapter;
            this.f88335a = binding;
        }

        public final void bind(@NotNull OneBuyDolChargeResponse item, @Nullable OnClickListener onClickListener) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(item, "item");
            ItemOneBuyDolHistoryBinding itemOneBuyDolHistoryBinding = this.f88335a;
            OneFontTextView oneFontTextView = itemOneBuyDolHistoryBinding.buyDolHistoryPhoneNumberTextView;
            String simR = item.getSimR();
            if (simR != null) {
                str = PhoneNumberExtKt.toPretty(simR);
            } else {
                str = null;
            }
            oneFontTextView.setText(str);
            OneFontTextView oneFontTextView2 = itemOneBuyDolHistoryBinding.buyDolHistoryAmountTextView;
            OneBuyDolPriceResponse dolPrice = item.getDolPrice();
            if (dolPrice != null) {
                str2 = MoneyFormatExtKt.toMoneyFormatNoFloating(dolPrice.getTotal());
            } else {
                str2 = null;
            }
            oneFontTextView2.setText(str2);
            if (AbstractC19741eO1.equals$default(item.getStatus(), Status.getSUCCESS(), false, 2, null)) {
                itemOneBuyDolHistoryBinding.buyDolHistoryStatusImageView.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ic_status_success));
                itemOneBuyDolHistoryBinding.buyDolHistoryDateTextView.setText(item.getPaymentDateTime());
            } else {
                itemOneBuyDolHistoryBinding.buyDolHistoryStatusImageView.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ic_status_error));
                itemOneBuyDolHistoryBinding.buyDolHistoryDateTextView.setText(this.itemView.getContext().getString(R.string.one_buy_dol_history_payment_fail_status));
            }
            CardView historyItem = itemOneBuyDolHistoryBinding.historyItem;
            Intrinsics.checkNotNullExpressionValue(historyItem, "historyItem");
            OnSingleClickListenerKt.setOnSingleClickListener(historyItem, new OneBuyDolHistoryListAdapter$ViewHolder$bind$1$1(onClickListener, this, item));
        }
    }

    public OneBuyDolHistoryListAdapter(@NotNull List<OneBuyDolChargeResponse> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f88333a = item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f88333a.size();
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f88334b = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((OneBuyDolChargeResponse) this.f88333a.get(i), this.f88334b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneBuyDolHistoryBinding inflate = ItemOneBuyDolHistoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}