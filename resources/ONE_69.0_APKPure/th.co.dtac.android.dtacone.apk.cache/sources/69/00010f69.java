package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.SubscriberListItemAdapter;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.SubscriberStatus;
import th.p047co.dtac.android.dtacone.model.customerenquiry.SubscriberListModel;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberListItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberListItemAdapter$SubscriberItemViewHolder;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberListModel;", CollectionUtils.LIST_TYPE, "Lkotlin/Function1;", "", "", "onSelect", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberListItemAdapter$SubscriberItemViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberListItemAdapter$SubscriberItemViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "SubscriberItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.SubscriberListItemAdapter */
/* loaded from: classes7.dex */
public final class SubscriberListItemAdapter extends RecyclerView.Adapter<SubscriberItemViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f81247a;

    /* renamed from: b */
    public final Function1 f81248b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/SubscriberListItemAdapter$SubscriberItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberListModel;", "item", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "(Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberListModel;Lkotlin/jvm/functions/Function1;)V", "d", "(Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberListModel;)V", "e", "(Landroid/view/View;Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberListModel;)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.SubscriberListItemAdapter$SubscriberItemViewHolder */
    /* loaded from: classes7.dex */
    public static final class SubscriberItemViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubscriberItemViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* renamed from: b */
        public static /* synthetic */ void m20556b(Function1 function1, SubscriberListModel subscriberListModel, View view) {
            m20555c(function1, subscriberListModel, view);
        }

        /* renamed from: c */
        public static final void m20555c(Function1 listener, SubscriberListModel item, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(item, "$item");
            listener.invoke(item.getSubscriberNumber());
        }

        public final void bind(@NotNull final SubscriberListModel item, @NotNull final Function1<? super String, Unit> listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View bind$lambda$1 = this.itemView;
            ((DtacFontTextView) bind$lambda$1.findViewById(R.id.textViewSubscriberNumber)).setText(StringExtKt.maskText(StringExtKt.subscriberToPrefix0(item.getSubscriberNumber()), Constant.PHONE_FORMAT));
            ((DtacFontTextView) this.itemView.findViewById(R.id.textViewName)).setText(item.getName());
            ((DtacFontTextView) this.itemView.findViewById(R.id.textViewAOU)).setText(item.getAouText());
            bind$lambda$1.setOnClickListener(new View.OnClickListener() { // from class: IP1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubscriberListItemAdapter.SubscriberItemViewHolder.m20556b(Function1.this, item, view);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bind$lambda$1, "bind$lambda$1");
            m20553e(bind$lambda$1, item);
            m20554d(item);
        }

        /* renamed from: d */
        public final void m20554d(SubscriberListModel subscriberListModel) {
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.statusIndicator);
            if (Intrinsics.areEqual(subscriberListModel.getStatus(), SubscriberStatus.ACTIVE.getStatus())) {
                imageView.setImageResource(R.drawable.circle_green);
            } else {
                imageView.setImageResource(R.drawable.circle_yellow);
            }
        }

        /* renamed from: e */
        public final void m20553e(View view, SubscriberListModel subscriberListModel) {
            DtacFontTextView textViewContractDay = (DtacFontTextView) this.itemView.findViewById(R.id.textViewContractDay);
            if (subscriberListModel.getContractEndDay() != 0) {
                Intrinsics.checkNotNullExpressionValue(textViewContractDay, "textViewContractDay");
                ViewVisibleExtKt.toVisible(textViewContractDay);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = view.getContext().getString(R.string.advisory_enquiry_customer_end_contract_day);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ustomer_end_contract_day)");
                String format = String.format(string, Arrays.copyOf(new Object[]{StringExtKt.formatMoneyNoDecimal(String.valueOf(subscriberListModel.getContractEndDay()))}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textViewContractDay.setText(format);
                return;
            }
            textViewContractDay.toInvisible();
            textViewContractDay.setText("");
        }
    }

    public SubscriberListItemAdapter(@NotNull List<SubscriberListModel> list, @NotNull Function1<? super String, Unit> onSelect) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        this.f81247a = list;
        this.f81248b = onSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81247a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SubscriberItemViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((SubscriberListModel) this.f81247a.get(i), this.f81248b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SubscriberItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_subscriber_list_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new SubscriberItemViewHolder(view);
    }
}