package p000;

import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: u50  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22452u50 {
    /* renamed from: a */
    public static ListenableFuture m1260a(Throwable th2) {
        ResolvableFuture create = ResolvableFuture.create();
        create.setException(th2);
        return create;
    }
}