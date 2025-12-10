package p000;

import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

/* renamed from: Eu */
/* loaded from: classes5.dex */
public final class CallableC0344Eu implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Function0 f1511a;

    public CallableC0344Eu(Function0 function0) {
        this.f1511a = function0;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f1511a.invoke();
    }
}