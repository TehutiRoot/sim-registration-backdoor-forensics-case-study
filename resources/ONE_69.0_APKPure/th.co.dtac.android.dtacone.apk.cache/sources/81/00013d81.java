package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
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
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonRed;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextLayoutView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.KeyboardUtil;
import th.p047co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J-\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00100\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00102\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u00104R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u00104R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u00104R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010CR\u0014\u0010G\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010F¨\u0006I"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/registration/fragment/OneSetPasswordFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", OperatorName.CLOSE_AND_STROKE, "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "o", "initView", "p", "Landroid/view/View;", Promotion.ACTION_VIEW, "binding", "(Landroid/view/View;)V", OperatorName.SET_LINE_WIDTH, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "x", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Constant.ServiceAPIName.onStart, "onPause", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getScreenName", "()Ljava/lang/String;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "i", "Landroidx/appcompat/widget/LinearLayoutCompat;", "layoutPhoneNumberOnline", OperatorName.SET_LINE_JOINSTYLE, "layoutRtrCodeVerify", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/app_one/widget/OneTextLayoutView;", "tvRtrCode", OperatorName.LINE_TO, "tvPhoneNumber", OperatorName.MOVE_TO, "tvRtrCodeVerify", OperatorName.ENDPATH, "tvPhoneNumberOnline", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "edtVerifyOTP", "edtVerifyID", OperatorName.SAVE, "edtPassword", PDPageLabelRange.STYLE_ROMAN_LOWER, "edtConfirmPassword", "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonRed;", "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonRed;", "btnRegister", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "t", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "requestOTP", "Lth/co/dtac/android/dtacone/view/appOne/registration/activity/OneRegistrationActivity;", "()Lth/co/dtac/android/dtacone/view/appOne/registration/activity/OneRegistrationActivity;", "registrationActivity", "Lth/co/dtac/android/dtacone/app_one/viewmodel/registration/OneRegistrationViewModel;", "()Lth/co/dtac/android/dtacone/app_one/viewmodel/registration/OneRegistrationViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment */
/* loaded from: classes10.dex */
public final class OneSetPasswordFragment extends BaseFragment {

    /* renamed from: i */
    public LinearLayoutCompat f96214i;

    /* renamed from: j */
    public LinearLayoutCompat f96215j;

    /* renamed from: k */
    public OneTextLayoutView f96216k;

    /* renamed from: l */
    public OneTextLayoutView f96217l;

    /* renamed from: m */
    public OneTextLayoutView f96218m;

    /* renamed from: n */
    public OneTextLayoutView f96219n;

    /* renamed from: o */
    public OneTextInputLayoutText f96220o;

    /* renamed from: p */
    public OneTextInputLayoutText f96221p;

    /* renamed from: q */
    public OneTextInputLayoutText f96222q;

    /* renamed from: r */
    public OneTextInputLayoutText f96223r;

    /* renamed from: s */
    public OneButtonRed f96224s;

