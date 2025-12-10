package p000;

import java.io.Closeable;
import java.util.function.Consumer;
import org.apache.commons.p028io.IOUtils;

/* renamed from: Yb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C18847Yb0 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        IOUtils.closeQuietly((Closeable) obj);
    }
}