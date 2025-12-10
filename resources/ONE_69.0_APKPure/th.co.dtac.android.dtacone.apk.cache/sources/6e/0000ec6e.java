package p000;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* renamed from: oJ */
/* loaded from: classes3.dex */
public abstract class AbstractC12429oJ {

    /* renamed from: d */
    public static final SparseIntArray f72748d;

    /* renamed from: a */
    public final OrientationEventListener f72749a;

    /* renamed from: b */
    public Display f72750b;

    /* renamed from: c */
    public int f72751c = 0;

    /* renamed from: oJ$a */
    /* loaded from: classes3.dex */
    public class C12430a extends OrientationEventListener {

        /* renamed from: a */
        public int f72752a;

        public C12430a(Context context) {
            super(context);
            this.f72752a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            Display display;
            int rotation;
            if (i != -1 && (display = AbstractC12429oJ.this.f72750b) != null && this.f72752a != (rotation = display.getRotation())) {
                this.f72752a = rotation;
                AbstractC12429oJ.this.m26135b(AbstractC12429oJ.f72748d.get(rotation));
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72748d = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 90);
        sparseIntArray.put(2, BitmapUtil.IMAGE_180_DEGREE);
        sparseIntArray.put(3, BitmapUtil.IMAGE_270_DEGREE);
    }

    public AbstractC12429oJ(Context context) {
        this.f72749a = new C12430a(context);
    }

    /* renamed from: a */
    public void m26136a() {
        this.f72749a.disable();
        this.f72750b = null;
    }

    /* renamed from: b */
    public void m26135b(int i) {
        this.f72751c = i;
        mo26132e(i);
    }

    /* renamed from: c */
    public void m26134c(Display display) {
        this.f72750b = display;
        this.f72749a.enable();
        m26135b(f72748d.get(display.getRotation()));
    }

    /* renamed from: d */
    public int m26133d() {
        return this.f72751c;
    }

    /* renamed from: e */
    public abstract void mo26132e(int i);
}