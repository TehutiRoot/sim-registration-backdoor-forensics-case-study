package p000;

import java.util.Comparator;
import org.apache.commons.p028io.function.IOComparator;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: L90 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class L90 {
    /* renamed from: a */
    public static Comparator m67542a(final IOComparator iOComparator) {
        return new Comparator() { // from class: K90
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return L90.m67541b(iOComparator, obj, obj2);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ int m67541b(IOComparator iOComparator, Object obj, Object obj2) {
        return Uncheck.compare(iOComparator, obj, obj2);
    }
}
