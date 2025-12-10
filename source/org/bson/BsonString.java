package org.bson;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes6.dex */
public class BsonString extends BsonValue implements Comparable<BsonString> {

    /* renamed from: a */
    public final String f75778a;

    public BsonString(String str) {
        if (str != null) {
            this.f75778a = str;
            return;
        }
        throw new IllegalArgumentException("Value can not be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f75778a.equals(((BsonString) obj).f75778a)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.STRING;
    }

    public String getValue() {
        return this.f75778a;
    }

    public int hashCode() {
        return this.f75778a.hashCode();
    }

    public String toString() {
        return "BsonString{value='" + this.f75778a + CoreConstants.SINGLE_QUOTE_CHAR + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonString bsonString) {
        return this.f75778a.compareTo(bsonString.f75778a);
    }
}
