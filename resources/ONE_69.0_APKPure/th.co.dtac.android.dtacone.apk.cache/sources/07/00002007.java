package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {

    /* renamed from: a */
    public static final Set f11455a = new HashSet(Arrays.asList("A24"));

    /* renamed from: c */
    public static boolean m62733c() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && f11455a.contains(Build.DEVICE.toUpperCase(Locale.US))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62732d() {
        return m62733c();
    }

    /* renamed from: a */
    public final boolean m62735a(byte[] bArr) {
        byte b;
        int i = 2;
        while (i + 4 <= bArr.length && (b = bArr[i]) == -1) {
            if (b == -1 && bArr[i + 1] == -38) {
                return true;
            }
            i += (((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255)) + 2;
        }
        return false;
    }

    /* renamed from: b */
    public final int m62734b(byte[] bArr) {
        int i = 2;
        while (true) {
            int i2 = i + 1;
            if (i2 > bArr.length) {
                return -1;
            }
            if (bArr[i] == -1 && bArr[i2] == -40) {
                return i;
            }
            i = i2;
        }
    }

    @NonNull
    public byte[] jpegImageToJpegByteArray(@NonNull ImageProxy imageProxy) {
        int i = 0;
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        if (!m62735a(bArr) && (i = m62734b(bArr)) == -1) {
            return bArr;
        }
        return Arrays.copyOfRange(bArr, i, buffer.limit());
    }
}