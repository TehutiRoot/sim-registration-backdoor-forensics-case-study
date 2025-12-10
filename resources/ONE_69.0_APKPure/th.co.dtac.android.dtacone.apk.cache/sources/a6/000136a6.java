package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonCheckBoxExpired;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonPersonIdLengthRule;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.databinding.FragmentOnePostpaidIdCardFormBinding;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidThemeColorModel;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.livedata.EventObserver;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.constant.postpaid.IdDocumentType;
import th.p047co.dtac.android.dtacone.util.date.DateTime;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.blacklist.OnePostpaidCheckBlacklistFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001ZB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\u0006J!\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\tR\"\u00109\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010Y\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\bY\u0010X¨\u0006["}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBoxConfirm$ConfirmDialogListener;", "Ljava/lang/Void;", "<init>", "()V", "", "F", "()Ljava/lang/String;", "", "initView", ExifInterface.LONGITUDE_EAST, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "D", "(Lth/co/dtac/android/dtacone/model/error/ErrorCollection;)V", "message", "messageIDXDevice", "C", "(Ljava/lang/String;Ljava/lang/String;)V", "t", OperatorName.CLOSE_AND_STROKE, "A", "gotoCamera", "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", "u", "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setTheme", Constant.ServiceAPIName.onStart, "", "requestCode", "result", "onOkButtonClick", "(ILjava/lang/Void;)V", "onCancelButtonClick", "(I)V", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener$DrawablePosition;", TypedValues.AttributesType.S_TARGET, "onClickDrawable", "(Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener$DrawablePosition;)V", "getScreenName", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", "setFileUtil", "(Lth/co/dtac/android/dtacone/util/FileUtil;)V", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "setInputMethodManager", "(Landroid/view/inputmethod/InputMethodManager;)V", "Lth/co/dtac/android/dtacone/databinding/FragmentOnePostpaidIdCardFormBinding;", "i", "Lth/co/dtac/android/dtacone/databinding/FragmentOnePostpaidIdCardFormBinding;", "binding", "Landroid/view/View$OnTouchListener;", OperatorName.SET_LINE_JOINSTYLE, "Landroid/view/View$OnTouchListener;", "onTouch", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/activity/OnePostpaidRegistrationActivity;", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/activity/OnePostpaidRegistrationActivity;", "postpaidActivity", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidRegistrationViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidRegistrationViewModel;", "viewModel", "", "isWithContract", "()Z", "isWithDevice", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnePostpaidIdCardFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidIdCardFormFragment.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidIdCardFormFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment */
/* loaded from: classes10.dex */
public final class OnePostpaidIdCardFormFragment extends BaseFragment implements DrawableClickListener, OneCustomDialogBoxConfirm.ConfirmDialogListener<Void> {
    @Inject
    public FileUtil fileUtil;

    /* renamed from: i */
    public FragmentOnePostpaidIdCardFormBinding f93460i;
    @Inject
    public InputMethodManager inputMethodManager;

