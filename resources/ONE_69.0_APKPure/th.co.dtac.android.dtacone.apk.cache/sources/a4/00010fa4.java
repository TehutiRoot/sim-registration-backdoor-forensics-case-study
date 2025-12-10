package th.p047co.dtac.android.dtacone.adapter.mrtr_postpaid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.mrtr_postpaid.ServiceMenuAdapter;
import th.p047co.dtac.android.dtacone.model.customerenquiry.ServiceList;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid/ServiceMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid/ServiceMenuAdapter$ViewHolder;", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/ServiceList;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "serviceList", "setNewServiceList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid/ServiceMenuAdapter$ViewHolder;", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid/ServiceMenuAdapter$ViewHolder;I)V", "getItemCount", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_postpaid.ServiceMenuAdapter */
/* loaded from: classes7.dex */
public final class ServiceMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public List f81351a;

    /* renamed from: b */
    public final Function1 f81352b;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/mrtr_postpaid/ServiceMenuAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindView", "", NotificationCompat.CATEGORY_SERVICE, "Lth/co/dtac/android/dtacone/model/customerenquiry/ServiceList;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.mrtr_postpaid.ServiceMenuAdapter$ViewHolder */
    /* loaded from: classes7.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* renamed from: b */
        public static /* synthetic */ void m20521b(Function1 function1, ServiceList serviceList, View view) {
            m20520c(function1, serviceList, view);
        }

        /* renamed from: c */
        public static final void m20520c(Function1 listener, ServiceList service, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(service, "$service");
            listener.invoke(service.getScreenCode());
        }

        public final void bindView(@NotNull final ServiceList service, @NotNull final Function1<? super String, Unit> listener) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View view = this.itemView;
            View findViewById = view.findViewById(R.id.ivServiceImage);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.ivServiceImage)");
            View findViewById2 = view.findViewById(R.id.tvServiceName);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.tvServiceName)");
            ((ImageView) findViewById).setImageResource(service.getServiceIcon());
            ((DtacFontTextView) findViewById2).setText(this.itemView.getContext().getString(service.getServiceListName()));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: eH1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ServiceMenuAdapter.ViewHolder.m20521b(Function1.this, service, view2);
                }
            });
        }
    }

    public ServiceMenuAdapter(@NotNull List<ServiceList> items, @NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81351a = items;
        this.f81352b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81351a.size();
    }

    public final void setNewServiceList(@NotNull List<ServiceList> serviceList) {
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        this.f81351a = serviceList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((ServiceList) this.f81351a.get(i), this.f81352b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_service_postpaid_validation, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}