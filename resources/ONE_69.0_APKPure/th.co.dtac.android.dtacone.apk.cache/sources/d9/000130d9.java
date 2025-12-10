package th.p047co.dtac.android.dtacone.view.appOne.home.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.model.appOne.other.OneOtherMenuCollection;
import th.p047co.dtac.android.dtacone.model.appOne.other.OtherGroupMenuItem;
import th.p047co.dtac.android.dtacone.model.home.OneHomeThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.home.adapter.OneOtherMenuAdapter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\u00182\n\u0010\u0016\u001a\u00060\u001bR\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupOtherMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/app/Activity;", "activity", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneOtherMenuAdapter$OnClickOtherMenuItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lth/co/dtac/android/dtacone/model/appOne/other/OtherGroupMenuItem;", "groupOtherMenuList", "Lth/co/dtac/android/dtacone/model/home/OneHomeThemeColorModel;", "oneHomeThemeColorModel", "<init>", "(Landroid/app/Activity;Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneOtherMenuAdapter$OnClickOtherMenuItem;Ljava/util/List;Lth/co/dtac/android/dtacone/model/home/OneHomeThemeColorModel;)V", "Landroid/view/ViewGroup;", "p0", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupOtherMenuAdapter$GroupMenuItemViewHolder;", "Lth/co/dtac/android/dtacone/model/appOne/other/OneOtherMenuCollection;", "groupMenuItem", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupOtherMenuAdapter$GroupMenuItemViewHolder;Ljava/util/List;)V", "Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneOtherMenuAdapter$OnClickOtherMenuItem;", OperatorName.CURVE_TO, "Ljava/util/List;", "d", "Lth/co/dtac/android/dtacone/model/home/OneHomeThemeColorModel;", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneOtherMenuAdapter;", "adapter", "Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneOtherMenuAdapter;", "getAdapter", "()Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneOtherMenuAdapter;", "setAdapter", "(Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneOtherMenuAdapter;)V", "GroupMenuItemViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneGroupOtherMenuAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneGroupOtherMenuAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupOtherMenuAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.adapter.OneGroupOtherMenuAdapter */
/* loaded from: classes10.dex */
public final class OneGroupOtherMenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f91032a;
    public OneOtherMenuAdapter adapter;

    /* renamed from: b */
    public final OneOtherMenuAdapter.OnClickOtherMenuItem f91033b;

    /* renamed from: c */
    public final List f91034c;

    /* renamed from: d */
    public final OneHomeThemeColorModel f91035d;

    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupOtherMenuAdapter$GroupMenuItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/home/adapter/OneGroupOtherMenuAdapter;Landroid/view/View;)V", "Landroidx/appcompat/widget/LinearLayoutCompat;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/appcompat/widget/LinearLayoutCompat;", "getLayoutGroupMenu", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "layoutGroupMenu", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "getTvGroupMenuTitle", "()Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvGroupMenuTitle", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.CURVE_TO, "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerViewOtherMenu", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerViewOtherMenu", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.home.adapter.OneGroupOtherMenuAdapter$GroupMenuItemViewHolder */
    /* loaded from: classes10.dex */
    public final class GroupMenuItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final LinearLayoutCompat f91036a;

        /* renamed from: b */
        public final OneFontTextView f91037b;

        /* renamed from: c */
        public final RecyclerView f91038c;

        /* renamed from: d */
        public final /* synthetic */ OneGroupOtherMenuAdapter f91039d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupMenuItemViewHolder(@NotNull OneGroupOtherMenuAdapter oneGroupOtherMenuAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f91039d = oneGroupOtherMenuAdapter;
            View findViewById = view.findViewById(R.id.layoutGroupMenu);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
            this.f91036a = (LinearLayoutCompat) findViewById;
            View findViewById2 = view.findViewById(R.id.tvGroupMenuTitle);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.widget.OneFontTextView");
            this.f91037b = (OneFontTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.recyclerViewOtherMenu);
            Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            this.f91038c = (RecyclerView) findViewById3;
        }

        @NotNull
        public final LinearLayoutCompat getLayoutGroupMenu() {
            return this.f91036a;
        }

        @NotNull
        public final RecyclerView getRecyclerViewOtherMenu() {
            return this.f91038c;
        }

        @NotNull
        public final OneFontTextView getTvGroupMenuTitle() {
            return this.f91037b;
        }
    }

    public OneGroupOtherMenuAdapter(@NotNull Activity activity, @NotNull OneOtherMenuAdapter.OnClickOtherMenuItem listener, @NotNull List<OtherGroupMenuItem> groupOtherMenuList, @NotNull OneHomeThemeColorModel oneHomeThemeColorModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(groupOtherMenuList, "groupOtherMenuList");
        Intrinsics.checkNotNullParameter(oneHomeThemeColorModel, "oneHomeThemeColorModel");
        this.f91032a = activity;
        this.f91033b = listener;
        this.f91034c = groupOtherMenuList;
        this.f91035d = oneHomeThemeColorModel;
    }

    /* renamed from: a */
    public final void m14269a(GroupMenuItemViewHolder groupMenuItemViewHolder, List list) {
        setAdapter(new OneOtherMenuAdapter(this.f91032a, list, this.f91035d));
        groupMenuItemViewHolder.getRecyclerViewOtherMenu().setLayoutManager(new LinearLayoutManager(this.f91032a, 1, false));
        groupMenuItemViewHolder.getRecyclerViewOtherMenu().setHasFixedSize(true);
        groupMenuItemViewHolder.getRecyclerViewOtherMenu().setNestedScrollingEnabled(false);
        groupMenuItemViewHolder.getRecyclerViewOtherMenu().setAdapter(getAdapter());
        getAdapter().setListener(this.f91033b);
    }

    @NotNull
    public final OneOtherMenuAdapter getAdapter() {
        OneOtherMenuAdapter oneOtherMenuAdapter = this.adapter;
        if (oneOtherMenuAdapter != null) {
            return oneOtherMenuAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91034c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        OtherGroupMenuItem otherGroupMenuItem = (OtherGroupMenuItem) this.f91034c.get(i);
        if (holder instanceof GroupMenuItemViewHolder) {
            OneHomeThemeColorModel oneHomeThemeColorModel = this.f91035d;
            GroupMenuItemViewHolder groupMenuItemViewHolder = (GroupMenuItemViewHolder) holder;
            groupMenuItemViewHolder.getLayoutGroupMenu().setBackgroundResource(oneHomeThemeColorModel.getListHeaderTitleBackgroundColor());
            groupMenuItemViewHolder.getTvGroupMenuTitle().setTextColor(ResourcesCompat.getColor(this.f91032a.getResources(), oneHomeThemeColorModel.getListHeaderTitleTextColor(), null));
            LinearLayoutCompat layoutGroupMenu = groupMenuItemViewHolder.getLayoutGroupMenu();
            if (otherGroupMenuItem.isShowGroupTitle()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            layoutGroupMenu.setVisibility(i2);
            groupMenuItemViewHolder.getTvGroupMenuTitle().setText(otherGroupMenuItem.getSection());
            ArrayList<OneOtherMenuCollection> otherMenuList = otherGroupMenuItem.getOtherMenuList();
            if (otherMenuList != null) {
                m14269a(groupMenuItemViewHolder, otherMenuList);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        View view = LayoutInflater.from(this.f91032a).inflate(R.layout.item_group_other_menu, p0, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new GroupMenuItemViewHolder(this, view);
    }

    public final void setAdapter(@NotNull OneOtherMenuAdapter oneOtherMenuAdapter) {
        Intrinsics.checkNotNullParameter(oneOtherMenuAdapter, "<set-?>");
        this.adapter = oneOtherMenuAdapter;
    }
}