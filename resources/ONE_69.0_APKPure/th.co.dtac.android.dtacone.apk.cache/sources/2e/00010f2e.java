package th.p047co.dtac.android.dtacone.adapter.buy_dol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.buy_dol.BuyDolListBankAccountAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZBankAccountItemRowBinding;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolDirectAccounts;
import th.p047co.dtac.android.dtacone.model.buy_dol.DirectAccount;
import th.p047co.dtac.android.dtacone.util.constant.bank_account.BankAccountType;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R$\u0010,\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001d¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListBankAccountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListBankAccountAdapter$BankAccountViewHolder;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolDirectAccounts;", "directAccounts", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolDirectAccounts;Landroid/content/Context;)V", "", "bankCode", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListBankAccountAdapter$BankAccountViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListBankAccountAdapter$BankAccountViewHolder;I)V", "Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;", "account", OperatorName.NON_STROKING_GRAY, "(Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;)V", "bankAccount", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListBankAccountAdapter$BankAccountViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolDirectAccounts;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "Landroid/widget/RadioGroup;", "Landroid/widget/RadioGroup;", "lastGroupChecked", "Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;", "getSelectedAccount", "()Lth/co/dtac/android/dtacone/model/buy_dol/DirectAccount;", "setSelectedAccount", "selectedAccount", "BankAccountViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBuyDolListBankAccountAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyDolListBankAccountAdapter.kt\nth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListBankAccountAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolListBankAccountAdapter */
/* loaded from: classes7.dex */
public final class BuyDolListBankAccountAdapter extends RecyclerView.Adapter<BankAccountViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final BuyDolDirectAccounts f81098a;

    /* renamed from: b */
    public final Context f81099b;

    /* renamed from: c */
    public RadioGroup f81100c;

    /* renamed from: d */
    public DirectAccount f81101d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolListBankAccountAdapter$BankAccountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZBankAccountItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZBankAccountItemRowBinding;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "tvName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTvAccountNumber", "setTvAccountNumber", "tvAccountNumber", "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "getIvBankBand", "()Landroid/widget/ImageView;", "setIvBankBand", "(Landroid/widget/ImageView;)V", "ivBankBand", "Landroidx/cardview/widget/CardView;", "d", "Landroidx/cardview/widget/CardView;", "getCreditCardView", "()Landroidx/cardview/widget/CardView;", "setCreditCardView", "(Landroidx/cardview/widget/CardView;)V", "creditCardView", "Landroid/widget/RadioButton;", "e", "Landroid/widget/RadioButton;", "getRdb", "()Landroid/widget/RadioButton;", "setRdb", "(Landroid/widget/RadioButton;)V", "rdb", "Landroid/widget/RadioGroup;", OperatorName.FILL_NON_ZERO, "Landroid/widget/RadioGroup;", "getRdbGroup", "()Landroid/widget/RadioGroup;", "setRdbGroup", "(Landroid/widget/RadioGroup;)V", "rdbGroup", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolListBankAccountAdapter$BankAccountViewHolder */
    /* loaded from: classes7.dex */
    public static final class BankAccountViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public TextView f81102a;

        /* renamed from: b */
        public TextView f81103b;

        /* renamed from: c */
        public ImageView f81104c;

        /* renamed from: d */
        public CardView f81105d;

        /* renamed from: e */
        public RadioButton f81106e;

        /* renamed from: f */
        public RadioGroup f81107f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankAccountViewHolder(@NotNull ZBankAccountItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            DtacFontTextView dtacFontTextView = binding.tvName;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView, "binding.tvName");
            this.f81102a = dtacFontTextView;
            DtacFontTextView dtacFontTextView2 = binding.tvAccountNumber;
            Intrinsics.checkNotNullExpressionValue(dtacFontTextView2, "binding.tvAccountNumber");
            this.f81103b = dtacFontTextView2;
            AppCompatImageView appCompatImageView = binding.ivBankBand;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivBankBand");
            this.f81104c = appCompatImageView;
            DtacCardView dtacCardView = binding.bankAccountCardView;
            Intrinsics.checkNotNullExpressionValue(dtacCardView, "binding.bankAccountCardView");
            this.f81105d = dtacCardView;
            DtacRadioButton dtacRadioButton = binding.rdb;
            Intrinsics.checkNotNullExpressionValue(dtacRadioButton, "binding.rdb");
            this.f81106e = dtacRadioButton;
            RadioGroup radioGroup = binding.rdbGroup;
            Intrinsics.checkNotNullExpressionValue(radioGroup, "binding.rdbGroup");
            this.f81107f = radioGroup;
        }

        @NotNull
        public final CardView getCreditCardView() {
            return this.f81105d;
        }

        @NotNull
        public final ImageView getIvBankBand() {
            return this.f81104c;
        }

        @NotNull
        public final RadioButton getRdb() {
            return this.f81106e;
        }

        @NotNull
        public final RadioGroup getRdbGroup() {
            return this.f81107f;
        }

        @NotNull
        public final TextView getTvAccountNumber() {
            return this.f81103b;
        }

        @NotNull
        public final TextView getTvName() {
            return this.f81102a;
        }

        public final void setCreditCardView(@NotNull CardView cardView) {
            Intrinsics.checkNotNullParameter(cardView, "<set-?>");
            this.f81105d = cardView;
        }

        public final void setIvBankBand(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.f81104c = imageView;
        }

        public final void setRdb(@NotNull RadioButton radioButton) {
            Intrinsics.checkNotNullParameter(radioButton, "<set-?>");
            this.f81106e = radioButton;
        }

        public final void setRdbGroup(@NotNull RadioGroup radioGroup) {
            Intrinsics.checkNotNullParameter(radioGroup, "<set-?>");
            this.f81107f = radioGroup;
        }

        public final void setTvAccountNumber(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.f81103b = textView;
        }

        public final void setTvName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.f81102a = textView;
        }
    }

    public BuyDolListBankAccountAdapter(@NotNull BuyDolDirectAccounts directAccounts, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(directAccounts, "directAccounts");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81098a = directAccounts;
        this.f81099b = context;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20613a(BankAccountViewHolder bankAccountViewHolder, DirectAccount directAccount, BuyDolListBankAccountAdapter buyDolListBankAccountAdapter, View view) {
        m20608f(bankAccountViewHolder, directAccount, buyDolListBankAccountAdapter, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20612b(BuyDolListBankAccountAdapter buyDolListBankAccountAdapter, DirectAccount directAccount, RadioGroup radioGroup, int i) {
        m20609e(buyDolListBankAccountAdapter, directAccount, radioGroup, i);
    }

    /* renamed from: d */
    private final String m20610d(String str) {
        if (Intrinsics.areEqual(str, BankAccountType.INSTANCE.getSCB_L())) {
            return "ธนาคารไทยพาณิชย์";
        }
        return "";
    }

    /* renamed from: e */
    public static final void m20609e(BuyDolListBankAccountAdapter this$0, DirectAccount directAccount, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadioGroup radioGroup2 = this$0.f81100c;
        if (radioGroup2 != radioGroup && radioGroup2 != null) {
            radioGroup2.clearCheck();
        }
        this$0.f81100c = radioGroup;
        if (directAccount != null) {
            this$0.m20607g(directAccount);
        }
    }

    /* renamed from: f */
    public static final void m20608f(BankAccountViewHolder holder, DirectAccount directAccount, BuyDolListBankAccountAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        holder.getRdb().setChecked(true);
        if (directAccount != null) {
            this$0.m20607g(directAccount);
        }
    }

    /* renamed from: c */
    public final void m20611c(DirectAccount directAccount, BankAccountViewHolder bankAccountViewHolder) {
        String str;
        int i;
        String bankCode = directAccount.getBankCode();
        if (bankCode != null) {
            str = bankCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        } else {
            str = null;
        }
        BankAccountType bankAccountType = BankAccountType.INSTANCE;
        if (Intrinsics.areEqual(str, bankAccountType.getSCB_L())) {
            i = R.drawable.ic_scb;
        } else if (Intrinsics.areEqual(str, bankAccountType.getKTB())) {
            i = R.drawable.ic_ktb;
        } else if (Intrinsics.areEqual(str, bankAccountType.getKS())) {
            i = R.drawable.ic_ks;
        } else {
            i = R.drawable.ic_card_default;
        }
        bankAccountViewHolder.getIvBankBand().setImageDrawable(ContextCompat.getDrawable(this.f81099b, i));
    }

    /* renamed from: g */
    public final void m20607g(DirectAccount directAccount) {
        this.f81101d = directAccount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<DirectAccount> directAccounts = this.f81098a.getDirectAccounts();
        if (directAccounts != null) {
            return directAccounts.size();
        }
        return 0;
    }

    @Nullable
    public final DirectAccount getSelectedAccount() {
        return this.f81101d;
    }

    public final void setSelectedAccount(@Nullable DirectAccount directAccount) {
        this.f81101d = directAccount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final BankAccountViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<DirectAccount> directAccounts = this.f81098a.getDirectAccounts();
        final DirectAccount directAccount = directAccounts != null ? directAccounts.get(i) : null;
        if (directAccount != null) {
            m20611c(directAccount, holder);
        }
        holder.getTvName().setText(m20610d((directAccount == null || (r2 = directAccount.getBankCode()) == null) ? "" : ""));
        TextView tvAccountNumber = holder.getTvAccountNumber();
        String str = "CARD HOLDER NAME";
        if (directAccount != null) {
            String aliasBankName = directAccount.getAliasBankName();
            String aliasBankName2 = (aliasBankName == null || aliasBankName.length() == 0) ? "CARD HOLDER NAME" : directAccount.getAliasBankName();
            if (aliasBankName2 != null) {
                str = aliasBankName2;
            }
        }
        tvAccountNumber.setText(str);
        holder.getRdbGroup().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: Ie
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                BuyDolListBankAccountAdapter.m20612b(BuyDolListBankAccountAdapter.this, directAccount, radioGroup, i2);
            }
        });
        holder.getRdb().setTag(Integer.valueOf(i));
        holder.getCreditCardView().setOnClickListener(new View.OnClickListener() { // from class: Je
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuyDolListBankAccountAdapter.m20613a(BuyDolListBankAccountAdapter.BankAccountViewHolder.this, directAccount, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BankAccountViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ZBankAccountItemRowBinding inflate = ZBankAccountItemRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new BankAccountViewHolder(inflate);
    }
}