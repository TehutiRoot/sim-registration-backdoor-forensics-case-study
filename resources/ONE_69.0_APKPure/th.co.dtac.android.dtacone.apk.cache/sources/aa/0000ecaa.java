package p000;

import java.util.function.IntSupplier;
import org.apache.commons.p028io.function.IOIntSupplier;
import org.apache.commons.p028io.function.Uncheck;

/* renamed from: oa0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC21494oa0 {
    /* renamed from: a */
    public static IntSupplier m26108a(final IOIntSupplier iOIntSupplier) {
        return new IntSupplier() { // from class: na0
            @Override // java.util.function.IntSupplier
            public final int getAsInt() {
                return AbstractC21494oa0.m26107b(IOIntSupplier.this);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ int m26107b(IOIntSupplier iOIntSupplier) {
        return Uncheck.getAsInt(iOIntSupplier);
    }
}