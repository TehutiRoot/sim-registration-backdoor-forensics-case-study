package org.apache.http.pool;

import java.io.IOException;

/* loaded from: classes6.dex */
public interface ConnFactory<T, C> {
    C create(T t) throws IOException;
}
