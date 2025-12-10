package p000;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ws1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18764Ws1 extends OM1 {

    /* renamed from: a */
    public final Throwable f7407a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18764Ws1(Throwable readException) {
        super(null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f7407a = readException;
    }

    /* renamed from: a */
    public final Throwable m65653a() {
        return this.f7407a;
    }
}