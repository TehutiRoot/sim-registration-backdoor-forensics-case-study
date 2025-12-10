package p000;

import java.io.IOException;
import java.util.function.BiFunction;
import org.apache.commons.p028io.IOIndexedException;

/* renamed from: N90 */
/* loaded from: classes6.dex */
public final /* synthetic */ class N90 implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return new IOIndexedException(((Integer) obj).intValue(), (IOException) obj2);
    }
}
