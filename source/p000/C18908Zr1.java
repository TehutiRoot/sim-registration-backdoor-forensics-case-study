package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Zr1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18908Zr1 extends RL1 {

    /* renamed from: a */
    public final Throwable f8159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18908Zr1(Throwable readException) {
        super(null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f8159a = readException;
    }

    /* renamed from: a */
    public final Throwable m65142a() {
        return this.f8159a;
    }
}
