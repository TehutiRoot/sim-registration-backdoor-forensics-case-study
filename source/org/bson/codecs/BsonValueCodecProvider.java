package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import org.bson.BsonArray;
import org.bson.BsonBinary;
import org.bson.BsonBoolean;
import org.bson.BsonDateTime;
import org.bson.BsonDbPointer;
import org.bson.BsonDecimal128;
import org.bson.BsonDocument;
import org.bson.BsonDocumentWrapper;
import org.bson.BsonDouble;
import org.bson.BsonInt32;
import org.bson.BsonInt64;
import org.bson.BsonJavaScript;
import org.bson.BsonJavaScriptWithScope;
import org.bson.BsonMaxKey;
import org.bson.BsonMinKey;
import org.bson.BsonNull;
import org.bson.BsonObjectId;
import org.bson.BsonRegularExpression;
import org.bson.BsonString;
import org.bson.BsonSymbol;
import org.bson.BsonTimestamp;
import org.bson.BsonType;
import org.bson.BsonUndefined;
import org.bson.BsonValue;
import org.bson.RawBsonDocument;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class BsonValueCodecProvider implements CodecProvider {

    /* renamed from: b */
    public static final BsonTypeClassMap f75816b;

    /* renamed from: a */
    public final Map f75817a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BsonType.NULL, BsonNull.class);
        hashMap.put(BsonType.ARRAY, BsonArray.class);
        hashMap.put(BsonType.BINARY, BsonBinary.class);
        hashMap.put(BsonType.BOOLEAN, BsonBoolean.class);
        hashMap.put(BsonType.DATE_TIME, BsonDateTime.class);
        hashMap.put(BsonType.DB_POINTER, BsonDbPointer.class);
        hashMap.put(BsonType.DOCUMENT, BsonDocument.class);
        hashMap.put(BsonType.DOUBLE, BsonDouble.class);
        hashMap.put(BsonType.INT32, BsonInt32.class);
        hashMap.put(BsonType.INT64, BsonInt64.class);
        hashMap.put(BsonType.DECIMAL128, BsonDecimal128.class);
        hashMap.put(BsonType.MAX_KEY, BsonMaxKey.class);
        hashMap.put(BsonType.MIN_KEY, BsonMinKey.class);
        hashMap.put(BsonType.JAVASCRIPT, BsonJavaScript.class);
        hashMap.put(BsonType.JAVASCRIPT_WITH_SCOPE, BsonJavaScriptWithScope.class);
        hashMap.put(BsonType.OBJECT_ID, BsonObjectId.class);
        hashMap.put(BsonType.REGULAR_EXPRESSION, BsonRegularExpression.class);
        hashMap.put(BsonType.STRING, BsonString.class);
        hashMap.put(BsonType.SYMBOL, BsonSymbol.class);
        hashMap.put(BsonType.TIMESTAMP, BsonTimestamp.class);
        hashMap.put(BsonType.UNDEFINED, BsonUndefined.class);
        f75816b = new BsonTypeClassMap(hashMap);
    }

    public BsonValueCodecProvider() {
        m24292b();
    }

    public static BsonTypeClassMap getBsonTypeClassMap() {
        return f75816b;
    }

    public static Class<? extends BsonValue> getClassForBsonType(BsonType bsonType) {
        return f75816b.get(bsonType);
    }

    /* renamed from: a */
    public final void m24293a(Codec codec) {
        this.f75817a.put(codec.getEncoderClass(), codec);
    }

    /* renamed from: b */
    public final void m24292b() {
        m24293a(new BsonNullCodec());
        m24293a(new BsonBinaryCodec());
        m24293a(new BsonBooleanCodec());
        m24293a(new BsonDateTimeCodec());
        m24293a(new BsonDBPointerCodec());
        m24293a(new BsonDoubleCodec());
        m24293a(new BsonInt32Codec());
        m24293a(new BsonInt64Codec());
        m24293a(new BsonDecimal128Codec());
        m24293a(new BsonMinKeyCodec());
        m24293a(new BsonMaxKeyCodec());
        m24293a(new BsonJavaScriptCodec());
        m24293a(new BsonObjectIdCodec());
        m24293a(new BsonRegularExpressionCodec());
        m24293a(new BsonStringCodec());
        m24293a(new BsonSymbolCodec());
        m24293a(new BsonTimestampCodec());
        m24293a(new BsonUndefinedCodec());
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        if (this.f75817a.containsKey(cls)) {
            return (Codec) this.f75817a.get(cls);
        }
        if (cls == BsonJavaScriptWithScope.class) {
            return new BsonJavaScriptWithScopeCodec(codecRegistry.get(BsonDocument.class));
        }
        if (cls == BsonValue.class) {
            return new BsonValueCodec(codecRegistry);
        }
        if (cls == BsonDocumentWrapper.class) {
            return new BsonDocumentWrapperCodec(codecRegistry.get(BsonDocument.class));
        }
        if (cls == RawBsonDocument.class) {
            return new RawBsonDocumentCodec();
        }
        if (BsonDocument.class.isAssignableFrom(cls)) {
            return new BsonDocumentCodec(codecRegistry);
        }
        if (BsonArray.class.isAssignableFrom(cls)) {
            return new BsonArrayCodec(codecRegistry);
        }
        return null;
    }
}
