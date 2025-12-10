package th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp.form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J-\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001c\u0010)\u001a\n '*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0014¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/form/MrtrMnpOtherCardNumberFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", OperatorName.MOVE_TO, "(Landroid/view/View;)V", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getScreenName", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "etCardNumber", "Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "getEtCardNumber", "()Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;", "setEtCardNumber", "(Lth/co/dtac/android/dtacone/widget/view/DtacClearableEditText;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "checkIdExpiration", "Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "getCheckIdExpiration", "()Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;", "setCheckIdExpiration", "(Lth/co/dtac/android/dtacone/widget/view/DtacCheckBox;)V", "", "o", "()Z", "isShowCheckExpire", "kotlin.jvm.PlatformType", OperatorName.ENDPATH, "edtPlaceHolderText", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.form.MrtrMnpOtherCardNumberFormFragment */
/* loaded from: classes9.dex */
public final class MrtrMnpOtherCardNumberFormFragment extends BaseFragment {
    @NotNull
    public static final String EXTRA_IS_SHOW_CHECK_EXPIRE = "EXTRA_IS_SHOW_CHECK_EXPIRE";
    @NotNull
    public static final String EXTRA_PLACE_HOLDER = "EXTRA_PLACE_HOLDER";
    public DtacCheckBox checkIdExpiration;
    public DtacClearableEditText etCardNumber;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/form/MrtrMnpOtherCardNumberFormFragment$Companion;", "", "()V", "EXTRA_IS_SHOW_CHECK_EXPIRE", "", MrtrMnpOtherCardNumberFormFragment.EXTRA_PLACE_HOLDER, "newInstance", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_mnp/form/MrtrMnpOtherCardNumberFormFragment;", "edtPlaceHolder", "isShowCheckExpire", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.form.MrtrMnpOtherCardNumberFormFragment$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MrtrMnpOtherCardNumberFormFragment newInstance(@Nullable String str, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putString(MrtrMnpOtherCardNumberFormFragment.EXTRA_PLACE_HOLDER, str);
            bundle.putBoolean("EXTRA_IS_SHOW_CHECK_EXPIRE", z);
            MrtrMnpOtherCardNumberFormFragment mrtrMnpOtherCardNumberFormFragment = new MrtrMnpOtherCardNumberFormFragment();
            mrtrMnpOtherCardNumberFormFragment.setArguments(bundle);
            return mrtrMnpOtherCardNumberFormFragment;
        }

        public Companion() {
        }
    }

    private final void initView() {
        String m6035n = m6035n();
        if (m6035n != null && m6035n.length() != 0) {
            getEtCardNumber().setHint(m6035n());
        }
        if (m6034o()) {
            getCheckIdExpiration().setVisibility(8);
        }
        EditTextextKt.toUpperCase(getEtCardNumber(), 50);
    }

    /* renamed from: m */
    private final void m6036m(View view) {
        View findViewById = view.findViewById(R.id.mnp_register_other_card_number);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.m…gister_other_card_number)");
        setEtCardNumber((DtacClearableEditText) findViewById);
        View findViewById2 = view.findViewById(R.id.checkIdExpiration);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.checkIdExpiration)");
        setCheckIdExpiration((DtacCheckBox) findViewById2);
    }

    /* renamed from: o */
    private final boolean m6034o() {
        Bundle arguments = getArguments();
        Intrinsics.checkNotNull(arguments);
        return arguments.getBoolean("EXTRA_IS_SHOW_CHECK_EXPIRE", false);
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
    public final DtacClearableEditText getEtCardNumber() {
        DtacClearableEditText dtacClearableEditText = this.etCardNumber;
        if (dtacClearableEditText != null) {
            return dtacClearableEditText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("etCardNumber");
        return null;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        return TrackerConstant.MRTR_MNP_OTHER_CARD_NUMBER_FORM;
    }

    /* renamed from: n */
    public final String m6035n() {
        Bundle arguments = getArguments();
        Intrinsics.checkNotNull(arguments);
        return arguments.getString(EXTRA_PLACE_HOLDER, "");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.fragment_mrtr_mnp_other_card_number_form, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m6036m(view);
        initView();
        return view;
    }

    public final void setCheckIdExpiration(@NotNull DtacCheckBox dtacCheckBox) {
        Intrinsics.checkNotNullParameter(dtacCheckBox, "<set-?>");
        this.checkIdExpiration = dtacCheckBox;
    }

    public final void setEtCardNumber(@NotNull DtacClearableEditText dtacClearableEditText) {
        Intrinsics.checkNotNullParameter(dtacClearableEditText, "<set-?>");
        this.etCardNumber = dtacClearableEditText;
    }
}