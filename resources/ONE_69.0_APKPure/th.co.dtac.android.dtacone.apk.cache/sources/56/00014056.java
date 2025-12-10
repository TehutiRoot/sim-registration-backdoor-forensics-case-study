package th.p047co.dtac.android.dtacone.view.appOne.tol.fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.reflect.Field;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonCheckBoxExpired;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneCommonOtherCardLengthRule;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCheckBox;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewTextExtKt;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.livedata.EventObserver;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity;
import th.p047co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOtherCardFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 A2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010@\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineOtherCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBoxConfirm$ConfirmDialogListener;", "Ljava/lang/Void;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "binding", "(Landroid/view/View;)V", OperatorName.CLOSE_AND_STROKE, "Lth/co/dtac/android/dtacone/model/StatusResource;", "it", "p", "(Lth/co/dtac/android/dtacone/model/StatusResource;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setTheme", Constant.ServiceAPIName.onStart, "", "getScreenName", "()Ljava/lang/String;", "", "requestCode", "result", "onOkButtonClick", "(ILjava/lang/Void;)V", "onCancelButtonClick", "(I)V", "Lth/co/dtac/android/dtacone/util/FileUtil;", "fileUtil", "Lth/co/dtac/android/dtacone/util/FileUtil;", "getFileUtil", "()Lth/co/dtac/android/dtacone/util/FileUtil;", "setFileUtil", "(Lth/co/dtac/android/dtacone/util/FileUtil;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", "i", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", "tolOtherEditText", "Lth/co/dtac/android/dtacone/app_one/widget/OneCheckBox;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/app_one/widget/OneCheckBox;", "checkBoxOtherCardNotifyExpired", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "btnNext", "Lth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity;", "o", "()Lth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity;", "tolActivity", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOtherCardFormFragment */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineOtherCardFormFragment extends BaseFragment implements CustomDialogBoxConfirm.ConfirmDialogListener<Void> {
    @Inject
    public FileUtil fileUtil;

    /* renamed from: i */
    public OneCustomClearableEditText f97782i;

    /* renamed from: j */
    public OneCheckBox f97783j;

    /* renamed from: k */
    public OneFontButton f97784k;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineOtherCardFormFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/tol/fragment/OneRegisterTrueOnlineOtherCardFormFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOtherCardFormFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final OneRegisterTrueOnlineOtherCardFormFragment newInstance() {
            return new OneRegisterTrueOnlineOtherCardFormFragment();
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOtherCardFormFragment$WhenMappings */
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

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOtherCardFormFragment$a */
    /* loaded from: classes10.dex */
    public static final class C15194a implements Observer {
        public C15194a() {
            OneRegisterTrueOnlineOtherCardFormFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(StatusResource statusResource) {
            OneRegisterTrueOnlineOtherCardFormFragment.this.m9662p(statusResource);
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.tolPassportEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tolPassportEditText)");
        this.f97782i = (OneCustomClearableEditText) findViewById;
        View findViewById2 = view.findViewById(R.id.checkBoxPassportCardNotifyExpired);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.c…assportCardNotifyExpired)");
        this.f97783j = (OneCheckBox) findViewById2;
        View findViewById3 = view.findViewById(R.id.btnNext);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.btnNext)");
        this.f97784k = (OneFontButton) findViewById3;
    }

    @JvmStatic
    @NotNull
    public static final OneRegisterTrueOnlineOtherCardFormFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: o */
    public final OneRegisterTrueOnlineActivity m9663o() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity");
        return (OneRegisterTrueOnlineActivity) activity;
    }

    /* renamed from: p */
    public final void m9662p(StatusResource statusResource) {
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

    /* renamed from: q */
    public static final boolean m9661q(OneRegisterTrueOnlineOtherCardFormFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 6) {
            this$0.m9659s();
            return false;
        }
        return false;
    }

    /* renamed from: r */
    public static final void m9660r(OneRegisterTrueOnlineOtherCardFormFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m9659s();
    }

    /* renamed from: s */
    private final void m9659s() {
        try {
            OneCustomClearableEditText oneCustomClearableEditText = this.f97782i;
            OneCheckBox oneCheckBox = null;
            if (oneCustomClearableEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
                oneCustomClearableEditText = null;
            }
            new OneCommonOtherCardLengthRule().validate(ViewTextExtKt.toStringFormat(oneCustomClearableEditText));
            OneCommonCheckBoxExpired oneCommonCheckBoxExpired = new OneCommonCheckBoxExpired();
            OneCheckBox oneCheckBox2 = this.f97783j;
            if (oneCheckBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkBoxOtherCardNotifyExpired");
            } else {
                oneCheckBox = oneCheckBox2;
            }
            oneCommonCheckBoxExpired.validate((CheckBox) oneCheckBox);
            getViewModel().setIdDocType("15");
            m9663o().replaceFragment(OneRegisterTrueOnlineSelectNumberFragment.Companion.newInstance("FLP_CVG"), OneRegisterTrueOnlineSelectNumberFragment.class.getName());
        } catch (ValidatedRuleException e) {
            showDialogOne(e.getResId());
        }
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

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = OneRegisterTrueOnlineOtherCardFormFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OneRegisterTrueOnlineOth…Fragment::class.java.name");
        return name;
    }

    @NotNull
    public final OneRegisterTrueOnlineViewModel getViewModel() {
        return m9663o().getViewModel();
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm.ConfirmDialogListener
    public void onCancelButtonClick(int i) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.fragment_one_register_true_online_passport_card_form, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        binding(view);
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OneRegisterTrueOnlineViewModel viewModel = getViewModel();
        viewModel.getNavigateNext().observe(getViewLifecycleOwner(), new EventObserver(new OneRegisterTrueOnlineOtherCardFormFragment$onStart$1$1(this)));
        viewModel.getLiveDataState().observe(getViewLifecycleOwner(), new C15194a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setTheme();
        OneCustomClearableEditText oneCustomClearableEditText = this.f97782i;
        OneFontButton oneFontButton = null;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText = null;
        }
        EditTextextKt.toUpperCase(oneCustomClearableEditText, 20);
        OneCustomClearableEditText oneCustomClearableEditText2 = this.f97782i;
        if (oneCustomClearableEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText2 = null;
        }
        oneCustomClearableEditText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: rb1
            {
                OneRegisterTrueOnlineOtherCardFormFragment.this = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m9661q;
                m9661q = OneRegisterTrueOnlineOtherCardFormFragment.m9661q(OneRegisterTrueOnlineOtherCardFormFragment.this, textView, i, keyEvent);
                return m9661q;
            }
        });
        OneFontButton oneFontButton2 = this.f97784k;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnNext");
        } else {
            oneFontButton = oneFontButton2;
        }
        oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: sb1
            {
                OneRegisterTrueOnlineOtherCardFormFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneRegisterTrueOnlineOtherCardFormFragment.m9660r(OneRegisterTrueOnlineOtherCardFormFragment.this, view2);
            }
        });
    }

    public final void setFileUtil(@NotNull FileUtil fileUtil) {
        Intrinsics.checkNotNullParameter(fileUtil, "<set-?>");
        this.fileUtil = fileUtil;
    }

    public final void setTheme() {
        OneCustomClearableEditText oneCustomClearableEditText = this.f97782i;
        OneFontButton oneFontButton = null;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setTextColor(ResourcesCompat.getColor(getResources(), R.color.redDark, null));
        OneCustomClearableEditText oneCustomClearableEditText2 = this.f97782i;
        if (oneCustomClearableEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText2 = null;
        }
        oneCustomClearableEditText2.setFocusColor(R.color.redDark);
        OneCustomClearableEditText oneCustomClearableEditText3 = this.f97782i;
        if (oneCustomClearableEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText3 = null;
        }
        oneCustomClearableEditText3.setBackgroundResource(R.drawable.selector_rectangle_red);
        OneCustomClearableEditText oneCustomClearableEditText4 = this.f97782i;
        if (oneCustomClearableEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText4 = null;
        }
        oneCustomClearableEditText4.setHighlightColor(ResourcesCompat.getColor(getResources(), R.color.highlightColorRed, null));
        OneCustomClearableEditText oneCustomClearableEditText5 = this.f97782i;
        if (oneCustomClearableEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText5 = null;
        }
        oneCustomClearableEditText5.setTextAndCompoundColor(R.color.redDark);
        OneCustomClearableEditText oneCustomClearableEditText6 = this.f97782i;
        if (oneCustomClearableEditText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
            oneCustomClearableEditText6 = null;
        }
        oneCustomClearableEditText6.setLinkTextColor(ResourcesCompat.getColor(getResources(), R.color.redDark, null));
        OneCheckBox oneCheckBox = this.f97783j;
        if (oneCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxOtherCardNotifyExpired");
            oneCheckBox = null;
        }
        oneCheckBox.setButtonDrawable(R.drawable.one_selector_checkbox_red);
        if (Build.VERSION.SDK_INT >= 29) {
            OneCustomClearableEditText oneCustomClearableEditText7 = this.f97782i;
            if (oneCustomClearableEditText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
                oneCustomClearableEditText7 = null;
            }
            oneCustomClearableEditText7.setTextCursorDrawable(R.drawable.background_cursor_red);
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
                declaredField.setAccessible(true);
                OneCustomClearableEditText oneCustomClearableEditText8 = this.f97782i;
                if (oneCustomClearableEditText8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tolOtherEditText");
                    oneCustomClearableEditText8 = null;
                }
                declaredField.set(oneCustomClearableEditText8, Integer.valueOf(R.drawable.background_cursor_red));
            } catch (Exception unused) {
            }
        }
        OneFontButton oneFontButton2 = this.f97784k;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnNext");
        } else {
            oneFontButton = oneFontButton2;
        }
        oneFontButton.setBackgroundResource(R.drawable.background_one_button_red);
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxConfirm.ConfirmDialogListener
    public void onOkButtonClick(int i, @Nullable Void r3) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}