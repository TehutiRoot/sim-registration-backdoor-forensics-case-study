package th.p047co.dtac.android.dtacone.adapter.mrtr_postpaid_search_packages;

import android.view.LayoutInflater;
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
import th.p047co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNameViewHolder;
import th.p047co.dtac.android.dtacone.adapter.postpaid_search_package.PostpaidPackageNotifyMessageViewHolder;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageMessageItemBinding;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageNameItemBinding;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroups;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackage;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u000f\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010%R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010&R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid_search_packages/MrtrPostpaidPackageNameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroups;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerOnClickItem", "(Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "", "packages", "", "warningMessage", "updatePackage", "(Ljava/util/List;Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Z", "Ljava/util/List;", "packagesRetailer", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "onClickItem", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_postpaid_search_packages.MrtrPostpaidPackageNameAdapter */
/* loaded from: classes7.dex */
public final class MrtrPostpaidPackageNameAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int MESSAGE_VIEW = 2;
    public static final int PACKAGE_VIEW = 1;

    /* renamed from: a */
    public List f81264a;

    /* renamed from: b */
    public List f81265b;

    /* renamed from: c */
    public String f81266c;

    /* renamed from: d */
    public OnClickItemListener f81267d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid_search_packages/MrtrPostpaidPackageNameAdapter$Companion;", "", "()V", "MESSAGE_VIEW", "", "PACKAGE_VIEW", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_postpaid_search_packages.MrtrPostpaidPackageNameAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: a */
    public final boolean m20342a(int i) {
        List list = this.f81264a;
        if (list != null && ((PackageGroups) list.get(i)).getPackageGroupDescription() == null && ((PackageGroups) list.get(i)).getPackageGroupCode() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m20341b() {
        List list = this.f81264a;
        if (list != null && list.isEmpty() && this.f81266c != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m20341b()) {
            return 1;
        }
        List list = this.f81264a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m20341b() || m20342a(i)) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        PackageGroups packageGroups;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof PostpaidPackageNameViewHolder) {
            PostpaidPackageNameViewHolder postpaidPackageNameViewHolder = (PostpaidPackageNameViewHolder) holder;
            List list = this.f81264a;
            if (list != null) {
                packageGroups = (PackageGroups) list.get(i);
            } else {
                packageGroups = null;
            }
            Intrinsics.checkNotNull(packageGroups, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroups");
            postpaidPackageNameViewHolder.bind(packageGroups);
        } else if (holder instanceof PostpaidPackageNotifyMessageViewHolder) {
            ((PostpaidPackageNotifyMessageViewHolder) holder).bind(this.f81266c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == 1) {
            ZPostpaidPackageNameItemBinding inflate = ZPostpaidPackageNameItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            return new PostpaidPackageNameViewHolder(inflate, this.f81267d);
        }
        ZPostpaidPackageMessageItemBinding inflate2 = ZPostpaidPackageMessageItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               …  false\n                )");
        return new PostpaidPackageNotifyMessageViewHolder(inflate2);
    }

    public final void registerOnClickItem(@NotNull OnClickItemListener<? super PackageGroups> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81267d = listener;
    }

    public final void updatePackage(@NotNull List<PackageGroups> packages, @Nullable String str) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f81264a = packages;
        this.f81266c = str;
    }

    public final void updatePackage(@NotNull List<PostpaidSearchPackage> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f81265b = packages;
    }
}
