package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.navigation.compose.DialogNavigator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;
import th.p047co.dtac.android.dtacone.decorator.DynamicVerticalItemDecorator;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.validation.common.EmptyValidate;
import th.p047co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.activity.OneAddNewStaffActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.activity.OneStaffPermissionActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffCreditLimitDialog;
import th.p047co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffSoldClearDialog;
import th.p047co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.OneManageStaffThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.StaffsItem;
import th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0011J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010\u001aJ\u0017\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010\u001aR\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u00108R\u0016\u0010G\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u00108R&\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00170Hj\b\u0012\u0004\u0012\u00020\u0017`I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010NR\"\u0010U\u001a\u0010\u0012\f\u0012\n R*\u0004\u0018\u00010Q0Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010W\u001a\u0010\u0012\f\u0012\n R*\u0004\u0018\u00010Q0Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR$\u0010^\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010`R\u0014\u0010d\u001a\u00020b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010c¨\u0006f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffListFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter$OnClickStaff;", "<init>", "()V", "", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "binding", "(Landroid/view/View;)V", "C", "setThemeView", PDPageLabelRange.STYLE_ROMAN_LOWER, "", NotificationCompat.CATEGORY_MESSAGE, "showError", "(Ljava/lang/String;)V", "z", "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", "u", "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/StaffsItem;", Constant.REGISTER_LEVEL_STAFF, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Lth/co/dtac/android/dtacone/view/appOne/staff/model/StaffsItem;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onClickAddNewStaff", "getScreenName", "()Ljava/lang/String;", "staffId", "onClickStaffItem", "onClickStaffPermission", "onClickStaffManageSold", "staffItem", "onClickStaffClearCash", "Landroidx/appcompat/widget/LinearLayoutCompat;", "i", "Landroidx/appcompat/widget/LinearLayoutCompat;", "btnAddNewStaff", "Landroidx/recyclerview/widget/RecyclerView;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/recyclerview/widget/RecyclerView;", "rvStaffList", "Landroid/widget/TextView;", OperatorName.NON_STROKING_CMYK, "Landroid/widget/TextView;", "tvListStaff", OperatorName.LINE_TO, "tvListStaffNumber", "Lth/co/dtac/android/dtacone/app_one/widget/loading/OneSwipeRefresh;", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/loading/OneSwipeRefresh;", "swipeContainer", "Landroidx/appcompat/widget/AppCompatImageView;", OperatorName.ENDPATH, "Landroidx/appcompat/widget/AppCompatImageView;", "ivAddNewStaff", "o", "tvAddNewStaff", "p", "tvListStaffNumberName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", OperatorName.SAVE, "Ljava/util/ArrayList;", "staffList", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter;", "Lth/co/dtac/android/dtacone/view/appOne/staff/adapter/OneStaffAdapter;", "oneStaffAdapter", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", OperatorName.CLOSE_AND_STROKE, "Landroidx/activity/result/ActivityResultLauncher;", "addNewStaffLauncher", "t", "staffPermissionLauncher", "Lth/co/dtac/android/dtacone/view/appOne/staff/dialog/OneStaffCreditLimitDialog;", "Lth/co/dtac/android/dtacone/view/appOne/staff/dialog/OneStaffCreditLimitDialog;", "getDialog", "()Lth/co/dtac/android/dtacone/view/appOne/staff/dialog/OneStaffCreditLimitDialog;", "setDialog", "(Lth/co/dtac/android/dtacone/view/appOne/staff/dialog/OneStaffCreditLimitDialog;)V", DialogNavigator.NAME, "Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "()Lth/co/dtac/android/dtacone/view/appOne/home/activity/OneHomeActivity;", "oneHomeActivity", "Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", "()Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment */
/* loaded from: classes10.dex */
public final class OneStaffListFragment extends BaseFragment implements OneStaffAdapter.OnClickStaff {

    /* renamed from: i */
    public LinearLayoutCompat f97325i;

    /* renamed from: j */
    public RecyclerView f97326j;

