package com.google.android.cameraview;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.Surface;
import com.google.android.cameraview.AbstractC6207d;
import com.google.android.cameraview.AbstractC6209e;
import com.google.android.cameraview.C6198b;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.cameraview.b */
/* loaded from: classes3.dex */
public class C6198b extends AbstractC6207d {

    /* renamed from: y */
    public static final SparseIntArray f43830y;

    /* renamed from: c */
    public final CameraManager f43831c;

    /* renamed from: d */
    public int f43832d;

    /* renamed from: e */
    public final CameraDevice.StateCallback f43833e;

    /* renamed from: f */
    public final CameraCaptureSession.StateCallback f43834f;

    /* renamed from: g */
    public AbstractC6205g f43835g;

    /* renamed from: h */
    public final ImageReader.OnImageAvailableListener f43836h;

    /* renamed from: i */
    public String f43837i;

    /* renamed from: j */
    public CameraCharacteristics f43838j;

    /* renamed from: k */
    public CameraDevice f43839k;

    /* renamed from: l */
    public CameraCaptureSession f43840l;

    /* renamed from: m */
    public CaptureRequest.Builder f43841m;

    /* renamed from: n */
    public ImageReader f43842n;

    /* renamed from: o */
    public final KJ1 f43843o;

    /* renamed from: p */
    public final KJ1 f43844p;

    /* renamed from: q */
    public int f43845q;

    /* renamed from: r */
    public Semaphore f43846r;

    /* renamed from: s */
    public AspectRatio f43847s;

    /* renamed from: t */
    public boolean f43848t;

    /* renamed from: u */
    public int f43849u;

    /* renamed from: v */
    public int f43850v;

    /* renamed from: w */
    public HandlerThread f43851w;

    /* renamed from: x */
    public Handler f43852x;

    /* renamed from: com.google.android.cameraview.b$a */
    /* loaded from: classes3.dex */
    public class C6199a extends CameraDevice.StateCallback {
        public C6199a() {
            C6198b.this = r1;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            C6198b.this.f43846r.release();
            cameraDevice.close();
            C6198b.this.f43860a.mo49187a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C6198b.this.f43846r.release();
            cameraDevice.close();
            C6198b.this.f43839k = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            C6198b.this.f43846r.release();
            StringBuilder sb = new StringBuilder();
            sb.append("onError: ");
            sb.append(cameraDevice.getId());
            sb.append(" (");
            sb.append(i);
            sb.append(")");
            cameraDevice.close();
            C6198b.this.mo49189n();
            C6198b.this.f43839k = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C6198b.this.f43846r.release();
            C6198b c6198b = C6198b.this;
            c6198b.f43839k = cameraDevice;
            c6198b.f43860a.mo49186b();
            C6198b.this.m49223B();
        }
    }

    /* renamed from: com.google.android.cameraview.b$b */
    /* loaded from: classes3.dex */
    public class C6200b extends CameraCaptureSession.StateCallback {
        public C6200b() {
            C6198b.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            CameraCaptureSession cameraCaptureSession2 = C6198b.this.f43840l;
            if (cameraCaptureSession2 != null && cameraCaptureSession2.equals(cameraCaptureSession)) {
                C6198b.this.f43840l = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C6198b c6198b = C6198b.this;
            if (c6198b.f43839k == null) {
                return;
            }
            c6198b.f43840l = cameraCaptureSession;
            c6198b.m49219F();
            C6198b.this.m49218G();
            try {
                C6198b c6198b2 = C6198b.this;
                CameraCaptureSession cameraCaptureSession2 = c6198b2.f43840l;
                CaptureRequest build = c6198b2.f43841m.build();
                C6198b c6198b3 = C6198b.this;
                cameraCaptureSession2.setRepeatingRequest(build, c6198b3.f43835g, c6198b3.f43852x);
            } catch (CameraAccessException | IllegalStateException unused) {
            }
        }
    }

    /* renamed from: com.google.android.cameraview.b$c */
    /* loaded from: classes3.dex */
    public class C6201c extends AbstractC6205g {
        public C6201c() {
            C6198b.this = r1;
        }

