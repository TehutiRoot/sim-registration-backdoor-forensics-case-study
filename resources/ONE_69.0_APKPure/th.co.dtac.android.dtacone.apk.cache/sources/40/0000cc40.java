package io.grpc;

import io.grpc.Context;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.d */
/* loaded from: classes5.dex */
public final class C10561d extends Context.Storage {

    /* renamed from: a */
    public static final Logger f63528a = Logger.getLogger(C10561d.class.getName());

    /* renamed from: b */
    public static final ThreadLocal f63529b = new ThreadLocal();

    @Override // io.grpc.Context.Storage
    public Context current() {
        Context context = (Context) f63529b.get();
        if (context == null) {
            return Context.ROOT;
        }
        return context;
    }

    @Override // io.grpc.Context.Storage
    public void detach(Context context, Context context2) {
        if (current() != context) {
            f63528a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (context2 != Context.ROOT) {
            f63529b.set(context2);
        } else {
            f63529b.set(null);
        }
    }

    @Override // io.grpc.Context.Storage
    public Context doAttach(Context context) {
        Context current = current();
        f63529b.set(context);
        return current;
    }
}