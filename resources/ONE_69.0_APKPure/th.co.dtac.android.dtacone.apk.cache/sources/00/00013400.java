package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemNadOutboundConvergenceListBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundProductItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000  2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002 !B'\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundConvergenceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundConvergenceListAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundProductItem;", "Lkotlin/collections/ArrayList;", CollectionUtils.LIST_TYPE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundConvergenceListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundConvergenceListAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundConvergenceListAdapter */
/* loaded from: classes10.dex */
public final class OneNadOutboundConvergenceListAdapter extends RecyclerView.Adapter<ViewHolder> {
    @NotNull
    public static final String PRODUCT_MOBILE_TYPE = "MOBILE";
    @NotNull
    public static final String PRODUCT_ONLINE_TYPE = "ONLINE";
    @NotNull
    public static final String PRODUCT_PAYTV_TYPE = "PAYTV";

    /* renamed from: a */
    public final ArrayList f92259a;

    /* renamed from: b */
    public final Context f92260b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundConvergenceListAdapter$Companion;", "", "()V", "PRODUCT_MOBILE_TYPE", "", "PRODUCT_ONLINE_TYPE", "PRODUCT_PAYTV_TYPE", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundConvergenceListAdapter$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundConvergenceListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundConvergenceListBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundConvergenceListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundConvergenceListBinding;)V", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundProductItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundProductItem;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundConvergenceListBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundConvergenceListBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundConvergenceListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemNadOutboundConvergenceListBinding f92261a;

        /* renamed from: b */
        public final /* synthetic */ OneNadOutboundConvergenceListAdapter f92262b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneNadOutboundConvergenceListAdapter oneNadOutboundConvergenceListAdapter, ItemNadOutboundConvergenceListBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f92262b = oneNadOutboundConvergenceListAdapter;
            this.f92261a = binding;
        }

        public final void bind(@NotNull OneNadOutboundProductItem item) {
            String productNumber;
            Drawable drawable;
            Intrinsics.checkNotNullParameter(item, "item");
            boolean areEqual = Intrinsics.areEqual(item.getProductSubType(), "INT");
            ItemNadOutboundConvergenceListBinding itemNadOutboundConvergenceListBinding = this.f92261a;
            OneNadOutboundConvergenceListAdapter oneNadOutboundConvergenceListAdapter = this.f92262b;
            OneFontTextView oneFontTextView = itemNadOutboundConvergenceListBinding.invoiceValueTextView;
            String productType = item.getProductType();
            if (Intrinsics.areEqual(productType, "MOBILE")) {
                productNumber = PhoneNumberExtKt.toMaskFormatFromPretty$default(PhoneNumberExtKt.toPretty(item.getProductNumber()), 6, false, 2, null);
            } else if (Intrinsics.areEqual(productType, "ONLINE")) {
                if (areEqual) {
                    productNumber = item.getProductNumber();
                } else {
                    productNumber = PhoneNumberExtKt.toMaskFormatFromPretty(PhoneNumberExtKt.toHomePhoneNumberPretty(item.getProductNumber()), 5, true);
                }
            } else {
                productNumber = item.getProductNumber();
            }
            oneFontTextView.setText(productNumber);
            itemNadOutboundConvergenceListBinding.invoiceTypeTextView.setText(item.getProductTypeDisp());
            String productType2 = item.getProductType();
            int hashCode = productType2.hashCode();
            if (hashCode != -2015525726) {
                if (hashCode != -1958892973) {
                    if (hashCode == 75906314 && productType2.equals(OneNadOutboundConvergenceListAdapter.PRODUCT_PAYTV_TYPE)) {
                        itemNadOutboundConvergenceListBinding.invoiceImageView.setImageDrawable(ContextCompat.getDrawable(oneNadOutboundConvergenceListAdapter.getContext(), R.drawable.ic_icon_true_id));
                    }
                } else if (productType2.equals("ONLINE")) {
                    ImageView imageView = itemNadOutboundConvergenceListBinding.invoiceImageView;
                    if (areEqual) {
                        drawable = ContextCompat.getDrawable(oneNadOutboundConvergenceListAdapter.getContext(), R.drawable.ic_icon_true_online_red);
                    } else {
                        drawable = ContextCompat.getDrawable(oneNadOutboundConvergenceListAdapter.getContext(), R.drawable.ic_icon_phone_red);
                    }
                    imageView.setImageDrawable(drawable);
                }
            } else if (productType2.equals("MOBILE")) {
                itemNadOutboundConvergenceListBinding.invoiceImageView.setImageDrawable(ContextCompat.getDrawable(oneNadOutboundConvergenceListAdapter.getContext(), R.drawable.ic_icon_true_move_h_red));
            }
        }

        @NotNull
        public final ItemNadOutboundConvergenceListBinding getBinding() {
            return this.f92261a;
        }
    }

    public OneNadOutboundConvergenceListAdapter(@NotNull ArrayList<OneNadOutboundProductItem> list, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f92259a = list;
        this.f92260b = context;
    }

    @NotNull
    public final Context getContext() {
        return this.f92260b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92259a.size();
    }

    @NotNull
    public final ArrayList<OneNadOutboundProductItem> getList() {
        return this.f92259a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f92259a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "list[position]");
        holder.bind((OneNadOutboundProductItem) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemNadOutboundConvergenceListBinding inflate = ItemNadOutboundConvergenceListBinding.inflate(LayoutInflater.from(this.f92260b), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new ViewHolder(this, inflate);
    }
}