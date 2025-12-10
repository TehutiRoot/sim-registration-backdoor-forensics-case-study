package org.bson.codecs;

import org.bson.BsonBinary;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.Binary;

/* loaded from: classes6.dex */
public class BinaryCodec implements Codec<Binary> {
    @Override // org.bson.codecs.Encoder
    public Class<Binary> getEncoderClass() {
        return Binary.class;
    }

    @Override // org.bson.codecs.Decoder
    public Binary decode(BsonReader bsonReader, DecoderContext decoderContext) {
        BsonBinary readBinaryData = bsonReader.readBinaryData();
        return new Binary(readBinaryData.getType(), readBinaryData.getData());
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Binary binary, EncoderContext encoderContext) {
        bsonWriter.writeBinaryData(new BsonBinary(binary.getType(), binary.getData()));
    }
}
