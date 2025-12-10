package androidx.camera.core;

import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {

    /* renamed from: b */
    public final float f10783b;

    /* renamed from: c */
    public final float f10784c;

    /* renamed from: d */
    public final Display f10785d;

    /* renamed from: e */
    public final CameraInfo f10786e;

    public DisplayOrientedMeteringPointFactory(@NonNull Display display, @NonNull CameraInfo cameraInfo, float f, float f2) {
        this.f10783b = f;
        this.f10784c = f2;
        this.f10785d = display;
        this.f10786e = cameraInfo;
    }

    /* renamed from: a */
    public final int m63282a(boolean z) {
        try {
            int sensorRotationDegrees = this.f10786e.getSensorRotationDegrees(this.f10785d.getRotation());
            if (z) {
                return (360 - sensorRotationDegrees) % 360;
            }
            return sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    @Override // androidx.camera.core.MeteringPointFactory
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.PointF convertPoint(float r9, float r10) {
        /*
            r8 = this;
            float r0 = r8.f10783b
            float r1 = r8.f10784c
            androidx.camera.core.CameraInfo r2 = r8.f10786e
            int r2 = r2.getLensFacing()
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            int r3 = r8.m63282a(r2)
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1c
            goto L22
        L1c:
            r6 = r10
            r10 = r9
            r9 = r6
            r7 = r1
            r1 = r0
            r0 = r7
        L22:
            if (r3 == r5) goto L30
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 == r5) goto L2e
            if (r3 == r4) goto L2b
            goto L32
        L2b:
            float r10 = r1 - r10
            goto L32
        L2e:
            float r10 = r1 - r10
        L30:
            float r9 = r0 - r9
        L32:
            if (r2 == 0) goto L36
            float r10 = r1 - r10
        L36:
            float r10 = r10 / r1
            float r9 = r9 / r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.DisplayOrientedMeteringPointFactory.convertPoint(float, float):android.graphics.PointF");
    }
}
