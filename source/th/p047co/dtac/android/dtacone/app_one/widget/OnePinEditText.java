package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePinEditText;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberWatcher;
import th.p047co.dtac.android.dtacone.widget.EmojiExcludeFilter;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0017J1\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010\"\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010 J\u0019\u0010$\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010\u0017R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006?"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText;", "Landroid/widget/FrameLayout;", "Landroid/text/TextWatcher;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText$OnePinTextWatcher;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnePinTextChangedListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText$OnePinTextWatcher;)V", "", TextBundle.TEXT_ENTRY, "setText", "(Ljava/lang/String;)V", "hint", "setHint", "getText", "()Ljava/lang/String;", "focus", "()V", "clear", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "e", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "isAutoFormat", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "isCapitalLetter", OperatorName.CURVE_TO, "isEmojiExclude", "d", "isBlockPaste", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/res/TypedArray;", OperatorName.FILL_NON_ZERO, "Landroid/content/res/TypedArray;", "typedArray", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText$OnePinTextWatcher;", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", "getEditText", "()Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", "editText", "OnePinTextWatcher", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OnePinEditText */
/* loaded from: classes7.dex */
public final class OnePinEditText extends FrameLayout implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public boolean f82831a;

    /* renamed from: b */
    public boolean f82832b;

    /* renamed from: c */
    public boolean f82833c;

    /* renamed from: d */
    public boolean f82834d;

    /* renamed from: e */
    public final LayoutInflater f82835e;

    /* renamed from: f */
    public final TypedArray f82836f;

    /* renamed from: g */
    public OnePinTextWatcher f82837g;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OnePinEditText$OnePinTextWatcher;", "", "afterTextChanged", "", OperatorName.CLOSE_AND_STROKE, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OnePinEditText$OnePinTextWatcher */
    /* loaded from: classes7.dex */
    public interface OnePinTextWatcher {
        void afterTextChanged(@Nullable Editable editable);

        void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3);

        void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePinEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f82835e = (LayoutInflater) systemService;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnePinEditText);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…styleable.OnePinEditText)");
        this.f82836f = obtainStyledAttributes;
        m19890e();
    }

    /* renamed from: a */
    public static /* synthetic */ void m19894a(OneCustomClearableEditText oneCustomClearableEditText, ImageView imageView, View view, boolean z) {
        m19889f(oneCustomClearableEditText, imageView, view, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19893b(OnePinEditText onePinEditText) {
        m19891d(onePinEditText);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19892c(OneCustomClearableEditText oneCustomClearableEditText, View view) {
        m19888g(oneCustomClearableEditText, view);
    }

    /* renamed from: d */
    public static final void m19891d(OnePinEditText this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this$0.findViewById(R.id.edtConfirmPin), 1);
    }

    /* renamed from: f */
    public static final void m19889f(OneCustomClearableEditText edtPhoneNumber, ImageView ivClearText, View view, boolean z) {
        Intrinsics.checkNotNullParameter(edtPhoneNumber, "$edtPhoneNumber");
        Intrinsics.checkNotNullParameter(ivClearText, "$ivClearText");
        if (z && String.valueOf(edtPhoneNumber.getText()).length() > 0) {
            ivClearText.setVisibility(0);
        } else {
            ivClearText.setVisibility(8);
        }
    }

    /* renamed from: g */
    public static final void m19888g(OneCustomClearableEditText edtPhoneNumber, View view) {
        Intrinsics.checkNotNullParameter(edtPhoneNumber, "$edtPhoneNumber");
        edtPhoneNumber.setText("");
    }

    public final void addOnePinTextChangedListener(@NotNull OnePinTextWatcher listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82837g = listener;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        OnePinTextWatcher onePinTextWatcher = this.f82837g;
        if (onePinTextWatcher != null) {
            onePinTextWatcher.afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        OnePinTextWatcher onePinTextWatcher = this.f82837g;
        if (onePinTextWatcher != null) {
            onePinTextWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public final void clear() {
        ((OneCustomClearableEditText) findViewById(R.id.edtConfirmPin)).clearFocus();
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((OneCustomClearableEditText) findViewById(R.id.edtConfirmPin)).getWindowToken(), 2);
    }

    /* renamed from: e */
    public final void m19890e() {
        addView(this.f82835e.inflate(R.layout.one_text_input_pin, (ViewGroup) null));
        try {
            this.f82832b = this.f82836f.getBoolean(R.styleable.OnePinEditText_capital, false);
            this.f82831a = this.f82836f.getBoolean(R.styleable.OnePinEditText_autoFormat, false);
            this.f82833c = this.f82836f.getBoolean(R.styleable.OnePinEditText_emojiExclude, false);
            this.f82834d = this.f82836f.getBoolean(R.styleable.OnePinEditText_isBlockPaste, false);
            this.f82836f.recycle();
            View findViewById = findViewById(R.id.ivClearText);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.ivClearText)");
            final ImageView imageView = (ImageView) findViewById;
            View findViewById2 = findViewById(R.id.edtConfirmPin);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.edtConfirmPin)");
            final OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) findViewById2;
            oneCustomClearableEditText.addTextChangedListener(this);
            oneCustomClearableEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n01
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    OnePinEditText.m19894a(OneCustomClearableEditText.this, imageView, view, z);
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o01
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnePinEditText.m19892c(OneCustomClearableEditText.this, view);
                }
            });
            if (this.f82831a) {
                oneCustomClearableEditText.addTextChangedListener(new PhoneNumberWatcher(oneCustomClearableEditText));
            }
            if (this.f82832b) {
                oneCustomClearableEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            }
            if (this.f82833c) {
                oneCustomClearableEditText.setFilters(new InputFilter[]{new EmojiExcludeFilter()});
            }
            if (this.f82834d) {
                oneCustomClearableEditText.setBlockPaste(true);
            }
        } catch (Throwable th2) {
            this.f82836f.recycle();
            throw th2;
        }
    }

    public final void focus() {
        ((OneCustomClearableEditText) findViewById(R.id.edtConfirmPin)).requestFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m01
            {
                OnePinEditText.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OnePinEditText.m19893b(OnePinEditText.this);
            }
        }, 0L);
    }

    @NotNull
    public final OneCustomClearableEditText getEditText() {
        View findViewById = findViewById(R.id.edtConfirmPin);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.edtConfirmPin)");
        return (OneCustomClearableEditText) findViewById;
    }

    @Nullable
    public final String getText() {
        return String.valueOf(((OneCustomClearableEditText) findViewById(R.id.edtConfirmPin)).getText());
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        OnePinTextWatcher onePinTextWatcher = this.f82837g;
        if (onePinTextWatcher != null) {
            onePinTextWatcher.onTextChanged(charSequence, i, i2, i3);
        }
        View findViewById = findViewById(R.id.ivClearText);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.ivClearText)");
        ImageView imageView = (ImageView) findViewById;
        if (charSequence != null && charSequence.length() != 0) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void setHint(@Nullable String str) {
        ((OneCustomClearableEditText) findViewById(R.id.edtConfirmPin)).setHint(str);
    }

    public final void setText(@Nullable String str) {
        ((OneCustomClearableEditText) findViewById(R.id.edtConfirmPin)).setText(str);
    }
}
