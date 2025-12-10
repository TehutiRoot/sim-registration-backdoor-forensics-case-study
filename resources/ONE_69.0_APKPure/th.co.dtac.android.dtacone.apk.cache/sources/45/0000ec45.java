package p000;

import androidx.camera.extensions.internal.Version;

/* renamed from: o9 */
/* loaded from: classes.dex */
public final class C12418o9 extends Version {

    /* renamed from: b */
    public final int f72687b;

    /* renamed from: c */
    public final int f72688c;

    /* renamed from: d */
    public final int f72689d;

    /* renamed from: e */
    public final String f72690e;

    public C12418o9(int i, int i2, int i3, String str) {
        this.f72687b = i;
        this.f72688c = i2;
        this.f72689d = i3;
        if (str != null) {
            this.f72690e = str;
            return;
        }
        throw new NullPointerException("Null description");
    }

    @Override // androidx.camera.extensions.internal.Version
    /* renamed from: b */
    public String mo26149b() {
        return this.f72690e;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* renamed from: c */
    public int mo26148c() {
        return this.f72688c;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* renamed from: d */
    public int mo26147d() {
        return this.f72689d;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMajor() {
        return this.f72687b;
    }
}