package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: mo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C21132mo1 {

    /* renamed from: a */
    public final ImageCapture.OutputFileOptions f72039a;

    /* renamed from: b */
    public final Rect f72040b;

    /* renamed from: c */
    public final int f72041c;

    /* renamed from: d */
    public final int f72042d;

    /* renamed from: e */
    public final Matrix f72043e;

    /* renamed from: f */
    public final QQ1 f72044f;

    /* renamed from: g */
    public final String f72045g;

    /* renamed from: h */
    public final List f72046h = new ArrayList();

    /* renamed from: i */
    public final ListenableFuture f72047i;

    public C21132mo1(CaptureBundle captureBundle, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, int i, int i2, Matrix matrix, QQ1 qq1, ListenableFuture listenableFuture) {
        this.f72039a = outputFileOptions;
        this.f72042d = i2;
        this.f72041c = i;
        this.f72040b = rect;
        this.f72043e = matrix;
        this.f72044f = qq1;
        this.f72045g = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        for (CaptureStage captureStage : captureStages) {
            this.f72046h.add(Integer.valueOf(captureStage.getId()));
        }
        this.f72047i = listenableFuture;
    }

    /* renamed from: a */
    public ListenableFuture m26204a() {
        return this.f72047i;
    }

    /* renamed from: b */
    public Rect m26203b() {
        return this.f72040b;
    }

    /* renamed from: c */
    public int m26202c() {
        return this.f72042d;
    }

    /* renamed from: d */
    public ImageCapture.OutputFileOptions m26201d() {
        return this.f72039a;
    }

    /* renamed from: e */
    public int m26200e() {
        return this.f72041c;
    }

    /* renamed from: f */
    public Matrix m26199f() {
        return this.f72043e;
    }

    /* renamed from: g */
    public List m26198g() {
        return this.f72046h;
    }

    /* renamed from: h */
    public String m26197h() {
        return this.f72045g;
    }

    /* renamed from: i */
    public boolean m26196i() {
        return this.f72044f.isAborted();
    }

    /* renamed from: j */
    public boolean m26195j() {
        if (m26201d() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m26194k(ImageCaptureException imageCaptureException) {
        this.f72044f.mo62991e(imageCaptureException);
    }

    /* renamed from: l */
    public void m26193l(ImageCapture.OutputFileResults outputFileResults) {
        this.f72044f.mo62992d(outputFileResults);
    }

    /* renamed from: m */
    public void m26192m(ImageProxy imageProxy) {
        this.f72044f.mo62994b(imageProxy);
    }

    /* renamed from: n */
    public void m26191n() {
        this.f72044f.mo62993c();
    }

    /* renamed from: o */
    public void m26190o(ImageCaptureException imageCaptureException) {
        this.f72044f.mo62995a(imageCaptureException);
    }
}
