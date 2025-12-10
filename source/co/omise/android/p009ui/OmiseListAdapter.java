package co.omise.android.p009ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import co.omise.android.C5511R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.realm.CollectionUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28850d2 = {"Lco/omise/android/ui/OmiseListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lco/omise/android/ui/OmiseItemViewHolder;", CollectionUtils.LIST_TYPE, "", "Lco/omise/android/ui/OmiseListItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lco/omise/android/ui/OmiseListItemClickListener;", "(Ljava/util/List;Lco/omise/android/ui/OmiseListItemClickListener;)V", "getList", "()Ljava/util/List;", "getListener", "()Lco/omise/android/ui/OmiseListItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.OmiseListAdapter */
/* loaded from: classes3.dex */
public final class OmiseListAdapter extends RecyclerView.Adapter<OmiseItemViewHolder> {
    @NotNull
    private final List<OmiseListItem> list;
    @Nullable
    private final OmiseListItemClickListener listener;

    /* JADX WARN: Multi-variable type inference failed */
    public OmiseListAdapter(@NotNull List<? extends OmiseListItem> list, @Nullable OmiseListItemClickListener omiseListItemClickListener) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.listener = omiseListItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    @NotNull
    public final List<OmiseListItem> getList() {
        return this.list;
    }

    @Nullable
    public final OmiseListItemClickListener getListener() {
        return this.listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OmiseItemViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.list.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OmiseItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(C5511R.C5515layout.list_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        return new OmiseItemViewHolder(itemView, this.listener);
    }
}
