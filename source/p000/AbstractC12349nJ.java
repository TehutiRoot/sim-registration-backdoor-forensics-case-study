package p000;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* renamed from: nJ */
/* loaded from: classes3.dex */
public abstract class AbstractC12349nJ {

    /* renamed from: d */
    public static final SparseIntArray f72189d;

    /* renamed from: a */
    public final OrientationEventListener f72190a;

    /* renamed from: b */
    public Display f72191b;

    /* renamed from: c */
    public int f72192c = 0;

    /* renamed from: nJ$a */
    /* loaded from: classes3.dex */
    public class C12350a extends OrientationEventListener {

        /* renamed from: a */
        public int f72193a;

        public C12350a(Context context) {
            super(context);
            this.f72193a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            Display display;
            int rotation;
            if (i != -1 && (display = AbstractC12349nJ.this.f72191b) != null && this.f72193a != (rotation = display.getRotation())) {
                this.f72193a = rotation;
                AbstractC12349nJ.this.m26142b(AbstractC12349nJ.f72189d.get(rotation));
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72189d = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 90);
        sparseIntArray.put(2, BitmapUtil.IMAGE_180_DEGREE);
        sparseIntArray.put(3, BitmapUtil.IMAGE_270_DEGREE);
    }

    public AbstractC12349nJ(Context context) {
        this.f72190a = new C12350a(context);
    }

    /* renamed from: a */
    public void m26143a() {
        this.f72190a.disable();
        this.f72191b = null;
    }

    /* renamed from: b */
    public void m26142b(int i) {
        this.f72192c = i;
        mo26139e(i);
    }

    /* renamed from: c */
    public void m26141c(Display display) {
        this.f72191b = display;
        this.f72190a.enable();
        m26142b(f72189d.get(display.getRotation()));
    }

    /* renamed from: d */
    public int m26140d() {
        return this.f72192c;
    }

    /* renamed from: e */
    public abstract void mo26139e(int i);
}
