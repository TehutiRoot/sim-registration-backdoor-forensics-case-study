package org.bson.internal;

import org.bson.UuidRepresentation;
import org.bson.assertions.Assertions;
import org.bson.codecs.Codec;
import org.bson.codecs.OverridableUuidRepresentationCodec;
import org.bson.codecs.configuration.CodecProvider;

/* loaded from: classes6.dex */
public class OverridableUuidRepresentationCodecRegistry implements InterfaceC16951wB {

    /* renamed from: a */
    public final CodecProvider f75934a;

    /* renamed from: b */
    public final C12476oq f75935b = new C12476oq();

    /* renamed from: c */
    public final UuidRepresentation f75936c;

    public OverridableUuidRepresentationCodecRegistry(CodecProvider codecProvider, UuidRepresentation uuidRepresentation) {
        this.f75936c = (UuidRepresentation) Assertions.notNull("uuidRepresentation", uuidRepresentation);
        this.f75934a = (CodecProvider) Assertions.notNull("wrapped", codecProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverridableUuidRepresentationCodecRegistry overridableUuidRepresentationCodecRegistry = (OverridableUuidRepresentationCodecRegistry) obj;
        if (this.f75934a.equals(overridableUuidRepresentationCodecRegistry.f75934a) && this.f75936c == overridableUuidRepresentationCodecRegistry.f75936c) {
            return true;
        }
        return false;
    }

    @Override // org.bson.codecs.configuration.CodecRegistry
    public <T> Codec<T> get(Class<T> cls) {
        return get(new C13952sp(this, cls));
    }

    public UuidRepresentation getUuidRepresentation() {
        return this.f75936c;
    }

    public CodecProvider getWrapped() {
        return this.f75934a;
    }

    public int hashCode() {
        return (this.f75934a.hashCode() * 31) + this.f75936c.hashCode();
    }

    @Override // p000.InterfaceC16951wB
    public <T> Codec<T> get(C13952sp c13952sp) {
        if (!this.f75935b.m25779a(c13952sp.m22553a())) {
            Codec<T> codec = this.f75934a.get(c13952sp.m22553a(), c13952sp);
            if (codec instanceof OverridableUuidRepresentationCodec) {
                codec = ((OverridableUuidRepresentationCodec) codec).withUuidRepresentation(this.f75936c);
            }
            this.f75935b.m25777c(c13952sp.m22553a(), codec);
        }
        return this.f75935b.m25778b(c13952sp.m22553a());
    }
}
