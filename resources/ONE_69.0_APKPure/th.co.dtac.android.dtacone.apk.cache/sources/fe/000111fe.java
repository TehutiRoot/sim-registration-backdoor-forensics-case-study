package th.p047co.dtac.android.dtacone.app_one.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001:\u0001|B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001d¢\u0006\u0004\b$\u0010 J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001d¢\u0006\u0004\b&\u0010 J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u001d¢\u0006\u0004\b(\u0010 J\u0017\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b*\u0010 J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010\fJ\u0015\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\b-\u0010\u0012J\u0015\u0010.\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\b.\u0010\u0012J\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000f¢\u0006\u0004\b1\u00100J\r\u00102\u001a\u00020\u000f¢\u0006\u0004\b2\u00100J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106J\u0015\u00109\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\n¢\u0006\u0004\b;\u0010\fJ\r\u0010<\u001a\u00020\n¢\u0006\u0004\b<\u0010\fJ\r\u0010=\u001a\u00020\n¢\u0006\u0004\b=\u0010\fJ\r\u0010>\u001a\u00020\n¢\u0006\u0004\b>\u0010\fJ\r\u0010?\u001a\u00020\u000f¢\u0006\u0004\b?\u00100J\u001f\u0010B\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u000f2\b\b\u0002\u0010A\u001a\u00020\u000f¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000f¢\u0006\u0004\bD\u0010\u0012J\r\u0010E\u001a\u00020\u000f¢\u0006\u0004\bE\u00100J\r\u0010F\u001a\u00020\u000f¢\u0006\u0004\bF\u00100J\r\u0010G\u001a\u00020\n¢\u0006\u0004\bG\u0010\fJ\u0015\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u0006¢\u0006\u0004\bI\u0010:J\u001b\u0010K\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0J¢\u0006\u0004\bK\u0010LR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010WR\u0016\u0010[\u001a\u00020Y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010ZR\u0016\u0010]\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010QR\u0016\u0010_\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010QR\u0016\u0010b\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010aR\u0016\u0010e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010aR\u0016\u0010g\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010aR\u0016\u0010/\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010iR\u0016\u0010l\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0016\u0010o\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR\u0016\u0010s\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010nR\u0016\u0010u\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010nR\u0016\u0010w\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010nR\u0016\u0010y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010nR\u0016\u0010{\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010n¨\u0006}"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "i", "()V", "setupViews", "(Landroid/util/AttributeSet;)V", "", "shouldFloat", "d", "(Z)V", "dp", "e", "(I)I", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone$OnTextChangListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTextChangeListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone$OnTextChangListener;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneClearableEditText;", "getEditText", "()Lth/co/dtac/android/dtacone/app_one/widget/OneClearableEditText;", "", TextBundle.TEXT_ENTRY, "setText", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "label", "setLabelText", "hint", "setHintText", "helper", "setHelperText", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "setError", "clearError", "enabled", "setErrorEnabled", "setHelperTextEnabled", "isErrorEnabled", "()Z", "isHelperTextEnabled", "hasError", "Landroid/text/TextWatcher;", "watcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "removeTextChangedListener", "type", "setInputType", "(I)V", "requestEditTextFocus", "clearEditTextFocus", "showLabel", "hideLabel", "isLabelVisible", "visible", "animate", "setLabelVisible", "(ZZ)V", "setClearButtonEnabled", "isClearButtonEnabled", "isClearButtonVisible", "clearText", "drawableRes", "setClearButtonDrawable", "Lkotlin/Function0;", "setClearButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone$OnTextChangListener;", "Landroid/widget/TextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/TextView;", "labelTextView", "Landroid/widget/FrameLayout;", OperatorName.CURVE_TO, "Landroid/widget/FrameLayout;", "editTextContainer", "Lth/co/dtac/android/dtacone/app_one/widget/OneClearableEditText;", "editText", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "clearButton", OperatorName.FILL_NON_ZERO, "helperTextView", OperatorName.NON_STROKING_GRAY, "errorTextView", OperatorName.CLOSE_PATH, "Ljava/lang/String;", "labelText", "hintText", OperatorName.SET_LINE_JOINSTYLE, "helperText", OperatorName.NON_STROKING_CMYK, "errorText", OperatorName.LINE_TO, "Z", OperatorName.MOVE_TO, OperatorName.ENDPATH, "isShowClearButton", "o", "I", "labelTextColor", "p", "editTextColor", OperatorName.SAVE, "editTextColorCursor", PDPageLabelRange.STYLE_ROMAN_LOWER, "editTextBackground", OperatorName.CLOSE_AND_STROKE, "editTextHighlightColor", "t", "helperTextColor", "u", "errorTextColor", "OnTextChangListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone */
/* loaded from: classes7.dex */
public final class OneEditTextInputLayoutPhone extends LinearLayout {
    public static final int $stable = 8;

    /* renamed from: a */
    public OnTextChangListener f82878a;

    /* renamed from: b */
    public TextView f82879b;

    /* renamed from: c */
    public FrameLayout f82880c;

    /* renamed from: d */
    public OneClearableEditText f82881d;

    /* renamed from: e */
    public ImageView f82882e;

    /* renamed from: f */
    public TextView f82883f;

    /* renamed from: g */
    public TextView f82884g;

    /* renamed from: h */
    public String f82885h;

    /* renamed from: i */
    public String f82886i;

    /* renamed from: j */
    public String f82887j;

    /* renamed from: k */
    public String f82888k;

    /* renamed from: l */
    public boolean f82889l;

    /* renamed from: m */
    public boolean f82890m;

    /* renamed from: n */
    public boolean f82891n;

    /* renamed from: o */
    public int f82892o;

    /* renamed from: p */
    public int f82893p;

    /* renamed from: q */
    public int f82894q;

    /* renamed from: r */
    public int f82895r;

    /* renamed from: s */
    public int f82896s;

    /* renamed from: t */
    public int f82897t;

    /* renamed from: u */
    public int f82898u;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneEditTextInputLayoutPhone$OnTextChangListener;", "", "afterTextChanged", "", OperatorName.CLOSE_AND_STROKE, "Landroid/text/Editable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone$OnTextChangListener */
    /* loaded from: classes7.dex */
    public interface OnTextChangListener {
        void afterTextChanged(@Nullable Editable editable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneEditTextInputLayoutPhone(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public static /* synthetic */ void m20081a(OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone, View view) {
        m20074h(oneEditTextInputLayoutPhone, view);
    }

    public static final /* synthetic */ ImageView access$getClearButton$p(OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone) {
        return oneEditTextInputLayoutPhone.f82882e;
    }

    public static final /* synthetic */ TextView access$getLabelTextView$p(OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone) {
        return oneEditTextInputLayoutPhone.f82879b;
    }

    /* renamed from: b */
    public static /* synthetic */ void m20080b(OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone, OneClearableEditText oneClearableEditText, View view, boolean z) {
        m20075g(oneEditTextInputLayoutPhone, oneClearableEditText, view, z);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20079c(OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone, Function0 function0, View view) {
        m20076f(oneEditTextInputLayoutPhone, function0, view);
    }

    /* renamed from: f */
    public static final void m20076f(OneEditTextInputLayoutPhone this$0, Function0 listener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        OneClearableEditText oneClearableEditText = this$0.f82881d;
        OneClearableEditText oneClearableEditText2 = null;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.setText("");
        OneClearableEditText oneClearableEditText3 = this$0.f82881d;
        if (oneClearableEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        } else {
            oneClearableEditText2 = oneClearableEditText3;
        }
        oneClearableEditText2.requestFocus();
        listener.invoke();
    }

    /* renamed from: g */
    public static final void m20075g(OneEditTextInputLayoutPhone this$0, OneClearableEditText this_apply, View view, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (!z && String.valueOf(this_apply.getText()).length() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this$0.m20078d(z2);
        this$0.m20073i();
    }

    /* renamed from: h */
    public static final void m20074h(OneEditTextInputLayoutPhone this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OneClearableEditText oneClearableEditText = this$0.f82881d;
        OneClearableEditText oneClearableEditText2 = null;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.setText("");
        OneClearableEditText oneClearableEditText3 = this$0.f82881d;
        if (oneClearableEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        } else {
            oneClearableEditText2 = oneClearableEditText3;
        }
        oneClearableEditText2.requestFocus();
    }

    public static /* synthetic */ void setLabelVisible$default(OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        oneEditTextInputLayoutPhone.setLabelVisible(z, z2);
    }

    private final void setupViews(AttributeSet attributeSet) {
        int i;
        TextView textView = new TextView(getContext());
        textView.setTextSize(12.0f);
        textView.setTextColor(this.f82892o);
        textView.setText(this.f82885h);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, m20077e(4));
        textView.setLayoutParams(layoutParams);
        textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), R.font.one_font_style));
        this.f82879b = textView;
        addView(textView);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f82880c = frameLayout;
        View view = null;
        if (attributeSet != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            final OneClearableEditText oneClearableEditText = new OneClearableEditText(context, attributeSet);
            oneClearableEditText.setHint(this.f82886i);
            oneClearableEditText.setInputType(3);
            oneClearableEditText.setShowClearButton(false);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            oneClearableEditText.setPadding(oneClearableEditText.getPaddingLeft(), oneClearableEditText.getPaddingTop(), m20077e(48), oneClearableEditText.getPaddingBottom());
            oneClearableEditText.setLayoutParams(layoutParams2);
            oneClearableEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: LS0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    OneEditTextInputLayoutPhone.m20080b(OneEditTextInputLayoutPhone.this, oneClearableEditText, view2, z);
                }
            });
            oneClearableEditText.addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone$setupViews$3$1$2
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable editable) {
                    OneEditTextInputLayoutPhone.OnTextChangListener onTextChangListener;
                    boolean z;
                    onTextChangListener = OneEditTextInputLayoutPhone.this.f82878a;
                    if (onTextChangListener != null) {
                        onTextChangListener.afterTextChanged(editable);
                    }
                    OneEditTextInputLayoutPhone oneEditTextInputLayoutPhone = OneEditTextInputLayoutPhone.this;
                    if (!oneClearableEditText.isFocused() && String.valueOf(editable).length() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    oneEditTextInputLayoutPhone.m20078d(z);
                    OneEditTextInputLayoutPhone.this.m20073i();
                    OneEditTextInputLayoutPhone.this.clearError();
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            try {
                oneClearableEditText.setTextColor(ResourcesCompat.getColor(oneClearableEditText.getResources(), this.f82893p, null));
                oneClearableEditText.setFocusColor(this.f82893p);
                oneClearableEditText.setBackgroundResource(this.f82895r);
                oneClearableEditText.setHighlightColor(ResourcesCompat.getColor(oneClearableEditText.getResources(), this.f82896s, null));
                oneClearableEditText.setTextAndCompoundColor(this.f82893p);
                oneClearableEditText.setLinkTextColor(ResourcesCompat.getColor(oneClearableEditText.getResources(), this.f82893p, null));
                if (Build.VERSION.SDK_INT >= 29) {
                    oneClearableEditText.setTextCursorDrawable(this.f82894q);
                } else {
                    try {
                        Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                        Intrinsics.checkNotNullExpressionValue(declaredField, "TextView::class.java.get…eld(\"mCursorDrawableRes\")");
                        declaredField.setAccessible(true);
                        OneClearableEditText oneClearableEditText2 = this.f82881d;
                        if (oneClearableEditText2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("editText");
                            oneClearableEditText2 = null;
                        }
                        declaredField.set(oneClearableEditText2, Integer.valueOf(this.f82894q));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                oneClearableEditText.setBackground(ContextCompat.getDrawable(oneClearableEditText.getContext(), R.drawable.transparent));
            } catch (Exception unused) {
            }
            this.f82881d = oneClearableEditText;
        }
        FrameLayout frameLayout2 = this.f82880c;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editTextContainer");
            frameLayout2 = null;
        }
        OneClearableEditText oneClearableEditText3 = this.f82881d;
        if (oneClearableEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText3 = null;
        }
        frameLayout2.addView(oneClearableEditText3);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_clear_text);
        imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), 17301508));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m20077e(40), m20077e(40));
        layoutParams3.gravity = 8388629;
        layoutParams3.setMargins(0, 0, m20077e(4), 0);
        imageView.setLayoutParams(layoutParams3);
        imageView.setVisibility(8);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: MS0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OneEditTextInputLayoutPhone.m20081a(OneEditTextInputLayoutPhone.this, view2);
            }
        });
        TypedValue typedValue = new TypedValue();
        imageView.getContext().getTheme().resolveAttribute(16843868, typedValue, true);
        imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), typedValue.resourceId));
        this.f82882e = imageView;
        FrameLayout frameLayout3 = this.f82880c;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editTextContainer");
            frameLayout3 = null;
        }
        ImageView imageView2 = this.f82882e;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
            imageView2 = null;
        }
        frameLayout3.addView(imageView2);
        View view2 = this.f82880c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editTextContainer");
        } else {
            view = view2;
        }
        addView(view);
        TextView textView2 = new TextView(getContext());
        textView2.setTextSize(12.0f);
        textView2.setTextColor(this.f82897t);
        textView2.setText(this.f82887j);
        if (this.f82890m && this.f82887j.length() > 0) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, m20077e(4), 0, 0);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTypeface(ResourcesCompat.getFont(textView2.getContext(), R.font.one_font_style));
        this.f82883f = textView2;
        addView(textView2);
        TextView textView3 = new TextView(getContext());
        textView3.setTextSize(12.0f);
        textView3.setTextColor(this.f82898u);
        textView3.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, m20077e(4), 0, 0);
        textView3.setLayoutParams(layoutParams5);
        textView3.setTypeface(ResourcesCompat.getFont(textView3.getContext(), R.font.one_font_style));
        this.f82884g = textView3;
        addView(textView3);
    }

    public final void addTextChangedListener(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.addTextChangedListener(watcher);
    }

    public final void clearEditTextFocus() {
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.clearFocus();
    }

    public final void clearError() {
        if (!this.f82889l) {
            return;
        }
        TextView textView = this.f82884g;
        OneClearableEditText oneClearableEditText = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorTextView");
            textView = null;
        }
        textView.setVisibility(8);
        if (this.f82890m && this.f82887j.length() > 0) {
            TextView textView2 = this.f82883f;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperTextView");
                textView2 = null;
            }
            textView2.setVisibility(0);
        }
        OneClearableEditText oneClearableEditText2 = this.f82881d;
        if (oneClearableEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        } else {
            oneClearableEditText = oneClearableEditText2;
        }
        oneClearableEditText.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.transparent));
    }

    public final void clearText() {
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.setText("");
        m20073i();
    }

    /* renamed from: d */
    public final void m20078d(boolean z) {
        if (this.f82885h.length() == 0) {
            return;
        }
        TextView textView = null;
        if (z) {
            TextView textView2 = this.f82879b;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                textView2 = null;
            }
            if (textView2.getVisibility() != 0) {
                TextView textView3 = this.f82879b;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                    textView3 = null;
                }
                textView3.setVisibility(0);
                TextView textView4 = this.f82879b;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                    textView4 = null;
                }
                textView4.setAlpha(0.0f);
                TextView textView5 = this.f82879b;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                    textView5 = null;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView5, "alpha", 0.0f, 1.0f);
                TextView textView6 = this.f82879b;
                if (textView6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                    textView6 = null;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView6, "translationX", 20.0f, 0.0f);
                TextView textView7 = this.f82879b;
                if (textView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                } else {
                    textView = textView7;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, "translationY", 20.0f, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        TextView textView8 = this.f82879b;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
            textView8 = null;
        }
        if (textView8.getVisibility() == 0) {
            TextView textView9 = this.f82879b;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                textView9 = null;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView9, "alpha", 1.0f, 0.0f);
            TextView textView10 = this.f82879b;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                textView10 = null;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView10, "translationX", 0.0f, 20.0f);
            TextView textView11 = this.f82879b;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
            } else {
                textView = textView11;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, 20.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofFloat4, ofFloat5, ofFloat6);
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone$animateLabel$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@NotNull Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    TextView access$getLabelTextView$p = OneEditTextInputLayoutPhone.access$getLabelTextView$p(OneEditTextInputLayoutPhone.this);
                    if (access$getLabelTextView$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                        access$getLabelTextView$p = null;
                    }
                    access$getLabelTextView$p.setVisibility(4);
                }
            });
            animatorSet2.start();
        }
    }

    /* renamed from: e */
    public final int m20077e(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    @NotNull
    public final OneClearableEditText getEditText() {
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            return null;
        }
        return oneClearableEditText;
    }

    @NotNull
    public final String getText() {
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        return String.valueOf(oneClearableEditText.getText());
    }

    public final boolean hasError() {
        TextView textView = this.f82884g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorTextView");
            textView = null;
        }
        if (textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void hideLabel() {
        m20078d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0051  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20073i() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone.m20073i():void");
    }

    public final boolean isClearButtonEnabled() {
        return this.f82891n;
    }

    public final boolean isClearButtonVisible() {
        ImageView imageView = this.f82882e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
            imageView = null;
        }
        if (imageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isErrorEnabled() {
        return this.f82889l;
    }

    public final boolean isHelperTextEnabled() {
        return this.f82890m;
    }

    public final boolean isLabelVisible() {
        TextView textView = this.f82879b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
            textView = null;
        }
        if (textView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void removeTextChangedListener(@NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.removeTextChangedListener(watcher);
    }

    public final void requestEditTextFocus() {
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.requestFocus();
    }

    public final void setClearButtonClickListener(@NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ImageView imageView = this.f82882e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: KS0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneEditTextInputLayoutPhone.m20079c(OneEditTextInputLayoutPhone.this, listener, view);
            }
        });
    }

    public final void setClearButtonDrawable(int i) {
        ImageView imageView = this.f82882e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clearButton");
            imageView = null;
        }
        imageView.setImageResource(i);
    }

    public final void setClearButtonEnabled(boolean z) {
        int paddingRight;
        this.f82891n = z;
        m20073i();
        OneClearableEditText oneClearableEditText = null;
        if (z) {
            paddingRight = m20077e(48);
        } else {
            OneClearableEditText oneClearableEditText2 = this.f82881d;
            if (oneClearableEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editText");
                oneClearableEditText2 = null;
            }
            paddingRight = oneClearableEditText2.getPaddingRight();
        }
        OneClearableEditText oneClearableEditText3 = this.f82881d;
        if (oneClearableEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText3 = null;
        }
        OneClearableEditText oneClearableEditText4 = this.f82881d;
        if (oneClearableEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText4 = null;
        }
        int paddingLeft = oneClearableEditText4.getPaddingLeft();
        OneClearableEditText oneClearableEditText5 = this.f82881d;
        if (oneClearableEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText5 = null;
        }
        int paddingTop = oneClearableEditText5.getPaddingTop();
        OneClearableEditText oneClearableEditText6 = this.f82881d;
        if (oneClearableEditText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        } else {
            oneClearableEditText = oneClearableEditText6;
        }
        oneClearableEditText3.setPadding(paddingLeft, paddingTop, paddingRight, oneClearableEditText.getPaddingBottom());
    }

    public final void setError(@Nullable String str) {
        String str2;
        if (!this.f82889l) {
            return;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f82888k = str2;
        if (str != null && str.length() > 0) {
            TextView textView = this.f82884g;
            OneClearableEditText oneClearableEditText = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorTextView");
                textView = null;
            }
            textView.setText(str);
            TextView textView2 = this.f82884g;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorTextView");
                textView2 = null;
            }
            textView2.setVisibility(0);
            TextView textView3 = this.f82883f;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperTextView");
                textView3 = null;
            }
            textView3.setVisibility(8);
            OneClearableEditText oneClearableEditText2 = this.f82881d;
            if (oneClearableEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editText");
            } else {
                oneClearableEditText = oneClearableEditText2;
            }
            oneClearableEditText.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.edittext_error_background));
            return;
        }
        clearError();
    }

    public final void setErrorEnabled(boolean z) {
        this.f82889l = z;
        if (!z) {
            clearError();
        }
    }

    public final void setHelperText(@NotNull String helper) {
        int i;
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f82887j = helper;
        TextView textView = this.f82883f;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperTextView");
            textView = null;
        }
        textView.setText(helper);
        if (this.f82890m) {
            TextView textView3 = this.f82883f;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("helperTextView");
            } else {
                textView2 = textView3;
            }
            if (helper.length() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            textView2.setVisibility(i);
        }
    }

    public final void setHelperTextEnabled(boolean z) {
        int i;
        this.f82890m = z;
        TextView textView = this.f82883f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperTextView");
            textView = null;
        }
        if (z && this.f82887j.length() > 0) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setHintText(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f82886i = hint;
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.setHint(hint);
    }

    public final void setInputType(int i) {
        OneClearableEditText oneClearableEditText = this.f82881d;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.setInputType(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0041, code lost:
        if (java.lang.String.valueOf(r4.getText()).length() > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setLabelText(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.f82885h = r4
            android.widget.TextView r0 = r3.f82879b
            java.lang.String r1 = "labelTextView"
            r2 = 0
            if (r0 != 0) goto L12
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L12:
            r0.setText(r4)
            java.lang.String r4 = r3.f82885h
            int r4 = r4.length()
            if (r4 <= 0) goto L48
            th.co.dtac.android.dtacone.app_one.widget.OneClearableEditText r4 = r3.f82881d
            java.lang.String r0 = "editText"
            if (r4 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r2
        L27:
            boolean r4 = r4.isFocused()
            if (r4 != 0) goto L43
            th.co.dtac.android.dtacone.app_one.widget.OneClearableEditText r4 = r3.f82881d
            if (r4 != 0) goto L35
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r4 = r2
        L35:
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r4 = r4.length()
            if (r4 <= 0) goto L48
        L43:
            r4 = 1
            r3.m20078d(r4)
            goto L61
        L48:
            android.widget.TextView r4 = r3.f82879b
            if (r4 != 0) goto L50
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r4 = r2
        L50:
            r0 = 4
            r4.setVisibility(r0)
            android.widget.TextView r4 = r3.f82879b
            if (r4 != 0) goto L5c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L5d
        L5c:
            r2 = r4
        L5d:
            r4 = 0
            r2.setAlpha(r4)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.OneEditTextInputLayoutPhone.setLabelText(java.lang.String):void");
    }

    public final void setLabelVisible(boolean z, boolean z2) {
        if (this.f82885h.length() == 0) {
            return;
        }
        if (z2) {
            m20078d(z);
            return;
        }
        TextView textView = null;
        if (z) {
            TextView textView2 = this.f82879b;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                textView2 = null;
            }
            textView2.setVisibility(0);
            TextView textView3 = this.f82879b;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
                textView3 = null;
            }
            textView3.setAlpha(1.0f);
            TextView textView4 = this.f82879b;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
            } else {
                textView = textView4;
            }
            textView.setTranslationY(0.0f);
            return;
        }
        TextView textView5 = this.f82879b;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
            textView5 = null;
        }
        textView5.setVisibility(4);
        TextView textView6 = this.f82879b;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
            textView6 = null;
        }
        textView6.setAlpha(0.0f);
        TextView textView7 = this.f82879b;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("labelTextView");
        } else {
            textView = textView7;
        }
        textView.setTranslationY(-20.0f);
    }

    public final void setOnTextChangeListener(@NotNull OnTextChangListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82878a = listener;
    }

    public final void setText(@NotNull String text) {
        boolean z;
        Intrinsics.checkNotNullParameter(text, "text");
        OneClearableEditText oneClearableEditText = this.f82881d;
        OneClearableEditText oneClearableEditText2 = null;
        if (oneClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
            oneClearableEditText = null;
        }
        oneClearableEditText.setText(text);
        if (text.length() <= 0) {
            OneClearableEditText oneClearableEditText3 = this.f82881d;
            if (oneClearableEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editText");
            } else {
                oneClearableEditText2 = oneClearableEditText3;
            }
            if (!oneClearableEditText2.isFocused()) {
                z = false;
                m20078d(z);
                m20073i();
            }
        }
        z = true;
        m20078d(z);
        m20073i();
    }

    public final void showLabel() {
        if (this.f82885h.length() > 0) {
            m20078d(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneEditTextInputLayoutPhone(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneEditTextInputLayoutPhone(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneEditTextInputLayoutPhone(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "";
        this.f82885h = "";
        this.f82886i = "";
        this.f82887j = "";
        this.f82888k = "";
        this.f82891n = true;
        this.f82892o = ContextCompat.getColor(context, 17170444);
        this.f82893p = R.color.grayishBrown48;
        this.f82894q = R.drawable.text_cursor_gray;
        this.f82895r = R.drawable.selector_rectangle_red;
        this.f82896s = R.color.highlightColorRed;
        this.f82897t = ContextCompat.getColor(context, 17170432);
        this.f82898u = ContextCompat.getColor(context, 17170454);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneEditTextInputLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ditTextInputLayout, 0, 0)");
        try {
            String string = obtainStyledAttributes.getString(R.styleable.OneEditTextInputLayout_labelText);
            this.f82885h = string == null ? "" : string;
            String string2 = obtainStyledAttributes.getString(R.styleable.OneEditTextInputLayout_hintText);
            this.f82886i = string2 == null ? "" : string2;
            String string3 = obtainStyledAttributes.getString(R.styleable.OneEditTextInputLayout_helperText);
            if (string3 != null) {
                str = string3;
            }
            this.f82887j = str;
            this.f82890m = obtainStyledAttributes.getBoolean(R.styleable.OneEditTextInputLayout_helperTextEnabled, false);
            this.f82889l = obtainStyledAttributes.getBoolean(R.styleable.OneEditTextInputLayout_errorEnabled, false);
            this.f82891n = obtainStyledAttributes.getBoolean(R.styleable.OneEditTextInputLayout_showInputLayoutClearButton, true);
            this.f82892o = obtainStyledAttributes.getColor(R.styleable.OneEditTextInputLayout_labelTextColor, this.f82892o);
            this.f82897t = obtainStyledAttributes.getColor(R.styleable.OneEditTextInputLayout_helperTextColor, this.f82897t);
            this.f82898u = obtainStyledAttributes.getColor(R.styleable.OneEditTextInputLayout_errorTextColor, this.f82898u);
            obtainStyledAttributes.recycle();
            setupViews(attributeSet);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}