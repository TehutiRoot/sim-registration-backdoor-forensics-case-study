package th.p047co.dtac.android.dtacone.adapter.buy_dol;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.adapter.buy_dol.BuyDolPriceListAdapter;
import th.p047co.dtac.android.dtacone.adapter.listener.price_list.OnClickPrice;
import th.p047co.dtac.android.dtacone.databinding.ZEpinItemRowBinding;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\n2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolPriceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolPriceListAdapter$PriceViewHolder;", "<init>", "()V", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "prices", "Lth/co/dtac/android/dtacone/adapter/listener/price_list/OnClickPrice;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "priceAndAdapter", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;Lth/co/dtac/android/dtacone/adapter/listener/price_list/OnClickPrice;)V", "selected", "lastSelected", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolPriceListAdapter$PriceViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolPriceListAdapter$PriceViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "Landroid/widget/RadioGroup;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/RadioGroup;", "lastGroupChecked", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/listener/price_list/OnClickPrice;", "d", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;", "PriceViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolPriceListAdapter */
/* loaded from: classes7.dex */
public final class BuyDolPriceListAdapter extends RecyclerView.Adapter<PriceViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public BuyDolPriceList f81025a;

    /* renamed from: b */
    public RadioGroup f81026b;

    /* renamed from: c */
    public OnClickPrice f81027c;

    /* renamed from: d */
    public BuyDolPriceList.PriceListData f81028d;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolPriceListAdapter$PriceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZEpinItemRowBinding;", "binding", "Lth/co/dtac/android/dtacone/adapter/listener/price_list/OnClickPrice;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolPriceListAdapter;Lth/co/dtac/android/dtacone/databinding/ZEpinItemRowBinding;Lth/co/dtac/android/dtacone/adapter/listener/price_list/OnClickPrice;)V", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZEpinItemRowBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ZEpinItemRowBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/listener/price_list/OnClickPrice;", "getListener", "()Lth/co/dtac/android/dtacone/adapter/listener/price_list/OnClickPrice;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolPriceListAdapter$PriceViewHolder */
    /* loaded from: classes7.dex */
    public final class PriceViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZEpinItemRowBinding f81029a;

        /* renamed from: b */
        public final OnClickPrice f81030b;

        /* renamed from: c */
        public final /* synthetic */ BuyDolPriceListAdapter f81031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceViewHolder(@NotNull BuyDolPriceListAdapter buyDolPriceListAdapter, @Nullable ZEpinItemRowBinding binding, OnClickPrice<BuyDolPriceList.PriceListData> onClickPrice) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81031c = buyDolPriceListAdapter;
            this.f81029a = binding;
            this.f81030b = onClickPrice;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20423b(BuyDolPriceListAdapter buyDolPriceListAdapter, RadioGroup radioGroup, int i) {
            m20421d(buyDolPriceListAdapter, radioGroup, i);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20422c(PriceViewHolder priceViewHolder, BuyDolPriceList buyDolPriceList, View view) {
            m20420e(priceViewHolder, buyDolPriceList, view);
        }

        /* renamed from: d */
        public static final void m20421d(BuyDolPriceListAdapter this$0, RadioGroup radioGroup, int i) {
            RadioGroup radioGroup2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.f81026b != radioGroup && (radioGroup2 = this$0.f81026b) != null) {
                radioGroup2.clearCheck();
            }
            this$0.f81026b = radioGroup;
        }

        /* renamed from: e */
        public static final void m20420e(PriceViewHolder this$0, BuyDolPriceList buyDolPriceList, View view) {
            BuyDolPriceList.PriceListData priceListData;
            List<BuyDolPriceList.PriceListData> prices;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            OnClickPrice onClickPrice = this$0.f81030b;
            if (onClickPrice != null) {
                if (buyDolPriceList != null && (prices = buyDolPriceList.getPrices()) != null) {
                    priceListData = prices.get(this$0.getAbsoluteAdapterPosition());
                } else {
                    priceListData = null;
                }
                Intrinsics.checkNotNull(priceListData);
                onClickPrice.onSelectedPriceResult(priceListData);
            }
        }

        public final void bind(@Nullable final BuyDolPriceList buyDolPriceList) {
            Integer num;
            Integer num2;
            List<BuyDolPriceList.PriceListData> prices;
            BuyDolPriceList.PriceListData priceListData;
            List<BuyDolPriceList.PriceListData> prices2;
            BuyDolPriceList.PriceListData priceListData2;
            ZEpinItemRowBinding zEpinItemRowBinding = this.f81029a;
            final BuyDolPriceListAdapter buyDolPriceListAdapter = this.f81031c;
            DtacRadioButton dtacRadioButton = zEpinItemRowBinding.rdbPrice;
            Integer num3 = null;
            if (buyDolPriceList != null && (prices2 = buyDolPriceList.getPrices()) != null && (priceListData2 = prices2.get(getAbsoluteAdapterPosition())) != null) {
                num = Integer.valueOf(priceListData2.getAmount());
            } else {
                num = null;
            }
            dtacRadioButton.setText(String.valueOf(num));
            zEpinItemRowBinding.rdbGroupPrice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: bf
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    BuyDolPriceListAdapter.PriceViewHolder.m20423b(buyDolPriceListAdapter, radioGroup, i);
                }
            });
            DtacRadioButton dtacRadioButton2 = zEpinItemRowBinding.rdbPrice;
            BuyDolPriceList.PriceListData priceListData3 = buyDolPriceListAdapter.f81028d;
            if (priceListData3 != null) {
                num2 = Integer.valueOf(priceListData3.getAmount());
            } else {
                num2 = null;
            }
            if (buyDolPriceList != null && (prices = buyDolPriceList.getPrices()) != null && (priceListData = prices.get(getAbsoluteAdapterPosition())) != null) {
                num3 = Integer.valueOf(priceListData.getAmount());
            }
            dtacRadioButton2.setChecked(Intrinsics.areEqual(num2, num3));
            DtacRadioButton dtacRadioButton3 = zEpinItemRowBinding.rdbPrice;
            dtacRadioButton3.setOnClickListener(new View.OnClickListener() { // from class: cf
                {
                    BuyDolPriceListAdapter.PriceViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyDolPriceListAdapter.PriceViewHolder.m20422c(BuyDolPriceListAdapter.PriceViewHolder.this, buyDolPriceList, view);
                }
            });
            dtacRadioButton3.setTag(Integer.valueOf(getAbsoluteAdapterPosition()));
        }

        @NotNull
        public final ZEpinItemRowBinding getBinding() {
            return this.f81029a;
        }

        @Nullable
        public final OnClickPrice<BuyDolPriceList.PriceListData> getListener() {
            return this.f81030b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BuyDolPriceList.PriceListData> prices;
        BuyDolPriceList buyDolPriceList = this.f81025a;
        if (buyDolPriceList != null && (prices = buyDolPriceList.getPrices()) != null) {
            return prices.size();
        }
        return 0;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void lastSelected(@NotNull BuyDolPriceList.PriceListData selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f81028d = selected;
        notifyDataSetChanged();
    }

    public final void priceAndAdapter(@NotNull BuyDolPriceList prices, @NotNull OnClickPrice<BuyDolPriceList.PriceListData> listener) {
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81027c = listener;
        this.f81025a = prices;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PriceViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.f81025a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PriceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ZEpinItemRowBinding inflate = ZEpinItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new PriceViewHolder(this, inflate, this.f81027c);
    }
}
