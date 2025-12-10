package p000;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

/* renamed from: Ei0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17568Ei0 implements Codec {

    /* renamed from: a */
    public final Class f1427a;

    /* renamed from: b */
    public final CodecConfigurationException f1428b;

    public C17568Ei0(Class cls, CodecConfigurationException codecConfigurationException) {
        this.f1427a = cls;
        this.f1428b = codecConfigurationException;
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        throw this.f1428b;
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        throw this.f1428b;
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f1427a;
    }
}