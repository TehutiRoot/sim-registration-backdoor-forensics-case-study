package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ResolutionInfo;

/* renamed from: androidx.camera.core.d */
/* loaded from: classes.dex */
public final class C2462d extends ResolutionInfo.AbstractC2450a {

    /* renamed from: a */
    public final Size f10956a;

    /* renamed from: b */
    public final Rect f10957b;

    /* renamed from: c */
    public final int f10958c;

    /* renamed from: androidx.camera.core.d$b */
    /* loaded from: classes.dex */
    public static final class C2464b extends ResolutionInfo.AbstractC2450a.AbstractC2451a {

        /* renamed from: a */
        public Size f10959a;

        /* renamed from: b */
        public Rect f10960b;

        /* renamed from: c */
        public Integer f10961c;

        @Override // androidx.camera.core.ResolutionInfo.AbstractC2450a.AbstractC2451a
        /* renamed from: a */
        public ResolutionInfo.AbstractC2450a mo63156a() {
            String str = "";
            if (this.f10959a == null) {
                str = " resolution";
            }
            if (this.f10960b == null) {
                str = str + " cropRect";
            }
            if (this.f10961c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C2462d(this.f10959a, this.f10960b, this.f10961c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.ResolutionInfo.AbstractC2450a.AbstractC2451a
        /* renamed from: b */
        public ResolutionInfo.AbstractC2450a.AbstractC2451a mo63155b(Rect rect) {
            if (rect != null) {
                this.f10960b = rect;
                return this;
            }
            throw new NullPointerException("Null cropRect");
        }

        @Override // androidx.camera.core.ResolutionInfo.AbstractC2450a.AbstractC2451a
        /* renamed from: c */
        public ResolutionInfo.AbstractC2450a.AbstractC2451a mo63154c(int i) {
            this.f10961c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public ResolutionInfo.AbstractC2450a.AbstractC2451a m63153d(Size size) {
            if (size != null) {
                this.f10959a = size;
                return this;
            }
            throw new NullPointerException("Null resolution");
        }
    }

    @Override // androidx.camera.core.ResolutionInfo.AbstractC2450a
    /* renamed from: a */
    public Rect mo63159a() {
        return this.f10957b;
    }

    @Override // androidx.camera.core.ResolutionInfo.AbstractC2450a
    /* renamed from: b */
    public Size mo63158b() {
        return this.f10956a;
    }

    @Override // androidx.camera.core.ResolutionInfo.AbstractC2450a
    /* renamed from: c */
    public int mo63157c() {
        return this.f10958c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResolutionInfo.AbstractC2450a)) {
            return false;
        }
        ResolutionInfo.AbstractC2450a abstractC2450a = (ResolutionInfo.AbstractC2450a) obj;
        if (this.f10956a.equals(abstractC2450a.mo63158b()) && this.f10957b.equals(abstractC2450a.mo63159a()) && this.f10958c == abstractC2450a.mo63157c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f10956a.hashCode() ^ 1000003) * 1000003) ^ this.f10957b.hashCode()) * 1000003) ^ this.f10958c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f10956a + ", cropRect=" + this.f10957b + ", rotationDegrees=" + this.f10958c + "}";
    }

    public C2462d(Size size, Rect rect, int i) {
        this.f10956a = size;
        this.f10957b = rect;
        this.f10958c = i;
    }
}
