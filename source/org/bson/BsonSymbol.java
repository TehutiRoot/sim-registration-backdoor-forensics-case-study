package org.bson;

/* loaded from: classes6.dex */
public class BsonSymbol extends BsonValue {

    /* renamed from: a */
    public final String f75779a;

    public BsonSymbol(String str) {
        if (str != null) {
            this.f75779a = str;
            return;
        }
        throw new IllegalArgumentException("Value can not be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f75779a.equals(((BsonSymbol) obj).f75779a)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.SYMBOL;
    }

    public String getSymbol() {
        return this.f75779a;
    }

    public int hashCode() {
        return this.f75779a.hashCode();
    }

    public String toString() {
        return this.f75779a;
    }
}
