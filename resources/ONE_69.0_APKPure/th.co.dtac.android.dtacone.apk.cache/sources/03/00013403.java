package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemNadOutboundInvoiceListBinding;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundInvoiceItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B'\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundInvoiceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundInvoiceListAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceItem;", "Lkotlin/collections/ArrayList;", CollectionUtils.LIST_TYPE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundInvoiceListAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundInvoiceListAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundInvoiceListAdapter */
/* loaded from: classes10.dex */
public final class OneNadOutboundInvoiceListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f92263a;

    /* renamed from: b */
    public final Context f92264b;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundInvoiceListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundInvoiceListBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundInvoiceListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundInvoiceListBinding;)V", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceItem;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundInvoiceListBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundInvoiceListBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundInvoiceListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemNadOutboundInvoiceListBinding f92265a;

        /* renamed from: b */
        public final /* synthetic */ OneNadOutboundInvoiceListAdapter f92266b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneNadOutboundInvoiceListAdapter oneNadOutboundInvoiceListAdapter, ItemNadOutboundInvoiceListBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f92266b = oneNadOutboundInvoiceListAdapter;
            this.f92265a = binding;
        }

        public final void bind(@NotNull OneNadOutboundInvoiceItem item) {
            int color;
            String string;
            Intrinsics.checkNotNullParameter(item, "item");
            ItemNadOutboundInvoiceListBinding itemNadOutboundInvoiceListBinding = this.f92265a;
            OneNadOutboundInvoiceListAdapter oneNadOutboundInvoiceListAdapter = this.f92266b;
            itemNadOutboundInvoiceListBinding.billDateItemTextView.setText(StringExtKt.toThaiMonthYear$default(item.getBillDate(), false, 1, null));
            itemNadOutboundInvoiceListBinding.dueDateItemTextView.setText(StringExtKt.toThaiMonthYear(item.getDueDate(), true));
            if (Intrinsics.areEqual(item.getDueStatus(), OneNadOutboundActivity.DUE_STATUS_OVERDUE)) {
                color = ResourcesCompat.getColor(oneNadOutboundInvoiceListAdapter.getContext().getResources(), R.color.colorRed21, null);
            } else {
                color = ResourcesCompat.getColor(oneNadOutboundInvoiceListAdapter.getContext().getResources(), R.color.colorLowGreen, null);
            }
            OneFontTextView oneFontTextView = itemNadOutboundInvoiceListBinding.overDueDateItemTextView;
            if (Intrinsics.areEqual(item.getDueStatus(), OneNadOutboundActivity.DUE_STATUS_OVERDUE)) {
                string = oneFontTextView.getContext().getString(R.string.one_nad_outbound_over_due_date, item.getDaysFromDue());
            } else {
                string = oneFontTextView.getContext().getString(R.string.one_nad_outbound_up_coming_date, item.getDaysFromDue());
            }
            oneFontTextView.setText(string);
            oneFontTextView.setTextColor(color);
            itemNadOutboundInvoiceListBinding.paymentStatusItemTextView.setText(oneNadOutboundInvoiceListAdapter.getContext().getString(R.string.one_nad_outbound_over_not_pay));
        }

        @NotNull
        public final ItemNadOutboundInvoiceListBinding getBinding() {
            return this.f92265a;
        }
    }

    public OneNadOutboundInvoiceListAdapter(@NotNull ArrayList<OneNadOutboundInvoiceItem> list, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f92263a = list;
        this.f92264b = context;
    }

    @NotNull
    public final Context getContext() {
        return this.f92264b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92263a.size();
    }

    @NotNull
    public final ArrayList<OneNadOutboundInvoiceItem> getList() {
        return this.f92263a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f92263a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "list[position]");
        holder.bind((OneNadOutboundInvoiceItem) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemNadOutboundInvoiceListBinding inflate = ItemNadOutboundInvoiceListBinding.inflate(LayoutInflater.from(this.f92264b), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f…(context), parent, false)");
        return new ViewHolder(this, inflate);
    }
}