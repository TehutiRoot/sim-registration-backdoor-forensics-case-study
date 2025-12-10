package com.google.common.p014io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

@Beta
@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.FileBackedOutputStream */
/* loaded from: classes4.dex */
public final class FileBackedOutputStream extends OutputStream {

    /* renamed from: a */
    public final int f53959a;

    /* renamed from: b */
    public final boolean f53960b;

    /* renamed from: c */
    public final ByteSource f53961c;

    /* renamed from: d */
    public OutputStream f53962d;

    /* renamed from: e */
    public C8104c f53963e;

    /* renamed from: f */
    public File f53964f;

    /* renamed from: com.google.common.io.FileBackedOutputStream$a */
    /* loaded from: classes4.dex */
    public class C8102a extends ByteSource {
        public C8102a() {
        }

        public void finalize() {
            try {
                FileBackedOutputStream.this.reset();
            } catch (Throwable th2) {
                th2.printStackTrace(System.err);
            }
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return FileBackedOutputStream.this.m39986d();
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$b */
    /* loaded from: classes4.dex */
    public class C8103b extends ByteSource {
        public C8103b() {
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return FileBackedOutputStream.this.m39986d();
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$c */
    /* loaded from: classes4.dex */
    public static class C8104c extends ByteArrayOutputStream {
        public C8104c() {
        }

        /* renamed from: b */
        public byte[] m39984b() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        public /* synthetic */ C8104c(C8102a c8102a) {
            this();
        }
    }

    public FileBackedOutputStream(int i) {
        this(i, false);
    }

    public ByteSource asByteSource() {
        return this.f53961c;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f53962d.close();
    }

    /* renamed from: d */
    public final synchronized InputStream m39986d() {
        if (this.f53964f != null) {
            return new FileInputStream(this.f53964f);
        }
        Objects.requireNonNull(this.f53963e);
        return new ByteArrayInputStream(this.f53963e.m39984b(), 0, this.f53963e.getCount());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f53962d.flush();
    }

    /* renamed from: g */
    public final void m39985g(int i) {
        C8104c c8104c = this.f53963e;
        if (c8104c != null && c8104c.getCount() + i > this.f53959a) {
            File mo31866b = AbstractC19524dR1.f61162a.mo31866b("FileBackedOutputStream");
            if (this.f53960b) {
                mo31866b.deleteOnExit();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(mo31866b);
                fileOutputStream.write(this.f53963e.m39984b(), 0, this.f53963e.getCount());
                fileOutputStream.flush();
                this.f53962d = fileOutputStream;
                this.f53964f = mo31866b;
                this.f53963e = null;
            } catch (IOException e) {
                mo31866b.delete();
                throw e;
            }
        }
    }

    public synchronized void reset() throws IOException {
        try {
            close();
            C8104c c8104c = this.f53963e;
            if (c8104c == null) {
                this.f53963e = new C8104c(null);
            } else {
                c8104c.reset();
            }
            this.f53962d = this.f53963e;
            File file = this.f53964f;
            if (file != null) {
                this.f53964f = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        } finally {
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        m39985g(1);
        this.f53962d.write(i);
    }

    public FileBackedOutputStream(int i, boolean z) {
        Preconditions.checkArgument(i >= 0, "fileThreshold must be non-negative, but was %s", i);
        this.f53959a = i;
        this.f53960b = z;
        C8104c c8104c = new C8104c(null);
        this.f53963e = c8104c;
        this.f53962d = c8104c;
        if (z) {
            this.f53961c = new C8102a();
        } else {
            this.f53961c = new C8103b();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        m39985g(i2);
        this.f53962d.write(bArr, i, i2);
    }
}
