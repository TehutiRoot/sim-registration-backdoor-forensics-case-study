package org.bson.p044io;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.bson.BsonSerializationException;
import org.bson.ByteBuf;
import org.bson.types.ObjectId;

/* renamed from: org.bson.io.ByteBufferBsonInput */
/* loaded from: classes.dex */
public class ByteBufferBsonInput implements BsonInput {

    /* renamed from: c */
    public static final Charset f75945c = Charset.forName("UTF-8");

    /* renamed from: d */
    public static final String[] f75946d = new String[128];

    /* renamed from: a */
    public ByteBuf f75947a;

    /* renamed from: b */
    public int f75948b = -1;

    /* renamed from: org.bson.io.ByteBufferBsonInput$a */
    /* loaded from: classes.dex */
    public class C12933a implements BsonInputMark {

        /* renamed from: a */
        public int f75949a;

        public C12933a() {
            this.f75949a = ByteBufferBsonInput.this.f75947a.position();
        }

        @Override // org.bson.p044io.BsonInputMark
        public void reset() {
            ByteBufferBsonInput.this.m24181i();
            ByteBufferBsonInput.this.f75947a.position(this.f75949a);
        }
    }

    static {
        int i = 0;
        while (true) {
            String[] strArr = f75946d;
            if (i < strArr.length) {
                strArr[i] = String.valueOf((char) i);
                i++;
            } else {
                return;
            }
        }
    }

    public ByteBufferBsonInput(ByteBuf byteBuf) {
        if (byteBuf != null) {
            this.f75947a = byteBuf;
            byteBuf.order(ByteOrder.LITTLE_ENDIAN);
            return;
        }
        throw new IllegalArgumentException("buffer can not be null");
    }

    @Override // org.bson.p044io.BsonInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f75947a.release();
        this.f75947a = null;
    }

    /* renamed from: g */
    public final void m24182g(int i) {
        if (this.f75947a.remaining() >= i) {
            return;
        }
        throw new BsonSerializationException(String.format("While decoding a BSON document %d bytes were required, but only %d remain", Integer.valueOf(i), Integer.valueOf(this.f75947a.remaining())));
    }

    @Override // org.bson.p044io.BsonInput
    public BsonInputMark getMark(int i) {
        return new C12933a();
    }

    @Override // org.bson.p044io.BsonInput
    public int getPosition() {
        m24181i();
        return this.f75947a.position();
    }

    @Override // org.bson.p044io.BsonInput
    public boolean hasRemaining() {
        m24181i();
        return this.f75947a.hasRemaining();
    }

    /* renamed from: i */
    public final void m24181i() {
        if (this.f75947a != null) {
            return;
        }
        throw new IllegalStateException("Stream is closed");
    }

    /* renamed from: j */
    public final String m24180j(int i) {
        if (i == 2) {
            byte readByte = readByte();
            if (readByte() == 0) {
                if (readByte < 0) {
                    return f75945c.newDecoder().replacement();
                }
                return f75946d[readByte];
            }
            throw new BsonSerializationException("Found a BSON string that is not null-terminated");
        }
        byte[] bArr = new byte[i - 1];
        readBytes(bArr);
        if (readByte() == 0) {
            return new String(bArr, f75945c);
        }
        throw new BsonSerializationException("Found a BSON string that is not null-terminated");
    }

    /* renamed from: k */
    public final void m24179k() {
        do {
        } while (readByte() != 0);
    }

    @Override // org.bson.p044io.BsonInput
    @Deprecated
    public void mark(int i) {
        m24181i();
        this.f75948b = this.f75947a.position();
    }

    @Override // org.bson.p044io.BsonInput
    public byte readByte() {
        m24181i();
        m24182g(1);
        return this.f75947a.get();
    }

    @Override // org.bson.p044io.BsonInput
    public void readBytes(byte[] bArr) {
        m24181i();
        m24182g(bArr.length);
        this.f75947a.get(bArr);
    }

    @Override // org.bson.p044io.BsonInput
    public String readCString() {
        m24181i();
        int position = this.f75947a.position();
        m24179k();
        this.f75947a.position(position);
        return m24180j(this.f75947a.position() - position);
    }

    @Override // org.bson.p044io.BsonInput
    public double readDouble() {
        m24181i();
        m24182g(8);
        return this.f75947a.getDouble();
    }

    @Override // org.bson.p044io.BsonInput
    public int readInt32() {
        m24181i();
        m24182g(4);
        return this.f75947a.getInt();
    }

    @Override // org.bson.p044io.BsonInput
    public long readInt64() {
        m24181i();
        m24182g(8);
        return this.f75947a.getLong();
    }

    @Override // org.bson.p044io.BsonInput
    public ObjectId readObjectId() {
        m24181i();
        byte[] bArr = new byte[12];
        readBytes(bArr);
        return new ObjectId(bArr);
    }

    @Override // org.bson.p044io.BsonInput
    public String readString() {
        m24181i();
        int readInt32 = readInt32();
        if (readInt32 > 0) {
            return m24180j(readInt32);
        }
        throw new BsonSerializationException(String.format("While decoding a BSON string found a size that is not a positive number: %d", Integer.valueOf(readInt32)));
    }

    @Override // org.bson.p044io.BsonInput
    @Deprecated
    public void reset() {
        m24181i();
        int i = this.f75948b;
        if (i != -1) {
            this.f75947a.position(i);
            return;
        }
        throw new IllegalStateException("Mark not set");
    }

    @Override // org.bson.p044io.BsonInput
    public void skip(int i) {
        m24181i();
        ByteBuf byteBuf = this.f75947a;
        byteBuf.position(byteBuf.position() + i);
    }

    @Override // org.bson.p044io.BsonInput
    public void skipCString() {
        m24181i();
        m24179k();
    }

    @Override // org.bson.p044io.BsonInput
    public void readBytes(byte[] bArr, int i, int i2) {
        m24181i();
        m24182g(i2);
        this.f75947a.get(bArr, i, i2);
    }
}
