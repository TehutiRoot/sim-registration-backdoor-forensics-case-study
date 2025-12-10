package th.p047co.dtac.android.dtacone.app_one.widget;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import org.apache.http.protocol.HTTP;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewEnableKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001GB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0017J1\u0010 \u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J1\u0010#\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010!J\u0019\u0010%\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\rJ\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\rJ\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\rJ\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u0010\rR\u0018\u00103\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00104R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010F\u001a\u0004\u0018\u00010\u001a2\b\u0010A\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone;", "Landroid/widget/FrameLayout;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnFocusChangeListener;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone$OnTextChangListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTextChangeListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone$OnTextChangListener;)V", "", "getText", "()Ljava/lang/String;", TextBundle.TEXT_ENTRY, "setText", "(Ljava/lang/String;)V", "textHint", "setTextHint", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Landroid/view/View;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "onCut", "onCopy", "onPaste", "focus", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Boolean;", "isShowClearIcon", "Z", "isBlockPaste", OperatorName.CURVE_TO, "d", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone$OnTextChangListener;", "Landroid/view/LayoutInflater;", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/TypedArray;", OperatorName.FILL_NON_ZERO, "Landroid/content/res/TypedArray;", "attributes", "value", "getInputLayoutHint", "()Ljava/lang/CharSequence;", "setInputLayoutHint", "(Ljava/lang/CharSequence;)V", "inputLayoutHint", "OnTextChangListener", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SuppressLint({"CustomViewStyleable"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone */
/* loaded from: classes7.dex */
public final class OneTextInputLayoutPhone extends FrameLayout implements TextWatcher, View.OnFocusChangeListener, OneEditText.UpdateListener {
    public static final int $stable = 8;

    /* renamed from: a */
    public Boolean f82953a;

    /* renamed from: b */
    public boolean f82954b;

    /* renamed from: c */
    public boolean f82955c;

    /* renamed from: d */
    public OnTextChangListener f82956d;

    /* renamed from: e */
    public final LayoutInflater f82957e;

    /* renamed from: f */
    public final TypedArray f82958f;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutPhone$OnTextChangListener;", "", "afterTextChanged", "", OperatorName.CLOSE_AND_STROKE, "Landroid/text/Editable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone$OnTextChangListener */
    /* loaded from: classes7.dex */
    public interface OnTextChangListener {
        void afterTextChanged(@Nullable Editable editable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputLayoutPhone(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82953a = Boolean.TRUE;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82957e = (LayoutInflater) systemService;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneTextInputLayoutPhone);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr….OneTextInputLayoutPhone)");
        this.f82958f = obtainStyledAttributes;
        m20033b();
    }

    /* renamed from: a */
    public static /* synthetic */ void m20034a(OneEditText oneEditText, View view) {
        m20032c(oneEditText, view);
    }

