package th.p047co.dtac.android.dtacone.view.appOne.device_sale.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.blacklist.PackagePriceTierResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleAdditionalAdvanceAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleAdditionalAdvanceAdapter$AdditionalAdvanceDeviceViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleAdditionalAdvanceAdapter$AdditionalAdvanceDeviceViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleAdditionalAdvanceAdapter$AdditionalAdvanceDeviceViewHolder;I)V", "", "data", "swapData", "(Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvPriceRange", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvPriceRange", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "setTvPriceRange", "(Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;)V", "tvPrice", "getTvPrice", "setTvPrice", "Landroidx/constraintlayout/widget/ConstraintLayout;", "item_container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getItem_container", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setItem_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "AdditionalAdvanceDeviceViewHolder", PDPageLabelRange.STYLE_LETTERS_LOWER, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleAdditionalAdvanceAdapter */
/* loaded from: classes10.dex */
public final class OneDeviceSaleAdditionalAdvanceAdapter extends ListAdapter<PackagePriceTierResponse.ExtraAdvance, AdditionalAdvanceDeviceViewHolder> {
    public static final int $stable = 8;
    public ConstraintLayout item_container;
    public OneFontTextView tvPrice;
    public OneFontTextView tvPriceRange;

    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleAdditionalAdvanceAdapter$AdditionalAdvanceDeviceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/adapter/OneDeviceSaleAdditionalAdvanceAdapter;Landroid/view/View;)V", "bind", "", "item", "Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;", "position", "", "onClick", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleAdditionalAdvanceAdapter$AdditionalAdvanceDeviceViewHolder */
    /* loaded from: classes10.dex */
    public final class AdditionalAdvanceDeviceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ OneDeviceSaleAdditionalAdvanceAdapter f90103a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalAdvanceDeviceViewHolder(@NotNull OneDeviceSaleAdditionalAdvanceAdapter oneDeviceSaleAdditionalAdvanceAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f90103a = oneDeviceSaleAdditionalAdvanceAdapter;
            itemView.setOnClickListener(this);
        }

        public final void bind(@NotNull PackagePriceTierResponse.ExtraAdvance item, int i) {
            Intrinsics.checkNotNullParameter(item, "item");
            View view = this.itemView;
            OneDeviceSaleAdditionalAdvanceAdapter oneDeviceSaleAdditionalAdvanceAdapter = this.f90103a;
            View findViewById = view.findViewById(R.id.tvPriceRange);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.tvPriceRange)");
            oneDeviceSaleAdditionalAdvanceAdapter.setTvPriceRange((OneFontTextView) findViewById);
            View findViewById2 = this.itemView.findViewById(R.id.tvPrice);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.tvPrice)");
            oneDeviceSaleAdditionalAdvanceAdapter.setTvPrice((OneFontTextView) findViewById2);
            View findViewById3 = this.itemView.findViewById(R.id.item_container);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.item_container)");
            oneDeviceSaleAdditionalAdvanceAdapter.setItem_container((ConstraintLayout) findViewById3);
            oneDeviceSaleAdditionalAdvanceAdapter.getTvPriceRange().setText(item.getRrpText());
            oneDeviceSaleAdditionalAdvanceAdapter.getTvPrice().setText(item.getExtraAdvance2());
            if (i % 2 != 0) {
                oneDeviceSaleAdditionalAdvanceAdapter.getItem_container().setBackgroundColor(-1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View view) {
            if (getAdapterPosition() == -1) {
                return;
            }
            OneDeviceSaleAdditionalAdvanceAdapter.access$getItem(this.f90103a, getAdapterPosition());
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.adapter.OneDeviceSaleAdditionalAdvanceAdapter$a */
    /* loaded from: classes10.dex */
    public static final class C14576a extends DiffUtil.ItemCallback {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a */
        public boolean areContentsTheSame(PackagePriceTierResponse.ExtraAdvance oldItem, PackagePriceTierResponse.ExtraAdvance newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (Intrinsics.areEqual(oldItem.getRrpText(), newItem.getRrpText()) && Intrinsics.areEqual(oldItem.getExtraAdvance2(), newItem.getExtraAdvance2())) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b */
        public boolean areItemsTheSame(PackagePriceTierResponse.ExtraAdvance oldItem, PackagePriceTierResponse.ExtraAdvance newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (Intrinsics.areEqual(oldItem.getRrpText(), newItem.getRrpText()) && Intrinsics.areEqual(oldItem.getExtraAdvance2(), newItem.getExtraAdvance2())) {
                return true;
            }
            return false;
        }
    }

    public OneDeviceSaleAdditionalAdvanceAdapter() {
        super(new C14576a());
    }

    public static final /* synthetic */ PackagePriceTierResponse.ExtraAdvance access$getItem(OneDeviceSaleAdditionalAdvanceAdapter oneDeviceSaleAdditionalAdvanceAdapter, int i) {
        return oneDeviceSaleAdditionalAdvanceAdapter.getItem(i);
    }

    @NotNull
    public final ConstraintLayout getItem_container() {
        ConstraintLayout constraintLayout = this.item_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("item_container");
        return null;
    }

    @NotNull
    public final OneFontTextView getTvPrice() {
        OneFontTextView oneFontTextView = this.tvPrice;
        if (oneFontTextView != null) {
            return oneFontTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvPrice");
        return null;
    }

    @NotNull
    public final OneFontTextView getTvPriceRange() {
        OneFontTextView oneFontTextView = this.tvPriceRange;
        if (oneFontTextView != null) {
            return oneFontTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvPriceRange");
        return null;
    }

    public final void setItem_container(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.item_container = constraintLayout;
    }

    public final void setTvPrice(@NotNull OneFontTextView oneFontTextView) {
        Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
        this.tvPrice = oneFontTextView;
    }

    public final void setTvPriceRange(@NotNull OneFontTextView oneFontTextView) {
        Intrinsics.checkNotNullParameter(oneFontTextView, "<set-?>");
        this.tvPriceRange = oneFontTextView;
    }

    public final void swapData(@NotNull List<PackagePriceTierResponse.ExtraAdvance> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) data));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AdditionalAdvanceDeviceViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PackagePriceTierResponse.ExtraAdvance item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.bind(item, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AdditionalAdvanceDeviceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_additional_advance, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context)\n   …l_advance, parent, false)");
        return new AdditionalAdvanceDeviceViewHolder(this, inflate);
    }
}