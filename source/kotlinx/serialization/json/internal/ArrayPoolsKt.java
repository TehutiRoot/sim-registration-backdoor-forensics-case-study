package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m28850d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, m28849k = 2, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class ArrayPoolsKt {

    /* renamed from: a */
    public static final int f71364a;

    static {
        Object m74087constructorimpl;
        int i;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            m74087constructorimpl = Result.m74087constructorimpl(AbstractC20032gN1.toIntOrNull(property));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m74093isFailureimpl(m74087constructorimpl)) {
            m74087constructorimpl = null;
        }
        Integer num = (Integer) m74087constructorimpl;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        f71364a = i;
    }
}
