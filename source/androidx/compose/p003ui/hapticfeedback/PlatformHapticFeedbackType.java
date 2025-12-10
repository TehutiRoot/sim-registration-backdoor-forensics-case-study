package androidx.compose.p003ui.hapticfeedback;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m28850d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;", "", "<init>", "()V", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLongPress-5zf0vsI", "()I", "LongPress", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTextHandleMove-5zf0vsI", "TextHandleMove", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType */
/* loaded from: classes2.dex */
public final class PlatformHapticFeedbackType {
    @NotNull
    public static final PlatformHapticFeedbackType INSTANCE = new PlatformHapticFeedbackType();

    /* renamed from: a */
    public static final int f29580a = HapticFeedbackType.m72271constructorimpl(0);

    /* renamed from: b */
    public static final int f29581b = HapticFeedbackType.m72271constructorimpl(9);

    /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
    public final int m72279getLongPress5zf0vsI() {
        return f29580a;
    }

    /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
    public final int m72280getTextHandleMove5zf0vsI() {
        return f29581b;
    }
}
