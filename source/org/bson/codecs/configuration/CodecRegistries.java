package org.bson.codecs.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.codecs.Codec;
import org.bson.internal.ProvidersCodecRegistry;

/* loaded from: classes6.dex */
public final class CodecRegistries {

    /* renamed from: org.bson.codecs.configuration.CodecRegistries$a */
    /* loaded from: classes6.dex */
    public class C12916a implements CodecProvider {

        /* renamed from: a */
        public final /* synthetic */ CodecRegistry f75854a;

        public C12916a(CodecRegistry codecRegistry) {
            this.f75854a = codecRegistry;
        }

        @Override // org.bson.codecs.configuration.CodecProvider
        public Codec get(Class cls, CodecRegistry codecRegistry) {
            try {
                return this.f75854a.get(cls);
            } catch (CodecConfigurationException unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static CodecProvider m24275a(CodecRegistry codecRegistry) {
        if (codecRegistry instanceof CodecProvider) {
            return (CodecProvider) codecRegistry;
        }
        return new C12916a(codecRegistry);
    }

    public static CodecRegistry fromCodecs(Codec<?>... codecArr) {
        return fromCodecs(Arrays.asList(codecArr));
    }

    public static CodecRegistry fromProviders(CodecProvider... codecProviderArr) {
        return fromProviders(Arrays.asList(codecProviderArr));
    }

    public static CodecRegistry fromRegistries(CodecRegistry... codecRegistryArr) {
        return fromRegistries(Arrays.asList(codecRegistryArr));
    }

    public static CodecRegistry fromCodecs(List<? extends Codec<?>> list) {
        return fromProviders(new C18195On0(list));
    }

    public static CodecRegistry fromProviders(List<? extends CodecProvider> list) {
        return new ProvidersCodecRegistry(list);
    }

    public static CodecRegistry fromRegistries(List<? extends CodecRegistry> list) {
        ArrayList arrayList = new ArrayList();
        for (CodecRegistry codecRegistry : list) {
            arrayList.add(m24275a(codecRegistry));
        }
        return new ProvidersCodecRegistry(arrayList);
    }
}
