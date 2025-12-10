package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.customerenquiry.ServiceList;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.ServiceListAdapter;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B3\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ServiceListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ServiceListAdapter$ViewHolder;", "", "idLayout", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/ServiceList;", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ServiceListAdapter$ViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ServiceListAdapter$ViewHolder;I)V", "serviceList", "setNewServiceList", "(Ljava/util/List;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIdLayout", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "ViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.ServiceListAdapter */
/* loaded from: classes9.dex */
public final class ServiceListAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f99536a;

    /* renamed from: b */
    public List f99537b;

    /* renamed from: c */
    public final Function1 f99538c;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/customerenquiry/ServiceListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindView", "", NotificationCompat.CATEGORY_SERVICE, "Lth/co/dtac/android/dtacone/model/customerenquiry/ServiceList;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.ServiceListAdapter$ViewHolder */
    /* loaded from: classes9.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* renamed from: d */
        public static final void m8325d(Function1 listener, ServiceList service, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(service, "$service");
            listener.invoke(service.getScreenCode());
        }

        /* renamed from: e */
        public static final void m8324e(Function1 listener, ServiceList service, View view) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(service, "$service");
            listener.invoke(service.getScreenCode());
        }

        public final void bindView(@NotNull final ServiceList service, @NotNull final Function1<? super String, Unit> listener) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View view = this.itemView;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) view.findViewById(R.id.ServiceLabel);
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) view.findViewById(R.id.NumberContract);
            ImageView imageView = (ImageView) view.findViewById(R.id.arrow);
            ((ImageView) view.findViewById(R.id.ServiceIcon)).setImageResource(service.getServiceIcon());
            if (!service.isActive()) {
                imageView.setVisibility(4);
                dtacFontTextView.setEnabled(false);
                dtacFontTextView.setOnClickListener(null);
                this.itemView.setOnClickListener(null);
            } else {
                imageView.setVisibility(0);
                dtacFontTextView.setEnabled(true);
                dtacFontTextView.setOnClickListener(new View.OnClickListener() { // from class: cH1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ServiceListAdapter.ViewHolder.m8325d(listener, service, view2);
                    }
                });
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: dH1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ServiceListAdapter.ViewHolder.m8324e(listener, service, view2);
                    }
                });
            }
            dtacFontTextView.setText(this.itemView.getContext().getString(service.getServiceListName()));
            if (Intrinsics.areEqual(service.getScreenCode(), PermissionConstant.M_SALE_ORDR)) {
                dtacFontTextView2.setVisibility(0);
                int numberContract = service.getNumberContract();
                int oneIdXDeviceMax = service.getOneIdXDeviceMax();
                dtacFontTextView2.setText(numberContract + RemoteSettings.FORWARD_SLASH_STRING + oneIdXDeviceMax);
                if (service.getNumberContract() == 0) {
                    dtacFontTextView2.setBackgroundResource(R.drawable.background_gray_fulfill_rounded);
                    return;
                } else if (service.getNumberContract() > 0 && service.getNumberContract() < service.getOneIdXDeviceMax()) {
                    dtacFontTextView2.setBackgroundResource(R.drawable.background_gray_fulfill_rounded);
                    return;
                } else if (service.getNumberContract() >= service.getOneIdXDeviceMax()) {
                    dtacFontTextView2.setBackgroundResource(R.drawable.background_gray_fulfill_rounded);
                    return;
                } else {
                    return;
                }
            }
            dtacFontTextView2.setVisibility(4);
        }
    }

    public ServiceListAdapter(@LayoutRes int i, @NotNull List<ServiceList> items, @NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f99536a = i;
        this.f99537b = items;
        this.f99538c = listener;
    }

    public final int getIdLayout() {
        return this.f99536a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f99537b.size();
    }

    public final void setNewServiceList(@NotNull List<ServiceList> serviceList) {
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        this.f99537b = serviceList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView((ServiceList) this.f99537b.get(i), this.f99538c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f99536a, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }
}