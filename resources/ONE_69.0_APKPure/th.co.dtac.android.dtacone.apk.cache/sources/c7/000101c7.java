package org.bson.codecs;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.BsonDbPointer;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.BsonType;
import org.bson.BsonUndefined;
import org.bson.Document;
import org.bson.types.Binary;
import org.bson.types.Code;
import org.bson.types.CodeWithScope;
import org.bson.types.Decimal128;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;
import org.bson.types.Symbol;

/* loaded from: classes6.dex */
public class BsonTypeClassMap {

    /* renamed from: a */
    public final Map f75896a;

    public BsonTypeClassMap(Map<BsonType, Class<?>> map) {
        HashMap hashMap = new HashMap();
        this.f75896a = hashMap;
        m24485a();
        hashMap.putAll(map);
    }

    /* renamed from: a */
    public final void m24485a() {
        this.f75896a.put(BsonType.ARRAY, List.class);
        this.f75896a.put(BsonType.BINARY, Binary.class);
        this.f75896a.put(BsonType.BOOLEAN, Boolean.class);
        this.f75896a.put(BsonType.DATE_TIME, Date.class);
        this.f75896a.put(BsonType.DB_POINTER, BsonDbPointer.class);
        this.f75896a.put(BsonType.DOCUMENT, Document.class);
        this.f75896a.put(BsonType.DOUBLE, Double.class);
        this.f75896a.put(BsonType.INT32, Integer.class);
        this.f75896a.put(BsonType.INT64, Long.class);
        this.f75896a.put(BsonType.DECIMAL128, Decimal128.class);
        this.f75896a.put(BsonType.MAX_KEY, MaxKey.class);
        this.f75896a.put(BsonType.MIN_KEY, MinKey.class);
        this.f75896a.put(BsonType.JAVASCRIPT, Code.class);
        this.f75896a.put(BsonType.JAVASCRIPT_WITH_SCOPE, CodeWithScope.class);
        this.f75896a.put(BsonType.OBJECT_ID, ObjectId.class);
        this.f75896a.put(BsonType.REGULAR_EXPRESSION, BsonRegularExpression.class);
        this.f75896a.put(BsonType.STRING, String.class);
        this.f75896a.put(BsonType.SYMBOL, Symbol.class);
        this.f75896a.put(BsonType.TIMESTAMP, BsonTimestamp.class);
        this.f75896a.put(BsonType.UNDEFINED, BsonUndefined.class);
    }

    /* renamed from: b */
    public Set m24484b() {
        return this.f75896a.keySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f75896a.equals(((BsonTypeClassMap) obj).f75896a)) {
            return true;
        }
        return false;
    }

    public Class<?> get(BsonType bsonType) {
        return (Class) this.f75896a.get(bsonType);
    }

    public int hashCode() {
        return this.f75896a.hashCode();
    }

    public BsonTypeClassMap() {
        this(Collections.emptyMap());
    }
}