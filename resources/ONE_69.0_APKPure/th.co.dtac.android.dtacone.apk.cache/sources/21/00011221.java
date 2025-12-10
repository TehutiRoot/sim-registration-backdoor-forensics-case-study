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
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.protocol.HTTP;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewEnableKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\\B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J1\u0010'\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010(J\u0019\u0010,\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020\u001dH\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010\u0010J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u0010J\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u0010J\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u0010J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0010R\u0016\u0010:\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0016\u00100\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001f\u0010M\u001a\n H*\u0004\u0018\u00010G0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR(\u0010S\u001a\u0004\u0018\u00010!2\b\u0010N\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010X\u001a\u00020#2\u0006\u0010N\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010[\u001a\u00020#2\u0006\u0010N\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010W¨\u0006]"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText;", "Landroid/widget/FrameLayout;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText$OnTextChangListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnTextChangeListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText$OnTextChangListener;)V", "blockPasteChar", "()V", "blockCopyPaste", "setDigitNumber", "", "digits", "setDigit", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", TextBundle.TEXT_ENTRY, "setText", "textHint", "setTextHint", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "enableEditText", "(Z)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Landroid/view/View;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "focus", "clearFocusEdit", "showSoftKeyboard", "closeSoftKeyboard", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "ignoreNextTextChange", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText$OnTextChangListener;", "d", "Ljava/lang/Boolean;", "isShowClearIcon", "Landroid/view/LayoutInflater;", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/TypedArray;", OperatorName.FILL_NON_ZERO, "Landroid/content/res/TypedArray;", "attributes", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText;", "kotlin.jvm.PlatformType", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText;", "getEdtText", "()Lth/co/dtac/android/dtacone/app_one/widget/OneEditText;", "edtText", "value", "getInputLayoutHint", "()Ljava/lang/CharSequence;", "setInputLayoutHint", "(Ljava/lang/CharSequence;)V", "inputLayoutHint", "getImeOptions", "()I", "setImeOptions", "(I)V", "imeOptions", "getInputType", "setInputType", "inputType", "OnTextChangListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText */
/* loaded from: classes7.dex */
public final class OneTextInputLayoutText extends FrameLayout implements TextWatcher, View.OnFocusChangeListener {
    public static final int $stable = 8;

    /* renamed from: a */
    public boolean f82959a;

    /* renamed from: b */
    public OnTextChangListener f82960b;

    /* renamed from: c */
    public boolean f82961c;

    /* renamed from: d */
    public Boolean f82962d;

    /* renamed from: e */
    public final LayoutInflater f82963e;

    /* renamed from: f */
    public final TypedArray f82964f;