    /* renamed from: b */
    private final void m20033b() {
        addView(this.f82957e.inflate(R.layout.one_text_input_layout_phone, (ViewGroup) null));
        View findViewById = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.btnClearText)");
        View findViewById2 = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.editPhoneNumber)");
        final OneEditText oneEditText = (OneEditText) findViewById2;
        EditTextextKt.maskPhoneFormat(oneEditText, Constant.PHONE_FORMAT);
        oneEditText.addTextChangedListener(this);
        oneEditText.setOnFocusChangeListener(this);
        oneEditText.setUpdateListener(this);
        ((ImageView) findViewById).setOnClickListener(new View.OnClickListener() { // from class: tf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneTextInputLayoutPhone.m20034a(OneEditText.this, view);
            }
        });
        View findViewById3 = findViewById(R.id.textInputLayoutPhone);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.textInputLayoutPhone)");
        OneTextInputLayout oneTextInputLayout = (OneTextInputLayout) findViewById3;
        oneTextInputLayout.setTypeface(ResourcesCompat.getFont(getContext(), R.font.one_font_style));
        if (this.f82958f.hasValue(R.styleable.OneTextInputLayoutPhone_is_enable)) {
            if (this.f82958f.getBoolean(R.styleable.OneTextInputLayoutPhone_is_enable, true)) {
                ViewEnableKt.toEnable(oneEditText);
            } else {
                ViewEnableKt.toDisable(oneEditText);
            }
        }
        if (this.f82958f.hasValue(R.styleable.OneTextInputLayoutPhone_input_hint)) {
            oneTextInputLayout.setHint(this.f82958f.getText(R.styleable.OneTextInputLayoutPhone_input_hint));
        }
        if (this.f82958f.hasValue(R.styleable.OneTextInputLayoutPhone_isShowClear)) {
            this.f82953a = Boolean.valueOf(this.f82958f.getBoolean(R.styleable.OneTextInputLayoutPhone_isShowClear, true));
        }
        if (this.f82958f.hasValue(R.styleable.OneTextInputLayoutPhone_isBlockPaste)) {
            this.f82954b = this.f82958f.getBoolean(R.styleable.OneTextInputLayoutPhone_isBlockPaste, false);
        }
        if (this.f82958f.hasValue(R.styleable.OneTextInputLayoutPhone_android_imeOptions)) {
            oneEditText.setImeOptions(this.f82958f.getInt(R.styleable.OneTextInputLayoutPhone_android_imeOptions, 0));
        }
    }

    /* renamed from: c */
    public static final void m20032c(OneEditText edtPhoneNumber, View view) {
        Intrinsics.checkNotNullParameter(edtPhoneNumber, "$edtPhoneNumber");
        edtPhoneNumber.setText("");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        int i;
        OnTextChangListener onTextChangListener = this.f82956d;
        if (onTextChangListener != null) {
            onTextChangListener.afterTextChanged(editable);
        }
        View findViewById = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.btnClearText)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.editPhoneNumber)");
        Editable text = ((OneEditText) findViewById2).getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        if (i > 0 && Intrinsics.areEqual(this.f82953a, Boolean.TRUE) && this.f82955c) {
            ViewVisibleExtKt.toVisible(imageView);
        } else {
            ViewVisibleExtKt.toGone(imageView);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void focus() {
        View findViewById = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.editPhoneNumber)");
        ((OneEditText) findViewById).requestFocus();
    }

    @Nullable
    public final CharSequence getInputLayoutHint() {
        return ((OneTextInputLayout) findViewById(R.id.textInputLayoutPhone)).getHint();
    }

    @NotNull
    public final String getText() {
        View findViewById = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.editPhoneNumber)");
        return String.valueOf(((OneEditText) findViewById).getText());
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onCopy() {
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onCut() {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(@Nullable View view, boolean z) {
        int i;
        View findViewById = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.editPhoneNumber)");
        OneEditText oneEditText = (OneEditText) findViewById;
        View findViewById2 = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.btnClearText)");
        ImageView imageView = (ImageView) findViewById2;
        this.f82955c = z;
        if (z) {
            Editable text = oneEditText.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            if (i > 0 && Intrinsics.areEqual(this.f82953a, Boolean.TRUE)) {
                ViewVisibleExtKt.toVisible(imageView);
                return;
            } else {
                ViewVisibleExtKt.toGone(imageView);
                return;
            }
        }
        ViewVisibleExtKt.toGone(imageView);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onPaste() {
        ClipData.Item item;
        CharSequence charSequence;
        View findViewById = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.editPhoneNumber)");
        OneEditText oneEditText = (OneEditText) findViewById;
        Object systemService = getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager.hasPrimaryClip()) {
            ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
            if (primaryClipDescription == null || primaryClipDescription.hasMimeType(HTTP.PLAIN_TEXT_TYPE)) {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip != null) {
                    item = primaryClip.getItemAt(0);
                } else {
                    item = null;
                }
                if (item != null) {
                    charSequence = item.getText();
                } else {
                    charSequence = null;
                }
                String valueOf = String.valueOf(charSequence);
                if (!new Regex("\\d+").matches(valueOf)) {
                    oneEditText.setBlockPaste(true);
                } else if (!AbstractC19741eO1.startsWith$default(valueOf, "0", false, 2, null) && !AbstractC19741eO1.startsWith$default(valueOf, "66", false, 2, null)) {
                    oneEditText.setBlockPaste(true);
                } else {
                    oneEditText.setBlockPaste(false);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void setInputLayoutHint(@Nullable CharSequence charSequence) {
        ((OneTextInputLayout) findViewById(R.id.textInputLayoutPhone)).setHint(charSequence);
    }

    public final void setOnTextChangeListener(@NotNull OnTextChangListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82956d = listener;
    }

    public final void setText(@Nullable String str) {
        View findViewById = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.editPhoneNumber)");
        ((OneEditText) findViewById).setText(StringExtKt.toDisplayEmpty(str));
    }

    public final void setTextHint(@NotNull String textHint) {
        Intrinsics.checkNotNullParameter(textHint, "textHint");
        View findViewById = findViewById(R.id.editPhoneNumber);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.editPhoneNumber)");
        ((OneEditText) findViewById).setHint(textHint);
    }
}