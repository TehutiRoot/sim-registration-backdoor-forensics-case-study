package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11663a;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.protocol.HTTP;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.format.OneCreditCardSpanUtils;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewEnableKt;
import th.p047co.dtac.android.dtacone.util.credit_card.CardType;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001VB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ3\u0010\u0015\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00120\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\fJ\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b,\u0010(J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0017¢\u0006\u0004\b.\u0010(J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J1\u00107\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001cH\u0016¢\u0006\u0004\b7\u00108J1\u0010:\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u00108J\u0019\u0010;\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b;\u0010\u0010J!\u0010?\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010>\u001a\u00020/H\u0016¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\n¢\u0006\u0004\bA\u0010\fJ\r\u0010B\u001a\u00020\n¢\u0006\u0004\bB\u0010\fJ\r\u0010C\u001a\u00020\n¢\u0006\u0004\bC\u0010\fJ\r\u0010D\u001a\u00020\n¢\u0006\u0004\bD\u0010\fR\u0016\u0010G\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010HR\u0016\u0010>\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010FR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006W"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutCredit;", "Landroid/widget/FrameLayout;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "o", "()V", "Landroid/text/Editable;", "editable", OperatorName.ENDPATH, "(Landroid/text/Editable;)V", OperatorName.CLOSE_AND_STROKE, "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/util/credit_card/CardType;", "kotlin.jvm.PlatformType", OperatorName.NON_STROKING_CMYK, "()Lio/reactivex/Observable;", "", "i", "cardType", OperatorName.CLOSE_PATH, "(Lth/co/dtac/android/dtacone/util/credit_card/CardType;)V", "", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Lth/co/dtac/android/dtacone/util/credit_card/CardType;)I", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutCredit$OnTextChangListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTextChangeListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutCredit$OnTextChangListener;)V", "blockPasteChar", "blockCopyPaste", "setDigitNumber", "digits", "setDigit", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", TextBundle.TEXT_ENTRY, "setText", "textHint", "setTextHint", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "enableEditText", "(Z)V", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "afterTextChanged", "Landroid/view/View;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "focus", "clearFocusEdit", "showSoftKeyboard", "closeSoftKeyboard", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "ignoreNextTextChange", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutCredit$OnTextChangListener;", OperatorName.CURVE_TO, "Lio/reactivex/disposables/CompositeDisposable;", "d", "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Landroid/view/LayoutInflater;", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/TypedArray;", OperatorName.FILL_NON_ZERO, "Landroid/content/res/TypedArray;", "attributes", "OnTextChangListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit */
/* loaded from: classes7.dex */
public final class OneTextInputLayoutCredit extends FrameLayout implements TextWatcher, View.OnFocusChangeListener {
    public static final int $stable = 8;

    /* renamed from: a */
    public boolean f82937a;

    /* renamed from: b */
    public OnTextChangListener f82938b;

    /* renamed from: c */
    public boolean f82939c;

    /* renamed from: d */
    public final CompositeDisposable f82940d;

    /* renamed from: e */
    public final LayoutInflater f82941e;

    /* renamed from: f */
    public final TypedArray f82942f;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutCredit$OnTextChangListener;", "", "afterTextChanged", "", OperatorName.CLOSE_AND_STROKE, "Landroid/text/Editable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit$OnTextChangListener */
    /* loaded from: classes7.dex */
    public interface OnTextChangListener {
        void afterTextChanged(@Nullable Editable editable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputLayoutCredit(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82940d = new CompositeDisposable();
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82941e = (LayoutInflater) systemService;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneTextInputLayoutText);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…e.OneTextInputLayoutText)");
        this.f82942f = obtainStyledAttributes;
        m20044o();
    }

    /* renamed from: a */
    public static /* synthetic */ String m20058a(Function1 function1, Object obj) {
        return m20049j(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ CardType m20057b(Function1 function1, Object obj) {
        return m20047l(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ CardType m20056c(Function1 function1, Object obj) {
        return m20046m(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ CharSequence m20055d(String str, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m20042q(str, charSequence, i, i2, spanned, i3, i4);
    }

    /* renamed from: e */
    public static /* synthetic */ void m20054e(Function1 function1, Object obj) {
        m20039t(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m20053f(OneEditText oneEditText, View view) {
        m20043p(oneEditText, view);
    }

    /* renamed from: g */
    public static /* synthetic */ void m20052g(Function1 function1, Object obj) {
        m20038u(function1, obj);
    }

    /* renamed from: j */
    public static final String m20049j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final CardType m20047l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CardType) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final CardType m20046m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CardType) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m20043p(OneEditText oneEditText, View view) {
        Intrinsics.checkNotNullParameter(oneEditText, "$oneEditText");
        oneEditText.setText("");
    }

    /* renamed from: q */
    public static final CharSequence m20042q(String digits, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Intrinsics.checkNotNullParameter(digits, "$digits");
        while (i < i2) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) digits, charSequence.charAt(i), false, 2, (Object) null)) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* renamed from: t */
    public static final void m20039t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m20038u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        m20045n(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void blockCopyPaste() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        final OneEditText oneEditText = (OneEditText) findViewById;
        oneEditText.setBlockPaste(true);
        oneEditText.setUpdateListener(new OneEditText.UpdateListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit$blockCopyPaste$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCopy() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCut() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onPaste() {
                OneTextInputLayoutCredit.this.f82937a = true;
                oneEditText.addTextChangedListener(OneTextInputLayoutCredit.this);
            }
        });
    }

    public final void blockPasteChar() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        final OneEditText oneEditText = (OneEditText) findViewById;
        oneEditText.setUpdateListener(new OneEditText.UpdateListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit$blockPasteChar$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCopy() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCut() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onPaste() {
                ClipData.Item item;
                Object systemService = OneTextInputLayoutCredit.this.getContext().getSystemService("clipboard");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                if (clipboardManager.hasPrimaryClip()) {
                    ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
                    if (primaryClipDescription == null || primaryClipDescription.hasMimeType(HTTP.PLAIN_TEXT_TYPE)) {
                        ClipData primaryClip = clipboardManager.getPrimaryClip();
                        CharSequence charSequence = null;
                        if (primaryClip != null) {
                            item = primaryClip.getItemAt(0);
                        } else {
                            item = null;
                        }
                        if (item != null) {
                            charSequence = item.getText();
                        }
                        if (!new Regex("\\d+").matches(String.valueOf(charSequence))) {
                            oneEditText.setBlockPaste(true);
                        } else {
                            oneEditText.setBlockPaste(false);
                        }
                    }
                }
            }
        });
    }

    public final void clearFocusEdit() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        ((OneEditText) findViewById).clearFocus();
    }

    public final void closeSoftKeyboard() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        OneEditText oneEditText = (OneEditText) findViewById;
        if (oneEditText.requestFocus()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(oneEditText.getWindowToken(), 2);
        }
    }

    public final void enableEditText(boolean z) {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        OneEditText oneEditText = (OneEditText) findViewById;
        if (z) {
            ViewEnableKt.toEnable(oneEditText);
        } else {
            ViewEnableKt.toDisable(oneEditText);
        }
    }

    public final void focus() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        ((OneEditText) findViewById).requestFocus();
    }

    @NotNull
    public final String getText() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        return String.valueOf(((OneEditText) findViewById).getText());
    }

    /* renamed from: h */
    public final void m20051h(CardType cardType) {
        int m20041r = m20041r(cardType);
        View findViewById = findViewById(R.id.right_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.right_icon)");
        ((ImageView) findViewById).setImageResource(m20041r);
    }

    /* renamed from: i */
    public final Observable m20050i() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        Observable<CharSequence> debounce = RxTextView.textChanges((OneEditText) findViewById).debounce(100L, TimeUnit.MILLISECONDS);
        final OneTextInputLayoutCredit$creditNumberChange$1 oneTextInputLayoutCredit$creditNumberChange$1 = OneTextInputLayoutCredit$creditNumberChange$1.INSTANCE;
        Observable<R> map = debounce.map(new Function() { // from class: rf1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneTextInputLayoutCredit.m20058a(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "textChanges(\n           …ecialChar()\n            }");
        return map;
    }

    /* renamed from: k */
    public final Observable m20048k() {
        Observable m20050i = m20050i();
        final OneTextInputLayoutCredit$creditNumberObservable$1 oneTextInputLayoutCredit$creditNumberObservable$1 = OneTextInputLayoutCredit$creditNumberObservable$1.INSTANCE;
        Observable map = m20050i.map(new Function() { // from class: pf1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneTextInputLayoutCredit.m20056c(Function1.this, obj);
            }
        });
        final OneTextInputLayoutCredit$creditNumberObservable$2 oneTextInputLayoutCredit$creditNumberObservable$2 = OneTextInputLayoutCredit$creditNumberObservable$2.INSTANCE;
        return map.onErrorReturn(new Function() { // from class: qf1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneTextInputLayoutCredit.m20057b(Function1.this, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }

    /* renamed from: n */
    public final void m20045n(Editable editable) {
        if (editable == null) {
            return;
        }
        int length = editable.length();
        for (OneCreditCardSpanUtils oneCreditCardSpanUtils : (OneCreditCardSpanUtils[]) editable.getSpans(0, editable.length(), OneCreditCardSpanUtils.class)) {
            editable.removeSpan(oneCreditCardSpanUtils);
        }
        for (int i = 0; i < length; i++) {
            if (ArraysKt___ArraysKt.contains(new Integer[]{3, 7, 11}, Integer.valueOf(i))) {
                editable.setSpan(new OneCreditCardSpanUtils(12), i, i + 1, 33);
            }
        }
    }

    /* renamed from: o */
    public final void m20044o() {
        CharSequence text;
        addView(this.f82941e.inflate(R.layout.one_text_input_layout_credit, (ViewGroup) null));
        if (this.f82942f.hasValue(R.styleable.OneTextInputLayoutText_isCopyPaste) && !this.f82942f.getBoolean(R.styleable.OneTextInputLayoutText_isCopyPaste, true)) {
            blockCopyPaste();
        }
        View findViewById = findViewById(R.id.right_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.right_icon)");
        View findViewById2 = findViewById(R.id.textInputLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.textInputLayout)");
        OneTextInputLayout oneTextInputLayout = (OneTextInputLayout) findViewById2;
        View findViewById3 = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.edtText)");
        final OneEditText oneEditText = (OneEditText) findViewById3;
        oneEditText.addTextChangedListener(this);
        oneEditText.setOnFocusChangeListener(this);
        ((ImageView) findViewById).setOnClickListener(new View.OnClickListener() { // from class: lf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneTextInputLayoutCredit.m20053f(OneEditText.this, view);
            }
        });
        oneTextInputLayout.setTypeface(ResourcesCompat.getFont(getContext(), R.font.one_font_style));
        CharSequence text2 = this.f82942f.getText(R.styleable.OneTextInputLayoutText_input_text);
        if (text2 != null) {
            oneEditText.setText(text2);
        }
        oneEditText.setTextSize(this.f82942f.getDimension(R.styleable.OneTextInputLayoutText_input_size, 18.0f));
        CharSequence text3 = this.f82942f.getText(R.styleable.OneTextInputLayoutText_input_hint);
        if (text3 != null) {
            oneTextInputLayout.setHint(text3);
        }
        int i = this.f82942f.getInt(R.styleable.OneTextInputLayoutText_input_maxLength, 0);
        if (i > 0) {
            oneEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
        }
        int i2 = this.f82942f.getInt(R.styleable.OneTextInputLayoutText_android_inputType, 0);
        if (i2 != 0) {
            oneEditText.setInputType(i2);
        }
        if (this.f82942f.hasValue(R.styleable.OneTextInputLayoutText_is_enable)) {
            if (this.f82942f.getBoolean(R.styleable.OneTextInputLayoutText_is_enable, true)) {
                ViewEnableKt.toEnable(oneEditText);
            } else {
                ViewEnableKt.toDisable(oneEditText);
            }
        }
        if (this.f82942f.hasValue(R.styleable.OneTextInputLayoutText_android_imeOptions)) {
            oneEditText.setImeOptions(this.f82942f.getInt(R.styleable.OneTextInputLayoutText_android_imeOptions, 0));
        }
        if (this.f82942f.hasValue(R.styleable.OneTextInputLayoutText_isDigitNumber) && this.f82942f.getBoolean(R.styleable.OneTextInputLayoutText_isDigitNumber, false)) {
            setDigitNumber();
        }
        if (this.f82942f.hasValue(R.styleable.OneTextInputLayoutText_digits_text) && (text = this.f82942f.getText(R.styleable.OneTextInputLayoutText_digits_text)) != null) {
            setDigit(text.toString());
        }
        m20040s();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(@Nullable View view, boolean z) {
        this.f82939c = z;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: r */
    public final int m20041r(CardType cardType) {
        Integer num = (Integer) AbstractC11663a.mapOf(TuplesKt.m29136to(CardType.VISA, Integer.valueOf(R.drawable.ic_icon_visa)), TuplesKt.m29136to(CardType.JCB, Integer.valueOf(R.drawable.ic_icon_jcb)), TuplesKt.m29136to(CardType.MASTER_CARD, Integer.valueOf(R.drawable.ic_icon_mastercard))).get(cardType);
        if (num != null) {
            return num.intValue();
        }
        return R.drawable.ic_icon_credit_card;
    }

    /* renamed from: s */
    public final void m20040s() {
        CompositeDisposable compositeDisposable = this.f82940d;
        Observable m20048k = m20048k();
        final OneTextInputLayoutCredit$validationFrom$1 oneTextInputLayoutCredit$validationFrom$1 = new OneTextInputLayoutCredit$validationFrom$1(this);
        Consumer consumer = new Consumer() { // from class: nf1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneTextInputLayoutCredit.m20054e(Function1.this, obj);
            }
        };
        final OneTextInputLayoutCredit$validationFrom$2 oneTextInputLayoutCredit$validationFrom$2 = OneTextInputLayoutCredit$validationFrom$2.INSTANCE;
        compositeDisposable.add(m20048k.subscribe(consumer, new Consumer() { // from class: of1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneTextInputLayoutCredit.m20052g(Function1.this, obj);
            }
        }));
    }

    public final void setDigit(@NotNull final String digits) {
        Intrinsics.checkNotNullParameter(digits, "digits");
        InputFilter[] inputFilterArr = {new InputFilter() { // from class: mf1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return OneTextInputLayoutCredit.m20055d(digits, charSequence, i, i2, spanned, i3, i4);
            }
        }};
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        ((OneEditText) findViewById).setFilters(inputFilterArr);
    }

    public final void setDigitNumber() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        ((OneEditText) findViewById).setKeyListener(DigitsKeyListener.getInstance("0123456789"));
    }

    public final void setOnTextChangeListener(@NotNull OnTextChangListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82938b = listener;
    }

    public final void setText(@Nullable String str) {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        ((OneEditText) findViewById).setText(StringExtKt.toDisplayEmpty(str));
    }

    public final void setTextHint(@NotNull String textHint) {
        Intrinsics.checkNotNullParameter(textHint, "textHint");
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        ((OneEditText) findViewById).setHint(textHint);
    }

    public final void showSoftKeyboard() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        OneEditText oneEditText = (OneEditText) findViewById;
        if (oneEditText.requestFocus()) {
            Object systemService = getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(oneEditText, 1);
        }
    }
}