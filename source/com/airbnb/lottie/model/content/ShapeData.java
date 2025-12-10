package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ShapeData {

    /* renamed from: a */
    public final List f41382a;

    /* renamed from: b */
    public PointF f41383b;

    /* renamed from: c */
    public boolean f41384c;

    public ShapeData(PointF pointF, boolean z, List<CubicCurveData> list) {
        this.f41383b = pointF;
        this.f41384c = z;
        this.f41382a = new ArrayList(list);
    }

    public List<CubicCurveData> getCurves() {
        return this.f41382a;
    }

    public PointF getInitialPoint() {
        return this.f41383b;
    }

    public void interpolateBetween(ShapeData shapeData, ShapeData shapeData2, @FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        boolean z;
        if (this.f41383b == null) {
            this.f41383b = new PointF();
        }
        if (!shapeData.isClosed() && !shapeData2.isClosed()) {
            z = false;
        } else {
            z = true;
        }
        this.f41384c = z;
        if (shapeData.getCurves().size() != shapeData2.getCurves().size()) {
            Logger.warning("Curves must have the same number of control points. Shape 1: " + shapeData.getCurves().size() + "\tShape 2: " + shapeData2.getCurves().size());
        }
        int min = Math.min(shapeData.getCurves().size(), shapeData2.getCurves().size());
        if (this.f41382a.size() < min) {
            for (int size = this.f41382a.size(); size < min; size++) {
                this.f41382a.add(new CubicCurveData());
            }
        } else if (this.f41382a.size() > min) {
            for (int size2 = this.f41382a.size() - 1; size2 >= min; size2--) {
                List list = this.f41382a;
                list.remove(list.size() - 1);
            }
        }
        PointF initialPoint = shapeData.getInitialPoint();
        PointF initialPoint2 = shapeData2.getInitialPoint();
        setInitialPoint(MiscUtils.lerp(initialPoint.x, initialPoint2.x, f), MiscUtils.lerp(initialPoint.y, initialPoint2.y, f));
        for (int size3 = this.f41382a.size() - 1; size3 >= 0; size3--) {
            CubicCurveData cubicCurveData = shapeData.getCurves().get(size3);
            CubicCurveData cubicCurveData2 = shapeData2.getCurves().get(size3);
            PointF controlPoint1 = cubicCurveData.getControlPoint1();
            PointF controlPoint2 = cubicCurveData.getControlPoint2();
            PointF vertex = cubicCurveData.getVertex();
            PointF controlPoint12 = cubicCurveData2.getControlPoint1();
            PointF controlPoint22 = cubicCurveData2.getControlPoint2();
            PointF vertex2 = cubicCurveData2.getVertex();
            ((CubicCurveData) this.f41382a.get(size3)).setControlPoint1(MiscUtils.lerp(controlPoint1.x, controlPoint12.x, f), MiscUtils.lerp(controlPoint1.y, controlPoint12.y, f));
            ((CubicCurveData) this.f41382a.get(size3)).setControlPoint2(MiscUtils.lerp(controlPoint2.x, controlPoint22.x, f), MiscUtils.lerp(controlPoint2.y, controlPoint22.y, f));
            ((CubicCurveData) this.f41382a.get(size3)).setVertex(MiscUtils.lerp(vertex.x, vertex2.x, f), MiscUtils.lerp(vertex.y, vertex2.y, f));
        }
    }

    public boolean isClosed() {
        return this.f41384c;
    }

    public void setClosed(boolean z) {
        this.f41384c = z;
    }

    public void setInitialPoint(float f, float f2) {
        if (this.f41383b == null) {
            this.f41383b = new PointF();
        }
        this.f41383b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f41382a.size() + "closed=" + this.f41384c + '}';
    }

    public ShapeData() {
        this.f41382a = new ArrayList();
    }
}
