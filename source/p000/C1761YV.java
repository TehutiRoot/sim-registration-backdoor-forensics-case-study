package p000;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PropertyCodecProvider;
import org.bson.codecs.pojo.PropertyCodecRegistry;
import org.bson.codecs.pojo.TypeWithTypeParameters;

/* renamed from: YV */
/* loaded from: classes6.dex */
public final class C1761YV implements PropertyCodecProvider {

    /* renamed from: a */
    public final CodecRegistry f7777a;

    /* renamed from: b */
    public final AbstractC18316Qk1 f7778b;

    public C1761YV(AbstractC18316Qk1 abstractC18316Qk1, CodecRegistry codecRegistry) {
        this.f7778b = abstractC18316Qk1;
        this.f7777a = codecRegistry;
    }

    @Override // org.bson.codecs.pojo.PropertyCodecProvider
    public Codec get(TypeWithTypeParameters typeWithTypeParameters, PropertyCodecRegistry propertyCodecRegistry) {
        if (typeWithTypeParameters.getType() == this.f7778b.getEncoderClass()) {
            return this.f7778b;
        }
        return this.f7777a.get(typeWithTypeParameters.getType());
    }
}
