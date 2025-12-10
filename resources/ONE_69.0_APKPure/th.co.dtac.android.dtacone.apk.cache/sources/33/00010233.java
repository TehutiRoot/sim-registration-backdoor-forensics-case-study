package org.bson.internal;

import java.util.ArrayList;
import java.util.List;
import org.bson.assertions.Assertions;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

/* loaded from: classes6.dex */
public final class ProvidersCodecRegistry implements CodecRegistry, CodecProvider, InterfaceC16961wB {

    /* renamed from: a */
    public final List f76021a;

    /* renamed from: b */
    public final C12476oq f76022b = new C12476oq();

    public ProvidersCodecRegistry(List<? extends CodecProvider> list) {
        boolean z;
        if (list != null && list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.isTrueArgument("codecProviders must not be null or empty", z);
        this.f76021a = new ArrayList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProvidersCodecRegistry.class != obj.getClass()) {
            return false;
        }
        ProvidersCodecRegistry providersCodecRegistry = (ProvidersCodecRegistry) obj;
        if (this.f76021a.size() != providersCodecRegistry.f76021a.size()) {
            return false;
        }
        for (int i = 0; i < this.f76021a.size(); i++) {
            if (((CodecProvider) this.f76021a.get(i)).getClass() != ((CodecProvider) providersCodecRegistry.f76021a.get(i)).getClass()) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bson.codecs.configuration.CodecRegistry
    public <T> Codec<T> get(Class<T> cls) {
        return get(new C13939sp(this, cls));
    }

    public int hashCode() {
        return this.f76021a.hashCode();
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry) {
        for (CodecProvider codecProvider : this.f76021a) {
            Codec<T> codec = codecProvider.get(cls, codecRegistry);
            if (codec != null) {
                return codec;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC16961wB
    public <T> Codec<T> get(C13939sp c13939sp) {
        if (!this.f76022b.m25952a(c13939sp.m22786a())) {
            for (CodecProvider codecProvider : this.f76021a) {
                Codec<T> codec = codecProvider.get(c13939sp.m22786a(), c13939sp);
                if (codec != null) {
                    this.f76022b.m25950c(c13939sp.m22786a(), codec);
                    return codec;
                }
            }
            this.f76022b.m25950c(c13939sp.m22786a(), null);
        }
        return this.f76022b.m25951b(c13939sp.m22786a());
    }
}