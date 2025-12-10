package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Packet;

/* renamed from: K8 */
/* loaded from: classes.dex */
public final class C0719K8 extends Packet {

    /* renamed from: a */
    public final Object f3115a;

    /* renamed from: b */
    public final Exif f3116b;

    /* renamed from: c */
    public final int f3117c;

    /* renamed from: d */
    public final Size f3118d;

    /* renamed from: e */
    public final Rect f3119e;

    /* renamed from: f */
    public final int f3120f;

    /* renamed from: g */
    public final Matrix f3121g;

    /* renamed from: h */
    public final CameraCaptureResult f3122h;

    public C0719K8(Object obj, Exif exif, int i, Size size, Rect rect, int i2, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (obj != null) {
            this.f3115a = obj;
            this.f3116b = exif;
            this.f3117c = i;
            if (size != null) {
                this.f3118d = size;
                if (rect != null) {
                    this.f3119e = rect;
                    this.f3120f = i2;
                    if (matrix != null) {
                        this.f3121g = matrix;
                        if (cameraCaptureResult != null) {
                            this.f3122h = cameraCaptureResult;
                            return;
                        }
                        throw new NullPointerException("Null cameraCaptureResult");
                    }
                    throw new NullPointerException("Null sensorToBufferTransform");
                }
                throw new NullPointerException("Null cropRect");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null data");
    }

    public boolean equals(Object obj) {
        Exif exif;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Packet)) {
            return false;
        }
        Packet packet = (Packet) obj;
        if (this.f3115a.equals(packet.getData()) && ((exif = this.f3116b) != null ? exif.equals(packet.getExif()) : packet.getExif() == null) && this.f3117c == packet.getFormat() && this.f3118d.equals(packet.getSize()) && this.f3119e.equals(packet.getCropRect()) && this.f3120f == packet.getRotationDegrees() && this.f3121g.equals(packet.getSensorToBufferTransform()) && this.f3122h.equals(packet.getCameraCaptureResult())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.processing.Packet
    public CameraCaptureResult getCameraCaptureResult() {
        return this.f3122h;
    }

    @Override // androidx.camera.core.processing.Packet
    public Rect getCropRect() {
        return this.f3119e;
    }

    @Override // androidx.camera.core.processing.Packet
    public Object getData() {
        return this.f3115a;
    }

    @Override // androidx.camera.core.processing.Packet
    public Exif getExif() {
        return this.f3116b;
    }

    @Override // androidx.camera.core.processing.Packet
    public int getFormat() {
        return this.f3117c;
    }

    @Override // androidx.camera.core.processing.Packet
    public int getRotationDegrees() {
        return this.f3120f;
    }

    @Override // androidx.camera.core.processing.Packet
    public Matrix getSensorToBufferTransform() {
        return this.f3121g;
    }

    @Override // androidx.camera.core.processing.Packet
    public Size getSize() {
        return this.f3118d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3115a.hashCode() ^ 1000003) * 1000003;
        Exif exif = this.f3116b;
        if (exif == null) {
            hashCode = 0;
        } else {
            hashCode = exif.hashCode();
        }
        return ((((((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f3117c) * 1000003) ^ this.f3118d.hashCode()) * 1000003) ^ this.f3119e.hashCode()) * 1000003) ^ this.f3120f) * 1000003) ^ this.f3121g.hashCode()) * 1000003) ^ this.f3122h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f3115a + ", exif=" + this.f3116b + ", format=" + this.f3117c + ", size=" + this.f3118d + ", cropRect=" + this.f3119e + ", rotationDegrees=" + this.f3120f + ", sensorToBufferTransform=" + this.f3121g + ", cameraCaptureResult=" + this.f3122h + "}";
    }
}
