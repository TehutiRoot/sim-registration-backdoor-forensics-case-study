package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class ByteCodec implements Codec<Byte> {
    @Override // org.bson.codecs.Encoder
    public Class<Byte> getEncoderClass() {
        return Byte.class;
    }

    @Override // org.bson.codecs.Decoder
    public Byte decode(BsonReader bsonReader, DecoderContext decoderContext) {
        int m23345b = AbstractC21912rJ0.m23345b(bsonReader);
        if (m23345b >= -128 && m23345b <= 127) {
            return Byte.valueOf((byte) m23345b);
        }
        throw new BsonInvalidOperationException(String.format("%s can not be converted into a Byte.", Integer.valueOf(m23345b)));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Byte b, EncoderContext encoderContext) {
        bsonWriter.writeInt32(b.byteValue());
    }
}
