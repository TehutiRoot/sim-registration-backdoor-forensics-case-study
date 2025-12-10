package org.bson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.AbstractBsonReader;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BsonDocumentReader extends AbstractBsonReader {

    /* renamed from: f */
    public BsonValue f75750f;

    /* renamed from: g */
    public Mark f75751g;

    /* loaded from: classes6.dex */
    public class Mark extends AbstractBsonReader.Mark {

        /* renamed from: g */
        public final BsonValue f75755g;

        /* renamed from: h */
        public final Context f75756h;

        public Mark() {
            super();
            this.f75755g = BsonDocumentReader.this.f75750f;
            Context context = BsonDocumentReader.this.getContext();
            this.f75756h = context;
            context.mark();
        }

        @Override // org.bson.AbstractBsonReader.Mark, org.bson.BsonReaderMark
        public void reset() {
            super.reset();
            BsonDocumentReader.this.f75750f = this.f75755g;
            BsonDocumentReader.this.setContext(this.f75756h);
            this.f75756h.reset();
        }
    }

    /* renamed from: org.bson.BsonDocumentReader$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12902a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75758a;

        static {
            int[] iArr = new int[BsonContextType.values().length];
            f75758a = iArr;
            try {
                iArr[BsonContextType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75758a[BsonContextType.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75758a[BsonContextType.TOP_LEVEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: org.bson.BsonDocumentReader$b */
    /* loaded from: classes6.dex */
    public static class C12903b implements Iterator {

        /* renamed from: a */
        public Iterator f75759a;

        /* renamed from: b */
        public List f75760b = new ArrayList();

        /* renamed from: c */
        public int f75761c = 0;

        /* renamed from: d */
        public boolean f75762d = false;

        public C12903b(Iterator it) {
            this.f75759a = it;
        }

        /* renamed from: a */
        public void m24328a() {
            this.f75762d = true;
        }

        /* renamed from: b */
        public void m24327b() {
            this.f75761c = 0;
            this.f75762d = false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f75759a.hasNext() && this.f75761c >= this.f75760b.size()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object next;
            if (this.f75761c < this.f75760b.size()) {
                next = this.f75760b.get(this.f75761c);
                if (this.f75762d) {
                    this.f75761c++;
                } else {
                    this.f75760b.remove(0);
                }
            } else {
                next = this.f75759a.next();
                if (this.f75762d) {
                    this.f75760b.add(next);
                    this.f75761c++;
                }
            }
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public BsonDocumentReader(BsonDocument bsonDocument) {
        setContext(new Context((Context) null, BsonContextType.TOP_LEVEL, bsonDocument));
        this.f75750f = bsonDocument;
    }

    @Override // org.bson.AbstractBsonReader
    public int doPeekBinarySize() {
        return this.f75750f.asBinary().getData().length;
    }

    @Override // org.bson.AbstractBsonReader
    public byte doPeekBinarySubType() {
        return this.f75750f.asBinary().getType();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonBinary doReadBinaryData() {
        return this.f75750f.asBinary();
    }

    @Override // org.bson.AbstractBsonReader
    public boolean doReadBoolean() {
        return this.f75750f.asBoolean().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonDbPointer doReadDBPointer() {
        return this.f75750f.asDBPointer();
    }

    @Override // org.bson.AbstractBsonReader
    public long doReadDateTime() {
        return this.f75750f.asDateTime().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public Decimal128 doReadDecimal128() {
        return this.f75750f.asDecimal128().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public double doReadDouble() {
        return this.f75750f.asDouble().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadEndArray() {
        setContext(getContext().getParentContext());
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadEndDocument() {
        setContext(getContext().getParentContext());
        int i = C12902a.f75758a[getContext().getContextType().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                setState(AbstractBsonReader.State.DONE);
                return;
            }
            throw new BSONException("Unexpected ContextType.");
        }
        setState(AbstractBsonReader.State.TYPE);
    }

    @Override // org.bson.AbstractBsonReader
    public int doReadInt32() {
        return this.f75750f.asInt32().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public long doReadInt64() {
        return this.f75750f.asInt64().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadJavaScript() {
        return this.f75750f.asJavaScript().getCode();
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadJavaScriptWithScope() {
        return this.f75750f.asJavaScriptWithScope().getCode();
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
        return this.f75750f.asObjectId().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonRegularExpression doReadRegularExpression() {
        return this.f75750f.asRegularExpression();
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadStartArray() {
        setContext(new Context(getContext(), BsonContextType.ARRAY, this.f75750f.asArray()));
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadStartDocument() {
        BsonDocument asDocument;
        if (this.f75750f.getBsonType() == BsonType.JAVASCRIPT_WITH_SCOPE) {
            asDocument = this.f75750f.asJavaScriptWithScope().getScope();
        } else {
            asDocument = this.f75750f.asDocument();
        }
        setContext(new Context(getContext(), BsonContextType.DOCUMENT, asDocument));
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadString() {
        return this.f75750f.asString().getValue();
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadSymbol() {
        return this.f75750f.asSymbol().getSymbol();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonTimestamp doReadTimestamp() {
        return this.f75750f.asTimestamp();
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadUndefined() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doSkipName() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doSkipValue() {
    }

    @Override // org.bson.BsonReader
    public BsonReaderMark getMark() {
        return new Mark();
    }

    @Override // org.bson.BsonReader
    @Deprecated
    public void mark() {
        if (this.f75751g == null) {
            this.f75751g = new Mark();
            return;
        }
        throw new BSONException("A mark already exists; it needs to be reset before creating a new one");
    }

    @Override // org.bson.AbstractBsonReader, org.bson.BsonReader
    public BsonType readBsonType() {
        if (getState() != AbstractBsonReader.State.INITIAL && getState() != AbstractBsonReader.State.SCOPE_DOCUMENT) {
            AbstractBsonReader.State state = getState();
            AbstractBsonReader.State state2 = AbstractBsonReader.State.TYPE;
            if (state != state2) {
                throwInvalidState("ReadBSONType", state2);
            }
            int i = C12902a.f75758a[getContext().getContextType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    Map.Entry<String, BsonValue> nextElement = getContext().getNextElement();
                    if (nextElement == null) {
                        setState(AbstractBsonReader.State.END_OF_DOCUMENT);
                        return BsonType.END_OF_DOCUMENT;
                    }
                    setCurrentName(nextElement.getKey());
                    this.f75750f = nextElement.getValue();
                    setState(AbstractBsonReader.State.NAME);
                } else {
                    throw new BSONException("Invalid ContextType.");
                }
            } else {
                BsonValue nextValue = getContext().getNextValue();
                this.f75750f = nextValue;
                if (nextValue == null) {
                    setState(AbstractBsonReader.State.END_OF_ARRAY);
                    return BsonType.END_OF_DOCUMENT;
                }
                setState(AbstractBsonReader.State.VALUE);
            }
            setCurrentBsonType(this.f75750f.getBsonType());
            return getCurrentBsonType();
        }
        setCurrentBsonType(BsonType.DOCUMENT);
        setState(AbstractBsonReader.State.VALUE);
        return getCurrentBsonType();
    }

    @Override // org.bson.BsonReader
    @Deprecated
    public void reset() {
        Mark mark = this.f75751g;
        if (mark != null) {
            mark.reset();
            this.f75751g = null;
            return;
        }
        throw new BSONException("trying to reset a mark before creating it");
    }

    @Override // org.bson.AbstractBsonReader
    public Context getContext() {
        return (Context) super.getContext();
    }

    /* loaded from: classes6.dex */
    public class Context extends AbstractBsonReader.Context {

        /* renamed from: d */
        public C12903b f75752d;

        /* renamed from: e */
        public C12903b f75753e;

        public Context(Context context, BsonContextType bsonContextType, BsonArray bsonArray) {
            super(context, bsonContextType);
            this.f75753e = new C12903b(bsonArray.iterator());
        }

        public Map.Entry<String, BsonValue> getNextElement() {
            if (this.f75752d.hasNext()) {
                return (Map.Entry) this.f75752d.next();
            }
            return null;
        }

        public BsonValue getNextValue() {
            if (this.f75753e.hasNext()) {
                return (BsonValue) this.f75753e.next();
            }
            return null;
        }

        public void mark() {
            C12903b c12903b = this.f75752d;
            if (c12903b != null) {
                c12903b.m24328a();
            } else {
                this.f75753e.m24328a();
            }
            if (getParentContext() != null) {
                ((Context) getParentContext()).mark();
            }
        }

        public void reset() {
            C12903b c12903b = this.f75752d;
            if (c12903b != null) {
                c12903b.m24327b();
            } else {
                this.f75753e.m24327b();
            }
            if (getParentContext() != null) {
                ((Context) getParentContext()).reset();
            }
        }

        public Context(Context context, BsonContextType bsonContextType, BsonDocument bsonDocument) {
            super(context, bsonContextType);
            this.f75752d = new C12903b(bsonDocument.entrySet().iterator());
        }
    }
}
