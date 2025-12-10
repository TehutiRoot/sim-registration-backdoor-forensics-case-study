package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Ni */
/* loaded from: classes.dex */
public class C0950Ni {

    /* renamed from: a */
    public int f4233a = 1;

    /* renamed from: b */
    public Map f4234b = new HashMap();

    /* renamed from: c */
    public List f4235c = new ArrayList();

    /* renamed from: Ni$a */
    /* loaded from: classes.dex */
    public static class C0951a implements InterfaceC0882Mi {

        /* renamed from: a */
        public final int f4236a;

        /* renamed from: b */
        public final Map f4237b;

        /* renamed from: c */
        public final List f4238c;

        public C0951a(int i, Map map, List list) {
            this.f4236a = i;
            this.f4237b = map;
            this.f4238c = list;
        }

        @Override // p000.InterfaceC0882Mi
        /* renamed from: a */
        public Map mo67215a() {
            return this.f4237b;
        }

        @Override // p000.InterfaceC0882Mi
        /* renamed from: b */
        public int mo67214b() {
            return this.f4236a;
        }

        @Override // p000.InterfaceC0882Mi
        /* renamed from: c */
        public List mo67213c() {
            return this.f4238c;
        }
    }

    /* renamed from: a */
    public C0950Ni m67219a(InterfaceC0747Ki interfaceC0747Ki) {
        this.f4235c.add(interfaceC0747Ki);
        return this;
    }

    /* renamed from: b */
    public C0950Ni m67218b(CaptureRequest.Key key, Object obj) {
        this.f4234b.put(key, obj);
        return this;
    }

    /* renamed from: c */
    public InterfaceC0882Mi m67217c() {
        return new C0951a(this.f4233a, this.f4234b, this.f4235c);
    }

    /* renamed from: d */
    public C0950Ni m67216d(int i) {
        this.f4233a = i;
        return this;
    }
}