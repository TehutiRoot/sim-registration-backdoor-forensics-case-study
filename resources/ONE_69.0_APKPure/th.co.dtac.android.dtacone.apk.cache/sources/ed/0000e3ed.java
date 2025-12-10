package kotlin.time;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\t\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\" \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m29142d2 = {"", "decimals", "Ljava/text/DecimalFormat;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Ljava/text/DecimalFormat;", "", "value", "", "formatToExactDecimals", "(DI)Ljava/lang/String;", "formatUpToDecimals", "", "Z", "getDurationAssertionsEnabled", "()Z", "durationAssertionsEnabled", "", "Ljava/lang/ThreadLocal;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[Ljava/lang/ThreadLocal;", "precisionFormats", "kotlin-stdlib"}, m29141k = 2, m29140mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes6.dex */
public final class DurationJvmKt {

    /* renamed from: a */
    public static final boolean f70598a = false;

    /* renamed from: b */
    public static final ThreadLocal[] f70599b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
        f70599b = threadLocalArr;
    }

    /* renamed from: a */
    public static final DecimalFormat m27715a(int i) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @NotNull
    public static final String formatToExactDecimals(double d, int i) {
        DecimalFormat m27715a;
        ThreadLocal[] threadLocalArr = f70599b;
        if (i < threadLocalArr.length) {
            ThreadLocal threadLocal = threadLocalArr[i];
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = m27715a(i);
                threadLocal.set(obj);
            } else {
                Intrinsics.checkNotNull(obj);
            }
            m27715a = (DecimalFormat) obj;
        } else {
            m27715a = m27715a(i);
        }
        String format = m27715a.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @NotNull
    public static final String formatUpToDecimals(double d, int i) {
        DecimalFormat m27715a = m27715a(0);
        m27715a.setMaximumFractionDigits(i);
        String format = m27715a.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final boolean getDurationAssertionsEnabled() {
        return f70598a;
    }
}