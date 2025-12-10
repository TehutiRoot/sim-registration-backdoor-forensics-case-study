package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberWatcher;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.widget.EmojiExcludeFilter;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneClearableEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneInteractiveEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "init", "()V", "onRightTouchUpAction", "onTouchActionDown", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "", TextBundle.TEXT_ENTRY, "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "isShow", "setShowClearButton", "(Z)V", "resId", "setTextAndCompoundColor", "(I)V", OperatorName.LINE_TO, "Z", "isShowClearButton", OperatorName.MOVE_TO, "isAutoFormat", OperatorName.ENDPATH, "isCapitalLetter", "o", "isEmojiExclude", "p", "isBlockPaste", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneClearableEditText */
/* loaded from: classes7.dex */
public final class OneClearableEditText extends OneInteractiveEditText {
    public static final int $stable = 8;

    /* renamed from: l */
    public boolean f82758l;

    /* renamed from: m */
    public boolean f82759m;

    /* renamed from: n */
    public boolean f82760n;

    /* renamed from: o */
    public boolean f82761o;

    /* renamed from: p */
    public boolean f82762p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneClearableEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82758l = true;
        init();
    }

    private final void init() {
        if (this.f82759m) {
            addTextChangedListener(new PhoneNumberWatcher(this));
        }
        if (this.f82760n) {
            setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        }
        if (this.f82761o) {
            setFilters(new InputFilter[]{new EmojiExcludeFilter()});
        }
        setBlockPaste(this.f82762p);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        boolean z2;
        super.onFocusChanged(z, i, rect);
        if (this.f82758l) {
            int i2 = R.drawable.ic_close;
            if (z && StringUtil.hasText(getText())) {
                z2 = true;
            } else {
                z2 = false;
            }
            setupRightDrawable(i2, z2);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText
    public void onRightTouchUpAction() {
        setText("");
    }

    @Override // android.widget.TextView
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        if (getDrawables() != null && this.f82758l) {
            int i4 = R.drawable.ic_close;
            if (isFocused() && StringUtil.hasText(getText())) {
                z = true;
            } else {
                z = false;
            }
            setupRightDrawable(i4, z);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText
    public void onTouchActionDown() {
    }

    public final void setShowClearButton(boolean z) {
        this.f82758l = z;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText
    public void setTextAndCompoundColor(int i) {
        super.setTextAndCompoundColor(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneClearableEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82758l = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneClearableEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…eClearableEditText, 0, 0)");
        try {
            this.f82760n = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_capital, false);
            this.f82758l = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_showClearButton, true);
            this.f82759m = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_autoFormat, false);
            this.f82761o = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_emojiExclude, false);
            this.f82762p = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_isBlockPaste, false);
            obtainStyledAttributes.recycle();
            init();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneClearableEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82758l = true;
        init();
    }
}
