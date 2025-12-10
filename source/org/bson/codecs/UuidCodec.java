package org.bson.codecs;

import java.util.UUID;
import org.bson.BSONException;
import org.bson.BsonBinary;
import org.bson.BsonBinarySubType;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.internal.UuidHelper;

/* loaded from: classes6.dex */
public class UuidCodec implements Codec<UUID> {

    /* renamed from: a */
    public final UuidRepresentation f75851a;

    public UuidCodec(UuidRepresentation uuidRepresentation) {
        Assertions.notNull("uuidRepresentation", uuidRepresentation);
        this.f75851a = uuidRepresentation;
    }

    @Override // org.bson.codecs.Encoder
    public Class<UUID> getEncoderClass() {
        return UUID.class;
    }

    public UuidRepresentation getUuidRepresentation() {
        return this.f75851a;
    }

    public String toString() {
        return "UuidCodec{uuidRepresentation=" + this.f75851a + '}';
    }

    @Override // org.bson.codecs.Decoder
    public UUID decode(BsonReader bsonReader, DecoderContext decoderContext) {
        byte peekBinarySubType = bsonReader.peekBinarySubType();
        if (peekBinarySubType != BsonBinarySubType.UUID_LEGACY.getValue() && peekBinarySubType != BsonBinarySubType.UUID_STANDARD.getValue()) {
            throw new BSONException("Unexpected BsonBinarySubType");
        }
        return UuidHelper.decodeBinaryToUuid(bsonReader.readBinaryData().getData(), peekBinarySubType, this.f75851a);
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, UUID uuid, EncoderContext encoderContext) {
        UuidRepresentation uuidRepresentation = this.f75851a;
        if (uuidRepresentation != UuidRepresentation.UNSPECIFIED) {
            byte[] encodeUuidToBinary = UuidHelper.encodeUuidToBinary(uuid, uuidRepresentation);
            if (this.f75851a == UuidRepresentation.STANDARD) {
                bsonWriter.writeBinaryData(new BsonBinary(BsonBinarySubType.UUID_STANDARD, encodeUuidToBinary));
                return;
            } else {
                bsonWriter.writeBinaryData(new BsonBinary(BsonBinarySubType.UUID_LEGACY, encodeUuidToBinary));
                return;
            }
        }
        throw new CodecConfigurationException("The uuidRepresentation has not been specified, so the UUID cannot be encoded.");
    }

    public UuidCodec() {
        this.f75851a = UuidRepresentation.JAVA_LEGACY;
    }
}
