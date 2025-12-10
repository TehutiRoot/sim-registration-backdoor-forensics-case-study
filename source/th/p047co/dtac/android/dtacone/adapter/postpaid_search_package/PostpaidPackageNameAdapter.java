package th.p047co.dtac.android.dtacone.adapter.postpaid_search_package;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
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
import th.p047co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNameAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageMessageItemBinding;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageNameItemBinding;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackageName;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_search_package/PostpaidPackageNameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Z", "", "position", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Z", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackageName;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerOnClickItem", "(Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "packages", "updatePackage", "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "onClickItem", "Companion", "PostpaidPackageNameViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNameAdapter */
/* loaded from: classes7.dex */
public final class PostpaidPackageNameAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int MESSAGE_VIEW = 2;
    public static final int PACKAGE_VIEW = 1;

    /* renamed from: a */
    public PostpaidSearchPackage f81401a;

    /* renamed from: b */
    public OnClickItemListener f81402b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_search_package/PostpaidPackageNameAdapter$Companion;", "", "()V", "MESSAGE_VIEW", "", "PACKAGE_VIEW", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNameAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_search_package/PostpaidPackageNameAdapter$PostpaidPackageNameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;", "binding", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackageName;", "onClickItem", "<init>", "(Lth/co/dtac/android/dtacone/adapter/postpaid_search_package/PostpaidPackageNameAdapter;Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackageName;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ZPostpaidPackageNameItemBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "getOnClickItem", "()Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNameAdapter$PostpaidPackageNameViewHolder */
    /* loaded from: classes7.dex */
    public final class PostpaidPackageNameViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ZPostpaidPackageNameItemBinding f81403a;

        /* renamed from: b */
        public final OnClickItemListener f81404b;

        /* renamed from: c */
        public final /* synthetic */ PostpaidPackageNameAdapter f81405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostpaidPackageNameViewHolder(@NotNull PostpaidPackageNameAdapter postpaidPackageNameAdapter, @Nullable ZPostpaidPackageNameItemBinding binding, OnClickItemListener<? super PostpaidSearchPackageName> onClickItemListener) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81405c = postpaidPackageNameAdapter;
            this.f81403a = binding;
            this.f81404b = onClickItemListener;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20277b(PostpaidPackageNameViewHolder postpaidPackageNameViewHolder, PostpaidSearchPackageName postpaidSearchPackageName, View view) {
            m20276c(postpaidPackageNameViewHolder, postpaidSearchPackageName, view);
        }

        /* renamed from: c */
        public static final void m20276c(PostpaidPackageNameViewHolder this$0, PostpaidSearchPackageName item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            OnClickItemListener onClickItemListener = this$0.f81404b;
            if (onClickItemListener != null) {
                onClickItemListener.setOnClickItem(item);
            }
        }

        public final void bind(@NotNull final PostpaidSearchPackageName item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ZPostpaidPackageNameItemBinding zPostpaidPackageNameItemBinding = this.f81403a;
            zPostpaidPackageNameItemBinding.tvPackageName.setText(item.getName());
            zPostpaidPackageNameItemBinding.cardView.setOnClickListener(new View.OnClickListener() { // from class: ql1
                {
                    PostpaidPackageNameAdapter.PostpaidPackageNameViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostpaidPackageNameAdapter.PostpaidPackageNameViewHolder.m20277b(PostpaidPackageNameAdapter.PostpaidPackageNameViewHolder.this, item, view);
                }
            });
        }

        @NotNull
        public final ZPostpaidPackageNameItemBinding getBinding() {
            return this.f81403a;
        }

        @Nullable
        public final OnClickItemListener<PostpaidSearchPackageName> getOnClickItem() {
            return this.f81404b;
        }
    }

    /* renamed from: a */
    private final boolean m20279a(int i) {
        List<PostpaidSearchPackageName> list;
        PostpaidSearchPackage postpaidSearchPackage = this.f81401a;
        if (postpaidSearchPackage != null) {
            list = postpaidSearchPackage.getPackages();
        } else {
            list = null;
        }
        if (list != null && list.get(i).getName() == null && list.get(i).getCode() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m20278b() {
        List<PostpaidSearchPackageName> packages;
        String str;
        PostpaidSearchPackage postpaidSearchPackage = this.f81401a;
        if (postpaidSearchPackage != null && (packages = postpaidSearchPackage.getPackages()) != null && packages.isEmpty()) {
            PostpaidSearchPackage postpaidSearchPackage2 = this.f81401a;
            if (postpaidSearchPackage2 != null) {
                str = postpaidSearchPackage2.getMessage();
            } else {
                str = null;
            }
            if (str != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<PostpaidSearchPackageName> packages;
        if (m20278b()) {
            return 1;
        }
        PostpaidSearchPackage postpaidSearchPackage = this.f81401a;
        if (postpaidSearchPackage != null && (packages = postpaidSearchPackage.getPackages()) != null) {
            return packages.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m20278b() || m20279a(i)) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        List<PostpaidSearchPackageName> packages;
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = null;
        r1 = null;
        PostpaidSearchPackageName postpaidSearchPackageName = null;
        if (holder instanceof PostpaidPackageNameViewHolder) {
            PostpaidPackageNameViewHolder postpaidPackageNameViewHolder = (PostpaidPackageNameViewHolder) holder;
            PostpaidSearchPackage postpaidSearchPackage = this.f81401a;
            if (postpaidSearchPackage != null && (packages = postpaidSearchPackage.getPackages()) != null) {
                postpaidSearchPackageName = packages.get(i);
            }
            Intrinsics.checkNotNull(postpaidSearchPackageName, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackageName");
            postpaidPackageNameViewHolder.bind(postpaidSearchPackageName);
        } else if (holder instanceof PostpaidPackageNotifyMessageViewHolder) {
            PostpaidPackageNotifyMessageViewHolder postpaidPackageNotifyMessageViewHolder = (PostpaidPackageNotifyMessageViewHolder) holder;
            PostpaidSearchPackage postpaidSearchPackage2 = this.f81401a;
            if (postpaidSearchPackage2 != null) {
                str = postpaidSearchPackage2.getMessage();
            }
            postpaidPackageNotifyMessageViewHolder.bind(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == 1) {
            ZPostpaidPackageNameItemBinding inflate = ZPostpaidPackageNameItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            return new PostpaidPackageNameViewHolder(this, inflate, this.f81402b);
        }
        ZPostpaidPackageMessageItemBinding inflate2 = ZPostpaidPackageMessageItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               …lse\n                    )");
        return new PostpaidPackageNotifyMessageViewHolder(inflate2);
    }

    public final void registerOnClickItem(@NotNull OnClickItemListener<? super PostpaidSearchPackageName> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81402b = listener;
    }

    public final void updatePackage(@NotNull PostpaidSearchPackage packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f81401a = packages;
    }
}