    /* renamed from: g */
    public final OneEditText f82965g;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutText$OnTextChangListener;", "", "afterTextChanged", "", OperatorName.CLOSE_AND_STROKE, "Landroid/text/Editable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText$OnTextChangListener */
    /* loaded from: classes7.dex */
    public interface OnTextChangListener {
        void afterTextChanged(@Nullable Editable editable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputLayoutText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82962d = Boolean.TRUE;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82963e = (LayoutInflater) systemService;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneTextInputLayoutText);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…e.OneTextInputLayoutText)");
        this.f82964f = obtainStyledAttributes;
        m20029c();
        this.f82965g = (OneEditText) findViewById(R.id.edtText);
    }

    /* renamed from: b */
    public static /* synthetic */ CharSequence m20030b(String str, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m20027e(str, charSequence, i, i2, spanned, i3, i4);
    }

    /* renamed from: d */
    public static final void m20028d(OneEditText oneEditText, View view) {
        Intrinsics.checkNotNullParameter(oneEditText, "$oneEditText");
        oneEditText.setText("");
    }

    /* renamed from: e */
    public static final CharSequence m20027e(String digits, CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Intrinsics.checkNotNullParameter(digits, "$digits");
        while (i < i2) {
            if (!StringsKt__StringsKt.contains$default((CharSequence) digits, charSequence.charAt(i), false, 2, (Object) null)) {
                return "";
            }
            i++;
        }
        return null;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        int i = 0;
        if (this.f82959a) {
            this.f82959a = false;
            return;
        }
        View findViewById = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.btnClearText)");
        ImageView imageView = (ImageView) findViewById;
        OnTextChangListener onTextChangListener = this.f82960b;
        if (onTextChangListener != null) {
            onTextChangListener.afterTextChanged(editable);
        }
        if (editable != null) {
            i = editable.length();
        }
        if (i > 0 && Intrinsics.areEqual(this.f82962d, Boolean.TRUE) && this.f82961c) {
            ViewVisibleExtKt.toVisible(imageView);
        } else {
            ViewVisibleExtKt.toGone(imageView);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void blockCopyPaste() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        final OneEditText oneEditText = (OneEditText) findViewById;
        oneEditText.setBlockPaste(true);
        oneEditText.setUpdateListener(new OneEditText.UpdateListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText$blockCopyPaste$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCopy() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCut() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onPaste() {
                OneTextInputLayoutText.this.f82959a = true;
                oneEditText.addTextChangedListener(OneTextInputLayoutText.this);
            }
        });
    }

    public final void blockPasteChar() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        final OneEditText oneEditText = (OneEditText) findViewById;
        oneEditText.setUpdateListener(new OneEditText.UpdateListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText$blockPasteChar$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCopy() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onCut() {
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
            public void onPaste() {
                ClipData.Item item;
                Object systemService = OneTextInputLayoutText.this.getContext().getSystemService("clipboard");
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

    /* renamed from: c */
    public final void m20029c() {
        CharSequence text;
        addView(this.f82963e.inflate(R.layout.one_text_input_layout_text, (ViewGroup) null));
        if (this.f82964f.hasValue(R.styleable.OneTextInputLayoutText_isCopyPaste) && !this.f82964f.getBoolean(R.styleable.OneTextInputLayoutText_isCopyPaste, true)) {
            blockCopyPaste();
        }
        View findViewById = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.btnClearText)");
        View findViewById2 = findViewById(R.id.textInputLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.textInputLayout)");
        OneTextInputLayout oneTextInputLayout = (OneTextInputLayout) findViewById2;
        View findViewById3 = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.edtText)");
        final OneEditText oneEditText = (OneEditText) findViewById3;
        oneEditText.addTextChangedListener(this);
        oneEditText.setOnFocusChangeListener(this);
        ((ImageView) findViewById).setOnClickListener(new View.OnClickListener() { // from class: uf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneTextInputLayoutText.m20028d(OneEditText.this, view);
            }
        });
        oneTextInputLayout.setTypeface(ResourcesCompat.getFont(getContext(), R.font.one_font_style));
        CharSequence text2 = this.f82964f.getText(R.styleable.OneTextInputLayoutText_input_text);
        if (text2 != null) {
            oneEditText.setText(text2);
        }
        oneEditText.setTextSize(this.f82964f.getDimension(R.styleable.OneTextInputLayoutText_input_size, 18.0f));
        CharSequence text3 = this.f82964f.getText(R.styleable.OneTextInputLayoutText_input_hint);
        if (text3 != null) {
            oneTextInputLayout.setHint(text3);
        }
        int i = this.f82964f.getInt(R.styleable.OneTextInputLayoutText_input_maxLength, 0);
        if (i > 0) {
            oneEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
        }
        int i2 = this.f82964f.getInt(R.styleable.OneTextInputLayoutText_android_inputType, 0);
        if (i2 != 0) {
            oneEditText.setInputType(i2);
        }
        if (this.f82964f.hasValue(R.styleable.OneTextInputLayoutText_is_enable)) {
            if (this.f82964f.getBoolean(R.styleable.OneTextInputLayoutText_is_enable, true)) {
                ViewEnableKt.toEnable(oneEditText);
            } else {
                ViewEnableKt.toDisable(oneEditText);
            }
        }
        if (this.f82964f.hasValue(R.styleable.OneTextInputLayoutText_isShowClear)) {
            this.f82962d = Boolean.valueOf(this.f82964f.getBoolean(R.styleable.OneTextInputLayoutText_isShowClear, true));
        }
        if (this.f82964f.hasValue(R.styleable.OneTextInputLayoutText_android_imeOptions)) {
            oneEditText.setImeOptions(this.f82964f.getInt(R.styleable.OneTextInputLayoutText_android_imeOptions, 0));
        }
        if (this.f82964f.hasValue(R.styleable.OneTextInputLayoutText_isDigitNumber) && this.f82964f.getBoolean(R.styleable.OneTextInputLayoutText_isDigitNumber, false)) {
            setDigitNumber();
        }
        if (this.f82964f.hasValue(R.styleable.OneTextInputLayoutText_digits_text) && (text = this.f82964f.getText(R.styleable.OneTextInputLayoutText_digits_text)) != null) {
            setDigit(text.toString());
        }
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

    public final OneEditText getEdtText() {
        return this.f82965g;
    }

    public final int getImeOptions() {
        return ((OneEditText) findViewById(R.id.edtText)).getImeOptions();
    }

    @Nullable
    public final CharSequence getInputLayoutHint() {
        return ((OneTextInputLayout) findViewById(R.id.textInputLayout)).getHint();
    }

    public final int getInputType() {
        return ((OneEditText) findViewById(R.id.edtText)).getInputType();
    }

    @NotNull
    public final String getText() {
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        return String.valueOf(((OneEditText) findViewById).getText());
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(@Nullable View view, boolean z) {
        int i;
        View findViewById = findViewById(R.id.edtText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtText)");
        OneEditText oneEditText = (OneEditText) findViewById;
        View findViewById2 = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.btnClearText)");
        ImageView imageView = (ImageView) findViewById2;
        this.f82961c = z;
        if (z) {
            Editable text = oneEditText.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            if (i > 0 && Intrinsics.areEqual(this.f82962d, Boolean.TRUE)) {
                ViewVisibleExtKt.toVisible(imageView);
                return;
            } else {
                ViewVisibleExtKt.toGone(imageView);
                return;
            }
        }
        ViewVisibleExtKt.toGone(imageView);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void setDigit(@NotNull final String digits) {
        Intrinsics.checkNotNullParameter(digits, "digits");
        InputFilter[] inputFilterArr = {new InputFilter() { // from class: vf1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return OneTextInputLayoutText.m20030b(digits, charSequence, i, i2, spanned, i3, i4);
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

    public final void setImeOptions(int i) {
        ((OneEditText) findViewById(R.id.edtText)).setImeOptions(i);
    }

    public final void setInputLayoutHint(@Nullable CharSequence charSequence) {
        ((OneTextInputLayout) findViewById(R.id.textInputLayout)).setHint(charSequence);
    }

    public final void setInputType(int i) {
        ((OneEditText) findViewById(R.id.edtText)).setInputType(i);
    }

    public final void setOnTextChangeListener(@NotNull OnTextChangListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82960b = listener;
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