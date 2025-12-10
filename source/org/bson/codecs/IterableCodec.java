package org.bson.codecs;

import java.util.ArrayList;
import java.util.UUID;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.Transformer;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class IterableCodec implements Codec<Iterable>, OverridableUuidRepresentationCodec<Iterable> {

    /* renamed from: a */
    public final CodecRegistry f75835a;

    /* renamed from: b */
    public final BsonTypeCodecMap f75836b;

    /* renamed from: c */
    public final Transformer f75837c;

    /* renamed from: d */
    public final UuidRepresentation f75838d;

    /* renamed from: org.bson.codecs.IterableCodec$a */
    /* loaded from: classes6.dex */
    public class C12914a implements Transformer {
        public C12914a() {
        }

        @Override // org.bson.Transformer
        public Object transform(Object obj) {
            return obj;
        }
    }

    public IterableCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap) {
        this(codecRegistry, bsonTypeClassMap, null);
    }

    /* renamed from: a */
    private Object m24283a(BsonReader bsonReader, DecoderContext decoderContext) {
        UuidRepresentation uuidRepresentation;
        BsonType currentBsonType = bsonReader.getCurrentBsonType();
        if (currentBsonType == BsonType.NULL) {
            bsonReader.readNull();
            return null;
        }
        Codec<?> codec = this.f75836b.get(currentBsonType);
        if (currentBsonType == BsonType.BINARY && bsonReader.peekBinarySize() == 16) {
            byte peekBinarySubType = bsonReader.peekBinarySubType();
            if (peekBinarySubType != 3) {
                if (peekBinarySubType == 4 && ((uuidRepresentation = this.f75838d) == UuidRepresentation.JAVA_LEGACY || uuidRepresentation == UuidRepresentation.STANDARD)) {
                    codec = this.f75835a.get(UUID.class);
                }
            } else {
                UuidRepresentation uuidRepresentation2 = this.f75838d;
                if (uuidRepresentation2 == UuidRepresentation.JAVA_LEGACY || uuidRepresentation2 == UuidRepresentation.C_SHARP_LEGACY || uuidRepresentation2 == UuidRepresentation.PYTHON_LEGACY) {
                    codec = this.f75835a.get(UUID.class);
                }
            }
        }
        return this.f75837c.transform(codec.decode(bsonReader, decoderContext));
    }

    /* renamed from: b */
    private void m24282b(BsonWriter bsonWriter, EncoderContext encoderContext, Object obj) {
        if (obj == null) {
            bsonWriter.writeNull();
        } else {
            encoderContext.encodeWithChildContext(this.f75835a.get(obj.getClass()), bsonWriter, obj);
        }
    }

    @Override // org.bson.codecs.Encoder
    public Class<Iterable> getEncoderClass() {
        return Iterable.class;
    }

    @Override // org.bson.codecs.OverridableUuidRepresentationCodec
    public Codec<Iterable> withUuidRepresentation(UuidRepresentation uuidRepresentation) {
        return new IterableCodec(this.f75835a, this.f75836b, this.f75837c, uuidRepresentation);
    }

    public IterableCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this(codecRegistry, new BsonTypeCodecMap((BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap), codecRegistry), transformer, UuidRepresentation.JAVA_LEGACY);
    }

    @Override // org.bson.codecs.Decoder
    public Iterable decode(BsonReader bsonReader, DecoderContext decoderContext) {
        bsonReader.readStartArray();
        ArrayList arrayList = new ArrayList();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            arrayList.add(m24283a(bsonReader, decoderContext));
        }
        bsonReader.readEndArray();
        return arrayList;
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Iterable iterable, EncoderContext encoderContext) {
        bsonWriter.writeStartArray();
        for (Object obj : iterable) {
            m24282b(bsonWriter, encoderContext, obj);
        }
        bsonWriter.writeEndArray();
    }

    public IterableCodec(CodecRegistry codecRegistry, BsonTypeCodecMap bsonTypeCodecMap, Transformer transformer, UuidRepresentation uuidRepresentation) {
        this.f75835a = (CodecRegistry) Assertions.notNull("registry", codecRegistry);
        this.f75836b = bsonTypeCodecMap;
        this.f75837c = transformer == null ? new C12914a() : transformer;
        this.f75838d = uuidRepresentation;
    }
}
