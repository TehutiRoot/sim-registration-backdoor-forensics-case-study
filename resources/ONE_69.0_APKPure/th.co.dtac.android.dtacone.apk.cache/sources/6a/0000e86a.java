package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m29142d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, m29141k = 2, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class ArrayPoolsKt {

    /* renamed from: a */
    public static final int f71398a;

    static {
        Object m74271constructorimpl;
        int i;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            m74271constructorimpl = Result.m74271constructorimpl(AbstractC19568dO1.toIntOrNull(property));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m74271constructorimpl = Result.m74271constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m74277isFailureimpl(m74271constructorimpl)) {
            m74271constructorimpl = null;
        }
        Integer num = (Integer) m74271constructorimpl;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        f71398a = i;
    }
}