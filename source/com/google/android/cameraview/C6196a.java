package com.google.android.cameraview;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.collection.SparseArrayCompat;
import com.google.android.cameraview.AbstractC6207d;
import com.google.android.cameraview.AbstractC6209e;
import com.google.android.cameraview.C6196a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.cameraview.a */
/* loaded from: classes3.dex */
public class C6196a extends AbstractC6207d {

    /* renamed from: p */
    public static final SparseArrayCompat f43815p;

    /* renamed from: c */
    public int f43816c;

    /* renamed from: d */
    public final AtomicBoolean f43817d;

    /* renamed from: e */
    public Camera f43818e;

    /* renamed from: f */
    public Camera.Parameters f43819f;

    /* renamed from: g */
    public final Camera.CameraInfo f43820g;

    /* renamed from: h */
    public final KJ1 f43821h;

    /* renamed from: i */
    public final KJ1 f43822i;

    /* renamed from: j */
    public AspectRatio f43823j;

    /* renamed from: k */
    public boolean f43824k;

    /* renamed from: l */
    public boolean f43825l;

    /* renamed from: m */
    public int f43826m;

    /* renamed from: n */
    public int f43827n;

    /* renamed from: o */
    public int f43828o;

    /* renamed from: com.google.android.cameraview.a$a */
    /* loaded from: classes3.dex */
    public class C6197a implements AbstractC6209e.InterfaceC6210a {
        public C6197a() {
            C6196a.this = r1;
        }

        @Override // com.google.android.cameraview.AbstractC6209e.InterfaceC6210a
        /* renamed from: a */
        public void mo49179a() {
            C6196a c6196a = C6196a.this;
            if (c6196a.f43818e != null) {
                c6196a.m49237C();
                C6196a.this.m49233r();
            }
        }
    }

