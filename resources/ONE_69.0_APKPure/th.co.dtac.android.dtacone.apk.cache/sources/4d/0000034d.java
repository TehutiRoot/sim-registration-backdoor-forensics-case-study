package p000;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: DS */
/* loaded from: classes3.dex */
public class C0247DS implements Key {

    /* renamed from: a */
    public final Object f1023a;

    /* renamed from: b */
    public final int f1024b;

    /* renamed from: c */
    public final int f1025c;

    /* renamed from: d */
    public final Class f1026d;

    /* renamed from: e */
    public final Class f1027e;

    /* renamed from: f */
    public final Key f1028f;

    /* renamed from: g */
    public final Map f1029g;

    /* renamed from: h */
    public final Options f1030h;

    /* renamed from: i */
    public int f1031i;

    public C0247DS(Object obj, Key key, int i, int i2, Map map, Class cls, Class cls2, Options options) {
        this.f1023a = Preconditions.checkNotNull(obj);
        this.f1028f = (Key) Preconditions.checkNotNull(key, "Signature must not be null");
        this.f1024b = i;
        this.f1025c = i2;
        this.f1029g = (Map) Preconditions.checkNotNull(map);
        this.f1026d = (Class) Preconditions.checkNotNull(cls, "Resource class must not be null");
        this.f1027e = (Class) Preconditions.checkNotNull(cls2, "Transcode class must not be null");
        this.f1030h = (Options) Preconditions.checkNotNull(options);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof C0247DS)) {
            return false;
        }
        C0247DS c0247ds = (C0247DS) obj;
        if (!this.f1023a.equals(c0247ds.f1023a) || !this.f1028f.equals(c0247ds.f1028f) || this.f1025c != c0247ds.f1025c || this.f1024b != c0247ds.f1024b || !this.f1029g.equals(c0247ds.f1029g) || !this.f1026d.equals(c0247ds.f1026d) || !this.f1027e.equals(c0247ds.f1027e) || !this.f1030h.equals(c0247ds.f1030h)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.f1031i == 0) {
            int hashCode = this.f1023a.hashCode();
            this.f1031i = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f1028f.hashCode()) * 31) + this.f1024b) * 31) + this.f1025c;
            this.f1031i = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f1029g.hashCode();
            this.f1031i = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f1026d.hashCode();
            this.f1031i = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f1027e.hashCode();
            this.f1031i = hashCode5;
            this.f1031i = (hashCode5 * 31) + this.f1030h.hashCode();
        }
        return this.f1031i;
    }

    public String toString() {
        return "EngineKey{model=" + this.f1023a + ", width=" + this.f1024b + ", height=" + this.f1025c + ", resourceClass=" + this.f1026d + ", transcodeClass=" + this.f1027e + ", signature=" + this.f1028f + ", hashCode=" + this.f1031i + ", transformations=" + this.f1029g + ", options=" + this.f1030h + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}