        @Override // com.google.android.cameraview.C6198b.AbstractC6205g
        /* renamed from: a */
        public void mo49207a() {
            CaptureRequest.Builder builder = C6198b.this.f43841m;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder.set(key, 1);
            m49204d(3);
            try {
                C6198b c6198b = C6198b.this;
                c6198b.f43840l.capture(c6198b.f43841m.build(), this, C6198b.this.f43852x);
                C6198b.this.f43841m.set(key, 0);
            } catch (CameraAccessException unused) {
            }
        }

        @Override // com.google.android.cameraview.C6198b.AbstractC6205g
        /* renamed from: b */
        public void mo49206b() {
            C6198b.this.m49214s();
        }
    }

    /* renamed from: com.google.android.cameraview.b$d */
    /* loaded from: classes3.dex */
    public class C6202d implements ImageReader.OnImageAvailableListener {
        public C6202d() {
            C6198b.this = r1;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image acquireNextImage = imageReader.acquireNextImage();
            try {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (planes.length > 0) {
                    ByteBuffer buffer = planes[0].getBuffer();
                    byte[] bArr = new byte[buffer.remaining()];
                    buffer.get(bArr);
                    C6198b.this.f43860a.onPictureTaken(bArr);
                }
                acquireNextImage.close();
            } catch (Throwable th2) {
                if (acquireNextImage != null) {
                    try {
                        acquireNextImage.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* renamed from: com.google.android.cameraview.b$e */
    /* loaded from: classes3.dex */
    public class C6203e implements AbstractC6209e.InterfaceC6210a {
        public C6203e() {
            C6198b.this = r1;
        }

        @Override // com.google.android.cameraview.AbstractC6209e.InterfaceC6210a
        /* renamed from: a */
        public void mo49179a() {
            C6198b.this.m49223B();
        }
    }

    /* renamed from: com.google.android.cameraview.b$f */
    /* loaded from: classes3.dex */
    public class C6204f extends CameraCaptureSession.CaptureCallback {
        public C6204f() {
            C6198b.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C6198b.this.m49220E();
        }
    }

    /* renamed from: com.google.android.cameraview.b$g */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6205g extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public int f43859a;

        /* renamed from: a */
        public abstract void mo49207a();

        /* renamed from: b */
        public abstract void mo49206b();

        /* renamed from: c */
        public final void m49205c(CaptureResult captureResult) {
            int i = this.f43859a;
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num == null || num.intValue() != 5) {
                            m49204d(5);
                            mo49206b();
                            return;
                        }
                        return;
                    }
                    return;
                }
                Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num2 == null || num2.intValue() == 5 || num2.intValue() == 4 || num2.intValue() == 2) {
                    m49204d(4);
                    return;
                }
                return;
            }
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num3 != null) {
                if (num3.intValue() == 4 || num3.intValue() == 5) {
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 != null && num4.intValue() != 2) {
                        m49204d(2);
                        mo49207a();
                        return;
                    }
                    m49204d(5);
                    mo49206b();
                }
            }
        }

        /* renamed from: d */
        public void m49204d(int i) {
            this.f43859a = i;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m49205c(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m49205c(captureResult);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43830y = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(1, 0);
    }

    public C6198b(AbstractC6207d.InterfaceC6208a interfaceC6208a, AbstractC6209e abstractC6209e, Context context) {
        super(interfaceC6208a, abstractC6209e);
        this.f43832d = 200;
        this.f43833e = new C6199a();
        this.f43834f = new C6200b();
        this.f43835g = new C6201c();
        this.f43836h = new C6202d();
        this.f43843o = new KJ1();
        this.f43844p = new KJ1();
        this.f43846r = new Semaphore(1);
        this.f43847s = InterfaceC12325mx.f72089a;
        this.f43831c = (CameraManager) context.getSystemService("camera");
        this.f43861b.m49181k(new C6203e());
    }

    /* renamed from: p */
    public static /* synthetic */ void m49217p(C6198b c6198b) {
        c6198b.m49210x();
    }

    /* renamed from: A */
    public final void m49224A() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f43851w = handlerThread;
        handlerThread.start();
        this.f43852x = new Handler(this.f43851w.getLooper());
    }

    /* renamed from: B */
    public void m49223B() {
        if (mo49196g() && this.f43861b.mo49174i() && this.f43842n != null) {
            new Handler().postDelayed(new Runnable() { // from class: wh
                {
                    C6198b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C6198b.m49217p(C6198b.this);
                }
            }, this.f43832d);
        }
    }

    /* renamed from: C */
    public final void m49222C() {
        try {
            if (this.f43846r.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                this.f43831c.openCamera(this.f43837i, this.f43833e, (Handler) null);
                return;
            }
            throw new RuntimeException("Time out waiting to lock camera opening.");
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to open camera: " + this.f43837i, e);
        } catch (InterruptedException e2) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.", e2);
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: D */
    public final void m49221D() {
        try {
            this.f43851w.quitSafely();
            this.f43851w.join();
            this.f43851w = null;
            this.f43852x = null;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: E */
    public void m49220E() {
        CaptureRequest.Builder builder = this.f43841m;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        builder.set(key, 2);
        try {
            this.f43840l.capture(this.f43841m.build(), this.f43835g, this.f43852x);
            m49219F();
            m49218G();
            this.f43841m.set(key, 0);
            this.f43840l.setRepeatingRequest(this.f43841m.build(), this.f43835g, this.f43852x);
            this.f43835g.m49204d(0);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: F */
    public void m49219F() {
        if (this.f43848t) {
            int[] iArr = (int[]) this.f43838j.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr != null && iArr.length != 0 && (iArr.length != 1 || iArr[0] != 0)) {
                this.f43841m.set(CaptureRequest.CONTROL_AF_MODE, 4);
                return;
            }
            this.f43848t = false;
            this.f43841m.set(CaptureRequest.CONTROL_AF_MODE, 0);
            return;
        }
        this.f43841m.set(CaptureRequest.CONTROL_AF_MODE, 0);
    }

    /* renamed from: G */
    public void m49218G() {
        int i = this.f43849u;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.f43841m.set(CaptureRequest.CONTROL_AE_MODE, 4);
                            this.f43841m.set(CaptureRequest.FLASH_MODE, 0);
                            return;
                        }
                        return;
                    }
                    this.f43841m.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    this.f43841m.set(CaptureRequest.FLASH_MODE, 0);
                    return;
                }
                this.f43841m.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.f43841m.set(CaptureRequest.FLASH_MODE, 2);
                return;
            }
            this.f43841m.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f43841m.set(CaptureRequest.FLASH_MODE, 0);
            return;
        }
        this.f43841m.set(CaptureRequest.CONTROL_AE_MODE, 1);
        this.f43841m.set(CaptureRequest.FLASH_MODE, 0);
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: a */
    public AspectRatio mo49202a() {
        return this.f43847s;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: b */
    public boolean mo49201b() {
        return this.f43848t;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: c */
    public int mo49200c() {
        return this.f43845q;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: d */
    public int mo49199d() {
        return this.f43849u;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: e */
    public Set mo49198e() {
        return this.f43843o.m67623d();
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: g */
    public boolean mo49196g() {
        if (this.f43839k != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: h */
    public boolean mo49195h(AspectRatio aspectRatio) {
        if (aspectRatio != null && !aspectRatio.equals(this.f43847s) && this.f43843o.m67623d().contains(aspectRatio)) {
            this.f43847s = aspectRatio;
            m49208z();
            CameraCaptureSession cameraCaptureSession = this.f43840l;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f43840l = null;
                m49223B();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: i */
    public void mo49194i(boolean z) {
        if (this.f43848t == z) {
            return;
        }
        this.f43848t = z;
        if (this.f43841m != null) {
            m49219F();
            CameraCaptureSession cameraCaptureSession = this.f43840l;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(this.f43841m.build(), this.f43835g, this.f43852x);
                } catch (CameraAccessException unused) {
                    this.f43848t = !this.f43848t;
                }
            }
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: j */
    public void mo49193j(int i) {
        this.f43850v = i;
        this.f43861b.mo49172l(i);
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: k */
    public void mo49192k(int i) {
        if (this.f43845q == i) {
            return;
        }
        this.f43845q = i;
        if (mo49196g()) {
            mo49189n();
            mo49190m();
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: l */
    public void mo49191l(int i) {
        int i2 = this.f43849u;
        if (i2 == i) {
            return;
        }
        this.f43849u = i;
        if (this.f43841m != null) {
            m49218G();
            CameraCaptureSession cameraCaptureSession = this.f43840l;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(this.f43841m.build(), this.f43835g, this.f43852x);
                } catch (CameraAccessException unused) {
                    this.f43849u = i2;
                }
            }
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: m */
    public boolean mo49190m() {
        if (!m49213t()) {
            return false;
        }
        m49224A();
        m49211v();
        m49208z();
        m49222C();
        return true;
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: n */
    public void mo49189n() {
        try {
            try {
                m49221D();
                this.f43846r.acquire();
                CameraCaptureSession cameraCaptureSession = this.f43840l;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.f43840l = null;
                }
                CameraDevice cameraDevice = this.f43839k;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.f43839k = null;
                }
                ImageReader imageReader = this.f43842n;
                if (imageReader != null) {
                    imageReader.close();
                    this.f43842n = null;
                }
                this.f43846r.release();
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e);
            }
        } catch (Throwable th2) {
            this.f43846r.release();
            throw th2;
        }
    }

    @Override // com.google.android.cameraview.AbstractC6207d
    /* renamed from: o */
    public void mo49188o() {
        if (this.f43848t) {
            m49209y();
        } else {
            m49214s();
        }
    }

    /* renamed from: s */
    public void m49214s() {
        try {
            CaptureRequest.Builder createCaptureRequest = this.f43839k.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f43842n.getSurface());
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
            createCaptureRequest.set(key, (Integer) this.f43841m.get(key));
            int i = this.f43849u;
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
                            }
                        } else {
                            createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
                        }
                    } else {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                        createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
                    }
                } else {
                    createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
                }
            } else {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
            }
            int intValue = ((Integer) this.f43838j.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            CaptureRequest.Key key2 = CaptureRequest.JPEG_ORIENTATION;
            int i3 = this.f43850v;
            if (this.f43845q != 1) {
                i2 = -1;
            }
            createCaptureRequest.set(key2, Integer.valueOf(((intValue + (i3 * i2)) + 360) % 360));
            this.f43840l.stopRepeating();
            this.f43840l.capture(createCaptureRequest.build(), new C6204f(), this.f43852x);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: t */
    public final boolean m49213t() {
        try {
            int i = f43830y.get(this.f43845q);
            String[] cameraIdList = this.f43831c.getCameraIdList();
            if (cameraIdList.length != 0) {
                for (String str : cameraIdList) {
                    CameraCharacteristics cameraCharacteristics = this.f43831c.getCameraCharacteristics(str);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    if (num != null && num.intValue() != 2) {
                        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num2 != null) {
                            if (num2.intValue() == i) {
                                this.f43837i = str;
                                this.f43838j = cameraCharacteristics;
                                return true;
                            }
                        } else {
                            throw new NullPointerException("Unexpected state: LENS_FACING null");
                        }
                    }
                }
                String str2 = cameraIdList[0];
                this.f43837i = str2;
                CameraCharacteristics cameraCharacteristics2 = this.f43831c.getCameraCharacteristics(str2);
                this.f43838j = cameraCharacteristics2;
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num3 != null && num3.intValue() != 2) {
                    Integer num4 = (Integer) this.f43838j.get(CameraCharacteristics.LENS_FACING);
                    if (num4 != null) {
                        int size = f43830y.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            SparseIntArray sparseIntArray = f43830y;
                            if (sparseIntArray.valueAt(i2) == num4.intValue()) {
                                this.f43845q = sparseIntArray.keyAt(i2);
                                return true;
                            }
                        }
                        this.f43845q = 0;
                        return true;
                    }
                    throw new NullPointerException("Unexpected state: LENS_FACING null");
                }
                return false;
            }
            throw new RuntimeException("No camera available.");
        } catch (CameraAccessException e) {
            throw new RuntimeException("Failed to get a list of camera devices", e);
        }
    }

    /* renamed from: u */
    public final Size m49212u() {
        int m49182h = this.f43861b.m49182h();
        int m49184b = this.f43861b.m49184b();
        if (m49182h < m49184b) {
            m49184b = m49182h;
            m49182h = m49184b;
        }
        SortedSet<Size> m67621f = this.f43843o.m67621f(this.f43847s);
        TreeSet<Size> treeSet = new TreeSet();
        for (Size size : m67621f) {
            if (size.getWidth() <= 1920 && size.getHeight() <= 1080) {
                treeSet.add(size);
            }
        }
        for (Size size2 : treeSet) {
            if (size2.getWidth() >= m49182h && size2.getHeight() >= m49184b) {
                return size2;
            }
        }
        return (Size) treeSet.last();
    }

    /* renamed from: v */
    public final void m49211v() {
        android.util.Size[] outputSizes;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f43838j.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            this.f43843o.m67625b();
            for (android.util.Size size : streamConfigurationMap.getOutputSizes(this.f43861b.mo49178c())) {
                this.f43843o.m67626a(new Size(size.getWidth(), size.getHeight()));
            }
            this.f43844p.m67625b();
            mo49203w(this.f43844p, streamConfigurationMap);
            if (!this.f43843o.m67623d().contains(this.f43847s)) {
                this.f43847s = (AspectRatio) this.f43843o.m67623d().iterator().next();
                return;
            }
            return;
        }
        throw new IllegalStateException("Failed to get configuration map: " + this.f43837i);
    }

    /* renamed from: w */
    public void mo49203w(KJ1 kj1, StreamConfigurationMap streamConfigurationMap) {
        android.util.Size[] outputSizes;
        for (android.util.Size size : streamConfigurationMap.getOutputSizes(256)) {
            this.f43844p.m67626a(new Size(size.getWidth(), size.getHeight()));
        }
    }

    /* renamed from: x */
    public final /* synthetic */ void m49210x() {
        if (mo49196g() && this.f43861b.mo49174i() && this.f43842n != null) {
            Size m49212u = m49212u();
            this.f43861b.mo49173j(m49212u.getWidth(), m49212u.getHeight());
            Surface mo49177d = this.f43861b.mo49177d();
            try {
                CaptureRequest.Builder createCaptureRequest = this.f43839k.createCaptureRequest(1);
                this.f43841m = createCaptureRequest;
                createCaptureRequest.addTarget(mo49177d);
                this.f43839k.createCaptureSession(Arrays.asList(mo49177d, this.f43842n.getSurface()), this.f43834f, null);
            } catch (CameraAccessException e) {
                e.getMessage();
            }
        }
    }

    /* renamed from: y */
    public final void m49209y() {
        this.f43841m.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.f43835g.m49204d(1);
            this.f43840l.capture(this.f43841m.build(), this.f43835g, this.f43852x);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: z */
    public final void m49208z() {
        Size size;
        ImageReader imageReader = this.f43842n;
        if (imageReader != null) {
            imageReader.close();
        }
        if (this.f43844p.m67621f(this.f43847s) == null) {
            KJ1 kj1 = this.f43844p;
            size = (Size) kj1.m67621f((AspectRatio) kj1.f3168a.keyAt(0)).last();
        } else {
            size = (Size) this.f43844p.m67621f(this.f43847s).last();
        }
        ImageReader newInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 2);
        this.f43842n = newInstance;
        newInstance.setOnImageAvailableListener(this.f43836h, null);
    }
}
