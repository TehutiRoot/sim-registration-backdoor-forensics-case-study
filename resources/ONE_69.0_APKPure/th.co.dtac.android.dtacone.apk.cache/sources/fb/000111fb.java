package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.apache.http.protocol.HTTP;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberWatcher;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.widget.EmojiExcludeFilter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fR\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010#¨\u0006+"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneCustomNumberEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomInteractiveEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "init", "()V", "onRightTouchUpAction", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChangeAction", "(ZILandroid/graphics/Rect;)V", "", TextBundle.TEXT_ENTRY, "start", "lengthBefore", "lengthAfter", "onTextChangeAction", "(Ljava/lang/CharSequence;III)V", "onCut", "onCopy", "onPaste", OperatorName.LINE_TO, "Z", "isShowClearButton", OperatorName.MOVE_TO, "isAutoFormat", OperatorName.ENDPATH, "isCapitalLetter", "o", "isEmojiExclude", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneCustomNumberEditText */
/* loaded from: classes7.dex */
public final class OneCustomNumberEditText extends OneCustomInteractiveEditText implements OneEditText.UpdateListener {
    public static final int $stable = 8;

    /* renamed from: l */
    public boolean f82871l;

    /* renamed from: m */
    public boolean f82872m;

    /* renamed from: n */
    public boolean f82873n;

    /* renamed from: o */
    public boolean f82874o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomNumberEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82871l = true;
        init();
    }

    private final void init() {
        if (this.f82872m) {
            addTextChangedListener(new PhoneNumberWatcher(this));
        }
        if (this.f82873n) {
            setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        }
        if (this.f82874o) {
            setFilters(new InputFilter[]{new EmojiExcludeFilter()});
        }
        setUpdateListener(this);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onCopy() {
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onCut() {
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText
    public void onFocusChangeAction(boolean z, int i, @Nullable Rect rect) {
        boolean z2;
        int color;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        if (isInteractiveIconColor()) {
            if (z && isEnabled()) {
                color = ContextCompat.getColor(getContext(), getFocusColor());
            } else if (!isEnabled()) {
                color = ContextCompat.getColor(getContext(), R.color.warmGreySeven);
            } else {
                color = ContextCompat.getColor(getContext(), R.color.grayishBrown);
            }
            Drawable drawable4 = null;
            setCompoundDrawables(Integer.valueOf(color), Integer.valueOf(color), (Integer) null, Integer.valueOf(color));
            Drawable[] drawables = getDrawables();
            if (drawables != null) {
                drawable = drawables[getDRAWABLE_LEFT()];
            } else {
                drawable = null;
            }
            Drawable[] drawables2 = getDrawables();
            if (drawables2 != null) {
                drawable2 = drawables2[getDRAWABLE_TOP()];
            } else {
                drawable2 = null;
            }
            Drawable[] drawables3 = getDrawables();
            if (drawables3 != null) {
                drawable3 = drawables3[getDRAWABLE_RIGHT()];
            } else {
                drawable3 = null;
            }
            Drawable[] drawables4 = getDrawables();
            if (drawables4 != null) {
                drawable4 = drawables4[getDRAWABLE_BOTTOM()];
            }
            setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
        if (this.f82871l) {
            int i2 = R.drawable.ic_clear_text;
            if (z && StringUtil.hasText(getText())) {
                z2 = true;
            } else {
                z2 = false;
            }
            setupRightDrawable(i2, z2);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onPaste() {
        ClipData.Item item;
        Object systemService = getContext().getSystemService("clipboard");
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
                    setBlockPaste(true);
                } else {
                    setBlockPaste(false);
                }
            }
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText
    public void onRightTouchUpAction() {
        setText("");
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText
    public void onTextChangeAction(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (getDrawables() != null && this.f82871l) {
            int i4 = R.drawable.ic_clear_text;
            if (isFocused() && StringUtil.hasText(getText())) {
                z = true;
            } else {
                z = false;
            }
            setupRightDrawable(i4, z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomNumberEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82871l = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.DtacClearableEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…cClearableEditText, 0, 0)");
        try {
            this.f82873n = obtainStyledAttributes.getBoolean(R.styleable.DtacClearableEditText_capital, false);
            this.f82871l = obtainStyledAttributes.getBoolean(R.styleable.DtacClearableEditText_showClearButton, true);
            this.f82872m = obtainStyledAttributes.getBoolean(R.styleable.DtacClearableEditText_autoFormat, false);
            this.f82874o = obtainStyledAttributes.getBoolean(R.styleable.DtacClearableEditText_emojiExclude, false);
            obtainStyledAttributes.recycle();
            init();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomNumberEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82871l = true;
        init();
    }
}