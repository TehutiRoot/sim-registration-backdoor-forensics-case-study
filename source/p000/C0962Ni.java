package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Ni */
/* loaded from: classes.dex */
public class C0962Ni {

    /* renamed from: a */
    public int f4166a = 1;

    /* renamed from: b */
    public Map f4167b = new HashMap();

    /* renamed from: c */
    public List f4168c = new ArrayList();

    /* renamed from: Ni$a */
    /* loaded from: classes.dex */
    public static class C0963a implements InterfaceC0887Mi {

        /* renamed from: a */
        public final int f4169a;

        /* renamed from: b */
        public final Map f4170b;

        /* renamed from: c */
        public final List f4171c;

        public C0963a(int i, Map map, List list) {
            this.f4169a = i;
            this.f4170b = map;
            this.f4171c = list;
        }

        @Override // p000.InterfaceC0887Mi
        /* renamed from: a */
        public Map mo67195a() {
            return this.f4170b;
        }

        @Override // p000.InterfaceC0887Mi
        /* renamed from: b */
        public int mo67194b() {
            return this.f4169a;
        }

        @Override // p000.InterfaceC0887Mi
        /* renamed from: c */
        public List mo67193c() {
            return this.f4171c;
        }
    }

    /* renamed from: a */
    public C0962Ni m67199a(InterfaceC0757Ki interfaceC0757Ki) {
        this.f4168c.add(interfaceC0757Ki);
        return this;
    }

    /* renamed from: b */
    public C0962Ni m67198b(CaptureRequest.Key key, Object obj) {
        this.f4167b.put(key, obj);
        return this;
    }

    /* renamed from: c */
    public InterfaceC0887Mi m67197c() {
        return new C0963a(this.f4166a, this.f4167b, this.f4168c);
    }

    /* renamed from: d */
    public C0962Ni m67196d(int i) {
        this.f4166a = i;
        return this;
    }
}
