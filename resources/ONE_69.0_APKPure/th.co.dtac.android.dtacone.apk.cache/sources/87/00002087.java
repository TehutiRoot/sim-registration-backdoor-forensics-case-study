package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.RequestProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.d */
/* loaded from: classes.dex */
public class C2569d {

    /* renamed from: a */
    public List f11679a = new ArrayList();

    /* renamed from: b */
    public Map f11680b = new HashMap();

    /* renamed from: c */
    public int f11681c = 1;

    /* renamed from: d */
    public int f11682d;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.d$a */
    /* loaded from: classes.dex */
    public static class C2570a implements RequestProcessor.Request {

        /* renamed from: a */
        public final List f11683a;

        /* renamed from: b */
        public final Config f11684b;

        /* renamed from: c */
        public final int f11685c;

        /* renamed from: d */
        public final int f11686d;

        public C2570a(List list, Map map, int i, int i2) {
            this.f11683a = list;
            this.f11685c = i;
            this.f11686d = i2;
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            for (CaptureRequest.Key key : map.keySet()) {
                builder.setCaptureRequestOption(key, map.get(key));
            }
            this.f11684b = builder.build();
        }

        /* renamed from: a */
        public int m62499a() {
            return this.f11686d;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public Config getParameters() {
            return this.f11684b;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public List getTargetOutputConfigIds() {
            return this.f11683a;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.f11685c;
        }
    }

    /* renamed from: a */
    public C2569d m62504a(int i) {
        this.f11679a.add(Integer.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public RequestProcessor.Request m62503b() {
        return new C2570a(this.f11679a, this.f11680b, this.f11681c, this.f11682d);
    }

    /* renamed from: c */
    public C2569d m62502c(int i) {
        this.f11682d = i;
        return this;
    }

    /* renamed from: d */
    public C2569d m62501d(CaptureRequest.Key key, Object obj) {
        this.f11680b.put(key, obj);
        return this;
    }

    /* renamed from: e */
    public C2569d m62500e(int i) {
        this.f11681c = i;
        return this;
    }
}