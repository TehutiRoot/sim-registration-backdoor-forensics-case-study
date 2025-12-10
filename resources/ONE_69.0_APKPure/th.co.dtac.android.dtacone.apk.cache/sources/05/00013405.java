package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.databinding.ItemNadOutboundListBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundListAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B;\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\n2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundListAdapter$ViewHolder;", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "Lkotlin/collections/ArrayList;", CollectionUtils.LIST_TYPE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "", "onSelectNadOutboundItem", "<init>", "(Ljava/util/ArrayList;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundListAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundListAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "getOnSelectNadOutboundItem", "()Lkotlin/jvm/functions/Function1;", "setOnSelectNadOutboundItem", "(Lkotlin/jvm/functions/Function1;)V", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundListAdapter */
/* loaded from: classes10.dex */
public final class OneNadOutboundListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ArrayList f92267a;

    /* renamed from: b */
    public final Context f92268b;

    /* renamed from: c */
    public Function1 f92269c;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundListBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundListAdapter;Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundListBinding;)V", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "item", "", "bind", "(Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundListBinding;", "getBinding", "()Lth/co/dtac/android/dtacone/databinding/ItemNadOutboundListBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundListAdapter$ViewHolder */
    /* loaded from: classes10.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ItemNadOutboundListBinding f92270a;

        /* renamed from: b */
        public final /* synthetic */ OneNadOutboundListAdapter f92271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull OneNadOutboundListAdapter oneNadOutboundListAdapter, ItemNadOutboundListBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f92271b = oneNadOutboundListAdapter;
            this.f92270a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m13383b(OneNadOutboundListAdapter oneNadOutboundListAdapter, OneNadOutboundBillingItem oneNadOutboundBillingItem, View view) {
            m13382c(oneNadOutboundListAdapter, oneNadOutboundBillingItem, view);
        }

        /* renamed from: c */
        public static final void m13382c(OneNadOutboundListAdapter this$0, OneNadOutboundBillingItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.getOnSelectNadOutboundItem().invoke(item);
        }

        public final void bind(@NotNull final OneNadOutboundBillingItem item) {
            Drawable drawable;
            String serviceId;
            String string;
            String string2;
            float f;
            int i;
            int color;
            String string3;
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.getContactStatus()) {
                drawable = ContextCompat.getDrawable(this.f92271b.getContext(), R.drawable.ic_icon_status_green);
            } else {
                drawable = ContextCompat.getDrawable(this.f92271b.getContext(), R.drawable.ic_icon_status_red);
            }
            ItemNadOutboundListBinding itemNadOutboundListBinding = this.f92270a;
            OneNadOutboundListAdapter oneNadOutboundListAdapter = this.f92271b;
            itemNadOutboundListBinding.contactStatusImageView.setImageDrawable(drawable);
            OneFontTextView oneFontTextView = itemNadOutboundListBinding.serviceNumberValueTextView;
            if (Intrinsics.areEqual(item.getProduct(), "MOBILE")) {
                serviceId = PhoneNumberExtKt.toPretty(item.getServiceId());
            } else {
                serviceId = item.getServiceId();
            }
            oneFontTextView.setText(serviceId);
            OneFontTextView oneFontTextView2 = itemNadOutboundListBinding.contactStatusItemTextView;
            if (item.getContactStatus()) {
                string = oneNadOutboundListAdapter.getContext().getString(R.string.one_nad_outbound_already_contacted_title);
            } else {
                string = oneNadOutboundListAdapter.getContext().getString(R.string.one_nad_outbound_have_not_contacted_yet_title);
            }
            oneFontTextView2.setText(string);
            itemNadOutboundListBinding.overdueBillItemTextView.setTextSize(12.0f);
            OneFontTextView oneFontTextView3 = itemNadOutboundListBinding.overdueBillValueItemTextView;
            if (Integer.parseInt(item.getUnpaidBillCount()) > 3) {
                string2 = oneNadOutboundListAdapter.getContext().getString(R.string.one_nad_outbound_over_due_more_than_tree_bill_count);
            } else {
                string2 = oneNadOutboundListAdapter.getContext().getString(R.string.one_nad_outbound_over_due_bill_count, item.getUnpaidBillCount());
            }
            oneFontTextView3.setText(string2);
            OneFontTextView oneFontTextView4 = itemNadOutboundListBinding.overdueBillValueItemTextView;
            if (Integer.parseInt(item.getUnpaidBillCount()) > 3) {
                f = 14.0f;
            } else {
                f = 16.0f;
            }
            oneFontTextView4.setTextSize(f);
            boolean areEqual = Intrinsics.areEqual(item.getDueStatus(), OneNadOutboundActivity.DUE_STATUS_OVERDUE);
            if (areEqual) {
                i = R.drawable.background_yellow_radius_corner_red_border;
            } else {
                i = R.drawable.background_yellow_radius_corner_yellow_border;
            }
            if (areEqual) {
                color = ResourcesCompat.getColor(oneNadOutboundListAdapter.getContext().getResources(), R.color.red5, null);
            } else {
                color = ResourcesCompat.getColor(oneNadOutboundListAdapter.getContext().getResources(), R.color.colorCreamy, null);
            }
            OneFontTextView oneFontTextView5 = itemNadOutboundListBinding.beforePaymentBillItemTextView;
            if (areEqual) {
                string3 = oneFontTextView5.getContext().getString(R.string.one_nad_outbound_select_overdue_title);
            } else {
                string3 = oneFontTextView5.getContext().getString(R.string.one_nad_outbound_select_before_due_date_title);
            }
            oneFontTextView5.setText(string3);
            oneFontTextView5.setTextColor(color);
            OneFontTextView oneFontTextView6 = itemNadOutboundListBinding.beforePaymentBillValueItemTextView;
            oneFontTextView6.setText(oneFontTextView6.getContext().getString(R.string.one_nad_outbound_over_due_bill_date, item.getDaysFromDue()));
            oneFontTextView6.setTextColor(color);
            itemNadOutboundListBinding.overdueBillLayout.setBackgroundResource(i);
            View view = this.itemView;
            final OneNadOutboundListAdapter oneNadOutboundListAdapter2 = this.f92271b;
            view.setOnClickListener(new View.OnClickListener() { // from class: AX0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OneNadOutboundListAdapter.ViewHolder.m13383b(OneNadOutboundListAdapter.this, item, view2);
                }
            });
        }

        @NotNull
        public final ItemNadOutboundListBinding getBinding() {
            return this.f92270a;
        }
    }

    public OneNadOutboundListAdapter(@NotNull ArrayList<OneNadOutboundBillingItem> list, @NotNull Context context, @NotNull Function1<? super OneNadOutboundBillingItem, Unit> onSelectNadOutboundItem) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSelectNadOutboundItem, "onSelectNadOutboundItem");
        this.f92267a = list;
        this.f92268b = context;
        this.f92269c = onSelectNadOutboundItem;
    }

    @NotNull
    public final Context getContext() {
        return this.f92268b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92267a.size();
    }

    @NotNull
    public final ArrayList<OneNadOutboundBillingItem> getList() {
        return this.f92267a;
    }

    @NotNull
    public final Function1<OneNadOutboundBillingItem, Unit> getOnSelectNadOutboundItem() {
        return this.f92269c;
    }

    public final void setOnSelectNadOutboundItem(@NotNull Function1<? super OneNadOutboundBillingItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f92269c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f92267a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "list[position]");
        holder.bind((OneNadOutboundBillingItem) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemNadOutboundListBinding inflate = ItemNadOutboundListBinding.inflate(LayoutInflater.from(this.f92268b), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f…(context), parent, false)");
        return new ViewHolder(this, inflate);
    }
}