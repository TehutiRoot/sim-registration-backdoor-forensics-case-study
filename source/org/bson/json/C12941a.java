package org.bson.json;

import org.bson.BsonDouble;
import org.bson.types.Decimal128;

/* renamed from: org.bson.json.a */
/* loaded from: classes4.dex */
public class C12941a {

    /* renamed from: a */
    public final Object f76067a;

    /* renamed from: b */
    public final JsonTokenType f76068b;

    public C12941a(JsonTokenType jsonTokenType, Object obj) {
        this.f76067a = obj;
        this.f76068b = jsonTokenType;
    }

    /* renamed from: a */
    public JsonTokenType m24078a() {
        return this.f76068b;
    }

    /* renamed from: b */
    public Object m24077b() {
        return this.f76067a;
    }

    /* renamed from: c */
    public Object m24076c(Class cls) {
        try {
            if (Long.class == cls) {
                Object obj = this.f76067a;
                if (obj instanceof Integer) {
                    return cls.cast(Long.valueOf(((Integer) obj).longValue()));
                }
                if (obj instanceof String) {
                    return cls.cast(Long.valueOf((String) obj));
                }
            } else if (Integer.class == cls) {
                Object obj2 = this.f76067a;
                if (obj2 instanceof String) {
                    return cls.cast(Integer.valueOf((String) obj2));
                }
            } else if (Double.class == cls) {
                Object obj3 = this.f76067a;
                if (obj3 instanceof String) {
                    return cls.cast(Double.valueOf((String) obj3));
                }
            } else if (Decimal128.class == cls) {
                Object obj4 = this.f76067a;
                if (obj4 instanceof Integer) {
                    return cls.cast(new Decimal128(((Integer) this.f76067a).intValue()));
                }
                if (obj4 instanceof Long) {
                    return cls.cast(new Decimal128(((Long) this.f76067a).longValue()));
                }
                if (obj4 instanceof Double) {
                    return cls.cast(new BsonDouble(((Double) obj4).doubleValue()).decimal128Value());
                }
                if (obj4 instanceof String) {
                    return cls.cast(Decimal128.parse((String) obj4));
                }
            }
            return cls.cast(this.f76067a);
        } catch (Exception e) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", this.f76067a, cls.getName()), e);
        }
    }
}
