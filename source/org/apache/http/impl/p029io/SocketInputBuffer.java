package org.apache.http.impl.p029io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.p030io.EofSensor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* renamed from: org.apache.http.impl.io.SocketInputBuffer */
/* loaded from: classes6.dex */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {

    /* renamed from: o */
    public final Socket f74521o;

    /* renamed from: p */
    public boolean f74522p;

    public SocketInputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        this.f74521o = socket;
        this.f74522p = false;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        init(socket.getInputStream(), i < 1024 ? 1024 : i, httpParams);
    }

    @Override // org.apache.http.impl.p029io.AbstractSessionInputBuffer
    public int fillBuffer() throws IOException {
        boolean z;
        int fillBuffer = super.fillBuffer();
        if (fillBuffer == -1) {
            z = true;
        } else {
            z = false;
        }
        this.f74522p = z;
        return fillBuffer;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws IOException {
        boolean hasBufferedData = hasBufferedData();
        if (!hasBufferedData) {
            int soTimeout = this.f74521o.getSoTimeout();
            try {
                this.f74521o.setSoTimeout(i);
                fillBuffer();
                return hasBufferedData();
            } finally {
                this.f74521o.setSoTimeout(soTimeout);
            }
        }
        return hasBufferedData;
    }

    @Override // org.apache.http.p030io.EofSensor
    public boolean isEof() {
        return this.f74522p;
    }
}
