package p000;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: Cp1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C17458Cp1 {

    /* renamed from: a */
    public final String f847a;

    /* renamed from: b */
    public final Class f848b;

    /* renamed from: c */
    public final C13108ph f849c;

    /* renamed from: d */
    public final String f850d;

    public C17458Cp1(String str, Class cls, C13108ph c13108ph, String str2) {
        this.f847a = str;
        this.f848b = cls;
        this.f849c = c13108ph;
        this.f850d = str2;
    }

    /* renamed from: a */
    public C13108ph m68912a(Object[] objArr) {
        String str = this.f850d;
        if (str == null) {
            return null;
        }
        return new C13108ph(this.f848b, str, objArr, Void.TYPE);
    }

    public String toString() {
        return "[PropertyDescription " + this.f847a + "," + this.f848b + ", " + this.f849c + RemoteSettings.FORWARD_SLASH_STRING + this.f850d + "]";
    }
}