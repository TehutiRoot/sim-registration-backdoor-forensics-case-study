package org.bson;

import java.nio.ByteBuffer;
import org.bson.AbstractBsonReader;
import org.bson.assertions.Assertions;
import org.bson.p044io.BsonInput;
import org.bson.p044io.BsonInputMark;
import org.bson.p044io.ByteBufferBsonInput;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BsonBinaryReader extends AbstractBsonReader {

    /* renamed from: f */
    public final BsonInput f75723f;

    /* renamed from: g */
    public Mark f75724g;

    /* loaded from: classes6.dex */
    public class Context extends AbstractBsonReader.Context {

        /* renamed from: d */
        public final int f75725d;

        /* renamed from: e */
        public final int f75726e;

        public Context(Context context, BsonContextType bsonContextType, int i, int i2) {
            super(context, bsonContextType);
            this.f75725d = i;
            this.f75726e = i2;
        }

        /* renamed from: e */
        public Context m24339e(int i) {
            int i2 = i - this.f75725d;
            if (i2 == this.f75726e) {
                return getParentContext();
            }
            throw new BsonSerializationException(String.format("Expected size to be %d, not %d.", Integer.valueOf(this.f75726e), Integer.valueOf(i2)));
        }

        @Override // org.bson.AbstractBsonReader.Context
        public Context getParentContext() {
            return (Context) super.getParentContext();
        }
    }

    /* loaded from: classes6.dex */
    public class Mark extends AbstractBsonReader.Mark {

        /* renamed from: g */
        public final int f75728g;

        /* renamed from: h */
        public final int f75729h;

        /* renamed from: i */
        public final BsonInputMark f75730i;

        public Mark() {
            super();
            this.f75728g = BsonBinaryReader.this.getContext().f75725d;
            this.f75729h = BsonBinaryReader.this.getContext().f75726e;
            this.f75730i = BsonBinaryReader.this.f75723f.getMark(Integer.MAX_VALUE);
        }

        @Override // org.bson.AbstractBsonReader.Mark, org.bson.BsonReaderMark
        public void reset() {
            super.reset();
            this.f75730i.reset();
            BsonBinaryReader bsonBinaryReader = BsonBinaryReader.this;
            bsonBinaryReader.setContext(new Context((Context) getParentContext(), getContextType(), this.f75728g, this.f75729h));
        }
    }

    /* renamed from: org.bson.BsonBinaryReader$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12900a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75732a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f75733b;

        static {
            int[] iArr = new int[BsonType.values().length];
            f75733b = iArr;
            try {
                iArr[BsonType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75733b[BsonType.BINARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75733b[BsonType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75733b[BsonType.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75733b[BsonType.DOCUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75733b[BsonType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f75733b[BsonType.INT32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f75733b[BsonType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f75733b[BsonType.DECIMAL128.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f75733b[BsonType.JAVASCRIPT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f75733b[BsonType.JAVASCRIPT_WITH_SCOPE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f75733b[BsonType.MAX_KEY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f75733b[BsonType.MIN_KEY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f75733b[BsonType.NULL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f75733b[BsonType.OBJECT_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f75733b[BsonType.REGULAR_EXPRESSION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f75733b[BsonType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f75733b[BsonType.SYMBOL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f75733b[BsonType.TIMESTAMP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f75733b[BsonType.UNDEFINED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f75733b[BsonType.DB_POINTER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr2 = new int[BsonContextType.values().length];
            f75732a = iArr2;
            try {
                iArr2[BsonContextType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f75732a[BsonContextType.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f75732a[BsonContextType.SCOPE_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public BsonBinaryReader(ByteBuffer byteBuffer) {
        this(new ByteBufferBsonInput(new ByteBufNIO((ByteBuffer) Assertions.notNull("byteBuffer", byteBuffer))));
    }

    @Override // org.bson.AbstractBsonReader, org.bson.BsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // org.bson.AbstractBsonReader
    public int doPeekBinarySize() {
        mark();
        int m24342o = m24342o();
        reset();
        return m24342o;
    }

    @Override // org.bson.AbstractBsonReader
    public byte doPeekBinarySubType() {
        mark();
        m24342o();
        byte readByte = this.f75723f.readByte();
        reset();
        return readByte;
    }

    @Override // org.bson.AbstractBsonReader
    public BsonBinary doReadBinaryData() {
        int m24342o = m24342o();
        byte readByte = this.f75723f.readByte();
        if (readByte == BsonBinarySubType.OLD_BINARY.getValue()) {
            if (this.f75723f.readInt32() == m24342o - 4) {
                m24342o -= 4;
            } else {
                throw new BsonSerializationException("Binary sub type OldBinary has inconsistent sizes");
            }
        }
        byte[] bArr = new byte[m24342o];
        this.f75723f.readBytes(bArr);
        return new BsonBinary(readByte, bArr);
    }

    @Override // org.bson.AbstractBsonReader
    public boolean doReadBoolean() {
        byte readByte = this.f75723f.readByte();
        if (readByte != 0 && readByte != 1) {
            throw new BsonSerializationException(String.format("Expected a boolean value but found %d", Byte.valueOf(readByte)));
        }
        if (readByte != 1) {
            return false;
        }
        return true;
    }

    @Override // org.bson.AbstractBsonReader
    public BsonDbPointer doReadDBPointer() {
        return new BsonDbPointer(this.f75723f.readString(), this.f75723f.readObjectId());
    }

    @Override // org.bson.AbstractBsonReader
    public long doReadDateTime() {
        return this.f75723f.readInt64();
    }

    @Override // org.bson.AbstractBsonReader
    public Decimal128 doReadDecimal128() {
        return Decimal128.fromIEEE754BIDEncoding(this.f75723f.readInt64(), this.f75723f.readInt64());
    }

    @Override // org.bson.AbstractBsonReader
    public double doReadDouble() {
        return this.f75723f.readDouble();
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadEndArray() {
        setContext(getContext().m24339e(this.f75723f.getPosition()));
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadEndDocument() {
        setContext(getContext().m24339e(this.f75723f.getPosition()));
        if (getContext().getContextType() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
            setContext(getContext().m24339e(this.f75723f.getPosition()));
        }
    }

    @Override // org.bson.AbstractBsonReader
    public int doReadInt32() {
        return this.f75723f.readInt32();
    }

    @Override // org.bson.AbstractBsonReader
    public long doReadInt64() {
        return this.f75723f.readInt64();
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadJavaScript() {
        return this.f75723f.readString();
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadJavaScriptWithScope() {
        setContext(new Context(getContext(), BsonContextType.JAVASCRIPT_WITH_SCOPE, this.f75723f.getPosition(), m24342o()));
        return this.f75723f.readString();
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadMaxKey() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadMinKey() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadNull() {
    }

    @Override // org.bson.AbstractBsonReader
    public ObjectId doReadObjectId() {
        return this.f75723f.readObjectId();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonRegularExpression doReadRegularExpression() {
        return new BsonRegularExpression(this.f75723f.readCString(), this.f75723f.readCString());
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadStartArray() {
        setContext(new Context(getContext(), BsonContextType.ARRAY, this.f75723f.getPosition(), m24342o()));
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadStartDocument() {
        BsonContextType bsonContextType;
        if (getState() == AbstractBsonReader.State.SCOPE_DOCUMENT) {
            bsonContextType = BsonContextType.SCOPE_DOCUMENT;
        } else {
            bsonContextType = BsonContextType.DOCUMENT;
        }
        BsonContextType bsonContextType2 = bsonContextType;
        setContext(new Context(getContext(), bsonContextType2, this.f75723f.getPosition(), m24342o()));
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadString() {
        return this.f75723f.readString();
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadSymbol() {
        return this.f75723f.readString();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonTimestamp doReadTimestamp() {
        return new BsonTimestamp(this.f75723f.readInt64());
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadUndefined() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doSkipName() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doSkipValue() {
        int m24342o;
        int i = 0;
        if (!isClosed()) {
            AbstractBsonReader.State state = getState();
            AbstractBsonReader.State state2 = AbstractBsonReader.State.VALUE;
            if (state != state2) {
                throwInvalidState("skipValue", state2);
            }
            switch (C12900a.f75733b[getCurrentBsonType().ordinal()]) {
                case 1:
                    m24342o = m24342o();
                    i = m24342o - 4;
                    break;
                case 2:
                    i = m24342o() + 1;
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                case 6:
                case 8:
                case 19:
                    i = 8;
                    break;
                case 5:
                    m24342o = m24342o();
                    i = m24342o - 4;
                    break;
                case 7:
                    i = 4;
                    break;
                case 9:
                    i = 16;
                    break;
                case 10:
                    i = m24342o();
                    break;
                case 11:
                    m24342o = m24342o();
                    i = m24342o - 4;
                    break;
                case 12:
                case 13:
                case 14:
                case 20:
                    break;
                case 15:
                    i = 12;
                    break;
                case 16:
                    this.f75723f.skipCString();
                    this.f75723f.skipCString();
                    break;
                case 17:
                    i = m24342o();
                    break;
                case 18:
                    i = m24342o();
                    break;
                case 21:
                    i = m24342o() + 12;
                    break;
                default:
                    throw new BSONException("Unexpected BSON type: " + getCurrentBsonType());
            }
            this.f75723f.skip(i);
            setState(AbstractBsonReader.State.TYPE);
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    public BsonInput getBsonInput() {
        return this.f75723f;
    }

    @Override // org.bson.BsonReader
    public BsonReaderMark getMark() {
        return new Mark();
    }

    @Override // org.bson.BsonReader
    @Deprecated
    public void mark() {
        if (this.f75724g == null) {
            this.f75724g = new Mark();
            return;
        }
        throw new BSONException("A mark already exists; it needs to be reset before creating a new one");
    }

    /* renamed from: o */
    public final int m24342o() {
        int readInt32 = this.f75723f.readInt32();
        if (readInt32 >= 0) {
            return readInt32;
        }
        throw new BsonSerializationException(String.format("Size %s is not valid because it is negative.", Integer.valueOf(readInt32)));
    }

    @Override // org.bson.AbstractBsonReader, org.bson.BsonReader
    public BsonType readBsonType() {
        if (!isClosed()) {
            if (getState() != AbstractBsonReader.State.INITIAL && getState() != AbstractBsonReader.State.DONE && getState() != AbstractBsonReader.State.SCOPE_DOCUMENT) {
                AbstractBsonReader.State state = getState();
                AbstractBsonReader.State state2 = AbstractBsonReader.State.TYPE;
                if (state != state2) {
                    throwInvalidState("ReadBSONType", state2);
                }
                byte readByte = this.f75723f.readByte();
                BsonType findByValue = BsonType.findByValue(readByte);
                if (findByValue != null) {
                    setCurrentBsonType(findByValue);
                    BsonType currentBsonType = getCurrentBsonType();
                    BsonType bsonType = BsonType.END_OF_DOCUMENT;
                    if (currentBsonType == bsonType) {
                        int i = C12900a.f75732a[getContext().getContextType().ordinal()];
                        if (i != 1) {
                            if (i != 2 && i != 3) {
                                throw new BsonSerializationException(String.format("BSONType EndOfDocument is not valid when ContextType is %s.", getContext().getContextType()));
                            }
                            setState(AbstractBsonReader.State.END_OF_DOCUMENT);
                            return bsonType;
                        }
                        setState(AbstractBsonReader.State.END_OF_ARRAY);
                        return bsonType;
                    }
                    int i2 = C12900a.f75732a[getContext().getContextType().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            throw new BSONException("Unexpected ContextType.");
                        }
                        setCurrentName(this.f75723f.readCString());
                        setState(AbstractBsonReader.State.NAME);
                    } else {
                        this.f75723f.skipCString();
                        setState(AbstractBsonReader.State.VALUE);
                    }
                    return getCurrentBsonType();
                }
                throw new BsonSerializationException(String.format("Detected unknown BSON type \"\\x%x\" for fieldname \"%s\". Are you using the latest driver version?", Byte.valueOf(readByte), this.f75723f.readCString()));
            }
            setCurrentBsonType(BsonType.DOCUMENT);
            setState(AbstractBsonReader.State.VALUE);
            return getCurrentBsonType();
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    @Override // org.bson.BsonReader
    @Deprecated
    public void reset() {
        Mark mark = this.f75724g;
        if (mark != null) {
            mark.reset();
            this.f75724g = null;
            return;
        }
        throw new BSONException("trying to reset a mark before creating it");
    }

    public BsonBinaryReader(BsonInput bsonInput) {
        if (bsonInput != null) {
            this.f75723f = bsonInput;
            setContext(new Context(null, BsonContextType.TOP_LEVEL, 0, 0));
            return;
        }
        throw new IllegalArgumentException("bsonInput is null");
    }

    @Override // org.bson.AbstractBsonReader
    public Context getContext() {
        return (Context) super.getContext();
    }
}
