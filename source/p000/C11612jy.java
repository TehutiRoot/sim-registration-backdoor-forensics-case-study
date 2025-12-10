package p000;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: jy */
/* loaded from: classes3.dex */
public final class C11612jy implements Callback, Function1 {

    /* renamed from: a */
    public final Call f67766a;

    /* renamed from: b */
    public final CancellableContinuation f67767b;

    public C11612jy(Call call, CancellableContinuation cancellableContinuation) {
        this.f67766a = call;
        this.f67767b = cancellableContinuation;
    }

    /* renamed from: a */
    public void m29001a(Throwable th2) {
        try {
            this.f67766a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m29001a((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (!call.isCanceled()) {
            CancellableContinuation cancellableContinuation = this.f67767b;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(iOException)));
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f67767b.resumeWith(Result.m74087constructorimpl(response));
    }
}
