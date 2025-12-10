package th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageDescAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "", "descList", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "DescriptionItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageDescAdapter */
/* loaded from: classes10.dex */
public final class OnePre2PostPackageDescAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f94780a;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageDescAdapter$DescriptionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPackageDescAdapter;Landroid/view/View;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getDescItemTextView", "()Landroid/widget/TextView;", "descItemTextView", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPackageDescAdapter$DescriptionItemViewHolder */
    /* loaded from: classes10.dex */
    public final class DescriptionItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f94781a;

        /* renamed from: b */
        public final /* synthetic */ OnePre2PostPackageDescAdapter f94782b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptionItemViewHolder(@NotNull OnePre2PostPackageDescAdapter onePre2PostPackageDescAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f94782b = onePre2PostPackageDescAdapter;
            View findViewById = view.findViewById(R.id.descItemTextView);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f94781a = (TextView) findViewById;
        }

        @NotNull
        public final TextView getDescItemTextView() {
            return this.f94781a;
        }
    }

    public OnePre2PostPackageDescAdapter(@NotNull List<String> descList) {
        Intrinsics.checkNotNullParameter(descList, "descList");
        this.f94780a = descList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f94780a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = (String) this.f94780a.get(i);
        if (holder instanceof DescriptionItemViewHolder) {
            ((DescriptionItemViewHolder) holder).getDescItemTextView().setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_pre2post_package_desc_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DescriptionItemViewHolder(this, view);
    }
}