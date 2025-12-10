package androidx.profileinstaller;

import androidx.annotation.RestrictTo;
import com.facebook.stetho.dumpapp.Framer;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class ProfileVersion {
    public static final int MAX_SUPPORTED_SDK = 34;
    public static final int MIN_SUPPORTED_SDK = 24;

    /* renamed from: a */
    public static final byte[] f36539a = {48, Framer.STDOUT_FRAME_PREFIX, 53, 0};

    /* renamed from: b */
    public static final byte[] f36540b = {48, Framer.STDOUT_FRAME_PREFIX, 48, 0};

    /* renamed from: c */
    public static final byte[] f36541c = {48, 48, 57, 0};

    /* renamed from: d */
    public static final byte[] f36542d = {48, 48, 53, 0};

    /* renamed from: e */
    public static final byte[] f36543e = {48, 48, Framer.STDOUT_FRAME_PREFIX, 0};

    /* renamed from: f */
    public static final byte[] f36544f = {48, 48, Framer.STDOUT_FRAME_PREFIX, 0};

    /* renamed from: g */
    public static final byte[] f36545g = {48, 48, Framer.STDERR_FRAME_PREFIX, 0};

    /* renamed from: a */
    public static String m53715a(byte[] bArr) {
        if (Arrays.equals(bArr, f36543e) || Arrays.equals(bArr, f36542d)) {
            return ":";
        }
        return "!";
    }
}
