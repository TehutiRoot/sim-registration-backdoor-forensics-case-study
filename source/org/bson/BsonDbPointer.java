package org.bson;

import ch.qos.logback.core.CoreConstants;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BsonDbPointer extends BsonValue {

    /* renamed from: a */
    public final String f75746a;

    /* renamed from: b */
    public final ObjectId f75747b;

    public BsonDbPointer(String str, ObjectId objectId) {
        if (str != null) {
            if (objectId != null) {
                this.f75746a = str;
                this.f75747b = objectId;
                return;
            }
            throw new IllegalArgumentException("id can not be null");
        }
        throw new IllegalArgumentException("namespace can not be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonDbPointer bsonDbPointer = (BsonDbPointer) obj;
        if (this.f75747b.equals(bsonDbPointer.f75747b) && this.f75746a.equals(bsonDbPointer.f75746a)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.DB_POINTER;
    }

    public ObjectId getId() {
        return this.f75747b;
    }

    public String getNamespace() {
        return this.f75746a;
    }

    public int hashCode() {
        return (this.f75746a.hashCode() * 31) + this.f75747b.hashCode();
    }

    public String toString() {
        return "BsonDbPointer{namespace='" + this.f75746a + CoreConstants.SINGLE_QUOTE_CHAR + ", id=" + this.f75747b + '}';
    }
}
