package p000;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: Ax1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17320Ax1 implements Key {

    /* renamed from: i */
    public static final LruCache f248i = new LruCache(50);

    /* renamed from: a */
    public final ArrayPool f249a;

    /* renamed from: b */
    public final Key f250b;

    /* renamed from: c */
    public final Key f251c;

    /* renamed from: d */
    public final int f252d;

    /* renamed from: e */
    public final int f253e;

    /* renamed from: f */
    public final Class f254f;

    /* renamed from: g */
    public final Options f255g;

    /* renamed from: h */
    public final Transformation f256h;

    public C17320Ax1(ArrayPool arrayPool, Key key, Key key2, int i, int i2, Transformation transformation, Class cls, Options options) {
        this.f249a = arrayPool;
        this.f250b = key;
        this.f251c = key2;
        this.f252d = i;
        this.f253e = i2;
        this.f256h = transformation;
        this.f254f = cls;
        this.f255g = options;
    }

    /* renamed from: a */
    public final byte[] m69038a() {
        LruCache lruCache = f248i;
        byte[] bArr = (byte[]) lruCache.get(this.f254f);
        if (bArr == null) {
            byte[] bytes = this.f254f.getName().getBytes(Key.CHARSET);
            lruCache.put(this.f254f, bytes);
            return bytes;
        }
        return bArr;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof C17320Ax1)) {
            return false;
        }
        C17320Ax1 c17320Ax1 = (C17320Ax1) obj;
        if (this.f253e != c17320Ax1.f253e || this.f252d != c17320Ax1.f252d || !Util.bothNullOrEqual(this.f256h, c17320Ax1.f256h) || !this.f254f.equals(c17320Ax1.f254f) || !this.f250b.equals(c17320Ax1.f250b) || !this.f251c.equals(c17320Ax1.f251c) || !this.f255g.equals(c17320Ax1.f255g)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        int hashCode = (((((this.f250b.hashCode() * 31) + this.f251c.hashCode()) * 31) + this.f252d) * 31) + this.f253e;
        Transformation transformation = this.f256h;
        if (transformation != null) {
            hashCode = (hashCode * 31) + transformation.hashCode();
        }
        return (((hashCode * 31) + this.f254f.hashCode()) * 31) + this.f255g.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f250b + ", signature=" + this.f251c + ", width=" + this.f252d + ", height=" + this.f253e + ", decodedResourceClass=" + this.f254f + ", transformation='" + this.f256h + CoreConstants.SINGLE_QUOTE_CHAR + ", options=" + this.f255g + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f249a.getExact(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f252d).putInt(this.f253e).array();
        this.f251c.updateDiskCacheKey(messageDigest);
        this.f250b.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation transformation = this.f256h;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.f255g.updateDiskCacheKey(messageDigest);
        messageDigest.update(m69038a());
        this.f249a.put(bArr);
    }
}
