package org.bson;

/* loaded from: classes6.dex */
public class BsonJavaScriptWithScope extends BsonValue {

    /* renamed from: a */
    public final String f75773a;

    /* renamed from: b */
    public final BsonDocument f75774b;

    public BsonJavaScriptWithScope(String str, BsonDocument bsonDocument) {
        if (str != null) {
            if (bsonDocument != null) {
                this.f75773a = str;
                this.f75774b = bsonDocument;
                return;
            }
            throw new IllegalArgumentException("scope can not be null");
        }
        throw new IllegalArgumentException("code can not be null");
    }

    /* renamed from: b */
    public static BsonJavaScriptWithScope m24323b(BsonJavaScriptWithScope bsonJavaScriptWithScope) {
        return new BsonJavaScriptWithScope(bsonJavaScriptWithScope.f75773a, bsonJavaScriptWithScope.f75774b.clone());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonJavaScriptWithScope bsonJavaScriptWithScope = (BsonJavaScriptWithScope) obj;
        if (this.f75773a.equals(bsonJavaScriptWithScope.f75773a) && this.f75774b.equals(bsonJavaScriptWithScope.f75774b)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.JAVASCRIPT_WITH_SCOPE;
    }

    public String getCode() {
        return this.f75773a;
    }

    public BsonDocument getScope() {
        return this.f75774b;
    }

    public int hashCode() {
        return (this.f75773a.hashCode() * 31) + this.f75774b.hashCode();
    }

    public String toString() {
        return "BsonJavaScriptWithScope{code=" + getCode() + "scope=" + this.f75774b + '}';
    }
}
