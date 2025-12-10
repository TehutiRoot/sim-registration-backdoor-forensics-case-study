package th.p047co.dtac.android.dtacone.adapter.customer_enquiry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummaryInfoAdapter;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.customerenquiry.ContractItem;
import th.p047co.dtac.android.dtacone.model.customerenquiry.InfoItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "itemList", "", "isSamesub", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$Listener;", "listinner", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$Listener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Boolean;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$Listener;", "Listener", "ViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummaryInfoAdapter */
/* loaded from: classes7.dex */
public final class DeviceSummaryInfoAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f81112a;

    /* renamed from: b */
    public final Boolean f81113b;

    /* renamed from: c */
    public final Listener f81114c;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$Listener;", "", "onClickDeviceExtendContract", "", "contractItem", "Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummaryInfoAdapter$Listener */
    /* loaded from: classes7.dex */
    public interface Listener {
        void onClickDeviceExtendContract(@NotNull ContractItem contractItem);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "", "position", "Lth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;", "contractItem", "", "isSamesub", "Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "bind", "(ILth/co/dtac/android/dtacone/model/customerenquiry/ContractItem;Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/adapter/customer_enquiry/DeviceSummaryInfoAdapter$Listener;)V", "Landroid/content/Context;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "line", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvSubscriberNo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "d", "Landroidx/constraintlayout/widget/ConstraintLayout;", "buttonDeviceExtendContract", "e", "tvExtendContract", "Landroid/widget/ImageView;", OperatorName.FILL_NON_ZERO, "Landroid/widget/ImageView;", "imAdd", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.NON_STROKING_GRAY, "Landroidx/recyclerview/widget/RecyclerView;", "rvSubContract", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.customer_enquiry.DeviceSummaryInfoAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Context f81115a;

        /* renamed from: b */
        public final View f81116b;

        /* renamed from: c */
        public final DtacFontTextView f81117c;

        /* renamed from: d */
        public final ConstraintLayout f81118d;

        /* renamed from: e */
        public final DtacFontTextView f81119e;

        /* renamed from: f */
        public final ImageView f81120f;

        /* renamed from: g */
        public final RecyclerView f81121g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            this.f81115a = context;
            View findViewById = itemView.findViewById(R.id.line);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.line)");
            this.f81116b = findViewById;
            View findViewById2 = itemView.findViewById(R.id.tvSubscriberNo);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.tvSubscriberNo)");
            this.f81117c = (DtacFontTextView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.buttonDeviceExtendContract);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.…ttonDeviceExtendContract)");
            this.f81118d = (ConstraintLayout) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.tvExtendContract);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.tvExtendContract)");
            this.f81119e = (DtacFontTextView) findViewById4;
            View findViewById5 = itemView.findViewById(R.id.imAdd);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.imAdd)");
            this.f81120f = (ImageView) findViewById5;
            View findViewById6 = itemView.findViewById(R.id.rvSubContract);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.rvSubContract)");
            this.f81121g = (RecyclerView) findViewById6;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20394b(Listener listener, ContractItem contractItem, View view) {
            m20393c(listener, contractItem, view);
        }

        public static /* synthetic */ void bind$default(ViewHolder viewHolder, int i, ContractItem contractItem, Boolean bool, Listener listener, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                bool = Boolean.FALSE;
            }
            viewHolder.bind(i, contractItem, bool, listener);
        }

        /* renamed from: c */
        public static final void m20393c(Listener listener, ContractItem contractItem, View view) {
            Intrinsics.checkNotNullParameter(contractItem, "$contractItem");
            if (listener != null) {
                listener.onClickDeviceExtendContract(contractItem);
            }
        }

        public final void bind(int i, @NotNull final ContractItem contractItem, @Nullable Boolean bool, @Nullable final Listener listener) {
            Intrinsics.checkNotNullParameter(contractItem, "contractItem");
            if (i == 0) {
                ViewVisibleExtKt.toGone(this.f81116b);
            } else {
                ViewVisibleExtKt.toVisible(this.f81116b);
            }
            String str = null;
            if (i == 0 && Intrinsics.areEqual(bool, Boolean.TRUE)) {
                ViewVisibleExtKt.toVisible(this.f81118d);
                if (Intrinsics.areEqual(contractItem.getAllowExtendFlag(), "Y")) {
                    this.f81118d.setEnabled(true);
                    this.f81118d.setOnClickListener(new View.OnClickListener() { // from class: LI
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DeviceSummaryInfoAdapter.ViewHolder.m20394b(listener, contractItem, view);
                        }
                    });
                    this.f81119e.setTextColor(ResourcesCompat.getColor(this.f81115a.getResources(), R.color.white, null));
                    this.f81120f.setImageResource(R.drawable.icon_add);
                } else {
                    this.f81118d.setEnabled(false);
                    this.f81118d.setOnClickListener(null);
                    this.f81120f.setImageResource(R.drawable.icon_add_grey);
                    this.f81119e.setTextColor(ResourcesCompat.getColor(this.f81115a.getResources(), R.color.warmGrey, null));
                }
            } else {
                ViewVisibleExtKt.toGone(this.f81118d);
            }
            DtacFontTextView dtacFontTextView = this.f81117c;
            String subscriberNo = contractItem.getSubscriberNo();
            if (subscriberNo != null) {
                str = PhoneNumberExtKt.toPretty(subscriberNo);
            }
            dtacFontTextView.setText(str);
            List<InfoItem> info = contractItem.getInfo();
            if (info != null) {
                RecyclerView recyclerView = this.f81121g;
                recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
                recyclerView.setNestedScrollingEnabled(false);
                this.f81121g.setAdapter(new DeviceSummarySubInfoAdapter(info));
            }
        }
    }

    public /* synthetic */ DeviceSummaryInfoAdapter(List list, Boolean bool, Listener listener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? null : listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81112a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i, (ContractItem) this.f81112a.get(i), this.f81113b, this.f81114c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_device_summary, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    public DeviceSummaryInfoAdapter(@NotNull List<ContractItem> itemList, @Nullable Boolean bool, @Nullable Listener listener) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        this.f81112a = itemList;
        this.f81113b = bool;
        this.f81114c = listener;
    }
}
