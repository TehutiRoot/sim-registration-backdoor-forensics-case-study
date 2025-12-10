package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0014\u001a\u00020\fH\u0016J*\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/OneCreditCardEditText;", "Lth/co/dtac/android/dtacone/app_one/widget/OneCustomInteractiveEditText;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "onFocusChangeAction", "focused", "", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onFocusChanged", "onRightTouchUpAction", "onTextChangeAction", TextBundle.TEXT_ENTRY, "", "start", "lengthBefore", "lengthAfter", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneCreditCardEditText */
/* loaded from: classes7.dex */
public class OneCreditCardEditText extends OneCustomInteractiveEditText {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCreditCardEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }

    public final void init() {
        addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.app_one.widget.OneCreditCardEditText$init$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                if (e.length() == 0 || e.length() % 5 != 0) {
                    return;
                }
                char charAt = e.charAt(e.length() - 1);
                if (Character.isDigit(charAt)) {
                    e.insert(e.length() - 1, HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                } else if (charAt == ' ') {
                    e.delete(e.length() - 1, e.length());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            }
        });
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText
    public void onFocusChangeAction(boolean z, int i, @Nullable Rect rect) {
        int color;
        if (isInteractiveIconColor()) {
            if (z && isEnabled()) {
                color = ContextCompat.getColor(getContext(), getFocusColor());
            } else if (!isEnabled()) {
                color = ContextCompat.getColor(getContext(), R.color.warmGreySeven);
            } else {
                color = ContextCompat.getColor(getContext(), R.color.grayishBrown);
            }
            setTextColor(color);
        }
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText
    public void onRightTouchUpAction() {
        setText("");
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.OneCustomInteractiveEditText
    public void onTextChangeAction(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCreditCardEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCreditCardEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        init();
    }
}
