package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Codec;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
@ThreadSafe
/* loaded from: classes5.dex */
public final class CompressorRegistry {

    /* renamed from: b */
    public static final CompressorRegistry f63190b = new CompressorRegistry(new Codec.Gzip(), Codec.Identity.NONE);

    /* renamed from: a */
    public final ConcurrentMap f63191a = new ConcurrentHashMap();

    public CompressorRegistry(Compressor... compressorArr) {
        for (Compressor compressor : compressorArr) {
            this.f63191a.put(compressor.getMessageEncoding(), compressor);
        }
    }

    public static CompressorRegistry getDefaultInstance() {
        return f63190b;
    }

    public static CompressorRegistry newEmptyInstance() {
        return new CompressorRegistry(new Compressor[0]);
    }

    @Nullable
    public Compressor lookupCompressor(String str) {
        return (Compressor) this.f63191a.get(str);
    }

    public void register(Compressor compressor) {
        String messageEncoding = compressor.getMessageEncoding();
        Preconditions.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        this.f63191a.put(messageEncoding, compressor);
    }
}