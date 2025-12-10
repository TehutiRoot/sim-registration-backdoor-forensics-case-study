package androidx.compose.foundation.lazy.layout;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/lang/Void;", "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocalKt {
    /* renamed from: a */
    public static final Void m61162a() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}