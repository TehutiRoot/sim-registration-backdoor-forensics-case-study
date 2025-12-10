package p000;

import java.io.IOException;
import java.util.function.BiFunction;
import org.apache.commons.p028io.IOIndexedException;

/* renamed from: T90 */
/* loaded from: classes6.dex */
public final /* synthetic */ class T90 implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return new IOIndexedException(((Integer) obj).intValue(), (IOException) obj2);
    }
}