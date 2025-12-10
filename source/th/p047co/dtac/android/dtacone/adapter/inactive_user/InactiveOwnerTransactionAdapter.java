package th.p047co.dtac.android.dtacone.adapter.inactive_user;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.ZInactiveOwnerTransectionItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZRectifyHeaderRowBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.VisibleExtensionKt;
import th.p047co.dtac.android.dtacone.model.inactive_user.InactiveOwnerTransectionCollection;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/InactiveOwnerTransactionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection;", "ownTransactions", "<init>", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Ljava/util/List;", "OwnerHeaderViewHolder", "OwnerTransactionViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.InactiveOwnerTransactionAdapter */
/* loaded from: classes7.dex */
public final class InactiveOwnerTransactionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f81221a;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/InactiveOwnerTransactionAdapter$OwnerHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZRectifyHeaderRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZRectifyHeaderRowBinding;)V", "Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection;", "ownerTransaction", "", "bind", "(Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZRectifyHeaderRowBinding;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.InactiveOwnerTransactionAdapter$OwnerHeaderViewHolder */
    /* loaded from: classes7.dex */
    public static final class OwnerHeaderViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ZRectifyHeaderRowBinding f81222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerHeaderViewHolder(@NotNull ZRectifyHeaderRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81222a = binding;
        }

        public final void bind(@NotNull InactiveOwnerTransectionCollection ownerTransaction) {
            Intrinsics.checkNotNullParameter(ownerTransaction, "ownerTransaction");
            this.f81222a.tvDate.setText(ownerTransaction.getDisplayDate());
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/inactive_user/InactiveOwnerTransactionAdapter$OwnerTransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ZInactiveOwnerTransectionItemRowBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ZInactiveOwnerTransectionItemRowBinding;)V", "Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection;", "ownerTransaction", "", "bind", "(Lth/co/dtac/android/dtacone/model/inactive_user/InactiveOwnerTransectionCollection;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZInactiveOwnerTransectionItemRowBinding;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.inactive_user.InactiveOwnerTransactionAdapter$OwnerTransactionViewHolder */
    /* loaded from: classes7.dex */
    public static final class OwnerTransactionViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ZInactiveOwnerTransectionItemRowBinding f81223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerTransactionViewHolder(@NotNull ZInactiveOwnerTransectionItemRowBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81223a = binding;
        }

        public final void bind(@NotNull InactiveOwnerTransectionCollection ownerTransaction) {
            String str;
            int i;
            Intrinsics.checkNotNullParameter(ownerTransaction, "ownerTransaction");
            this.f81223a.tvTransactionPhoneNumber.setText(PhoneNumberExtKt.toPretty(ownerTransaction.getSubscriberNumber()));
            this.f81223a.tvTransactionTime.setText(ownerTransaction.getDisplayTime());
            this.f81223a.tvTransactionType.setText(ownerTransaction.getDisplayType());
            DtacFontTextView dtacFontTextView = this.f81223a.tvTransactionAmount;
            InactiveOwnerTransectionCollection.InactiveTransactionPrice price = ownerTransaction.getPrice();
            String str2 = null;
            if (price != null) {
                str = price.getAmount();
            } else {
                str = null;
            }
            dtacFontTextView.setText(str);
            AppCompatImageView appCompatImageView = this.f81223a.ivImageType;
            Integer num = PermissionConstant.getImageTransactionType().get(ownerTransaction.getType());
            if (num != null) {
                i = num.intValue();
            } else {
                i = R.drawable.ic_window;
            }
            appCompatImageView.setImageResource(i);
            RelativeLayout relativeLayout = this.f81223a.transactionPrice;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.transactionPrice");
            InactiveOwnerTransectionCollection.InactiveTransactionPrice price2 = ownerTransaction.getPrice();
            if (price2 != null) {
                str2 = price2.getAmount();
            }
            VisibleExtensionKt.toVisibleOrGone(relativeLayout, str2);
        }
    }

    public InactiveOwnerTransactionAdapter(@NotNull List<InactiveOwnerTransectionCollection> ownTransactions) {
        Intrinsics.checkNotNullParameter(ownTransactions, "ownTransactions");
        this.f81221a = ownTransactions;
    }

    /* renamed from: a */
    public final RecyclerView.ViewHolder m20358a(int i, ViewGroup viewGroup) {
        if (i == 1) {
            ZInactiveOwnerTransectionItemRowBinding inflate = ZInactiveOwnerTransectionItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               ….context), parent, false)");
            return new OwnerTransactionViewHolder(inflate);
        }
        ZRectifyHeaderRowBinding inflate2 = ZRectifyHeaderRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(\n               ….context), parent, false)");
        return new OwnerHeaderViewHolder(inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81221a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        InactiveOwnerTransectionCollection inactiveOwnerTransectionCollection = (InactiveOwnerTransectionCollection) this.f81221a.get(i);
        if (holder instanceof OwnerTransactionViewHolder) {
            ((OwnerTransactionViewHolder) holder).bind(inactiveOwnerTransectionCollection);
        } else if (holder instanceof OwnerHeaderViewHolder) {
            ((OwnerHeaderViewHolder) holder).bind(inactiveOwnerTransectionCollection);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return m20358a(i, parent);
    }
}
