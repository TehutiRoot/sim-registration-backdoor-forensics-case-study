package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* loaded from: classes.dex */
public abstract class ResilientOutputStreamBase extends OutputStream {

    /* renamed from: c */
    public Context f40020c;

    /* renamed from: d */
    public RecoveryCoordinator f40021d;

    /* renamed from: os */
    protected OutputStream f40022os;

    /* renamed from: a */
    public int f40018a = 0;

    /* renamed from: b */
    public int f40019b = 0;
    protected boolean presumedClean = true;

    public void addStatus(Status status) {
        Context context = this.f40020c;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i = this.f40018a;
        this.f40018a = i + 1;
        if (i == 0) {
            PrintStream printStream = System.out;
            printStream.println("LOGBACK: No context given for " + this);
        }
    }

    /* renamed from: b */
    public void m51407b(Status status) {
        int i = this.f40019b + 1;
        this.f40019b = i;
        if (i < 8) {
            addStatus(status);
        }
        if (this.f40019b == 8) {
            addStatus(status);
            addStatus(new InfoStatus("Will supress future messages regarding " + mo51403g(), this));
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f40022os;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    /* renamed from: d */
    public void m51406d() {
        try {
            close();
        } catch (IOException unused) {
        }
        m51407b(new InfoStatus("Attempting to recover from IO failure on " + mo51403g(), this));
        try {
            this.f40022os = mo51402j();
            this.presumedClean = true;
        } catch (IOException e) {
            m51407b(new ErrorStatus("Failed to open " + mo51403g(), this, e));
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.f40022os;
        if (outputStream != null) {
            try {
                outputStream.flush();
                m51404k();
            } catch (IOException e) {
                postIOFailure(e);
            }
        }
    }

    /* renamed from: g */
    public abstract String mo51403g();

    public Context getContext() {
        return this.f40020c;
    }

    /* renamed from: i */
    public final boolean m51405i() {
        return (this.f40021d == null || this.presumedClean) ? false : true;
    }

    /* renamed from: j */
    public abstract OutputStream mo51402j();

    /* renamed from: k */
    public final void m51404k() {
        if (this.f40021d != null) {
            this.f40021d = null;
            this.f40019b = 0;
            addStatus(new InfoStatus("Recovered from IO failure on " + mo51403g(), this));
        }
    }

    public void postIOFailure(IOException iOException) {
        m51407b(new ErrorStatus("IO failure while writing to " + mo51403g(), this, iOException));
        this.presumedClean = false;
        if (this.f40021d == null) {
            this.f40021d = new RecoveryCoordinator();
        }
    }

    public void setContext(Context context) {
        this.f40020c = context;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (m51405i()) {
            if (this.f40021d.isTooSoon()) {
                return;
            }
            m51406d();
            return;
        }
        try {
            this.f40022os.write(i);
            m51404k();
        } catch (IOException e) {
            postIOFailure(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (m51405i()) {
            if (this.f40021d.isTooSoon()) {
                return;
            }
            m51406d();
            return;
        }
        try {
            this.f40022os.write(bArr, i, i2);
            m51404k();
        } catch (IOException e) {
            postIOFailure(e);
        }
    }
}
