package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.compose.DialogNavigator;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.jakewharton.rxbinding2.widget.TextViewTextChangeEvent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogRetailerCode;
import th.p047co.dtac.android.dtacone.widget.dialog.listener.CustomOnClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0003J!\u0010#\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020%H\u0003¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020%H\u0003¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u0003R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRetailerCode;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()D", "Landroid/app/Dialog;", DialogNavigator.NAME, "", "z", "(Landroid/app/Dialog;)V", "", "H", "()Z", "", TextBundle.TEXT_ENTRY, "showError", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "retailerNumber", "A", "(Landroid/view/View;Ljava/lang/String;)V", "Landroid/widget/TextView;", "D", "(Landroid/widget/TextView;)V", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "u", "Lth/co/dtac/android/dtacone/widget/dialog/listener/CustomOnClickListener;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/dialog/listener/CustomOnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/widget/EditText;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/EditText;", "retailerCode", OperatorName.CURVE_TO, "Landroid/widget/TextView;", "errorMsg", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogRetailerCode */
/* loaded from: classes9.dex */
public final class CustomDialogRetailerCode extends DialogFragment {
    @NotNull
    public static final String EXTRA_RETAILER_CODE = "EXTRA_RETAILER_CODE";

    /* renamed from: a */
    public CustomOnClickListener f107310a;

    /* renamed from: b */
    public EditText f107311b;

