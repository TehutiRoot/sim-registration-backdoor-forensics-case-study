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
    public static final byte[] f42326a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f42327b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

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
        int mo50231a();

        /* renamed from: b */
        int mo50230b(byte[] bArr, int i);

        /* renamed from: c */
        short mo50229c();

        long skip(long j);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    /* loaded from: classes3.dex */
    public static final class C5850a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f42328a;

        public C5850a(ByteBuffer byteBuffer) {
            this.f42328a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo50231a() {
            return (mo50229c() << 8) | mo50229c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo50230b(byte[] bArr, int i) {
            int min = Math.min(i, this.f42328a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f42328a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo50229c() {
            if (this.f42328a.remaining() >= 1) {
                return (short) (this.f42328a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            int min = (int) Math.min(this.f42328a.remaining(), j);
            ByteBuffer byteBuffer = this.f42328a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    /* loaded from: classes3.dex */
    public static final class C5851b {

        /* renamed from: a */
        public final ByteBuffer f42329a;

        public C5851b(byte[] bArr, int i) {
            this.f42329a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short m50236a(int i) {
            if (m50234c(i, 2)) {
                return this.f42329a.getShort(i);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m50235b(int i) {
            if (m50234c(i, 4)) {
                return this.f42329a.getInt(i);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m50234c(int i, int i2) {
            if (this.f42329a.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public int m50233d() {
            return this.f42329a.remaining();
        }

        /* renamed from: e */
        public void m50232e(ByteOrder byteOrder) {
            this.f42329a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    /* loaded from: classes3.dex */
    public static final class C5852c implements Reader {

        /* renamed from: a */
        public final InputStream f42330a;

        public C5852c(InputStream inputStream) {
            this.f42330a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo50231a() {
            return (mo50229c() << 8) | mo50229c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo50230b(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f42330a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo50229c() {
            int read = this.f42330a.read();
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
                long skip = this.f42330a.skip(j2);
                if (skip <= 0) {
                    if (this.f42330a.read() == -1) {
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
    public static int m50245a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: d */
    public static boolean m50242d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: g */
    public static int m50239g(C5851b c5851b) {
        ByteOrder byteOrder;
        short m50236a = c5851b.m50236a(6);
        if (m50236a != 18761) {
            if (m50236a != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown endianness = ");
                    sb.append((int) m50236a);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        c5851b.m50232e(byteOrder);
        int m50235b = c5851b.m50235b(10) + 6;
        short m50236a2 = c5851b.m50236a(m50235b);
        for (int i = 0; i < m50236a2; i++) {
            int m50245a = m50245a(m50235b, i);
            short m50236a3 = c5851b.m50236a(m50245a);
            if (m50236a3 == 274) {
                short m50236a4 = c5851b.m50236a(m50245a + 2);
                if (m50236a4 >= 1 && m50236a4 <= 12) {
                    int m50235b2 = c5851b.m50235b(m50245a + 4);
                    if (m50235b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append((int) m50236a3);
                            sb2.append(" formatCode=");
                            sb2.append((int) m50236a4);
                            sb2.append(" componentCount=");
                            sb2.append(m50235b2);
                        }
                        int i2 = m50235b2 + f42327b[m50236a4];
                        if (i2 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Got byte count > 4, not orientation, continuing, formatCode=");
                                sb3.append((int) m50236a4);
                            }
                        } else {
                            int i3 = m50245a + 8;
                            if (i3 >= 0 && i3 <= c5851b.m50233d()) {
                                if (i2 >= 0 && i2 + i3 <= c5851b.m50233d()) {
                                    return c5851b.m50236a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append((int) m50236a3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Illegal tagValueOffset=");
                                sb5.append(i3);
                                sb5.append(" tagType=");
                                sb5.append((int) m50236a3);
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append((int) m50236a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m50244b(Reader reader, ArrayPool arrayPool) {
        try {
            int mo50231a = reader.mo50231a();
            if (!m50242d(mo50231a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(mo50231a);
                }
                return -1;
            }
            int m50240f = m50240f(reader);
            if (m50240f == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) arrayPool.get(m50240f, byte[].class);
            int m50238h = m50238h(reader, bArr, m50240f);
            arrayPool.put(bArr);
            return m50238h;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType m50243c(Reader reader) {
        try {
            int mo50231a = reader.mo50231a();
            if (mo50231a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo50229c = (mo50231a << 8) | reader.mo50229c();
            if (mo50229c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo50229c2 = (mo50229c << 8) | reader.mo50229c();
            if (mo50229c2 == -1991225785) {
                reader.skip(21L);
                try {
                    if (reader.mo50229c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (mo50229c2 != 1380533830) {
                return m50237i(reader, mo50229c2);
            } else {
                reader.skip(4L);
                if (((reader.mo50231a() << 16) | reader.mo50231a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int mo50231a2 = (reader.mo50231a() << 16) | reader.mo50231a();
                if ((mo50231a2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = mo50231a2 & 255;
                if (i == 88) {
                    reader.skip(4L);
                    short mo50229c3 = reader.mo50229c();
                    if ((mo50229c3 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((mo50229c3 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i == 76) {
                    reader.skip(4L);
                    if ((reader.mo50229c() & 8) != 0) {
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
    public final boolean m50241e(byte[] bArr, int i) {
        boolean z;
        if (bArr != null && i > f42326a.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f42326a;
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
    public final int m50240f(Reader reader) {
        short mo50229c;
        int mo50231a;
        long j;
        long skip;
        do {
            short mo50229c2 = reader.mo50229c();
            if (mo50229c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) mo50229c2);
                }
                return -1;
            }
            mo50229c = reader.mo50229c();
            if (mo50229c == 218) {
                return -1;
            }
            if (mo50229c == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            mo50231a = reader.mo50231a() - 2;
            if (mo50229c != 225) {
                j = mo50231a;
                skip = reader.skip(j);
            } else {
                return mo50231a;
            }
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append((int) mo50229c);
            sb2.append(", wanted to skip: ");
            sb2.append(mo50231a);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        return m50244b(new C5852c((InputStream) Preconditions.checkNotNull(inputStream)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType getType(@NonNull InputStream inputStream) throws IOException {
        return m50243c(new C5852c((InputStream) Preconditions.checkNotNull(inputStream)));
    }

    /* renamed from: h */
    public final int m50238h(Reader reader, byte[] bArr, int i) {
        int mo50230b = reader.mo50230b(bArr, i);
        if (mo50230b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(mo50230b);
            }
            return -1;
        } else if (m50241e(bArr, i)) {
            return m50239g(new C5851b(bArr, i));
        } else {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
    }

    /* renamed from: i */
    public final ImageHeaderParser.ImageType m50237i(Reader reader, int i) {
        boolean z;
        if (((reader.mo50231a() << 16) | reader.mo50231a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int mo50231a = (reader.mo50231a() << 16) | reader.mo50231a();
        if (mo50231a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        if (mo50231a == 1635150182) {
            z = true;
        } else {
            z = false;
        }
        reader.skip(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int mo50231a2 = (reader.mo50231a() << 16) | reader.mo50231a();
                if (mo50231a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (mo50231a2 == 1635150182) {
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
        return m50243c(new C5850a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException {
        return m50244b(new C5850a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }
}