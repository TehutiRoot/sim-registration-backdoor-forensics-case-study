package p000;

import java.util.function.LongSupplier;
import org.apache.commons.p028io.function.IOLongSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ma0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC21089ma0 {
    /* renamed from: a */
    public static LongSupplier m26249a(final IOLongSupplier iOLongSupplier) {
        return new LongSupplier() { // from class: la0
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return AbstractC21089ma0.m26248b(iOLongSupplier);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ long m26248b(IOLongSupplier iOLongSupplier) {
        return Uncheck.getAsLong(iOLongSupplier);
    }
}
