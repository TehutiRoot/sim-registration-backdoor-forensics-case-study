package org.bson;

import org.bson.AbstractBsonWriter;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BsonDocumentWriter extends AbstractBsonWriter {

    /* renamed from: g */
    public final BsonDocument f75763g;

    /* renamed from: org.bson.BsonDocumentWriter$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12904a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75764a;

        static {
            int[] iArr = new int[AbstractBsonWriter.State.values().length];
            f75764a = iArr;
            try {
                iArr[AbstractBsonWriter.State.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75764a[AbstractBsonWriter.State.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75764a[AbstractBsonWriter.State.SCOPE_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BsonDocumentWriter(BsonDocument bsonDocument) {
        super(new BsonWriterSettings());
        this.f75763g = bsonDocument;
        setContext(new C12905b());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBinaryData(BsonBinary bsonBinary) {
        m24326r(bsonBinary);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean z) {
        m24326r(BsonBoolean.valueOf(z));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDBPointer(BsonDbPointer bsonDbPointer) {
        m24326r(bsonDbPointer);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDateTime(long j) {
        m24326r(new BsonDateTime(j));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDecimal128(Decimal128 decimal128) {
        m24326r(new BsonDecimal128(decimal128));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDouble(double d) {
        m24326r(new BsonDouble(d));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndArray() {
        BsonValue bsonValue = getContext().f75765e;
        setContext(getContext().getParentContext());
        m24326r(bsonValue);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndDocument() {
        BsonValue bsonValue = getContext().f75765e;
        setContext(getContext().getParentContext());
        if (getContext().getContextType() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
            setContext(getContext().getParentContext());
            m24326r(new BsonJavaScriptWithScope(((BsonString) getContext().f75765e).getValue(), (BsonDocument) bsonValue));
        } else if (getContext().getContextType() != BsonContextType.TOP_LEVEL) {
            m24326r(bsonValue);
        }
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt32(int i) {
        m24326r(new BsonInt32(i));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt64(long j) {
        m24326r(new BsonInt64(j));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScript(String str) {
        m24326r(new BsonJavaScript(str));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScriptWithScope(String str) {
        setContext(new C12905b(new BsonString(str), BsonContextType.JAVASCRIPT_WITH_SCOPE, getContext()));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMaxKey() {
        m24326r(new BsonMaxKey());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMinKey() {
        m24326r(new BsonMinKey());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
        m24326r(BsonNull.VALUE);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(ObjectId objectId) {
        m24326r(new BsonObjectId(objectId));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(BsonRegularExpression bsonRegularExpression) {
        m24326r(bsonRegularExpression);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartArray() {
        setContext(new C12905b(new BsonArray(), BsonContextType.ARRAY, getContext()));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartDocument() {
        int i = C12904a.f75764a[getState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    setContext(new C12905b(new BsonDocument(), BsonContextType.SCOPE_DOCUMENT, getContext()));
                    return;
                }
                throw new BsonInvalidOperationException("Unexpected state " + getState());
            }
            setContext(new C12905b(new BsonDocument(), BsonContextType.DOCUMENT, getContext()));
            return;
        }
        setContext(new C12905b(this.f75763g, BsonContextType.DOCUMENT, getContext()));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(String str) {
        m24326r(new BsonString(str));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(String str) {
        m24326r(new BsonSymbol(str));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(BsonTimestamp bsonTimestamp) {
        m24326r(bsonTimestamp);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
        m24326r(new BsonUndefined());
    }

    @Override // org.bson.BsonWriter
    public void flush() {
    }

    public BsonDocument getDocument() {
        return this.f75763g;
    }

    /* renamed from: r */
    public final void m24326r(BsonValue bsonValue) {
        getContext().m24324d(bsonValue);
    }

    @Override // org.bson.AbstractBsonWriter
    public C12905b getContext() {
        return (C12905b) super.getContext();
    }

    /* renamed from: org.bson.BsonDocumentWriter$b */
    /* loaded from: classes6.dex */
    public class C12905b extends AbstractBsonWriter.Context {

        /* renamed from: e */
        public BsonValue f75765e;

        public C12905b(BsonValue bsonValue, BsonContextType bsonContextType, C12905b c12905b) {
            super(c12905b, bsonContextType);
            this.f75765e = bsonValue;
        }

        /* renamed from: d */
        public void m24324d(BsonValue bsonValue) {
            BsonValue bsonValue2 = this.f75765e;
            if (bsonValue2 instanceof BsonArray) {
                ((BsonArray) bsonValue2).add(bsonValue);
            } else {
                ((BsonDocument) bsonValue2).put(BsonDocumentWriter.this.getName(), bsonValue);
            }
        }

        public C12905b() {
            super(null, BsonContextType.TOP_LEVEL);
        }
    }
}
