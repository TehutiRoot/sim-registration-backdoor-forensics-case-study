package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
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
import th.p047co.dtac.android.dtacone.app_one.util.format.OnePhoneNumberWatcher;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.widget.view.listener.DrawableClickListener;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b!\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003DEFB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0017J)\u0010$\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J1\u0010+\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0014¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\r¢\u0006\u0004\b.\u0010\u0011J\u000f\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u0010\u0017J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010\u0017J\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u0010\u0017R\u0016\u00104\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u00109\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103R\u0018\u0010>\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0011\u0010B\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006G"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneInteractiveEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneEditText$UpdateListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "check", "", "setIsHandleClearButton", "(Z)V", "Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$TouchDownListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTouchDownListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$TouchDownListener;)V", "onTouchActionDown", "()V", "onRightTouchUpAction", "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;", "registerDrawableAction", "(Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;)V", "Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$EnableClearBtnListener;", "registerEnableClearBtnListener", "(Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$EnableClearBtnListener;)V", "init", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "", TextBundle.TEXT_ENTRY, "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "isBlockPaste", "blockCopyPaste", "onCut", "onCopy", "onPaste", OperatorName.LINE_TO, "Z", "isFocusEditText", OperatorName.MOVE_TO, "isEditTextEmpty", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/widget/view/listener/DrawableClickListener;", "drawableListener", "o", "isHandleClearButton", "p", "Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$EnableClearBtnListener;", "enableClearBtnListener", OperatorName.SAVE, "Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$TouchDownListener;", "onTouchDownListener", "isPhoneBook", "()Z", "EnableClearBtnListener", PDPageLabelRange.STYLE_LETTERS_LOWER, "TouchDownListener", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText */
/* loaded from: classes7.dex */
public final class OnePhoneBookEditText extends OneInteractiveEditText implements OneEditText.UpdateListener {
    public static final int $stable = 8;

    /* renamed from: l */
    public boolean f82825l;

    /* renamed from: m */
    public boolean f82826m;

    /* renamed from: n */
    public DrawableClickListener f82827n;

    /* renamed from: o */
    public boolean f82828o;

    /* renamed from: p */
    public EnableClearBtnListener f82829p;

    /* renamed from: q */
    public TouchDownListener f82830q;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$EnableClearBtnListener;", "", "onTriggerClearButton", "", "isShow", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText$EnableClearBtnListener */
    /* loaded from: classes7.dex */
    public interface EnableClearBtnListener {
        void onTriggerClearButton(boolean z);
    }

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OnePhoneBookEditText$TouchDownListener;", "", "onTouch", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText$TouchDownListener */
    /* loaded from: classes7.dex */
    public interface TouchDownListener {
        void onTouch();
    }

    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText$a */
    /* loaded from: classes7.dex */
    public static final class C14165a extends PasswordTransformationMethod {
        @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence source, View view) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(view, "view");
            return source;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePhoneBookEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82826m = true;
        init();
    }

    public final void blockCopyPaste(boolean z) {
        setBlockPaste(z);
    }

    public final void init() {
        addTextChangedListener(new OnePhoneNumberWatcher(this));
        setUpdateListener(this);
        setTransformationMethod(new C14165a());
    }

    public final boolean isPhoneBook() {
        Drawable.ConstantState constantState;
        Drawable drawable = getCompoundDrawables()[2];
        if (drawable != null) {
            Drawable.ConstantState constantState2 = drawable.getConstantState();
            Drawable drawable2 = ContextCompat.getDrawable(getContext(), R.drawable.ic_one_phone_book);
            if (drawable2 != null) {
                constantState = drawable2.getConstantState();
            } else {
                constantState = null;
            }
            if (Intrinsics.areEqual(constantState2, constantState)) {
                return true;
            }
        }
        return false;
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onCopy() {
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onCut() {
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        int i2;
        super.onFocusChanged(z, i, rect);
        this.f82825l = z;
        if (isFocused() && isEnabled()) {
            i2 = getFocusColor();
        } else if (!isEnabled()) {
            i2 = R.color.warmGreySeven;
        } else {
            i2 = R.color.grayishBrown;
        }
        if (!z) {
            setupRightDrawable(R.drawable.ic_one_phone_book, true, Integer.valueOf(i2));
            EnableClearBtnListener enableClearBtnListener = this.f82829p;
            if (enableClearBtnListener != null) {
                enableClearBtnListener.onTriggerClearButton(false);
            }
        } else if (this.f82826m) {
            setupRightDrawable(R.drawable.ic_one_phone_book, true, Integer.valueOf(i2));
            EnableClearBtnListener enableClearBtnListener2 = this.f82829p;
            if (enableClearBtnListener2 != null) {
                enableClearBtnListener2.onTriggerClearButton(false);
            }
        } else {
            setupRightDrawable(R.drawable.ic_clear_text, true, Integer.valueOf(R.color.color_transparent));
            EnableClearBtnListener enableClearBtnListener3 = this.f82829p;
            if (enableClearBtnListener3 != null) {
                enableClearBtnListener3.onTriggerClearButton(true);
            }
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneEditText.UpdateListener
    public void onPaste() {
        ClipData.Item item;
        CharSequence charSequence;
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

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText
    public void onRightTouchUpAction() {
        DrawableClickListener drawableClickListener = this.f82827n;
        if (drawableClickListener != null) {
            drawableClickListener.onClickDrawable(DrawableClickListener.DrawablePosition.RIGHT);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f82828o && isInteractiveIconColor() && this.f82825l) {
            if (isFocused() && isEnabled()) {
                i4 = getFocusColor();
            } else if (!isEnabled()) {
                i4 = R.color.warmGreySeven;
            } else {
                i4 = R.color.grayishBrown;
            }
            setCompoundDrawables(ContextCompat.getColor(getContext(), i4));
            if (String.valueOf(charSequence).length() == 0) {
                this.f82826m = true;
                setupRightDrawable(R.drawable.ic_one_phone_book, true, Integer.valueOf(i4));
                EnableClearBtnListener enableClearBtnListener = this.f82829p;
                if (enableClearBtnListener != null) {
                    enableClearBtnListener.onTriggerClearButton(false);
                    return;
                }
                return;
            }
            this.f82826m = false;
            setupRightDrawable(R.drawable.ic_clear_text, true, Integer.valueOf(R.color.color_transparent));
            EnableClearBtnListener enableClearBtnListener2 = this.f82829p;
            if (enableClearBtnListener2 != null) {
                enableClearBtnListener2.onTriggerClearButton(true);
            }
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneInteractiveEditText
    public void onTouchActionDown() {
        TouchDownListener touchDownListener = this.f82830q;
        if (touchDownListener != null) {
            touchDownListener.onTouch();
        }
    }

    public final void registerDrawableAction(@NotNull DrawableClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82827n = listener;
    }

    public final void registerEnableClearBtnListener(@NotNull EnableClearBtnListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82829p = listener;
    }

    public final void setIsHandleClearButton(boolean z) {
        this.f82828o = z;
    }

    public final void setTouchDownListener(@NotNull TouchDownListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f82830q = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePhoneBookEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82826m = true;
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePhoneBookEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f82826m = true;
        init();
    }
}
