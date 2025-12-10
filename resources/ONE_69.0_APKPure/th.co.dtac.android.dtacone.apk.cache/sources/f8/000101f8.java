package org.bson.codecs;

import java.util.UUID;
import org.bson.UuidRepresentation;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public class UuidCodecProvider implements CodecProvider {

    /* renamed from: a */
    public UuidRepresentation f75936a;

    public UuidCodecProvider(UuidRepresentation uuidRepresentation) {
        this.f75936a = uuidRepresentation;
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        if (cls == UUID.class) {
            return new UuidCodec(this.f75936a);
        }
        return null;
    }
}