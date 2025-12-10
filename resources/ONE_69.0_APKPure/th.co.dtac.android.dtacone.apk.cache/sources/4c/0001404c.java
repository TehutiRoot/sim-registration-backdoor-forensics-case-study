package th.p047co.dtac.android.dtacone.view.appOne.tol.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
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
import androidx.annotation.OptIn;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import th.p047co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineIdCardFormBinding;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.livedata.EventObserver;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener;

@StabilityInferred(parameters = 0)
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@Metadata(m29143d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001OB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0006J!\u0010\"\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u000eJ)\u0010(\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010N\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineIdCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBoxConfirm$ConfirmDialogListener;", "Ljava/lang/Void;", "<init>", "()V", "", "initView", "A", "t", "", "requestCode", "z", "(I)V", "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", OperatorName.CLOSE_AND_STROKE, "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setTheme", Constant.ServiceAPIName.onStart, "result", "onOkButtonClick", "(ILjava/lang/Void;)V", "onCancelButtonClick", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener$DrawablePosition;", TypedValues.AttributesType.S_TARGET, "onClickDrawable", "(Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener$DrawablePosition;)V", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", "setFileUtil", "(Lth/co/dtac/android/dtacone/util/FileUtil;)V", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "()Landroid/view/inputmethod/InputMethodManager;", "setInputMethodManager", "(Landroid/view/inputmethod/InputMethodManager;)V", "Lth/co/dtac/android/dtacone/databinding/FragmentOneRegisterTrueOnlineIdCardFormBinding;", "i", "Lth/co/dtac/android/dtacone/databinding/FragmentOneRegisterTrueOnlineIdCardFormBinding;", "binding", "Landroid/view/View$OnTouchListener;", OperatorName.SET_LINE_JOINSTYLE, "Landroid/view/View$OnTouchListener;", "onTouch", "Lth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity;", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Lth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity;", "tolActivity", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineIdCardFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineIdCardFormFragment.kt\nth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineIdCardFormFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineIdCardFormFragment extends BaseFragment implements DrawableClickListener, OneCustomDialogBoxConfirm.ConfirmDialogListener<Void> {
    @Inject
    public FileUtil fileUtil;

    /* renamed from: i */
    public FragmentOneRegisterTrueOnlineIdCardFormBinding f97761i;
    @Inject
    public InputMethodManager inputMethodManager;

    /* renamed from: j */
    public final View.OnTouchListener f97762j = new View.OnTouchListener() { // from class: jb1
        {
            OneRegisterTrueOnlineIdCardFormFragment.this = this;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean m9684y;
            m9684y = OneRegisterTrueOnlineIdCardFormFragment.m9684y(OneRegisterTrueOnlineIdCardFormFragment.this, view, motionEvent);
            return m9684y;
        }
    };
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineIdCardFormFragment$Companion;", "", "()V", "EXTRA_FACE_RECOGN_REREAD_SMART_CARD", "", "REQUEST_CODE_1ID_1DEVICE", "", "REQUEST_CODE_MULTIPLE_PHOTO_DIALOG", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineIdCardFormFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneRegisterTrueOnlineIdCardFormFragment newInstance() {
            OneRegisterTrueOnlineIdCardFormFragment oneRegisterTrueOnlineIdCardFormFragment = new OneRegisterTrueOnlineIdCardFormFragment();
            oneRegisterTrueOnlineIdCardFormFragment.setArguments(new Bundle());
            return oneRegisterTrueOnlineIdCardFormFragment;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment$WhenMappings */
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

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15192a implements Observer {
        public C15192a() {
            OneRegisterTrueOnlineIdCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                OneRegisterTrueOnlineIdCardFormFragment oneRegisterTrueOnlineIdCardFormFragment = OneRegisterTrueOnlineIdCardFormFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS) {
                    oneRegisterTrueOnlineIdCardFormFragment.m9683z(2);
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment$b */
    /* loaded from: classes10.dex */
    public static final class C15193b implements Observer {
        public C15193b() {
            OneRegisterTrueOnlineIdCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(StatusResource statusResource) {
            OneRegisterTrueOnlineIdCardFormFragment.this.m9690s(statusResource);
        }
    }

    /* renamed from: A */
    private final void m9697A() {
        try {
            FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding = this.f97761i;
            FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding2 = null;
            if (fragmentOneRegisterTrueOnlineIdCardFormBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fragmentOneRegisterTrueOnlineIdCardFormBinding = null;
            }
            new OneCommonPersonIdLengthRule().validate(AbstractC19741eO1.replace$default(ViewTextExtKt.toStringFormat(fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard), HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "", false, 4, (Object) null));
            OneCommonCheckBoxExpired oneCommonCheckBoxExpired = new OneCommonCheckBoxExpired();
            FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding3 = this.f97761i;
            if (fragmentOneRegisterTrueOnlineIdCardFormBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentOneRegisterTrueOnlineIdCardFormBinding2 = fragmentOneRegisterTrueOnlineIdCardFormBinding3;
            }
            oneCommonCheckBoxExpired.validate((CheckBox) fragmentOneRegisterTrueOnlineIdCardFormBinding2.tolCheckBoxNotifyIdCardExpired);
            getViewModel().setIdDocType("01");
            m9691r().replaceFragment(OneRegisterTrueOnlineSelectNumberFragment.Companion.newInstance("TMH_CVG"), OneRegisterTrueOnlineSelectNumberFragment.class.getName());
        } catch (ValidatedRuleException e) {
            showDialogOne(e.getResId());
        }
    }

    private final void initView() {
        final FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding = this.f97761i;
        if (fragmentOneRegisterTrueOnlineIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOneRegisterTrueOnlineIdCardFormBinding = null;
        }
        fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard.requestFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: kb1
            {
                OneRegisterTrueOnlineIdCardFormFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OneRegisterTrueOnlineIdCardFormFragment.m9687v(OneRegisterTrueOnlineIdCardFormFragment.this, fragmentOneRegisterTrueOnlineIdCardFormBinding);
            }
        }, 0L);
        fragmentOneRegisterTrueOnlineIdCardFormBinding.root.setOnTouchListener(this.f97762j);
        OneCustomClearableEditText tolEdtIdCard = fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard;
        Intrinsics.checkNotNullExpressionValue(tolEdtIdCard, "tolEdtIdCard");
        EditTextextKt.maskFormat(tolEdtIdCard, Constant.NATION_CARD_FORMAT);
        OneCustomClearableEditText oneCustomClearableEditText = fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard;
        oneCustomClearableEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(17)});
        oneCustomClearableEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lb1
            {
                OneRegisterTrueOnlineIdCardFormFragment.this = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m9686w;
                m9686w = OneRegisterTrueOnlineIdCardFormFragment.m9686w(OneRegisterTrueOnlineIdCardFormFragment.this, textView, i, keyEvent);
                return m9686w;
            }
        });
        oneCustomClearableEditText.setText("");
        fragmentOneRegisterTrueOnlineIdCardFormBinding.tolIdCardBtnNext.setOnClickListener(new View.OnClickListener() { // from class: mb1
            {
                OneRegisterTrueOnlineIdCardFormFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneRegisterTrueOnlineIdCardFormFragment.m9685x(OneRegisterTrueOnlineIdCardFormFragment.this, view);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final OneRegisterTrueOnlineIdCardFormFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: s */
    public final void m9690s(StatusResource statusResource) {
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

    /* renamed from: t */
    private final void m9689t() {
        FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding = this.f97761i;
        if (fragmentOneRegisterTrueOnlineIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOneRegisterTrueOnlineIdCardFormBinding = null;
        }
        fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard.clearFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: nb1
            {
                OneRegisterTrueOnlineIdCardFormFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OneRegisterTrueOnlineIdCardFormFragment.m9688u(OneRegisterTrueOnlineIdCardFormFragment.this);
            }
        }, 0L);
    }

    /* renamed from: u */
    public static final void m9688u(OneRegisterTrueOnlineIdCardFormFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InputMethodManager inputMethodManager = this$0.getInputMethodManager();
        FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding = this$0.f97761i;
        if (fragmentOneRegisterTrueOnlineIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOneRegisterTrueOnlineIdCardFormBinding = null;
        }
        inputMethodManager.hideSoftInputFromWindow(fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard.getWindowToken(), 0);
    }

    /* renamed from: v */
    public static final void m9687v(OneRegisterTrueOnlineIdCardFormFragment this$0, FragmentOneRegisterTrueOnlineIdCardFormBinding this_apply) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.getInputMethodManager().showSoftInput(this_apply.tolEdtIdCard, 1);
    }

    /* renamed from: w */
    public static final boolean m9686w(OneRegisterTrueOnlineIdCardFormFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 6) {
            this$0.m9697A();
            return false;
        }
        return false;
    }

    /* renamed from: x */
    public static final void m9685x(OneRegisterTrueOnlineIdCardFormFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m9697A();
    }

    /* renamed from: y */
    public static final boolean m9684y(OneRegisterTrueOnlineIdCardFormFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m9689t();
        return false;
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
        String name = OneRegisterTrueOnlineIdCardFormFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneRegisterTrueOnlineIdC…Fragment::class.java.name");
        return name;
    }

    @NotNull
    public final OneRegisterTrueOnlineViewModel getViewModel() {
        return m9691r().getViewModel();
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm.ConfirmDialogListener
    public void onCancelButtonClick(int i) {
    }

    @Override // th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener
    public void onClickDrawable(@NotNull DrawableClickListener.DrawablePosition target) {
        Intrinsics.checkNotNullParameter(target, "target");
        FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding = this.f97761i;
        if (fragmentOneRegisterTrueOnlineIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOneRegisterTrueOnlineIdCardFormBinding = null;
        }
        OneCustomClearableEditText oneCustomClearableEditText = fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard;
        Intrinsics.checkNotNullExpressionValue(oneCustomClearableEditText, "binding.tolEdtIdCard");
        ViewTextExtKt.toStringEmpty(oneCustomClearableEditText);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOneRegisterTrueOnlineIdCardFormBinding inflate = FragmentOneRegisterTrueOnlineIdCardFormBinding.inflate(LayoutInflater.from(getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        this.f97761i = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        FrameLayout frameLayout = inflate.root;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
        return frameLayout;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm.ConfirmDialogListener
    public void onOkButtonClick(int i, @Nullable Void r2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OneRegisterTrueOnlineViewModel viewModel = getViewModel();
        viewModel.getNavigateNext().observe(getViewLifecycleOwner(), new EventObserver(new OneRegisterTrueOnlineIdCardFormFragment$onStart$1$1(this)));
        viewModel.getShowTakeMorePhotoDialog().observe(getViewLifecycleOwner(), new C15192a());
        viewModel.getLiveDataState().observe(getViewLifecycleOwner(), new C15193b());
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
    public final OneRegisterTrueOnlineActivity m9691r() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity");
        return (OneRegisterTrueOnlineActivity) activity;
    }

    public final void setFileUtil(@NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(fileUtil, "<set-?>");
        this.fileUtil = fileUtil;
    }

    public final void setInputMethodManager(@NotNull InputMethodManager inputMethodManager) {
        Intrinsics.checkNotNullParameter(inputMethodManager, "<set-?>");
        this.inputMethodManager = inputMethodManager;
    }

    @SuppressLint({"PrivateApi"})
    public final void setTheme() {
        FragmentOneRegisterTrueOnlineIdCardFormBinding fragmentOneRegisterTrueOnlineIdCardFormBinding = this.f97761i;
        if (fragmentOneRegisterTrueOnlineIdCardFormBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOneRegisterTrueOnlineIdCardFormBinding = null;
        }
        fragmentOneRegisterTrueOnlineIdCardFormBinding.tolIdCardBtnNext.setBackgroundResource(R.drawable.background_one_button_red);
        fragmentOneRegisterTrueOnlineIdCardFormBinding.tolCheckBoxNotifyIdCardExpired.setButtonDrawable(R.drawable.one_selector_checkbox_red);
        OneCustomClearableEditText oneCustomClearableEditText = fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard;
        oneCustomClearableEditText.setTextColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), R.color.redDark, null));
        oneCustomClearableEditText.setFocusColor(R.color.redDark);
        oneCustomClearableEditText.setBackgroundResource(R.drawable.selector_rectangle_red);
        oneCustomClearableEditText.setHighlightColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), R.color.highlightColorRed, null));
        oneCustomClearableEditText.setTextAndCompoundColor(R.color.redDark);
        oneCustomClearableEditText.setLinkTextColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), R.color.redDark, null));
        if (Build.VERSION.SDK_INT >= 29) {
            fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard.setTextCursorDrawable(R.drawable.background_cursor_red);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
            declaredField.setAccessible(true);
            declaredField.set(fragmentOneRegisterTrueOnlineIdCardFormBinding.tolEdtIdCard, Integer.valueOf(R.drawable.background_cursor_red));
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    public final void m9683z(int i) {
        OneCustomDialogBoxConfirm create = new OneCustomDialogBoxConfirm.Builder().setLayout(R.layout.confirm_take_more_photo_blue_btn_dialog).setMessage(R.string.prepaid_take_more_photo).setTextOkButton(R.string.nextStep).setTextCancelButton(R.string.takeMorePhoto).setCancelable(false).create();
        create.setTargetFragment(this, i);
        create.show(getParentFragmentManager(), (String) null);
    }
}