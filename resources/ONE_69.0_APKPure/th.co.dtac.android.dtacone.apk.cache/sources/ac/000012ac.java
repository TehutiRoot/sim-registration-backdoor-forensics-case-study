package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: Tf */
/* loaded from: classes.dex */
public final class C1383Tf extends InputStream implements DataInput {

    /* renamed from: e */
    public static final ByteOrder f6383e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f */
    public static final ByteOrder f6384f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a */
    public final DataInputStream f6385a;

    /* renamed from: b */
    public ByteOrder f6386b;

    /* renamed from: c */
    public final int f6387c;

    /* renamed from: d */
    public int f6388d;

    public C1383Tf(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f6385a.available();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this.f6385a) {
            this.f6385a.mark(i);
        }
    }

    @Override // java.io.InputStream
    public int read() {
        this.f6388d++;
        return this.f6385a.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.f6388d++;
        return this.f6385a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        int i = this.f6388d + 1;
        this.f6388d = i;
        if (i <= this.f6387c) {
            int read = this.f6385a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.f6388d += 2;
        return this.f6385a.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.f6388d + i2;
        this.f6388d = i3;
        if (i3 <= this.f6387c) {
            if (this.f6385a.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public int readInt() {
        int i = this.f6388d + 4;
        this.f6388d = i;
        if (i <= this.f6387c) {
            int read = this.f6385a.read();
            int read2 = this.f6385a.read();
            int read3 = this.f6385a.read();
            int read4 = this.f6385a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f6386b;
                if (byteOrder == f6383e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f6384f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f6386b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() {
        int i = this.f6388d + 8;
        this.f6388d = i;
        if (i <= this.f6387c) {
            int read = this.f6385a.read();
            int read2 = this.f6385a.read();
            int read3 = this.f6385a.read();
            int read4 = this.f6385a.read();
            int read5 = this.f6385a.read();
            int read6 = this.f6385a.read();
            int read7 = this.f6385a.read();
            int read8 = this.f6385a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f6386b;
                if (byteOrder == f6383e) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f6384f) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f6386b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public short readShort() {
        int i = this.f6388d + 2;
        this.f6388d = i;
        if (i <= this.f6387c) {
            int read = this.f6385a.read();
            int read2 = this.f6385a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f6386b;
                if (byteOrder == f6383e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f6384f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f6386b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        this.f6388d += 2;
        return this.f6385a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.f6388d++;
        return this.f6385a.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return readInt() & BodyPartID.bodyIdMax;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        int i = this.f6388d + 2;
        this.f6388d = i;
        if (i <= this.f6387c) {
            int read = this.f6385a.read();
            int read2 = this.f6385a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f6386b;
                if (byteOrder == f6383e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f6384f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f6386b);
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.f6386b = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) {
        int min = Math.min(i, this.f6387c - this.f6388d);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.f6385a.skipBytes(min - i2);
        }
        this.f6388d += i2;
        return i2;
    }

    public C1383Tf(InputStream inputStream, ByteOrder byteOrder) {
        this.f6386b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f6385a = dataInputStream;
        int available = dataInputStream.available();
        this.f6387c = available;
        this.f6388d = 0;
        dataInputStream.mark(available);
        this.f6386b = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f6385a.read(bArr, i, i2);
        this.f6388d += read;
        return read;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        int length = this.f6388d + bArr.length;
        this.f6388d = length;
        if (length <= this.f6387c) {
            if (this.f6385a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public C1383Tf(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}