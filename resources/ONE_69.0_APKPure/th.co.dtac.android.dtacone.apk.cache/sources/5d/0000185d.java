package p000;

import java.io.InputStream;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOTriFunction;

/* renamed from: Zb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C18911Zb0 implements IOTriFunction {

    /* renamed from: a */
    public final /* synthetic */ InputStream f8207a;

    public /* synthetic */ C18911Zb0(InputStream inputStream) {
        this.f8207a = inputStream;
    }

    @Override // org.apache.commons.p028io.function.IOTriFunction
    public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
        return AbstractC18392Rb0.m66627a(this, iOFunction);
    }

    @Override // org.apache.commons.p028io.function.IOTriFunction
    public final Object apply(Object obj, Object obj2, Object obj3) {
        return Integer.valueOf(this.f8207a.read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
    }
}