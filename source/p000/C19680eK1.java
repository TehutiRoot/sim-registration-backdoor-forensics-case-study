package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.Okio;

/* renamed from: eK1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19680eK1 extends AsyncTimeout {

    /* renamed from: a */
    public final Socket f61473a;

    public C19680eK1(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f61473a = socket;
    }

    @Override // okio.AsyncTimeout
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f61473a.close();
        } catch (AssertionError e) {
            if (Okio.isAndroidGetsocknameError(e)) {
                logger2 = AbstractC20711kK0.f67890a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f61473a, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = AbstractC20711kK0.f67890a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f61473a, (Throwable) e2);
        }
    }
}
