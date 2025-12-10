package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.Okio;

/* renamed from: bL1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19214bL1 extends AsyncTimeout {

    /* renamed from: a */
    public final Socket f39070a;

    public C19214bL1(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f39070a = socket;
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
            this.f39070a.close();
        } catch (AssertionError e) {
            if (Okio.isAndroidGetsocknameError(e)) {
                logger2 = AbstractC21805qK0.f77166a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f39070a, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = AbstractC21805qK0.f77166a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f39070a, (Throwable) e2);
        }
    }
}