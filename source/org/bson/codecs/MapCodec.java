package org.bson.codecs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bson.BsonReader;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.Transformer;
import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class MapCodec implements Codec<Map<String, Object>>, OverridableUuidRepresentationCodec<Map<String, Object>> {

    /* renamed from: e */
    public static final CodecRegistry f75842e = CodecRegistries.fromProviders(Arrays.asList(new ValueCodecProvider(), new BsonValueCodecProvider(), new DocumentCodecProvider(), new IterableCodecProvider(), new MapCodecProvider()));

    /* renamed from: f */
    public static final BsonTypeClassMap f75843f = new BsonTypeClassMap();

    /* renamed from: a */
    public final BsonTypeCodecMap f75844a;

    /* renamed from: b */
    public final CodecRegistry f75845b;

    /* renamed from: c */
    public final Transformer f75846c;

    /* renamed from: d */
    public final UuidRepresentation f75847d;

    /* renamed from: org.bson.codecs.MapCodec$a */
    /* loaded from: classes6.dex */
    public class C12915a implements Transformer {
        public C12915a() {
        }

        @Override // org.bson.Transformer
        public Object transform(Object obj) {
            return obj;
        }
    }

    public MapCodec() {
        this(f75842e);
    }

    /* renamed from: a */
    private Object m24281a(BsonReader bsonReader, DecoderContext decoderContext) {
        UuidRepresentation uuidRepresentation;
        BsonType currentBsonType = bsonReader.getCurrentBsonType();
        if (currentBsonType == BsonType.NULL) {
            bsonReader.readNull();
            return null;
        } else if (currentBsonType == BsonType.ARRAY) {
            return decoderContext.decodeWithChildContext(this.f75845b.get(List.class), bsonReader);
        } else {
            if (currentBsonType == BsonType.BINARY && bsonReader.peekBinarySize() == 16) {
                Codec<?> codec = this.f75844a.get(currentBsonType);
                byte peekBinarySubType = bsonReader.peekBinarySubType();
                if (peekBinarySubType != 3) {
                    if (peekBinarySubType == 4 && ((uuidRepresentation = this.f75847d) == UuidRepresentation.JAVA_LEGACY || uuidRepresentation == UuidRepresentation.STANDARD)) {
                        codec = this.f75845b.get(UUID.class);
                    }
                } else {
                    UuidRepresentation uuidRepresentation2 = this.f75847d;
                    if (uuidRepresentation2 == UuidRepresentation.JAVA_LEGACY || uuidRepresentation2 == UuidRepresentation.C_SHARP_LEGACY || uuidRepresentation2 == UuidRepresentation.PYTHON_LEGACY) {
                        codec = this.f75845b.get(UUID.class);
                    }
                }
                return decoderContext.decodeWithChildContext(codec, bsonReader);
            }
            return this.f75846c.transform(this.f75844a.get(currentBsonType).decode(bsonReader, decoderContext));
        }
    }

    /* renamed from: b */
    private void m24280b(BsonWriter bsonWriter, EncoderContext encoderContext, Object obj) {
        if (obj == null) {
            bsonWriter.writeNull();
        } else {
            encoderContext.encodeWithChildContext(this.f75845b.get(obj.getClass()), bsonWriter, obj);
        }
    }

    @Override // org.bson.codecs.Encoder
    public Class<Map<String, Object>> getEncoderClass() {
        return Map.class;
    }

    @Override // org.bson.codecs.OverridableUuidRepresentationCodec
    public Codec<Map<String, Object>> withUuidRepresentation(UuidRepresentation uuidRepresentation) {
        return new MapCodec(this.f75845b, this.f75844a, this.f75846c, uuidRepresentation);
    }

    public MapCodec(CodecRegistry codecRegistry) {
        this(codecRegistry, f75843f);
    }

    @Override // org.bson.codecs.Decoder
    public Map<String, Object> decode(BsonReader bsonReader, DecoderContext decoderContext) {
        HashMap hashMap = new HashMap();
        bsonReader.readStartDocument();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            hashMap.put(bsonReader.readName(), m24281a(bsonReader, decoderContext));
        }
        bsonReader.readEndDocument();
        return hashMap;
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Map<String, Object> map, EncoderContext encoderContext) {
        bsonWriter.writeStartDocument();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            bsonWriter.writeName(entry.getKey());
            m24280b(bsonWriter, encoderContext, entry.getValue());
        }
        bsonWriter.writeEndDocument();
    }

    public MapCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap) {
        this(codecRegistry, bsonTypeClassMap, null);
    }

    public MapCodec(CodecRegistry codecRegistry, BsonTypeClassMap bsonTypeClassMap, Transformer transformer) {
        this(codecRegistry, new BsonTypeCodecMap((BsonTypeClassMap) Assertions.notNull("bsonTypeClassMap", bsonTypeClassMap), codecRegistry), transformer, UuidRepresentation.JAVA_LEGACY);
    }

    public MapCodec(CodecRegistry codecRegistry, BsonTypeCodecMap bsonTypeCodecMap, Transformer transformer, UuidRepresentation uuidRepresentation) {
        this.f75845b = (CodecRegistry) Assertions.notNull("registry", codecRegistry);
        this.f75844a = bsonTypeCodecMap;
        this.f75846c = transformer == null ? new C12915a() : transformer;
        this.f75847d = uuidRepresentation;
    }
}
