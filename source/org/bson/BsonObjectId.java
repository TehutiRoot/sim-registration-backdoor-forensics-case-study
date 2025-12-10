package org.bson;

import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class BsonObjectId extends BsonValue implements Comparable<BsonObjectId> {

    /* renamed from: a */
    public final ObjectId f75775a;

    public BsonObjectId() {
        this(new ObjectId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f75775a.equals(((BsonObjectId) obj).f75775a)) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.OBJECT_ID;
    }

    public ObjectId getValue() {
        return this.f75775a;
    }

    public int hashCode() {
        return this.f75775a.hashCode();
    }

    public String toString() {
        return "BsonObjectId{value=" + this.f75775a.toHexString() + '}';
    }

    public BsonObjectId(ObjectId objectId) {
        if (objectId != null) {
            this.f75775a = objectId;
            return;
        }
        throw new IllegalArgumentException("value may not be null");
    }

    @Override // java.lang.Comparable
    public int compareTo(BsonObjectId bsonObjectId) {
        return this.f75775a.compareTo(bsonObjectId.f75775a);
    }
}
