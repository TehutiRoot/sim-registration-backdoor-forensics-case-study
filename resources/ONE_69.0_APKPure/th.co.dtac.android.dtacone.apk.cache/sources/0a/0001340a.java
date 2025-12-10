package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.model.NadOutboundFilterHeaderItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.model.NadOutboundFilterItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.model.NadOutboundFilterItems;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewHolder.FilterHeaderViewHolder;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewHolder.FilterItemViewHolder;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BS\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00122\u0010\f\u001a.\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dRN\u0010\f\u001a.\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSelectFilterListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/model/NadOutboundFilterItems;", "Lkotlin/collections/ArrayList;", "filterList", "Lkotlin/Function5;", "", "", "", "", "onSelectFilterItem", "<init>", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function5;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function5;", "getOnSelectFilterItem", "()Lkotlin/jvm/functions/Function5;", "setOnSelectFilterItem", "(Lkotlin/jvm/functions/Function5;)V", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSelectFilterListAdapter */
/* loaded from: classes10.dex */
public final class OneNadOutboundSelectFilterListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int VIEW_TYPE_FILTER_ITEM = 1;
    public static final int VIEW_TYPE_HEADER_ITEM = 0;

    /* renamed from: a */
    public final ArrayList f92285a;

    /* renamed from: b */
    public Function5 f92286b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSelectFilterListAdapter$Companion;", "", "()V", "VIEW_TYPE_FILTER_ITEM", "", "VIEW_TYPE_HEADER_ITEM", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSelectFilterListAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public OneNadOutboundSelectFilterListAdapter(@NotNull ArrayList<NadOutboundFilterItems> filterList, @NotNull Function5<? super Integer, ? super String, ? super Boolean, ? super String, ? super String, Unit> onSelectFilterItem) {
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(onSelectFilterItem, "onSelectFilterItem");
        this.f92285a = filterList;
        this.f92286b = onSelectFilterItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92285a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        NadOutboundFilterItems nadOutboundFilterItems = (NadOutboundFilterItems) this.f92285a.get(i);
        if (nadOutboundFilterItems instanceof NadOutboundFilterHeaderItem) {
            return 0;
        }
        if (nadOutboundFilterItems instanceof NadOutboundFilterItem) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final Function5<Integer, String, Boolean, String, String, Unit> getOnSelectFilterItem() {
        return this.f92286b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof FilterHeaderViewHolder) {
            Object obj = this.f92285a.get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.nadOutbound.model.NadOutboundFilterHeaderItem");
            ((FilterHeaderViewHolder) holder).bind((NadOutboundFilterHeaderItem) obj, this.f92286b);
        } else if (holder instanceof FilterItemViewHolder) {
            Object obj2 = this.f92285a.get(i);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.nadOutbound.model.NadOutboundFilterItem");
            ((FilterItemViewHolder) holder).bind((NadOutboundFilterItem) obj2, this.f92286b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i != 0) {
            if (i == 1) {
                View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_filter, parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context)\n   …ne_filter, parent, false)");
                return new FilterItemViewHolder(inflate);
            }
            throw new IllegalArgumentException("Invalid view type");
        }
        View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_filter_header, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "from(parent.context)\n   …er_header, parent, false)");
        return new FilterHeaderViewHolder(inflate2);
    }

    public final void setOnSelectFilterItem(@NotNull Function5<? super Integer, ? super String, ? super Boolean, ? super String, ? super String, Unit> function5) {
        Intrinsics.checkNotNullParameter(function5, "<set-?>");
        this.f92286b = function5;
    }
}