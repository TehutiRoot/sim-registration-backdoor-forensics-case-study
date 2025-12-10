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
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.adapter.listener.item.OnClickItemListener;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.OnePre2postPackageMessageItemBinding;
import th.p047co.dtac.android.dtacone.databinding.OnePre2postPackageNameItemBinding;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePackageGroups;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameLanAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003234B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010+R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.¨\u00065"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameLanAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "", OperatorName.CURVE_TO, "()Z", "", "position", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)Z", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePackageGroups;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerOnClickItem", "(Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "registerOnClickItemRetailer", "", "packages", "", "warningMessage", "updatePackage", "(Ljava/util/List;Ljava/lang/String;)V", "(Ljava/util/List;)V", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "getItemViewType", "(I)I", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameLanAdapter$OnePre2PostPackageNameViewHolder;", "d", "(ILth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameLanAdapter$OnePre2PostPackageNameViewHolder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "packagesRetailer", "Ljava/lang/String;", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "onClickItem", "e", "onClickItemRetailer", "Companion", "OnePre2PostPackageNameViewHolder", "OnePre2PostPackageNotifyMessageViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameLanAdapter */
/* loaded from: classes10.dex */
public final class OnePre2PostPackageNameLanAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int MESSAGE_VIEW = 2;
    public static final int PACKAGE_VIEW = 1;

    /* renamed from: a */
    public List f94785a;

    /* renamed from: b */
    public List f94786b;

    /* renamed from: c */
    public String f94787c;

    /* renamed from: d */
    public OnClickItemListener f94788d;

    /* renamed from: e */
    public OnClickItemListener f94789e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameLanAdapter$Companion;", "", "()V", "MESSAGE_VIEW", "", "PACKAGE_VIEW", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameLanAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameLanAdapter$OnePre2PostPackageNameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageNameItemBinding;", "(Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageNameItemBinding;)V", "cardView", "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "setCardView", "(Landroid/view/View;)V", "tvPackageName", "Landroid/widget/TextView;", "getTvPackageName", "()Landroid/widget/TextView;", "setTvPackageName", "(Landroid/widget/TextView;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameLanAdapter$OnePre2PostPackageNameViewHolder */
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
    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageNameLanAdapter$OnePre2PostPackageNotifyMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageMessageItemBinding;", "(Lth/co/dtac/android/dtacone/databinding/OnePre2postPackageMessageItemBinding;)V", "tvPackageMessage", "Landroid/widget/TextView;", "getTvPackageMessage", "()Landroid/widget/TextView;", "setTvPackageMessage", "(Landroid/widget/TextView;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageNameLanAdapter$OnePre2PostPackageNotifyMessageViewHolder */
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
    public static /* synthetic */ void m11462a(OnePre2PostPackageNameLanAdapter onePre2PostPackageNameLanAdapter, OnePackageGroups onePackageGroups, View view) {
        m11458e(onePre2PostPackageNameLanAdapter, onePackageGroups, view);
    }

    /* renamed from: b */
    private final boolean m11461b(int i) {
        List list = this.f94785a;
        if (list != null && ((OnePackageGroups) list.get(i)).getPackageGroupDescription() == null && ((OnePackageGroups) list.get(i)).getPackageGroupCode() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m11460c() {
        List list = this.f94785a;
        if (list != null && list.isEmpty() && this.f94787c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final void m11458e(OnePre2PostPackageNameLanAdapter this$0, OnePackageGroups onePackageGroups, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnClickItemListener onClickItemListener = this$0.f94788d;
        if (onClickItemListener != null && onePackageGroups != null && onClickItemListener != null) {
            onClickItemListener.setOnClickItem(onePackageGroups);
        }
    }

    /* renamed from: d */
    public final void m11459d(int i, OnePre2PostPackageNameViewHolder onePre2PostPackageNameViewHolder) {
        final OnePackageGroups onePackageGroups;
        Integer num;
        List list = this.f94785a;
        String str = null;
        if (list != null) {
            onePackageGroups = (OnePackageGroups) list.get(i);
        } else {
            onePackageGroups = null;
        }
        TextView tvPackageName = onePre2PostPackageNameViewHolder.getTvPackageName();
        if (onePackageGroups != null) {
            num = onePackageGroups.getPackageGroupCode();
        } else {
            num = null;
        }
        if (onePackageGroups != null) {
            str = onePackageGroups.getPackageGroupDescription();
        }
        tvPackageName.setText("[" + num + "] " + str);
        onePre2PostPackageNameViewHolder.getCardView().setOnClickListener(new View.OnClickListener() { // from class: T61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnePre2PostPackageNameLanAdapter.m11462a(OnePre2PostPackageNameLanAdapter.this, onePackageGroups, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m11460c()) {
            return 1;
        }
        List list = this.f94785a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m11460c() || m11461b(i)) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof OnePre2PostPackageNameViewHolder) {
            m11459d(i, (OnePre2PostPackageNameViewHolder) holder);
        } else if (holder instanceof OnePre2PostPackageNotifyMessageViewHolder) {
            ((OnePre2PostPackageNotifyMessageViewHolder) holder).getTvPackageMessage().setText(this.f94787c);
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

    public final void registerOnClickItem(@NotNull OnClickItemListener<? super OnePackageGroups> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f94788d = listener;
    }

    public final void registerOnClickItemRetailer(@NotNull OnClickItemListener<? super OnePostpaidSearchPackage> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f94789e = listener;
    }

    public final void updatePackage(@NotNull List<OnePackageGroups> packages, @Nullable String str) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f94785a = packages;
        this.f94787c = str;
    }

    public final void updatePackage(@NotNull List<OnePostpaidSearchPackage> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f94786b = packages;
        this.f94787c = this.f94787c;
    }
}