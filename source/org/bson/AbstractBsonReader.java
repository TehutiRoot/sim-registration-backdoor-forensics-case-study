package org.bson;

import java.util.Arrays;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public abstract class AbstractBsonReader implements BsonReader {

    /* renamed from: a */
    public State f75673a = State.INITIAL;

    /* renamed from: b */
    public Context f75674b;

    /* renamed from: c */
    public BsonType f75675c;

    /* renamed from: d */
    public String f75676d;

    /* renamed from: e */
    public boolean f75677e;

    /* loaded from: classes6.dex */
    public abstract class Context {

        /* renamed from: a */
        public final Context f75678a;

        /* renamed from: b */
        public final BsonContextType f75679b;

        public Context(Context context, BsonContextType bsonContextType) {
            this.f75678a = context;
            this.f75679b = bsonContextType;
        }

        public BsonContextType getContextType() {
            return this.f75679b;
        }

        public Context getParentContext() {
            return this.f75678a;
        }
    }

    /* loaded from: classes6.dex */
    public class Mark implements BsonReaderMark {

        /* renamed from: a */
        public final State f75681a;

        /* renamed from: b */
        public final Context f75682b;

        /* renamed from: c */
        public final BsonContextType f75683c;

        /* renamed from: d */
        public final BsonType f75684d;

        /* renamed from: e */
        public final String f75685e;

        public Mark() {
            this.f75681a = AbstractBsonReader.this.f75673a;
            this.f75682b = AbstractBsonReader.this.f75674b.f75678a;
            this.f75683c = AbstractBsonReader.this.f75674b.f75679b;
            this.f75684d = AbstractBsonReader.this.f75675c;
            this.f75685e = AbstractBsonReader.this.f75676d;
        }

        public BsonContextType getContextType() {
            return this.f75683c;
        }

        public Context getParentContext() {
            return this.f75682b;
        }

        @Override // org.bson.BsonReaderMark
        public void reset() {
            AbstractBsonReader.this.f75673a = this.f75681a;
            AbstractBsonReader.this.f75675c = this.f75684d;
            AbstractBsonReader.this.f75676d = this.f75685e;
        }
    }

    /* loaded from: classes6.dex */
    public enum State {
        INITIAL,
        TYPE,
        NAME,
        VALUE,
        SCOPE_DOCUMENT,
        END_OF_DOCUMENT,
        END_OF_ARRAY,
        DONE,
        CLOSED
    }

    /* renamed from: org.bson.AbstractBsonReader$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12897a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75687a;

        static {
            int[] iArr = new int[BsonContextType.values().length];
            f75687a = iArr;
            try {
                iArr[BsonContextType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75687a[BsonContextType.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75687a[BsonContextType.SCOPE_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75687a[BsonContextType.TOP_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public void checkPreconditions(String str, BsonType bsonType) {
        if (!isClosed()) {
            verifyBSONType(str, bsonType);
            return;
        }
        throw new IllegalStateException("BsonWriter is closed");
    }

    @Override // org.bson.BsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f75677e = true;
    }

    public abstract int doPeekBinarySize();

    public abstract byte doPeekBinarySubType();

    public abstract BsonBinary doReadBinaryData();

    public abstract boolean doReadBoolean();

    public abstract BsonDbPointer doReadDBPointer();

    public abstract long doReadDateTime();

    public abstract Decimal128 doReadDecimal128();

    public abstract double doReadDouble();

    public abstract void doReadEndArray();

    public abstract void doReadEndDocument();

    public abstract int doReadInt32();

    public abstract long doReadInt64();

    public abstract String doReadJavaScript();

    public abstract String doReadJavaScriptWithScope();

    public abstract void doReadMaxKey();

    public abstract void doReadMinKey();

    public abstract void doReadNull();

    public abstract ObjectId doReadObjectId();

    public abstract BsonRegularExpression doReadRegularExpression();

    public abstract void doReadStartArray();

    public abstract void doReadStartDocument();

    public abstract String doReadString();

    public abstract String doReadSymbol();

    public abstract BsonTimestamp doReadTimestamp();

    public abstract void doReadUndefined();

    public abstract void doSkipName();

    public abstract void doSkipValue();

    public Context getContext() {
        return this.f75674b;
    }

    @Override // org.bson.BsonReader
    public BsonType getCurrentBsonType() {
        return this.f75675c;
    }

    @Override // org.bson.BsonReader
    public String getCurrentName() {
        State state = this.f75673a;
        State state2 = State.VALUE;
        if (state != state2) {
            throwInvalidState("getCurrentName", state2);
        }
        return this.f75676d;
    }

    public State getNextState() {
        int i = C12897a.f75687a[this.f75674b.getContextType().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return State.DONE;
            }
            throw new BSONException(String.format("Unexpected ContextType %s.", this.f75674b.getContextType()));
        }
        return State.TYPE;
    }

    public State getState() {
        return this.f75673a;
    }

    public boolean isClosed() {
        return this.f75677e;
    }

    /* renamed from: m */
    public final void m24372m() {
        int i = C12897a.f75687a[getContext().getContextType().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 4) {
                setState(State.DONE);
                return;
            }
            throw new BSONException(String.format("Unexpected ContextType %s.", getContext().getContextType()));
        }
        setState(State.TYPE);
    }

    @Override // org.bson.BsonReader
    public int peekBinarySize() {
        checkPreconditions("readBinaryData", BsonType.BINARY);
        return doPeekBinarySize();
    }

    @Override // org.bson.BsonReader
    public byte peekBinarySubType() {
        checkPreconditions("readBinaryData", BsonType.BINARY);
        return doPeekBinarySubType();
    }

    @Override // org.bson.BsonReader
    public BsonBinary readBinaryData() {
        checkPreconditions("readBinaryData", BsonType.BINARY);
        setState(getNextState());
        return doReadBinaryData();
    }

    @Override // org.bson.BsonReader
    public boolean readBoolean() {
        checkPreconditions("readBoolean", BsonType.BOOLEAN);
        setState(getNextState());
        return doReadBoolean();
    }

    @Override // org.bson.BsonReader
    public abstract BsonType readBsonType();

    @Override // org.bson.BsonReader
    public BsonDbPointer readDBPointer() {
        checkPreconditions("readDBPointer", BsonType.DB_POINTER);
        setState(getNextState());
        return doReadDBPointer();
    }

    @Override // org.bson.BsonReader
    public long readDateTime() {
        checkPreconditions("readDateTime", BsonType.DATE_TIME);
        setState(getNextState());
        return doReadDateTime();
    }

    @Override // org.bson.BsonReader
    public Decimal128 readDecimal128() {
        checkPreconditions("readDecimal", BsonType.DECIMAL128);
        setState(getNextState());
        return doReadDecimal128();
    }

    @Override // org.bson.BsonReader
    public double readDouble() {
        checkPreconditions("readDouble", BsonType.DOUBLE);
        setState(getNextState());
        return doReadDouble();
    }

    @Override // org.bson.BsonReader
    public void readEndArray() {
        if (!isClosed()) {
            BsonContextType contextType = getContext().getContextType();
            BsonContextType bsonContextType = BsonContextType.ARRAY;
            if (contextType != bsonContextType) {
                throwInvalidContextType("readEndArray", getContext().getContextType(), bsonContextType);
            }
            if (getState() == State.TYPE) {
                readBsonType();
            }
            State state = getState();
            State state2 = State.END_OF_ARRAY;
            if (state != state2) {
                throwInvalidState("ReadEndArray", state2);
            }
            doReadEndArray();
            m24372m();
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    @Override // org.bson.BsonReader
    public void readEndDocument() {
        if (!isClosed()) {
            BsonContextType contextType = getContext().getContextType();
            BsonContextType bsonContextType = BsonContextType.DOCUMENT;
            if (contextType != bsonContextType) {
                BsonContextType contextType2 = getContext().getContextType();
                BsonContextType bsonContextType2 = BsonContextType.SCOPE_DOCUMENT;
                if (contextType2 != bsonContextType2) {
                    throwInvalidContextType("readEndDocument", getContext().getContextType(), bsonContextType, bsonContextType2);
                }
            }
            if (getState() == State.TYPE) {
                readBsonType();
            }
            State state = getState();
            State state2 = State.END_OF_DOCUMENT;
            if (state != state2) {
                throwInvalidState("readEndDocument", state2);
            }
            doReadEndDocument();
            m24372m();
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    @Override // org.bson.BsonReader
    public int readInt32() {
        checkPreconditions("readInt32", BsonType.INT32);
        setState(getNextState());
        return doReadInt32();
    }

    @Override // org.bson.BsonReader
    public long readInt64() {
        checkPreconditions("readInt64", BsonType.INT64);
        setState(getNextState());
        return doReadInt64();
    }

    @Override // org.bson.BsonReader
    public String readJavaScript() {
        checkPreconditions("readJavaScript", BsonType.JAVASCRIPT);
        setState(getNextState());
        return doReadJavaScript();
    }

    @Override // org.bson.BsonReader
    public String readJavaScriptWithScope() {
        checkPreconditions("readJavaScriptWithScope", BsonType.JAVASCRIPT_WITH_SCOPE);
        setState(State.SCOPE_DOCUMENT);
        return doReadJavaScriptWithScope();
    }

    @Override // org.bson.BsonReader
    public void readMaxKey() {
        checkPreconditions("readMaxKey", BsonType.MAX_KEY);
        setState(getNextState());
        doReadMaxKey();
    }

    @Override // org.bson.BsonReader
    public void readMinKey() {
        checkPreconditions("readMinKey", BsonType.MIN_KEY);
        setState(getNextState());
        doReadMinKey();
    }

    @Override // org.bson.BsonReader
    public String readName() {
        if (this.f75673a == State.TYPE) {
            readBsonType();
        }
        State state = this.f75673a;
        State state2 = State.NAME;
        if (state != state2) {
            throwInvalidState("readName", state2);
        }
        this.f75673a = State.VALUE;
        return this.f75676d;
    }

    @Override // org.bson.BsonReader
    public void readNull() {
        checkPreconditions("readNull", BsonType.NULL);
        setState(getNextState());
        doReadNull();
    }

    @Override // org.bson.BsonReader
    public ObjectId readObjectId() {
        checkPreconditions("readObjectId", BsonType.OBJECT_ID);
        setState(getNextState());
        return doReadObjectId();
    }

    @Override // org.bson.BsonReader
    public BsonRegularExpression readRegularExpression() {
        checkPreconditions("readRegularExpression", BsonType.REGULAR_EXPRESSION);
        setState(getNextState());
        return doReadRegularExpression();
    }

    @Override // org.bson.BsonReader
    public void readStartArray() {
        checkPreconditions("readStartArray", BsonType.ARRAY);
        doReadStartArray();
        setState(State.TYPE);
    }

    @Override // org.bson.BsonReader
    public void readStartDocument() {
        checkPreconditions("readStartDocument", BsonType.DOCUMENT);
        doReadStartDocument();
        setState(State.TYPE);
    }

    @Override // org.bson.BsonReader
    public String readString() {
        checkPreconditions("readString", BsonType.STRING);
        setState(getNextState());
        return doReadString();
    }

    @Override // org.bson.BsonReader
    public String readSymbol() {
        checkPreconditions("readSymbol", BsonType.SYMBOL);
        setState(getNextState());
        return doReadSymbol();
    }

    @Override // org.bson.BsonReader
    public BsonTimestamp readTimestamp() {
        checkPreconditions("readTimestamp", BsonType.TIMESTAMP);
        setState(getNextState());
        return doReadTimestamp();
    }

    @Override // org.bson.BsonReader
    public void readUndefined() {
        checkPreconditions("readUndefined", BsonType.UNDEFINED);
        setState(getNextState());
        doReadUndefined();
    }

    public void setContext(Context context) {
        this.f75674b = context;
    }

    public void setCurrentBsonType(BsonType bsonType) {
        this.f75675c = bsonType;
    }

    public void setCurrentName(String str) {
        this.f75676d = str;
    }

    public void setState(State state) {
        this.f75673a = state;
    }

    @Override // org.bson.BsonReader
    public void skipName() {
        if (!isClosed()) {
            State state = getState();
            State state2 = State.NAME;
            if (state != state2) {
                throwInvalidState("skipName", state2);
            }
            setState(State.VALUE);
            doSkipName();
            return;
        }
        throw new IllegalStateException("This instance has been closed");
    }

    @Override // org.bson.BsonReader
    public void skipValue() {
        if (!isClosed()) {
            State state = getState();
            State state2 = State.VALUE;
            if (state != state2) {
                throwInvalidState("skipValue", state2);
            }
            doSkipValue();
            setState(State.TYPE);
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    public void throwInvalidContextType(String str, BsonContextType bsonContextType, BsonContextType... bsonContextTypeArr) {
        throw new BsonInvalidOperationException(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", str, ZM1.m65239a(" or ", Arrays.asList(bsonContextTypeArr)), bsonContextType));
    }

    public void throwInvalidState(String str, State... stateArr) {
        throw new BsonInvalidOperationException(String.format("%s can only be called when State is %s, not when State is %s.", str, ZM1.m65239a(" or ", Arrays.asList(stateArr)), this.f75673a));
    }

    public void verifyBSONType(String str, BsonType bsonType) {
        State state = this.f75673a;
        if (state == State.INITIAL || state == State.SCOPE_DOCUMENT || state == State.TYPE) {
            readBsonType();
        }
        if (this.f75673a == State.NAME) {
            skipName();
        }
        State state2 = this.f75673a;
        State state3 = State.VALUE;
        if (state2 != state3) {
            throwInvalidState(str, state3);
        }
        if (this.f75675c == bsonType) {
            return;
        }
        throw new BsonInvalidOperationException(String.format("%s can only be called when CurrentBSONType is %s, not when CurrentBSONType is %s.", str, bsonType, this.f75675c));
    }

    public void verifyName(String str) {
        readBsonType();
        String readName = readName();
        if (readName.equals(str)) {
            return;
        }
        throw new BsonSerializationException(String.format("Expected element name to be '%s', not '%s'.", str, readName));
    }

    @Override // org.bson.BsonReader
    public BsonBinary readBinaryData(String str) {
        verifyName(str);
        return readBinaryData();
    }

    @Override // org.bson.BsonReader
    public boolean readBoolean(String str) {
        verifyName(str);
        return readBoolean();
    }

    @Override // org.bson.BsonReader
    public BsonDbPointer readDBPointer(String str) {
        verifyName(str);
        return readDBPointer();
    }

    @Override // org.bson.BsonReader
    public long readDateTime(String str) {
        verifyName(str);
        return readDateTime();
    }

    @Override // org.bson.BsonReader
    public Decimal128 readDecimal128(String str) {
        verifyName(str);
        return readDecimal128();
    }

    @Override // org.bson.BsonReader
    public double readDouble(String str) {
        verifyName(str);
        return readDouble();
    }

    @Override // org.bson.BsonReader
    public int readInt32(String str) {
        verifyName(str);
        return readInt32();
    }

    @Override // org.bson.BsonReader
    public long readInt64(String str) {
        verifyName(str);
        return readInt64();
    }

    @Override // org.bson.BsonReader
    public String readJavaScript(String str) {
        verifyName(str);
        return readJavaScript();
    }

    @Override // org.bson.BsonReader
    public String readJavaScriptWithScope(String str) {
        verifyName(str);
        return readJavaScriptWithScope();
    }

    @Override // org.bson.BsonReader
    public void readMaxKey(String str) {
        verifyName(str);
        readMaxKey();
    }

    @Override // org.bson.BsonReader
    public void readMinKey(String str) {
        verifyName(str);
        readMinKey();
    }

    @Override // org.bson.BsonReader
    public void readNull(String str) {
        verifyName(str);
        readNull();
    }

    @Override // org.bson.BsonReader
    public ObjectId readObjectId(String str) {
        verifyName(str);
        return readObjectId();
    }

    @Override // org.bson.BsonReader
    public BsonRegularExpression readRegularExpression(String str) {
        verifyName(str);
        return readRegularExpression();
    }

    @Override // org.bson.BsonReader
    public String readString(String str) {
        verifyName(str);
        return readString();
    }

    @Override // org.bson.BsonReader
    public String readSymbol(String str) {
        verifyName(str);
        return readSymbol();
    }

    @Override // org.bson.BsonReader
    public BsonTimestamp readTimestamp(String str) {
        verifyName(str);
        return readTimestamp();
    }

    @Override // org.bson.BsonReader
    public void readUndefined(String str) {
        verifyName(str);
        readUndefined();
    }

    @Override // org.bson.BsonReader
    public void readName(String str) {
        verifyName(str);
    }
}
