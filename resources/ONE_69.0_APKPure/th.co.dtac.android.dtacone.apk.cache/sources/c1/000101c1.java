package org.bson.codecs;

import org.bson.BsonNull;
import org.bson.BsonReader;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class BsonNullCodec implements Codec<BsonNull> {
    @Override // org.bson.codecs.Encoder
    public Class<BsonNull> getEncoderClass() {
        return BsonNull.class;
    }

    @Override // org.bson.codecs.Decoder
    public BsonNull decode(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.readNull();
        return BsonNull.VALUE;
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, BsonNull bsonNull, EncoderContext encoderContext) {
        bsonWriter.writeNull();
    }
}