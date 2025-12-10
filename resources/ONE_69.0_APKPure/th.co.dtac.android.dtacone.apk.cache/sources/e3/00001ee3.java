package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ResolutionInfo;

/* renamed from: androidx.camera.core.d */
/* loaded from: classes.dex */
public final class C2444d extends ResolutionInfo.AbstractC2432a {

    /* renamed from: a */
    public final Size f11044a;

    /* renamed from: b */
    public final Rect f11045b;

    /* renamed from: c */
    public final int f11046c;

    /* renamed from: androidx.camera.core.d$b */
    /* loaded from: classes.dex */
    public static final class C2446b extends ResolutionInfo.AbstractC2432a.AbstractC2433a {

        /* renamed from: a */
        public Size f11047a;

        /* renamed from: b */
        public Rect f11048b;

        /* renamed from: c */
        public Integer f11049c;

        @Override // androidx.camera.core.ResolutionInfo.AbstractC2432a.AbstractC2433a
        /* renamed from: a */
        public ResolutionInfo.AbstractC2432a mo63104a() {
            String str = "";
            if (this.f11047a == null) {
                str = " resolution";
            }
            if (this.f11048b == null) {
                str = str + " cropRect";
            }
            if (this.f11049c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C2444d(this.f11047a, this.f11048b, this.f11049c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.ResolutionInfo.AbstractC2432a.AbstractC2433a
        /* renamed from: b */
        public ResolutionInfo.AbstractC2432a.AbstractC2433a mo63103b(Rect rect) {
            if (rect != null) {
                this.f11048b = rect;
                return this;
            }
            throw new NullPointerException("Null cropRect");
        }

        @Override // androidx.camera.core.ResolutionInfo.AbstractC2432a.AbstractC2433a
        /* renamed from: c */
        public ResolutionInfo.AbstractC2432a.AbstractC2433a mo63102c(int i) {
            this.f11049c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public ResolutionInfo.AbstractC2432a.AbstractC2433a m63101d(Size size) {
            if (size != null) {
                this.f11047a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }
    }

    @Override // androidx.camera.core.ResolutionInfo.AbstractC2432a
    /* renamed from: a */
    public Rect mo63107a() {
        return this.f11045b;
    }

    @Override // androidx.camera.core.ResolutionInfo.AbstractC2432a
    /* renamed from: b */
    public Size mo63106b() {
        return this.f11044a;
    }

    @Override // androidx.camera.core.ResolutionInfo.AbstractC2432a
    /* renamed from: c */
    public int mo63105c() {
        return this.f11046c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResolutionInfo.AbstractC2432a)) {
            return false;
        }
        ResolutionInfo.AbstractC2432a abstractC2432a = (ResolutionInfo.AbstractC2432a) obj;
        if (this.f11044a.equals(abstractC2432a.mo63106b()) && this.f11045b.equals(abstractC2432a.mo63107a()) && this.f11046c == abstractC2432a.mo63105c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11044a.hashCode() ^ 1000003) * 1000003) ^ this.f11045b.hashCode()) * 1000003) ^ this.f11046c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f11044a + ", cropRect=" + this.f11045b + ", rotationDegrees=" + this.f11046c + "}";
    }

    public C2444d(Size size, Rect rect, int i) {
        this.f11044a = size;
        this.f11045b = rect;
        this.f11046c = i;
    }
}