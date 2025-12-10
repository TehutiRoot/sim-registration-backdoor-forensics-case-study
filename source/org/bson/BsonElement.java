package org.bson;

/* loaded from: classes6.dex */
public class BsonElement {

    /* renamed from: a */
    public final String f75768a;

    /* renamed from: b */
    public final BsonValue f75769b;

    public BsonElement(String str, BsonValue bsonValue) {
        this.f75768a = str;
        this.f75769b = bsonValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonElement bsonElement = (BsonElement) obj;
        if (getName() == null ? bsonElement.getName() != null : !getName().equals(bsonElement.getName())) {
            return false;
        }
        if (getValue() == null ? bsonElement.getValue() == null : getValue().equals(bsonElement.getValue())) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.f75768a;
    }

    public BsonValue getValue() {
        return this.f75769b;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getName() != null) {
            i = getName().hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (getValue() != null) {
            i2 = getValue().hashCode();
        }
        return i3 + i2;
    }
}
