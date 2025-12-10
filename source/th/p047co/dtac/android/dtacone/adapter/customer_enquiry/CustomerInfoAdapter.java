package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.CustomerInfoAdapter;
import th.p047co.dtac.android.dtacone.databinding.BlacklistCustomerInfoItemBinding;
import th.p047co.dtac.android.dtacone.extension.ShimmerExtenKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.customerenquiry.BCustInfo;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/CustomerInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/CustomerInfoAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/BCustInfo;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "hasRefresh", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "loadingState", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/customer_enquiry/CustomerInfoAdapter$ViewHolder;", "getItemCount", "()I", "viewHolder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/customer_enquiry/CustomerInfoAdapter$ViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", OperatorName.CURVE_TO, "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCustomerInfoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerInfoAdapter.kt\nth/co/dtac/android/dtacone/adapter/customer_enquiry/CustomerInfoAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1855#2,2:105\n*S KotlinDebug\n*F\n+ 1 CustomerInfoAdapter.kt\nth/co/dtac/android/dtacone/adapter/customer_enquiry/CustomerInfoAdapter\n*L\n83#1:105,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.CustomerInfoAdapter */
/* loaded from: classes7.dex */
public final class CustomerInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f81105a;

    /* renamed from: b */
    public final Function1 f81106b;

    /* renamed from: c */
    public final Function1 f81107c;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\n*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\n*\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/CustomerInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/BlacklistCustomerInfoItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/BlacklistCustomerInfoItemBinding;)V", "Lth/co/dtac/android/dtacone/model/customerenquiry/BCustInfo;", "item", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "hasRefresh", "bind", "(Lth/co/dtac/android/dtacone/model/customerenquiry/BCustInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "d", "(Landroid/view/View;)V", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "e", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/BlacklistCustomerInfoItemBinding;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.CustomerInfoAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final BlacklistCustomerInfoItemBinding f81108a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull BlacklistCustomerInfoItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81108a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20402b(Function1 function1, BCustInfo bCustInfo, View view) {
            m20401c(function1, bCustInfo, view);
        }

        /* renamed from: c */
        public static final void m20401c(Function1 listener, BCustInfo item, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(item, "$item");
            listener.invoke(item.getCustomerNumber());
        }

        public final void bind(@NotNull final BCustInfo item, @NotNull final Function1<? super String, Unit> listener, @NotNull Function1<? super Boolean, Unit> hasRefresh) {
            Unit unit;
            Unit unit2;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(hasRefresh, "hasRefresh");
            View bind$lambda$4 = this.itemView;
            this.f81108a.textViewCustomerNumber.setText(item.getCustomerNumber());
            if (item.isLoading()) {
                Intrinsics.checkNotNullExpressionValue(bind$lambda$4, "bind$lambda$4");
                m20398f(bind$lambda$4);
            } else {
                Intrinsics.checkNotNullExpressionValue(bind$lambda$4, "bind$lambda$4");
                m20397g(bind$lambda$4);
            }
            if (item.getBlacklistAmount() != null) {
                m20400d(bind$lambda$4);
                m20399e(bind$lambda$4);
            } else {
                hasRefresh.invoke(Boolean.TRUE);
            }
            String blacklistAmount = item.getBlacklistAmount();
            Unit unit3 = null;
            String str3 = HelpFormatter.DEFAULT_OPT_PREFIX;
            if (blacklistAmount != null) {
                DtacFontTextView dtacFontTextView = this.f81108a.valueBlacklistPay;
                if (blacklistAmount.length() > 0) {
                    str2 = StringExtKt.formatMoneyWithDecimal(blacklistAmount);
                } else {
                    str2 = HelpFormatter.DEFAULT_OPT_PREFIX;
                }
                dtacFontTextView.setText(str2);
                hasRefresh.invoke(Boolean.FALSE);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                Group group = this.f81108a.amountGroup;
                Intrinsics.checkNotNullExpressionValue(group, "binding.amountGroup");
                ViewVisibleExtKt.toGone(group);
            }
            String blacklistOtherChange = item.getBlacklistOtherChange();
            if (blacklistOtherChange != null) {
                DtacFontTextView dtacFontTextView2 = this.f81108a.valueFine;
                if (blacklistOtherChange.length() > 0) {
                    str = StringExtKt.formatMoneyWithDecimal(blacklistOtherChange);
                } else {
                    str = HelpFormatter.DEFAULT_OPT_PREFIX;
                }
                dtacFontTextView2.setText(str);
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                Group group2 = this.f81108a.otherChangeGroup;
                Intrinsics.checkNotNullExpressionValue(group2, "binding.otherChangeGroup");
                ViewVisibleExtKt.toGone(group2);
            }
            String blacklistNetAmount = item.getBlacklistNetAmount();
            if (blacklistNetAmount != null) {
                DtacFontTextView dtacFontTextView3 = this.f81108a.valueBlacklistTotal;
                if (blacklistNetAmount.length() > 0) {
                    str3 = StringExtKt.formatMoneyWithDecimal(blacklistNetAmount);
                }
                dtacFontTextView3.setText(str3);
                unit3 = Unit.INSTANCE;
            }
            if (unit3 == null) {
                Group group3 = this.f81108a.netAmountGroup;
                Intrinsics.checkNotNullExpressionValue(group3, "binding.netAmountGroup");
                ViewVisibleExtKt.toGone(group3);
            }
            bind$lambda$4.setOnClickListener(new View.OnClickListener() { // from class: mB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomerInfoAdapter.ViewHolder.m20402b(listener, item, view);
                }
            });
        }

        /* renamed from: d */
        public final void m20400d(View view) {
            ShimmerFrameLayout shimmerFrameLayout = this.f81108a.shimmerAmount;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAmount");
            ShimmerExtenKt.finish(shimmerFrameLayout);
            ShimmerFrameLayout shimmerFrameLayout2 = this.f81108a.shimmerOtherChange;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerOtherChange");
            ShimmerExtenKt.finish(shimmerFrameLayout2);
            ShimmerFrameLayout shimmerFrameLayout3 = this.f81108a.shimmerNetAmount;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "binding.shimmerNetAmount");
            ShimmerExtenKt.finish(shimmerFrameLayout3);
        }

        /* renamed from: e */
        public final void m20399e(View view) {
            Group group = this.f81108a.amountGroup;
            Intrinsics.checkNotNullExpressionValue(group, "binding.amountGroup");
            ViewVisibleExtKt.toVisible(group);
            Group group2 = this.f81108a.otherChangeGroup;
            Intrinsics.checkNotNullExpressionValue(group2, "binding.otherChangeGroup");
            ViewVisibleExtKt.toVisible(group2);
            Group group3 = this.f81108a.netAmountGroup;
            Intrinsics.checkNotNullExpressionValue(group3, "binding.netAmountGroup");
            ViewVisibleExtKt.toVisible(group3);
        }

        /* renamed from: f */
        public final void m20398f(View view) {
            ShimmerFrameLayout shimmerFrameLayout = this.f81108a.shimmerAmount;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAmount");
            ViewVisibleExtKt.toVisible(shimmerFrameLayout);
            this.f81108a.shimmerAmount.startShimmer();
            ShimmerFrameLayout shimmerFrameLayout2 = this.f81108a.shimmerOtherChange;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerOtherChange");
            ViewVisibleExtKt.toVisible(shimmerFrameLayout2);
            this.f81108a.shimmerOtherChange.startShimmer();
            ShimmerFrameLayout shimmerFrameLayout3 = this.f81108a.shimmerNetAmount;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "binding.shimmerNetAmount");
            ViewVisibleExtKt.toVisible(shimmerFrameLayout3);
            this.f81108a.shimmerNetAmount.startShimmer();
        }

        /* renamed from: g */
        public final void m20397g(View view) {
            ShimmerFrameLayout shimmerFrameLayout = this.f81108a.shimmerAmount;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAmount");
            ViewVisibleExtKt.toVisible(shimmerFrameLayout);
            this.f81108a.shimmerAmount.stopShimmer();
            ShimmerFrameLayout shimmerFrameLayout2 = this.f81108a.shimmerOtherChange;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "binding.shimmerOtherChange");
            ViewVisibleExtKt.toVisible(shimmerFrameLayout2);
            this.f81108a.shimmerOtherChange.stopShimmer();
            ShimmerFrameLayout shimmerFrameLayout3 = this.f81108a.shimmerNetAmount;
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "binding.shimmerNetAmount");
            ViewVisibleExtKt.toVisible(shimmerFrameLayout3);
            this.f81108a.shimmerNetAmount.stopShimmer();
        }
    }

    public CustomerInfoAdapter(@NotNull List<BCustInfo> items, @NotNull Function1<? super String, Unit> listener, @NotNull Function1<? super Boolean, Unit> hasRefresh) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(hasRefresh, "hasRefresh");
        this.f81105a = items;
        this.f81106b = listener;
        this.f81107c = hasRefresh;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81105a.size();
    }

    @NotNull
    public final List<BCustInfo> getItems() {
        return this.f81105a;
    }

    public final void loadingState() {
        for (BCustInfo bCustInfo : this.f81105a) {
            if (bCustInfo.getBlacklistAmount() == null) {
                bCustInfo.setLoading(true);
            }
        }
        notifyDataSetChanged();
    }

    public final void setItems(@NotNull List<BCustInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f81105a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind((BCustInfo) this.f81105a.get(i), this.f81106b, this.f81107c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BlacklistCustomerInfoItemBinding inflate = BlacklistCustomerInfoItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new ViewHolder(inflate);
    }
}
