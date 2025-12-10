package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.staff.activity.OneStaffPermissionActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffPermissionAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.OneManageStaffThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.Data;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.PermissionsItem;
import th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R&\u00105\u001a\u0012\u0012\u0004\u0012\u00020#01j\b\u0012\u0004\u0012\u00020#`28\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\"R\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffPermissionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter$OnPermissionCheckedChangeListener;", "<init>", "()V", "", OperatorName.MOVE_TO, "Landroid/view/View;", Promotion.ACTION_VIEW, "binding", "(Landroid/view/View;)V", "initView", "t", "u", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/Data;", "data", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/Data;)V", OperatorName.CLOSE_AND_STROKE, "setThemeView", "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", OperatorName.SAVE, "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/PermissionsItem;", "permission", "", "isChecked", "onPermissionCheckedChanged", "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/PermissionsItem;Z)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "i", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvStaffName", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/recyclerview/widget/RecyclerView;", "rvPermission", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", OperatorName.NON_STROKING_CMYK, "Ljava/util/ArrayList;", "permissionList", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter;", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffPermissionAdapter;", "adapter", "Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", "p", "()Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", "viewModel", "o", "staffId", "Lth/co/dtac/android/dtacone/view/appOne/staff/activity/OneStaffPermissionActivity;", OperatorName.ENDPATH, "()Lth/co/dtac/android/dtacone/view/appOne/staff/activity/OneStaffPermissionActivity;", "oneStaffPermissionActivity", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneStaffPermissionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStaffPermissionFragment.kt\nth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffPermissionFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffPermissionFragment */
/* loaded from: classes10.dex */
public final class OneStaffPermissionFragment extends BaseFragment implements OneStaffPermissionAdapter.OnPermissionCheckedChangeListener {
    @NotNull
    public static final String STAFF_ID = "STAFF_ID";

    /* renamed from: i */
    public OneFontTextView f97342i;

    /* renamed from: j */
    public RecyclerView f97343j;

    /* renamed from: k */
    public ArrayList f97344k = new ArrayList();

    /* renamed from: l */
    public OneStaffPermissionAdapter f97345l;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffPermissionFragment$Companion;", "", "()V", "STAFF_ID", "", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffPermissionFragment;", "staffId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffPermissionFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneStaffPermissionFragment newInstance(@NotNull String staffId) {
            Intrinsics.checkNotNullParameter(staffId, "staffId");
            OneStaffPermissionFragment oneStaffPermissionFragment = new OneStaffPermissionFragment();
            Bundle bundle = new Bundle();
            bundle.putString("STAFF_ID", staffId);
            oneStaffPermissionFragment.setArguments(bundle);
            return oneStaffPermissionFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffPermissionFragment$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffPermissionFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15165a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f97346a;

