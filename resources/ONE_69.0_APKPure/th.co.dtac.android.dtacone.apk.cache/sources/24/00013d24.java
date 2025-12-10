package th.p047co.dtac.android.dtacone.view.appOne.rectify.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.dialog.OneRectifyConfirmDialog;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.model.RectyfyThemeColorModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J-\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b \u0010\rJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b!\u0010\rJ\u0017\u0010!\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00105R\u0018\u0010<\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R*\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/rectify/dialog/OneRectifyConfirmDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/view/View;", Promotion.ACTION_VIEW, "", "binding", "(Landroid/view/View;)V", "initView", "", "feature", "setFeature", "(Ljava/lang/String;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", TypedValues.Custom.S_COLOR, "setThemeFont", "(I)V", "drawable", "setThemeButton", OperatorName.CLOSE_AND_STROKE, "setPhoneNumber", "setPrice", "(Ljava/lang/Integer;)V", "p", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvTitle", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "tvPhoneNumber", OperatorName.CURVE_TO, "tvType", "d", "tvPrice", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "e", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontButton;", "btnCancel", OperatorName.FILL_NON_ZERO, "btnOk", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", OperatorName.CLOSE_PATH, HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "i", FirebaseAnalytics.Param.PRICE, OperatorName.SET_LINE_JOINSTYLE, "Ljava/lang/Integer;", "fontColor", OperatorName.NON_STROKING_CMYK, "buttonBackground", "Lkotlin/Function0;", OperatorName.LINE_TO, "Lkotlin/jvm/functions/Function0;", "getOnClickButtonOk", "()Lkotlin/jvm/functions/Function0;", "setOnClickButtonOk", "(Lkotlin/jvm/functions/Function0;)V", "onClickButtonOk", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.dialog.OneRectifyConfirmDialog */
/* loaded from: classes10.dex */
public final class OneRectifyConfirmDialog extends DialogFragment {

    /* renamed from: a */
    public OneFontTextView f96069a;

    /* renamed from: b */
    public OneFontTextView f96070b;

    /* renamed from: c */
    public OneFontTextView f96071c;

    /* renamed from: d */
    public OneFontTextView f96072d;

    /* renamed from: e */
    public OneFontButton f96073e;

    /* renamed from: f */
    public OneFontButton f96074f;

    /* renamed from: g */
    public String f96075g = PermissionConstant.M_TOP_UP;

    /* renamed from: h */
    public String f96076h = "";

    /* renamed from: i */
    public String f96077i = "";

    /* renamed from: j */
    public Integer f96078j;

    /* renamed from: k */
    public Integer f96079k;

    /* renamed from: l */
    public Function0 f96080l;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/rectify/dialog/OneRectifyConfirmDialog$Companion;", "", "()V", "COMPANY", "", "THEME", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/rectify/dialog/OneRectifyConfirmDialog;", "company", "theme", "Lth/co/dtac/android/dtacone/view/appOne/rectify/model/RectyfyThemeColorModel;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.dialog.OneRectifyConfirmDialog$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneRectifyConfirmDialog newInstance(@NotNull String company, @NotNull RectyfyThemeColorModel theme) {
            Intrinsics.checkNotNullParameter(company, "company");
            Intrinsics.checkNotNullParameter(theme, "theme");
            OneRectifyConfirmDialog oneRectifyConfirmDialog = new OneRectifyConfirmDialog();
            Bundle bundle = new Bundle();
            bundle.putString("COMPANY", company);
            bundle.putParcelable("THEME", theme);
            oneRectifyConfirmDialog.setArguments(bundle);
            return oneRectifyConfirmDialog;
        }

        public Companion() {
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvTitle)");
        this.f96069a = (OneFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.tvPhoneNumber)");
        this.f96070b = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tvType);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.tvType)");
        this.f96071c = (OneFontTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tvPrice);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.tvPrice)");
        this.f96072d = (OneFontTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.btnCancel);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.btnCancel)");
        this.f96073e = (OneFontButton) findViewById5;
        View findViewById6 = view.findViewById(R.id.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.btnOk)");
        this.f96074f = (OneFontButton) findViewById6;
    }

    private final void initView() {
        String str;
        OneFontButton oneFontButton = null;
        if (Intrinsics.areEqual(this.f96075g, PermissionConstant.M_TOP_UP)) {
            OneFontTextView oneFontTextView = this.f96069a;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                oneFontTextView = null;
            }
            oneFontTextView.setText(getResources().getString(R.string.one_rectify_topup_cancel_title_dialog));
            OneFontTextView oneFontTextView2 = this.f96071c;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvType");
                oneFontTextView2 = null;
            }
            oneFontTextView2.setText(getResources().getString(R.string.one_topup_text));
        } else {
            OneFontTextView oneFontTextView3 = this.f96069a;
            if (oneFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                oneFontTextView3 = null;
            }
            oneFontTextView3.setText(getResources().getString(R.string.rectify_stv_toolbar_one));
            OneFontTextView oneFontTextView4 = this.f96071c;
            if (oneFontTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvType");
                oneFontTextView4 = null;
            }
            oneFontTextView4.setText(getResources().getString(R.string.rectify_stv_type));
        }
        OneFontTextView oneFontTextView5 = this.f96070b;
        if (oneFontTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumber");
            oneFontTextView5 = null;
        }
        String str2 = this.f96076h;
        if (str2 != null) {
            str = PhoneNumberExtKt.toPretty(str2);
        } else {
            str = null;
        }
        oneFontTextView5.setText(str);
        OneFontTextView oneFontTextView6 = this.f96072d;
        if (oneFontTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPrice");
            oneFontTextView6 = null;
        }
        oneFontTextView6.setText(this.f96077i);
        OneFontButton oneFontButton2 = this.f96073e;
        if (oneFontButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnCancel");
            oneFontButton2 = null;
        }
        oneFontButton2.setOnClickListener(new View.OnClickListener() { // from class: Ja1
            {
                OneRectifyConfirmDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneRectifyConfirmDialog.m10508q(OneRectifyConfirmDialog.this, view);
            }
        });
        OneFontButton oneFontButton3 = this.f96074f;
        if (oneFontButton3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnOk");
        } else {
            oneFontButton = oneFontButton3;
        }
        oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: Ka1
            {
                OneRectifyConfirmDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneRectifyConfirmDialog.m10507r(OneRectifyConfirmDialog.this, view);
            }
        });
    }

    /* renamed from: q */
    public static final void m10508q(OneRectifyConfirmDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: r */
    public static final void m10507r(OneRectifyConfirmDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        Function0 function0 = this$0.f96080l;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Nullable
    public final Function0<Unit> getOnClickButtonOk() {
        return this.f96080l;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.one_rectify_confirm_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        binding(view);
        m10509p();
        initView();
    }

    /* renamed from: p */
    public final void m10509p() {
        Integer num = this.f96078j;
        OneFontButton oneFontButton = null;
        if (num != null) {
            int intValue = num.intValue();
            OneFontTextView oneFontTextView = this.f96070b;
            if (oneFontTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPhoneNumber");
                oneFontTextView = null;
            }
            oneFontTextView.setTextColor(ResourcesCompat.getColor(getResources(), intValue, null));
            OneFontTextView oneFontTextView2 = this.f96071c;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvType");
                oneFontTextView2 = null;
            }
            oneFontTextView2.setTextColor(ResourcesCompat.getColor(getResources(), intValue, null));
            OneFontTextView oneFontTextView3 = this.f96072d;
            if (oneFontTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvPrice");
                oneFontTextView3 = null;
            }
            oneFontTextView3.setTextColor(ResourcesCompat.getColor(getResources(), intValue, null));
        }
        Integer num2 = this.f96079k;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            OneFontButton oneFontButton2 = this.f96074f;
            if (oneFontButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnOk");
            } else {
                oneFontButton = oneFontButton2;
            }
            oneFontButton.setBackgroundResource(intValue2);
        }
    }

    public final void setFeature(@Nullable String str) {
        this.f96075g = str;
    }

    public final void setOnClickButtonOk(@Nullable Function0<Unit> function0) {
        this.f96080l = function0;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.f96076h = str;
    }

    public final void setPrice(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        if (!StringsKt__StringsKt.contains$default((CharSequence) s, (CharSequence) "บาท", false, 2, (Object) null)) {
            s = s + " บาท";
        }
        this.f96077i = s;
    }

    public final void setThemeButton(@DrawableRes int i) {
        this.f96079k = Integer.valueOf(i);
    }

    public final void setThemeFont(@ColorRes int i) {
        this.f96078j = Integer.valueOf(i);
    }

    public final void setPrice(@Nullable Integer num) {
        this.f96077i = num + " บาท";
    }
}