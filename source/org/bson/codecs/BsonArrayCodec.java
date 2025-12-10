package org.bson.codecs;

import java.util.ArrayList;
import java.util.Iterator;
import org.bson.BsonArray;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class BsonArrayCodec implements Codec<BsonArray> {

    /* renamed from: b */
    public static final CodecRegistry f75803b = CodecRegistries.fromProviders(new BsonValueCodecProvider());

    /* renamed from: a */
    public final CodecRegistry f75804a;

    public BsonArrayCodec() {
        this(f75803b);
    }

    @Override // org.bson.codecs.Encoder
    public Class<BsonArray> getEncoderClass() {
        return BsonArray.class;
    }

    public BsonValue readValue(BsonReader bsonReader, DecoderContext decoderContext) {
        return (BsonValue) this.f75804a.get(BsonValueCodecProvider.getClassForBsonType(bsonReader.getCurrentBsonType())).decode(bsonReader, decoderContext);
    }

    public BsonArrayCodec(CodecRegistry codecRegistry) {
        this.f75804a = (CodecRegistry) Assertions.notNull("codecRegistry", codecRegistry);
    }

    @Override // org.bson.codecs.Decoder
    public BsonArray decode(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.readStartArray();
        ArrayList arrayList = new ArrayList();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(readValue(bsonReader, decoderContext));
        }
        bsonReader.readEndArray();
        return new BsonArray(arrayList);
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, BsonArray bsonArray, EncoderContext encoderContext) {
        bsonWriter.writeStartArray();
        Iterator<BsonValue> it = bsonArray.iterator();
        while (it.hasNext()) {
            BsonValue next = it.next();
            encoderContext.encodeWithChildContext(this.f75804a.get(next.getClass()), bsonWriter, next);
        }
        bsonWriter.writeEndArray();
    }
}
