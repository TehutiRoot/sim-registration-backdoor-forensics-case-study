package p000;

import androidx.compose.p003ui.platform.OpenEndRange;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yf1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC18813Yf1 {
    /* renamed from: a */
    public static boolean m65326a(OpenEndRange openEndRange, Comparable value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.compareTo(openEndRange.getStart()) >= 0 && value.compareTo(openEndRange.getEndExclusive()) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m65325b(OpenEndRange openEndRange) {
        if (openEndRange.getStart().compareTo(openEndRange.getEndExclusive()) >= 0) {
            return true;
        }
        return false;
    }
}
