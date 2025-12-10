package th.p047co.dtac.android.dtacone.adapter.home;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.home.ServiceItemAdapter;
import th.p047co.dtac.android.dtacone.decorator.DynamicVerticalGridItemDecorator;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupItemItem;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003,-.B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\u00182\n\u0010\u0017\u001a\u00060\u001bR\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$OnClickServiceItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupServiceItem;", "groupServiceList", "<init>", "(Landroid/app/Activity;Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$OnClickServiceItem;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter$GroupServiceItemViewHolder;", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupItemItem;", "serviceItemList", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter$GroupServiceItemViewHolder;Ljava/util/List;)V", "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter$OnClickServiceItem;", OperatorName.CURVE_TO, "Ljava/util/List;", "Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter;", "adapter", "Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter;", "getAdapter", "()Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter;", "setAdapter", "(Lth/co/dtac/android/dtacone/adapter/home/ServiceItemAdapter;)V", "Companion", "GroupServiceItemViewHolder", "HeaderServiceItemViewHolder", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGroupServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupServiceAdapter.kt\nth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n766#2:86\n857#2,2:87\n*S KotlinDebug\n*F\n+ 1 GroupServiceAdapter.kt\nth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter\n*L\n57#1:86\n57#1:87,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.adapter.home.GroupServiceAdapter */
/* loaded from: classes7.dex */
public final class GroupServiceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final Activity f81202a;
    public ServiceItemAdapter adapter;

    /* renamed from: b */
    public final ServiceItemAdapter.OnClickServiceItem f81203b;

    /* renamed from: c */
    public final List f81204c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter$Companion;", "", "()V", "VIEW_TYPE_GROUP_ITEM", "", "VIEW_TYPE_HEADER", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.adapter.home.GroupServiceAdapter$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter$GroupServiceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter;Landroid/view/View;)V", "Landroidx/recyclerview/widget/RecyclerView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewService", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerViewService", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.home.GroupServiceAdapter$GroupServiceItemViewHolder */
    /* loaded from: classes7.dex */
    public final class GroupServiceItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RecyclerView f81205a;

        /* renamed from: b */
        public final /* synthetic */ GroupServiceAdapter f81206b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupServiceItemViewHolder(@NotNull GroupServiceAdapter groupServiceAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81206b = groupServiceAdapter;
            View findViewById = view.findViewById(R.id.recyclerViewService);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            this.f81205a = (RecyclerView) findViewById;
        }

        @NotNull
        public final RecyclerView getRecyclerViewService() {
            return this.f81205a;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter$HeaderServiceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/adapter/home/GroupServiceAdapter;Landroid/view/View;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvGroupServiceTitle", "()Landroid/widget/TextView;", "tvGroupServiceTitle", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.home.GroupServiceAdapter$HeaderServiceItemViewHolder */
    /* loaded from: classes7.dex */
    public final class HeaderServiceItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f81207a;

        /* renamed from: b */
        public final /* synthetic */ GroupServiceAdapter f81208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderServiceItemViewHolder(@NotNull GroupServiceAdapter groupServiceAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f81208b = groupServiceAdapter;
            View findViewById = view.findViewById(R.id.tvGroupServiceTitle);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f81207a = (TextView) findViewById;
        }

        @NotNull
        public final TextView getTvGroupServiceTitle() {
            return this.f81207a;
        }
    }

    @Inject
    public GroupServiceAdapter(@NotNull Activity activity, @NotNull ServiceItemAdapter.OnClickServiceItem listener, @NotNull List<GroupServiceItem> groupServiceList) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(groupServiceList, "groupServiceList");
        this.f81202a = activity;
        this.f81203b = listener;
        this.f81204c = groupServiceList;
    }

    /* renamed from: a */
    public final void m20362a(GroupServiceItemViewHolder groupServiceItemViewHolder, List list) {
        setAdapter(new ServiceItemAdapter(this.f81202a, list));
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this.f81202a, 3, 1, false);
        DynamicVerticalGridItemDecorator dynamicVerticalGridItemDecorator = new DynamicVerticalGridItemDecorator(this.f81202a, 3, 8, 8, 16);
        while (groupServiceItemViewHolder.getRecyclerViewService().getItemDecorationCount() > 0) {
            groupServiceItemViewHolder.getRecyclerViewService().removeItemDecorationAt(0);
        }
        groupServiceItemViewHolder.getRecyclerViewService().addItemDecoration(dynamicVerticalGridItemDecorator);
        groupServiceItemViewHolder.getRecyclerViewService().setLayoutManager(gridLayoutManager);
        groupServiceItemViewHolder.getRecyclerViewService().setHasFixedSize(true);
        groupServiceItemViewHolder.getRecyclerViewService().setNestedScrollingEnabled(false);
        groupServiceItemViewHolder.getRecyclerViewService().setAdapter(getAdapter());
        getAdapter().setListener(this.f81203b);
    }

    @NotNull
    public final ServiceItemAdapter getAdapter() {
        ServiceItemAdapter serviceItemAdapter = this.adapter;
        if (serviceItemAdapter != null) {
            return serviceItemAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81204c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i % 2 == 0) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(holder, "holder");
        GroupServiceItem groupServiceItem = (GroupServiceItem) this.f81204c.get(i);
        if (holder instanceof HeaderServiceItemViewHolder) {
            ((HeaderServiceItemViewHolder) holder).getTvGroupServiceTitle().setText(groupServiceItem.getTitle());
        } else if (holder instanceof GroupServiceItemViewHolder) {
            GroupServiceItemViewHolder groupServiceItemViewHolder = (GroupServiceItemViewHolder) holder;
            ArrayList<GroupItemItem> groupItem = groupServiceItem.getGroupItem();
            if (groupItem != null) {
                arrayList = new ArrayList();
                for (Object obj : groupItem) {
                    if (Intrinsics.areEqual(((GroupItemItem) obj).getAllow(), "Y")) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            m20362a(groupServiceItemViewHolder, arrayList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        if (getItemViewType(i) == 0) {
            View view = LayoutInflater.from(this.f81202a).inflate(R.layout.item_header_service, p0, false);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            return new HeaderServiceItemViewHolder(this, view);
        }
        View view2 = LayoutInflater.from(this.f81202a).inflate(R.layout.item_group_service, p0, false);
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        return new GroupServiceItemViewHolder(this, view2);
    }

    public final void setAdapter(@NotNull ServiceItemAdapter serviceItemAdapter) {
        Intrinsics.checkNotNullParameter(serviceItemAdapter, "<set-?>");
        this.adapter = serviceItemAdapter;
    }
}
