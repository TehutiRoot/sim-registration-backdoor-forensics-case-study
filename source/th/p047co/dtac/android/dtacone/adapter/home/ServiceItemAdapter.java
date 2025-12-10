package th.p047co.dtac.android.dtacone.adapter.home;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.home.ServiceItemAdapter;
import th.p047co.dtac.android.dtacone.model.home.groupService.HomeExtKt;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupItemItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003%&'B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupItemItem;", "itemServiceList", "<init>", "(Landroid/app/Activity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$OnClickServiceItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$OnClickServiceItem;)V", "resource", "Landroid/widget/ImageView;", "ivImageBanner", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILandroid/widget/ImageView;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", "Ljava/util/List;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$OnClickServiceItem;", "Companion", "ItemServiceItemViewHolder", "OnClickServiceItem", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.home.ServiceItemAdapter */
/* loaded from: classes7.dex */
public final class ServiceItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f81212a;

    /* renamed from: b */
    public final List f81213b;

    /* renamed from: c */
    public OnClickServiceItem f81214c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$Companion;", "", "()V", "VIEW_TYPE_NORMAL", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.home.ServiceItemAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$ItemServiceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter;Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/RelativeLayout;", "getLayoutServiceItem", "()Landroid/widget/RelativeLayout;", "layoutServiceItem", "Landroid/widget/ImageView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/ImageView;", "getIvServiceImage", "()Landroid/widget/ImageView;", "ivServiceImage", "Landroid/widget/TextView;", OperatorName.CURVE_TO, "Landroid/widget/TextView;", "getTvServiceName", "()Landroid/widget/TextView;", "tvServiceName", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.home.ServiceItemAdapter$ItemServiceItemViewHolder */
    /* loaded from: classes7.dex */
    public final class ItemServiceItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RelativeLayout f81215a;

        /* renamed from: b */
        public final ImageView f81216b;

        /* renamed from: c */
        public final TextView f81217c;

        /* renamed from: d */
        public final /* synthetic */ ServiceItemAdapter f81218d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemServiceItemViewHolder(@NotNull ServiceItemAdapter serviceItemAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81218d = serviceItemAdapter;
            View findViewById = view.findViewById(R.id.layoutServiceItem);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            this.f81215a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.ivServiceImage);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f81216b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvServiceName);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f81217c = (TextView) findViewById3;
        }

        @NotNull
        public final ImageView getIvServiceImage() {
            return this.f81216b;
        }

        @NotNull
        public final RelativeLayout getLayoutServiceItem() {
            return this.f81215a;
        }

        @NotNull
        public final TextView getTvServiceName() {
            return this.f81217c;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$OnClickServiceItem;", "", "onClickServiceItem", "", "groupItem", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupItemItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.home.ServiceItemAdapter$OnClickServiceItem */
    /* loaded from: classes7.dex */
    public interface OnClickServiceItem {
        void onClickServiceItem(@NotNull GroupItemItem groupItemItem);
    }

    @Inject
    public ServiceItemAdapter(@NotNull Activity activity, @NotNull List<GroupItemItem> itemServiceList) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(itemServiceList, "itemServiceList");
        this.f81212a = activity;
        this.f81213b = itemServiceList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20361a(OnClickServiceItem onClickServiceItem, GroupItemItem groupItemItem, View view) {
        m20359c(onClickServiceItem, groupItemItem, view);
    }

    /* renamed from: c */
    public static final void m20359c(OnClickServiceItem theListener, GroupItemItem itemServiceItem, View view) {
        Intrinsics.checkNotNullParameter(theListener, "$theListener");
        Intrinsics.checkNotNullParameter(itemServiceItem, "$itemServiceItem");
        theListener.onClickServiceItem(itemServiceItem);
    }

    /* renamed from: b */
    public final void m20360b(int i, ImageView imageView) {
        Glide.with(this.f81212a).clear(imageView);
        Glide.with(this.f81212a).m74043load(Integer.valueOf(i)).skipMemoryCache(true).error(ContextCompat.getDrawable(this.f81212a, R.drawable.image_default)).diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81213b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final GroupItemItem groupItemItem = (GroupItemItem) this.f81213b.get(i);
        if (holder instanceof ItemServiceItemViewHolder) {
            ItemServiceItemViewHolder itemServiceItemViewHolder = (ItemServiceItemViewHolder) holder;
            itemServiceItemViewHolder.getTvServiceName().setText(groupItemItem.getFeatureName());
            m20360b(HomeExtKt.getHomeIconImage(groupItemItem.getFeatureCode()), itemServiceItemViewHolder.getIvServiceImage());
            final OnClickServiceItem onClickServiceItem = this.f81214c;
            if (onClickServiceItem != null) {
                itemServiceItemViewHolder.getLayoutServiceItem().setOnClickListener(new View.OnClickListener() { // from class: eG1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ServiceItemAdapter.m20361a(onClickServiceItem, groupItemItem, view);
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        View view = LayoutInflater.from(this.f81212a).inflate(R.layout.item_service_item, p0, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ItemServiceItemViewHolder(this, view);
    }

    public final void setListener(@NotNull OnClickServiceItem listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f81214c = listener;
    }
}
