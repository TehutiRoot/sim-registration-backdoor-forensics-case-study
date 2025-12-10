package p000;

import java.util.function.IntSupplier;
import org.apache.commons.p028io.function.IOIntSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: ia0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC20401ia0 {
    /* renamed from: a */
    public static IntSupplier m30625a(final IOIntSupplier iOIntSupplier) {
        return new IntSupplier() { // from class: ha0
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                return AbstractC20401ia0.m30624b(iOIntSupplier);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ int m30624b(IOIntSupplier iOIntSupplier) {
        return Uncheck.getAsInt(iOIntSupplier);
    }
}
