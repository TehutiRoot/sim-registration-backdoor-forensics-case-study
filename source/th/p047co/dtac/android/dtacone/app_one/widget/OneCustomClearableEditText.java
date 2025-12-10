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
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
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
import th.p047co.dtac.android.dtacone.app_one.util.format.OnePhoneNumberWatcher;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.FilterEditText;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.widget.EmojiExcludeFilter;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0015\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010!\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u000fR\u0016\u0010(\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00100\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u00102\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u00104\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010'R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneCustomClearableEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomInteractiveEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "init", "()V", "onRightTouchUpAction", "", TextBundle.TEXT_ENTRY, "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChangeAction", "(ZILandroid/graphics/Rect;)V", "start", "lengthBefore", "lengthAfter", "onTextChangeAction", "(Ljava/lang/CharSequence;III)V", "onCut", "onCopy", "onPaste", OperatorName.LINE_TO, "Z", "isShowClearButton", OperatorName.MOVE_TO, "isAutoFormat", OperatorName.ENDPATH, "isCapitalLetter", "o", "isEmojiExclude", "p", "isBlockPaste", OperatorName.SAVE, "isPhoneNumber", PDPageLabelRange.STYLE_ROMAN_LOWER, "isPhoneNumberAutoFormat", OperatorName.CLOSE_AND_STROKE, "I", "disableColor", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText */
/* loaded from: classes7.dex */
public class OneCustomClearableEditText extends OneCustomInteractiveEditText implements OneEditText.UpdateListener {
    public static final int $stable = 8;

    /* renamed from: l */
    public boolean f82763l;

    /* renamed from: m */
    public boolean f82764m;

    /* renamed from: n */
    public boolean f82765n;

    /* renamed from: o */
    public boolean f82766o;

    /* renamed from: p */
    public boolean f82767p;

    /* renamed from: q */
    public boolean f82768q;

    /* renamed from: r */
    public boolean f82769r;

    /* renamed from: s */
    public int f82770s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomClearableEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82763l = true;
        this.f82770s = ContextCompat.getColor(getContext(), R.color.warmGreySeven);
        init();
    }

    private final void init() {
        if (this.f82769r) {
            EditTextextKt.maskPhoneFormat(this, Constant.PHONE_FORMAT);
            setFilters(new InputFilter[]{FilterEditText.Companion.getFilterUsernamePattern()});
            EditTextextKt.toUpperCase(this, 50);
        }
        if (this.f82764m) {
            addTextChangedListener(new OnePhoneNumberWatcher(this));
        }
        if (this.f82765n) {
            setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        }
        if (this.f82766o) {
            setFilters(new InputFilter[]{new EmojiExcludeFilter()});
        }
        setBlockPaste(this.f82767p);
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
                color = this.f82770s;
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
            setTextColor(color);
        }
        if (this.f82763l) {
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
        CharSequence charSequence;
        if (this.f82768q) {
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
                        setBlockPaste(true);
                    } else if (!AbstractC20204hN1.startsWith$default(valueOf, "0", false, 2, null) && !AbstractC20204hN1.startsWith$default(valueOf, "66", false, 2, null)) {
                        setBlockPaste(true);
                    } else {
                        setBlockPaste(false);
                    }
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
        if (getDrawables() != null && this.f82763l) {
            int i4 = R.drawable.ic_clear_text;
            if (isFocused() && StringUtil.hasText(getText())) {
                z = true;
            } else {
                z = false;
            }
            setupRightDrawable(i4, z);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText, android.widget.EditText, android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @NotNull TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        super.setText(charSequence, type);
        onFocusChangeAction(isFocused(), 0, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomClearableEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82763l = true;
        this.f82770s = ContextCompat.getColor(getContext(), R.color.warmGreySeven);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OneClearableEditText, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…eClearableEditText, 0, 0)");
        try {
            this.f82765n = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_capital, false);
            this.f82763l = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_showClearButton, true);
            this.f82764m = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_autoFormat, false);
            this.f82766o = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_emojiExclude, false);
            this.f82767p = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_isBlockPaste, false);
            this.f82768q = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_isPhoneNumber, false);
            this.f82769r = obtainStyledAttributes.getBoolean(R.styleable.OneClearableEditText_isPhoneNumberAutoFormat, false);
            this.f82770s = obtainStyledAttributes.getColor(R.styleable.OneClearableEditText_disableColor, ContextCompat.getColor(context, R.color.warmGreySeven));
            obtainStyledAttributes.recycle();
            init();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomClearableEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82763l = true;
        this.f82770s = ContextCompat.getColor(getContext(), R.color.warmGreySeven);
        init();
    }
}
