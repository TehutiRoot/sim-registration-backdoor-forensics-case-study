package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

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
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonRed;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.KeyboardUtil;
import th.p047co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/registration/fragment/OneInputInfoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", "p", "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", "o", "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "bindingView", "(Landroid/view/View;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", Constant.ServiceAPIName.onStart, "onPause", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "i", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "edtRtrCode", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", "edtPhoneNumber", "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonRed;", OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonRed;", "btnRequestOTP", "Lth/co/dtac/android/dtacone/app_one/viewmodel/registration/OneRegistrationViewModel;", OperatorName.ENDPATH, "()Lth/co/dtac/android/dtacone/app_one/viewmodel/registration/OneRegistrationViewModel;", "viewModel", "Lth/co/dtac/android/dtacone/view/appOne/registration/activity/OneRegistrationActivity;", OperatorName.MOVE_TO, "()Lth/co/dtac/android/dtacone/view/appOne/registration/activity/OneRegistrationActivity;", "registrationActivity", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputInfoFragment */
/* loaded from: classes10.dex */
public final class OneInputInfoFragment extends BaseFragment {

    /* renamed from: i */
    public OneTextInputLayoutText f96205i;

    /* renamed from: j */
    public OneTextInputLayoutPhone f96206j;

    /* renamed from: k */
    public OneButtonRed f96207k;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/registration/fragment/OneInputInfoFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/registration/fragment/OneInputInfoFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputInfoFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneInputInfoFragment newInstance() {
            OneInputInfoFragment oneInputInfoFragment = new OneInputInfoFragment();
            oneInputInfoFragment.setArguments(new Bundle());
            return oneInputInfoFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputInfoFragment$WhenMappings */
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

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputInfoFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15112a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f96208a;

        public C15112a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f96208a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f96208a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f96208a.invoke(obj);
        }
    }

    private final void bindingView(View view) {
        View findViewById = view.findViewById(R.id.edtRtrCode);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.edtRtrCode)");
        this.f96205i = (OneTextInputLayoutText) findViewById;
        View findViewById2 = view.findViewById(R.id.edtPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.edtPhoneNumber)");
        this.f96206j = (OneTextInputLayoutPhone) findViewById2;
        View findViewById3 = view.findViewById(R.id.btnRequestOTP);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.btnRequestOTP)");
        this.f96207k = (OneButtonRed) findViewById3;
    }

    private final void initView() {
        OneTextInputLayoutText oneTextInputLayoutText = this.f96205i;
        OneButtonRed oneButtonRed = null;
        if (oneTextInputLayoutText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtRtrCode");
            oneTextInputLayoutText = null;
        }
        oneTextInputLayoutText.blockPasteChar();
        OneTextInputLayoutText oneTextInputLayoutText2 = this.f96205i;
        if (oneTextInputLayoutText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtRtrCode");
            oneTextInputLayoutText2 = null;
        }
        oneTextInputLayoutText2.focus();
        OneButtonRed oneButtonRed2 = this.f96207k;
        if (oneButtonRed2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnRequestOTP");
        } else {
            oneButtonRed = oneButtonRed2;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneButtonRed, new OneInputInfoFragment$initView$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final OneRegistrationViewModel m10440n() {
        return m10441m().getViewModel();
    }

    @JvmStatic
    @NotNull
    public static final OneInputInfoFragment newInstance() {
        return Companion.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m10439o(StatusResource statusResource) {
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

    /* renamed from: p */
    private final void m10438p() {
        OneRegistrationViewModel m10440n = m10440n();
        m10440n.getNextStepRequestOtpInput().observe(getViewLifecycleOwner(), new C15112a(new OneInputInfoFragment$initViewModel$1$1(this)));
        m10440n.getLiveDataState().observe(getViewLifecycleOwner(), new C15112a(new OneInputInfoFragment$initViewModel$1$2(this)));
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneInputInfoFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneInputInfoFragment::class.java.name");
        return name;
    }

    /* renamed from: m */
    public final OneRegistrationActivity m10441m() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity");
        return (OneRegistrationActivity) activity;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_one_input_info, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        m10441m().hideKeyboard();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m10441m().showKeyboard();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            m10441m().setKeyboardUtil(new KeyboardUtil(context, view, false, 4, null));
        }
        bindingView(view);
        initView();
        m10438p();
    }
}