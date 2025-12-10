package p000;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* renamed from: GD */
/* loaded from: classes3.dex */
public class C0439GD implements DiskCache.Writer {

    /* renamed from: a */
    public final Encoder f1846a;

    /* renamed from: b */
    public final Object f1847b;

    /* renamed from: c */
    public final Options f1848c;

    public C0439GD(Encoder encoder, Object obj, Options options) {
        this.f1846a = encoder;
        this.f1847b = obj;
        this.f1848c = options;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public boolean write(File file) {
        return this.f1846a.encode(this.f1847b, file, this.f1848c);
    }
}
