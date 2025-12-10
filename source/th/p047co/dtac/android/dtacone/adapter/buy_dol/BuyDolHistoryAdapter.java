package th.p047co.dtac.android.dtacone.adapter.buy_dol;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.buy_dol.BuyDolHistoryAdapter;
import th.p047co.dtac.android.dtacone.adapter.listener.buy_dol.OnBuyDolSelectItem;
import th.p047co.dtac.android.dtacone.databinding.ZBuyDolHistoryItemRowBinding;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolHistoryTransaction;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolResponseCharge;
import th.p047co.dtac.android.dtacone.model.buy_dol.dol_price.BuyDolPrice;
import th.p047co.dtac.android.dtacone.util.constant.Status;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\t2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolHistoryAdapter$BuyDolHistoryViewHolder;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolHistoryTransaction;", "historyTransaction", "", "setHistoryBuyDol", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolHistoryTransaction;)V", "Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerListener", "(Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolHistoryAdapter$BuyDolHistoryViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolHistoryAdapter$BuyDolHistoryViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolHistoryTransaction;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;", "BuyDolHistoryViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolHistoryAdapter */
/* loaded from: classes7.dex */
public final class BuyDolHistoryAdapter extends RecyclerView.Adapter<BuyDolHistoryViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f81001a;

    /* renamed from: b */
    public BuyDolHistoryTransaction f81002b;

    /* renamed from: c */
    public OnBuyDolSelectItem f81003c;

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolHistoryAdapter$BuyDolHistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZBuyDolHistoryItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolHistoryAdapter;Lth/co/dtac/android/dtacone/databinding/ZBuyDolHistoryItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge;", "item", "Landroid/app/Activity;", "activity", "Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "bind", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge;Landroid/app/Activity;Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZBuyDolHistoryItemRowBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ZBuyDolHistoryItemRowBinding;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolHistoryAdapter$BuyDolHistoryViewHolder */
    /* loaded from: classes7.dex */
    public final class BuyDolHistoryViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZBuyDolHistoryItemRowBinding f81004a;

        /* renamed from: b */
        public final /* synthetic */ BuyDolHistoryAdapter f81005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyDolHistoryViewHolder(@NotNull BuyDolHistoryAdapter buyDolHistoryAdapter, ZBuyDolHistoryItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81005b = buyDolHistoryAdapter;
            this.f81004a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20440b(BuyDolResponseCharge buyDolResponseCharge, OnBuyDolSelectItem onBuyDolSelectItem, View view) {
            m20439c(buyDolResponseCharge, onBuyDolSelectItem, view);
        }

        /* renamed from: c */
        public static final void m20439c(BuyDolResponseCharge buyDolResponseCharge, OnBuyDolSelectItem onBuyDolSelectItem, View view) {
            if (buyDolResponseCharge != null && onBuyDolSelectItem != null) {
                onBuyDolSelectItem.onBuyDolSelectItem(buyDolResponseCharge);
            }
        }

        public final void bind(@Nullable final BuyDolResponseCharge buyDolResponseCharge, @NotNull Activity activity, @Nullable final OnBuyDolSelectItem<BuyDolResponseCharge> onBuyDolSelectItem) {
            String str;
            String str2;
            String str3;
            BuyDolPrice dolPrice;
            String simR;
            Intrinsics.checkNotNullParameter(activity, "activity");
            ZBuyDolHistoryItemRowBinding zBuyDolHistoryItemRowBinding = this.f81004a;
            String str4 = null;
            if (buyDolResponseCharge != null) {
                str = buyDolResponseCharge.getStatus();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, Status.getSUCCESS())) {
                zBuyDolHistoryItemRowBinding.ivStatus.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_status_success));
                zBuyDolHistoryItemRowBinding.tvPhoneNumber.setTextColor(ContextCompat.getColor(activity, R.color.colorBlue));
                zBuyDolHistoryItemRowBinding.tvPrice.setTextColor(ContextCompat.getColor(activity, R.color.colorBlue));
            } else {
                zBuyDolHistoryItemRowBinding.ivStatus.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.ic_status_error));
            }
            DtacFontTextView dtacFontTextView = zBuyDolHistoryItemRowBinding.tvPhoneNumber;
            if (buyDolResponseCharge != null && (simR = buyDolResponseCharge.getSimR()) != null) {
                str2 = PhoneNumberExtKt.toPretty(simR);
            } else {
                str2 = null;
            }
            dtacFontTextView.setText(str2);
            DtacFontTextView dtacFontTextView2 = zBuyDolHistoryItemRowBinding.tvDisplayDateTime;
            if (buyDolResponseCharge != null) {
                str3 = buyDolResponseCharge.getPaymentDateTime();
            } else {
                str3 = null;
            }
            dtacFontTextView2.setText(str3);
            DtacFontTextView dtacFontTextView3 = zBuyDolHistoryItemRowBinding.tvPrice;
            if (buyDolResponseCharge != null && (dolPrice = buyDolResponseCharge.getDolPrice()) != null) {
                str4 = MoneyFormatExtKt.toMoneyFormatNoFloating(dolPrice.getTotal());
            }
            dtacFontTextView3.setText(str4);
            zBuyDolHistoryItemRowBinding.buyDolHistoryCardview.setOnClickListener(new View.OnClickListener() { // from class: Ce
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyDolHistoryAdapter.BuyDolHistoryViewHolder.m20440b(buyDolResponseCharge, onBuyDolSelectItem, view);
                }
            });
        }

        @NotNull
        public final ZBuyDolHistoryItemRowBinding getBinding() {
            return this.f81004a;
        }
    }

    @Inject
    public BuyDolHistoryAdapter(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81001a = activity;
    }

    @NotNull
    public final Activity getActivity() {
        return this.f81001a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BuyDolResponseCharge> buyDolHistory;
        BuyDolHistoryTransaction buyDolHistoryTransaction = this.f81002b;
        if (buyDolHistoryTransaction != null && (buyDolHistory = buyDolHistoryTransaction.getBuyDolHistory()) != null) {
            return buyDolHistory.size();
        }
        return 0;
    }

    public final void registerListener(@NotNull OnBuyDolSelectItem<BuyDolResponseCharge> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81003c = listener;
    }

    public final void setHistoryBuyDol(@NotNull BuyDolHistoryTransaction historyTransaction) {
        Intrinsics.checkNotNullParameter(historyTransaction, "historyTransaction");
        this.f81002b = historyTransaction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BuyDolHistoryViewHolder holder, int i) {
        List<BuyDolResponseCharge> buyDolHistory;
        Intrinsics.checkNotNullParameter(holder, "holder");
        BuyDolHistoryTransaction buyDolHistoryTransaction = this.f81002b;
        holder.bind((buyDolHistoryTransaction == null || (buyDolHistory = buyDolHistoryTransaction.getBuyDolHistory()) == null) ? null : buyDolHistory.get(i), this.f81001a, this.f81003c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BuyDolHistoryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ZBuyDolHistoryItemRowBinding inflate = ZBuyDolHistoryItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new BuyDolHistoryViewHolder(this, inflate);
    }
}
