package p000;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* renamed from: Eu */
/* loaded from: classes5.dex */
public final class CallableC0351Eu implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Function0 f1448a;

    public CallableC0351Eu(Function0 function0) {
        this.f1448a = function0;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f1448a.invoke();
    }
}