    /* renamed from: c */
    public TextView f107312c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRetailerCode$Companion;", "", "()V", CustomDialogRetailerCode.EXTRA_RETAILER_CODE, "", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogRetailerCode;", "retailerCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogRetailerCode$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CustomDialogRetailerCode newInstance$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.newInstance(str);
        }

        @NotNull
        public final CustomDialogRetailerCode newInstance(@Nullable String str) {
            Bundle bundle = new Bundle();
            CustomDialogRetailerCode customDialogRetailerCode = new CustomDialogRetailerCode();
            if (str != null) {
                bundle.putString(CustomDialogRetailerCode.EXTRA_RETAILER_CODE, str);
            }
            customDialogRetailerCode.setArguments(bundle);
            return customDialogRetailerCode;
        }

        public Companion() {
        }
    }

    /* renamed from: B */
    public static final void m1654B(CustomDialogRetailerCode this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomOnClickListener customOnClickListener = this$0.f107310a;
        if (customOnClickListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            customOnClickListener = null;
        }
        customOnClickListener.onCancel();
        this$0.dismiss();
    }

    /* renamed from: C */
    public static final void m1653C(CustomDialogRetailerCode this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        this$0.m1640u();
        if (this$0.m1648H()) {
            CustomOnClickListener customOnClickListener = this$0.f107310a;
            if (customOnClickListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                customOnClickListener = null;
            }
            customOnClickListener.onConfirm(view);
        }
    }

    /* renamed from: E */
    public static final String m1651E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final boolean m1650F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G */
    public static final void m1649G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    private final boolean m1648H() {
        EditText editText = this.f107311b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retailerCode");
            editText = null;
        }
        if (editText.getText().toString().length() < 8) {
            String string = getString(R.string.retailer_code_invalid);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.retailer_code_invalid)");
            showError(string);
            return false;
        }
        return true;
    }

    private final void showError(String str) {
        TextView textView = this.f107312c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMsg");
            textView = null;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    /* renamed from: w */
    public static final String m1638w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m1637x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    private final double m1636y() {
        if ((getResources().getConfiguration().screenLayout & 15) == 3) {
            return 0.75d;
        }
        return 0.85d;
    }

    /* renamed from: z */
    private final void m1635z(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(4);
        }
    }

    /* renamed from: A */
    public final void m1655A(final View view, String str) {
        View findViewById = view.findViewById(R.id.errorMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.errorMessage)");
        TextView textView = (TextView) findViewById;
        this.f107312c = textView;
        EditText editText = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMsg");
            textView = null;
        }
        m1639v(textView);
        View findViewById2 = view.findViewById(R.id.retailerCode);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.retailerCode)");
        EditText editText2 = (EditText) findViewById2;
        this.f107311b = editText2;
        if (str != null) {
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("retailerCode");
                editText2 = null;
            }
            editText2.setText(str);
            editText2.requestFocus();
        }
        EditText editText3 = this.f107311b;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retailerCode");
        } else {
            editText = editText3;
        }
        m1652D(editText);
        ((Button) view.findViewById(R.id.btnCancel)).setOnClickListener(new View.OnClickListener() { // from class: pA
            {
                CustomDialogRetailerCode.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomDialogRetailerCode.m1654B(CustomDialogRetailerCode.this, view2);
            }
        });
        ((Button) view.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() { // from class: qA
            {
                CustomDialogRetailerCode.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CustomDialogRetailerCode.m1653C(CustomDialogRetailerCode.this, view, view2);
            }
        });
    }

    /* renamed from: D */
    public final void m1652D(TextView textView) {
        Observable<TextViewTextChangeEvent> debounce = RxTextView.textChangeEvents(textView).debounce(400L, TimeUnit.MICROSECONDS);
        final CustomDialogRetailerCode$textChangeClearErrorMessage$1 customDialogRetailerCode$textChangeClearErrorMessage$1 = CustomDialogRetailerCode$textChangeClearErrorMessage$1.INSTANCE;
        Observable<R> map = debounce.map(new Function() { // from class: rA
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m1651E;
                m1651E = CustomDialogRetailerCode.m1651E(customDialogRetailerCode$textChangeClearErrorMessage$1, obj);
                return m1651E;
            }
        });
        final CustomDialogRetailerCode$textChangeClearErrorMessage$2 customDialogRetailerCode$textChangeClearErrorMessage$2 = CustomDialogRetailerCode$textChangeClearErrorMessage$2.INSTANCE;
        Observable observeOn = map.filter(new Predicate() { // from class: sA
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m1650F;
                m1650F = CustomDialogRetailerCode.m1650F(customDialogRetailerCode$textChangeClearErrorMessage$2, obj);
                return m1650F;
            }
        }).subscribeOn(Schedulers.m30138io()).observeOn(AndroidSchedulers.mainThread());
        final CustomDialogRetailerCode$textChangeClearErrorMessage$3 customDialogRetailerCode$textChangeClearErrorMessage$3 = new CustomDialogRetailerCode$textChangeClearErrorMessage$3(this);
        observeOn.subscribe(new Consumer() { // from class: tA
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CustomDialogRetailerCode.m1649G(customDialogRetailerCode$textChangeClearErrorMessage$3, obj);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.widget.dialog.listener.CustomOnClickListener");
        this.f107310a = (CustomOnClickListener) activity;
        m1635z(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View view = inflater.inflate(R.layout.dialog_retailer, viewGroup, false);
        setCancelable(false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        double d;
        double m1636y;
        WindowManager windowManager;
        super.onResume();
        Dialog dialog = getDialog();
        Display display = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        Point point = new Point();
        if (window != null && (windowManager = window.getWindowManager()) != null) {
            display = windowManager.getDefaultDisplay();
        }
        if (display != null) {
            display.getSize(point);
        }
        int i = point.x;
        if (i == 1536) {
            d = i;
            m1636y = 0.55d;
        } else {
            d = i;
            m1636y = m1636y();
        }
        double d2 = d * m1636y;
        if (window != null) {
            window.setLayout((int) d2, -2);
        }
        if (window != null) {
            window.setGravity(17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString(EXTRA_RETAILER_CODE, "");
        } else {
            str = null;
        }
        m1655A(view, str);
    }

    /* renamed from: u */
    public final void m1640u() {
        TextView textView = this.f107312c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMsg");
            textView = null;
        }
        textView.setText("");
        textView.setVisibility(8);
    }

    /* renamed from: v */
    public final void m1639v(TextView textView) {
        InitialValueObservable<TextViewTextChangeEvent> textChangeEvents = RxTextView.textChangeEvents(textView);
        final CustomDialogRetailerCode$clearErrorMessage$1 customDialogRetailerCode$clearErrorMessage$1 = CustomDialogRetailerCode$clearErrorMessage$1.INSTANCE;
        Observable observeOn = textChangeEvents.map(new Function() { // from class: uA
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m1638w;
                m1638w = CustomDialogRetailerCode.m1638w(customDialogRetailerCode$clearErrorMessage$1, obj);
                return m1638w;
            }
        }).subscribeOn(Schedulers.m30138io()).observeOn(AndroidSchedulers.mainThread());
        final CustomDialogRetailerCode$clearErrorMessage$2 customDialogRetailerCode$clearErrorMessage$2 = new CustomDialogRetailerCode$clearErrorMessage$2(this);
        observeOn.subscribe(new Consumer() { // from class: vA
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CustomDialogRetailerCode.m1637x(customDialogRetailerCode$clearErrorMessage$2, obj);
            }
        });
    }
}