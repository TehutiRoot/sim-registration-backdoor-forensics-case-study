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
    public final int f53971a;

    /* renamed from: b */
    public final boolean f53972b;

    /* renamed from: c */
    public final ByteSource f53973c;

    /* renamed from: d */
    public OutputStream f53974d;

    /* renamed from: e */
    public C8093c f53975e;

    /* renamed from: f */
    public File f53976f;

    /* renamed from: com.google.common.io.FileBackedOutputStream$a */
    /* loaded from: classes4.dex */
    public class C8091a extends ByteSource {
        public C8091a() {
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
            return FileBackedOutputStream.this.m39977d();
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$b */
    /* loaded from: classes4.dex */
    public class C8092b extends ByteSource {
        public C8092b() {
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return FileBackedOutputStream.this.m39977d();
        }
    }

    /* renamed from: com.google.common.io.FileBackedOutputStream$c */
    /* loaded from: classes4.dex */
    public static class C8093c extends ByteArrayOutputStream {
        public C8093c() {
        }

        /* renamed from: b */
        public byte[] m39975b() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public int getCount() {
            return ((ByteArrayOutputStream) this).count;
        }

        public /* synthetic */ C8093c(C8091a c8091a) {
            this();
        }
    }

    public FileBackedOutputStream(int i) {
        this(i, false);
    }

    public ByteSource asByteSource() {
        return this.f53973c;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f53974d.close();
    }

    /* renamed from: d */
    public final synchronized InputStream m39977d() {
        if (this.f53976f != null) {
            return new FileInputStream(this.f53976f);
        }
        Objects.requireNonNull(this.f53975e);
        return new ByteArrayInputStream(this.f53975e.m39975b(), 0, this.f53975e.getCount());
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        this.f53974d.flush();
    }

    /* renamed from: g */
    public final void m39976g(int i) {
        C8093c c8093c = this.f53975e;
        if (c8093c != null && c8093c.getCount() + i > this.f53971a) {
            File mo65125b = AbstractC19052aS1.f8431a.mo65125b("FileBackedOutputStream");
            if (this.f53972b) {
                mo65125b.deleteOnExit();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(mo65125b);
                fileOutputStream.write(this.f53975e.m39975b(), 0, this.f53975e.getCount());
                fileOutputStream.flush();
                this.f53974d = fileOutputStream;
                this.f53976f = mo65125b;
                this.f53975e = null;
            } catch (IOException e) {
                mo65125b.delete();
                throw e;
            }
        }
    }

    public synchronized void reset() throws IOException {
        try {
            close();
            C8093c c8093c = this.f53975e;
            if (c8093c == null) {
                this.f53975e = new C8093c(null);
            } else {
                c8093c.reset();
            }
            this.f53974d = this.f53975e;
            File file = this.f53976f;
            if (file != null) {
                this.f53976f = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        } finally {
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) throws IOException {
        m39976g(1);
        this.f53974d.write(i);
    }

    public FileBackedOutputStream(int i, boolean z) {
        Preconditions.checkArgument(i >= 0, "fileThreshold must be non-negative, but was %s", i);
        this.f53971a = i;
        this.f53972b = z;
        C8093c c8093c = new C8093c(null);
        this.f53975e = c8093c;
        this.f53974d = c8093c;
        if (z) {
            this.f53973c = new C8091a();
        } else {
            this.f53973c = new C8092b();
        }
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        m39976g(i2);
        this.f53974d.write(bArr, i, i2);
    }
}