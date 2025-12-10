package org.bson;

import org.bson.AbstractBsonWriter;
import org.bson.p044io.Bits;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BSONCallbackAdapter extends AbstractBsonWriter {

    /* renamed from: g */
    public BSONCallback f75793g;

    /* loaded from: classes6.dex */
    public class Context extends AbstractBsonWriter.Context {

        /* renamed from: e */
        public int f75794e;

        /* renamed from: f */
        public BSONCallback f75795f;

        /* renamed from: g */
        public String f75796g;

        /* renamed from: h */
        public String f75797h;

        public Context(Context context, BsonContextType bsonContextType) {
            super(context, bsonContextType);
        }

        /* renamed from: i */
        public static /* synthetic */ int m24538i(Context context) {
            int i = context.f75794e;
            context.f75794e = i + 1;
            return i;
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public Context getParentContext() {
            return (Context) super.getParentContext();
        }
    }

    public BSONCallbackAdapter(BsonWriterSettings bsonWriterSettings, BSONCallback bSONCallback) {
        super(bsonWriterSettings);
        this.f75793g = bSONCallback;
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBinaryData(BsonBinary bsonBinary) {
        if (bsonBinary.getType() == BsonBinarySubType.UUID_LEGACY.getValue()) {
            this.f75793g.gotUUID(getName(), Bits.readLong(bsonBinary.getData(), 0), Bits.readLong(bsonBinary.getData(), 8));
        } else {
            this.f75793g.gotBinary(getName(), bsonBinary.getType(), bsonBinary.getData());
        }
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean z) {
        this.f75793g.gotBoolean(getName(), z);
        setState(getNextState());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDBPointer(BsonDbPointer bsonDbPointer) {
        this.f75793g.gotDBRef(getName(), bsonDbPointer.getNamespace(), bsonDbPointer.getId());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDateTime(long j) {
        this.f75793g.gotDate(getName(), j);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDecimal128(Decimal128 decimal128) {
        this.f75793g.gotDecimal128(getName(), decimal128);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDouble(double d) {
        this.f75793g.gotDouble(getName(), d);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndArray() {
        setContext(getContext().getParentContext());
        this.f75793g.arrayDone();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndDocument() {
        BsonContextType contextType = getContext().getContextType();
        setContext(getContext().getParentContext());
        this.f75793g.objectDone();
        if (contextType == BsonContextType.SCOPE_DOCUMENT) {
            Object obj = this.f75793g.get();
            BSONCallback bSONCallback = getContext().f75795f;
            this.f75793g = bSONCallback;
            bSONCallback.gotCodeWScope(getContext().f75797h, getContext().f75796g, obj);
        }
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt32(int i) {
        this.f75793g.gotInt(getName(), i);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt64(long j) {
        this.f75793g.gotLong(getName(), j);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScript(String str) {
        this.f75793g.gotCode(getName(), str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScriptWithScope(String str) {
        getContext().f75795f = this.f75793g;
        getContext().f75796g = str;
        getContext().f75797h = getName();
        this.f75793g = this.f75793g.createBSONCallback();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMaxKey() {
        this.f75793g.gotMaxKey(getName());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMinKey() {
        this.f75793g.gotMinKey(getName());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
        this.f75793g.gotNull(getName());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(ObjectId objectId) {
        this.f75793g.gotObjectId(getName(), objectId);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(BsonRegularExpression bsonRegularExpression) {
        this.f75793g.gotRegex(getName(), bsonRegularExpression.getPattern(), bsonRegularExpression.getOptions());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartArray() {
        this.f75793g.arrayStart(getName());
        setContext(new Context(getContext(), BsonContextType.ARRAY));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartDocument() {
        BsonContextType bsonContextType;
        if (getState() == AbstractBsonWriter.State.SCOPE_DOCUMENT) {
            bsonContextType = BsonContextType.SCOPE_DOCUMENT;
        } else {
            bsonContextType = BsonContextType.DOCUMENT;
        }
        if (getContext() != null && bsonContextType != BsonContextType.SCOPE_DOCUMENT) {
            this.f75793g.objectStart(getName());
        } else {
            this.f75793g.objectStart();
        }
        setContext(new Context(getContext(), bsonContextType));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(String str) {
        this.f75793g.gotString(getName(), str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(String str) {
        this.f75793g.gotSymbol(getName(), str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(BsonTimestamp bsonTimestamp) {
        this.f75793g.gotTimestamp(getName(), bsonTimestamp.getTime(), bsonTimestamp.getInc());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
        this.f75793g.gotUndefined(getName());
    }

    @Override // org.bson.BsonWriter
    public void flush() {
    }

    @Override // org.bson.AbstractBsonWriter
    public String getName() {
        if (getContext().getContextType() == BsonContextType.ARRAY) {
            return Integer.toString(Context.m24538i(getContext()));
        }
        return super.getName();
    }

    @Override // org.bson.AbstractBsonWriter
    /* renamed from: r */
    public Context getContext() {
        return (Context) super.getContext();
    }
}