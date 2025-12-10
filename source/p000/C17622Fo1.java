package p000;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: Fo1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C17622Fo1 {

    /* renamed from: a */
    public final String f1699a;

    /* renamed from: b */
    public final Class f1700b;

    /* renamed from: c */
    public final C13106ph f1701c;

    /* renamed from: d */
    public final String f1702d;

    public C17622Fo1(String str, Class cls, C13106ph c13106ph, String str2) {
        this.f1699a = str;
        this.f1700b = cls;
        this.f1701c = c13106ph;
        this.f1702d = str2;
    }

    /* renamed from: a */
    public C13106ph m68349a(Object[] objArr) {
        String str = this.f1702d;
        if (str == null) {
            return null;
        }
        return new C13106ph(this.f1700b, str, objArr, Void.TYPE);
    }

    public String toString() {
        return "[PropertyDescription " + this.f1699a + "," + this.f1700b + ", " + this.f1701c + RemoteSettings.FORWARD_SLASH_STRING + this.f1702d + "]";
    }
}
