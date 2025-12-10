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
public class C2587d {

    /* renamed from: a */
    public List f11591a = new ArrayList();

    /* renamed from: b */
    public Map f11592b = new HashMap();

    /* renamed from: c */
    public int f11593c = 1;

    /* renamed from: d */
    public int f11594d;

    /* renamed from: androidx.camera.extensions.internal.sessionprocessor.d$a */
    /* loaded from: classes.dex */
    public static class C2588a implements RequestProcessor.Request {

        /* renamed from: a */
        public final List f11595a;

        /* renamed from: b */
        public final Config f11596b;

        /* renamed from: c */
        public final int f11597c;

        /* renamed from: d */
        public final int f11598d;

        public C2588a(List list, Map map, int i, int i2) {
            this.f11595a = list;
            this.f11597c = i;
            this.f11598d = i2;
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            for (CaptureRequest.Key key : map.keySet()) {
                builder.setCaptureRequestOption(key, map.get(key));
            }
            this.f11596b = builder.build();
        }

        /* renamed from: a */
        public int m62551a() {
            return this.f11598d;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public Config getParameters() {
            return this.f11596b;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public List getTargetOutputConfigIds() {
            return this.f11595a;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.f11597c;
        }
    }

    /* renamed from: a */
    public C2587d m62556a(int i) {
        this.f11591a.add(Integer.valueOf(i));
        return this;
    }

    /* renamed from: b */
    public RequestProcessor.Request m62555b() {
        return new C2588a(this.f11591a, this.f11592b, this.f11593c, this.f11594d);
    }

    /* renamed from: c */
    public C2587d m62554c(int i) {
        this.f11594d = i;
        return this;
    }

    /* renamed from: d */
    public C2587d m62553d(CaptureRequest.Key key, Object obj) {
        this.f11592b.put(key, obj);
        return this;
    }

    /* renamed from: e */
    public C2587d m62552e(int i) {
        this.f11593c = i;
        return this;
    }
}
