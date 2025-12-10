package th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.adapter.listener.item.OnClickItemListener;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OnePre2postPackageMessageItemBinding;
import th.p047co.dtac.android.dtacone.databinding.OnePre2postPackageNameItemBinding;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackageName;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010'¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "", OperatorName.CURVE_TO, "()Z", "", "position", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)Z", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackageName;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerOnClickItem", "(Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "packages", "updatePackage", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;)V", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "getItemViewType", "(I)I", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameAdapter$OnePre2PostPackageNameViewHolder;", "d", "(ILth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameAdapter$OnePre2PostPackageNameViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "onClickItem", "Companion", "OnePre2PostPackageNameViewHolder", "OnePre2PostPackageNotifyMessageViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameAdapter */
/* loaded from: classes10.dex */
public final class OnePre2PostPackageNameAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int MESSAGE_VIEW = 2;
    public static final int PACKAGE_VIEW = 1;

    /* renamed from: a */
    public OnePostpaidSearchPackage f94783a;

    /* renamed from: b */
    public OnClickItemListener f94784b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameAdapter$Companion;", "", "()V", "MESSAGE_VIEW", "", "PACKAGE_VIEW", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameAdapter$OnePre2PostPackageNameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageNameItemBinding;", "(Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageNameItemBinding;)V", "cardView", "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "setCardView", "(Landroid/view/View;)V", "tvPackageName", "Landroid/widget/TextView;", "getTvPackageName", "()Landroid/widget/TextView;", "setTvPackageName", "(Landroid/widget/TextView;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameAdapter$OnePre2PostPackageNameViewHolder */
    /* loaded from: classes10.dex */
    public static final class OnePre2PostPackageNameViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        public View cardView;
        public TextView tvPackageName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnePre2PostPackageNameViewHolder(@NotNull OnePre2postPackageNameItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout constraintLayout = binding.cardView;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.cardView");
            setCardView(constraintLayout);
            OneFontTextView oneFontTextView = binding.tvPackageName;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvPackageName");
            setTvPackageName(oneFontTextView);
        }

        @NotNull
        public final View getCardView() {
            View view = this.cardView;
            if (view != null) {
                return view;
            }
            Intrinsics.throwUninitializedPropertyAccessException("cardView");
            return null;
        }

        @NotNull
        public final TextView getTvPackageName() {
            TextView textView = this.tvPackageName;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("tvPackageName");
            return null;
        }

        public final void setCardView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.cardView = view;
        }

        public final void setTvPackageName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvPackageName = textView;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameAdapter$OnePre2PostPackageNotifyMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageMessageItemBinding;", "(Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageMessageItemBinding;)V", "tvPackageMessage", "Landroid/widget/TextView;", "getTvPackageMessage", "()Landroid/widget/TextView;", "setTvPackageMessage", "(Landroid/widget/TextView;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameAdapter$OnePre2PostPackageNotifyMessageViewHolder */
    /* loaded from: classes10.dex */
    public static final class OnePre2PostPackageNotifyMessageViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        public TextView tvPackageMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnePre2PostPackageNotifyMessageViewHolder(@NotNull OnePre2postPackageMessageItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            OneFontTextView oneFontTextView = binding.tvPackageMessage;
            Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.tvPackageMessage");
            setTvPackageMessage(oneFontTextView);
        }

        @NotNull
        public final TextView getTvPackageMessage() {
            TextView textView = this.tvPackageMessage;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("tvPackageMessage");
            return null;
        }

        public final void setTvPackageMessage(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvPackageMessage = textView;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m11467a(OnePre2PostPackageNameAdapter onePre2PostPackageNameAdapter, OnePostpaidSearchPackageName onePostpaidSearchPackageName, View view) {
        m11463e(onePre2PostPackageNameAdapter, onePostpaidSearchPackageName, view);
    }

    /* renamed from: b */
    private final boolean m11466b(int i) {
        List<OnePostpaidSearchPackageName> list;
        OnePostpaidSearchPackage onePostpaidSearchPackage = this.f94783a;
        if (onePostpaidSearchPackage != null) {
            list = onePostpaidSearchPackage.getPackages();
        } else {
            list = null;
        }
        if (list != null && list.get(i).getName() == null && list.get(i).getCode() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m11465c() {
        List<OnePostpaidSearchPackageName> packages;
        String str;
        OnePostpaidSearchPackage onePostpaidSearchPackage = this.f94783a;
        if (onePostpaidSearchPackage != null && (packages = onePostpaidSearchPackage.getPackages()) != null && packages.isEmpty()) {
            OnePostpaidSearchPackage onePostpaidSearchPackage2 = this.f94783a;
            if (onePostpaidSearchPackage2 != null) {
                str = onePostpaidSearchPackage2.getMessage();
            } else {
                str = null;
            }
            if (str != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final void m11463e(OnePre2PostPackageNameAdapter this$0, OnePostpaidSearchPackageName onePostpaidSearchPackageName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnClickItemListener onClickItemListener = this$0.f94784b;
        if (onClickItemListener != null && onePostpaidSearchPackageName != null && onClickItemListener != null) {
            onClickItemListener.setOnClickItem(onePostpaidSearchPackageName);
        }
    }

    /* renamed from: d */
    public final void m11464d(int i, OnePre2PostPackageNameViewHolder onePre2PostPackageNameViewHolder) {
        final OnePostpaidSearchPackageName onePostpaidSearchPackageName;
        List<OnePostpaidSearchPackageName> packages;
        OnePostpaidSearchPackage onePostpaidSearchPackage = this.f94783a;
        String str = null;
        if (onePostpaidSearchPackage != null && (packages = onePostpaidSearchPackage.getPackages()) != null) {
            onePostpaidSearchPackageName = packages.get(i);
        } else {
            onePostpaidSearchPackageName = null;
        }
        TextView tvPackageName = onePre2PostPackageNameViewHolder.getTvPackageName();
        if (onePostpaidSearchPackageName != null) {
            str = onePostpaidSearchPackageName.getName();
        }
        tvPackageName.setText(str);
        onePre2PostPackageNameViewHolder.getCardView().setOnClickListener(new View.OnClickListener() { // from class: S61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnePre2PostPackageNameAdapter.m11467a(OnePre2PostPackageNameAdapter.this, onePostpaidSearchPackageName, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<OnePostpaidSearchPackageName> packages;
        if (m11465c()) {
            return 1;
        }
        OnePostpaidSearchPackage onePostpaidSearchPackage = this.f94783a;
        if (onePostpaidSearchPackage != null && (packages = onePostpaidSearchPackage.getPackages()) != null) {
            return packages.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m11465c() || m11466b(i)) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof OnePre2PostPackageNameViewHolder) {
            m11464d(i, (OnePre2PostPackageNameViewHolder) holder);
        } else if (holder instanceof OnePre2PostPackageNotifyMessageViewHolder) {
            TextView tvPackageMessage = ((OnePre2PostPackageNotifyMessageViewHolder) holder).getTvPackageMessage();
            OnePostpaidSearchPackage onePostpaidSearchPackage = this.f94783a;
            if (onePostpaidSearchPackage != null) {
                str = onePostpaidSearchPackage.getMessage();
            } else {
                str = null;
            }
            tvPackageMessage.setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == 1) {
            OnePre2postPackageNameItemBinding inflate = OnePre2postPackageNameItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new OnePre2PostPackageNameViewHolder(inflate);
        }
        OnePre2postPackageMessageItemBinding inflate2 = OnePre2postPackageMessageItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
        return new OnePre2PostPackageNotifyMessageViewHolder(inflate2);
    }

    public final void registerOnClickItem(@NotNull OnClickItemListener<? super OnePostpaidSearchPackageName> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f94784b = listener;
    }

    public final void updatePackage(@NotNull OnePostpaidSearchPackage packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f94783a = packages;
    }
}