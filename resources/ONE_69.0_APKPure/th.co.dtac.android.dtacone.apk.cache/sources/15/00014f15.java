package th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.form;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.databinding.FragmentMrtrMnpIdCardNumberFormBinding;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/form/MrtrMnpIdCardNumberFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", OperatorName.MOVE_TO, "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "edtidIdEditText", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "getEdtidIdEditText", "()Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "setEdtidIdEditText", "(Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "checkIdExpiration", "Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "getCheckIdExpiration", "()Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "setCheckIdExpiration", "(Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;)V", "Lth/co/dtac/android/dtacone/databinding/FragmentMrtrMnpIdCardNumberFormBinding;", "i", "Lth/co/dtac/android/dtacone/databinding/FragmentMrtrMnpIdCardNumberFormBinding;", "_binding", OperatorName.ENDPATH, "()Lth/co/dtac/android/dtacone/databinding/FragmentMrtrMnpIdCardNumberFormBinding;", "binding", "", "o", "()Z", "isShowCheckExpire", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.form.MrtrMnpIdCardNumberFormFragment */
/* loaded from: classes9.dex */
public final class MrtrMnpIdCardNumberFormFragment extends BaseFragment {
    @NotNull
    public static final String EXTRA_IS_SHOW_CHECK_EXPIRE = "EXTRA_IS_SHOW_CHECK_EXPIRE";
    public DtacCheckBox checkIdExpiration;
    public DtacClearableEditText edtidIdEditText;

    /* renamed from: i */
    public FragmentMrtrMnpIdCardNumberFormBinding f102226i;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/form/MrtrMnpIdCardNumberFormFragment$Companion;", "", "()V", "EXTRA_IS_SHOW_CHECK_EXPIRE", "", "newInstance", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/form/MrtrMnpIdCardNumberFormFragment;", "isShowCheckExpire", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.form.MrtrMnpIdCardNumberFormFragment$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MrtrMnpIdCardNumberFormFragment newInstance(boolean z) {
            MrtrMnpIdCardNumberFormFragment mrtrMnpIdCardNumberFormFragment = new MrtrMnpIdCardNumberFormFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_SHOW_CHECK_EXPIRE", z);
            mrtrMnpIdCardNumberFormFragment.setArguments(bundle);
            return mrtrMnpIdCardNumberFormFragment;
        }

        public Companion() {
        }
    }

    private final void initView() {
        getEdtidIdEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(17)});
        EditTextextKt.maskFormat(getEdtidIdEditText(), Constant.NATION_CARD_FORMAT);
        if (m6057o()) {
            getCheckIdExpiration().setVisibility(8);
        }
    }

    /* renamed from: m */
    private final void m6059m() {
        DtacClearableEditText dtacClearableEditText = m6058n().mnpIdCardNumber;
        Intrinsics.checkNotNullExpressionValue(dtacClearableEditText, "binding.mnpIdCardNumber");
        setEdtidIdEditText(dtacClearableEditText);
        DtacCheckBox dtacCheckBox = m6058n().checkIdExpiration;
        Intrinsics.checkNotNullExpressionValue(dtacCheckBox, "binding.checkIdExpiration");
        setCheckIdExpiration(dtacCheckBox);
    }

    @JvmStatic
    @NotNull
    public static final MrtrMnpIdCardNumberFormFragment newInstance(boolean z) {
        return Companion.newInstance(z);
    }

    @NotNull
    public final DtacCheckBox getCheckIdExpiration() {
        DtacCheckBox dtacCheckBox = this.checkIdExpiration;
        if (dtacCheckBox != null) {
            return dtacCheckBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkIdExpiration");
        return null;
    }

    @NotNull
    public final DtacClearableEditText getEdtidIdEditText() {
        DtacClearableEditText dtacClearableEditText = this.edtidIdEditText;
        if (dtacClearableEditText != null) {
            return dtacClearableEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edtidIdEditText");
        return null;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        return TrackerConstant.MRTR_MNP_ID_CARD_NUMBER_FORM;
    }

    /* renamed from: n */
    public final FragmentMrtrMnpIdCardNumberFormBinding m6058n() {
        FragmentMrtrMnpIdCardNumberFormBinding fragmentMrtrMnpIdCardNumberFormBinding = this.f102226i;
        Intrinsics.checkNotNull(fragmentMrtrMnpIdCardNumberFormBinding);
        return fragmentMrtrMnpIdCardNumberFormBinding;
    }

    /* renamed from: o */
    public final boolean m6057o() {
        return requireArguments().getBoolean("EXTRA_IS_SHOW_CHECK_EXPIRE", false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f102226i = FragmentMrtrMnpIdCardNumberFormBinding.inflate(inflater, viewGroup, false);
        m6059m();
        initView();
        return m6058n().getRoot();
    }

    public final void setCheckIdExpiration(@NotNull DtacCheckBox dtacCheckBox) {
        Intrinsics.checkNotNullParameter(dtacCheckBox, "<set-?>");
        this.checkIdExpiration = dtacCheckBox;
    }

    public final void setEdtidIdEditText(@NotNull DtacClearableEditText dtacClearableEditText) {
        Intrinsics.checkNotNullParameter(dtacClearableEditText, "<set-?>");
        this.edtidIdEditText = dtacClearableEditText;
    }
}