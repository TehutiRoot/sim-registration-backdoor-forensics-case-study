package th.p047co.dtac.android.dtacone.view.appOne.forgot_password.fragment;

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
import th.p047co.dtac.android.dtacone.app_one.util.model.OneForgotPassword;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.forgotpassword.OneForgotPasswordViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonRed;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneInputForgotPasswordBinding;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.forgot_password.activity.OneForgotPasswordActivity;
import th.p047co.dtac.android.dtacone.view.appOne.forgot_password.fragment.OneInputForgotPasswordFragment;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/forgot_password/fragment/OneInputForgotPasswordFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", "t", "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "initView", OperatorName.ENDPATH, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/databinding/FragmentOneInputForgotPasswordBinding;", "i", "Lth/co/dtac/android/dtacone/databinding/FragmentOneInputForgotPasswordBinding;", "_binding", "Lth/co/dtac/android/dtacone/app_one/viewmodel/forgotpassword/OneForgotPasswordViewModel;", OperatorName.SAVE, "()Lth/co/dtac/android/dtacone/app_one/viewmodel/forgotpassword/OneForgotPasswordViewModel;", "viewModel", "Lth/co/dtac/android/dtacone/view/appOne/forgot_password/activity/OneForgotPasswordActivity;", "p", "()Lth/co/dtac/android/dtacone/view/appOne/forgot_password/activity/OneForgotPasswordActivity;", "forgotPasswordActivity", "o", "()Lth/co/dtac/android/dtacone/databinding/FragmentOneInputForgotPasswordBinding;", "binding", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.forgot_password.fragment.OneInputForgotPasswordFragment */
/* loaded from: classes10.dex */
public final class OneInputForgotPasswordFragment extends BaseFragment {

    /* renamed from: i */
    public FragmentOneInputForgotPasswordBinding f91010i;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/forgot_password/fragment/OneInputForgotPasswordFragment$Companion;", "", "()V", "DIGIT_OTP", "", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/forgot_password/fragment/OneInputForgotPasswordFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneInputForgotPasswordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneInputForgotPasswordFragment.kt\nth/co/dtac/android/dtacone/view/appOne/forgot_password/fragment/OneInputForgotPasswordFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.forgot_password.fragment.OneInputForgotPasswordFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneInputForgotPasswordFragment newInstance() {
            OneInputForgotPasswordFragment oneInputForgotPasswordFragment = new OneInputForgotPasswordFragment();
            oneInputForgotPasswordFragment.setArguments(new Bundle());
            return oneInputForgotPasswordFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.forgot_password.fragment.OneInputForgotPasswordFragment$WhenMappings */
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

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.forgot_password.fragment.OneInputForgotPasswordFragment$a */
    /* loaded from: classes10.dex */
    public static final class C14702a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f91011a;

        public C14702a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f91011a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f91011a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f91011a.invoke(obj);
        }
    }

    private final void initView() {
        String phoneNumber;
        OneTextLayoutView oneTextLayoutView = m14302o().tvPhoneNumber;
        OneForgotPassword forgotPasswordData = m14300q().getForgotPasswordData();
        oneTextLayoutView.setText((forgotPasswordData == null || (phoneNumber = forgotPasswordData.getPhoneNumber()) == null || (r1 = PhoneNumberExtKt.toPretty(phoneNumber)) == null) ? "" : "");
        m14302o().requestOTP.setPaintFlags(m14302o().requestOTP.getPaintFlags() | 8);
        OneFontTextView oneFontTextView = m14302o().requestOTP;
        Intrinsics.checkNotNullExpressionValue(oneFontTextView, "binding.requestOTP");
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontTextView, new OneInputForgotPasswordFragment$initView$1(this));
        m14302o().edtVerifyOTP.showSoftKeyboard();
        m14302o().rootLayout.setOnClickListener(new View.OnClickListener() { // from class: FU0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneInputForgotPasswordFragment.m14304m(OneInputForgotPasswordFragment.this, view);
            }
        });
    }

    /* renamed from: m */
    public static /* synthetic */ void m14304m(OneInputForgotPasswordFragment oneInputForgotPasswordFragment, View view) {
        m14298s(oneInputForgotPasswordFragment, view);
    }

    /* renamed from: n */
    private final void m14303n() {
        OneButtonRed oneButtonRed = m14302o().btnConfirmPassword;
        Intrinsics.checkNotNullExpressionValue(oneButtonRed, "binding.btnConfirmPassword");
        OnSingleClickListenerKt.setOnSingleClickListener(oneButtonRed, new OneInputForgotPasswordFragment$actionConfirm$1(this));
    }

    @JvmStatic
    @NotNull
    public static final OneInputForgotPasswordFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: q */
    public final OneForgotPasswordViewModel m14300q() {
        return m14301p().getViewModel();
    }

    /* renamed from: r */
    public final void m14299r(StatusResource statusResource) {
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

    /* renamed from: s */
    public static final void m14298s(OneInputForgotPasswordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m14302o().edtVerifyOTP.closeSoftKeyboard();
        this$0.m14302o().edtNewPassword.closeSoftKeyboard();
        this$0.m14302o().edtConfirmNewPassword.closeSoftKeyboard();
        this$0.m14302o().edtVerifyOTP.clearFocus();
        this$0.m14302o().edtNewPassword.clearFocus();
        this$0.m14302o().edtConfirmNewPassword.clearFocus();
    }

    /* renamed from: t */
    private final void m14297t() {
        OneForgotPasswordViewModel m14300q = m14300q();
        m14300q.getNextStepRequestOtp().observe(getViewLifecycleOwner(), new C14702a(new OneInputForgotPasswordFragment$initViewModel$1$1(this, m14300q)));
        m14300q.getNavigateVerifyOtp().observe(getViewLifecycleOwner(), new C14702a(new OneInputForgotPasswordFragment$initViewModel$1$2(this, m14300q)));
        m14300q.getCheckForgotPasswordResponse().observe(getViewLifecycleOwner(), new C14702a(new OneInputForgotPasswordFragment$initViewModel$1$3(this)));
        m14300q.getLiveDataState().observe(getViewLifecycleOwner(), new C14702a(new OneInputForgotPasswordFragment$initViewModel$1$4(this)));
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneInputForgotPasswordFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneInputForgotPasswordFragment::class.java.name");
        return name;
    }

    /* renamed from: o */
    public final FragmentOneInputForgotPasswordBinding m14302o() {
        FragmentOneInputForgotPasswordBinding fragmentOneInputForgotPasswordBinding = this.f91010i;
        Intrinsics.checkNotNull(fragmentOneInputForgotPasswordBinding);
        return fragmentOneInputForgotPasswordBinding;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f91010i = FragmentOneInputForgotPasswordBinding.inflate(inflater, viewGroup, false);
        return m14302o().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        m14297t();
        m14303n();
    }

    /* renamed from: p */
    public final OneForgotPasswordActivity m14301p() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.forgot_password.activity.OneForgotPasswordActivity");
        return (OneForgotPasswordActivity) activity;
    }
}