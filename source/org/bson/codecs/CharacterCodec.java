package org.bson.codecs;

import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.assertions.Assertions;

/* loaded from: classes6.dex */
public class CharacterCodec implements Codec<Character> {
    @Override // org.bson.codecs.Encoder
    public Class<Character> getEncoderClass() {
        return Character.class;
    }

    @Override // org.bson.codecs.Decoder
    public Character decode(BsonReader bsonReader, DecoderContext decoderContext) {
        String readString = bsonReader.readString();
        if (readString.length() == 1) {
            return Character.valueOf(readString.charAt(0));
        }
        throw new BsonInvalidOperationException(String.format("Attempting to decode the string '%s' to a character, but its length is not equal to one", readString));
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Character ch2, EncoderContext encoderContext) {
        Assertions.notNull("value", ch2);
        bsonWriter.writeString(ch2.toString());
    }
}
