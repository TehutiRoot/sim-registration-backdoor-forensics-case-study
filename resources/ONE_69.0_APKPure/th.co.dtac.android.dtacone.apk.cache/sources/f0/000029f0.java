package androidx.compose.foundation.text.selection;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "", "<init>", "()V", "", "resetCachedX", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Float;", "getCachedX", "()Ljava/lang/Float;", "setCachedX", "(Ljava/lang/Float;)V", "cachedX", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextPreparedSelectionState {

    /* renamed from: a */
    public Float f14397a;

    @Nullable
    public final Float getCachedX() {
        return this.f14397a;
    }

    public final void resetCachedX() {
        this.f14397a = null;
    }

    public final void setCachedX(@Nullable Float f) {
        this.f14397a = f;
    }
}