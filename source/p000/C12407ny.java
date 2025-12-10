package p000;

import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* renamed from: ny */
/* loaded from: classes6.dex */
public final class C12407ny implements BiFunction {
    @JvmField
    @Nullable
    public volatile Continuation<Object> cont;

    public C12407ny(Continuation continuation) {
        this.cont = continuation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r2 = r2.getCause();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25981a(java.lang.Object r2, java.lang.Throwable r3) {
        /*
            r1 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r1.cont
            if (r0 != 0) goto L5
            return
        L5:
            if (r3 != 0) goto Lf
            java.lang.Object r2 = kotlin.Result.m74087constructorimpl(r2)
            r0.resumeWith(r2)
            goto L32
        Lf:
            boolean r2 = p000.AbstractC12185ky.m26580a(r3)
            if (r2 == 0) goto L1a
            java.util.concurrent.CompletionException r2 = p000.AbstractC12254ly.m26393a(r3)
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L25
            java.lang.Throwable r2 = p000.AbstractC12326my.m26173a(r2)
            if (r2 != 0) goto L24
            goto L25
        L24:
            r3 = r2
        L25:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r2 = kotlin.Result.m74087constructorimpl(r2)
            r0.resumeWith(r2)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C12407ny.m25981a(java.lang.Object, java.lang.Throwable):void");
    }

    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        m25981a(obj, (Throwable) obj2);
        return Unit.INSTANCE;
    }
}
