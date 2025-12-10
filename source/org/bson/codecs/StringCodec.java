package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public class StringCodec implements Codec<String> {
    @Override // org.bson.codecs.Encoder
    public Class<String> getEncoderClass() {
        return String.class;
    }

    @Override // org.bson.codecs.Decoder
    public String decode(BsonReader bsonReader, DecoderContext decoderContext) {
        if (bsonReader.getCurrentBsonType() == BsonType.SYMBOL) {
            return bsonReader.readSymbol();
        }
        return bsonReader.readString();
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, String str, EncoderContext encoderContext) {
        bsonWriter.writeString(str);
    }
}
