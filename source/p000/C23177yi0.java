package p000;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

/* renamed from: yi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C23177yi0 implements Codec {

    /* renamed from: a */
    public final Class f108826a;

    /* renamed from: b */
    public final CodecConfigurationException f108827b;

    public C23177yi0(Class cls, CodecConfigurationException codecConfigurationException) {
        this.f108826a = cls;
        this.f108827b = codecConfigurationException;
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        throw this.f108827b;
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        throw this.f108827b;
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f108826a;
    }
}
