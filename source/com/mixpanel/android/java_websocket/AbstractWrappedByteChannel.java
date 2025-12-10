package com.mixpanel.android.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLException;

/* loaded from: classes5.dex */
public class AbstractWrappedByteChannel implements WrappedByteChannel {

    /* renamed from: a */
    public final ByteChannel f58414a;

    public AbstractWrappedByteChannel(ByteChannel byteChannel) {
        this.f58414a = byteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f58414a.close();
    }

    @Override // com.mixpanel.android.java_websocket.WrappedByteChannel
    public boolean isBlocking() {
        ByteChannel byteChannel = this.f58414a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isBlocking();
        }
        return false;
    }

    @Override // com.mixpanel.android.java_websocket.WrappedByteChannel
    public boolean isNeedRead() {
        ByteChannel byteChannel = this.f58414a;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isNeedRead();
        }
        return false;
    }

    @Override // com.mixpanel.android.java_websocket.WrappedByteChannel
    public boolean isNeedWrite() {
        ByteChannel byteChannel = this.f58414a;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).isNeedWrite();
        }
        return false;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f58414a.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f58414a.read(byteBuffer);
    }

    @Override // com.mixpanel.android.java_websocket.WrappedByteChannel
    public int readMore(ByteBuffer byteBuffer) throws SSLException {
        ByteChannel byteChannel = this.f58414a;
        if (byteChannel instanceof WrappedByteChannel) {
            return ((WrappedByteChannel) byteChannel).readMore(byteBuffer);
        }
        return 0;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f58414a.write(byteBuffer);
    }

    @Override // com.mixpanel.android.java_websocket.WrappedByteChannel
    public void writeMore() throws IOException {
        ByteChannel byteChannel = this.f58414a;
        if (byteChannel instanceof WrappedByteChannel) {
            ((WrappedByteChannel) byteChannel).writeMore();
        }
    }

    public AbstractWrappedByteChannel(WrappedByteChannel wrappedByteChannel) {
        this.f58414a = wrappedByteChannel;
    }
}
