package com.mixpanel.android.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* loaded from: classes5.dex */
public class SocketChannelIOHelper {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean batch(com.mixpanel.android.java_websocket.WebSocketImpl r4, java.nio.channels.ByteChannel r5) throws java.io.IOException {
        /*
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.outQueue
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1 = 0
            if (r0 != 0) goto L1c
            boolean r0 = r5 instanceof com.mixpanel.android.java_websocket.WrappedByteChannel
            if (r0 == 0) goto L35
            r0 = r5
            com.mixpanel.android.java_websocket.WrappedByteChannel r0 = (com.mixpanel.android.java_websocket.WrappedByteChannel) r0
            boolean r2 = r0.isNeedWrite()
            if (r2 == 0) goto L36
            r0.writeMore()
            goto L36
        L1c:
            r5.write(r0)
            int r0 = r0.remaining()
            if (r0 <= 0) goto L26
            return r1
        L26:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.outQueue
            r0.poll()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r4.outQueue
            java.lang.Object r0 = r0.peek()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            if (r0 != 0) goto L1c
        L35:
            r0 = 0
        L36:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r4.outQueue
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            boolean r2 = r4.isFlushAndClose()
            if (r2 == 0) goto L59
            com.mixpanel.android.java_websocket.drafts.Draft r2 = r4.getDraft()
            com.mixpanel.android.java_websocket.WebSocket$Role r2 = r2.getRole()
            com.mixpanel.android.java_websocket.WebSocket$Role r3 = com.mixpanel.android.java_websocket.WebSocket.Role.SERVER
            if (r2 != r3) goto L59
            monitor-enter(r4)
            r4.closeConnection()     // Catch: java.lang.Throwable -> L56
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r5
        L59:
            r4 = 1
            if (r0 == 0) goto L64
            com.mixpanel.android.java_websocket.WrappedByteChannel r5 = (com.mixpanel.android.java_websocket.WrappedByteChannel) r5
            boolean r5 = r5.isNeedWrite()
            if (r5 != 0) goto L65
        L64:
            r1 = 1
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.java_websocket.SocketChannelIOHelper.batch(com.mixpanel.android.java_websocket.WebSocketImpl, java.nio.channels.ByteChannel):boolean");
    }

    public static boolean read(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int read = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (read == -1) {
            webSocketImpl.eot();
            return false;
        } else if (read == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean readMore(ByteBuffer byteBuffer, WebSocketImpl webSocketImpl, WrappedByteChannel wrappedByteChannel) throws IOException {
        byteBuffer.clear();
        int readMore = wrappedByteChannel.readMore(byteBuffer);
        byteBuffer.flip();
        if (readMore == -1) {
            webSocketImpl.eot();
            return false;
        }
        return wrappedByteChannel.isNeedRead();
    }
}