package th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.ItemOneCreditCardBinding;
import th.p047co.dtac.android.dtacone.util.constant.credit_card.CreditCardType;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolCreditCardListAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneCreditCardModel;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&'B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$ViewHolder;", "", "accountCode", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneCreditCardModel;", "Lkotlin/collections/ArrayList;", "creditCardList", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/ArrayList;", "Landroid/widget/RadioGroup;", OperatorName.CURVE_TO, "Landroid/widget/RadioGroup;", "lastGroupChecked", "d", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolCreditCardListAdapter */
/* loaded from: classes10.dex */
public final class OneBuyDolCreditCardListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f88327a;

    /* renamed from: b */
    public final ArrayList f88328b;

    /* renamed from: c */
    public RadioGroup f88329c;

    /* renamed from: d */
    public OnClickListener f88330d;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$OnClickListener;", "", "onDeleteCreditCardItem", "", "position", "", "accountCode", "", "cardToken", "cardNumber", "onSelectCreditCardItem", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneCreditCardModel;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolCreditCardListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onDeleteCreditCardItem(int i, @NotNull String str, @NotNull String str2, @NotNull String str3);

        void onSelectCreditCardItem(int i, @NotNull OneCreditCardModel oneCreditCardModel);
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneCreditCardBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneCreditCardBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneCreditCardModel;", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$OnClickListener;", "onClickListener", "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneCreditCardModel;Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolCreditCardListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneCreditCardBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolCreditCardListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneCreditCardBinding f88331a;

        /* renamed from: b */
        public final /* synthetic */ OneBuyDolCreditCardListAdapter f88332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneBuyDolCreditCardListAdapter oneBuyDolCreditCardListAdapter, ItemOneCreditCardBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f88332b = oneBuyDolCreditCardListAdapter;
            this.f88331a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m16076b(OneBuyDolCreditCardListAdapter oneBuyDolCreditCardListAdapter, OnClickListener onClickListener, ViewHolder viewHolder, OneCreditCardModel oneCreditCardModel, RadioGroup radioGroup, int i) {
            m16074d(oneBuyDolCreditCardListAdapter, onClickListener, viewHolder, oneCreditCardModel, radioGroup, i);
        }

        /* renamed from: c */
        public static /* synthetic */ void m16075c(ItemOneCreditCardBinding itemOneCreditCardBinding, View view) {
            m16073e(itemOneCreditCardBinding, view);
        }

        /* renamed from: d */
        public static final void m16074d(OneBuyDolCreditCardListAdapter this$0, OnClickListener onClickListener, ViewHolder this$1, OneCreditCardModel item, RadioGroup radioGroup, int i) {
            RadioGroup radioGroup2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(item, "$item");
            if (this$0.f88329c != radioGroup && (radioGroup2 = this$0.f88329c) != null) {
                radioGroup2.clearCheck();
            }
            this$0.f88329c = radioGroup;
            if (onClickListener != null) {
                onClickListener.onSelectCreditCardItem(this$1.getAbsoluteAdapterPosition(), item);
            }
        }

        /* renamed from: e */
        public static final void m16073e(ItemOneCreditCardBinding this_apply, View view) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.creditCardRadioButton.setChecked(true);
        }

        public final void bind(@NotNull final OneCreditCardModel item, @Nullable final OnClickListener onClickListener) {
            String str;
            int i;
            Intrinsics.checkNotNullParameter(item, "item");
            final ItemOneCreditCardBinding itemOneCreditCardBinding = this.f88331a;
            final OneBuyDolCreditCardListAdapter oneBuyDolCreditCardListAdapter = this.f88332b;
            String brand = item.getBrand();
            if (brand != null) {
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                str = brand.toUpperCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            } else {
                str = null;
            }
            CreditCardType creditCardType = CreditCardType.INSTANCE;
            if (Intrinsics.areEqual(str, creditCardType.getJCB())) {
                i = R.drawable.ic_icon_jcb;
            } else if (Intrinsics.areEqual(str, creditCardType.getVISA())) {
                i = R.drawable.ic_icon_visa;
            } else if (Intrinsics.areEqual(str, creditCardType.getMASTERCARD())) {
                i = R.drawable.ic_icon_mastercard;
            } else {
                i = R.drawable.ic_card_default;
            }
            itemOneCreditCardBinding.creditCardImageView.setImageDrawable(ContextCompat.getDrawable(itemOneCreditCardBinding.getRoot().getContext(), i));
            itemOneCreditCardBinding.creditCardNameTextView.setText(item.getName());
            itemOneCreditCardBinding.creditCardNumberTextView.setText(item.getCardNumber());
            AppCompatImageView deleteCreditCardImageView = itemOneCreditCardBinding.deleteCreditCardImageView;
            Intrinsics.checkNotNullExpressionValue(deleteCreditCardImageView, "deleteCreditCardImageView");
            OnSingleClickListenerKt.setOnSingleClickListener(deleteCreditCardImageView, new OneBuyDolCreditCardListAdapter$ViewHolder$bind$1$1(onClickListener, this, oneBuyDolCreditCardListAdapter, item));
            itemOneCreditCardBinding.creditCardRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: EL0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                    OneBuyDolCreditCardListAdapter.ViewHolder.m16076b(OneBuyDolCreditCardListAdapter.this, onClickListener, this, item, radioGroup, i2);
                }
            });
            itemOneCreditCardBinding.creditCardLayout.setOnClickListener(new View.OnClickListener() { // from class: FL0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneBuyDolCreditCardListAdapter.ViewHolder.m16075c(ItemOneCreditCardBinding.this, view);
                }
            });
        }
    }

    public OneBuyDolCreditCardListAdapter(@NotNull String accountCode, @NotNull ArrayList<OneCreditCardModel> creditCardList) {
        Intrinsics.checkNotNullParameter(accountCode, "accountCode");
        Intrinsics.checkNotNullParameter(creditCardList, "creditCardList");
        this.f88327a = accountCode;
        this.f88328b = creditCardList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f88328b.size();
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f88330d = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f88328b.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "creditCardList[position]");
        holder.bind((OneCreditCardModel) obj, this.f88330d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneCreditCardBinding inflate = ItemOneCreditCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}