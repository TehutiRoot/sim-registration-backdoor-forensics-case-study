package th.p047co.dtac.android.dtacone.adapter.online_register;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.online_register.OnlineRegistBankAdapter;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.AdditionalPicture;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.bank.BankExtKt;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/OnlineRegistBankAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/AdditionalPicture;", "bankList", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "", ResponseProcessor.CONTENT_TYPE_IMAGE, "Landroid/widget/ImageView;", "ivImageBanner", "", OperatorName.CURVE_TO, "(ILandroid/widget/ImageView;)V", "Landroid/view/ViewGroup;", "p0", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/online_register/OnlineRegistBankAdapter$OnClickBank;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/online_register/OnlineRegistBankAdapter$OnClickBank;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "Landroid/widget/ImageView;", "selectedBank", "d", "Lth/co/dtac/android/dtacone/adapter/online_register/OnlineRegistBankAdapter$OnClickBank;", "BankViewHolder", "OnClickBank", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.online_register.OnlineRegistBankAdapter */
/* loaded from: classes7.dex */
public final class OnlineRegistBankAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f81345a;

    /* renamed from: b */
    public final List f81346b;

    /* renamed from: c */
    public ImageView f81347c;

    /* renamed from: d */
    public OnClickBank f81348d;

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/OnlineRegistBankAdapter$BankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/online_register/OnlineRegistBankAdapter;Landroid/view/View;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutBank", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "layoutBank", "Landroid/widget/ImageView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/ImageView;", "getIvBank", "()Landroid/widget/ImageView;", "ivBank", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.OnlineRegistBankAdapter$BankViewHolder */
    /* loaded from: classes7.dex */
    public final class BankViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ConstraintLayout f81349a;

        /* renamed from: b */
        public final ImageView f81350b;

        /* renamed from: c */
        public final /* synthetic */ OnlineRegistBankAdapter f81351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankViewHolder(@NotNull OnlineRegistBankAdapter onlineRegistBankAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81351c = onlineRegistBankAdapter;
            View findViewById = view.findViewById(R.id.layoutBank);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            this.f81349a = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.ivBank);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81350b = (ImageView) findViewById2;
        }

        @NotNull
        public final ImageView getIvBank() {
            return this.f81350b;
        }

        @NotNull
        public final ConstraintLayout getLayoutBank() {
            return this.f81349a;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/online_register/OnlineRegistBankAdapter$OnClickBank;", "", "onClickBank", "", "bank", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/AdditionalPicture;", "position", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.online_register.OnlineRegistBankAdapter$OnClickBank */
    /* loaded from: classes7.dex */
    public interface OnClickBank {
        void onClickBank(@NotNull AdditionalPicture additionalPicture, int i);
    }

    @Inject
    public OnlineRegistBankAdapter(@NotNull Activity activity, @NotNull List<AdditionalPicture> bankList) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bankList, "bankList");
        this.f81345a = activity;
        this.f81346b = bankList;
    }

    /* renamed from: c */
    private final void m20296c(int i, ImageView imageView) {
        Glide.with(this.f81345a).clear(imageView);
        Glide.with(this.f81345a).m74043load(Integer.valueOf(i)).skipMemoryCache(true).error(ContextCompat.getDrawable(this.f81345a, R.drawable.image_default)).diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
    }

    /* renamed from: d */
    public static final void m20295d(OnlineRegistBankAdapter this$0, RecyclerView.ViewHolder holder, AdditionalPicture item, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(item, "$item");
        ImageView imageView = this$0.f81347c;
        if (imageView != null) {
            imageView.setBackground(null);
        }
        ImageView ivBank = ((BankViewHolder) holder).getIvBank();
        this$0.f81347c = ivBank;
        if (ivBank != null) {
            ivBank.setBackground(ContextCompat.getDrawable(this$0.f81345a, R.drawable.one_bg_selected_bank_commission));
        }
        OnClickBank onClickBank = this$0.f81348d;
        if (onClickBank != null) {
            onClickBank.onClickBank(item, i);
        }
    }

    /* renamed from: e */
    public static final void m20294e(OnlineRegistBankAdapter this$0, RecyclerView.ViewHolder holder, AdditionalPicture item, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(item, "$item");
        ImageView imageView = this$0.f81347c;
        if (imageView != null) {
            imageView.setBackground(null);
        }
        ImageView ivBank = ((BankViewHolder) holder).getIvBank();
        this$0.f81347c = ivBank;
        if (ivBank != null) {
            ivBank.setBackground(ContextCompat.getDrawable(this$0.f81345a, R.drawable.one_bg_selected_bank_commission));
        }
        OnClickBank onClickBank = this$0.f81348d;
        if (onClickBank != null) {
            onClickBank.onClickBank(item, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81346b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.ViewHolder holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final AdditionalPicture additionalPicture = (AdditionalPicture) this.f81346b.get(i);
        if (holder instanceof BankViewHolder) {
            BankViewHolder bankViewHolder = (BankViewHolder) holder;
            m20296c(BankExtKt.getBankImage(additionalPicture.getKey()), bankViewHolder.getIvBank());
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: Tf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnlineRegistBankAdapter.m20295d(OnlineRegistBankAdapter.this, holder, additionalPicture, i, view);
                }
            });
            bankViewHolder.getIvBank().setOnClickListener(new View.OnClickListener() { // from class: Uf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnlineRegistBankAdapter.m20294e(OnlineRegistBankAdapter.this, holder, additionalPicture, i, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        View view = LayoutInflater.from(this.f81345a).inflate(R.layout.item_bank_image, p0, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new BankViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickBank listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81348d = listener;
    }
}
