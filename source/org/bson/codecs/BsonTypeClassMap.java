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
    public final Map f75812a;

    public BsonTypeClassMap(Map<BsonType, Class<?>> map) {
        HashMap hashMap = new HashMap();
        this.f75812a = hashMap;
        m24295a();
        hashMap.putAll(map);
    }

    /* renamed from: a */
    public final void m24295a() {
        this.f75812a.put(BsonType.ARRAY, List.class);
        this.f75812a.put(BsonType.BINARY, Binary.class);
        this.f75812a.put(BsonType.BOOLEAN, Boolean.class);
        this.f75812a.put(BsonType.DATE_TIME, Date.class);
        this.f75812a.put(BsonType.DB_POINTER, BsonDbPointer.class);
        this.f75812a.put(BsonType.DOCUMENT, Document.class);
        this.f75812a.put(BsonType.DOUBLE, Double.class);
        this.f75812a.put(BsonType.INT32, Integer.class);
        this.f75812a.put(BsonType.INT64, Long.class);
        this.f75812a.put(BsonType.DECIMAL128, Decimal128.class);
        this.f75812a.put(BsonType.MAX_KEY, MaxKey.class);
        this.f75812a.put(BsonType.MIN_KEY, MinKey.class);
        this.f75812a.put(BsonType.JAVASCRIPT, Code.class);
        this.f75812a.put(BsonType.JAVASCRIPT_WITH_SCOPE, CodeWithScope.class);
        this.f75812a.put(BsonType.OBJECT_ID, ObjectId.class);
        this.f75812a.put(BsonType.REGULAR_EXPRESSION, BsonRegularExpression.class);
        this.f75812a.put(BsonType.STRING, String.class);
        this.f75812a.put(BsonType.SYMBOL, Symbol.class);
        this.f75812a.put(BsonType.TIMESTAMP, BsonTimestamp.class);
        this.f75812a.put(BsonType.UNDEFINED, BsonUndefined.class);
    }

    /* renamed from: b */
    public Set m24294b() {
        return this.f75812a.keySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f75812a.equals(((BsonTypeClassMap) obj).f75812a)) {
            return true;
        }
        return false;
    }

    public Class<?> get(BsonType bsonType) {
        return (Class) this.f75812a.get(bsonType);
    }

    public int hashCode() {
        return this.f75812a.hashCode();
    }

    public BsonTypeClassMap() {
        this(Collections.emptyMap());
    }
}
