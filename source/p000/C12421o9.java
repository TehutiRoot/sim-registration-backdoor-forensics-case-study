package p000;

import androidx.camera.extensions.internal.Version;

/* renamed from: o9 */
/* loaded from: classes.dex */
public final class C12421o9 extends Version {

    /* renamed from: b */
    public final int f72580b;

    /* renamed from: c */
    public final int f72581c;

    /* renamed from: d */
    public final int f72582d;

    /* renamed from: e */
    public final String f72583e;

    public C12421o9(int i, int i2, int i3, String str) {
        this.f72580b = i;
        this.f72581c = i2;
        this.f72582d = i3;
        if (str != null) {
            this.f72583e = str;
            return;
        }
        throw new NullPointerException("Null description");
    }

    @Override // androidx.camera.extensions.internal.Version
    /* renamed from: b */
    public String mo25958b() {
        return this.f72583e;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* renamed from: c */
    public int mo25957c() {
        return this.f72581c;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* renamed from: d */
    public int mo25956d() {
        return this.f72582d;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMajor() {
        return this.f72580b;
    }
}
