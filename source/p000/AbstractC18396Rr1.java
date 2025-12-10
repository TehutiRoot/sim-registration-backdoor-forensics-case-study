package p000;

import org.bson.BsonBinaryReader;
import org.bson.BsonType;
import org.bson.BsonValue;
import org.bson.RawBsonArray;
import org.bson.RawBsonDocument;
import org.bson.codecs.BsonValueCodecProvider;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.p044io.BsonInputMark;

/* renamed from: Rr1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC18396Rr1 {

    /* renamed from: a */
    public static final CodecRegistry f5442a = CodecRegistries.fromProviders(new BsonValueCodecProvider());

    /* renamed from: a */
    public static BsonValue m66409a(byte[] bArr, BsonBinaryReader bsonBinaryReader) {
        BsonType currentBsonType = bsonBinaryReader.getCurrentBsonType();
        BsonType bsonType = BsonType.DOCUMENT;
        if (currentBsonType != bsonType && bsonBinaryReader.getCurrentBsonType() != BsonType.ARRAY) {
            return (BsonValue) f5442a.get(BsonValueCodecProvider.getClassForBsonType(bsonBinaryReader.getCurrentBsonType())).decode(bsonBinaryReader, DecoderContext.builder().build());
        }
        int position = bsonBinaryReader.getBsonInput().getPosition();
        BsonInputMark mark = bsonBinaryReader.getBsonInput().getMark(4);
        int readInt32 = bsonBinaryReader.getBsonInput().readInt32();
        mark.reset();
        bsonBinaryReader.skipValue();
        if (bsonBinaryReader.getCurrentBsonType() == bsonType) {
            return new RawBsonDocument(bArr, position, readInt32);
        }
        return new RawBsonArray(bArr, position, readInt32);
    }
}
