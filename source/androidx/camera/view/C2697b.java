package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewView;
import androidx.core.util.Preconditions;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: androidx.camera.view.b */
/* loaded from: classes.dex */
public final class C2697b {

    /* renamed from: i */
    public static final PreviewView.ScaleType f12201i = PreviewView.ScaleType.FILL_CENTER;

    /* renamed from: a */
    public Size f12202a;

    /* renamed from: b */
    public Rect f12203b;

    /* renamed from: c */
    public int f12204c;

    /* renamed from: d */
    public Matrix f12205d;

    /* renamed from: e */
    public int f12206e;

    /* renamed from: f */
    public boolean f12207f;

    /* renamed from: g */
    public boolean f12208g;

    /* renamed from: h */
    public PreviewView.ScaleType f12209h = f12201i;

    /* renamed from: androidx.camera.view.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2698a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12210a;

        static {
            int[] iArr = new int[PreviewView.ScaleType.values().length];
            f12210a = iArr;
            try {
                iArr[PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12210a[PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12210a[PreviewView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12210a[PreviewView.ScaleType.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12210a[PreviewView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12210a[PreviewView.ScaleType.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: b */
    public static RectF m61849b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    /* renamed from: p */
    public static void m61835p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.ScaleType scaleType) {
        Matrix.ScaleToFit scaleToFit;
        switch (C2698a.f12210a[scaleType.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                Logger.m63228e("PreviewTransform", "Unexpected crop rect: " + scaleType);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (scaleType != PreviewView.ScaleType.FIT_CENTER && scaleType != PreviewView.ScaleType.FIT_START && scaleType != PreviewView.ScaleType.FIT_END) {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
            return;
        }
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
    }

    /* renamed from: a */
    public Bitmap m61850a(Bitmap bitmap, Size size, int i) {
        if (!m61838m()) {
            return bitmap;
        }
        Matrix m61840k = m61840k();
        RectF m61839l = m61839l(size, i);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(m61840k);
        matrix.postScale(m61839l.width() / this.f12202a.getWidth(), m61839l.height() / this.f12202a.getHeight());
        matrix.postTranslate(m61839l.left, m61839l.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    /* renamed from: c */
    public Matrix m61848c(Size size, int i) {
        if (!m61838m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        m61841j(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f12202a.getWidth(), this.f12202a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: d */
    public RectF m61847d(Size size, int i) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size m61845f = m61845f();
        RectF rectF2 = new RectF(0.0f, 0.0f, m61845f.getWidth(), m61845f.getHeight());
        Matrix matrix = new Matrix();
        m61835p(matrix, rectF2, rectF, this.f12209h);
        matrix.mapRect(rectF2);
        if (i == 1) {
            return m61849b(rectF2, size.getWidth() / 2.0f);
        }
        return rectF2;
    }

    /* renamed from: e */
    public final int m61846e() {
        if (!this.f12208g) {
            return this.f12204c;
        }
        return -CameraOrientationUtil.surfaceRotationToDegrees(this.f12206e);
    }

    /* renamed from: f */
    public final Size m61845f() {
        if (TransformUtils.is90or270(this.f12204c)) {
            return new Size(this.f12203b.height(), this.f12203b.width());
        }
        return new Size(this.f12203b.width(), this.f12203b.height());
    }

    /* renamed from: g */
    public PreviewView.ScaleType m61844g() {
        return this.f12209h;
    }

    /* renamed from: h */
    public Matrix m61843h(Size size, int i) {
        if (!m61838m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f12205d);
        matrix.postConcat(m61841j(size, i));
        return matrix;
    }

    /* renamed from: i */
    public Rect m61842i() {
        return this.f12203b;
    }

    /* renamed from: j */
    public Matrix m61841j(Size size, int i) {
        RectF m61847d;
        Preconditions.checkState(m61838m());
        if (m61837n(size)) {
            m61847d = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            m61847d = m61847d(size, i);
        }
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(this.f12203b), m61847d, this.f12204c);
        if (this.f12207f && this.f12208g) {
            if (TransformUtils.is90or270(this.f12204c)) {
                rectToRect.preScale(1.0f, -1.0f, this.f12203b.centerX(), this.f12203b.centerY());
            } else {
                rectToRect.preScale(-1.0f, 1.0f, this.f12203b.centerX(), this.f12203b.centerY());
            }
        }
        return rectToRect;
    }

    /* renamed from: k */
    public Matrix m61840k() {
        Preconditions.checkState(m61838m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f12202a.getWidth(), this.f12202a.getHeight());
        return TransformUtils.getRectToRect(rectF, rectF, m61846e());
    }

    /* renamed from: l */
    public final RectF m61839l(Size size, int i) {
        Preconditions.checkState(m61838m());
        Matrix m61841j = m61841j(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f12202a.getWidth(), this.f12202a.getHeight());
        m61841j.mapRect(rectF);
        return rectF;
    }

    /* renamed from: m */
    public final boolean m61838m() {
        boolean z;
        if (this.f12208g && this.f12206e == -1) {
            z = false;
        } else {
            z = true;
        }
        if (this.f12203b != null && this.f12202a != null && z) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m61837n(Size size) {
        return TransformUtils.isAspectRatioMatchingWithRoundingError(size, true, m61845f(), false);
    }

    /* renamed from: o */
    public void m61836o(int i, int i2) {
        if (!this.f12208g) {
            return;
        }
        this.f12204c = i;
        this.f12206e = i2;
    }

    /* renamed from: q */
    public void m61834q(PreviewView.ScaleType scaleType) {
        this.f12209h = scaleType;
    }

    /* renamed from: r */
    public void m61833r(SurfaceRequest.TransformationInfo transformationInfo, Size size, boolean z) {
        Logger.m63230d("PreviewTransform", "Transformation info set: " + transformationInfo + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + size + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + z);
        this.f12203b = transformationInfo.getCropRect();
        this.f12204c = transformationInfo.getRotationDegrees();
        this.f12206e = transformationInfo.getTargetRotation();
        this.f12202a = size;
        this.f12207f = z;
        this.f12208g = transformationInfo.hasCameraTransform();
        this.f12205d = transformationInfo.getSensorToBufferTransform();
    }

    /* renamed from: s */
    public void m61832s(Size size, int i, View view) {
        boolean z;
        if (size.getHeight() != 0 && size.getWidth() != 0) {
            if (!m61838m()) {
                return;
            }
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(m61840k());
            } else {
                Display display = view.getDisplay();
                boolean z2 = false;
                if (this.f12208g && display != null && display.getRotation() != this.f12206e) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.f12208g && m61846e() != 0) {
                    z2 = true;
                }
                if (z || z2) {
                    Logger.m63228e("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF m61839l = m61839l(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(m61839l.width() / this.f12202a.getWidth());
            view.setScaleY(m61839l.height() / this.f12202a.getHeight());
            view.setTranslationX(m61839l.left - view.getLeft());
            view.setTranslationY(m61839l.top - view.getTop());
            return;
        }
        Logger.m63223w("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
    }
}
