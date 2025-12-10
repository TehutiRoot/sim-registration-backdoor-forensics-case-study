package th.p047co.dtac.android.dtacone.view.appOne.buyDol.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import th.p047co.dtac.android.dtacone.databinding.ItemOneAddBankAccountBinding;
import th.p047co.dtac.android.dtacone.util.constant.bank_account.BankAccountType;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002$%B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$ViewHolder;", "", "", "item", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/util/List;Landroid/content/Context;)V", "band", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$ViewHolder;I)V", "getItemCount", "()I", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$OnClickListener;", "onClickListener", "setOnClickListener", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)I", "Ljava/util/List;", "Landroid/content/Context;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$OnClickListener;", "OnClickListener", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolAddBankAccountListAdapter */
/* loaded from: classes10.dex */
public final class OneBuyDolAddBankAccountListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f88312a;

    /* renamed from: b */
    public final Context f88313b;

    /* renamed from: c */
    public OnClickListener f88314c;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$OnClickListener;", "", "onSelectBankItem", "", "position", "", "bankName", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolAddBankAccountListAdapter$OnClickListener */
    /* loaded from: classes10.dex */
    public interface OnClickListener {
        void onSelectBankItem(int i, @NotNull String str);
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneAddBankAccountBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemOneAddBankAccountBinding;)V", "", "item", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$OnClickListener;", "onClickListener", "", "bind", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/buyDol/adapter/OneBuyDolAddBankAccountListAdapter$OnClickListener;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneAddBankAccountBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.adapter.OneBuyDolAddBankAccountListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemOneAddBankAccountBinding f88315a;

        /* renamed from: b */
        public final /* synthetic */ OneBuyDolAddBankAccountListAdapter f88316b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneBuyDolAddBankAccountListAdapter oneBuyDolAddBankAccountListAdapter, ItemOneAddBankAccountBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f88316b = oneBuyDolAddBankAccountListAdapter;
            this.f88315a = binding;
        }

        public final void bind(@NotNull String item, @Nullable OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(item, "item");
            ItemOneAddBankAccountBinding itemOneAddBankAccountBinding = this.f88315a;
            OneBuyDolAddBankAccountListAdapter oneBuyDolAddBankAccountListAdapter = this.f88316b;
            itemOneAddBankAccountBinding.addBankAccountNameAccountTextView.setText(oneBuyDolAddBankAccountListAdapter.m16082b(item));
            itemOneAddBankAccountBinding.addBankAccountBankBandImageView.setImageDrawable(ContextCompat.getDrawable(oneBuyDolAddBankAccountListAdapter.f88313b, oneBuyDolAddBankAccountListAdapter.m16083a(item)));
            ConstraintLayout addBankAccountLayout = itemOneAddBankAccountBinding.addBankAccountLayout;
            Intrinsics.checkNotNullExpressionValue(addBankAccountLayout, "addBankAccountLayout");
            OnSingleClickListenerKt.setOnSingleClickListener(addBankAccountLayout, new OneBuyDolAddBankAccountListAdapter$ViewHolder$bind$1$1(onClickListener, this, item));
        }
    }

    public OneBuyDolAddBankAccountListAdapter(@NotNull List<String> item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88312a = item;
        this.f88313b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final String m16082b(String str) {
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = str.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        BankAccountType bankAccountType = BankAccountType.INSTANCE;
        if (Intrinsics.areEqual(upperCase, bankAccountType.getKS())) {
            String string = this.f88313b.getResources().getString(R.string.ks_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(R.string.ks_title)");
            return string;
        } else if (Intrinsics.areEqual(upperCase, bankAccountType.getKTB())) {
            String string2 = this.f88313b.getResources().getString(R.string.ktb_title);
            Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getString(R.string.ktb_title)");
            return string2;
        } else if (Intrinsics.areEqual(upperCase, bankAccountType.getSCB_L())) {
            String string3 = this.f88313b.getResources().getString(R.string.scb_title);
            Intrinsics.checkNotNullExpressionValue(string3, "context.resources.getString(R.string.scb_title)");
            return string3;
        } else {
            String string4 = this.f88313b.getResources().getString(R.string.bank_title);
            Intrinsics.checkNotNullExpressionValue(string4, "context.resources.getString(R.string.bank_title)");
            return string4;
        }
    }

    /* renamed from: a */
    public final int m16083a(String str) {
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String upperCase = str.toUpperCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        BankAccountType bankAccountType = BankAccountType.INSTANCE;
        if (Intrinsics.areEqual(upperCase, bankAccountType.getKS())) {
            return R.drawable.ic_ks;
        }
        if (Intrinsics.areEqual(upperCase, bankAccountType.getKTB())) {
            return R.drawable.ic_ktb;
        }
        if (Intrinsics.areEqual(upperCase, bankAccountType.getSCB_L())) {
            return R.drawable.ic_icon_scb_plus;
        }
        return R.drawable.ic_card_default;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f88312a.size();
    }

    public final void setOnClickListener(@NotNull OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f88314c = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((String) this.f88312a.get(i), this.f88314c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOneAddBankAccountBinding inflate = ItemOneAddBankAccountBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}