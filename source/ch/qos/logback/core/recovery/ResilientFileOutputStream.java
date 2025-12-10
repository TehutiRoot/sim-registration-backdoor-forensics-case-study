package ch.qos.logback.core.recovery;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public class ResilientFileOutputStream extends ResilientOutputStreamBase {

    /* renamed from: e */
    public File f40016e;

    /* renamed from: f */
    public FileOutputStream f40017f;

    public ResilientFileOutputStream(File file, boolean z, long j) throws FileNotFoundException {
        this.f40016e = file;
        this.f40017f = new FileOutputStream(file, z);
        this.f40022os = new BufferedOutputStream(this.f40017f, (int) j);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    /* renamed from: g */
    public String mo51403g() {
        return "file [" + this.f40016e + "]";
    }

    public FileChannel getChannel() {
        if (this.f40022os == null) {
            return null;
        }
        return this.f40017f.getChannel();
    }

    public File getFile() {
        return this.f40016e;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    /* renamed from: j */
    public OutputStream mo51402j() {
        this.f40017f = new FileOutputStream(this.f40016e, true);
        return new BufferedOutputStream(this.f40017f);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientFileOutputStream@" + System.identityHashCode(this);
    }
}
