package org.bson.internal;

import java.util.ArrayList;
import java.util.List;
import org.bson.assertions.Assertions;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public final class ProvidersCodecRegistry implements CodecRegistry, CodecProvider, InterfaceC16951wB {

    /* renamed from: a */
    public final List f75937a;

    /* renamed from: b */
    public final C12476oq f75938b = new C12476oq();

    public ProvidersCodecRegistry(List<? extends CodecProvider> list) {
        boolean z;
        if (list != null && list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.isTrueArgument("codecProviders must not be null or empty", z);
        this.f75937a = new ArrayList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProvidersCodecRegistry.class != obj.getClass()) {
            return false;
        }
        ProvidersCodecRegistry providersCodecRegistry = (ProvidersCodecRegistry) obj;
        if (this.f75937a.size() != providersCodecRegistry.f75937a.size()) {
            return false;
        }
        for (int i = 0; i < this.f75937a.size(); i++) {
            if (((CodecProvider) this.f75937a.get(i)).getClass() != ((CodecProvider) providersCodecRegistry.f75937a.get(i)).getClass()) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bson.codecs.configuration.CodecRegistry
    public <T> Codec<T> get(Class<T> cls) {
        return get(new C13952sp(this, cls));
    }

    public int hashCode() {
        return this.f75937a.hashCode();
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        for (CodecProvider codecProvider : this.f75937a) {
            Codec<T> codec = codecProvider.get(cls, codecRegistry);
            if (codec != null) {
                return codec;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC16951wB
    public <T> Codec<T> get(C13952sp c13952sp) {
        if (!this.f75938b.m25779a(c13952sp.m22553a())) {
            for (CodecProvider codecProvider : this.f75937a) {
                Codec<T> codec = codecProvider.get(c13952sp.m22553a(), c13952sp);
                if (codec != null) {
                    this.f75938b.m25777c(c13952sp.m22553a(), codec);
                    return codec;
                }
            }
            this.f75938b.m25777c(c13952sp.m22553a(), null);
        }
        return this.f75938b.m25778b(c13952sp.m22553a());
    }
}
