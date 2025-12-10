package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* renamed from: androidx.camera.core.imagecapture.h */
/* loaded from: classes.dex */
public class C2485h implements Operation {

    /* renamed from: androidx.camera.core.imagecapture.h$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2486a {
        /* renamed from: c */
        public static AbstractC2486a m63060c(Packet packet, int i) {
            return new C2478a(packet, i);
        }

        /* renamed from: a */
        public abstract int mo63062a();

        /* renamed from: b */
        public abstract Packet mo63061b();
    }

    @Override // androidx.camera.core.processing.Operation
    /* renamed from: a */
    public Packet apply(AbstractC2486a abstractC2486a) {
        Packet mo63061b = abstractC2486a.mo63061b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) mo63061b.getData()).compress(Bitmap.CompressFormat.JPEG, abstractC2486a.mo63062a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Exif exif = mo63061b.getExif();
        Objects.requireNonNull(exif);
        return Packet.m62702of(byteArray, exif, 256, mo63061b.getSize(), mo63061b.getCropRect(), mo63061b.getRotationDegrees(), mo63061b.getSensorToBufferTransform(), mo63061b.getCameraCaptureResult());
    }
}
