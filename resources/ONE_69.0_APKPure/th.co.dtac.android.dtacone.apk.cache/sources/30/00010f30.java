package th.p047co.dtac.android.dtacone.adapter.buy_dol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.buy_dol.BuyDolListCreditAdapter;
import th.p047co.dtac.android.dtacone.adapter.listener.buy_dol.OnBuyDolSelectItem;
import th.p047co.dtac.android.dtacone.adapter.listener.buy_dol.OnDeleteCard;
import th.p047co.dtac.android.dtacone.databinding.ZCreditCardItemRowBinding;
import th.p047co.dtac.android.dtacone.model.buy_dol.CreditCard;
import th.p047co.dtac.android.dtacone.util.constant.credit_card.CreditCardType;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00013BK\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\nj\b\u0012\u0004\u0012\u00020\u0004`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\nj\b\u0012\u0004\u0012\u00020\u0004`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListCreditAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListCreditAdapter$BuyDolCreditViewHolder;", "Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;", "Lth/co/dtac/android/dtacone/model/buy_dol/CreditCard;", "buyDolSelectCardListener", "Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnDeleteCard;", "", "deleteCard", "accountCode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cards", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnDeleteCard;Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListCreditAdapter$BuyDolCreditViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListCreditAdapter$BuyDolCreditViewHolder;I)V", "clearSelectedCard", "()V", "getItemCount", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)V", "creditCard", "Lth/co/dtac/android/dtacone/databinding/ZCreditCardItemRowBinding;", "binding", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lth/co/dtac/android/dtacone/model/buy_dol/CreditCard;Lth/co/dtac/android/dtacone/databinding/ZCreditCardItemRowBinding;)V", "Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnBuyDolSelectItem;", "Lth/co/dtac/android/dtacone/adapter/listener/buy_dol/OnDeleteCard;", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "Ljava/util/ArrayList;", "e", "Landroid/content/Context;", "Landroid/widget/RadioGroup;", OperatorName.FILL_NON_ZERO, "Landroid/widget/RadioGroup;", "lastGroupChecked", "BuyDolCreditViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolListCreditAdapter */
/* loaded from: classes7.dex */
public final class BuyDolListCreditAdapter extends RecyclerView.Adapter<BuyDolCreditViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final OnBuyDolSelectItem f81108a;

    /* renamed from: b */
    public final OnDeleteCard f81109b;

    /* renamed from: c */
    public final String f81110c;

    /* renamed from: d */
    public final ArrayList f81111d;

    /* renamed from: e */
    public final Context f81112e;

    /* renamed from: f */
    public RadioGroup f81113f;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListCreditAdapter$BuyDolCreditViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZCreditCardItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListCreditAdapter;Lth/co/dtac/android/dtacone/databinding/ZCreditCardItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/buy_dol/CreditCard;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/buy_dol/CreditCard;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZCreditCardItemRowBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolListCreditAdapter$BuyDolCreditViewHolder */
    /* loaded from: classes7.dex */
    public final class BuyDolCreditViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZCreditCardItemRowBinding f81114a;

        /* renamed from: b */
        public final /* synthetic */ BuyDolListCreditAdapter f81115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyDolCreditViewHolder(@NotNull BuyDolListCreditAdapter buyDolListCreditAdapter, ZCreditCardItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81115b = buyDolListCreditAdapter;
            this.f81114a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20604b(ZCreditCardItemRowBinding zCreditCardItemRowBinding, BuyDolListCreditAdapter buyDolListCreditAdapter, BuyDolCreditViewHolder buyDolCreditViewHolder, View view) {
            m20599g(zCreditCardItemRowBinding, buyDolListCreditAdapter, buyDolCreditViewHolder, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m20603c(BuyDolListCreditAdapter buyDolListCreditAdapter, BuyDolCreditViewHolder buyDolCreditViewHolder, RadioGroup radioGroup, int i) {
            m20601e(buyDolListCreditAdapter, buyDolCreditViewHolder, radioGroup, i);
        }

        /* renamed from: d */
        public static /* synthetic */ void m20602d(BuyDolListCreditAdapter buyDolListCreditAdapter, CreditCard creditCard, BuyDolCreditViewHolder buyDolCreditViewHolder, View view) {
            m20600f(buyDolListCreditAdapter, creditCard, buyDolCreditViewHolder, view);
        }

        /* renamed from: e */
        public static final void m20601e(BuyDolListCreditAdapter this$0, BuyDolCreditViewHolder this$1, RadioGroup radioGroup, int i) {
            RadioGroup radioGroup2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.f81113f != radioGroup && (radioGroup2 = this$0.f81113f) != null) {
                radioGroup2.clearCheck();
            }
            this$0.f81113f = radioGroup;
            this$0.m20605b(this$1.getAbsoluteAdapterPosition());
        }

        /* renamed from: f */
        public static final void m20600f(BuyDolListCreditAdapter this$0, CreditCard item, BuyDolCreditViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            OnDeleteCard onDeleteCard = this$0.f81109b;
            String str = this$0.f81110c;
            String cardToken = item.getCardToken();
            String str2 = "";
            if (cardToken == null) {
                cardToken = "";
            }
            int absoluteAdapterPosition = this$1.getAbsoluteAdapterPosition();
            String cardNumber = item.getCardNumber();
            if (cardNumber != null) {
                str2 = cardNumber;
            }
            onDeleteCard.onDelete(str, cardToken, absoluteAdapterPosition, str2);
        }

        /* renamed from: g */
        public static final void m20599g(ZCreditCardItemRowBinding this_apply, BuyDolListCreditAdapter this$0, BuyDolCreditViewHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this_apply.rdb.setChecked(true);
            this$0.m20605b(this$1.getAbsoluteAdapterPosition());
        }

        public final void bind(@NotNull final CreditCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            final ZCreditCardItemRowBinding zCreditCardItemRowBinding = this.f81114a;
            final BuyDolListCreditAdapter buyDolListCreditAdapter = this.f81115b;
            buyDolListCreditAdapter.m20606a(item, zCreditCardItemRowBinding);
            zCreditCardItemRowBinding.tvName.setText(item.getName());
            zCreditCardItemRowBinding.tvCreditNumber.setText(item.getCardNumber());
            zCreditCardItemRowBinding.rdbGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: Re
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    BuyDolListCreditAdapter.BuyDolCreditViewHolder.m20603c(BuyDolListCreditAdapter.this, this, radioGroup, i);
                }
            });
            zCreditCardItemRowBinding.rdb.setTag(Integer.valueOf(getAbsoluteAdapterPosition()));
            zCreditCardItemRowBinding.ivDelete.setOnClickListener(new View.OnClickListener() { // from class: Se
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyDolListCreditAdapter.BuyDolCreditViewHolder.m20602d(BuyDolListCreditAdapter.this, item, this, view);
                }
            });
            zCreditCardItemRowBinding.bankAccountCardView.setOnClickListener(new View.OnClickListener() { // from class: Te
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyDolListCreditAdapter.BuyDolCreditViewHolder.m20604b(ZCreditCardItemRowBinding.this, buyDolListCreditAdapter, this, view);
                }
            });
        }
    }

    public BuyDolListCreditAdapter(@NotNull OnBuyDolSelectItem<CreditCard> buyDolSelectCardListener, @NotNull OnDeleteCard<String> deleteCard, @NotNull String accountCode, @NotNull ArrayList<CreditCard> cards, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(buyDolSelectCardListener, "buyDolSelectCardListener");
        Intrinsics.checkNotNullParameter(deleteCard, "deleteCard");
        Intrinsics.checkNotNullParameter(accountCode, "accountCode");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81108a = buyDolSelectCardListener;
        this.f81109b = deleteCard;
        this.f81110c = accountCode;
        this.f81111d = cards;
        this.f81112e = context;
    }

    /* renamed from: a */
    public final void m20606a(CreditCard creditCard, ZCreditCardItemRowBinding zCreditCardItemRowBinding) {
        String str;
        int i;
        String brand = creditCard.getBrand();
        if (brand != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            str = brand.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        } else {
            str = null;
        }
        CreditCardType creditCardType = CreditCardType.INSTANCE;
        if (Intrinsics.areEqual(str, creditCardType.getVISA())) {
            i = R.drawable.ic_visa;
        } else if (Intrinsics.areEqual(str, creditCardType.getMASTERCARD())) {
            i = R.drawable.ic_mastercard;
        } else if (Intrinsics.areEqual(str, creditCardType.getJCB())) {
            i = R.drawable.ic_jcb;
        } else {
            i = R.drawable.ic_card_default;
        }
        zCreditCardItemRowBinding.ivBankBand.setImageDrawable(ContextCompat.getDrawable(this.f81112e, i));
    }

    /* renamed from: b */
    public final void m20605b(int i) {
        Object obj = this.f81111d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "cards[position]");
        CreditCard creditCard = (CreditCard) obj;
        this.f81108a.onBuyDolSelectItem(new CreditCard(creditCard.getName(), creditCard.getCardNumber(), creditCard.getBrand(), creditCard.getBank(), creditCard.getCardToken()));
    }

    public final void clearSelectedCard() {
        RadioGroup radioGroup = this.f81113f;
        if (radioGroup != null) {
            if (radioGroup != null) {
                radioGroup.clearCheck();
            }
            this.f81113f = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81111d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BuyDolCreditViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f81111d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "cards[position]");
        holder.bind((CreditCard) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BuyDolCreditViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ZCreditCardItemRowBinding inflate = ZCreditCardItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new BuyDolCreditViewHolder(this, inflate);
    }
}