    static {
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        f43815p = sparseArrayCompat;
        sparseArrayCompat.put(0, "off");
        sparseArrayCompat.put(1, "on");
        sparseArrayCompat.put(2, "torch");
        sparseArrayCompat.put(3, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        sparseArrayCompat.put(4, "red-eye");
    }

    public C6196a(AbstractC6207d.InterfaceC6208a interfaceC6208a, AbstractC6209e abstractC6209e) {
        super(interfaceC6208a, abstractC6209e);
        this.f43817d = new AtomicBoolean(false);
        this.f43820g = new Camera.CameraInfo();
        this.f43821h = new KJ1();
        this.f43822i = new KJ1();
        abstractC6209e.m49181k(new C6197a());
    }

    /* renamed from: p */
    public static /* synthetic */ void m49235p(C6196a c6196a, byte[] bArr, Camera camera) {
        c6196a.m49227x(bArr, camera);
    }

    /* renamed from: q */
    public static /* synthetic */ void m49234q(C6196a c6196a, boolean z, Camera camera) {
        c6196a.m49228w(z, camera);
    }

    /* renamed from: A */
    public final boolean m49239A(boolean z) {
        this.f43825l = z;
        if (!mo49196g()) {
            return false;
        }
        List<String> supportedFocusModes = this.f43819f.getSupportedFocusModes();
        if (z && supportedFocusModes.contains("continuous-picture")) {
            this.f43819f.setFocusMode("continuous-picture");
            return true;
        } else if (supportedFocusModes.contains("fixed")) {
            this.f43819f.setFocusMode("fixed");
            return true;
        } else if (supportedFocusModes.contains("infinity")) {
            this.f43819f.setFocusMode("infinity");
            return true;
        } else {
            this.f43819f.setFocusMode(supportedFocusModes.get(0));
            return true;
        }
    }

    /* renamed from: B */
    public final boolean m49238B(int i) {
        if (mo49196g()) {
            List<String> supportedFlashModes = this.f43819f.getSupportedFlashModes();
            SparseArrayCompat sparseArrayCompat = f43815p;
            String str = (String) sparseArrayCompat.get(i);
            if (supportedFlashModes != null && supportedFlashModes.contains(str)) {
                this.f43819f.setFlashMode(str);
                this.f43827n = i;
                return true;
            }
            String str2 = (String) sparseArrayCompat.get(this.f43827n);
            if (supportedFlashModes != null && supportedFlashModes.contains(str2)) {
                return false;
            }
            this.f43819f.setFlashMode("off");
            this.f43827n = 0;
            return true;
        }
        this.f43827n = i;
        return false;
    }

    /* renamed from: C */
    public void m49237C() {
        try {
            if (this.f43861b.mo49178c() == SurfaceHolder.class) {
                this.f43818e.setPreviewDisplay(this.f43861b.m49183e());
            } else {
                this.f43818e.setPreviewTexture((SurfaceTexture) this.f43861b.mo49176f());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: D */
    public void m49236D() {
        if (!this.f43817d.getAndSet(true)) {
            this.f43818e.takePicture(null, null, null, new Camera.PictureCallback() { // from class: vh
                {
                    C6196a.this = this;
                }

                @Override // android.hardware.Camera.PictureCallback
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    C6196a.m49235p(C6196a.this, bArr, camera);
                }
            });
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: a */
    public AspectRatio mo49202a() {
        return this.f43823j;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: b */
    public boolean mo49201b() {
        if (!mo49196g()) {
            return this.f43825l;
        }
        String focusMode = this.f43819f.getFocusMode();
        if (focusMode != null && focusMode.contains("continuous")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: c */
    public int mo49200c() {
        return this.f43826m;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: d */
    public int mo49199d() {
        return this.f43827n;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: e */
    public Set mo49198e() {
        KJ1 kj1 = this.f43821h;
        for (AspectRatio aspectRatio : kj1.m67623d()) {
            if (this.f43822i.m67621f(aspectRatio) == null) {
                kj1.m67622e(aspectRatio);
            }
        }
        return kj1.m67623d();
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: g */
    public boolean mo49196g() {
        if (this.f43818e != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: h */
    public boolean mo49195h(AspectRatio aspectRatio) {
        if (this.f43823j != null && mo49196g()) {
            if (!this.f43823j.equals(aspectRatio)) {
                if (this.f43821h.m67621f(aspectRatio) != null) {
                    this.f43823j = aspectRatio;
                    m49233r();
                    return true;
                }
                throw new UnsupportedOperationException(aspectRatio + " is not supported");
            }
            return false;
        }
        this.f43823j = aspectRatio;
        return true;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: i */
    public void mo49194i(boolean z) {
        if (this.f43825l != z && m49239A(z)) {
            this.f43818e.setParameters(this.f43819f);
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: j */
    public void mo49193j(int i) {
        if (this.f43828o == i) {
            return;
        }
        this.f43828o = i;
        if (mo49196g()) {
            int m49232s = m49232s(i);
            this.f43819f.setRotation(m49232s);
            this.f43818e.setParameters(this.f43819f);
            this.f43818e.setDisplayOrientation(m49232s);
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: k */
    public void mo49192k(int i) {
        if (this.f43826m == i) {
            return;
        }
        this.f43826m = i;
        if (mo49196g()) {
            mo49189n();
            mo49190m();
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: l */
    public void mo49191l(int i) {
        if (i != this.f43827n && m49238B(i)) {
            this.f43818e.setParameters(this.f43819f);
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: m */
    public boolean mo49190m() {
        m49230u();
        m49226y();
        if (this.f43861b.mo49174i()) {
            m49237C();
        }
        this.f43824k = true;
        this.f43818e.startPreview();
        return true;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: n */
    public void mo49189n() {
        Camera camera = this.f43818e;
        if (camera != null) {
            camera.stopPreview();
        }
        this.f43824k = false;
        m49225z();
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: o */
    public void mo49188o() {
        if (mo49196g()) {
            try {
                if (mo49201b()) {
                    this.f43818e.cancelAutoFocus();
                    this.f43818e.autoFocus(new Camera.AutoFocusCallback() { // from class: uh
                        {
                            C6196a.this = this;
                        }

                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z, Camera camera) {
                            C6196a.m49234q(C6196a.this, z, camera);
                        }
                    });
                } else {
                    m49236D();
                }
                return;
            } catch (Exception e) {
                Log.getStackTraceString(e);
                return;
            }
        }
        throw new IllegalStateException("Camera is not ready. Call start() before takePicture().");
    }

    /* renamed from: r */
    public void m49233r() {
        SortedSet m67621f = this.f43821h.m67621f(this.f43823j);
        if (m67621f == null) {
            AspectRatio m49231t = m49231t();
            this.f43823j = m49231t;
            m67621f = this.f43821h.m67621f(m49231t);
        }
        Size m49229v = m49229v(m67621f);
        Camera.Size pictureSize = this.f43819f.getPictureSize();
        if (pictureSize.width != m49229v.getWidth() || pictureSize.height != m49229v.getHeight()) {
            Size size = (Size) this.f43822i.m67621f(this.f43823j).last();
            if (this.f43824k) {
                this.f43818e.stopPreview();
            }
            this.f43819f.setPreviewSize(m49229v.getWidth(), m49229v.getHeight());
            this.f43819f.setPictureSize(size.getWidth(), size.getHeight());
            this.f43819f.setRotation(m49232s(this.f43828o));
            m49239A(this.f43825l);
            m49238B(this.f43827n);
            this.f43818e.setParameters(this.f43819f);
            if (this.f43824k) {
                this.f43818e.startPreview();
            }
        }
    }

    /* renamed from: s */
    public final int m49232s(int i) {
        Camera.CameraInfo cameraInfo = this.f43820g;
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    /* renamed from: t */
    public final AspectRatio m49231t() {
        r1 = null;
        for (AspectRatio aspectRatio : this.f43821h.m67623d()) {
            if (aspectRatio.equals(InterfaceC12325mx.f72089a)) {
                break;
            }
        }
        return aspectRatio;
    }

    /* renamed from: u */
    public final void m49230u() {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, this.f43820g);
            if (this.f43820g.facing == this.f43826m) {
                this.f43816c = i;
                return;
            }
        }
        this.f43816c = -1;
    }

    /* renamed from: v */
    public final Size m49229v(SortedSet sortedSet) {
        if (!this.f43861b.mo49174i()) {
            return (Size) sortedSet.first();
        }
        int m49182h = this.f43861b.m49182h();
        int m49184b = this.f43861b.m49184b();
        int i = this.f43828o;
        if (i == 90 || i == 270) {
            m49184b = m49182h;
            m49182h = m49184b;
        }
        Iterator it = sortedSet.iterator();
        Size size = null;
        while (it.hasNext()) {
            size = (Size) it.next();
            if (m49182h <= size.getWidth() && m49184b <= size.getHeight()) {
                break;
            }
        }
        return size;
    }

    /* renamed from: w */
    public final /* synthetic */ void m49228w(boolean z, Camera camera) {
        m49236D();
    }

    /* renamed from: x */
    public final /* synthetic */ void m49227x(byte[] bArr, Camera camera) {
        this.f43817d.set(false);
        this.f43860a.onPictureTaken(bArr);
        camera.cancelAutoFocus();
        camera.startPreview();
    }

    /* renamed from: y */
    public final void m49226y() {
        if (this.f43818e != null) {
            m49225z();
        }
        Camera open = Camera.open(this.f43816c);
        this.f43818e = open;
        this.f43819f = open.getParameters();
        this.f43821h.m67625b();
        for (Camera.Size size : this.f43819f.getSupportedPreviewSizes()) {
            this.f43821h.m67626a(new Size(size.width, size.height));
        }
        this.f43822i.m67625b();
        for (Camera.Size size2 : this.f43819f.getSupportedPictureSizes()) {
            this.f43822i.m67626a(new Size(size2.width, size2.height));
        }
        if (this.f43823j == null) {
            this.f43823j = InterfaceC12325mx.f72089a;
        }
        m49233r();
        this.f43818e.setDisplayOrientation(m49232s(this.f43828o));
        this.f43860a.mo49186b();
    }

    /* renamed from: z */
    public final void m49225z() {
        Camera camera = this.f43818e;
        if (camera != null) {
            camera.release();
            this.f43818e = null;
            this.f43860a.mo49187a();
        }
    }
}
