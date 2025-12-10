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
    public static final Joiner f63228c = Joiner.m41310on(',');

    /* renamed from: d */
    public static final DecompressorRegistry f63229d = emptyInstance().with(new Codec.Gzip(), true).with(Codec.Identity.NONE, false);

    /* renamed from: a */
    public final Map f63230a;

    /* renamed from: b */
    public final byte[] f63231b;

    /* renamed from: io.grpc.DecompressorRegistry$a */
    /* loaded from: classes5.dex */
    public static final class C10508a {

        /* renamed from: a */
        public final Decompressor f63232a;

        /* renamed from: b */
        public final boolean f63233b;

        public C10508a(Decompressor decompressor, boolean z) {
            this.f63232a = (Decompressor) Preconditions.checkNotNull(decompressor, "decompressor");
            this.f63233b = z;
        }
    }

    public DecompressorRegistry(Decompressor decompressor, boolean z, DecompressorRegistry decompressorRegistry) {
        String messageEncoding = decompressor.getMessageEncoding();
        Preconditions.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        int size = decompressorRegistry.f63230a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(decompressorRegistry.f63230a.containsKey(decompressor.getMessageEncoding()) ? size : size + 1);
        for (C10508a c10508a : decompressorRegistry.f63230a.values()) {
            String messageEncoding2 = c10508a.f63232a.getMessageEncoding();
            if (!messageEncoding2.equals(messageEncoding)) {
                linkedHashMap.put(messageEncoding2, new C10508a(c10508a.f63232a, c10508a.f63233b));
            }
        }
        linkedHashMap.put(messageEncoding, new C10508a(decompressor, z));
        this.f63230a = Collections.unmodifiableMap(linkedHashMap);
        this.f63231b = f63228c.join(getAdvertisedMessageEncodings()).getBytes(Charset.forName("US-ASCII"));
    }

    public static DecompressorRegistry emptyInstance() {
        return new DecompressorRegistry();
    }

    public static DecompressorRegistry getDefaultInstance() {
        return f63229d;
    }

    /* renamed from: a */
    public byte[] m30776a() {
        return this.f63231b;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
    public Set<String> getAdvertisedMessageEncodings() {
        HashSet hashSet = new HashSet(this.f63230a.size());
        for (Map.Entry entry : this.f63230a.entrySet()) {
            if (((C10508a) entry.getValue()).f63233b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Set<String> getKnownMessageEncodings() {
        return this.f63230a.keySet();
    }

    @Nullable
    public Decompressor lookupDecompressor(String str) {
        C10508a c10508a = (C10508a) this.f63230a.get(str);
        if (c10508a != null) {
            return c10508a.f63232a;
        }
        return null;
    }

    public DecompressorRegistry with(Decompressor decompressor, boolean z) {
        return new DecompressorRegistry(decompressor, z, this);
    }

    public DecompressorRegistry() {
        this.f63230a = new LinkedHashMap(0);
        this.f63231b = new byte[0];
    }
}