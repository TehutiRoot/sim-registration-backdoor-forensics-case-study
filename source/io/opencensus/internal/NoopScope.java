package io.opencensus.internal;

import io.opencensus.common.Scope;

/* loaded from: classes5.dex */
public final class NoopScope implements Scope {

    /* renamed from: a */
    public static final Scope f63517a = new NoopScope();

    public static Scope getInstance() {
        return f63517a;
    }

    @Override // io.opencensus.common.Scope, io.opencensus.common.NonThrowingCloseable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
