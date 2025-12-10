package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ByteBufferUtil {

    /* renamed from: a */
    public static final AtomicReference f42720a = new AtomicReference();

    /* renamed from: com.bumptech.glide.util.ByteBufferUtil$b */
    /* loaded from: classes3.dex */
    public static final class C5922b {

        /* renamed from: a */
        public final int f42723a;

        /* renamed from: b */
        public final int f42724b;

        /* renamed from: c */
        public final byte[] f42725c;

        public C5922b(byte[] bArr, int i, int i2) {
            this.f42725c = bArr;
            this.f42723a = i;
            this.f42724b = i2;
        }
    }

    /* renamed from: a */
    public static C5922b m49987a(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new C5922b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    @NonNull
    public static ByteBuffer fromFile(@NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, PDPageLabelRange.STYLE_ROMAN_LOWER);
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static ByteBuffer fromStream(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f42720a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                f42720a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return rewind(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer rewind(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @NonNull
    public static byte[] toBytes(@NonNull ByteBuffer byteBuffer) {
        C5922b m49987a = m49987a(byteBuffer);
        if (m49987a != null && m49987a.f42723a == 0 && m49987a.f42724b == m49987a.f42725c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        rewind(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void toFile(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        rewind(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static void toStream(@NonNull ByteBuffer byteBuffer, @NonNull OutputStream outputStream) throws IOException {
        C5922b m49987a = m49987a(byteBuffer);
        if (m49987a != null) {
            byte[] bArr = m49987a.f42725c;
            int i = m49987a.f42723a;
            outputStream.write(bArr, i, m49987a.f42724b + i);
            return;
        }
        byte[] bArr2 = (byte[]) f42720a.getAndSet(null);
        if (bArr2 == null) {
            bArr2 = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), bArr2.length);
            byteBuffer.get(bArr2, 0, min);
            outputStream.write(bArr2, 0, min);
        }
        f42720a.set(bArr2);
    }

    /* renamed from: com.bumptech.glide.util.ByteBufferUtil$a */
    /* loaded from: classes3.dex */
    public static class C5921a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f42721a;

        /* renamed from: b */
        public int f42722b = -1;

        public C5921a(ByteBuffer byteBuffer) {
            this.f42721a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f42721a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f42722b = this.f42721a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f42721a.hasRemaining()) {
                return this.f42721a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i = this.f42722b;
            if (i != -1) {
                this.f42721a.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f42721a.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            ByteBuffer byteBuffer = this.f42721a;
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (this.f42721a.hasRemaining()) {
                int min = Math.min(i2, available());
                this.f42721a.get(bArr, i, min);
                return min;
            }
            return -1;
        }
    }

    @NonNull
    public static InputStream toStream(@NonNull ByteBuffer byteBuffer) {
        return new C5921a(byteBuffer);
    }
}