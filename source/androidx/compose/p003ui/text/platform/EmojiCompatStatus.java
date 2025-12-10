package androidx.compose.p003ui.text.platform;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "<init>", "()V", "newDelegate", "", "setDelegateForTesting$ui_text_release", "(Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;)V", "setDelegateForTesting", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "delegate", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "fontLoaded", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.platform.EmojiCompatStatus */
/* loaded from: classes2.dex */
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {
    @NotNull
    public static final EmojiCompatStatus INSTANCE = new EmojiCompatStatus();

    /* renamed from: a */
    public static EmojiCompatStatusDelegate f31505a = new DefaultImpl();

    @Override // androidx.compose.p003ui.text.platform.EmojiCompatStatusDelegate
    @NotNull
    public State<Boolean> getFontLoaded() {
        return f31505a.getFontLoaded();
    }

    @VisibleForTesting
    public final void setDelegateForTesting$ui_text_release(@Nullable EmojiCompatStatusDelegate emojiCompatStatusDelegate) {
        if (emojiCompatStatusDelegate == null) {
            emojiCompatStatusDelegate = new DefaultImpl();
        }
        f31505a = emojiCompatStatusDelegate;
    }
}
