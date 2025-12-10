package th.p047co.dtac.android.dtacone.view.appOne.home.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.decorator.DynamicVerticalGridItemDecorator;
import th.p047co.dtac.android.dtacone.model.home.OneHomeThemeColorModel;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupItemItem;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;
import th.p047co.dtac.android.dtacone.view.appOne.home.adapter.OneServiceItemAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u00020\u001a2\n\u0010\u0018\u001a\u00060\u001dR\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupServiceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneServiceItemAdapter$OnClickServiceItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupServiceItem;", "groupServiceList", "", "xCompany", "Lth/co/dtac/android/dtacone/model/home/OneHomeThemeColorModel;", "oneHomeThemeColorModel", "<init>", "(Landroid/app/Activity;Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneServiceItemAdapter$OnClickServiceItem;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/home/OneHomeThemeColorModel;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupServiceAdapter$GroupServiceItemViewHolder;", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupItemItem;", "serviceItemList", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupServiceAdapter$GroupServiceItemViewHolder;Ljava/util/List;)V", "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneServiceItemAdapter$OnClickServiceItem;", OperatorName.CURVE_TO, "Ljava/util/List;", "d", "Ljava/lang/String;", "e", "Lth/co/dtac/android/dtacone/model/home/OneHomeThemeColorModel;", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneServiceItemAdapter;", "adapter", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneServiceItemAdapter;", "getAdapter", "()Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneServiceItemAdapter;", "setAdapter", "(Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneServiceItemAdapter;)V", "GroupServiceItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneGroupServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneGroupServiceAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupServiceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n766#2:75\n857#2,2:76\n*S KotlinDebug\n*F\n+ 1 OneGroupServiceAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupServiceAdapter\n*L\n47#1:75\n47#1:76,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.adapter.OneGroupServiceAdapter */
/* loaded from: classes10.dex */
public final class OneGroupServiceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f91040a;
    public OneServiceItemAdapter adapter;

    /* renamed from: b */
    public final OneServiceItemAdapter.OnClickServiceItem f91041b;

    /* renamed from: c */
    public final List f91042c;

    /* renamed from: d */
    public final String f91043d;

    /* renamed from: e */
    public final OneHomeThemeColorModel f91044e;

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupServiceAdapter$GroupServiceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupServiceAdapter;Landroid/view/View;)V", "Landroid/widget/TextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/TextView;", "getTvGroupServiceTitle", "()Landroid/widget/TextView;", "tvGroupServiceTitle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "getVHeaderTheme", "()Landroid/view/View;", "vHeaderTheme", OperatorName.CURVE_TO, "getLayoutGroupService", "layoutGroupService", "Landroidx/recyclerview/widget/RecyclerView;", "d", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewService", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerViewService", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.home.adapter.OneGroupServiceAdapter$GroupServiceItemViewHolder */
    /* loaded from: classes10.dex */
    public final class GroupServiceItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f91045a;

        /* renamed from: b */
        public final View f91046b;

        /* renamed from: c */
        public final View f91047c;

        /* renamed from: d */
        public final RecyclerView f91048d;

        /* renamed from: e */
        public final /* synthetic */ OneGroupServiceAdapter f91049e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupServiceItemViewHolder(@NotNull OneGroupServiceAdapter oneGroupServiceAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f91049e = oneGroupServiceAdapter;
            View findViewById = view.findViewById(R.id.tvGroupServiceTitle);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f91045a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.vHeaderTheme);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.view.View");
            this.f91046b = findViewById2;
            View findViewById3 = view.findViewById(R.id.layoutGroupService);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f91047c = (LinearLayoutCompat) findViewById3;
            View findViewById4 = view.findViewById(R.id.recyclerViewService);
            Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            this.f91048d = (RecyclerView) findViewById4;
        }

        @NotNull
        public final View getLayoutGroupService() {
            return this.f91047c;
        }

        @NotNull
        public final RecyclerView getRecyclerViewService() {
            return this.f91048d;
        }

        @NotNull
        public final TextView getTvGroupServiceTitle() {
            return this.f91045a;
        }

        @NotNull
        public final View getVHeaderTheme() {
            return this.f91046b;
        }
    }

    @Inject
    public OneGroupServiceAdapter(@NotNull Activity activity, @NotNull OneServiceItemAdapter.OnClickServiceItem listener, @NotNull List<GroupServiceItem> groupServiceList, @NotNull String xCompany, @NotNull OneHomeThemeColorModel oneHomeThemeColorModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(groupServiceList, "groupServiceList");
        Intrinsics.checkNotNullParameter(xCompany, "xCompany");
        Intrinsics.checkNotNullParameter(oneHomeThemeColorModel, "oneHomeThemeColorModel");
        this.f91040a = activity;
        this.f91041b = listener;
        this.f91042c = groupServiceList;
        this.f91043d = xCompany;
        this.f91044e = oneHomeThemeColorModel;
    }

    /* renamed from: a */
    public final void m14268a(GroupServiceItemViewHolder groupServiceItemViewHolder, List list) {
        setAdapter(new OneServiceItemAdapter(this.f91040a, list, this.f91043d));
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this.f91040a, 3, 1, false);
        DynamicVerticalGridItemDecorator dynamicVerticalGridItemDecorator = new DynamicVerticalGridItemDecorator(this.f91040a, 3, 12, 0, 0);
        while (groupServiceItemViewHolder.getRecyclerViewService().getItemDecorationCount() > 0) {
            groupServiceItemViewHolder.getRecyclerViewService().removeItemDecorationAt(0);
        }
        groupServiceItemViewHolder.getRecyclerViewService().addItemDecoration(dynamicVerticalGridItemDecorator);
        groupServiceItemViewHolder.getRecyclerViewService().setLayoutManager(gridLayoutManager);
        groupServiceItemViewHolder.getRecyclerViewService().setHasFixedSize(true);
        groupServiceItemViewHolder.getRecyclerViewService().setNestedScrollingEnabled(false);
        groupServiceItemViewHolder.getRecyclerViewService().setAdapter(getAdapter());
        getAdapter().setListener(this.f91041b);
    }

    @NotNull
    public final OneServiceItemAdapter getAdapter() {
        OneServiceItemAdapter oneServiceItemAdapter = this.adapter;
        if (oneServiceItemAdapter != null) {
            return oneServiceItemAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91042c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(holder, "holder");
        GroupServiceItem groupServiceItem = (GroupServiceItem) this.f91042c.get(i);
        if (holder instanceof GroupServiceItemViewHolder) {
            OneHomeThemeColorModel oneHomeThemeColorModel = this.f91044e;
            GroupServiceItemViewHolder groupServiceItemViewHolder = (GroupServiceItemViewHolder) holder;
            groupServiceItemViewHolder.getVHeaderTheme().setBackgroundResource(oneHomeThemeColorModel.getListHeaderViewColor());
            groupServiceItemViewHolder.getLayoutGroupService().setBackgroundResource(oneHomeThemeColorModel.getListHeaderTitleBackgroundColor());
            groupServiceItemViewHolder.getTvGroupServiceTitle().setTextColor(ResourcesCompat.getColor(this.f91040a.getResources(), oneHomeThemeColorModel.getListHeaderTitleTextColor(), null));
            groupServiceItemViewHolder.getTvGroupServiceTitle().setText(groupServiceItem.getTitle());
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
            m14268a(groupServiceItemViewHolder, arrayList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        View view = LayoutInflater.from(this.f91040a).inflate(R.layout.item_one_group_service, p0, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new GroupServiceItemViewHolder(this, view);
    }

    public final void setAdapter(@NotNull OneServiceItemAdapter oneServiceItemAdapter) {
        Intrinsics.checkNotNullParameter(oneServiceItemAdapter, "<set-?>");
        this.adapter = oneServiceItemAdapter;
    }
}