    /* renamed from: k */
    public TextView f97327k;

    /* renamed from: l */
    public TextView f97328l;

    /* renamed from: m */
    public OneSwipeRefresh f97329m;

    /* renamed from: n */
    public AppCompatImageView f97330n;

    /* renamed from: o */
    public TextView f97331o;

    /* renamed from: p */
    public TextView f97332p;

    /* renamed from: q */
    public ArrayList f97333q = new ArrayList();

    /* renamed from: r */
    public OneStaffAdapter f97334r;

    /* renamed from: s */
    public final ActivityResultLauncher f97335s;

    /* renamed from: t */
    public final ActivityResultLauncher f97336t;

    /* renamed from: u */
    public OneStaffCreditLimitDialog f97337u;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffListFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffListFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneStaffListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneStaffListFragment.kt\nth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneStaffListFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneStaffListFragment newInstance() {
            OneStaffListFragment oneStaffListFragment = new OneStaffListFragment();
            oneStaffListFragment.setArguments(new Bundle());
            return oneStaffListFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$WhenMappings */
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

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15162a implements ActivityResultCallback {
        public C15162a() {
            OneStaffListFragment.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public final void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1) {
                OneStaffListFragment.this.m9914t().callGetListStaff();
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$b */
    /* loaded from: classes10.dex */
    public static final class C15163b implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f97339a;

        public C15163b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f97339a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f97339a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97339a.invoke(obj);
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$c */
    /* loaded from: classes10.dex */
    public static final class C15164c implements ActivityResultCallback {
        public C15164c() {
            OneStaffListFragment.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public final void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == -1) {
                OneStaffListFragment.this.m9914t().callGetListStaff();
            }
        }
    }

    public OneStaffListFragment() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C15162a());
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…stStaff()\n        }\n    }");
        this.f97335s = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C15164c());
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResul…stStaff()\n        }\n    }");
        this.f97336t = registerForActivityResult2;
    }

    /* renamed from: A */
    public static final void m9924A(OneStaffListFragment this$0, StaffsItem staffItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(staffItem, "$staffItem");
        this$0.m9914t().clearCreditLimitStaff(staffItem.getId());
    }

    /* renamed from: B */
    public static final void m9923B(OneStaffListFragment this$0, StaffsItem staff) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(staff, "$staff");
        this$0.m9912v(staff);
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.btnAddNewStaff);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.btnAddNewStaff)");
        this.f97325i = (LinearLayoutCompat) findViewById;
        View findViewById2 = view.findViewById(R.id.rvStaffList);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.rvStaffList)");
        this.f97326j = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tvListStaff);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.tvListStaff)");
        this.f97327k = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tvListStaffNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.tvListStaffNumber)");
        this.f97328l = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.swipeContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.swipeContainer)");
        this.f97329m = (OneSwipeRefresh) findViewById5;
        View findViewById6 = view.findViewById(R.id.ivAddNewStaff);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "view.findViewById(R.id.ivAddNewStaff)");
        this.f97330n = (AppCompatImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.tvAddNewStaff);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "view.findViewById(R.id.tvAddNewStaff)");
        this.f97331o = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.tvListStaffNumberName);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "view.findViewById(R.id.tvListStaffNumberName)");
        this.f97332p = (TextView) findViewById8;
    }

    private final void initView() {
        FragmentManager supportFragmentManager;
        setThemeView();
        TextView textView = this.f97328l;
        OneSwipeRefresh oneSwipeRefresh = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvListStaffNumber");
            textView = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.one_add_new_staff_list_number);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.one_add_new_staff_list_number)");
        String format = String.format(string, Arrays.copyOf(new Object[]{0}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
        LinearLayoutCompat linearLayoutCompat = this.f97325i;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnAddNewStaff");
            linearLayoutCompat = null;
        }
        linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: Td1
            {
                OneStaffListFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneStaffListFragment.m9911w(OneStaffListFragment.this, view);
            }
        });
        OneSwipeRefresh oneSwipeRefresh2 = this.f97329m;
        if (oneSwipeRefresh2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
        } else {
            oneSwipeRefresh = oneSwipeRefresh2;
        }
        oneSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: Ud1
            {
                OneStaffListFragment.this = this;
            }

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                OneStaffListFragment.m9910x(OneStaffListFragment.this);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.setFragmentResultListener(OneStaffDetailFragment.KEY_DELETE_STAFF, this, new FragmentResultListener() { // from class: Vd1
                {
                    OneStaffListFragment.this = this;
                }

                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(String str, Bundle bundle) {
                    OneStaffListFragment.m9909y(OneStaffListFragment.this, str, bundle);
                }
            });
        }
    }

    @JvmStatic
    @NotNull
    public static final OneStaffListFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: s */
    public final OneHomeActivity m9915s() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.home.activity.OneHomeActivity");
        return (OneHomeActivity) activity;
    }

    private final void setThemeView() {
        OneManageStaffThemeColorModel oneManageStaffThemeColorModel = m9915s().getOneManageStaffThemeColorModel();
        OneSwipeRefresh oneSwipeRefresh = this.f97329m;
        if (oneSwipeRefresh == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            oneSwipeRefresh = null;
        }
        oneSwipeRefresh.setTheme(oneManageStaffThemeColorModel.getFontColor());
        LinearLayoutCompat linearLayoutCompat = this.f97325i;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnAddNewStaff");
            linearLayoutCompat = null;
        }
        linearLayoutCompat.setBackgroundResource(oneManageStaffThemeColorModel.getButtonDeleteBackground());
        AppCompatImageView appCompatImageView = this.f97330n;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivAddNewStaff");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(oneManageStaffThemeColorModel.getIconAddNewStaff());
        TextView textView = this.f97331o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAddNewStaff");
            textView = null;
        }
        textView.setTextColor(ResourcesCompat.getColor(getResources(), oneManageStaffThemeColorModel.getFontAddNewStaffColor(), null));
        TextView textView2 = this.f97328l;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvListStaffNumber");
            textView2 = null;
        }
        textView2.setTextColor(ResourcesCompat.getColor(getResources(), oneManageStaffThemeColorModel.getFontColor(), null));
        TextView textView3 = this.f97332p;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvListStaffNumberName");
            textView3 = null;
        }
        textView3.setTextColor(ResourcesCompat.getColor(getResources(), oneManageStaffThemeColorModel.getFontColor(), null));
    }

    public final void showError(String str) {
        OneCustomDialogBox.Callback callback = new OneCustomDialogBox.Callback() { // from class: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneStaffListFragment$showError$callback$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox.Callback
            public void onButtonClick() {
                OneHomeActivity m9915s;
                m9915s = OneStaffListFragment.this.m9915s();
                m9915s.finish();
            }
        };
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        OneCustomDialogBox oneCustomDialogBox = new OneCustomDialogBox(requireContext, callback);
        oneCustomDialogBox.setMessage(str);
        oneCustomDialogBox.show();
    }

    /* renamed from: t */
    public final OneStaffViewModel m9914t() {
        return m9915s().getViewModel();
    }

    /* renamed from: u */
    public final void m9913u(StatusResource statusResource) {
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

    /* renamed from: w */
    public static final void m9911w(OneStaffListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClickAddNewStaff();
    }

    /* renamed from: x */
    public static final void m9910x(OneStaffListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m9914t().callGetListStaff();
    }

    /* renamed from: y */
    public static final void m9909y(OneStaffListFragment this$0, String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getBoolean(OneStaffDetailFragment.KEY_DELETE_STAFF, false)) {
            this$0.m9916r();
        }
    }

    /* renamed from: z */
    private final void m9908z() {
        OneStaffViewModel m9914t = m9914t();
        m9914t.getGetListStaffResponse().observe(getViewLifecycleOwner(), new C15163b(new OneStaffListFragment$initViewModel$1$1(this)));
        m9914t.getUpdateStaffCreditLimitResponse().observe(getViewLifecycleOwner(), new C15163b(new OneStaffListFragment$initViewModel$1$2(this)));
        m9914t.getClearStaffCreditLimitResponse().observe(getViewLifecycleOwner(), new C15163b(new OneStaffListFragment$initViewModel$1$3(this)));
        m9914t.getShowError().observe(getViewLifecycleOwner(), new C15163b(new OneStaffListFragment$initViewModel$1$4(this)));
        m9914t.isRefreshing().observe(getViewLifecycleOwner(), new C15163b(new OneStaffListFragment$initViewModel$1$5(this)));
        m9914t.getLiveDataState().observe(getViewLifecycleOwner(), new C15163b(new OneStaffListFragment$initViewModel$1$6(this)));
    }

    /* renamed from: C */
    public final void m9922C() {
        this.f97333q = new ArrayList();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        OneStaffAdapter oneStaffAdapter = new OneStaffAdapter(requireActivity, this.f97333q);
        this.f97334r = oneStaffAdapter;
        oneStaffAdapter.setListener(this);
        RecyclerView recyclerView = this.f97326j;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvStaffList");
            recyclerView = null;
        }
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
        recyclerView.addItemDecoration(new DynamicVerticalItemDecorator(requireActivity2, 8, 24, 16));
        RecyclerView recyclerView3 = this.f97326j;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvStaffList");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(this.f97334r);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        RecyclerView recyclerView4 = this.f97326j;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvStaffList");
            recyclerView4 = null;
        }
        recyclerView4.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView5 = this.f97326j;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvStaffList");
            recyclerView5 = null;
        }
        recyclerView5.setItemAnimator(new DefaultItemAnimator());
        RecyclerView recyclerView6 = this.f97326j;
        if (recyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvStaffList");
        } else {
            recyclerView2 = recyclerView6;
        }
        ViewCompat.setNestedScrollingEnabled(recyclerView2, true);
    }

    @Nullable
    public final OneStaffCreditLimitDialog getDialog() {
        return this.f97337u;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneStaffListFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneStaffListFragment::class.java.name");
        return name;
    }

    public final void onClickAddNewStaff() {
        this.f97335s.launch(new Intent(getActivity(), OneAddNewStaffActivity.class));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter.OnClickStaff
    public void onClickStaffClearCash(@NotNull final StaffsItem staffItem) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(staffItem, "staffItem");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        String string = getString(R.string.clear_money);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.clear_money)");
        int i2 = R.string.one_staff_clear_money_name;
        String name = staffItem.getName();
        String userId = staffItem.getUserId();
        if (userId != null) {
            str = PhoneNumberExtKt.toPretty(userId);
        } else {
            str = null;
        }
        String string2 = getString(i2, name, str);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.one_s…fItem.userId?.toPretty())");
        int i3 = R.string.one_staff_clear_money_amount;
        Integer soldAmount = staffItem.getSoldAmount();
        if (soldAmount != null) {
            i = soldAmount.intValue();
        } else {
            i = 0;
        }
        String string3 = getString(i3, MoneyFormatExtKt.toMoneyFormatNoFloating(i));
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.one_s…oMoneyFormatNoFloating())");
        OneStaffSoldClearDialog oneStaffSoldClearDialog = new OneStaffSoldClearDialog(requireContext, string, string2, string3, m9915s().getOneManageStaffThemeColorModel().getFontColor(), m9915s().getOneManageStaffThemeColorModel().getButtonOkBackground(), new CustomDialogBox.Callback() { // from class: Sd1
            {
                OneStaffListFragment.this = this;
            }

            @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox.Callback
            public final void onButtonClick() {
                OneStaffListFragment.m9924A(OneStaffListFragment.this, staffItem);
            }
        });
        oneStaffSoldClearDialog.setCancelable(false);
        oneStaffSoldClearDialog.show();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter.OnClickStaff
    public void onClickStaffItem(@NotNull String staffId) {
        Intrinsics.checkNotNullParameter(staffId, "staffId");
        m9914t().clearGetStaffDetailResponseLiveData();
        m9915s().changeFragments(OneStaffDetailFragment.Companion.newInstance(staffId), "OTHER");
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter.OnClickStaff
    public void onClickStaffManageSold(@NotNull final StaffsItem staff) {
        String str;
        Intrinsics.checkNotNullParameter(staff, "staff");
        String name = staff.getName();
        String userId = staff.getUserId();
        if (userId != null) {
            str = PhoneNumberExtKt.toPretty(userId);
        } else {
            str = null;
        }
        String str2 = name + " : " + str;
        String valueOf = String.valueOf(staff.getCredit());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        OneHomeActivity m9915s = m9915s();
        String string = getString(R.string.limit_sale_money);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.limit_sale_money)");
        OneStaffCreditLimitDialog oneStaffCreditLimitDialog = new OneStaffCreditLimitDialog(requireContext, m9915s, string, str2, Integer.parseInt(valueOf), m9915s().getOneManageStaffThemeColorModel(), new CustomDialogBox.Callback() { // from class: Rd1
            {
                OneStaffListFragment.this = this;
            }

            @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox.Callback
            public final void onButtonClick() {
                OneStaffListFragment.m9923B(OneStaffListFragment.this, staff);
            }
        });
        this.f97337u = oneStaffCreditLimitDialog;
        oneStaffCreditLimitDialog.setCancelable(false);
        OneStaffCreditLimitDialog oneStaffCreditLimitDialog2 = this.f97337u;
        if (oneStaffCreditLimitDialog2 != null) {
            oneStaffCreditLimitDialog2.show();
        }
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.staff.adapter.OneStaffAdapter.OnClickStaff
    public void onClickStaffPermission(@NotNull String staffId) {
        Intrinsics.checkNotNullParameter(staffId, "staffId");
        Intent intent = new Intent(getActivity(), OneStaffPermissionActivity.class);
        intent.putExtra("STAFF_ID", staffId);
        this.f97336t.launch(intent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m9915s().changeToolbarTitle("StaffListFragment");
        return inflater.inflate(R.layout.fragment_one_staff_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        binding(view);
        m9922C();
        initView();
        m9916r();
        m9908z();
    }

    /* renamed from: r */
    public final void m9916r() {
        OneSwipeRefresh oneSwipeRefresh = this.f97329m;
        if (oneSwipeRefresh == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeContainer");
            oneSwipeRefresh = null;
        }
        oneSwipeRefresh.setRefreshing(true);
        m9914t().callGetListStaff();
    }

    public final void setDialog(@Nullable OneStaffCreditLimitDialog oneStaffCreditLimitDialog) {
        this.f97337u = oneStaffCreditLimitDialog;
    }

    /* renamed from: v */
    public final void m9912v(StaffsItem staffsItem) {
        boolean z;
        String str;
        try {
            OneAddNewStaff addNewStaffData = m9914t().getAddNewStaffData();
            if (addNewStaffData != null) {
                z = Intrinsics.areEqual(addNewStaffData.getRadioCheck(), Boolean.TRUE);
            } else {
                z = false;
            }
            Integer num = null;
            if (z) {
                EmptyValidate.Companion companion = EmptyValidate.Companion;
                OneAddNewStaff addNewStaffData2 = m9914t().getAddNewStaffData();
                if (addNewStaffData2 != null) {
                    str = addNewStaffData2.getCreditLimit();
                } else {
                    str = null;
                }
                companion.validate(str, R.string.staff_please_enter_credit);
            }
            OneStaffViewModel m9914t = m9914t();
            if (staffsItem != null) {
                num = staffsItem.getId();
            }
            m9914t.updateCreditLimitStaff(num);
            OneStaffCreditLimitDialog oneStaffCreditLimitDialog = this.f97337u;
            if (oneStaffCreditLimitDialog != null) {
                oneStaffCreditLimitDialog.dismiss();
            }
        } catch (ValidatedRuleException e) {
            showDialogOne(e.getResId());
        }
    }
}