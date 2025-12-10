package th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;
import th.p047co.dtac.android.dtacone.databinding.OneItemEPinBinding;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolPriceListAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceListResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002'(B#\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse$PriceListData;", "Lkotlin/collections/ArrayList;", "item", "<init>", "(Ljava/util/ArrayList;)V", "selected", "", "lastSelected", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse$PriceListData;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "Landroid/widget/RadioGroup;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/RadioGroup;", "lastGroupChecked", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse$PriceListData;", "d", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolPriceListAdapter */
/* loaded from: classes10.dex */
public final class OneBuyDolPriceListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f88337a;

    /* renamed from: b */
    public RadioGroup f88338b;

    /* renamed from: c */
    public OneBuyDolPriceListResponse.PriceListData f88339c;

    /* renamed from: d */
    public OnClickListener f88340d;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$OnClickListener;", "", "onSelectPriceItem", "", "position", "", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse$PriceListData;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolPriceListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onSelectPriceItem(int i, @Nullable OneBuyDolPriceListResponse.PriceListData priceListData);
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/OneItemEPinBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter;Lth/co/dtac/android/dtacone/databinding/OneItemEPinBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse$PriceListData;", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$OnClickListener;", "onClickListener", "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse$PriceListData;Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolPriceListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/OneItemEPinBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolPriceListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final OneItemEPinBinding f88341a;

        /* renamed from: b */
        public final /* synthetic */ OneBuyDolPriceListAdapter f88342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneBuyDolPriceListAdapter oneBuyDolPriceListAdapter, OneItemEPinBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f88342b = oneBuyDolPriceListAdapter;
            this.f88341a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m16072b(OneBuyDolPriceListAdapter oneBuyDolPriceListAdapter, RadioGroup radioGroup, int i) {
            m16070d(oneBuyDolPriceListAdapter, radioGroup, i);
        }

        /* renamed from: c */
        public static /* synthetic */ void m16071c(OnClickListener onClickListener, ViewHolder viewHolder, OneBuyDolPriceListResponse.PriceListData priceListData, View view) {
            m16069e(onClickListener, viewHolder, priceListData, view);
        }

        /* renamed from: d */
        public static final void m16070d(OneBuyDolPriceListAdapter this$0, RadioGroup radioGroup, int i) {
            RadioGroup radioGroup2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.f88338b != radioGroup && (radioGroup2 = this$0.f88338b) != null) {
                radioGroup2.clearCheck();
            }
            this$0.f88338b = radioGroup;
        }

        /* renamed from: e */
        public static final void m16069e(OnClickListener onClickListener, ViewHolder this$0, OneBuyDolPriceListResponse.PriceListData priceListData, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (onClickListener != null) {
                onClickListener.onSelectPriceItem(this$0.getAbsoluteAdapterPosition(), priceListData);
            }
        }

        public final void bind(@Nullable final OneBuyDolPriceListResponse.PriceListData priceListData, @Nullable final OnClickListener onClickListener) {
            Integer num;
            Integer num2;
            OneItemEPinBinding oneItemEPinBinding = this.f88341a;
            final OneBuyDolPriceListAdapter oneBuyDolPriceListAdapter = this.f88342b;
            OneRadioButton oneRadioButton = oneItemEPinBinding.priceRadioButton;
            Integer num3 = null;
            if (priceListData != null) {
                num = Integer.valueOf(priceListData.getAmount());
            } else {
                num = null;
            }
            oneRadioButton.setText(MoneyFormatExtKt.toMoneyFormatNoFloating(String.valueOf(num)));
            oneItemEPinBinding.priceLayout.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: GL0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    OneBuyDolPriceListAdapter.ViewHolder.m16072b(OneBuyDolPriceListAdapter.this, radioGroup, i);
                }
            });
            OneRadioButton oneRadioButton2 = oneItemEPinBinding.priceRadioButton;
            OneBuyDolPriceListResponse.PriceListData priceListData2 = oneBuyDolPriceListAdapter.f88339c;
            if (priceListData2 != null) {
                num2 = Integer.valueOf(priceListData2.getAmount());
            } else {
                num2 = null;
            }
            if (priceListData != null) {
                num3 = Integer.valueOf(priceListData.getAmount());
            }
            oneRadioButton2.setChecked(Intrinsics.areEqual(num2, num3));
            oneItemEPinBinding.priceRadioButton.setOnClickListener(new View.OnClickListener() { // from class: HL0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneBuyDolPriceListAdapter.ViewHolder.m16071c(OneBuyDolPriceListAdapter.OnClickListener.this, this, priceListData, view);
                }
            });
        }
    }

    public OneBuyDolPriceListAdapter(@Nullable ArrayList<OneBuyDolPriceListResponse.PriceListData> arrayList) {
        this.f88337a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f88337a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void lastSelected(@NotNull OneBuyDolPriceListResponse.PriceListData selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f88339c = selected;
        notifyDataSetChanged();
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f88340d = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.f88337a;
        holder.bind(arrayList != null ? (OneBuyDolPriceListResponse.PriceListData) arrayList.get(i) : null, this.f88340d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        OneItemEPinBinding inflate = OneItemEPinBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(this, inflate);
    }
}