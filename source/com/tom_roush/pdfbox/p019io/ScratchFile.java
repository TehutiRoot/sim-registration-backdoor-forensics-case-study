package com.tom_roush.pdfbox.p019io;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.BitSet;
import okhttp3.internal.p026ws.WebSocketProtocol;

/* renamed from: com.tom_roush.pdfbox.io.ScratchFile */
/* loaded from: classes5.dex */
public class ScratchFile implements Closeable {

    /* renamed from: a */
    public final Object f59920a;

    /* renamed from: b */
    public final File f59921b;

    /* renamed from: c */
    public File f59922c;

    /* renamed from: d */
    public RandomAccessFile f59923d;

    /* renamed from: e */
    public volatile int f59924e;

    /* renamed from: f */
    public final BitSet f59925f;

    /* renamed from: g */
    public volatile byte[][] f59926g;

    /* renamed from: h */
    public final int f59927h;

    /* renamed from: i */
    public final int f59928i;

    /* renamed from: j */
    public final boolean f59929j;

    /* renamed from: k */
    public final boolean f59930k;

    /* renamed from: l */
    public volatile boolean f59931l;

    public ScratchFile(File file) throws IOException {
        this(MemoryUsageSetting.setupTempFileOnly().setTempDir(file));
    }

    public static ScratchFile getMainMemoryOnlyInstance() {
        try {
            return new ScratchFile(MemoryUsageSetting.setupMainMemoryOnly());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected exception occurred creating main memory scratch file instance: ");
            sb.append(e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public void m32755b() {
        if (!this.f59931l) {
            return;
        }
        throw new IOException("Scratch file already closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f59920a) {
            try {
                if (this.f59931l) {
                    return;
                }
                this.f59931l = true;
                RandomAccessFile randomAccessFile = this.f59923d;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e = e;
                    }
                }
                e = null;
                File file = this.f59922c;
                if (file != null && !file.delete() && this.f59922c.exists() && e == null) {
                    e = new IOException("Error deleting scratch file: " + this.f59922c.getAbsolutePath());
                }
                synchronized (this.f59925f) {
                    this.f59925f.clear();
                    this.f59924e = 0;
                }
                if (e == null) {
                    return;
                }
                throw e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public RandomAccess createBuffer() throws IOException {
        return new HE1(this);
    }

    /* renamed from: d */
    public final void m32754d() {
        synchronized (this.f59920a) {
            try {
                m32755b();
                if (this.f59924e >= this.f59928i) {
                    return;
                }
                if (this.f59929j) {
                    if (this.f59923d == null) {
                        this.f59922c = File.createTempFile("PDFBox", ".tmp", this.f59921b);
                        try {
                            this.f59923d = new RandomAccessFile(this.f59922c, "rw");
                        } catch (IOException e) {
                            if (!this.f59922c.delete()) {
                                Log.w("PdfBox-Android", "Error deleting scratch file: " + this.f59922c.getAbsolutePath());
                            }
                            throw e;
                        }
                    }
                    long length = this.f59923d.length();
                    long j = (this.f59924e - this.f59927h) * PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    if (j == length) {
                        if (this.f59924e + 16 > this.f59924e) {
                            if (PDFBoxConfig.isDebugEnabled()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("file: ");
                                sb.append(this.f59922c);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("fileLen before: ");
                                sb2.append(length);
                                sb2.append(", raf length: ");
                                sb2.append(this.f59923d.length());
                                sb2.append(", file length: ");
                                sb2.append(this.f59922c.length());
                            }
                            long j2 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH + length;
                            this.f59923d.setLength(j2);
                            if (PDFBoxConfig.isDebugEnabled()) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("fileLen after1: ");
                                sb3.append(j2);
                                sb3.append(", raf length: ");
                                sb3.append(this.f59923d.length());
                                sb3.append(", file length: ");
                                sb3.append(this.f59922c.length());
                            }
                            if (j2 != this.f59923d.length()) {
                                long filePointer = this.f59923d.getFilePointer();
                                this.f59923d.seek(length + WebSocketProtocol.PAYLOAD_SHORT_MAX);
                                this.f59923d.write(0);
                                this.f59923d.seek(filePointer);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("fileLen after2:  ");
                                sb4.append(j2);
                                sb4.append(", raf length: ");
                                sb4.append(this.f59923d.length());
                                sb4.append(", file length: ");
                                sb4.append(this.f59922c.length());
                            }
                            this.f59925f.set(this.f59924e, this.f59924e + 16);
                        }
                    } else {
                        throw new IOException("Expected scratch file size of " + j + " but found " + length + " in file " + this.f59922c);
                    }
                } else if (!this.f59930k) {
                    int length2 = this.f59926g.length;
                    int min = (int) Math.min(length2 * 2, 2147483647L);
                    if (min > length2) {
                        byte[][] bArr = new byte[min];
                        System.arraycopy(this.f59926g, 0, bArr, 0, length2);
                        this.f59926g = bArr;
                        this.f59925f.set(length2, min);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public int m32753g() {
        int nextSetBit;
        synchronized (this.f59925f) {
            try {
                nextSetBit = this.f59925f.nextSetBit(0);
                if (nextSetBit < 0) {
                    m32754d();
                    nextSetBit = this.f59925f.nextSetBit(0);
                    if (nextSetBit < 0) {
                        throw new IOException("Maximum allowed scratch file memory exceeded.");
                    }
                }
                this.f59925f.clear(nextSetBit);
                if (nextSetBit >= this.f59924e) {
                    this.f59924e = nextSetBit + 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nextSetBit;
    }

    /* renamed from: i */
    public int m32752i() {
        return 4096;
    }

    /* renamed from: j */
    public void m32751j(int[] iArr, int i, int i2) {
        synchronized (this.f59925f) {
            while (i < i2) {
                try {
                    int i3 = iArr[i];
                    if (i3 >= 0 && i3 < this.f59924e && !this.f59925f.get(i3)) {
                        this.f59925f.set(i3);
                        if (i3 < this.f59927h) {
                            this.f59926g[i3] = null;
                        }
                    }
                    i++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: k */
    public byte[] m32750k(int i) {
        byte[] bArr;
        if (i >= 0 && i < this.f59924e) {
            if (i < this.f59927h) {
                byte[] bArr2 = this.f59926g[i];
                if (bArr2 != null) {
                    return bArr2;
                }
                m32755b();
                throw new IOException("Requested page with index " + i + " was not written before.");
            }
            synchronized (this.f59920a) {
                try {
                    RandomAccessFile randomAccessFile = this.f59923d;
                    if (randomAccessFile != null) {
                        bArr = new byte[4096];
                        randomAccessFile.seek((i - this.f59927h) * PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                        this.f59923d.readFully(bArr);
                    } else {
                        m32755b();
                        throw new IOException("Missing scratch file to read page with index " + i + " from.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bArr;
        }
        m32755b();
        StringBuilder sb = new StringBuilder();
        sb.append("Page index out of range: ");
        sb.append(i);
        sb.append(". Max value: ");
        sb.append(this.f59924e - 1);
        throw new IOException(sb.toString());
    }

    /* renamed from: l */
    public void m32749l(int i, byte[] bArr) {
        if (i >= 0 && i < this.f59924e) {
            if (bArr.length == 4096) {
                if (i < this.f59927h) {
                    if (this.f59930k) {
                        this.f59926g[i] = bArr;
                    } else {
                        synchronized (this.f59920a) {
                            this.f59926g[i] = bArr;
                        }
                    }
                    m32755b();
                    return;
                }
                synchronized (this.f59920a) {
                    m32755b();
                    this.f59923d.seek((i - this.f59927h) * PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                    this.f59923d.write(bArr);
                }
                return;
            }
            throw new IOException("Wrong page size to write: " + bArr.length + ". Expected: 4096");
        }
        m32755b();
        StringBuilder sb = new StringBuilder();
        sb.append("Page index out of range: ");
        sb.append(i);
        sb.append(". Max value: ");
        sb.append(this.f59924e - 1);
        throw new IOException(sb.toString());
    }

    public ScratchFile(MemoryUsageSetting memoryUsageSetting) throws IOException {
        this.f59920a = new Object();
        this.f59924e = 0;
        BitSet bitSet = new BitSet();
        this.f59925f = bitSet;
        this.f59931l = false;
        boolean z = true;
        boolean z2 = !memoryUsageSetting.useMainMemory() || memoryUsageSetting.isMainMemoryRestricted();
        this.f59930k = z2;
        z = (z2 && memoryUsageSetting.useTempFile()) ? false : false;
        this.f59929j = z;
        File tempDir = z ? memoryUsageSetting.getTempDir() : null;
        this.f59921b = tempDir;
        if (tempDir != null && !tempDir.isDirectory()) {
            throw new IOException("Scratch file directory does not exist: " + tempDir);
        }
        int i = Integer.MAX_VALUE;
        this.f59928i = memoryUsageSetting.isStorageRestricted() ? (int) Math.min(2147483647L, memoryUsageSetting.getMaxStorageBytes() / PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) : Integer.MAX_VALUE;
        if (!memoryUsageSetting.useMainMemory()) {
            i = 0;
        } else if (memoryUsageSetting.isMainMemoryRestricted()) {
            i = (int) Math.min(2147483647L, memoryUsageSetting.getMaxMainMemoryBytes() / PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        }
        this.f59927h = i;
        this.f59926g = new byte[z2 ? i : AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength];
        bitSet.set(0, this.f59926g.length);
    }

    public RandomAccess createBuffer(InputStream inputStream) throws IOException {
        HE1 he1 = new HE1(this);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > -1) {
                he1.write(bArr, 0, read);
            } else {
                he1.seek(0L);
                return he1;
            }
        }
    }
}