        public C15165a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f97346a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f97346a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97346a.invoke(obj);
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.tvStaffName);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvStaffName)");
        this.f97342i = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.rvPermission);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.rvPermission)");
        this.f97343j = (RecyclerView) findViewById2;
    }

    private final void initView() {
        setThemeView();
        m9898t();
    }

    /* renamed from: m */
    private final void m9905m() {
        String m9903o = m9903o();
        if (m9903o != null) {
            m9902p().callGetStaffPermission(m9903o);
        }
    }

    /* renamed from: o */
    private final String m9903o() {
        return requireArguments().getString("STAFF_ID");
    }

    /* renamed from: p */
    private final OneStaffViewModel m9902p() {
        return m9904n().getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m9901q(StatusResource statusResource) {
        int i;
        if (statusResource == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[statusResource.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    dismissSecondaryLoading();
                    return;
                } else {
                    dismissSecondaryLoading();
                    return;
                }
            }
            dismissSecondaryLoading();
            return;
        }
        showSecondaryLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m9900r(Data data) {
        OneFontTextView oneFontTextView = this.f97342i;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvStaffName");
            oneFontTextView = null;
        }
        String name = data.getName();
        String pretty = PhoneNumberExtKt.toPretty(data.getMobileNumber());
        oneFontTextView.setText(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + name + " : " + pretty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m9899s(Data data) {
        this.f97344k.clear();
        List<PermissionsItem> permissions = data.getPermissions();
        if (permissions != null) {
            this.f97344k.addAll(permissions);
        }
        OneStaffPermissionAdapter oneStaffPermissionAdapter = this.f97345l;
        if (oneStaffPermissionAdapter != null) {
            oneStaffPermissionAdapter.notifyDataSetChanged();
        }
    }

    private final void setThemeView() {
        OneManageStaffThemeColorModel oneManageStaffThemeColorModel = m9904n().getOneManageStaffThemeColorModel();
        OneFontTextView oneFontTextView = this.f97342i;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvStaffName");
            oneFontTextView = null;
        }
        oneFontTextView.setBackgroundResource(oneManageStaffThemeColorModel.getHeaderBackground());
        OneFontTextView oneFontTextView2 = this.f97342i;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvStaffName");
            oneFontTextView2 = null;
        }
        oneFontTextView2.setTextColor(ResourcesCompat.getColor(getResources(), oneManageStaffThemeColorModel.getFontColorTextHeader(), null));
    }

    /* renamed from: t */
    private final void m9898t() {
        this.f97344k = new ArrayList();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ArrayList arrayList = this.f97344k;
        String company = m9904n().getPfViewModel().getCompany();
        Intrinsics.checkNotNullExpressionValue(company, "oneStaffPermissionActivi….pfViewModel.getCompany()");
        OneStaffPermissionAdapter oneStaffPermissionAdapter = new OneStaffPermissionAdapter(requireActivity, arrayList, company);
        this.f97345l = oneStaffPermissionAdapter;
        oneStaffPermissionAdapter.setListener(this);
        RecyclerView recyclerView = this.f97343j;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvPermission");
            recyclerView = null;
        }
        recyclerView.setAdapter(this.f97345l);
        RecyclerView recyclerView3 = this.f97343j;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvPermission");
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        RecyclerView recyclerView4 = this.f97343j;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvPermission");
        } else {
            recyclerView2 = recyclerView4;
        }
        ViewCompat.setNestedScrollingEnabled(recyclerView2, true);
    }

    /* renamed from: u */
    private final void m9897u() {
        OneStaffViewModel m9902p = m9902p();
        m9902p.getGetStaffPermissionResponse().observe(getViewLifecycleOwner(), new C15165a(new OneStaffPermissionFragment$setUpViewModel$1$1(this)));
        m9902p.getUpdateStaffPermissionResponse().observe(getViewLifecycleOwner(), new C15165a(new OneStaffPermissionFragment$setUpViewModel$1$2(this)));
        m9902p.getLiveDataState().observe(getViewLifecycleOwner(), new C15165a(new OneStaffPermissionFragment$setUpViewModel$1$3(this)));
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneStaffPermissionFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneStaffPermissionFragment::class.java.name");
        return name;
    }

    /* renamed from: n */
    public final OneStaffPermissionActivity m9904n() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.staff.activity.OneStaffPermissionActivity");
        return (OneStaffPermissionActivity) activity;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_one_staff_permission, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…ission, container, false)");
        binding(inflate);
        initView();
        m9897u();
        m9905m();
        return inflate;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffPermissionAdapter.OnPermissionCheckedChangeListener
    public void onPermissionCheckedChanged(@NotNull PermissionsItem permission, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(permission, "permission");
        OneStaffViewModel m9902p = m9902p();
        String m9903o = m9903o();
        if (m9903o == null) {
            m9903o = "0";
        }
        int parseInt = Integer.parseInt(m9903o);
        if (z) {
            str = "Y";
        } else {
            str = "N";
        }
        String name = permission.getName();
        String str2 = "";
        if (name == null) {
            name = "";
        }
        String description = permission.getDescription();
        if (description != null) {
            str2 = description;
        }
        m9902p.updatePermissionStaff(parseInt, str, name, str2);
    }
}