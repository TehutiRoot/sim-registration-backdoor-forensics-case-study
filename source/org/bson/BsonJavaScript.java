package org.bson;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes6.dex */
public class BsonJavaScript extends BsonValue {

    /* renamed from: a */
    public final String f75772a;

    public BsonJavaScript(String str) {
        this.f75772a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f75772a.equals(((BsonJavaScript) obj).f75772a)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.JAVASCRIPT;
    }

    public String getCode() {
        return this.f75772a;
    }

    public int hashCode() {
        return this.f75772a.hashCode();
    }

    public String toString() {
        return "BsonJavaScript{code='" + this.f75772a + CoreConstants.SINGLE_QUOTE_CHAR + '}';
    }
}
