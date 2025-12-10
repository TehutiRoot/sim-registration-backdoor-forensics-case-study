package kotlinx.coroutines;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"$\u0010\u0007\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Lkotlinx/coroutines/AbstractTimeSource;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/AbstractTimeSource;", "getTimeSource", "()Lkotlinx/coroutines/AbstractTimeSource;", "setTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "timeSource", "kotlinx-coroutines-core"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class AbstractTimeSourceKt {

    /* renamed from: a */
    public static AbstractTimeSource f70609a;

    @Nullable
    public static final AbstractTimeSource getTimeSource() {
        return f70609a;
    }

    public static final void setTimeSource(@Nullable AbstractTimeSource abstractTimeSource) {
        f70609a = abstractTimeSource;
    }
}