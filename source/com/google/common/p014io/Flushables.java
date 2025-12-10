package com.google.common.p014io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.Flushables */
/* loaded from: classes4.dex */
public final class Flushables {

    /* renamed from: a */
    public static final Logger f53972a = Logger.getLogger(Flushables.class.getName());

    public static void flush(Flushable flushable, boolean z) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e) {
            if (z) {
                f53972a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e);
                return;
            }
            throw e;
        }
    }

    @Beta
    public static void flushQuietly(Flushable flushable) {
        try {
            flush(flushable, true);
        } catch (IOException e) {
            f53972a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e);
        }
    }
}
