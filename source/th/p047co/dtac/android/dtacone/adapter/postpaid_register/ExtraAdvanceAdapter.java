package th.p047co.dtac.android.dtacone.adapter.postpaid_register;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
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
import th.p047co.dtac.android.dtacone.databinding.ItemExtraAdvanceBinding;
import th.p047co.dtac.android.dtacone.model.blacklist.PackagePriceTierResponse;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_register/ExtraAdvanceAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;", "Lth/co/dtac/android/dtacone/adapter/postpaid_register/ExtraAdvanceAdapter$ExtraAdvanceViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/postpaid_register/ExtraAdvanceAdapter$ExtraAdvanceViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/postpaid_register/ExtraAdvanceAdapter$ExtraAdvanceViewHolder;I)V", "", "data", "swapData", "(Ljava/util/List;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "ExtraAdvanceViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_register.ExtraAdvanceAdapter */
/* loaded from: classes7.dex */
public final class ExtraAdvanceAdapter extends ListAdapter<PackagePriceTierResponse.ExtraAdvance, ExtraAdvanceViewHolder> {
    public static final int $stable = 0;

    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/postpaid_register/ExtraAdvanceAdapter$ExtraAdvanceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Lth/co/dtac/android/dtacone/databinding/ItemExtraAdvanceBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/adapter/postpaid_register/ExtraAdvanceAdapter;Lth/co/dtac/android/dtacone/databinding/ItemExtraAdvanceBinding;)V", "Landroid/view/View;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", "onClick", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;", "item", "", "position", "bind", "(Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemExtraAdvanceBinding;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_register.ExtraAdvanceAdapter$ExtraAdvanceViewHolder */
    /* loaded from: classes7.dex */
    public final class ExtraAdvanceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public final ItemExtraAdvanceBinding f81399a;

        /* renamed from: b */
        public final /* synthetic */ ExtraAdvanceAdapter f81400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExtraAdvanceViewHolder(@NotNull ExtraAdvanceAdapter extraAdvanceAdapter, ItemExtraAdvanceBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81400b = extraAdvanceAdapter;
            this.f81399a = binding;
            this.itemView.setOnClickListener(this);
        }

        public final void bind(@NotNull PackagePriceTierResponse.ExtraAdvance item, int i) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f81399a.tvPriceRange.setText(item.getRrpText());
            this.f81399a.tvPrice.setText(item.getExtraAdvance2());
            if (i % 2 != 0) {
                this.f81399a.itemContainer.setBackgroundColor(-1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View view) {
            if (getAdapterPosition() == -1) {
                return;
            }
            ExtraAdvanceAdapter.access$getItem(this.f81400b, getAdapterPosition());
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_register.ExtraAdvanceAdapter$a */
    /* loaded from: classes7.dex */
    public static final class C14142a extends DiffUtil.ItemCallback {
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

    public ExtraAdvanceAdapter() {
        super(new C14142a());
    }

    public static final /* synthetic */ PackagePriceTierResponse.ExtraAdvance access$getItem(ExtraAdvanceAdapter extraAdvanceAdapter, int i) {
        return extraAdvanceAdapter.getItem(i);
    }

    public final void swapData(@NotNull List<PackagePriceTierResponse.ExtraAdvance> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) data));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ExtraAdvanceViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PackagePriceTierResponse.ExtraAdvance item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.bind(item, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ExtraAdvanceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemExtraAdvanceBinding inflate = ItemExtraAdvanceBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ExtraAdvanceViewHolder(this, inflate);
    }
}
