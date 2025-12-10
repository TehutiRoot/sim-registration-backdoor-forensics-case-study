package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneInputAddNewStaffBinding;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.KeyboardUtil;
import th.p047co.dtac.android.dtacone.view.appOne.staff.activity.OneAddNewStaffActivity;
import th.p047co.dtac.android.dtacone.view.appOne.staff.fragment.OneInputAddNewStaffFragment;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.OneManageStaffThemeColorModel;
import th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010*\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010!R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u00108¨\u0006@"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneInputAddNewStaffFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", "o", "initView", "setThemeView", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", "t", "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", OperatorName.ENDPATH, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", Constant.ServiceAPIName.onStart, "onPause", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "i", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "edtName", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", "edtPhoneNumber", OperatorName.NON_STROKING_CMYK, "edtNewPassword", OperatorName.LINE_TO, "edtConfirmNewPassword", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "btnConfirm", "Lth/co/dtac/android/dtacone/databinding/FragmentOneInputAddNewStaffBinding;", "Lth/co/dtac/android/dtacone/databinding/FragmentOneInputAddNewStaffBinding;", "_binding", "Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", OperatorName.CLOSE_AND_STROKE, "()Lth/co/dtac/android/dtacone/view/appOne/staff/viewmodel/OneStaffViewModel;", "viewModel", "Lth/co/dtac/android/dtacone/view/appOne/staff/activity/OneAddNewStaffActivity;", "p", "()Lth/co/dtac/android/dtacone/view/appOne/staff/activity/OneAddNewStaffActivity;", "addNewStaffActivity", OperatorName.SAVE, "()Lth/co/dtac/android/dtacone/databinding/FragmentOneInputAddNewStaffBinding;", "binding", PDPageLabelRange.STYLE_ROMAN_LOWER, "oneAddNewStaffActivity", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneInputAddNewStaffFragment */
/* loaded from: classes10.dex */
public final class OneInputAddNewStaffFragment extends BaseFragment {

    /* renamed from: i */
    public OneTextInputLayoutText f97272i;

    /* renamed from: j */
    public OneTextInputLayoutPhone f97273j;

    /* renamed from: k */
    public OneTextInputLayoutText f97274k;

    /* renamed from: l */
    public OneTextInputLayoutText f97275l;

    /* renamed from: m */
    public OneFontTextView f97276m;

