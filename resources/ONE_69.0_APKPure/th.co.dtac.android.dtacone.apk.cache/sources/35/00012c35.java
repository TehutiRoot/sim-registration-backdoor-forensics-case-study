package th.p047co.dtac.android.dtacone.view.appOne.change_password.fragment;

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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneChangePassword;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.changepassword.OneChangePasswordViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneInputChangePasswordBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.KeyboardUtil;
import th.p047co.dtac.android.dtacone.view.appOne.change_password.activity.OneChangePasswordActivity;
import th.p047co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_password.model.ChangePasswordThemeColorModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0014\u0010\u000e\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/change_password/fragment/OneInputChangePasswordFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", "setThemeView", "u", "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", OperatorName.CLOSE_AND_STROKE, "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "binding", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getScreenName", "()Ljava/lang/String;", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/view/appOne/change_password/activity/OneChangePasswordActivity;", OperatorName.SAVE, "()Lth/co/dtac/android/dtacone/view/appOne/change_password/activity/OneChangePasswordActivity;", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "i", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "tvPhoneNumber", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "edtOldPassword", OperatorName.NON_STROKING_CMYK, "edtNewPassword", OperatorName.LINE_TO, "edtConfirmNewPassword", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "btnConfirmPassword", "Lth/co/dtac/android/dtacone/databinding/FragmentOneInputChangePasswordBinding;", "Lth/co/dtac/android/dtacone/databinding/FragmentOneInputChangePasswordBinding;", "_binding", "Lth/co/dtac/android/dtacone/app_one/viewmodel/changepassword/OneChangePasswordViewModel;", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Lth/co/dtac/android/dtacone/app_one/viewmodel/changepassword/OneChangePasswordViewModel;", "viewModel", "p", "changePasswordActivity", "o", "()Lth/co/dtac/android/dtacone/databinding/FragmentOneInputChangePasswordBinding;", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment */
/* loaded from: classes10.dex */
public final class OneInputChangePasswordFragment extends BaseFragment {

    /* renamed from: i */
    public OneTextLayoutView f89454i;

    /* renamed from: j */
    public OneTextInputLayoutText f89455j;

    /* renamed from: k */
    public OneTextInputLayoutText f89456k;

    /* renamed from: l */
    public OneTextInputLayoutText f89457l;

    /* renamed from: m */
    public OneFontTextView f89458m;

