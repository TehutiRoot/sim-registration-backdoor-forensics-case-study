package org.bson;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;
import org.bson.assertions.Assertions;
import org.bson.internal.UuidHelper;

/* loaded from: classes6.dex */
public class BsonBinary extends BsonValue {

    /* renamed from: a */
    public final byte f75721a;

    /* renamed from: b */
    public final byte[] f75722b;

    public BsonBinary(byte[] bArr) {
        this(BsonBinarySubType.BINARY, bArr);
    }

    /* renamed from: b */
    public static BsonBinary m24344b(BsonBinary bsonBinary) {
        return new BsonBinary(bsonBinary.f75721a, (byte[]) bsonBinary.f75722b.clone());
    }

    public UUID asUuid() {
        if (BsonBinarySubType.isUuid(this.f75721a)) {
            if (this.f75721a == BsonBinarySubType.UUID_STANDARD.getValue()) {
                return UuidHelper.decodeBinaryToUuid((byte[]) this.f75722b.clone(), this.f75721a, UuidRepresentation.STANDARD);
            }
            throw new BsonInvalidOperationException("uuidRepresentation must be set to return the correct UUID.");
        }
        throw new BsonInvalidOperationException("type must be a UUID subtype.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BsonBinary bsonBinary = (BsonBinary) obj;
        if (Arrays.equals(this.f75722b, bsonBinary.f75722b) && this.f75721a == bsonBinary.f75721a) {
            return true;
        }
        return false;
    }

    @Override // org.bson.BsonValue
    public BsonType getBsonType() {
        return BsonType.BINARY;
    }

    public byte[] getData() {
        return this.f75722b;
    }

    public byte getType() {
        return this.f75721a;
    }

    public int hashCode() {
        return (this.f75721a * Ascii.f52695US) + Arrays.hashCode(this.f75722b);
    }

    public String toString() {
        return "BsonBinary{type=" + ((int) this.f75721a) + ", data=" + Arrays.toString(this.f75722b) + '}';
    }

    public BsonBinary(BsonBinarySubType bsonBinarySubType, byte[] bArr) {
        if (bsonBinarySubType == null) {
            throw new IllegalArgumentException("type may not be null");
        }
        if (bArr != null) {
            this.f75721a = bsonBinarySubType.getValue();
            this.f75722b = bArr;
            return;
        }
        throw new IllegalArgumentException("data may not be null");
    }

    public UUID asUuid(UuidRepresentation uuidRepresentation) {
        byte value;
        Assertions.notNull("uuidRepresentation", uuidRepresentation);
        if (uuidRepresentation == UuidRepresentation.STANDARD) {
            value = BsonBinarySubType.UUID_STANDARD.getValue();
        } else {
            value = BsonBinarySubType.UUID_LEGACY.getValue();
        }
        if (this.f75721a == value) {
            return UuidHelper.decodeBinaryToUuid((byte[]) this.f75722b.clone(), this.f75721a, uuidRepresentation);
        }
        throw new BsonInvalidOperationException("uuidRepresentation does not match current uuidRepresentation.");
    }

    public BsonBinary(byte b, byte[] bArr) {
        if (bArr != null) {
            this.f75721a = b;
            this.f75722b = bArr;
            return;
        }
        throw new IllegalArgumentException("data may not be null");
    }

    public BsonBinary(UUID uuid) {
        this(uuid, UuidRepresentation.STANDARD);
    }

    public BsonBinary(UUID uuid, UuidRepresentation uuidRepresentation) {
        byte value;
        if (uuid == null) {
            throw new IllegalArgumentException("uuid may not be null");
        }
        if (uuidRepresentation != null) {
            this.f75722b = UuidHelper.encodeUuidToBinary(uuid, uuidRepresentation);
            if (uuidRepresentation == UuidRepresentation.STANDARD) {
                value = BsonBinarySubType.UUID_STANDARD.getValue();
            } else {
                value = BsonBinarySubType.UUID_LEGACY.getValue();
            }
            this.f75721a = value;
            return;
        }
        throw new IllegalArgumentException("uuidRepresentation may not be null");
    }
}
