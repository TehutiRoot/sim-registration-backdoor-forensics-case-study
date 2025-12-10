package th.p047co.dtac.android.dtacone.adapter.withDevice;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
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
import th.p047co.dtac.android.dtacone.adapter.withDevice.WithDeviceCampaignAdapter;
import th.p047co.dtac.android.dtacone.model.withDevice.validateImei.response.CampaignItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$#%B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/withDevice/validateImei/response/CampaignItem;", "listCampaign", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter$OnClickCampaign;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter$OnClickCampaign;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter$OnClickCampaign;", "Companion", "CampaignItemViewHolder", "OnClickCampaign", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.withDevice.WithDeviceCampaignAdapter */
/* loaded from: classes7.dex */
public final class WithDeviceCampaignAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f81562a;

    /* renamed from: b */
    public final List f81563b;

    /* renamed from: c */
    public OnClickCampaign f81564c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter$CampaignItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutCampaignItem", "()Landroid/widget/RelativeLayout;", "layoutCampaignItem", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "getTvCampaignName", "()Landroid/widget/TextView;", "tvCampaignName", OperatorName.CURVE_TO, "Landroid/view/View;", "getVLineSeparate", "()Landroid/view/View;", "vLineSeparate", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.withDevice.WithDeviceCampaignAdapter$CampaignItemViewHolder */
    /* loaded from: classes7.dex */
    public final class CampaignItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81565a;

        /* renamed from: b */
        public final TextView f81566b;

        /* renamed from: c */
        public final View f81567c;

        /* renamed from: d */
        public final /* synthetic */ WithDeviceCampaignAdapter f81568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CampaignItemViewHolder(@NotNull WithDeviceCampaignAdapter withDeviceCampaignAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81568d = withDeviceCampaignAdapter;
            View findViewById = view.findViewById(R.id.layoutCampaignItem);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81565a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvCampaignName);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f81566b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.vLineSeparate);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.view.View");
            this.f81567c = findViewById3;
        }

        @NotNull
        public final RelativeLayout getLayoutCampaignItem() {
            return this.f81565a;
        }

        @NotNull
        public final TextView getTvCampaignName() {
            return this.f81566b;
        }

        @NotNull
        public final View getVLineSeparate() {
            return this.f81567c;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.withDevice.WithDeviceCampaignAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/withDevice/WithDeviceCampaignAdapter$OnClickCampaign;", "", "onClickCampaignItem", "", "campaign", "Lth/co/dtac/android/dtacone/model/withDevice/validateImei/response/CampaignItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.withDevice.WithDeviceCampaignAdapter$OnClickCampaign */
    /* loaded from: classes7.dex */
    public interface OnClickCampaign {
        void onClickCampaignItem(@NotNull CampaignItem campaignItem);
    }

    public WithDeviceCampaignAdapter(@NotNull Activity activity, @Nullable List<CampaignItem> list) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81562a = activity;
        this.f81563b = list;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20191a(OnClickCampaign onClickCampaign, CampaignItem campaignItem, View view) {
        m20190b(onClickCampaign, campaignItem, view);
    }

    /* renamed from: b */
    public static final void m20190b(OnClickCampaign theListener, CampaignItem campaign, View view) {
        Intrinsics.checkNotNullParameter(theListener, "$theListener");
        Intrinsics.checkNotNullParameter(campaign, "$campaign");
        theListener.onClickCampaignItem(campaign);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81563b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f81563b;
        Intrinsics.checkNotNull(list);
        final CampaignItem campaignItem = (CampaignItem) list.get(i);
        if (holder instanceof CampaignItemViewHolder) {
            CampaignItemViewHolder campaignItemViewHolder = (CampaignItemViewHolder) holder;
            campaignItemViewHolder.getTvCampaignName().setText(campaignItem.getCampaignName());
            final OnClickCampaign onClickCampaign = this.f81564c;
            if (onClickCampaign != null) {
                campaignItemViewHolder.getLayoutCampaignItem().setOnClickListener(new View.OnClickListener() { // from class: t52
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WithDeviceCampaignAdapter.m20191a(onClickCampaign, campaignItem, view);
                    }
                });
            }
            View vLineSeparate = campaignItemViewHolder.getVLineSeparate();
            if (i == this.f81563b.size() - 1) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            vLineSeparate.setVisibility(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(this.f81562a).inflate(R.layout.item_with_device_campaign, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new CampaignItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickCampaign listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81564c = listener;
    }
}
