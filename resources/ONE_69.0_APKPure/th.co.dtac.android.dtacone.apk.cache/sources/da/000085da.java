package com.fasterxml.jackson.core.p011io;

import com.fasterxml.jackson.core.base.GeneratorBase;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.io.UTF32Reader */
/* loaded from: classes3.dex */
public class UTF32Reader extends Reader {
    protected static final int LAST_VALID_UNICODE_CHAR = 1114111;

    /* renamed from: NC */
    protected static final char f43146NC = 0;
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i;
        this._length = i2;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null;
    }

    /* renamed from: b */
    public final void m49745b() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            m49745b();
            inputStream.close();
        }
    }

    /* renamed from: d */
    public final boolean m49744d(int i) {
        int read;
        int read2;
        this._byteCount += this._length - i;
        if (i > 0) {
            int i2 = this._ptr;
            if (i2 > 0) {
                byte[] bArr = this._buffer;
                System.arraycopy(bArr, i2, bArr, 0, i);
                this._ptr = 0;
            }
            this._length = i;
        } else {
            this._ptr = 0;
            InputStream inputStream = this._in;
            if (inputStream == null) {
                read = -1;
            } else {
                read = inputStream.read(this._buffer);
            }
            if (read < 1) {
                this._length = 0;
                if (read < 0) {
                    if (this._managedBuffers) {
                        m49745b();
                    }
                    return false;
                }
                m49741j();
            }
            this._length = read;
        }
        while (true) {
            int i3 = this._length;
            if (i3 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            if (inputStream2 == null) {
                read2 = -1;
            } else {
                byte[] bArr2 = this._buffer;
                read2 = inputStream2.read(bArr2, i3, bArr2.length - i3);
            }
            if (read2 < 1) {
                if (read2 < 0) {
                    if (this._managedBuffers) {
                        m49745b();
                    }
                    m49740k(this._length, 4);
                }
                m49741j();
            }
            this._length += read2;
        }
    }

    /* renamed from: g */
    public final void m49743g(char[] cArr, int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    /* renamed from: i */
    public final void m49742i(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(this._charCount + i2);
        sb.append(", byte #");
        sb.append((this._byteCount + this._ptr) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    /* renamed from: j */
    public final void m49741j() {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    /* renamed from: k */
    public final void m49740k(int i, int i2) {
        int i3 = this._charCount;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i3 + ", byte #" + (this._byteCount + i) + ")");
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this._buffer == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            m49743g(cArr, i, i2);
        }
        int i7 = i2 + i;
        char c = this._surrogate;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this._surrogate = (char) 0;
        } else {
            int i8 = this._length - this._ptr;
            if (i8 < 4 && !m49744d(i8)) {
                if (i8 == 0) {
                    return -1;
                }
                m49740k(this._length - this._ptr, 4);
            }
            i3 = i;
        }
        int i9 = this._length - 4;
        while (i3 < i7) {
            int i10 = this._ptr;
            if (this._bigEndian) {
                byte[] bArr = this._buffer;
                i4 = (bArr[i10] << 8) | (bArr[i10 + 1] & 255);
                i5 = (bArr[i10 + 3] & 255) | ((bArr[i10 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this._buffer;
                int i11 = (bArr2[i10] & 255) | ((bArr2[i10 + 1] & 255) << 8);
                i4 = (bArr2[i10 + 3] << 8) | (bArr2[i10 + 2] & 255);
                i5 = i11;
            }
            this._ptr = i10 + 4;
            if (i4 != 0) {
                int i12 = 65535 & i4;
                int i13 = i5 | ((i12 - 1) << 16);
                if (i12 > 16) {
                    m49742i(i13, i3 - i, String.format(" (above 0x%08x)", Integer.valueOf((int) LAST_VALID_UNICODE_CHAR)));
                }
                i6 = i3 + 1;
                cArr[i3] = (char) ((i13 >> 10) + GeneratorBase.SURR1_FIRST);
                int i14 = (i13 & 1023) | 56320;
                if (i6 >= i7) {
                    this._surrogate = (char) i13;
                    i3 = i6;
                    break;
                }
                i5 = i14;
                i3 = i6;
            }
            i6 = i3 + 1;
            cArr[i3] = (char) i5;
            if (this._ptr > i9) {
                i3 = i6;
                break;
            }
            i3 = i6;
        }
        int i15 = i3 - i;
        this._charCount += i15;
        return i15;
    }
}