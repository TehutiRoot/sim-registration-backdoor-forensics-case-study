package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    public Path f37724a;

    /* renamed from: b */
    public final Path f37725b;

    /* renamed from: c */
    public final Matrix f37726c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f37725b = path;
        this.f37726c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f37724a = path;
    }

    /* renamed from: a */
    public static float m52661a(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float m52661a = m52661a(f5, f6);
        double atan2 = Math.atan2(f6, f5);
        this.f37726c.setScale(m52661a, m52661a);
        this.f37726c.postRotate((float) Math.toDegrees(atan2));
        this.f37726c.postTranslate(f, f2);
        Path path = new Path();
        this.f37725b.transform(this.f37726c, path);
        return path;
    }

    public Path getPatternPath() {
        return this.f37724a;
    }

    public void setPatternPath(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f37726c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m52661a = 1.0f / m52661a(f5, f6);
        this.f37726c.postScale(m52661a, m52661a);
        this.f37726c.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.f37726c, this.f37725b);
        this.f37724a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f37725b = new Path();
        this.f37726c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67275k);
        try {
            String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString != null) {
                setPatternPath(PathParser.createPathFromPathData(namedString));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(Path path) {
        this.f37725b = new Path();
        this.f37726c = new Matrix();
        setPatternPath(path);
    }
}
