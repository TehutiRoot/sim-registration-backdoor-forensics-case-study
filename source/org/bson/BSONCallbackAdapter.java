package org.bson;

import org.bson.AbstractBsonWriter;
import org.bson.p044io.Bits;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BSONCallbackAdapter extends AbstractBsonWriter {

    /* renamed from: g */
    public BSONCallback f75709g;

    /* loaded from: classes6.dex */
    public class Context extends AbstractBsonWriter.Context {

        /* renamed from: e */
        public int f75710e;

        /* renamed from: f */
        public BSONCallback f75711f;

        /* renamed from: g */
        public String f75712g;

        /* renamed from: h */
        public String f75713h;

        public Context(Context context, BsonContextType bsonContextType) {
            super(context, bsonContextType);
        }

        /* renamed from: i */
        public static /* synthetic */ int m24348i(Context context) {
            int i = context.f75710e;
            context.f75710e = i + 1;
            return i;
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public Context getParentContext() {
            return (Context) super.getParentContext();
        }
    }

    public BSONCallbackAdapter(BsonWriterSettings bsonWriterSettings, BSONCallback bSONCallback) {
        super(bsonWriterSettings);
        this.f75709g = bSONCallback;
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBinaryData(BsonBinary bsonBinary) {
        if (bsonBinary.getType() == BsonBinarySubType.UUID_LEGACY.getValue()) {
            this.f75709g.gotUUID(getName(), Bits.readLong(bsonBinary.getData(), 0), Bits.readLong(bsonBinary.getData(), 8));
        } else {
            this.f75709g.gotBinary(getName(), bsonBinary.getType(), bsonBinary.getData());
        }
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean z) {
        this.f75709g.gotBoolean(getName(), z);
        setState(getNextState());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDBPointer(BsonDbPointer bsonDbPointer) {
        this.f75709g.gotDBRef(getName(), bsonDbPointer.getNamespace(), bsonDbPointer.getId());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDateTime(long j) {
        this.f75709g.gotDate(getName(), j);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDecimal128(Decimal128 decimal128) {
        this.f75709g.gotDecimal128(getName(), decimal128);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDouble(double d) {
        this.f75709g.gotDouble(getName(), d);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndArray() {
        setContext(getContext().getParentContext());
        this.f75709g.arrayDone();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndDocument() {
        BsonContextType contextType = getContext().getContextType();
        setContext(getContext().getParentContext());
        this.f75709g.objectDone();
        if (contextType == BsonContextType.SCOPE_DOCUMENT) {
            Object obj = this.f75709g.get();
            BSONCallback bSONCallback = getContext().f75711f;
            this.f75709g = bSONCallback;
            bSONCallback.gotCodeWScope(getContext().f75713h, getContext().f75712g, obj);
        }
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt32(int i) {
        this.f75709g.gotInt(getName(), i);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt64(long j) {
        this.f75709g.gotLong(getName(), j);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScript(String str) {
        this.f75709g.gotCode(getName(), str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScriptWithScope(String str) {
        getContext().f75711f = this.f75709g;
        getContext().f75712g = str;
        getContext().f75713h = getName();
        this.f75709g = this.f75709g.createBSONCallback();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMaxKey() {
        this.f75709g.gotMaxKey(getName());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMinKey() {
        this.f75709g.gotMinKey(getName());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
        this.f75709g.gotNull(getName());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(ObjectId objectId) {
        this.f75709g.gotObjectId(getName(), objectId);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(BsonRegularExpression bsonRegularExpression) {
        this.f75709g.gotRegex(getName(), bsonRegularExpression.getPattern(), bsonRegularExpression.getOptions());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartArray() {
        this.f75709g.arrayStart(getName());
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
            this.f75709g.objectStart(getName());
        } else {
            this.f75709g.objectStart();
        }
        setContext(new Context(getContext(), bsonContextType));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(String str) {
        this.f75709g.gotString(getName(), str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(String str) {
        this.f75709g.gotSymbol(getName(), str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(BsonTimestamp bsonTimestamp) {
        this.f75709g.gotTimestamp(getName(), bsonTimestamp.getTime(), bsonTimestamp.getInc());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
        this.f75709g.gotUndefined(getName());
    }

    @Override // org.bson.BsonWriter
    public void flush() {
    }

    @Override // org.bson.AbstractBsonWriter
    public String getName() {
        if (getContext().getContextType() == BsonContextType.ARRAY) {
            return Integer.toString(Context.m24348i(getContext()));
        }
        return super.getName();
    }

    @Override // org.bson.AbstractBsonWriter
    /* renamed from: r */
    public Context getContext() {
        return (Context) super.getContext();
    }
}
