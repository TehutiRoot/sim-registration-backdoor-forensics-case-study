package org.bson.json;

import java.io.Writer;
import org.bson.AbstractBsonWriter;
import org.bson.BsonBinary;
import org.bson.BsonContextType;
import org.bson.BsonDbPointer;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes4.dex */
public class JsonWriter extends AbstractBsonWriter {

    /* renamed from: g */
    public final JsonWriterSettings f75966g;

    /* renamed from: h */
    public final StrictCharacterStreamJsonWriter f75967h;

    /* loaded from: classes4.dex */
    public class Context extends AbstractBsonWriter.Context {
        @Deprecated
        public Context(JsonWriter jsonWriter, Context context, BsonContextType bsonContextType, String str) {
            this(context, bsonContextType);
        }

        public Context(Context context, BsonContextType bsonContextType) {
            super(context, bsonContextType);
        }

        @Override // org.bson.AbstractBsonWriter.Context
        public Context getParentContext() {
            return (Context) super.getParentContext();
        }
    }

    /* renamed from: org.bson.json.JsonWriter$a */
    /* loaded from: classes4.dex */
    public class C12936a implements Converter {
        public C12936a() {
        }

        @Override // org.bson.json.Converter
        /* renamed from: a */
        public void convert(BsonDbPointer bsonDbPointer, StrictJsonWriter strictJsonWriter) {
            strictJsonWriter.writeStartObject();
            strictJsonWriter.writeStartObject("$dbPointer");
            strictJsonWriter.writeString("$ref", bsonDbPointer.getNamespace());
            strictJsonWriter.writeName("$id");
            JsonWriter.this.doWriteObjectId(bsonDbPointer.getId());
            strictJsonWriter.writeEndObject();
            strictJsonWriter.writeEndObject();
        }
    }

    /* renamed from: org.bson.json.JsonWriter$b */
    /* loaded from: classes4.dex */
    public class C12937b implements Converter {
        public C12937b() {
        }

        @Override // org.bson.json.Converter
        /* renamed from: a */
        public void convert(BsonDbPointer bsonDbPointer, StrictJsonWriter strictJsonWriter) {
            strictJsonWriter.writeStartObject();
            strictJsonWriter.writeString("$ref", bsonDbPointer.getNamespace());
            strictJsonWriter.writeName("$id");
            JsonWriter.this.doWriteObjectId(bsonDbPointer.getId());
            strictJsonWriter.writeEndObject();
        }
    }

    public JsonWriter(Writer writer) {
        this(writer, new JsonWriterSettings());
    }

    @Override // org.bson.AbstractBsonWriter
    public boolean abortPipe() {
        return this.f75967h.isTruncated();
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBinaryData(BsonBinary bsonBinary) {
        this.f75966g.getBinaryConverter().convert(bsonBinary, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteBoolean(boolean z) {
        this.f75966g.getBooleanConverter().convert(Boolean.valueOf(z), this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDBPointer(BsonDbPointer bsonDbPointer) {
        if (this.f75966g.getOutputMode() == JsonMode.EXTENDED) {
            new C12936a().convert(bsonDbPointer, this.f75967h);
        } else {
            new C12937b().convert(bsonDbPointer, this.f75967h);
        }
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDateTime(long j) {
        this.f75966g.getDateTimeConverter().convert(Long.valueOf(j), this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDecimal128(Decimal128 decimal128) {
        this.f75966g.getDecimal128Converter().convert(decimal128, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteDouble(double d) {
        this.f75966g.getDoubleConverter().convert(Double.valueOf(d), this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndArray() {
        this.f75967h.writeEndArray();
        setContext(getContext().getParentContext());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteEndDocument() {
        this.f75967h.writeEndObject();
        if (getContext().getContextType() == BsonContextType.SCOPE_DOCUMENT) {
            setContext(getContext().getParentContext());
            writeEndDocument();
            return;
        }
        setContext(getContext().getParentContext());
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt32(int i) {
        this.f75966g.getInt32Converter().convert(Integer.valueOf(i), this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteInt64(long j) {
        this.f75966g.getInt64Converter().convert(Long.valueOf(j), this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScript(String str) {
        this.f75966g.getJavaScriptConverter().convert(str, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteJavaScriptWithScope(String str) {
        writeStartDocument();
        writeString("$code", str);
        writeName("$scope");
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMaxKey() {
        this.f75966g.getMaxKeyConverter().convert(null, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteMinKey() {
        this.f75966g.getMinKeyConverter().convert(null, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteName(String str) {
        this.f75967h.writeName(str);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteNull() {
        this.f75966g.getNullConverter().convert(null, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteObjectId(ObjectId objectId) {
        this.f75966g.getObjectIdConverter().convert(objectId, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteRegularExpression(BsonRegularExpression bsonRegularExpression) {
        this.f75966g.getRegularExpressionConverter().convert(bsonRegularExpression, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartArray() {
        this.f75967h.writeStartArray();
        setContext(new Context(getContext(), BsonContextType.ARRAY));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteStartDocument() {
        BsonContextType bsonContextType;
        this.f75967h.writeStartObject();
        if (getState() == AbstractBsonWriter.State.SCOPE_DOCUMENT) {
            bsonContextType = BsonContextType.SCOPE_DOCUMENT;
        } else {
            bsonContextType = BsonContextType.DOCUMENT;
        }
        setContext(new Context(getContext(), bsonContextType));
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteString(String str) {
        this.f75966g.getStringConverter().convert(str, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteSymbol(String str) {
        this.f75966g.getSymbolConverter().convert(str, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteTimestamp(BsonTimestamp bsonTimestamp) {
        this.f75966g.getTimestampConverter().convert(bsonTimestamp, this.f75967h);
    }

    @Override // org.bson.AbstractBsonWriter
    public void doWriteUndefined() {
        this.f75966g.getUndefinedConverter().convert(null, this.f75967h);
    }

    @Override // org.bson.BsonWriter
    public void flush() {
        this.f75967h.m24095b();
    }

    public Writer getWriter() {
        return this.f75967h.m24094c();
    }

    public boolean isTruncated() {
        return this.f75967h.isTruncated();
    }

    public JsonWriter(Writer writer, JsonWriterSettings jsonWriterSettings) {
        super(jsonWriterSettings);
        this.f75966g = jsonWriterSettings;
        setContext(new Context(null, BsonContextType.TOP_LEVEL));
        this.f75967h = new StrictCharacterStreamJsonWriter(writer, StrictCharacterStreamJsonWriterSettings.builder().indent(jsonWriterSettings.isIndent()).newLineCharacters(jsonWriterSettings.getNewLineCharacters()).indentCharacters(jsonWriterSettings.getIndentCharacters()).maxLength(jsonWriterSettings.getMaxLength()).build());
    }

    @Override // org.bson.AbstractBsonWriter
    public Context getContext() {
        return (Context) super.getContext();
    }
}
