package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Packet;

/* renamed from: K8 */
/* loaded from: classes.dex */
public final class C0707K8 extends Packet {

    /* renamed from: a */
    public final Object f3226a;

    /* renamed from: b */
    public final Exif f3227b;

    /* renamed from: c */
    public final int f3228c;

    /* renamed from: d */
    public final Size f3229d;

    /* renamed from: e */
    public final Rect f3230e;

    /* renamed from: f */
    public final int f3231f;

    /* renamed from: g */
    public final Matrix f3232g;

    /* renamed from: h */
    public final CameraCaptureResult f3233h;

    public C0707K8(Object obj, Exif exif, int i, Size size, Rect rect, int i2, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (obj != null) {
            this.f3226a = obj;
            this.f3227b = exif;
            this.f3228c = i;
            if (size != null) {
                this.f3229d = size;
                if (rect != null) {
                    this.f3230e = rect;
                    this.f3231f = i2;
                    if (matrix != null) {
                        this.f3232g = matrix;
                        if (cameraCaptureResult != null) {
                            this.f3233h = cameraCaptureResult;
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
        if (this.f3226a.equals(packet.getData()) && ((exif = this.f3227b) != null ? exif.equals(packet.getExif()) : packet.getExif() == null) && this.f3228c == packet.getFormat() && this.f3229d.equals(packet.getSize()) && this.f3230e.equals(packet.getCropRect()) && this.f3231f == packet.getRotationDegrees() && this.f3232g.equals(packet.getSensorToBufferTransform()) && this.f3233h.equals(packet.getCameraCaptureResult())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.processing.Packet
    public CameraCaptureResult getCameraCaptureResult() {
        return this.f3233h;
    }

    @Override // androidx.camera.core.processing.Packet
    public Rect getCropRect() {
        return this.f3230e;
    }

    @Override // androidx.camera.core.processing.Packet
    public Object getData() {
        return this.f3226a;
    }

    @Override // androidx.camera.core.processing.Packet
    public Exif getExif() {
        return this.f3227b;
    }

    @Override // androidx.camera.core.processing.Packet
    public int getFormat() {
        return this.f3228c;
    }

    @Override // androidx.camera.core.processing.Packet
    public int getRotationDegrees() {
        return this.f3231f;
    }

    @Override // androidx.camera.core.processing.Packet
    public Matrix getSensorToBufferTransform() {
        return this.f3232g;
    }

    @Override // androidx.camera.core.processing.Packet
    public Size getSize() {
        return this.f3229d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3226a.hashCode() ^ 1000003) * 1000003;
        Exif exif = this.f3227b;
        if (exif == null) {
            hashCode = 0;
        } else {
            hashCode = exif.hashCode();
        }
        return ((((((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f3228c) * 1000003) ^ this.f3229d.hashCode()) * 1000003) ^ this.f3230e.hashCode()) * 1000003) ^ this.f3231f) * 1000003) ^ this.f3232g.hashCode()) * 1000003) ^ this.f3233h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f3226a + ", exif=" + this.f3227b + ", format=" + this.f3228c + ", size=" + this.f3229d + ", cropRect=" + this.f3230e + ", rotationDegrees=" + this.f3231f + ", sensorToBufferTransform=" + this.f3232g + ", cameraCaptureResult=" + this.f3233h + "}";
    }
}