    /* renamed from: n */
    public FragmentOneInputChangePasswordBinding f89459n;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/change_password/fragment/OneInputChangePasswordFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/change_password/fragment/OneInputChangePasswordFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneInputChangePasswordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneInputChangePasswordFragment.kt\nth/co/dtac/android/dtacone/view/appOne/change_password/fragment/OneInputChangePasswordFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneInputChangePasswordFragment newInstance() {
            OneInputChangePasswordFragment oneInputChangePasswordFragment = new OneInputChangePasswordFragment();
            oneInputChangePasswordFragment.setArguments(new Bundle());
            return oneInputChangePasswordFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment$WhenMappings */
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

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment$a */
    /* loaded from: classes10.dex */
    public static final class C14537a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f89460a;

        public C14537a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f89460a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f89460a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f89460a.invoke(obj);
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.tvPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvPhoneNumber)");
        this.f89454i = (OneTextLayoutView) findViewById;
        View findViewById2 = view.findViewById(R.id.edtOldPassword);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.edtOldPassword)");
        this.f89455j = (OneTextInputLayoutText) findViewById2;
        View findViewById3 = view.findViewById(R.id.edtNewPassword);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.edtNewPassword)");
        this.f89456k = (OneTextInputLayoutText) findViewById3;
        View findViewById4 = view.findViewById(R.id.edtConfirmNewPassword);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.edtConfirmNewPassword)");
        this.f89457l = (OneTextInputLayoutText) findViewById4;
        View findViewById5 = view.findViewById(R.id.btnConfirmPassword);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.btnConfirmPassword)");
        this.f89458m = (OneFontTextView) findViewById5;
    }

    private final void initView() {
        String phoneNumber;
        setThemeView();
        OneTextLayoutView oneTextLayoutView = this.f89454i;
        OneTextInputLayoutText oneTextInputLayoutText = null;
        if (oneTextLayoutView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumber");
            oneTextLayoutView = null;
        }
        OneChangePassword changePasswordData = m15280r().getChangePasswordData();
        oneTextLayoutView.setText((changePasswordData == null || (phoneNumber = changePasswordData.getPhoneNumber()) == null || (r2 = PhoneNumberExtKt.toPretty(phoneNumber)) == null) ? "" : "");
        OneTextInputLayoutText oneTextInputLayoutText2 = this.f89455j;
        if (oneTextInputLayoutText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtOldPassword");
        } else {
            oneTextInputLayoutText = oneTextInputLayoutText2;
        }
        oneTextInputLayoutText.showSoftKeyboard();
        m15283o().rootLayout.setOnClickListener(new View.OnClickListener() { // from class: EU0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneInputChangePasswordFragment.m15285m(OneInputChangePasswordFragment.this, view);
            }
        });
    }

    /* renamed from: m */
    public static /* synthetic */ void m15285m(OneInputChangePasswordFragment oneInputChangePasswordFragment, View view) {
        m15278t(oneInputChangePasswordFragment, view);
    }

    @JvmStatic
    @NotNull
    public static final OneInputChangePasswordFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: r */
    public final OneChangePasswordViewModel m15280r() {
        return m15282p().getViewModel();
    }

    /* renamed from: s */
    public final void m15279s(StatusResource statusResource) {
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

    private final void setThemeView() {
        ChangePasswordThemeColorModel changePasswordThemeColorModel = m15282p().getChangePasswordThemeColorModel();
        OneFontTextView oneFontTextView = this.f89458m;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnConfirmPassword");
            oneFontTextView = null;
        }
        oneFontTextView.setBackgroundResource(changePasswordThemeColorModel.getButtonBackground());
    }

    /* renamed from: t */
    public static final void m15278t(OneInputChangePasswordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneTextInputLayoutText oneTextInputLayoutText = this$0.f89455j;
        OneTextInputLayoutText oneTextInputLayoutText2 = null;
        if (oneTextInputLayoutText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtOldPassword");
            oneTextInputLayoutText = null;
        }
        oneTextInputLayoutText.closeSoftKeyboard();
        OneTextInputLayoutText oneTextInputLayoutText3 = this$0.f89456k;
        if (oneTextInputLayoutText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtNewPassword");
            oneTextInputLayoutText3 = null;
        }
        oneTextInputLayoutText3.closeSoftKeyboard();
        OneTextInputLayoutText oneTextInputLayoutText4 = this$0.f89457l;
        if (oneTextInputLayoutText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmNewPassword");
            oneTextInputLayoutText4 = null;
        }
        oneTextInputLayoutText4.closeSoftKeyboard();
        OneTextInputLayoutText oneTextInputLayoutText5 = this$0.f89455j;
        if (oneTextInputLayoutText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtOldPassword");
            oneTextInputLayoutText5 = null;
        }
        oneTextInputLayoutText5.clearFocus();
        OneTextInputLayoutText oneTextInputLayoutText6 = this$0.f89456k;
        if (oneTextInputLayoutText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtNewPassword");
            oneTextInputLayoutText6 = null;
        }
        oneTextInputLayoutText6.clearFocus();
        OneTextInputLayoutText oneTextInputLayoutText7 = this$0.f89457l;
        if (oneTextInputLayoutText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtConfirmNewPassword");
        } else {
            oneTextInputLayoutText2 = oneTextInputLayoutText7;
        }
        oneTextInputLayoutText2.clearFocus();
    }

    /* renamed from: u */
    private final void m15277u() {
        OneChangePasswordViewModel m15280r = m15280r();
        m15280r.getCheckChangePasswordResponse().observe(getViewLifecycleOwner(), new C14537a(new OneInputChangePasswordFragment$initViewModel$1$1(this)));
        m15280r.getLiveDataState().observe(getViewLifecycleOwner(), new C14537a(new OneInputChangePasswordFragment$initViewModel$1$2(this)));
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneInputChangePasswordFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneInputChangePasswordFragment::class.java.name");
        return name;
    }

    /* renamed from: n */
    public final void m15284n() {
        OneFontTextView oneFontTextView = this.f89458m;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnConfirmPassword");
            oneFontTextView = null;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontTextView, new OneInputChangePasswordFragment$actionConfirm$1(this));
    }

    /* renamed from: o */
    public final FragmentOneInputChangePasswordBinding m15283o() {
        FragmentOneInputChangePasswordBinding fragmentOneInputChangePasswordBinding = this.f89459n;
        Intrinsics.checkNotNull(fragmentOneInputChangePasswordBinding);
        return fragmentOneInputChangePasswordBinding;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f89459n = FragmentOneInputChangePasswordBinding.inflate(inflater, viewGroup, false);
        return m15283o().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            m15282p().setKeyboardUtil(new KeyboardUtil(context, view, false, 4, null));
        }
        binding(view);
        initView();
        m15277u();
        m15284n();
    }

    /* renamed from: p */
    public final OneChangePasswordActivity m15282p() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.change_password.activity.OneChangePasswordActivity");
        return (OneChangePasswordActivity) activity;
    }

    /* renamed from: q */
    public final OneChangePasswordActivity m15281q() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.change_password.activity.OneChangePasswordActivity");
        return (OneChangePasswordActivity) activity;
    }
}