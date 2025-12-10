package p000;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: zS */
/* loaded from: classes3.dex */
public class C17195zS implements Key {

    /* renamed from: a */
    public final Object f109064a;

    /* renamed from: b */
    public final int f109065b;

    /* renamed from: c */
    public final int f109066c;

    /* renamed from: d */
    public final Class f109067d;

    /* renamed from: e */
    public final Class f109068e;

    /* renamed from: f */
    public final Key f109069f;

    /* renamed from: g */
    public final Map f109070g;

    /* renamed from: h */
    public final Options f109071h;

    /* renamed from: i */
    public int f109072i;

    public C17195zS(Object obj, Key key, int i, int i2, Map map, Class cls, Class cls2, Options options) {
        this.f109064a = Preconditions.checkNotNull(obj);
        this.f109069f = (Key) Preconditions.checkNotNull(key, "Signature must not be null");
        this.f109065b = i;
        this.f109066c = i2;
        this.f109070g = (Map) Preconditions.checkNotNull(map);
        this.f109067d = (Class) Preconditions.checkNotNull(cls, "Resource class must not be null");
        this.f109068e = (Class) Preconditions.checkNotNull(cls2, "Transcode class must not be null");
        this.f109071h = (Options) Preconditions.checkNotNull(options);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof C17195zS)) {
            return false;
        }
        C17195zS c17195zS = (C17195zS) obj;
        if (!this.f109064a.equals(c17195zS.f109064a) || !this.f109069f.equals(c17195zS.f109069f) || this.f109066c != c17195zS.f109066c || this.f109065b != c17195zS.f109065b || !this.f109070g.equals(c17195zS.f109070g) || !this.f109067d.equals(c17195zS.f109067d) || !this.f109068e.equals(c17195zS.f109068e) || !this.f109071h.equals(c17195zS.f109071h)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.f109072i == 0) {
            int hashCode = this.f109064a.hashCode();
            this.f109072i = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f109069f.hashCode()) * 31) + this.f109065b) * 31) + this.f109066c;
            this.f109072i = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f109070g.hashCode();
            this.f109072i = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f109067d.hashCode();
            this.f109072i = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f109068e.hashCode();
            this.f109072i = hashCode5;
            this.f109072i = (hashCode5 * 31) + this.f109071h.hashCode();
        }
        return this.f109072i;
    }

    public String toString() {
        return "EngineKey{model=" + this.f109064a + ", width=" + this.f109065b + ", height=" + this.f109066c + ", resourceClass=" + this.f109067d + ", transcodeClass=" + this.f109068e + ", signature=" + this.f109069f + ", hashCode=" + this.f109072i + ", transformations=" + this.f109070g + ", options=" + this.f109071h + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
