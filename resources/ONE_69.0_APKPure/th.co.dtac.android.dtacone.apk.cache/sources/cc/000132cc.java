package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.form;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.OneMnpThemeModel;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdNumberFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.form.OneMnpOtherCardFormFragment;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J-\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/form/OneMnpOtherCardFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "bindingView", "(Landroid/view/View;)V", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setThemeView", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/view/appOne/mnp/activity/OneMnpActivity;", "i", "Lkotlin/Lazy;", "o", "()Lth/co/dtac/android/dtacone/view/appOne/mnp/activity/OneMnpActivity;", "activity", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", "otherCardNumberEditText", "Landroid/widget/CheckBox;", OperatorName.NON_STROKING_CMYK, "Landroid/widget/CheckBox;", "checkIdExpirationCheckBox", "Lth/co/dtac/android/dtacone/view/appOne/mnp/viewModel/OneMnpViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/view/appOne/mnp/viewModel/OneMnpViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.form.OneMnpOtherCardFormFragment */
/* loaded from: classes10.dex */
public final class OneMnpOtherCardFormFragment extends BaseFragment {

    /* renamed from: i */
    public final Lazy f91905i = LazyKt__LazyJVMKt.lazy(new OneMnpOtherCardFormFragment$activity$2(this));

    /* renamed from: j */
    public OneCustomClearableEditText f91906j;

    /* renamed from: k */
    public CheckBox f91907k;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/form/OneMnpOtherCardFormFragment$Companion;", "", "()V", "HINT_TXT", "", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/mnp/fragment/form/OneMnpOtherCardFormFragment;", "hint", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.form.OneMnpOtherCardFormFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneMnpOtherCardFormFragment newInstance(@NotNull String hint) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            OneMnpOtherCardFormFragment oneMnpOtherCardFormFragment = new OneMnpOtherCardFormFragment();
            Bundle bundle = new Bundle();
            bundle.putString("HINT_TXT", hint);
            oneMnpOtherCardFormFragment.setArguments(bundle);
            return oneMnpOtherCardFormFragment;
        }

        public Companion() {
        }
    }

    private final void bindingView(View view) {
        View findViewById = view.findViewById(R.id.checkIdExpirationCheckBox);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.checkIdExpirationCheckBox)");
        this.f91907k = (CheckBox) findViewById;
        View findViewById2 = view.findViewById(R.id.otherCardNumberEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.otherCardNumberEditText)");
        this.f91906j = (OneCustomClearableEditText) findViewById2;
    }

    public final OneMnpViewModel getViewModel() {
        return m13642o().getOneMnpViewModel();
    }

    private final void initView() {
        OneCustomClearableEditText oneCustomClearableEditText = this.f91906j;
        String str = null;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherCardNumberEditText");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setText(getViewModel().getOtherCardNumberIdCardNumberTemp());
        OneCustomClearableEditText oneCustomClearableEditText2 = this.f91906j;
        if (oneCustomClearableEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherCardNumberEditText");
            oneCustomClearableEditText2 = null;
        }
        EditTextextKt.toUpperCase(oneCustomClearableEditText2, 20);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("HINT_TXT", getString(R.string.postpaid_registration_manual_id_card));
        }
        oneCustomClearableEditText2.setHint(str);
        oneCustomClearableEditText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: vV0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return OneMnpOtherCardFormFragment.m13643n(OneMnpOtherCardFormFragment.this, textView, i, keyEvent);
            }
        });
        oneCustomClearableEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: wV0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                OneMnpOtherCardFormFragment.m13644m(OneMnpOtherCardFormFragment.this, view, z);
            }
        });
        oneCustomClearableEditText2.addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.form.OneMnpOtherCardFormFragment$initView$1$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                OneMnpViewModel viewModel;
                OneMnpViewModel viewModel2;
                viewModel = OneMnpOtherCardFormFragment.this.getViewModel();
                if (viewModel.getIdNumberHasFocus()) {
                    viewModel2 = OneMnpOtherCardFormFragment.this.getViewModel();
                    viewModel2.setSaveState(false);
                    viewModel2.setIdNumberHasChange(true);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    /* renamed from: m */
    public static /* synthetic */ void m13644m(OneMnpOtherCardFormFragment oneMnpOtherCardFormFragment, View view, boolean z) {
        m13640q(oneMnpOtherCardFormFragment, view, z);
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m13643n(OneMnpOtherCardFormFragment oneMnpOtherCardFormFragment, TextView textView, int i, KeyEvent keyEvent) {
        return m13641p(oneMnpOtherCardFormFragment, textView, i, keyEvent);
    }

    /* renamed from: o */
    private final OneMnpActivity m13642o() {
        return (OneMnpActivity) this.f91905i.getValue();
    }

    /* renamed from: p */
    public static final boolean m13641p(OneMnpOtherCardFormFragment this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 6) {
            Fragment parentFragment = this$0.getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpIdNumberFormFragment");
            OneMnpIdNumberFormFragment oneMnpIdNumberFormFragment = (OneMnpIdNumberFormFragment) parentFragment;
            OneCustomClearableEditText oneCustomClearableEditText = this$0.f91906j;
            if (oneCustomClearableEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otherCardNumberEditText");
                oneCustomClearableEditText = null;
            }
            oneMnpIdNumberFormFragment.onClickSubmit(oneCustomClearableEditText);
            return false;
        }
        return false;
    }

    /* renamed from: q */
    public static final void m13640q(OneMnpOtherCardFormFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.getViewModel().setIdNumberHasFocus(true);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        return TrackerConstant.MRTR_PREPAID_REGISTRATION_FORM_OTHER_CARD;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.fragment_one_mnp_other_card_form, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        bindingView(view);
        setThemeView();
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initView();
    }

    @SuppressLint({"PrivateApi"})
    public final void setThemeView() {
        OneMnpThemeModel mnpThemeColorModel = m13642o().getOneThemeViewModel().getMnpThemeColorModel();
        OneCustomClearableEditText oneCustomClearableEditText = this.f91906j;
        CheckBox checkBox = null;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherCardNumberEditText");
            oneCustomClearableEditText = null;
        }
        oneCustomClearableEditText.setTextColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), mnpThemeColorModel.getEditTextColor(), null));
        oneCustomClearableEditText.setFocusColor(mnpThemeColorModel.getEditTextColor());
        oneCustomClearableEditText.setBackgroundResource(mnpThemeColorModel.getEditTextBackground());
        oneCustomClearableEditText.setHighlightColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), mnpThemeColorModel.getEditTextColor(), null));
        oneCustomClearableEditText.setTextAndCompoundColor(mnpThemeColorModel.getEditTextColor());
        oneCustomClearableEditText.setLinkTextColor(ResourcesCompat.getColor(oneCustomClearableEditText.getResources(), mnpThemeColorModel.getEditTextColor(), null));
        if (Build.VERSION.SDK_INT >= 29) {
            oneCustomClearableEditText.setTextCursorDrawable(mnpThemeColorModel.getEditTextCursor());
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
                declaredField.setAccessible(true);
                declaredField.set(oneCustomClearableEditText, Integer.valueOf(mnpThemeColorModel.getEditTextCursor()));
            } catch (Exception unused) {
            }
        }
        CheckBox checkBox2 = this.f91907k;
        if (checkBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkIdExpirationCheckBox");
        } else {
            checkBox = checkBox2;
        }
        checkBox.setButtonDrawable(mnpThemeColorModel.getCheckBoxBackgroundColor());
    }
}