    /* renamed from: t */
    public OneFontTextView f96225t;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/registration/fragment/OneSetPasswordFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/registration/fragment/OneSetPasswordFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneSetPasswordFragment newInstance() {
            OneSetPasswordFragment oneSetPasswordFragment = new OneSetPasswordFragment();
            oneSetPasswordFragment.setArguments(new Bundle());
            return oneSetPasswordFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[RegistrationType.values().length];
            try {
                iArr2[RegistrationType.PhoneOnlyOne.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RegistrationType.Phone.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RegistrationType.PhoneMultiple.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RegistrationType.RtrCodeOnlyOne.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RegistrationType.RtrCodeMultiple.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneSetPasswordFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15114a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f96226a;

        public C15114a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f96226a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f96226a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f96226a.invoke(obj);
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.tvRtrCode);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvRtrCode)");
        this.f96216k = (OneTextLayoutView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvPhoneNumber)");
        this.f96217l = (OneTextLayoutView) findViewById2;
        View findViewById3 = view.findViewById(R.id.layoutPhoneNumberOnline);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.layoutPhoneNumberOnline)");
        this.f96214i = (LinearLayoutCompat) findViewById3;
        View findViewById4 = view.findViewById(R.id.tvPhoneNumberOnline);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.tvPhoneNumberOnline)");
        this.f96219n = (OneTextLayoutView) findViewById4;
        View findViewById5 = view.findViewById(R.id.edtVerifyOTP);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.edtVerifyOTP)");
        this.f96220o = (OneTextInputLayoutText) findViewById5;
        View findViewById6 = view.findViewById(R.id.layoutRtrCodeVerify);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "view.findViewById(R.id.layoutRtrCodeVerify)");
        this.f96215j = (LinearLayoutCompat) findViewById6;
        View findViewById7 = view.findViewById(R.id.tvRtrCodeVerify);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "view.findViewById(R.id.tvRtrCodeVerify)");
        this.f96218m = (OneTextLayoutView) findViewById7;
        View findViewById8 = view.findViewById(R.id.edtVerifyID);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "view.findViewById(R.id.edtVerifyID)");
        OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) findViewById8;
        this.f96221p = oneTextInputLayoutText;
        if (oneTextInputLayoutText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtVerifyID");
            oneTextInputLayoutText = null;
        }
        oneTextInputLayoutText.blockPasteChar();
        View findViewById9 = view.findViewById(R.id.edtPassword);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "view.findViewById(R.id.edtPassword)");
        this.f96222q = (OneTextInputLayoutText) findViewById9;
        View findViewById10 = view.findViewById(R.id.edtConfirmPassword);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "view.findViewById(R.id.edtConfirmPassword)");
        this.f96223r = (OneTextInputLayoutText) findViewById10;
        View findViewById11 = view.findViewById(R.id.btnRegister);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "view.findViewById(R.id.btnRegister)");
        this.f96224s = (OneButtonRed) findViewById11;
        View findViewById12 = view.findViewById(R.id.requestOTP);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "view.findViewById(R.id.requestOTP)");
        this.f96225t = (OneFontTextView) findViewById12;
    }

    private final void initView() {
        String str;
        String str2;
        String phoneNumber;
        String pretty;
        OneFontTextView oneFontTextView = this.f96225t;
        OneTextLayoutView oneTextLayoutView = null;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestOTP");
            oneFontTextView = null;
        }
        OneFontTextView oneFontTextView2 = this.f96225t;
        if (oneFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestOTP");
            oneFontTextView2 = null;
        }
        oneFontTextView.setPaintFlags(oneFontTextView2.getPaintFlags() | 8);
        OneFontTextView oneFontTextView3 = this.f96225t;
        if (oneFontTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestOTP");
            oneFontTextView3 = null;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneFontTextView3, new OneSetPasswordFragment$initView$1(this));
        OneTextLayoutView oneTextLayoutView2 = this.f96216k;
        if (oneTextLayoutView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRtrCode");
            oneTextLayoutView2 = null;
        }
        OneInputInfoData inputData = m10425r().getInputData();
        String str3 = "";
        oneTextLayoutView2.setText((inputData == null || (r1 = inputData.getRtrCode()) == null) ? "" : "");
        OneTextLayoutView oneTextLayoutView3 = this.f96217l;
        if (oneTextLayoutView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumber");
            oneTextLayoutView3 = null;
        }
        OneInputInfoData inputData2 = m10425r().getInputData();
        if (inputData2 != null && (phoneNumber = inputData2.getPhoneNumber()) != null && (pretty = PhoneNumberExtKt.toPretty(phoneNumber)) != null) {
            str3 = pretty;
        }
        oneTextLayoutView3.setText(str3);
        int i = WhenMappings.$EnumSwitchMapping$1[m10425r().getRegistrationType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            m10420w();
                            return;
                        }
                        m10418y();
                        OneTextLayoutView oneTextLayoutView4 = this.f96218m;
                        if (oneTextLayoutView4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvRtrCodeVerify");
                            oneTextLayoutView4 = null;
                        }
                        oneTextLayoutView4.setText(m10425r().getRtrCodeVerify());
                        OneTextLayoutView oneTextLayoutView5 = this.f96218m;
                        if (oneTextLayoutView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvRtrCodeVerify");
                        } else {
                            oneTextLayoutView = oneTextLayoutView5;
                        }
                        oneTextLayoutView.setOnClickListener(new View.OnClickListener() { // from class: ud1
                            {
                                OneSetPasswordFragment.this = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OneSetPasswordFragment.m10422u(OneSetPasswordFragment.this, view);
                            }
                        });
                        return;
                    }
                    m10418y();
                    OneTextLayoutView oneTextLayoutView6 = this.f96218m;
                    if (oneTextLayoutView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRtrCodeVerify");
                        oneTextLayoutView6 = null;
                    }
                    oneTextLayoutView6.setText(m10425r().getRtrCodeVerify());
                    OneTextLayoutView oneTextLayoutView7 = this.f96218m;
                    if (oneTextLayoutView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRtrCodeVerify");
                        oneTextLayoutView7 = null;
                    }
                    oneTextLayoutView7.isShowIconRight(false);
                    OneTextLayoutView oneTextLayoutView8 = this.f96218m;
                    if (oneTextLayoutView8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRtrCodeVerify");
                        oneTextLayoutView8 = null;
                    }
                    oneTextLayoutView8.setOnClickListener(null);
                    return;
                }
                m10419x();
                OneTextLayoutView oneTextLayoutView9 = this.f96219n;
                if (oneTextLayoutView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumberOnline");
                    oneTextLayoutView9 = null;
                }
                String phoneNumberOnline = m10425r().getPhoneNumberOnline();
                if (phoneNumberOnline != null) {
                    str2 = PhoneNumberExtKt.toPretty(phoneNumberOnline);
                } else {
                    str2 = null;
                }
                oneTextLayoutView9.setText(str2);
                OneTextLayoutView oneTextLayoutView10 = this.f96219n;
                if (oneTextLayoutView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumberOnline");
                    oneTextLayoutView10 = null;
                }
                oneTextLayoutView10.isShowIconRight(true);
                OneTextLayoutView oneTextLayoutView11 = this.f96219n;
                if (oneTextLayoutView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumberOnline");
                } else {
                    oneTextLayoutView = oneTextLayoutView11;
                }
                oneTextLayoutView.setOnClickListener(new View.OnClickListener() { // from class: td1
                    {
                        OneSetPasswordFragment.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OneSetPasswordFragment.m10423t(OneSetPasswordFragment.this, view);
                    }
                });
                return;
            }
            m10420w();
            return;
        }
        m10419x();
        OneTextLayoutView oneTextLayoutView12 = this.f96219n;
        if (oneTextLayoutView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumberOnline");
            oneTextLayoutView12 = null;
        }
        String phoneNumberOnline2 = m10425r().getPhoneNumberOnline();
        if (phoneNumberOnline2 != null) {
            str = PhoneNumberExtKt.toPretty(phoneNumberOnline2);
        } else {
            str = null;
        }
        oneTextLayoutView12.setText(str);
        OneTextLayoutView oneTextLayoutView13 = this.f96219n;
        if (oneTextLayoutView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumberOnline");
            oneTextLayoutView13 = null;
        }
        oneTextLayoutView13.isShowIconRight(false);
        OneTextLayoutView oneTextLayoutView14 = this.f96219n;
        if (oneTextLayoutView14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumberOnline");
            oneTextLayoutView14 = null;
        }
        oneTextLayoutView14.setOnClickListener(null);
    }

    @JvmStatic
    @NotNull
    public static final OneSetPasswordFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: q */
    public final OneRegistrationActivity m10426q() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.registration.activity.OneRegistrationActivity");
        return (OneRegistrationActivity) activity;
    }

    /* renamed from: r */
    public final OneRegistrationViewModel m10425r() {
        return m10426q().getViewModel();
    }

    /* renamed from: s */
    public final void m10424s(StatusResource statusResource) {
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

    /* renamed from: t */
    public static final void m10423t(OneSetPasswordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m10427p();
    }

    /* renamed from: u */
    public static final void m10422u(OneSetPasswordFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m10427p();
    }

    /* renamed from: v */
    private final void m10421v() {
        OneRegistrationViewModel m10425r = m10425r();
        m10425r.getNextStepRequestOtpOnlineRefresh().observe(getViewLifecycleOwner(), new C15114a(new OneSetPasswordFragment$initViewModel$1$1(this, m10425r)));
        m10425r.getVerifyOnlineToken().observe(getViewLifecycleOwner(), new C15114a(new OneSetPasswordFragment$initViewModel$1$2(this)));
        m10425r.getRegisterOwner().observe(getViewLifecycleOwner(), new C15114a(new OneSetPasswordFragment$initViewModel$1$3(this)));
        m10425r.getLiveDataState().observe(getViewLifecycleOwner(), new C15114a(new OneSetPasswordFragment$initViewModel$1$4(this)));
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneSetPasswordFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneSetPasswordFragment::class.java.name");
        return name;
    }

    /* renamed from: o */
    public final void m10428o() {
        OneButtonRed oneButtonRed = this.f96224s;
        if (oneButtonRed == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnRegister");
            oneButtonRed = null;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneButtonRed, new OneSetPasswordFragment$actionRegister$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_one_set_password, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        m10426q().hideKeyboard();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m10426q().showKeyboard();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            m10426q().setKeyboardUtil(new KeyboardUtil(context, view, false, 4, null));
        }
        binding(view);
        initView();
        m10421v();
        m10428o();
    }

    /* renamed from: p */
    public final void m10427p() {
        OneRtrPhoneDialog newInstance = OneRtrPhoneDialog.Companion.newInstance(m10425r().getRegistrationType());
        newInstance.setLastSelectedItem(m10425r().getItemSelected());
        ArrayList<SimData> simData = m10425r().getGetRtrCodeAndSimRList().getValue();
        if (simData != null) {
            Intrinsics.checkNotNullExpressionValue(simData, "simData");
            newInstance.setData(simData);
            newInstance.setOnButtonClick(new OneSetPasswordFragment$dialogMultiplePhoneAndRtrCode$1$1$1(this, newInstance));
            m10426q().hideKeyboard();
            newInstance.show(m10426q().getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: w */
    public final void m10420w() {
        LinearLayoutCompat linearLayoutCompat = this.f96214i;
        OneTextInputLayoutText oneTextInputLayoutText = null;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutPhoneNumberOnline");
            linearLayoutCompat = null;
        }
        ViewVisibleExtKt.toGone(linearLayoutCompat);
        LinearLayoutCompat linearLayoutCompat2 = this.f96215j;
        if (linearLayoutCompat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRtrCodeVerify");
            linearLayoutCompat2 = null;
        }
        ViewVisibleExtKt.toGone(linearLayoutCompat2);
        OneFontTextView oneFontTextView = this.f96225t;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestOTP");
            oneFontTextView = null;
        }
        ViewVisibleExtKt.toGone(oneFontTextView);
        OneTextInputLayoutText oneTextInputLayoutText2 = this.f96222q;
        if (oneTextInputLayoutText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtPassword");
        } else {
            oneTextInputLayoutText = oneTextInputLayoutText2;
        }
        oneTextInputLayoutText.focus();
    }

    /* renamed from: x */
    public final void m10419x() {
        LinearLayoutCompat linearLayoutCompat = this.f96214i;
        OneTextInputLayoutText oneTextInputLayoutText = null;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutPhoneNumberOnline");
            linearLayoutCompat = null;
        }
        ViewVisibleExtKt.toVisible(linearLayoutCompat);
        LinearLayoutCompat linearLayoutCompat2 = this.f96215j;
        if (linearLayoutCompat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRtrCodeVerify");
            linearLayoutCompat2 = null;
        }
        ViewVisibleExtKt.toGone(linearLayoutCompat2);
        OneFontTextView oneFontTextView = this.f96225t;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestOTP");
            oneFontTextView = null;
        }
        ViewVisibleExtKt.toVisible(oneFontTextView);
        OneTextInputLayoutText oneTextInputLayoutText2 = this.f96220o;
        if (oneTextInputLayoutText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtVerifyOTP");
        } else {
            oneTextInputLayoutText = oneTextInputLayoutText2;
        }
        oneTextInputLayoutText.focus();
    }

    /* renamed from: y */
    public final void m10418y() {
        LinearLayoutCompat linearLayoutCompat = this.f96214i;
        OneTextInputLayoutText oneTextInputLayoutText = null;
        if (linearLayoutCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutPhoneNumberOnline");
            linearLayoutCompat = null;
        }
        ViewVisibleExtKt.toGone(linearLayoutCompat);
        LinearLayoutCompat linearLayoutCompat2 = this.f96215j;
        if (linearLayoutCompat2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRtrCodeVerify");
            linearLayoutCompat2 = null;
        }
        ViewVisibleExtKt.toVisible(linearLayoutCompat2);
        OneFontTextView oneFontTextView = this.f96225t;
        if (oneFontTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestOTP");
            oneFontTextView = null;
        }
        ViewVisibleExtKt.toGone(oneFontTextView);
        OneTextInputLayoutText oneTextInputLayoutText2 = this.f96221p;
        if (oneTextInputLayoutText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("edtVerifyID");
        } else {
            oneTextInputLayoutText = oneTextInputLayoutText2;
        }
        oneTextInputLayoutText.focus();
    }
}