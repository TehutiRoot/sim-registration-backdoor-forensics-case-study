package th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter;

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
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemOneBankAccountBinding;
import th.p047co.dtac.android.dtacone.util.constant.bank_account.BankAccountType;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankAccountListAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneDirectAccountListModel;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolDirectAccountResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002'(B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$ViewHolder;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;", "directAccounts", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;Landroid/content/Context;)V", "", "bankCode", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$OnClickListener;)V", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolDirectAccountResponse;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "Landroid/widget/RadioGroup;", OperatorName.CURVE_TO, "Landroid/widget/RadioGroup;", "lastGroupChecked", "d", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankAccountListAdapter */
/* loaded from: classes10.dex */
public final class OneBuyDolBankAccountListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final OneBuyDolDirectAccountResponse f88317a;

    /* renamed from: b */
    public final Context f88318b;

    /* renamed from: c */
    public RadioGroup f88319c;

    /* renamed from: d */
    public OnClickListener f88320d;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$OnClickListener;", "", "onSelectBankItem", "", "position", "", "accountItem", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankAccountListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onSelectBankItem(int i, @Nullable OneDirectAccountListModel oneDirectAccountListModel);
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneBankAccountBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneBankAccountBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$OnClickListener;", "onClickListener", "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolBankAccountListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneBankAccountBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolBankAccountListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneBankAccountBinding f88321a;

        /* renamed from: b */
        public final /* synthetic */ OneBuyDolBankAccountListAdapter f88322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneBuyDolBankAccountListAdapter oneBuyDolBankAccountListAdapter, ItemOneBankAccountBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f88322b = oneBuyDolBankAccountListAdapter;
            this.f88321a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m16080b(ItemOneBankAccountBinding itemOneBankAccountBinding, OnClickListener onClickListener, ViewHolder viewHolder, OneDirectAccountListModel oneDirectAccountListModel, View view) {
            m16077e(itemOneBankAccountBinding, onClickListener, viewHolder, oneDirectAccountListModel, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m16079c(OneBuyDolBankAccountListAdapter oneBuyDolBankAccountListAdapter, OneDirectAccountListModel oneDirectAccountListModel, OnClickListener onClickListener, ViewHolder viewHolder, RadioGroup radioGroup, int i) {
            m16078d(oneBuyDolBankAccountListAdapter, oneDirectAccountListModel, onClickListener, viewHolder, radioGroup, i);
        }

        /* renamed from: d */
        public static final void m16078d(OneBuyDolBankAccountListAdapter this$0, OneDirectAccountListModel oneDirectAccountListModel, OnClickListener onClickListener, ViewHolder this$1, RadioGroup radioGroup, int i) {
            RadioGroup radioGroup2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.f88319c != radioGroup && (radioGroup2 = this$0.f88319c) != null) {
                radioGroup2.clearCheck();
            }
            this$0.f88319c = radioGroup;
            if (oneDirectAccountListModel != null && onClickListener != null) {
                onClickListener.onSelectBankItem(this$1.getAbsoluteAdapterPosition(), oneDirectAccountListModel);
            }
        }

        /* renamed from: e */
        public static final void m16077e(ItemOneBankAccountBinding this_apply, OnClickListener onClickListener, ViewHolder this$0, OneDirectAccountListModel oneDirectAccountListModel, View view) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this_apply.bankAccountItemRadioButton.setChecked(true);
            if (onClickListener != null) {
                onClickListener.onSelectBankItem(this$0.getAbsoluteAdapterPosition(), oneDirectAccountListModel);
            }
        }

        public final void bind(@Nullable final OneDirectAccountListModel oneDirectAccountListModel, @Nullable final OnClickListener onClickListener) {
            String str;
            int i;
            String bankCode;
            final ItemOneBankAccountBinding itemOneBankAccountBinding = this.f88321a;
            final OneBuyDolBankAccountListAdapter oneBuyDolBankAccountListAdapter = this.f88322b;
            String str2 = null;
            if (oneDirectAccountListModel != null && (bankCode = oneDirectAccountListModel.getBankCode()) != null) {
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                str = bankCode.toUpperCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
            } else {
                str = null;
            }
            BankAccountType bankAccountType = BankAccountType.INSTANCE;
            if (Intrinsics.areEqual(str, bankAccountType.getKS())) {
                i = R.drawable.ic_ks;
            } else if (Intrinsics.areEqual(str, bankAccountType.getKTB())) {
                i = R.drawable.ic_ktb;
            } else if (Intrinsics.areEqual(str, bankAccountType.getSCB_L())) {
                i = R.drawable.ic_icon_scb_plus;
            } else {
                i = R.drawable.ic_card_default;
            }
            itemOneBankAccountBinding.bankBandImageView.setImageDrawable(ContextCompat.getDrawable(oneBuyDolBankAccountListAdapter.f88318b, i));
            itemOneBankAccountBinding.nameAccountTextView.setText(oneBuyDolBankAccountListAdapter.m16081a((oneDirectAccountListModel == null || (r4 = oneDirectAccountListModel.getBankCode()) == null) ? "" : ""));
            OneFontTextView oneFontTextView = itemOneBankAccountBinding.accountNumberTextView;
            if (oneDirectAccountListModel != null) {
                String aliasBankName = oneDirectAccountListModel.getAliasBankName();
                if (aliasBankName != null && aliasBankName.length() != 0) {
                    str2 = oneDirectAccountListModel.getAliasBankName();
                } else {
                    str2 = "CARD HOLDER NAME";
                }
            }
            oneFontTextView.setText(str2);
            itemOneBankAccountBinding.bankAccountItemRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: hL0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                    OneBuyDolBankAccountListAdapter.ViewHolder.m16079c(OneBuyDolBankAccountListAdapter.this, oneDirectAccountListModel, onClickListener, this, radioGroup, i2);
                }
            });
            itemOneBankAccountBinding.bankAccountItem.setOnClickListener(new View.OnClickListener() { // from class: iL0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneBuyDolBankAccountListAdapter.ViewHolder.m16080b(ItemOneBankAccountBinding.this, onClickListener, this, oneDirectAccountListModel, view);
                }
            });
        }
    }

    public OneBuyDolBankAccountListAdapter(@Nullable OneBuyDolDirectAccountResponse oneBuyDolDirectAccountResponse, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88317a = oneBuyDolDirectAccountResponse;
        this.f88318b = context;
    }

    /* renamed from: a */
    public final String m16081a(String str) {
        if (Intrinsics.areEqual(str, BankAccountType.INSTANCE.getSCB_L())) {
            String string = this.f88318b.getResources().getString(R.string.scb_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(R.string.scb_title)");
            return string;
        }
        return "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<OneDirectAccountListModel> directAccounts;
        OneBuyDolDirectAccountResponse oneBuyDolDirectAccountResponse = this.f88317a;
        if (oneBuyDolDirectAccountResponse != null && (directAccounts = oneBuyDolDirectAccountResponse.getDirectAccounts()) != null) {
            return directAccounts.size();
        }
        return 0;
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f88320d = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        List<OneDirectAccountListModel> directAccounts;
        Intrinsics.checkNotNullParameter(holder, "holder");
        OneBuyDolDirectAccountResponse oneBuyDolDirectAccountResponse = this.f88317a;
        holder.bind((oneBuyDolDirectAccountResponse == null || (directAccounts = oneBuyDolDirectAccountResponse.getDirectAccounts()) == null) ? null : directAccounts.get(i), this.f88320d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneBankAccountBinding inflate = ItemOneBankAccountBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}