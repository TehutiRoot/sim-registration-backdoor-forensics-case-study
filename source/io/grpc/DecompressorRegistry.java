package io.grpc;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import io.grpc.Codec;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
@ThreadSafe
/* loaded from: classes5.dex */
public final class DecompressorRegistry {

    /* renamed from: c */
    public static final Joiner f63165c = Joiner.m41323on(',');

    /* renamed from: d */
    public static final DecompressorRegistry f63166d = emptyInstance().with(new Codec.Gzip(), true).with(Codec.Identity.NONE, false);

    /* renamed from: a */
    public final Map f63167a;

    /* renamed from: b */
    public final byte[] f63168b;

    /* renamed from: io.grpc.DecompressorRegistry$a */
    /* loaded from: classes5.dex */
    public static final class C10521a {

        /* renamed from: a */
        public final Decompressor f63169a;

        /* renamed from: b */
        public final boolean f63170b;

        public C10521a(Decompressor decompressor, boolean z) {
            this.f63169a = (Decompressor) Preconditions.checkNotNull(decompressor, "decompressor");
            this.f63170b = z;
        }
    }

    public DecompressorRegistry(Decompressor decompressor, boolean z, DecompressorRegistry decompressorRegistry) {
        String messageEncoding = decompressor.getMessageEncoding();
        Preconditions.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        int size = decompressorRegistry.f63167a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(decompressorRegistry.f63167a.containsKey(decompressor.getMessageEncoding()) ? size : size + 1);
        for (C10521a c10521a : decompressorRegistry.f63167a.values()) {
            String messageEncoding2 = c10521a.f63169a.getMessageEncoding();
            if (!messageEncoding2.equals(messageEncoding)) {
                linkedHashMap.put(messageEncoding2, new C10521a(c10521a.f63169a, c10521a.f63170b));
            }
        }
        linkedHashMap.put(messageEncoding, new C10521a(decompressor, z));
        this.f63167a = Collections.unmodifiableMap(linkedHashMap);
        this.f63168b = f63165c.join(getAdvertisedMessageEncodings()).getBytes(Charset.forName("US-ASCII"));
    }

    public static DecompressorRegistry emptyInstance() {
        return new DecompressorRegistry();
    }

    public static DecompressorRegistry getDefaultInstance() {
        return f63166d;
    }

    /* renamed from: a */
    public byte[] m30436a() {
        return this.f63168b;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
    public Set<String> getAdvertisedMessageEncodings() {
        HashSet hashSet = new HashSet(this.f63167a.size());
        for (Map.Entry entry : this.f63167a.entrySet()) {
            if (((C10521a) entry.getValue()).f63170b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Set<String> getKnownMessageEncodings() {
        return this.f63167a.keySet();
    }

    @Nullable
    public Decompressor lookupDecompressor(String str) {
        C10521a c10521a = (C10521a) this.f63167a.get(str);
        if (c10521a != null) {
            return c10521a.f63169a;
        }
        return null;
    }

    public DecompressorRegistry with(Decompressor decompressor, boolean z) {
        return new DecompressorRegistry(decompressor, z, this);
    }

    public DecompressorRegistry() {
        this.f63167a = new LinkedHashMap(0);
        this.f63168b = new byte[0];
    }
}
