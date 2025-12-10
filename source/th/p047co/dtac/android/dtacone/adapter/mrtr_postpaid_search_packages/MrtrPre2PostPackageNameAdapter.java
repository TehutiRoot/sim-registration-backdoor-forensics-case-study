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
@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012¢\u0006\u0004\b\u0016\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid_search_packages/MrtrPre2PostPackageNameAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Z", "", "position", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Z", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroups;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerOnClickItem", "(Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;)V", "", "packages", "", "warningMessage", "updatePackage", "(Ljava/util/List;Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "(Ljava/util/List;)V", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "getItemViewType", "(I)I", "Ljava/util/List;", "packagesRetailer", OperatorName.CURVE_TO, "Ljava/lang/String;", "d", "Lth/co/dtac/android/dtacone/adapter/listener/item/OnClickItemListener;", "onClickItem", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_postpaid_search_packages.MrtrPre2PostPackageNameAdapter */
/* loaded from: classes7.dex */
public final class MrtrPre2PostPackageNameAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int MESSAGE_VIEW = 2;
    public static final int PACKAGE_VIEW = 1;

    /* renamed from: a */
    public List f81269a;

    /* renamed from: b */
    public List f81270b;

    /* renamed from: c */
    public String f81271c;

    /* renamed from: d */
    public OnClickItemListener f81272d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid_search_packages/MrtrPre2PostPackageNameAdapter$Companion;", "", "()V", "MESSAGE_VIEW", "", "PACKAGE_VIEW", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_postpaid_search_packages.MrtrPre2PostPackageNameAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: a */
    private final boolean m20339a(int i) {
        List list = this.f81269a;
        if (list != null && ((PackageGroups) list.get(i)).getPackageGroupDescription() == null && ((PackageGroups) list.get(i)).getPackageGroupCode() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m20338b() {
        List list = this.f81269a;
        if (list != null && list.isEmpty() && this.f81271c != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (m20338b()) {
            return 1;
        }
        List list = this.f81269a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m20338b() || m20339a(i)) {
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
            List list = this.f81269a;
            if (list != null) {
                packageGroups = (PackageGroups) list.get(i);
            } else {
                packageGroups = null;
            }
            Intrinsics.checkNotNull(packageGroups, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroups");
            postpaidPackageNameViewHolder.bind(packageGroups);
        } else if (holder instanceof PostpaidPackageNotifyMessageViewHolder) {
            ((PostpaidPackageNotifyMessageViewHolder) holder).bind(this.f81271c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == 1) {
            ZPostpaidPackageNameItemBinding inflate = ZPostpaidPackageNameItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …  false\n                )");
            return new PostpaidPackageNameViewHolder(inflate, this.f81272d);
        }
        ZPostpaidPackageMessageItemBinding inflate2 = ZPostpaidPackageMessageItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               …  false\n                )");
        return new PostpaidPackageNotifyMessageViewHolder(inflate2);
    }

    public final void registerOnClickItem(@NotNull OnClickItemListener<? super PackageGroups> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81272d = listener;
    }

    public final void updatePackage(@NotNull List<PackageGroups> packages, @Nullable String str) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f81269a = packages;
        this.f81271c = str;
    }

    public final void updatePackage(@NotNull List<PostpaidSearchPackage> packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.f81270b = packages;
    }
}
