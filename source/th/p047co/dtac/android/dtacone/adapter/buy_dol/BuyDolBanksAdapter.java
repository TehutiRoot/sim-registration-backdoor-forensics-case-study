package th.p047co.dtac.android.dtacone.adapter.buy_dol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.buy_dol.BuyDolBanksAdapter;
import th.p047co.dtac.android.dtacone.util.constant.bank_account.BankAccountType;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%¨\u0006("}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$BankViewHolder;", "", "", "banks", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/List;Landroid/content/Context;Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$OnClickListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$BankViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$BankViewHolder;I)V", "band", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)I", OperatorName.CURVE_TO, "(Ljava/lang/String;)Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getBanks", "()Ljava/util/List;", "setBanks", "(Ljava/util/List;)V", "Landroid/content/Context;", "Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$OnClickListener;", "BankViewHolder", "OnClickListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolBanksAdapter */
/* loaded from: classes7.dex */
public final class BuyDolBanksAdapter extends RecyclerView.Adapter<BankViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f80994a;

    /* renamed from: b */
    public final Context f80995b;

    /* renamed from: c */
    public final OnClickListener f80996c;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0005¨\u0006$"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$BankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Landroidx/appcompat/widget/AppCompatImageView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/appcompat/widget/AppCompatImageView;", "getIvBankBand", "()Landroidx/appcompat/widget/AppCompatImageView;", "setIvBankBand", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "ivBankBand", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "tvName", "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "getIvAddMore", "()Landroid/widget/ImageView;", "setIvAddMore", "(Landroid/widget/ImageView;)V", "ivAddMore", "d", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "rootView", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolBanksAdapter$BankViewHolder */
    /* loaded from: classes7.dex */
    public static final class BankViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public AppCompatImageView f80997a;

        /* renamed from: b */
        public TextView f80998b;

        /* renamed from: c */
        public ImageView f80999c;

        /* renamed from: d */
        public View f81000d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.ivBankBand);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.ivBankBand)");
            this.f80997a = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvName);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvName)");
            this.f80998b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ivAddMore);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.ivAddMore)");
            this.f80999c = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.rootView);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.rootView)");
            this.f81000d = findViewById4;
        }

        @NotNull
        public final ImageView getIvAddMore() {
            return this.f80999c;
        }

        @NotNull
        public final AppCompatImageView getIvBankBand() {
            return this.f80997a;
        }

        @NotNull
        public final View getRootView() {
            return this.f81000d;
        }

        @NotNull
        public final TextView getTvName() {
            return this.f80998b;
        }

        public final void setIvAddMore(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.f80999c = imageView;
        }

        public final void setIvBankBand(@NotNull AppCompatImageView appCompatImageView) {
            Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
            this.f80997a = appCompatImageView;
        }

        public final void setRootView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.f81000d = view;
        }

        public final void setTvName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.f80998b = textView;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/buy_dol/BuyDolBanksAdapter$OnClickListener;", "", "OnBankSelected", "", "bankName", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.buy_dol.BuyDolBanksAdapter$OnClickListener */
    /* loaded from: classes7.dex */
    public interface OnClickListener {
        void OnBankSelected(@NotNull String str);
    }

    public BuyDolBanksAdapter(@NotNull List<String> banks, @NotNull Context context, @NotNull OnClickListener listener) {
        Intrinsics.checkNotNullParameter(banks, "banks");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80994a = banks;
        this.f80995b = context;
        this.f80996c = listener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20444a(BuyDolBanksAdapter buyDolBanksAdapter, int i, View view) {
        m20441d(buyDolBanksAdapter, i, view);
    }

    /* renamed from: d */
    public static final void m20441d(BuyDolBanksAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f80996c.OnBankSelected((String) this$0.f80994a.get(i));
    }

    /* renamed from: b */
    public final int m20443b(String str) {
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        BankAccountType bankAccountType = BankAccountType.INSTANCE;
        if (Intrinsics.areEqual(upperCase, bankAccountType.getSCB_L())) {
            return R.drawable.ic_scb;
        }
        if (Intrinsics.areEqual(upperCase, bankAccountType.getKTB())) {
            return R.drawable.ic_ktb;
        }
        if (Intrinsics.areEqual(upperCase, bankAccountType.getKS())) {
            return R.drawable.ic_ks;
        }
        return R.drawable.ic_card_default;
    }

    /* renamed from: c */
    public final String m20442c(String str) {
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        BankAccountType bankAccountType = BankAccountType.INSTANCE;
        if (Intrinsics.areEqual(upperCase, bankAccountType.getSCB_L())) {
            String string = this.f80995b.getResources().getString(R.string.scb_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.resources.getString(R.string.scb_title)");
            return string;
        } else if (Intrinsics.areEqual(upperCase, bankAccountType.getKTB())) {
            String string2 = this.f80995b.getResources().getString(R.string.ktb_title);
            Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getString(R.string.ktb_title)");
            return string2;
        } else if (Intrinsics.areEqual(upperCase, bankAccountType.getKS())) {
            String string3 = this.f80995b.getResources().getString(R.string.ks_title);
            Intrinsics.checkNotNullExpressionValue(string3, "context.resources.getString(R.string.ks_title)");
            return string3;
        } else {
            String string4 = this.f80995b.getResources().getString(R.string.bank_title);
            Intrinsics.checkNotNullExpressionValue(string4, "context.resources.getString(R.string.bank_title)");
            return string4;
        }
    }

    @NotNull
    public final List<String> getBanks() {
        return this.f80994a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f80994a.size();
    }

    public final void setBanks(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f80994a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BankViewHolder holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getTvName().setText(m20442c((String) this.f80994a.get(i)));
        holder.getIvBankBand().setImageDrawable(ContextCompat.getDrawable(this.f80995b, m20443b((String) this.f80994a.get(i))));
        holder.getRootView().setOnClickListener(new View.OnClickListener() { // from class: qd
            {
                BuyDolBanksAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuyDolBanksAdapter.m20444a(BuyDolBanksAdapter.this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BankViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.z_bank_list_item_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new BankViewHolder(view);
    }
}
