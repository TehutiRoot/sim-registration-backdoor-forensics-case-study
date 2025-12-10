package p000;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* renamed from: HD */
/* loaded from: classes3.dex */
public class C0503HD implements DiskCache.Writer {

    /* renamed from: a */
    public final Encoder f2315a;

    /* renamed from: b */
    public final Object f2316b;

    /* renamed from: c */
    public final Options f2317c;

    public C0503HD(Encoder encoder, Object obj, Options options) {
        this.f2315a = encoder;
        this.f2316b = obj;
        this.f2317c = options;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public boolean write(File file) {
        return this.f2315a.encode(this.f2316b, file, this.f2317c);
    }
}