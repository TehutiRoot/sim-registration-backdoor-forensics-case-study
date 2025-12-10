package org.bson;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import org.bson.assertions.Assertions;

/* loaded from: classes6.dex */
public final class BsonRegularExpression extends BsonValue {

    /* renamed from: a */
    public final String f75776a;

    /* renamed from: b */
    public final String f75777b;

    public BsonRegularExpression(String str, String str2) {
        this.f75776a = (String) Assertions.notNull("pattern", str);
        this.f75777b = str2 == null ? "" : m24322b(str2);
    }

    /* renamed from: b */
    public final String m24322b(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BsonRegularExpression.class != obj.getClass()) {
            return false;
        }
        BsonRegularExpression bsonRegularExpression = (BsonRegularExpression) obj;
        if (this.f75777b.equals(bsonRegularExpression.f75777b) && this.f75776a.equals(bsonRegularExpression.f75776a)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.REGULAR_EXPRESSION;
    }

    public String getOptions() {
        return this.f75777b;
    }

    public String getPattern() {
        return this.f75776a;
    }

    public int hashCode() {
        return (this.f75776a.hashCode() * 31) + this.f75777b.hashCode();
    }

    public String toString() {
        return "BsonRegularExpression{pattern='" + this.f75776a + CoreConstants.SINGLE_QUOTE_CHAR + ", options='" + this.f75777b + CoreConstants.SINGLE_QUOTE_CHAR + '}';
    }

    public BsonRegularExpression(String str) {
        this(str, null);
    }
}
