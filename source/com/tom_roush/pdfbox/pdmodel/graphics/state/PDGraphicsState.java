package com.tom_roush.pdfbox.pdmodel.graphics.state;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.util.GraphicsUtil;
import com.tom_roush.pdfbox.util.Matrix;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDGraphicsState implements Cloneable {

    /* renamed from: A */
    public double f60526A;

    /* renamed from: a */
    public boolean f60527a;

    /* renamed from: b */
    public List f60528b = new ArrayList();

    /* renamed from: c */
    public Map f60529c = new IdentityHashMap();

    /* renamed from: d */
    public Matrix f60530d = new Matrix();

    /* renamed from: e */
    public PDColor f60531e;

    /* renamed from: f */
    public PDColor f60532f;

    /* renamed from: g */
    public PDColorSpace f60533g;

    /* renamed from: h */
    public PDColorSpace f60534h;

    /* renamed from: i */
    public PDTextState f60535i;

    /* renamed from: j */
    public float f60536j;

    /* renamed from: k */
    public Paint.Cap f60537k;

    /* renamed from: l */
    public Paint.Join f60538l;

    /* renamed from: m */
    public float f60539m;

    /* renamed from: n */
    public PDLineDashPattern f60540n;

    /* renamed from: o */
    public RenderingIntent f60541o;

    /* renamed from: p */
    public boolean f60542p;

    /* renamed from: q */
    public BlendMode f60543q;

    /* renamed from: r */
    public PDSoftMask f60544r;

    /* renamed from: s */
    public double f60545s;

    /* renamed from: t */
    public double f60546t;

    /* renamed from: u */
    public boolean f60547u;

    /* renamed from: v */
    public boolean f60548v;

    /* renamed from: w */
    public boolean f60549w;

    /* renamed from: x */
    public double f60550x;

    /* renamed from: y */
    public COSBase f60551y;

    /* renamed from: z */
    public double f60552z;

    public PDGraphicsState(PDRectangle pDRectangle) {
        PDDeviceGray pDDeviceGray = PDDeviceGray.INSTANCE;
        this.f60531e = pDDeviceGray.getInitialColor();
        this.f60532f = pDDeviceGray.getInitialColor();
        this.f60533g = pDDeviceGray;
        this.f60534h = pDDeviceGray;
        this.f60535i = new PDTextState();
        this.f60536j = 1.0f;
        this.f60537k = Paint.Cap.BUTT;
        this.f60538l = Paint.Join.MITER;
        this.f60539m = 10.0f;
        this.f60540n = new PDLineDashPattern();
        this.f60542p = false;
        this.f60543q = BlendMode.COMPATIBLE;
        this.f60545s = 1.0d;
        this.f60546t = 1.0d;
        this.f60547u = false;
        this.f60548v = false;
        this.f60549w = false;
        this.f60550x = 0.0d;
        this.f60551y = null;
        this.f60552z = 1.0d;
        this.f60526A = 0.0d;
        this.f60528b.add(pDRectangle.toGeneralPath());
    }

    /* renamed from: a */
    public final void m32362a(Path path, boolean z) {
        if (!this.f60527a) {
            this.f60528b = new ArrayList(this.f60528b);
            this.f60527a = true;
        }
        List list = this.f60528b;
        if (z) {
            path = new Path(path);
        }
        list.add(path);
    }

    public double getAlphaConstant() {
        return this.f60545s;
    }

    public BlendMode getBlendMode() {
        return this.f60543q;
    }

    public Region getCurrentClippingPath() {
        if (this.f60528b.size() == 1) {
            Path path = (Path) this.f60528b.get(0);
            Region region = (Region) this.f60529c.get(path);
            if (region == null) {
                Region pathRegion = GraphicsUtil.getPathRegion(path);
                this.f60529c.put(path, pathRegion);
                return pathRegion;
            }
            return region;
        }
        Path path2 = new Path((Path) this.f60528b.get(0));
        for (int i = 1; i < this.f60528b.size(); i++) {
            path2.op((Path) this.f60528b.get(i), Path.Op.INTERSECT);
        }
        Region pathRegion2 = GraphicsUtil.getPathRegion(path2);
        ArrayList arrayList = new ArrayList();
        this.f60528b = arrayList;
        arrayList.add(path2);
        this.f60529c.put(path2, pathRegion2);
        return pathRegion2;
    }

    public List<Path> getCurrentClippingPaths() {
        return this.f60528b;
    }

    public Matrix getCurrentTransformationMatrix() {
        return this.f60530d;
    }

    public double getFlatness() {
        return this.f60552z;
    }

    public Paint.Cap getLineCap() {
        return this.f60537k;
    }

    public PDLineDashPattern getLineDashPattern() {
        return this.f60540n;
    }

    public Paint.Join getLineJoin() {
        return this.f60538l;
    }

    public float getLineWidth() {
        return this.f60536j;
    }

    public float getMiterLimit() {
        return this.f60539m;
    }

    public double getNonStrokeAlphaConstant() {
        return this.f60546t;
    }

    @Deprecated
    public double getNonStrokeAlphaConstants() {
        return this.f60546t;
    }

    public PDColor getNonStrokingColor() {
        return this.f60532f;
    }

    public PDColorSpace getNonStrokingColorSpace() {
        return this.f60534h;
    }

    public double getOverprintMode() {
        return this.f60550x;
    }

    public RenderingIntent getRenderingIntent() {
        return this.f60541o;
    }

    public double getSmoothness() {
        return this.f60526A;
    }

    public PDSoftMask getSoftMask() {
        return this.f60544r;
    }

    public PDColor getStrokingColor() {
        return this.f60531e;
    }

    public PDColorSpace getStrokingColorSpace() {
        return this.f60533g;
    }

    public PDTextState getTextState() {
        return this.f60535i;
    }

    public COSBase getTransfer() {
        return this.f60551y;
    }

    public void intersectClippingPath(Path path) {
        m32362a(path, true);
    }

    public boolean isAlphaSource() {
        return this.f60547u;
    }

    public boolean isNonStrokingOverprint() {
        return this.f60549w;
    }

    public boolean isOverprint() {
        return this.f60548v;
    }

    public boolean isStrokeAdjustment() {
        return this.f60542p;
    }

    public void setAlphaConstant(double d) {
        this.f60545s = d;
    }

    public void setAlphaSource(boolean z) {
        this.f60547u = z;
    }

    public void setBlendMode(BlendMode blendMode) {
        this.f60543q = blendMode;
    }

    public void setCurrentTransformationMatrix(Matrix matrix) {
        this.f60530d = matrix;
    }

    public void setFlatness(double d) {
        this.f60552z = d;
    }

    public void setLineCap(Paint.Cap cap) {
        this.f60537k = cap;
    }

    public void setLineDashPattern(PDLineDashPattern pDLineDashPattern) {
        this.f60540n = pDLineDashPattern;
    }

    public void setLineJoin(Paint.Join join) {
        this.f60538l = join;
    }

    public void setLineWidth(float f) {
        this.f60536j = f;
    }

    public void setMiterLimit(float f) {
        this.f60539m = f;
    }

    public void setNonStrokeAlphaConstant(double d) {
        this.f60546t = d;
    }

    @Deprecated
    public void setNonStrokeAlphaConstants(double d) {
        this.f60546t = d;
    }

    public void setNonStrokingColor(PDColor pDColor) {
        this.f60532f = pDColor;
    }

    public void setNonStrokingColorSpace(PDColorSpace pDColorSpace) {
        this.f60534h = pDColorSpace;
    }

    public void setNonStrokingOverprint(boolean z) {
        this.f60549w = z;
    }

    public void setOverprint(boolean z) {
        this.f60548v = z;
    }

    public void setOverprintMode(double d) {
        this.f60550x = d;
    }

    public void setRenderingIntent(RenderingIntent renderingIntent) {
        this.f60541o = renderingIntent;
    }

    public void setSmoothness(double d) {
        this.f60526A = d;
    }

    public void setSoftMask(PDSoftMask pDSoftMask) {
        this.f60544r = pDSoftMask;
    }

    public void setStrokeAdjustment(boolean z) {
        this.f60542p = z;
    }

    public void setStrokingColor(PDColor pDColor) {
        this.f60531e = pDColor;
    }

    public void setStrokingColorSpace(PDColorSpace pDColorSpace) {
        this.f60533g = pDColorSpace;
    }

    public void setTextState(PDTextState pDTextState) {
        this.f60535i = pDTextState;
    }

    public void setTransfer(COSBase cOSBase) {
        this.f60551y = cOSBase;
    }

    /* renamed from: clone */
    public PDGraphicsState m74060clone() {
        try {
            PDGraphicsState pDGraphicsState = (PDGraphicsState) super.clone();
            pDGraphicsState.f60535i = this.f60535i.m74061clone();
            pDGraphicsState.f60530d = this.f60530d.m74062clone();
            pDGraphicsState.f60531e = this.f60531e;
            pDGraphicsState.f60532f = this.f60532f;
            pDGraphicsState.f60540n = this.f60540n;
            pDGraphicsState.f60528b = this.f60528b;
            pDGraphicsState.f60529c = this.f60529c;
            pDGraphicsState.f60527a = false;
            return pDGraphicsState;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void intersectClippingPath(Region region) {
        m32362a(region.getBoundaryPath(), false);
    }
}
