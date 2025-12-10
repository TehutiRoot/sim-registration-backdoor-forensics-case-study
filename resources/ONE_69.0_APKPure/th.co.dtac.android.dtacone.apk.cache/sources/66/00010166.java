package org.bson;

import java.util.List;
import java.util.Stack;
import org.bson.AbstractBsonReader;
import org.bson.AbstractBsonWriter;
import org.bson.assertions.Assertions;
import org.bson.p044io.BsonInput;
import org.bson.p044io.BsonOutput;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BsonBinaryWriter extends AbstractBsonWriter {

    /* renamed from: g */
    public final BsonBinaryWriterSettings f75818g;

    /* renamed from: h */
    public final BsonOutput f75819h;

    /* renamed from: i */
    public final Stack f75820i;

    /* renamed from: j */
    public Mark f75821j;

    /* loaded from: classes6.dex */
    public class Context extends AbstractBsonWriter.Context {

        /* renamed from: e */
        public final int f75822e;

        /* renamed from: f */
        public int f75823f;

        public Context(Context context, BsonContextType bsonContextType, int i) {
            super(context, bsonContextType);
            this.f75822e = i;
        }

        /* renamed from: c */
        public static /* synthetic */ int m24522c(Context context) {
            int i = context.f75823f;
            context.f75823f = i + 1;
            return i;
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public Context copy() {
            return new Context(this);
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public Context getParentContext() {
            return (Context) super.getParentContext();
        }

        public Context(Context context) {
            super(context);
            this.f75822e = context.f75822e;
            this.f75823f = context.f75823f;
        }
    }

    /* loaded from: classes6.dex */
    public class Mark extends AbstractBsonWriter.Mark {

        /* renamed from: f */
        public final int f75825f;

        public Mark() {
            super();
            this.f75825f = BsonBinaryWriter.this.f75819h.getPosition();
        }

        @Override // org.bson.AbstractBsonWriter.Mark
        public void reset() {
            super.reset();
            BsonBinaryWriter.this.f75819h.truncateToPosition(BsonBinaryWriter.this.f75821j.f75825f);
        }
    }

    public BsonBinaryWriter(BsonOutput bsonOutput, FieldNameValidator fieldNameValidator) {
        this(new BsonWriterSettings(), new BsonBinaryWriterSettings(), bsonOutput, fieldNameValidator);
    }

    @Override // org.bson.AbstractBsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBinaryData(BsonBinary bsonBinary) {
        this.f75819h.writeByte(BsonType.BINARY.getValue());
        m24523v();
        int length = bsonBinary.getData().length;
        byte type = bsonBinary.getType();
        BsonBinarySubType bsonBinarySubType = BsonBinarySubType.OLD_BINARY;
        if (type == bsonBinarySubType.getValue()) {
            length += 4;
        }
        this.f75819h.writeInt32(length);
        this.f75819h.writeByte(bsonBinary.getType());
        if (bsonBinary.getType() == bsonBinarySubType.getValue()) {
            this.f75819h.writeInt32(length - 4);
        }
        this.f75819h.writeBytes(bsonBinary.getData());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean z) {
        this.f75819h.writeByte(BsonType.BOOLEAN.getValue());
        m24523v();
        this.f75819h.writeByte(z ? 1 : 0);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDBPointer(BsonDbPointer bsonDbPointer) {
        this.f75819h.writeByte(BsonType.DB_POINTER.getValue());
        m24523v();
        this.f75819h.writeString(bsonDbPointer.getNamespace());
        this.f75819h.writeBytes(bsonDbPointer.getId().toByteArray());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDateTime(long j) {
        this.f75819h.writeByte(BsonType.DATE_TIME.getValue());
        m24523v();
        this.f75819h.writeInt64(j);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDecimal128(Decimal128 decimal128) {
        this.f75819h.writeByte(BsonType.DECIMAL128.getValue());
        m24523v();
        this.f75819h.writeInt64(decimal128.getLow());
        this.f75819h.writeInt64(decimal128.getHigh());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDouble(double d) {
        this.f75819h.writeByte(BsonType.DOUBLE.getValue());
        m24523v();
        this.f75819h.writeDouble(d);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndArray() {
        this.f75819h.writeByte(0);
        m24525t();
        setContext(getContext().getParentContext());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndDocument() {
        this.f75819h.writeByte(0);
        m24525t();
        setContext(getContext().getParentContext());
        if (getContext() != null && getContext().getContextType() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
            m24525t();
            setContext(getContext().getParentContext());
        }
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt32(int i) {
        this.f75819h.writeByte(BsonType.INT32.getValue());
        m24523v();
        this.f75819h.writeInt32(i);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt64(long j) {
        this.f75819h.writeByte(BsonType.INT64.getValue());
        m24523v();
        this.f75819h.writeInt64(j);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScript(String str) {
        this.f75819h.writeByte(BsonType.JAVASCRIPT.getValue());
        m24523v();
        this.f75819h.writeString(str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScriptWithScope(String str) {
        this.f75819h.writeByte(BsonType.JAVASCRIPT_WITH_SCOPE.getValue());
        m24523v();
        setContext(new Context(getContext(), BsonContextType.JAVASCRIPT_WITH_SCOPE, this.f75819h.getPosition()));
        this.f75819h.writeInt32(0);
        this.f75819h.writeString(str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMaxKey() {
        this.f75819h.writeByte(BsonType.MAX_KEY.getValue());
        m24523v();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMinKey() {
        this.f75819h.writeByte(BsonType.MIN_KEY.getValue());
        m24523v();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
        this.f75819h.writeByte(BsonType.NULL.getValue());
        m24523v();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(ObjectId objectId) {
        this.f75819h.writeByte(BsonType.OBJECT_ID.getValue());
        m24523v();
        this.f75819h.writeBytes(objectId.toByteArray());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(BsonRegularExpression bsonRegularExpression) {
        this.f75819h.writeByte(BsonType.REGULAR_EXPRESSION.getValue());
        m24523v();
        this.f75819h.writeCString(bsonRegularExpression.getPattern());
        this.f75819h.writeCString(bsonRegularExpression.getOptions());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartArray() {
        this.f75819h.writeByte(BsonType.ARRAY.getValue());
        m24523v();
        setContext(new Context(getContext(), BsonContextType.ARRAY, this.f75819h.getPosition()));
        this.f75819h.writeInt32(0);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartDocument() {
        if (getState() == AbstractBsonWriter.State.VALUE) {
            this.f75819h.writeByte(BsonType.DOCUMENT.getValue());
            m24523v();
        }
        setContext(new Context(getContext(), BsonContextType.DOCUMENT, this.f75819h.getPosition()));
        this.f75819h.writeInt32(0);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(String str) {
        this.f75819h.writeByte(BsonType.STRING.getValue());
        m24523v();
        this.f75819h.writeString(str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(String str) {
        this.f75819h.writeByte(BsonType.SYMBOL.getValue());
        m24523v();
        this.f75819h.writeString(str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(BsonTimestamp bsonTimestamp) {
        this.f75819h.writeByte(BsonType.TIMESTAMP.getValue());
        m24523v();
        this.f75819h.writeInt64(bsonTimestamp.getValue());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
        this.f75819h.writeByte(BsonType.UNDEFINED.getValue());
        m24523v();
    }

    @Override // org.bson.BsonWriter
    public void flush() {
    }

    public BsonBinaryWriterSettings getBinaryWriterSettings() {
        return this.f75818g;
    }

    public BsonOutput getBsonOutput() {
        return this.f75819h;
    }

    /* renamed from: m */
    public final void m24528m(BsonReader bsonReader, List list) {
        if (bsonReader instanceof BsonBinaryReader) {
            BsonBinaryReader bsonBinaryReader = (BsonBinaryReader) bsonReader;
            if (getState() == AbstractBsonWriter.State.VALUE) {
                this.f75819h.writeByte(BsonType.DOCUMENT.getValue());
                m24523v();
            }
            BsonInput bsonInput = bsonBinaryReader.getBsonInput();
            int readInt32 = bsonInput.readInt32();
            if (readInt32 >= 5) {
                int position = this.f75819h.getPosition();
                this.f75819h.writeInt32(readInt32);
                byte[] bArr = new byte[readInt32 - 4];
                bsonInput.readBytes(bArr);
                this.f75819h.writeBytes(bArr);
                bsonBinaryReader.setState(AbstractBsonReader.State.TYPE);
                if (list != null) {
                    BsonOutput bsonOutput = this.f75819h;
                    bsonOutput.truncateToPosition(bsonOutput.getPosition() - 1);
                    setContext(new Context(getContext(), BsonContextType.DOCUMENT, position));
                    setState(AbstractBsonWriter.State.NAME);
                    pipeExtraElements(list);
                    this.f75819h.writeByte(0);
                    BsonOutput bsonOutput2 = this.f75819h;
                    bsonOutput2.writeInt32(position, bsonOutput2.getPosition() - position);
                    setContext(getContext().getParentContext());
                }
                if (getContext() == null) {
                    setState(AbstractBsonWriter.State.DONE);
                } else {
                    if (getContext().getContextType() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
                        m24525t();
                        setContext(getContext().getParentContext());
                    }
                    setState(getNextState());
                }
                m24524u(this.f75819h.getPosition() - position);
                return;
            }
            throw new BsonSerializationException("Document size must be at least 5");
        } else if (list != null) {
            super.pipe(bsonReader, list);
        } else {
            super.pipe(bsonReader);
        }
    }

    public void mark() {
        this.f75821j = new Mark();
    }

    @Override // org.bson.AbstractBsonWriter, org.bson.BsonWriter
    public void pipe(BsonReader bsonReader) {
        Assertions.notNull("reader", bsonReader);
        m24528m(bsonReader, null);
    }

    public void popMaxDocumentSize() {
        this.f75820i.pop();
    }

    public void pushMaxDocumentSize(int i) {
        this.f75820i.push(Integer.valueOf(i));
    }

    public void reset() {
        Mark mark = this.f75821j;
        if (mark != null) {
            mark.reset();
            this.f75821j = null;
            return;
        }
        throw new IllegalStateException("Can not reset without first marking");
    }

    /* renamed from: t */
    public final void m24525t() {
        int position = this.f75819h.getPosition() - getContext().f75822e;
        m24524u(position);
        BsonOutput bsonOutput = this.f75819h;
        bsonOutput.writeInt32(bsonOutput.getPosition() - position, position);
    }

    /* renamed from: u */
    public final void m24524u(int i) {
        if (i <= ((Integer) this.f75820i.peek()).intValue()) {
            return;
        }
        throw new BsonMaximumSizeExceededException(String.format("Document size of %d is larger than maximum of %d.", Integer.valueOf(i), this.f75820i.peek()));
    }

    /* renamed from: v */
    public final void m24523v() {
        if (getContext().getContextType() == BsonContextType.ARRAY) {
            this.f75819h.writeCString(Integer.toString(Context.m24522c(getContext())));
        } else {
            this.f75819h.writeCString(getName());
        }
    }

    public BsonBinaryWriter(BsonOutput bsonOutput) {
        this(new BsonWriterSettings(), new BsonBinaryWriterSettings(), bsonOutput);
    }

    @Override // org.bson.AbstractBsonWriter
    public Context getContext() {
        return (Context) super.getContext();
    }

    public BsonBinaryWriter(BsonWriterSettings bsonWriterSettings, BsonBinaryWriterSettings bsonBinaryWriterSettings, BsonOutput bsonOutput) {
        this(bsonWriterSettings, bsonBinaryWriterSettings, bsonOutput, new PI0());
    }

    @Override // org.bson.AbstractBsonWriter
    public void pipe(BsonReader bsonReader, List<BsonElement> list) {
        Assertions.notNull("reader", bsonReader);
        Assertions.notNull("extraElements", list);
        m24528m(bsonReader, list);
    }

    public BsonBinaryWriter(BsonWriterSettings bsonWriterSettings, BsonBinaryWriterSettings bsonBinaryWriterSettings, BsonOutput bsonOutput, FieldNameValidator fieldNameValidator) {
        super(bsonWriterSettings, fieldNameValidator);
        Stack stack = new Stack();
        this.f75820i = stack;
        this.f75818g = bsonBinaryWriterSettings;
        this.f75819h = bsonOutput;
        stack.push(Integer.valueOf(bsonBinaryWriterSettings.getMaxDocumentSize()));
    }
}