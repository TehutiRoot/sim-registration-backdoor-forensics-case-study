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
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutIDCard;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewEnableKt;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001AB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0015J1\u0010\u001e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010!\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u0019\u0010#\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010,J\r\u0010/\u001a\u00020\r¢\u0006\u0004\b/\u0010,J\u000f\u00100\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010,R\u0018\u00103\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00104R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutIDCard;", "Landroid/widget/FrameLayout;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnFocusChangeListener;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutIDCard$OnTextChangListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnTextChangeListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutIDCard$OnTextChangListener;)V", "", "getText", "()Ljava/lang/String;", TextBundle.TEXT_ENTRY, "setText", "(Ljava/lang/String;)V", "textHint", "setTextHint", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Landroid/view/View;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "onCut", "()V", "onCopy", "onPaste", "focus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Boolean;", "isShowClearIcon", "Z", "isBlockPaste", OperatorName.CURVE_TO, "d", "Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutIDCard$OnTextChangListener;", "Landroid/view/LayoutInflater;", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/TypedArray;", OperatorName.FILL_NON_ZERO, "Landroid/content/res/TypedArray;", "attributes", "OnTextChangListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SuppressLint({"CustomViewStyleable"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutIDCard */
/* loaded from: classes7.dex */
public final class OneTextInputLayoutIDCard extends FrameLayout implements TextWatcher, View.OnFocusChangeListener, OneEditText.UpdateListener {
    public static final int $stable = 8;

    /* renamed from: a */
    public Boolean f82855a;

    /* renamed from: b */
    public boolean f82856b;

    /* renamed from: c */
    public boolean f82857c;

    /* renamed from: d */
    public OnTextChangListener f82858d;

    /* renamed from: e */
    public final LayoutInflater f82859e;

    /* renamed from: f */
    public final TypedArray f82860f;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneTextInputLayoutIDCard$OnTextChangListener;", "", "afterTextChanged", "", OperatorName.CLOSE_AND_STROKE, "Landroid/text/Editable;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutIDCard$OnTextChangListener */
    /* loaded from: classes7.dex */
    public interface OnTextChangListener {
        void afterTextChanged(@Nullable Editable editable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputLayoutIDCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82855a = Boolean.TRUE;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82859e = (LayoutInflater) systemService;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OneTextInputLayoutIdCard);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…OneTextInputLayoutIdCard)");
        this.f82860f = obtainStyledAttributes;
        m19861b();
    }

    /* renamed from: a */
    public static /* synthetic */ void m19862a(OneEditText oneEditText, View view) {
        m19860c(oneEditText, view);
    }

    /* renamed from: c */
    public static final void m19860c(OneEditText idCardEditText, View view) {
        Intrinsics.checkNotNullParameter(idCardEditText, "$idCardEditText");
        idCardEditText.setText("");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        int i;
        View findViewById = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.btnClearText)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.idCardEditText)");
        Editable text = ((OneEditText) findViewById2).getText();
        OnTextChangListener onTextChangListener = this.f82858d;
        if (onTextChangListener != null) {
            onTextChangListener.afterTextChanged(editable);
        }
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        if (i > 0 && Intrinsics.areEqual(this.f82855a, Boolean.TRUE) && this.f82857c) {
            ViewVisibleExtKt.toVisible(imageView);
        } else {
            ViewVisibleExtKt.toGone(imageView);
        }
    }

    /* renamed from: b */
    public final void m19861b() {
        addView(this.f82859e.inflate(R.layout.one_text_input_layout_id_card, (ViewGroup) null));
        View findViewById = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.btnClearText)");
        View findViewById2 = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.idCardEditText)");
        final OneEditText oneEditText = (OneEditText) findViewById2;
        EditTextextKt.maskIDCardFormat(oneEditText, Constant.NATION_CARD_FORMAT);
        oneEditText.addTextChangedListener(this);
        oneEditText.setOnFocusChangeListener(this);
        oneEditText.setUpdateListener(this);
        ((ImageView) findViewById).setOnClickListener(new View.OnClickListener() { // from class: ve1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneTextInputLayoutIDCard.m19862a(OneEditText.this, view);
            }
        });
        View findViewById3 = findViewById(R.id.idCardTextInputLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.idCardTextInputLayout)");
        OneTextInputLayout oneTextInputLayout = (OneTextInputLayout) findViewById3;
        oneTextInputLayout.setTypeface(ResourcesCompat.getFont(getContext(), R.font.one_font_style));
        if (this.f82860f.hasValue(R.styleable.OneTextInputLayoutIdCard_is_enable)) {
            if (this.f82860f.getBoolean(R.styleable.OneTextInputLayoutIdCard_is_enable, true)) {
                ViewEnableKt.toEnable(oneEditText);
            } else {
                ViewEnableKt.toDisable(oneEditText);
            }
        }
        if (this.f82860f.hasValue(R.styleable.OneTextInputLayoutIdCard_input_hint)) {
            oneTextInputLayout.setHint(this.f82860f.getText(R.styleable.OneTextInputLayoutIdCard_input_hint));
        }
        if (this.f82860f.hasValue(R.styleable.OneTextInputLayoutIdCard_isShowClear)) {
            this.f82855a = Boolean.valueOf(this.f82860f.getBoolean(R.styleable.OneTextInputLayoutIdCard_isShowClear, true));
        }
        if (this.f82860f.hasValue(R.styleable.OneTextInputLayoutIdCard_isBlockPaste)) {
            this.f82856b = this.f82860f.getBoolean(R.styleable.OneTextInputLayoutIdCard_isBlockPaste, false);
        }
        if (this.f82860f.hasValue(R.styleable.OneTextInputLayoutIdCard_android_imeOptions)) {
            oneEditText.setImeOptions(this.f82860f.getInt(R.styleable.OneTextInputLayoutIdCard_android_imeOptions, 0));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void focus() {
        View findViewById = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.idCardEditText)");
        ((OneEditText) findViewById).requestFocus();
    }

    @NotNull
    public final String getText() {
        View findViewById = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.idCardEditText)");
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
        View findViewById = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.idCardEditText)");
        OneEditText oneEditText = (OneEditText) findViewById;
        View findViewById2 = findViewById(R.id.btnClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.btnClearText)");
        ImageView imageView = (ImageView) findViewById2;
        this.f82857c = z;
        if (z) {
            Editable text = oneEditText.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            if (i > 0 && Intrinsics.areEqual(this.f82855a, Boolean.TRUE)) {
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
        View findViewById = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.idCardEditText)");
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
                } else if (!AbstractC20204hN1.startsWith$default(valueOf, "0", false, 2, null) && !AbstractC20204hN1.startsWith$default(valueOf, "66", false, 2, null)) {
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

    public final void setOnTextChangeListener(@NotNull OnTextChangListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82858d = listener;
    }

    public final void setText(@Nullable String str) {
        View findViewById = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.idCardEditText)");
        ((OneEditText) findViewById).setText(StringExtKt.toDisplayEmpty(str));
    }

    public final void setTextHint(@NotNull String textHint) {
        Intrinsics.checkNotNullParameter(textHint, "textHint");
        View findViewById = findViewById(R.id.idCardEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.idCardEditText)");
        ((OneEditText) findViewById).setHint(textHint);
    }
}