    /* renamed from: j */
    public final View.OnTouchListener f93461j = new View.OnTouchListener() { // from class: Y11
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return OnePostpaidIdCardFormFragment.m12607o(OnePostpaidIdCardFormFragment.this, view, motionEvent);
        }
    };
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidIdCardFormFragment$Companion;", "", "()V", "EXTRA_FACE_RECOGN_REREAD_SMART_CARD", "", "REQUEST_CODE_1ID_1DEVICE", "", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidIdCardFormFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OnePostpaidIdCardFormFragment newInstance() {
            OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment = new OnePostpaidIdCardFormFragment();
            onePostpaidIdCardFormFragment.setArguments(new Bundle());
            return onePostpaidIdCardFormFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment$WhenMappings */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment$a */
    /* loaded from: classes10.dex */
    public static final class C14863a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f93462a;

        public C14863a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f93462a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f93462a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f93462a.invoke(obj);
        }
    }

    /* renamed from: B */
    public static final boolean m12614B(OnePostpaidIdCardFormFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m12600v();
        return false;
    }

    private final void gotoCamera() {
        getViewModel().setIdDocType(IdDocumentType.ID_CARD);
        m12604r().replaceFragment(OnePostpaidIdCardCameraFragment.Companion.newInstance(), null);
    }

    private final void initView() {
        final FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding = this.f93460i;
        if (fragmentOnePostpaidIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOnePostpaidIdCardFormBinding = null;
        }
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.requestFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: V11
            @Override // java.lang.Runnable
            public final void run() {
                OnePostpaidIdCardFormFragment.m12605q(OnePostpaidIdCardFormFragment.this, fragmentOnePostpaidIdCardFormBinding);
            }
        }, 0L);
        fragmentOnePostpaidIdCardFormBinding.flRoot.setOnTouchListener(this.f93461j);
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(17)});
        OneCustomClearableEditText postpaidEdtIdCard = fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard;
        Intrinsics.checkNotNullExpressionValue(postpaidEdtIdCard, "postpaidEdtIdCard");
        EditTextextKt.maskFormat(postpaidEdtIdCard, Constant.NATION_CARD_FORMAT);
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: W11
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return OnePostpaidIdCardFormFragment.m12606p(OnePostpaidIdCardFormFragment.this, textView, i, keyEvent);
            }
        });
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setText("");
        fragmentOnePostpaidIdCardFormBinding.postpaidIdCardBtnNext.setOnClickListener(new View.OnClickListener() { // from class: X11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnePostpaidIdCardFormFragment.m12608n(OnePostpaidIdCardFormFragment.this, view);
            }
        });
    }

    /* renamed from: m */
    public static /* synthetic */ void m12609m(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment) {
        m12599w(onePostpaidIdCardFormFragment);
    }

    /* renamed from: n */
    public static /* synthetic */ void m12608n(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment, View view) {
        m12596z(onePostpaidIdCardFormFragment, view);
    }

    @JvmStatic
    @NotNull
    public static final OnePostpaidIdCardFormFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m12607o(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment, View view, MotionEvent motionEvent) {
        return m12614B(onePostpaidIdCardFormFragment, view, motionEvent);
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m12606p(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment, TextView textView, int i, KeyEvent keyEvent) {
        return m12597y(onePostpaidIdCardFormFragment, textView, i, keyEvent);
    }

    /* renamed from: q */
    public static /* synthetic */ void m12605q(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment, FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding) {
        m12598x(onePostpaidIdCardFormFragment, fragmentOnePostpaidIdCardFormBinding);
    }

    /* renamed from: u */
    public final void m12601u(StatusResource statusResource) {
        int i;
        if (statusResource == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[statusResource.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                dismissSecondaryLoading();
                return;
            }
            return;
        }
        showSecondaryLoading();
    }

    /* renamed from: w */
    public static final void m12599w(OnePostpaidIdCardFormFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InputMethodManager inputMethodManager = this$0.getInputMethodManager();
        FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding = this$0.f93460i;
        if (fragmentOnePostpaidIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOnePostpaidIdCardFormBinding = null;
        }
        inputMethodManager.hideSoftInputFromWindow(fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.getWindowToken(), 0);
    }

    /* renamed from: x */
    public static final void m12598x(OnePostpaidIdCardFormFragment this$0, FragmentOnePostpaidIdCardFormBinding this_apply) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.getInputMethodManager().showSoftInput(this_apply.postpaidEdtIdCard, 1);
    }

    /* renamed from: y */
    public static final boolean m12597y(OnePostpaidIdCardFormFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 6) {
            this$0.m12611E();
            return false;
        }
        return false;
    }

    /* renamed from: z */
    public static final void m12596z(OnePostpaidIdCardFormFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m12611E();
    }

    /* renamed from: A */
    public final void m12615A() {
        getViewModel().clearSignatureFile();
        m12604r().replaceFragment(OnePostpaidCheckBlacklistFragment.Companion.newInstance$default(OnePostpaidCheckBlacklistFragment.Companion, null, 1, null), null);
    }

    /* renamed from: C */
    public final void m12613C(String str, String str2) {
        OneCustomDialogBoxConfirm create = new OneCustomDialogBoxConfirm.Builder().setLayout(R.layout.dialog_one_postpaid_one_id_one_device).setMessage(str).setMessageIDXDevice(str2).setTextOkButton(R.string.one_postpaid_cancel_buy_device).setTextCancelButton(R.string.one_postpaid_confirm_buy_device).setTimestamp(DateTime.INSTANCE.errorDateTimeFormat()).setUser(getViewModel().userName()).setCancelable(false).create();
        create.setTargetFragment(this, 0);
        create.show(getParentFragmentManager(), (String) null);
    }

    /* renamed from: D */
    public final void m12612D(ErrorCollection errorCollection) {
        String string;
        String errorDateTimeFormat;
        String str;
        OneDialogBoxConfirm.Companion companion = OneDialogBoxConfirm.Companion;
        if (errorCollection == null || (string = errorCollection.getDescription()) == null) {
            string = getString(R.string.one_max_allow_waning_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.one_max_allow_waning_message)");
        }
        String str2 = string;
        int i = R.string.one_postpaid_max_allow_error_sub_message;
        if (errorCollection == null || (errorDateTimeFormat = errorCollection.getResponseDateTime()) == null) {
            errorDateTimeFormat = DateTime.INSTANCE.errorDateTimeFormat();
        }
        String username = getViewModel().username();
        String company = getViewModel().getCompany();
        if (errorCollection != null) {
            str = errorCollection.getStatusCode();
        } else {
            str = null;
        }
        OneDialogBoxConfirm newInstance$default = OneDialogBoxConfirm.Companion.newInstance$default(companion, null, str2, getString(i, errorDateTimeFormat, username, company, str), getString(R.string.not_want), getString(R.string.want), true, Integer.valueOf(m12604r().getViewModel().getThemeColorModel().getButtonBackground()), Integer.valueOf(m12604r().getViewModel().getThemeColorModel().getButtonBackgroundRounded()), Integer.valueOf(m12604r().getViewModel().getThemeColorModel().getFontColorDialog()), 1, null);
        newInstance$default.setOnClickListener(new OneDialogBoxConfirm.OnClickButtonListener() { // from class: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment$showDialogMaxAllow$dialog$1$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm.OnClickButtonListener
            public void onClickLeftButton() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm.OnClickButtonListener
            public void onClickRightButton() {
                OnePostpaidIdCardFormFragment.this.getViewModel().verifyAndGenAutoApproveCode();
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.beginTransaction();
        newInstance$default.show(childFragmentManager, (String) null);
    }

    /* renamed from: E */
    public final void m12611E() {
        try {
            FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding = this.f93460i;
            IdCardInformationCollection idCardInformationCollection = null;
            if (fragmentOnePostpaidIdCardFormBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentOnePostpaidIdCardFormBinding = null;
            }
            String stringFormat = ViewTextExtKt.toStringFormat(fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard);
            new OneCommonPersonIdLengthRule().validate(AbstractC19741eO1.replace$default(stringFormat, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "", false, 4, (Object) null));
            OneCommonCheckBoxExpired oneCommonCheckBoxExpired = new OneCommonCheckBoxExpired();
            FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding2 = this.f93460i;
            if (fragmentOnePostpaidIdCardFormBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentOnePostpaidIdCardFormBinding2 = null;
            }
            oneCommonCheckBoxExpired.validate((CheckBox) fragmentOnePostpaidIdCardFormBinding2.postpaidCheckBoxNotifyIdCardExpired);
            getViewModel().setIdDocType(IdDocumentType.ID_CARD);
            OnePostpaidRegistrationViewModel viewModel = getViewModel();
            if (getViewModel().isSmartCard() && getViewModel().getCardInformation() != null) {
                idCardInformationCollection = getViewModel().getCardInformation();
            }
            viewModel.validateInputID(idCardInformationCollection, StringExtKt.toRemoveWhiteSpace(stringFormat), "01", getViewModel().isSmartCard());
        } catch (ValidatedRuleException e) {
            showDialogOne(e.getResId());
        }
    }

    /* renamed from: F */
    public final String m12610F() {
        OnePostpaidRegistrationViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        viewModel.setTagFace((arguments == null || (r1 = arguments.getString("EXTRA_FACE_RECOGN_REREAD_SMART_CARD")) == null) ? "" : "");
        return getViewModel().getTagFace();
    }

    @NotNull
    public final FileUtil getFileUtil() {
        FileUtil fileUtil = this.fileUtil;
        if (fileUtil != null) {
            return fileUtil;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileUtil");
        return null;
    }

    @NotNull
    public final InputMethodManager getInputMethodManager() {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inputMethodManager");
        return null;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        return TrackerConstant.MRTR_POSTPAID_FORM;
    }

    @NotNull
    public final OnePostpaidRegistrationViewModel getViewModel() {
        return m12604r().getViewModel();
    }

    public final boolean isWithContract() {
        return getViewModel().isWithContract();
    }

    public final boolean isWithDevice() {
        return getViewModel().isWithDevice();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm.ConfirmDialogListener
    public void onCancelButtonClick(int i) {
        String m12610F;
        if (!getViewModel().isSmartCard()) {
            if (isWithContract() && isWithDevice()) {
                getViewModel().callAPICheckExternalBlacklistFlag();
            } else {
                gotoCamera();
            }
        } else if (i == 0) {
            if (isWithContract() && isWithDevice()) {
                getViewModel().callAPICheckExternalBlacklistFlag();
                return;
            }
            if (getFileUtil().isFileExist(BitmapUtil.IMAGE_COMPARE) && (m12610F = m12610F()) != null && m12610F.length() != 0) {
                m12602t();
            } else {
                m12603s();
            }
            getViewModel().setTagFace("");
        }
    }

    @Override // th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener
    public void onClickDrawable(@NotNull DrawableClickListener.DrawablePosition target) {
        Intrinsics.checkNotNullParameter(target, "target");
        FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding = this.f93460i;
        if (fragmentOnePostpaidIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOnePostpaidIdCardFormBinding = null;
        }
        OneCustomClearableEditText oneCustomClearableEditText = fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard;
        Intrinsics.checkNotNullExpressionValue(oneCustomClearableEditText, "binding.postpaidEdtIdCard");
        ViewTextExtKt.toStringEmpty(oneCustomClearableEditText);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOnePostpaidIdCardFormBinding inflate = FragmentOnePostpaidIdCardFormBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.f93460i = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        FrameLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm.ConfirmDialogListener
    public void onOkButtonClick(int i, @Nullable Void r2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OnePostpaidRegistrationViewModel viewModel = getViewModel();
        viewModel.getNavigateNext().observe(getViewLifecycleOwner(), new EventObserver(new OnePostpaidIdCardFormFragment$onStart$1$1(this)));
        viewModel.getShowDialogMaxAllow().observe(getViewLifecycleOwner(), new C14863a(new OnePostpaidIdCardFormFragment$onStart$1$2(this)));
        viewModel.getShowWarningDialog().observe(getViewLifecycleOwner(), new C14863a(new OnePostpaidIdCardFormFragment$onStart$1$3(this)));
        viewModel.getNavigateConsentXSimTemplate().observe(getViewLifecycleOwner(), new C14863a(new OnePostpaidIdCardFormFragment$onStart$1$4(this)));
        viewModel.getNavigateConsentTemplate().observe(getViewLifecycleOwner(), new C14863a(new OnePostpaidIdCardFormFragment$onStart$1$5(viewModel, this)));
        viewModel.getLiveDataState().observe(getViewLifecycleOwner(), new C14863a(new OnePostpaidIdCardFormFragment$onStart$1$6(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object systemService = requireContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        setInputMethodManager((InputMethodManager) systemService);
        initView();
        setTheme();
    }

    /* renamed from: r */
    public final OnePostpaidRegistrationActivity m12604r() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity");
        return (OnePostpaidRegistrationActivity) activity;
    }

    /* renamed from: s */
    public final void m12603s() {
        m12604r().replaceFragment(OnePostpaidCustomerCameraFragment.Companion.newInstance(), null);
    }

    public final void setFileUtil(@NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(fileUtil, "<set-?>");
        this.fileUtil = fileUtil;
    }

    public final void setInputMethodManager(@NotNull InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "<set-?>");
        this.inputMethodManager = inputMethodManager;
    }

    public final void setTheme() {
        OnePostpaidThemeColorModel themeColorModel = getViewModel().getThemeColorModel();
        FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding = this.f93460i;
        if (fragmentOnePostpaidIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOnePostpaidIdCardFormBinding = null;
        }
        fragmentOnePostpaidIdCardFormBinding.postpaidIdCardBtnNext.setBackgroundResource(themeColorModel.getButtonBackground());
        fragmentOnePostpaidIdCardFormBinding.postpaidCheckBoxNotifyIdCardExpired.setButtonDrawable(themeColorModel.getCheckBox());
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getEditTextColor(), null));
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setFocusColor(themeColorModel.getEditTextColor());
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setBackgroundResource(themeColorModel.getEditTextBackground());
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setHighlightColor(ResourcesCompat.getColor(getResources(), themeColorModel.getEditTextHighlightColor(), null));
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setTextAndCompoundColor(themeColorModel.getEditTextColor());
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setLinkTextColor(ResourcesCompat.getColor(getResources(), themeColorModel.getEditTextColor(), null));
        if (Build.VERSION.SDK_INT >= 29) {
            fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.setTextCursorDrawable(themeColorModel.getEditTextCursor());
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
            declaredField.setAccessible(true);
            declaredField.set(fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard, Integer.valueOf(themeColorModel.getEditTextCursor()));
        } catch (Exception unused) {
        }
    }

    /* renamed from: t */
    public final void m12602t() {
        m12604r().replaceFragment(OnePostpaidFaceRecognitionFragment.Companion.newInstance());
    }

    /* renamed from: v */
    public final void m12600v() {
        FragmentOnePostpaidIdCardFormBinding fragmentOnePostpaidIdCardFormBinding = this.f93460i;
        if (fragmentOnePostpaidIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOnePostpaidIdCardFormBinding = null;
        }
        fragmentOnePostpaidIdCardFormBinding.postpaidEdtIdCard.clearFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: Z11
            @Override // java.lang.Runnable
            public final void run() {
                OnePostpaidIdCardFormFragment.m12609m(OnePostpaidIdCardFormFragment.this);
            }
        }, 0L);
    }
}