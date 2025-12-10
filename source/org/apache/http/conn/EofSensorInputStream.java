package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {

    /* renamed from: a */
    public boolean f73799a;

    /* renamed from: b */
    public final EofSensorWatcher f73800b;
    protected InputStream wrappedStream;

    public EofSensorInputStream(InputStream inputStream, EofSensorWatcher eofSensorWatcher) {
        Args.notNull(inputStream, "Wrapped stream");
        this.wrappedStream = inputStream;
        this.f73799a = false;
        this.f73800b = eofSensorWatcher;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() throws IOException {
        this.f73799a = true;
        checkAbort();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (isReadAllowed()) {
            try {
                return this.wrappedStream.available();
            } catch (IOException e) {
                checkAbort();
                throw e;
            }
        }
        return 0;
    }

    public void checkAbort() throws IOException {
        boolean z;
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.f73800b;
                if (eofSensorWatcher != null) {
                    z = eofSensorWatcher.streamAbort(inputStream);
                } else {
                    z = true;
                }
                if (z) {
                    inputStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th2) {
                this.wrappedStream = null;
                throw th2;
            }
        }
    }

    public void checkClose() throws IOException {
        boolean z;
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null) {
            try {
                EofSensorWatcher eofSensorWatcher = this.f73800b;
                if (eofSensorWatcher != null) {
                    z = eofSensorWatcher.streamClosed(inputStream);
                } else {
                    z = true;
                }
                if (z) {
                    inputStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th2) {
                this.wrappedStream = null;
                throw th2;
            }
        }
    }

    public void checkEOF(int i) throws IOException {
        boolean z;
        InputStream inputStream = this.wrappedStream;
        if (inputStream != null && i < 0) {
            try {
                EofSensorWatcher eofSensorWatcher = this.f73800b;
                if (eofSensorWatcher != null) {
                    z = eofSensorWatcher.eofDetected(inputStream);
                } else {
                    z = true;
                }
                if (z) {
                    inputStream.close();
                }
                this.wrappedStream = null;
            } catch (Throwable th2) {
                this.wrappedStream = null;
                throw th2;
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73799a = true;
        checkClose();
    }

    public boolean isReadAllowed() throws IOException {
        if (!this.f73799a) {
            if (this.wrappedStream != null) {
                return true;
            }
            return false;
        }
        throw new IOException("Attempted read on closed stream.");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (isReadAllowed()) {
            try {
                int read = this.wrappedStream.read();
                checkEOF(read);
                return read;
            } catch (IOException e) {
                checkAbort();
                throw e;
            }
        }
        return -1;
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() throws IOException {
        close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (isReadAllowed()) {
            try {
                int read = this.wrappedStream.read(bArr, i, i2);
                checkEOF(read);
                return read;
            } catch (IOException e) {
                checkAbort();
                throw e;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
