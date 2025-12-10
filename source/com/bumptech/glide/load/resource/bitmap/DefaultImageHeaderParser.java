package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f42314a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f42315b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes3.dex */
    public interface Reader {

        /* loaded from: classes3.dex */
        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo50234a();

        /* renamed from: b */
        int mo50233b(byte[] bArr, int i);

        /* renamed from: c */
        short mo50232c();

        long skip(long j);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    /* loaded from: classes3.dex */
    public static final class C5861a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f42316a;

        public C5861a(ByteBuffer byteBuffer) {
            this.f42316a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo50234a() {
            return (mo50232c() << 8) | mo50232c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo50233b(byte[] bArr, int i) {
            int min = Math.min(i, this.f42316a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f42316a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo50232c() {
            if (this.f42316a.remaining() >= 1) {
                return (short) (this.f42316a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            int min = (int) Math.min(this.f42316a.remaining(), j);
            ByteBuffer byteBuffer = this.f42316a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    /* loaded from: classes3.dex */
    public static final class C5862b {

        /* renamed from: a */
        public final ByteBuffer f42317a;

        public C5862b(byte[] bArr, int i) {
            this.f42317a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short m50239a(int i) {
            if (m50237c(i, 2)) {
                return this.f42317a.getShort(i);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m50238b(int i) {
            if (m50237c(i, 4)) {
                return this.f42317a.getInt(i);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m50237c(int i, int i2) {
            if (this.f42317a.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public int m50236d() {
            return this.f42317a.remaining();
        }

        /* renamed from: e */
        public void m50235e(ByteOrder byteOrder) {
            this.f42317a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    /* loaded from: classes3.dex */
    public static final class C5863c implements Reader {

        /* renamed from: a */
        public final InputStream f42318a;

        public C5863c(InputStream inputStream) {
            this.f42318a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo50234a() {
            return (mo50232c() << 8) | mo50232c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo50233b(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f42318a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo50232c() {
            int read = this.f42318a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f42318a.skip(j2);
                if (skip <= 0) {
                    if (this.f42318a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: a */
    public static int m50248a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: d */
    public static boolean m50245d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: g */
    public static int m50242g(C5862b c5862b) {
        ByteOrder byteOrder;
        short m50239a = c5862b.m50239a(6);
        if (m50239a != 18761) {
            if (m50239a != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown endianness = ");
                    sb.append((int) m50239a);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        c5862b.m50235e(byteOrder);
        int m50238b = c5862b.m50238b(10) + 6;
        short m50239a2 = c5862b.m50239a(m50238b);
        for (int i = 0; i < m50239a2; i++) {
            int m50248a = m50248a(m50238b, i);
            short m50239a3 = c5862b.m50239a(m50248a);
            if (m50239a3 == 274) {
                short m50239a4 = c5862b.m50239a(m50248a + 2);
                if (m50239a4 >= 1 && m50239a4 <= 12) {
                    int m50238b2 = c5862b.m50238b(m50248a + 4);
                    if (m50238b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append((int) m50239a3);
                            sb2.append(" formatCode=");
                            sb2.append((int) m50239a4);
                            sb2.append(" componentCount=");
                            sb2.append(m50238b2);
                        }
                        int i2 = m50238b2 + f42315b[m50239a4];
                        if (i2 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Got byte count > 4, not orientation, continuing, formatCode=");
                                sb3.append((int) m50239a4);
                            }
                        } else {
                            int i3 = m50248a + 8;
                            if (i3 >= 0 && i3 <= c5862b.m50236d()) {
                                if (i2 >= 0 && i2 + i3 <= c5862b.m50236d()) {
                                    return c5862b.m50239a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append((int) m50239a3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Illegal tagValueOffset=");
                                sb5.append(i3);
                                sb5.append(" tagType=");
                                sb5.append((int) m50239a3);
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append((int) m50239a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m50247b(Reader reader, ArrayPool arrayPool) {
        try {
            int mo50234a = reader.mo50234a();
            if (!m50245d(mo50234a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(mo50234a);
                }
                return -1;
            }
            int m50243f = m50243f(reader);
            if (m50243f == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) arrayPool.get(m50243f, byte[].class);
            int m50241h = m50241h(reader, bArr, m50243f);
            arrayPool.put(bArr);
            return m50241h;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType m50246c(Reader reader) {
        try {
            int mo50234a = reader.mo50234a();
            if (mo50234a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo50232c = (mo50234a << 8) | reader.mo50232c();
            if (mo50232c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo50232c2 = (mo50232c << 8) | reader.mo50232c();
            if (mo50232c2 == -1991225785) {
                reader.skip(21L);
                try {
                    if (reader.mo50232c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (mo50232c2 != 1380533830) {
                return m50240i(reader, mo50232c2);
            } else {
                reader.skip(4L);
                if (((reader.mo50234a() << 16) | reader.mo50234a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int mo50234a2 = (reader.mo50234a() << 16) | reader.mo50234a();
                if ((mo50234a2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = mo50234a2 & 255;
                if (i == 88) {
                    reader.skip(4L);
                    short mo50232c3 = reader.mo50232c();
                    if ((mo50232c3 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((mo50232c3 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i == 76) {
                    reader.skip(4L);
                    if ((reader.mo50232c() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: e */
    public final boolean m50244e(byte[] bArr, int i) {
        boolean z;
        if (bArr != null && i > f42314a.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f42314a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: f */
    public final int m50243f(Reader reader) {
        short mo50232c;
        int mo50234a;
        long j;
        long skip;
        do {
            short mo50232c2 = reader.mo50232c();
            if (mo50232c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) mo50232c2);
                }
                return -1;
            }
            mo50232c = reader.mo50232c();
            if (mo50232c == 218) {
                return -1;
            }
            if (mo50232c == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            mo50234a = reader.mo50234a() - 2;
            if (mo50232c != 225) {
                j = mo50234a;
                skip = reader.skip(j);
            } else {
                return mo50234a;
            }
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append((int) mo50232c);
            sb2.append(", wanted to skip: ");
            sb2.append(mo50234a);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        return m50247b(new C5863c((InputStream) Preconditions.checkNotNull(inputStream)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType getType(@NonNull InputStream inputStream) throws IOException {
        return m50246c(new C5863c((InputStream) Preconditions.checkNotNull(inputStream)));
    }

    /* renamed from: h */
    public final int m50241h(Reader reader, byte[] bArr, int i) {
        int mo50233b = reader.mo50233b(bArr, i);
        if (mo50233b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(mo50233b);
            }
            return -1;
        } else if (m50244e(bArr, i)) {
            return m50242g(new C5862b(bArr, i));
        } else {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
    }

    /* renamed from: i */
    public final ImageHeaderParser.ImageType m50240i(Reader reader, int i) {
        boolean z;
        if (((reader.mo50234a() << 16) | reader.mo50234a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int mo50234a = (reader.mo50234a() << 16) | reader.mo50234a();
        if (mo50234a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        if (mo50234a == 1635150182) {
            z = true;
        } else {
            z = false;
        }
        reader.skip(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int mo50234a2 = (reader.mo50234a() << 16) | reader.mo50234a();
                if (mo50234a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (mo50234a2 == 1635150182) {
                    z = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        if (z) {
            return ImageHeaderParser.ImageType.AVIF;
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType getType(@NonNull ByteBuffer byteBuffer) throws IOException {
        return m50246c(new C5861a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException {
        return m50247b(new C5861a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }
}
