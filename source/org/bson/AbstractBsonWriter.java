package org.bson;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.bson.assertions.Assertions;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public abstract class AbstractBsonWriter implements BsonWriter, Closeable {

    /* renamed from: a */
    public final BsonWriterSettings f75688a;

    /* renamed from: b */
    public final Stack f75689b;

    /* renamed from: c */
    public State f75690c;

    /* renamed from: d */
    public Context f75691d;

    /* renamed from: e */
    public int f75692e;

    /* renamed from: f */
    public boolean f75693f;

    /* loaded from: classes6.dex */
    public class Mark {

        /* renamed from: a */
        public final Context f75698a;

        /* renamed from: b */
        public final State f75699b;

        /* renamed from: c */
        public final String f75700c;

        /* renamed from: d */
        public final int f75701d;

        public Mark() {
            this.f75698a = AbstractBsonWriter.this.f75691d.copy();
            this.f75699b = AbstractBsonWriter.this.f75690c;
            this.f75700c = AbstractBsonWriter.this.f75691d.f75696c;
            this.f75701d = AbstractBsonWriter.this.f75692e;
        }

        public void reset() {
            AbstractBsonWriter.this.setContext(this.f75698a);
            AbstractBsonWriter.this.setState(this.f75699b);
            AbstractBsonWriter.this.f75691d.f75696c = this.f75700c;
            AbstractBsonWriter.this.f75692e = this.f75701d;
        }
    }

    /* loaded from: classes6.dex */
    public enum State {
        INITIAL,
        NAME,
        VALUE,
        SCOPE_DOCUMENT,
        DONE,
        CLOSED
    }

    /* renamed from: org.bson.AbstractBsonWriter$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12898a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75703a;

        static {
            int[] iArr = new int[BsonType.values().length];
            f75703a = iArr;
            try {
                iArr[BsonType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75703a[BsonType.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75703a[BsonType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75703a[BsonType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75703a[BsonType.BINARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75703a[BsonType.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f75703a[BsonType.OBJECT_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f75703a[BsonType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f75703a[BsonType.DATE_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f75703a[BsonType.NULL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f75703a[BsonType.REGULAR_EXPRESSION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f75703a[BsonType.JAVASCRIPT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f75703a[BsonType.SYMBOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f75703a[BsonType.JAVASCRIPT_WITH_SCOPE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f75703a[BsonType.INT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f75703a[BsonType.TIMESTAMP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f75703a[BsonType.INT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f75703a[BsonType.DECIMAL128.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f75703a[BsonType.MIN_KEY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f75703a[BsonType.DB_POINTER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f75703a[BsonType.MAX_KEY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public AbstractBsonWriter(BsonWriterSettings bsonWriterSettings) {
        this(bsonWriterSettings, new JI0());
    }

    /* renamed from: m */
    private void m24362m(BsonReader bsonReader, List list) {
        bsonReader.readStartDocument();
        writeStartDocument();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            writeName(bsonReader.readName());
            m24359p(bsonReader);
            if (abortPipe()) {
                return;
            }
        }
        bsonReader.readEndDocument();
        if (list != null) {
            pipeExtraElements(list);
        }
        writeEndDocument();
    }

    public boolean abortPipe() {
        return false;
    }

    public void checkPreconditions(String str, State... stateArr) {
        if (!isClosed()) {
            if (!checkState(stateArr)) {
                throwInvalidState(str, stateArr);
                return;
            }
            return;
        }
        throw new IllegalStateException("BsonWriter is closed");
    }

    public boolean checkState(State[] stateArr) {
        for (State state : stateArr) {
            if (state == getState()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f75693f = true;
    }

    public abstract void doWriteBinaryData(BsonBinary bsonBinary);

    public abstract void doWriteBoolean(boolean z);

    public abstract void doWriteDBPointer(BsonDbPointer bsonDbPointer);

    public abstract void doWriteDateTime(long j);

    public abstract void doWriteDecimal128(Decimal128 decimal128);

    public abstract void doWriteDouble(double d);

    public abstract void doWriteEndArray();

    public abstract void doWriteEndDocument();

    public abstract void doWriteInt32(int i);

    public abstract void doWriteInt64(long j);

    public abstract void doWriteJavaScript(String str);

    public abstract void doWriteJavaScriptWithScope(String str);

    public abstract void doWriteMaxKey();

    public abstract void doWriteMinKey();

    public void doWriteName(String str) {
    }

    public abstract void doWriteNull();

    public abstract void doWriteObjectId(ObjectId objectId);

    public abstract void doWriteRegularExpression(BsonRegularExpression bsonRegularExpression);

    public abstract void doWriteStartArray();

    public abstract void doWriteStartDocument();

    public abstract void doWriteString(String str);

    public abstract void doWriteSymbol(String str);

    public abstract void doWriteTimestamp(BsonTimestamp bsonTimestamp);

    public abstract void doWriteUndefined();

    public Context getContext() {
        return this.f75691d;
    }

    public String getName() {
        return this.f75691d.f75696c;
    }

    public State getNextState() {
        if (getContext().getContextType() == BsonContextType.ARRAY) {
            return State.VALUE;
        }
        return State.NAME;
    }

    public State getState() {
        return this.f75690c;
    }

    public boolean isClosed() {
        return this.f75693f;
    }

    /* renamed from: j */
    public final void m24365j(BsonArray bsonArray) {
        writeStartArray();
        Iterator<BsonValue> it = bsonArray.iterator();
        while (it.hasNext()) {
            m24358q(it.next());
        }
        writeEndArray();
    }

    /* renamed from: k */
    public final void m24364k(BsonReader bsonReader) {
        bsonReader.readStartArray();
        writeStartArray();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            m24359p(bsonReader);
            if (abortPipe()) {
                return;
            }
        }
        bsonReader.readEndArray();
        writeEndArray();
    }

    /* renamed from: l */
    public final void m24363l(BsonDocument bsonDocument) {
        writeStartDocument();
        for (Map.Entry<String, BsonValue> entry : bsonDocument.entrySet()) {
            writeName(entry.getKey());
            m24358q(entry.getValue());
        }
        writeEndDocument();
    }

    /* renamed from: n */
    public final void m24361n(BsonJavaScriptWithScope bsonJavaScriptWithScope) {
        writeJavaScriptWithScope(bsonJavaScriptWithScope.getCode());
        m24363l(bsonJavaScriptWithScope.getScope());
    }

    /* renamed from: o */
    public final void m24360o(BsonReader bsonReader) {
        writeJavaScriptWithScope(bsonReader.readJavaScriptWithScope());
        m24362m(bsonReader, null);
    }

    /* renamed from: p */
    public final void m24359p(BsonReader bsonReader) {
        switch (C12898a.f75703a[bsonReader.getCurrentBsonType().ordinal()]) {
            case 1:
                m24362m(bsonReader, null);
                return;
            case 2:
                m24364k(bsonReader);
                return;
            case 3:
                writeDouble(bsonReader.readDouble());
                return;
            case 4:
                writeString(bsonReader.readString());
                return;
            case 5:
                writeBinaryData(bsonReader.readBinaryData());
                return;
            case 6:
                bsonReader.readUndefined();
                writeUndefined();
                return;
            case 7:
                writeObjectId(bsonReader.readObjectId());
                return;
            case 8:
                writeBoolean(bsonReader.readBoolean());
                return;
            case 9:
                writeDateTime(bsonReader.readDateTime());
                return;
            case 10:
                bsonReader.readNull();
                writeNull();
                return;
            case 11:
                writeRegularExpression(bsonReader.readRegularExpression());
                return;
            case 12:
                writeJavaScript(bsonReader.readJavaScript());
                return;
            case 13:
                writeSymbol(bsonReader.readSymbol());
                return;
            case 14:
                m24360o(bsonReader);
                return;
            case 15:
                writeInt32(bsonReader.readInt32());
                return;
            case 16:
                writeTimestamp(bsonReader.readTimestamp());
                return;
            case 17:
                writeInt64(bsonReader.readInt64());
                return;
            case 18:
                writeDecimal128(bsonReader.readDecimal128());
                return;
            case 19:
                bsonReader.readMinKey();
                writeMinKey();
                return;
            case 20:
                writeDBPointer(bsonReader.readDBPointer());
                return;
            case 21:
                bsonReader.readMaxKey();
                writeMaxKey();
                return;
            default:
                throw new IllegalArgumentException("unhandled BSON type: " + bsonReader.getCurrentBsonType());
        }
    }

    @Override // org.bson.BsonWriter
    public void pipe(BsonReader bsonReader) {
        Assertions.notNull("reader", bsonReader);
        m24362m(bsonReader, null);
    }

    public void pipeExtraElements(List<BsonElement> list) {
        Assertions.notNull("extraElements", list);
        for (BsonElement bsonElement : list) {
            writeName(bsonElement.getName());
            m24358q(bsonElement.getValue());
        }
    }

    /* renamed from: q */
    public final void m24358q(BsonValue bsonValue) {
        switch (C12898a.f75703a[bsonValue.getBsonType().ordinal()]) {
            case 1:
                m24363l(bsonValue.asDocument());
                return;
            case 2:
                m24365j(bsonValue.asArray());
                return;
            case 3:
                writeDouble(bsonValue.asDouble().getValue());
                return;
            case 4:
                writeString(bsonValue.asString().getValue());
                return;
            case 5:
                writeBinaryData(bsonValue.asBinary());
                return;
            case 6:
                writeUndefined();
                return;
            case 7:
                writeObjectId(bsonValue.asObjectId().getValue());
                return;
            case 8:
                writeBoolean(bsonValue.asBoolean().getValue());
                return;
            case 9:
                writeDateTime(bsonValue.asDateTime().getValue());
                return;
            case 10:
                writeNull();
                return;
            case 11:
                writeRegularExpression(bsonValue.asRegularExpression());
                return;
            case 12:
                writeJavaScript(bsonValue.asJavaScript().getCode());
                return;
            case 13:
                writeSymbol(bsonValue.asSymbol().getSymbol());
                return;
            case 14:
                m24361n(bsonValue.asJavaScriptWithScope());
                return;
            case 15:
                writeInt32(bsonValue.asInt32().getValue());
                return;
            case 16:
                writeTimestamp(bsonValue.asTimestamp());
                return;
            case 17:
                writeInt64(bsonValue.asInt64().getValue());
                return;
            case 18:
                writeDecimal128(bsonValue.asDecimal128().getValue());
                return;
            case 19:
                writeMinKey();
                return;
            case 20:
                writeDBPointer(bsonValue.asDBPointer());
                return;
            case 21:
                writeMaxKey();
                return;
            default:
                throw new IllegalArgumentException("unhandled BSON type: " + bsonValue.getBsonType());
        }
    }

    public void setContext(Context context) {
        this.f75691d = context;
    }

    public void setState(State state) {
        this.f75690c = state;
    }

    public void throwInvalidContextType(String str, BsonContextType bsonContextType, BsonContextType... bsonContextTypeArr) {
        throw new BsonInvalidOperationException(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", str, ZM1.m65239a(" or ", Arrays.asList(bsonContextTypeArr)), bsonContextType));
    }

    public void throwInvalidState(String str, State... stateArr) {
        String str2;
        State state = this.f75690c;
        if ((state == State.INITIAL || state == State.SCOPE_DOCUMENT || state == State.DONE) && !str.startsWith("end") && !str.equals("writeName")) {
            String substring = str.substring(5);
            if (substring.startsWith("start")) {
                substring = substring.substring(5);
            }
            if (Arrays.asList('A', 'E', 'I', 'O', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT)).contains(Character.valueOf(substring.charAt(0)))) {
                str2 = "An";
            } else {
                str2 = "A";
            }
            throw new BsonInvalidOperationException(String.format("%s %s value cannot be written to the root level of a BSON document.", str2, substring));
        }
        throw new BsonInvalidOperationException(String.format("%s can only be called when State is %s, not when State is %s", str, ZM1.m65239a(" or ", Arrays.asList(stateArr)), this.f75690c));
    }

    @Override // org.bson.BsonWriter
    public void writeBinaryData(String str, BsonBinary bsonBinary) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", bsonBinary);
        writeName(str);
        writeBinaryData(bsonBinary);
    }

    @Override // org.bson.BsonWriter
    public void writeBoolean(String str, boolean z) {
        writeName(str);
        writeBoolean(z);
    }

    @Override // org.bson.BsonWriter
    public void writeDBPointer(String str, BsonDbPointer bsonDbPointer) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", bsonDbPointer);
        writeName(str);
        writeDBPointer(bsonDbPointer);
    }

    @Override // org.bson.BsonWriter
    public void writeDateTime(String str, long j) {
        writeName(str);
        writeDateTime(j);
    }

    @Override // org.bson.BsonWriter
    public void writeDecimal128(Decimal128 decimal128) {
        Assertions.notNull("value", decimal128);
        checkPreconditions("writeInt64", State.VALUE);
        doWriteDecimal128(decimal128);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeDouble(String str, double d) {
        writeName(str);
        writeDouble(d);
    }

    @Override // org.bson.BsonWriter
    public void writeEndArray() {
        checkPreconditions("writeEndArray", State.VALUE);
        BsonContextType contextType = getContext().getContextType();
        BsonContextType bsonContextType = BsonContextType.ARRAY;
        if (contextType != bsonContextType) {
            throwInvalidContextType("WriteEndArray", getContext().getContextType(), bsonContextType);
        }
        if (this.f75691d.getParentContext() != null && this.f75691d.getParentContext().f75696c != null) {
            this.f75689b.pop();
        }
        this.f75692e--;
        doWriteEndArray();
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeEndDocument() {
        BsonContextType bsonContextType;
        checkPreconditions("writeEndDocument", State.NAME);
        BsonContextType contextType = getContext().getContextType();
        BsonContextType bsonContextType2 = BsonContextType.DOCUMENT;
        if (contextType != bsonContextType2 && contextType != (bsonContextType = BsonContextType.SCOPE_DOCUMENT)) {
            throwInvalidContextType("WriteEndDocument", contextType, bsonContextType2, bsonContextType);
        }
        if (this.f75691d.getParentContext() != null && this.f75691d.getParentContext().f75696c != null) {
            this.f75689b.pop();
        }
        this.f75692e--;
        doWriteEndDocument();
        if (getContext() != null && getContext().getContextType() != BsonContextType.TOP_LEVEL) {
            setState(getNextState());
        } else {
            setState(State.DONE);
        }
    }

    @Override // org.bson.BsonWriter
    public void writeInt32(String str, int i) {
        writeName(str);
        writeInt32(i);
    }

    @Override // org.bson.BsonWriter
    public void writeInt64(String str, long j) {
        writeName(str);
        writeInt64(j);
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScript(String str, String str2) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", str2);
        writeName(str);
        writeJavaScript(str2);
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScriptWithScope(String str, String str2) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", str2);
        writeName(str);
        writeJavaScriptWithScope(str2);
    }

    @Override // org.bson.BsonWriter
    public void writeMaxKey(String str) {
        writeName(str);
        writeMaxKey();
    }

    @Override // org.bson.BsonWriter
    public void writeMinKey(String str) {
        writeName(str);
        writeMinKey();
    }

    @Override // org.bson.BsonWriter
    public void writeName(String str) {
        Assertions.notNull("name", str);
        State state = this.f75690c;
        State state2 = State.NAME;
        if (state != state2) {
            throwInvalidState("WriteName", state2);
        }
        if (((FieldNameValidator) this.f75689b.peek()).validate(str)) {
            doWriteName(str);
            this.f75691d.f75696c = str;
            this.f75690c = State.VALUE;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid BSON field name %s", str));
    }

    @Override // org.bson.BsonWriter
    public void writeNull(String str) {
        writeName(str);
        writeNull();
    }

    @Override // org.bson.BsonWriter
    public void writeObjectId(String str, ObjectId objectId) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", objectId);
        writeName(str);
        writeObjectId(objectId);
    }

    @Override // org.bson.BsonWriter
    public void writeRegularExpression(String str, BsonRegularExpression bsonRegularExpression) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", bsonRegularExpression);
        writeName(str);
        writeRegularExpression(bsonRegularExpression);
    }

    @Override // org.bson.BsonWriter
    public void writeStartArray(String str) {
        writeName(str);
        writeStartArray();
    }

    @Override // org.bson.BsonWriter
    public void writeStartDocument(String str) {
        writeName(str);
        writeStartDocument();
    }

    @Override // org.bson.BsonWriter
    public void writeString(String str, String str2) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", str2);
        writeName(str);
        writeString(str2);
    }

    @Override // org.bson.BsonWriter
    public void writeSymbol(String str, String str2) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", str2);
        writeName(str);
        writeSymbol(str2);
    }

    @Override // org.bson.BsonWriter
    public void writeTimestamp(String str, BsonTimestamp bsonTimestamp) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", bsonTimestamp);
        writeName(str);
        writeTimestamp(bsonTimestamp);
    }

    @Override // org.bson.BsonWriter
    public void writeUndefined(String str) {
        writeName(str);
        writeUndefined();
    }

    public AbstractBsonWriter(BsonWriterSettings bsonWriterSettings, FieldNameValidator fieldNameValidator) {
        Stack stack = new Stack();
        this.f75689b = stack;
        if (fieldNameValidator != null) {
            this.f75688a = bsonWriterSettings;
            stack.push(fieldNameValidator);
            this.f75690c = State.INITIAL;
            return;
        }
        throw new IllegalArgumentException("Validator can not be null");
    }

    /* loaded from: classes6.dex */
    public class Context {

        /* renamed from: a */
        public final Context f75694a;

        /* renamed from: b */
        public final BsonContextType f75695b;

        /* renamed from: c */
        public String f75696c;

        public Context(Context context) {
            this.f75694a = context.f75694a;
            this.f75695b = context.f75695b;
        }

        public Context copy() {
            return new Context(this);
        }

        public BsonContextType getContextType() {
            return this.f75695b;
        }

        public Context getParentContext() {
            return this.f75694a;
        }

        public Context(Context context, BsonContextType bsonContextType) {
            this.f75694a = context;
            this.f75695b = bsonContextType;
        }
    }

    public void pipe(BsonReader bsonReader, List<BsonElement> list) {
        Assertions.notNull("reader", bsonReader);
        Assertions.notNull("extraElements", list);
        m24362m(bsonReader, list);
    }

    @Override // org.bson.BsonWriter
    public void writeBoolean(boolean z) {
        checkPreconditions("writeBoolean", State.VALUE, State.INITIAL);
        doWriteBoolean(z);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeDateTime(long j) {
        checkPreconditions("writeDateTime", State.VALUE, State.INITIAL);
        doWriteDateTime(j);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeDouble(double d) {
        checkPreconditions("writeDBPointer", State.VALUE, State.INITIAL);
        doWriteDouble(d);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeInt32(int i) {
        checkPreconditions("writeInt32", State.VALUE);
        doWriteInt32(i);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeInt64(long j) {
        checkPreconditions("writeInt64", State.VALUE);
        doWriteInt64(j);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeMaxKey() {
        checkPreconditions("writeMaxKey", State.VALUE);
        doWriteMaxKey();
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeMinKey() {
        checkPreconditions("writeMinKey", State.VALUE);
        doWriteMinKey();
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeNull() {
        checkPreconditions("writeNull", State.VALUE);
        doWriteNull();
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeStartArray() {
        State state = State.VALUE;
        checkPreconditions("writeStartArray", state);
        Context context = this.f75691d;
        if (context != null && context.f75696c != null) {
            Stack stack = this.f75689b;
            stack.push(((FieldNameValidator) stack.peek()).getValidatorForField(getName()));
        }
        int i = this.f75692e + 1;
        this.f75692e = i;
        if (i <= this.f75688a.getMaxSerializationDepth()) {
            doWriteStartArray();
            setState(state);
            return;
        }
        throw new BsonSerializationException("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
    }

    @Override // org.bson.BsonWriter
    public void writeStartDocument() {
        checkPreconditions("writeStartDocument", State.INITIAL, State.VALUE, State.SCOPE_DOCUMENT, State.DONE);
        Context context = this.f75691d;
        if (context != null && context.f75696c != null) {
            Stack stack = this.f75689b;
            stack.push(((FieldNameValidator) stack.peek()).getValidatorForField(getName()));
        }
        int i = this.f75692e + 1;
        this.f75692e = i;
        if (i <= this.f75688a.getMaxSerializationDepth()) {
            doWriteStartDocument();
            setState(State.NAME);
            return;
        }
        throw new BsonSerializationException("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
    }

    @Override // org.bson.BsonWriter
    public void writeUndefined() {
        checkPreconditions("writeUndefined", State.VALUE);
        doWriteUndefined();
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeBinaryData(BsonBinary bsonBinary) {
        Assertions.notNull("value", bsonBinary);
        checkPreconditions("writeBinaryData", State.VALUE, State.INITIAL);
        doWriteBinaryData(bsonBinary);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeDBPointer(BsonDbPointer bsonDbPointer) {
        Assertions.notNull("value", bsonDbPointer);
        checkPreconditions("writeDBPointer", State.VALUE, State.INITIAL);
        doWriteDBPointer(bsonDbPointer);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeDecimal128(String str, Decimal128 decimal128) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", decimal128);
        writeName(str);
        writeDecimal128(decimal128);
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScript(String str) {
        Assertions.notNull("value", str);
        checkPreconditions("writeJavaScript", State.VALUE);
        doWriteJavaScript(str);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeJavaScriptWithScope(String str) {
        Assertions.notNull("value", str);
        checkPreconditions("writeJavaScriptWithScope", State.VALUE);
        doWriteJavaScriptWithScope(str);
        setState(State.SCOPE_DOCUMENT);
    }

    @Override // org.bson.BsonWriter
    public void writeObjectId(ObjectId objectId) {
        Assertions.notNull("value", objectId);
        checkPreconditions("writeObjectId", State.VALUE);
        doWriteObjectId(objectId);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeRegularExpression(BsonRegularExpression bsonRegularExpression) {
        Assertions.notNull("value", bsonRegularExpression);
        checkPreconditions("writeRegularExpression", State.VALUE);
        doWriteRegularExpression(bsonRegularExpression);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeString(String str) {
        Assertions.notNull("value", str);
        checkPreconditions("writeString", State.VALUE);
        doWriteString(str);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeSymbol(String str) {
        Assertions.notNull("value", str);
        checkPreconditions("writeSymbol", State.VALUE);
        doWriteSymbol(str);
        setState(getNextState());
    }

    @Override // org.bson.BsonWriter
    public void writeTimestamp(BsonTimestamp bsonTimestamp) {
        Assertions.notNull("value", bsonTimestamp);
        checkPreconditions("writeTimestamp", State.VALUE);
        doWriteTimestamp(bsonTimestamp);
        setState(getNextState());
    }
}
