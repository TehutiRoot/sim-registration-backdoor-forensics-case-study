package th.p047co.dtac.android.dtacone.view.fragment.eSIM.select_sku;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.eSIM.ESimPackageSetAdapter;
import th.p047co.dtac.android.dtacone.model.esim.JsonMemberPackageItem;
import th.p047co.dtac.android.dtacone.model.postpaid.packages.TabPackage;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerViewDecorator;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/eSIM/select_sku/ESimPackageListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter$OnClickPackage;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", OperatorName.ENDPATH, "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lth/co/dtac/android/dtacone/model/esim/JsonMemberPackageItem;", "item", "onItemClick", "(Lth/co/dtac/android/dtacone/model/esim/JsonMemberPackageItem;)V", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter;", "i", "Lth/co/dtac/android/dtacone/adapter/eSIM/ESimPackageSetAdapter;", "packageAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutLayoutManager", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.NON_STROKING_CMYK, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerViewPackage", "Lth/co/dtac/android/dtacone/model/postpaid/packages/TabPackage;", OperatorName.MOVE_TO, "()Lth/co/dtac/android/dtacone/model/postpaid/packages/TabPackage;", "packages", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.select_sku.ESimPackageListFragment */
/* loaded from: classes9.dex */
public final class ESimPackageListFragment extends BaseFragment implements ESimPackageSetAdapter.OnClickPackage {

    /* renamed from: i */
    public ESimPackageSetAdapter f101368i;

    /* renamed from: j */
    public LinearLayoutManager f101369j;

    /* renamed from: k */
    public RecyclerView f101370k;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/eSIM/select_sku/ESimPackageListFragment$Companion;", "", "()V", "EXTRA_PACKAGE", "", "newInstance", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/select_sku/ESimPackageListFragment;", "packageGroup", "Lth/co/dtac/android/dtacone/model/postpaid/packages/TabPackage;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.select_sku.ESimPackageListFragment$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ESimPackageListFragment newInstance(@NotNull TabPackage packageGroup) {
            Intrinsics.checkNotNullParameter(packageGroup, "packageGroup");
            ESimPackageListFragment eSimPackageListFragment = new ESimPackageListFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PACKAGE", packageGroup);
            eSimPackageListFragment.setArguments(bundle);
            return eSimPackageListFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: m */
    private final TabPackage m6911m() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (TabPackage) arguments.getParcelable("EXTRA_PACKAGE");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    private final void m6910n(View view) {
        this.f101369j = new LinearLayoutManager(getContext(), 1, false);
        this.f101368i = new ESimPackageSetAdapter();
        View findViewById = view.findViewById(R.id.recyclerViewPackage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.recyclerViewPackage)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f101370k = recyclerView;
        List<Object> list = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewPackage");
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = this.f101369j;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLayoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f101370k;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewPackage");
            recyclerView2 = null;
        }
        Context context = getContext();
        LinearLayoutManager linearLayoutManager2 = this.f101369j;
        if (linearLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutLayoutManager");
            linearLayoutManager2 = null;
        }
        recyclerView2.addItemDecoration(new DtacRecyclerViewDecorator(context, linearLayoutManager2.getOrientation()));
        RecyclerView recyclerView3 = this.f101370k;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerViewPackage");
            recyclerView3 = null;
        }
        ESimPackageSetAdapter eSimPackageSetAdapter = this.f101368i;
        if (eSimPackageSetAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("packageAdapter");
            eSimPackageSetAdapter = null;
        }
        recyclerView3.setAdapter(eSimPackageSetAdapter);
        ESimPackageSetAdapter eSimPackageSetAdapter2 = this.f101368i;
        if (eSimPackageSetAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("packageAdapter");
            eSimPackageSetAdapter2 = null;
        }
        eSimPackageSetAdapter2.setListener(this);
        ESimPackageSetAdapter eSimPackageSetAdapter3 = this.f101368i;
        ESimPackageSetAdapter eSimPackageSetAdapter4 = eSimPackageSetAdapter3;
        if (eSimPackageSetAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("packageAdapter");
            eSimPackageSetAdapter4 = null;
        }
        TabPackage m6911m = m6911m();
        if (m6911m != null) {
            list = m6911m.getPackages();
        }
        eSimPackageSetAdapter4.setPackageList(list);
    }

    @JvmStatic
    @NotNull
    public static final ESimPackageListFragment newInstance(@NotNull TabPackage tabPackage) {
        return Companion.newInstance(tabPackage);
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = ESimPackageListFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ESimPackageListFragment::class.java.name");
        return name;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_esim_package_list, viewGroup, false);
    }

    @Override // th.p047co.dtac.android.dtacone.adapter.eSIM.ESimPackageSetAdapter.OnClickPackage
    public void onItemClick(@Nullable JsonMemberPackageItem jsonMemberPackageItem) {
        if (getParentFragment() instanceof ESimSelectSKUFragment) {
            Fragment parentFragment = getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.fragment.eSIM.select_sku.ESimSelectSKUFragment");
            ((ESimSelectSKUFragment) parentFragment).onClickItemPackage(jsonMemberPackageItem);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        m6910n(view);
    }
}