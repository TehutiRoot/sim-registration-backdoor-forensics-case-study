package p000;

import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecConfigurationException;

/* renamed from: WD */
/* loaded from: classes6.dex */
public abstract class AbstractC1593WD implements Codec {
    /* renamed from: a */
    public long m65650a(BsonReader bsonReader) {
        BsonType currentBsonType = bsonReader.getCurrentBsonType();
        BsonType bsonType = BsonType.DATE_TIME;
        if (currentBsonType.equals(bsonType)) {
            return bsonReader.readDateTime();
        }
        throw new CodecConfigurationException(String.format("Could not decode into %s, expected '%s' BsonType but got '%s'.", getEncoderClass().getSimpleName(), bsonType, currentBsonType));
    }
}
