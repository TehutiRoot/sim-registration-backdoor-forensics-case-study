package p000;

import java.io.InputStream;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOTriFunction;

/* renamed from: Tb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C18480Tb0 implements IOTriFunction {

    /* renamed from: a */
    public final /* synthetic */ InputStream f6040a;

    public /* synthetic */ C18480Tb0(InputStream inputStream) {
        this.f6040a = inputStream;
    }

    @Override // org.apache.commons.p028io.function.IOTriFunction
    public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
        return AbstractC17968Lb0.m67508a(this, iOFunction);
    }

    @Override // org.apache.commons.p028io.function.IOTriFunction
    public final Object apply(Object obj, Object obj2, Object obj3) {
        return Integer.valueOf(this.f6040a.read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
    }
}