    /* renamed from: n */
    public FragmentOneInputAddNewStaffBinding f97277n;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneInputAddNewStaffFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneInputAddNewStaffFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneInputAddNewStaffFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneInputAddNewStaffFragment.kt\nth/co/dtac/android/dtacone/view/appOne/staff/fragment/OneInputAddNewStaffFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneInputAddNewStaffFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneInputAddNewStaffFragment newInstance() {
            OneInputAddNewStaffFragment oneInputAddNewStaffFragment = new OneInputAddNewStaffFragment();
            oneInputAddNewStaffFragment.setArguments(new Bundle());
            return oneInputAddNewStaffFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneInputAddNewStaffFragment$WhenMappings */
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

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneInputAddNewStaffFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15158a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f97278a;

        public C15158a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f97278a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f97278a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97278a.invoke(obj);
        }
    }

    private final void initView() {
        setThemeView();
        OneTextInputLayoutText oneTextInputLayoutText = this.f97272i;
        if (oneTextInputLayoutText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtName");
            oneTextInputLayoutText = null;
        }
        oneTextInputLayoutText.showSoftKeyboard();
        m9975q().rootLayout.setOnClickListener(new View.OnClickListener() { // from class: dU0
            {
                OneInputAddNewStaffFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneInputAddNewStaffFragment.m9971u(OneInputAddNewStaffFragment.this, view);
            }
        });
    }

    /* renamed from: n */
    private final void m9978n() {
        OneFontTextView oneFontTextView = this.f97276m;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnConfirm");
            oneFontTextView = null;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontTextView, new OneInputAddNewStaffFragment$actionConfirm$1(this));
    }

    @JvmStatic
    @NotNull
    public static final OneInputAddNewStaffFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: o */
    private final void m9977o() {
        OneTextInputLayoutText oneTextInputLayoutText = m9975q().edtName;
        Intrinsics.checkNotNullExpressionValue(oneTextInputLayoutText, "binding.edtName");
        this.f97272i = oneTextInputLayoutText;
        OneTextInputLayoutPhone oneTextInputLayoutPhone = m9975q().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(oneTextInputLayoutPhone, "binding.edtPhoneNumber");
        this.f97273j = oneTextInputLayoutPhone;
        OneTextInputLayoutText oneTextInputLayoutText2 = m9975q().edtNewPassword;
        Intrinsics.checkNotNullExpressionValue(oneTextInputLayoutText2, "binding.edtNewPassword");
        this.f97274k = oneTextInputLayoutText2;
        OneTextInputLayoutText oneTextInputLayoutText3 = m9975q().edtConfirmNewPassword;
        Intrinsics.checkNotNullExpressionValue(oneTextInputLayoutText3, "binding.edtConfirmNewPassword");
        this.f97275l = oneTextInputLayoutText3;
        OneFontTextView oneFontTextView = m9975q().btnConfirm;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.btnConfirm");
        this.f97276m = oneFontTextView;
    }

    /* renamed from: s */
    public final OneStaffViewModel m9973s() {
        return m9976p().getViewModel();
    }

    private final void setThemeView() {
        OneManageStaffThemeColorModel oneManageStaffThemeColorModel = m9974r().getOneManageStaffThemeColorModel();
        OneFontTextView oneFontTextView = this.f97276m;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnConfirm");
            oneFontTextView = null;
        }
        oneFontTextView.setBackgroundResource(oneManageStaffThemeColorModel.getButtonOkBackground());
    }

    /* renamed from: t */
    public final void m9972t(StatusResource statusResource) {
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

    /* renamed from: u */
    public static final void m9971u(OneInputAddNewStaffFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTextInputLayoutText oneTextInputLayoutText = this$0.f97272i;
        OneTextInputLayoutText oneTextInputLayoutText2 = null;
        if (oneTextInputLayoutText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtName");
            oneTextInputLayoutText = null;
        }
        oneTextInputLayoutText.closeSoftKeyboard();
        OneTextInputLayoutText oneTextInputLayoutText3 = this$0.f97274k;
        if (oneTextInputLayoutText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtNewPassword");
            oneTextInputLayoutText3 = null;
        }
        oneTextInputLayoutText3.closeSoftKeyboard();
        OneTextInputLayoutText oneTextInputLayoutText4 = this$0.f97275l;
        if (oneTextInputLayoutText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmNewPassword");
            oneTextInputLayoutText4 = null;
        }
        oneTextInputLayoutText4.closeSoftKeyboard();
        OneTextInputLayoutText oneTextInputLayoutText5 = this$0.f97272i;
        if (oneTextInputLayoutText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtName");
            oneTextInputLayoutText5 = null;
        }
        oneTextInputLayoutText5.clearFocus();
        OneTextInputLayoutText oneTextInputLayoutText6 = this$0.f97274k;
        if (oneTextInputLayoutText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtNewPassword");
            oneTextInputLayoutText6 = null;
        }
        oneTextInputLayoutText6.clearFocus();
        OneTextInputLayoutText oneTextInputLayoutText7 = this$0.f97275l;
        if (oneTextInputLayoutText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmNewPassword");
        } else {
            oneTextInputLayoutText2 = oneTextInputLayoutText7;
        }
        oneTextInputLayoutText2.clearFocus();
    }

    /* renamed from: v */
    private final void m9970v() {
        OneStaffViewModel m9973s = m9973s();
        m9973s.getRegisterStaffResponse().observe(getViewLifecycleOwner(), new C15158a(new OneInputAddNewStaffFragment$initViewModel$1$1(this)));
        m9973s.getLiveDataState().observe(getViewLifecycleOwner(), new C15158a(new OneInputAddNewStaffFragment$initViewModel$1$2(this)));
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneInputAddNewStaffFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneInputAddNewStaffFragment::class.java.name");
        return name;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f97277n = FragmentOneInputAddNewStaffBinding.inflate(inflater, viewGroup, false);
        return m9975q().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        m9976p().hideKeyboard();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m9976p().showKeyboard();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            m9976p().setKeyboardUtil(new KeyboardUtil(context, view, false, 4, null));
        }
        m9977o();
        initView();
        m9970v();
        m9978n();
    }

    /* renamed from: p */
    public final OneAddNewStaffActivity m9976p() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.staff.activity.OneAddNewStaffActivity");
        return (OneAddNewStaffActivity) activity;
    }

    /* renamed from: q */
    public final FragmentOneInputAddNewStaffBinding m9975q() {
        FragmentOneInputAddNewStaffBinding fragmentOneInputAddNewStaffBinding = this.f97277n;
        Intrinsics.checkNotNull(fragmentOneInputAddNewStaffBinding);
        return fragmentOneInputAddNewStaffBinding;
    }

    /* renamed from: r */
    public final OneAddNewStaffActivity m9974r() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.staff.activity.OneAddNewStaffActivity");
        return (OneAddNewStaffActivity) activity;
    }
}