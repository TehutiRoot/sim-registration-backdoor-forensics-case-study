package th.p047co.dtac.android.dtacone.model.appOne.postpaid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/adapter/OnePostpaidPackageDescAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "descList", "", "", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DescriptionItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.adapter.OnePostpaidPackageDescAdapter */
/* loaded from: classes8.dex */
public final class OnePostpaidPackageDescAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;
    @NotNull
    private final List<String> descList;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/adapter/OnePostpaidPackageDescAdapter$DescriptionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", Promotion.ACTION_VIEW, "Landroid/view/View;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/adapter/OnePostpaidPackageDescAdapter;Landroid/view/View;)V", "tvDescItem", "Landroid/widget/TextView;", "getTvDescItem", "()Landroid/widget/TextView;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.adapter.OnePostpaidPackageDescAdapter$DescriptionItemViewHolder */
    /* loaded from: classes8.dex */
    public final class DescriptionItemViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ OnePostpaidPackageDescAdapter this$0;
        @NotNull
        private final TextView tvDescItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DescriptionItemViewHolder(@NotNull OnePostpaidPackageDescAdapter onePostpaidPackageDescAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = onePostpaidPackageDescAdapter;
            View findViewById = view.findViewById(R.id.tvDescItem);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.tvDescItem = (TextView) findViewById;
        }

        @NotNull
        public final TextView getTvDescItem() {
            return this.tvDescItem;
        }
    }

    public OnePostpaidPackageDescAdapter(@NotNull List<String> descList) {
        Intrinsics.checkNotNullParameter(descList, "descList");
        this.descList = descList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.descList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = this.descList.get(i);
        if (holder instanceof DescriptionItemViewHolder) {
            ((DescriptionItemViewHolder) holder).getTvDescItem().setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_postpaid_package_desc_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new DescriptionItemViewHolder(this, view);
    }
}