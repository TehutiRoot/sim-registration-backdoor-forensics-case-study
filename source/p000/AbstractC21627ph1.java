package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.harmony.javax.imageio.stream.ImageInputStream;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRange;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.List;

/* renamed from: ph1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC21627ph1 extends PDShading {

    /* renamed from: g */
    public COSArray f76659g;

    /* renamed from: h */
    public int f76660h;

    /* renamed from: i */
    public int f76661i;

    /* renamed from: j */
    public int f76662j;

    public AbstractC21627ph1(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.f76659g = null;
        this.f76660h = -1;
        this.f76661i = -1;
        this.f76662j = -1;
    }

    /* renamed from: c */
    private COSArray m23625c() {
        if (this.f76659g == null) {
            this.f76659g = (COSArray) getCOSObject().getDictionaryObject(COSName.DECODE);
        }
        return this.f76659g;
    }

    /* renamed from: b */
    public abstract List mo23626b(AffineTransform affineTransform, Matrix matrix);

    public int getBitsPerComponent() {
        if (this.f76661i == -1) {
            this.f76661i = getCOSObject().getInt(COSName.BITS_PER_COMPONENT, -1);
            StringBuilder sb = new StringBuilder();
            sb.append("bitsPerColorComponent: ");
            sb.append(this.f76661i);
        }
        return this.f76661i;
    }

    public int getBitsPerCoordinate() {
        if (this.f76660h == -1) {
            this.f76660h = getCOSObject().getInt(COSName.BITS_PER_COORDINATE, -1);
            StringBuilder sb = new StringBuilder();
            sb.append("bitsPerCoordinate: ");
            sb.append(Math.pow(2.0d, this.f76660h) - 1.0d);
        }
        return this.f76660h;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public RectF getBounds(AffineTransform affineTransform, Matrix matrix) {
        RectF rectF = null;
        for (JG1 jg1 : mo23626b(affineTransform, matrix)) {
            if (rectF == null) {
                PointF pointF = jg1.f2745a[0];
                rectF = new RectF(pointF.x, pointF.y, 0.0f, 0.0f);
            }
            PointF pointF2 = jg1.f2745a[0];
            rectF.union(pointF2.x, pointF2.y);
            PointF pointF3 = jg1.f2745a[1];
            rectF.union(pointF3.x, pointF3.y);
            PointF pointF4 = jg1.f2745a[2];
            rectF.union(pointF4.x, pointF4.y);
        }
        if (rectF == null) {
            return new RectF();
        }
        return rectF;
    }

    public PDRange getDecodeForParameter(int i) {
        COSArray m23625c = m23625c();
        if (m23625c != null && m23625c.size() >= (i * 2) + 1) {
            return new PDRange(m23625c, i);
        }
        return null;
    }

    public int getNumberOfColorComponents() {
        int numberOfComponents;
        if (this.f76662j == -1) {
            if (getFunction() != null) {
                numberOfComponents = 1;
            } else {
                numberOfComponents = getColorSpace().getNumberOfComponents();
            }
            this.f76662j = numberOfComponents;
            StringBuilder sb = new StringBuilder();
            sb.append("numberOfColorComponents: ");
            sb.append(this.f76662j);
        }
        return this.f76662j;
    }

    public float interpolate(float f, long j, float f2, float f3) {
        return f2 + ((f * (f3 - f2)) / ((float) j));
    }

    public G12 readVertex(ImageInputStream imageInputStream, long j, long j2, PDRange pDRange, PDRange pDRange2, PDRange[] pDRangeArr, Matrix matrix, AffineTransform affineTransform) throws IOException {
        float[] fArr = new float[this.f76662j];
        long readBits = imageInputStream.readBits(this.f76660h);
        long readBits2 = imageInputStream.readBits(this.f76660h);
        float interpolate = interpolate((float) readBits, j, pDRange.getMin(), pDRange.getMax());
        float interpolate2 = interpolate((float) readBits2, j, pDRange2.getMin(), pDRange2.getMax());
        StringBuilder sb = new StringBuilder();
        sb.append("coord: ");
        sb.append(String.format("[%06X,%06X] -> [%f,%f]", Long.valueOf(readBits), Long.valueOf(readBits2), Float.valueOf(interpolate), Float.valueOf(interpolate2)));
        PointF transformPoint = matrix.transformPoint(interpolate, interpolate2);
        affineTransform.transform(transformPoint, transformPoint);
        for (int i = 0; i < this.f76662j; i++) {
            int readBits3 = (int) imageInputStream.readBits(this.f76661i);
            fArr[i] = interpolate(readBits3, j2, pDRangeArr[i].getMin(), pDRangeArr[i].getMax());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("color[");
            sb2.append(i);
            sb2.append("]: ");
            sb2.append(readBits3);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(String.format("%02x", Integer.valueOf(readBits3)));
            sb2.append("-> color[");
            sb2.append(i);
            sb2.append("]: ");
            sb2.append(fArr[i]);
        }
        int bitOffset = imageInputStream.getBitOffset();
        if (bitOffset != 0) {
            imageInputStream.readBits(8 - bitOffset);
        }
        return new G12(transformPoint, fArr);
    }

    public void setBitsPerComponent(int i) {
        getCOSObject().setInt(COSName.BITS_PER_COMPONENT, i);
        this.f76661i = i;
    }

    public void setBitsPerCoordinate(int i) {
        getCOSObject().setInt(COSName.BITS_PER_COORDINATE, i);
        this.f76660h = i;
    }

    public void setDecodeValues(COSArray cOSArray) {
        this.f76659g = cOSArray;
        getCOSObject().setItem(COSName.DECODE, (COSBase) cOSArray);
    }
}
