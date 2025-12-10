package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.OnePermissionKt;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemOneOwnerManagementDetailBinding;
import th.p047co.dtac.android.dtacone.databinding.ItemOneOwnerManagementHeaderBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.activity.OneOwnerManagementActivity;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerLastTransaction;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerTransactionPrice;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.TransactionItemList;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B'\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerTransactionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/viewModel/TransactionItemList;", "ownTransactionList", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/activity/OneOwnerManagementActivity;", "activity", "", "company", "<init>", "(Ljava/util/List;Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/activity/OneOwnerManagementActivity;Ljava/lang/String;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/activity/OneOwnerManagementActivity;", OperatorName.CURVE_TO, "Ljava/lang/String;", "OwnerHeaderViewHolder", "OwnerTransactionViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.adapter.OneOwnerTransactionAdapter */
/* loaded from: classes10.dex */
public final class OneOwnerTransactionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f93061a;

    /* renamed from: b */
    public final OneOwnerManagementActivity f93062b;

    /* renamed from: c */
    public final String f93063c;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerTransactionAdapter$OwnerHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementHeaderBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementHeaderBinding;)V", "", "ownerTransactionDate", "", "bind", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementHeaderBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.adapter.OneOwnerTransactionAdapter$OwnerHeaderViewHolder */
    /* loaded from: classes10.dex */
    public static final class OwnerHeaderViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ItemOneOwnerManagementHeaderBinding f93064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerHeaderViewHolder(@NotNull ItemOneOwnerManagementHeaderBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f93064a = binding;
        }

        public final void bind(@NotNull String ownerTransactionDate) {
            Intrinsics.checkNotNullParameter(ownerTransactionDate, "ownerTransactionDate");
            this.f93064a.ownerTransactionHeaderTextView.setText(ownerTransactionDate);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/adapter/OneOwnerTransactionAdapter$OwnerTransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementDetailBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementDetailBinding;)V", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;", "ownerTransactionItem", "", "company", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/activity/OneOwnerManagementActivity;", "activity", "", "bind", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/activity/OneOwnerManagementActivity;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemOneOwnerManagementDetailBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.adapter.OneOwnerTransactionAdapter$OwnerTransactionViewHolder */
    /* loaded from: classes10.dex */
    public static final class OwnerTransactionViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final ItemOneOwnerManagementDetailBinding f93065a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnerTransactionViewHolder(@NotNull ItemOneOwnerManagementDetailBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f93065a = binding;
        }

        public final void bind(@Nullable OneOwnerLastTransaction oneOwnerLastTransaction, @NotNull String company, @NotNull OneOwnerManagementActivity activity) {
            String str;
            String str2;
            int i;
            Intrinsics.checkNotNullParameter(company, "company");
            Intrinsics.checkNotNullParameter(activity, "activity");
            ItemOneOwnerManagementDetailBinding itemOneOwnerManagementDetailBinding = this.f93065a;
            if (oneOwnerLastTransaction != null) {
                itemOneOwnerManagementDetailBinding.ownerTransactionDetailTimeTextView.setText(oneOwnerLastTransaction.getDisplayTime());
                itemOneOwnerManagementDetailBinding.ownerTransactionDisplayTypeTextView.setText(oneOwnerLastTransaction.getDisplayType());
                OneFontTextView oneFontTextView = itemOneOwnerManagementDetailBinding.ownerTransactionPhoneTextView;
                String subscriberNumber = oneOwnerLastTransaction.getSubscriberNumber();
                if (subscriberNumber != null) {
                    str = PhoneNumberExtKt.toPretty(subscriberNumber);
                } else {
                    str = null;
                }
                oneFontTextView.setText(str);
                OneOwnerTransactionPrice price = oneOwnerLastTransaction.getPrice();
                if (price != null) {
                    str2 = price.getAmount();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    OneFontTextView ownerTransactionAmountTextView = itemOneOwnerManagementDetailBinding.ownerTransactionAmountTextView;
                    Intrinsics.checkNotNullExpressionValue(ownerTransactionAmountTextView, "ownerTransactionAmountTextView");
                    ViewVisibleExtKt.toVisible(ownerTransactionAmountTextView);
                    OneFontTextView userDetailBathCurrencyTextView = itemOneOwnerManagementDetailBinding.userDetailBathCurrencyTextView;
                    Intrinsics.checkNotNullExpressionValue(userDetailBathCurrencyTextView, "userDetailBathCurrencyTextView");
                    ViewVisibleExtKt.toVisible(userDetailBathCurrencyTextView);
                    itemOneOwnerManagementDetailBinding.ownerTransactionAmountTextView.setText(oneOwnerLastTransaction.getPrice().getAmount().toString());
                } else {
                    OneFontTextView ownerTransactionAmountTextView2 = itemOneOwnerManagementDetailBinding.ownerTransactionAmountTextView;
                    Intrinsics.checkNotNullExpressionValue(ownerTransactionAmountTextView2, "ownerTransactionAmountTextView");
                    ViewVisibleExtKt.toGone(ownerTransactionAmountTextView2);
                    OneFontTextView userDetailBathCurrencyTextView2 = itemOneOwnerManagementDetailBinding.userDetailBathCurrencyTextView;
                    Intrinsics.checkNotNullExpressionValue(userDetailBathCurrencyTextView2, "userDetailBathCurrencyTextView");
                    ViewVisibleExtKt.toGone(userDetailBathCurrencyTextView2);
                }
                String packageName = oneOwnerLastTransaction.getPackageName();
                if (packageName != null && packageName.length() != 0) {
                    OneFontTextView ownerTransactionPackageNameTextView = itemOneOwnerManagementDetailBinding.ownerTransactionPackageNameTextView;
                    Intrinsics.checkNotNullExpressionValue(ownerTransactionPackageNameTextView, "ownerTransactionPackageNameTextView");
                    ViewVisibleExtKt.toVisible(ownerTransactionPackageNameTextView);
                    itemOneOwnerManagementDetailBinding.ownerTransactionPackageNameTextView.setText(oneOwnerLastTransaction.getPackageName());
                } else {
                    OneFontTextView ownerTransactionPackageNameTextView2 = itemOneOwnerManagementDetailBinding.ownerTransactionPackageNameTextView;
                    Intrinsics.checkNotNullExpressionValue(ownerTransactionPackageNameTextView2, "ownerTransactionPackageNameTextView");
                    ViewVisibleExtKt.toGone(ownerTransactionPackageNameTextView2);
                }
                AppCompatImageView appCompatImageView = itemOneOwnerManagementDetailBinding.ownerTransactionDisplayTypeImageView;
                String featureCode = oneOwnerLastTransaction.getFeatureCode();
                if (featureCode != null) {
                    i = OnePermissionKt.getOneIconByPermission(featureCode, company);
                } else {
                    i = R.drawable.image_default;
                }
                appCompatImageView.setImageResource(i);
                itemOneOwnerManagementDetailBinding.ownerTransactionAmountTextView.setTextColor(ResourcesCompat.getColor(itemOneOwnerManagementDetailBinding.getRoot().getResources(), activity.getOneOwnerManagementThemeColorModel().getFontColor(), null));
            }
        }
    }

    public OneOwnerTransactionAdapter(@Nullable List<? extends TransactionItemList> list, @NotNull OneOwnerManagementActivity activity, @NotNull String company) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(company, "company");
        this.f93061a = list;
        this.f93062b = activity;
        this.f93063c = company;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f93061a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        TransactionItemList transactionItemList;
        List list = this.f93061a;
        if (list != null) {
            transactionItemList = (TransactionItemList) list.get(i);
        } else {
            transactionItemList = null;
        }
        if (transactionItemList instanceof TransactionItemList.DateHeaderItem) {
            return 0;
        }
        if (transactionItemList instanceof TransactionItemList.LastTransactionItem) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        TransactionItemList transactionItemList;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f93061a;
        if (list != null) {
            transactionItemList = (TransactionItemList) list.get(i);
        } else {
            transactionItemList = null;
        }
        if (transactionItemList instanceof TransactionItemList.DateHeaderItem) {
            ((OwnerHeaderViewHolder) holder).bind(((TransactionItemList.DateHeaderItem) transactionItemList).getDate());
        } else if (transactionItemList instanceof TransactionItemList.LastTransactionItem) {
            ((OwnerTransactionViewHolder) holder).bind(((TransactionItemList.LastTransactionItem) transactionItemList).getTransaction(), this.f93063c, this.f93062b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i != 0) {
            if (i == 1) {
                ItemOneOwnerManagementDetailBinding inflate = ItemOneOwnerManagementDetailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
                return new OwnerTransactionViewHolder(inflate);
            }
            throw new IllegalArgumentException("Invalid view type");
        }
        ItemOneOwnerManagementHeaderBinding inflate2 = ItemOneOwnerManagementHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
        return new OwnerHeaderViewHolder(inflate2);
    }
}