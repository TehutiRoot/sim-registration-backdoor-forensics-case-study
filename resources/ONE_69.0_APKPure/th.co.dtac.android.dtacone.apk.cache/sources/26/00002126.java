package androidx.camera.video.internal.compat.quirk;

import android.media.MediaFormat;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class MediaCodecInfoReportIncorrectInfoQuirk implements Quirk {
    public static final List<String> INCORRECT_FHD_PROFILE_MODEL_LIST = Arrays.asList("lg-k430", "redmi note 4", "m2003j15sc", "rmx3231", "v2117", "sm-a032f", "moto g(20)", "sm-a035m");

    /* renamed from: androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk$a */
    /* loaded from: classes.dex */
    public static class C2639a {

        /* renamed from: a */
        public final MediaFormat f12039a;

        public C2639a(MediaFormat mediaFormat) {
            this.f12039a = mediaFormat;
        }

        /* renamed from: a */
        public final String m62044a() {
            return this.f12039a.getString("mime");
        }

        /* renamed from: b */
        public boolean m62043b() {
            return "video/avc".equalsIgnoreCase(m62044a());
        }

        /* renamed from: c */
        public boolean m62042c() {
            return "video/mp4v-es".equalsIgnoreCase(m62044a());
        }

        /* renamed from: d */
        public boolean m62041d(int i, int i2) {
            int integer = this.f12039a.getInteger("width");
            int integer2 = this.f12039a.getInteger("height");
            if (integer == i && integer2 == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean m62040e() {
            String m62044a = m62044a();
            if (m62044a != null && m62044a.contains("video/")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m62053a() {
        return INCORRECT_FHD_PROFILE_MODEL_LIST.contains(Build.MODEL.toLowerCase(Locale.US));
    }

    /* renamed from: b */
    private static boolean m62052b() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m62051c() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62050d() {
        if ("Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m62049e() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m62048f() {
        if ("Redmi".equalsIgnoreCase(Build.BRAND) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m62047g() {
        if ("LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Set<Size> getExtraSupportedSizes() {
        if (m62053a()) {
            return Collections.singleton(new Size(1920, 1080));
        }
        return Collections.emptySet();
    }

    /* renamed from: h */
    public static boolean m62046h() {
        if ("infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m62045i() {
        if (!m62050d() && !m62051c() && !m62046h() && !m62047g() && !m62052b() && !m62048f() && !m62049e() && !m62053a()) {
            return false;
        }
        return true;
    }

    public boolean isUnSupportMediaCodecInfo(@NonNull MediaFormat mediaFormat) {
        C2639a c2639a = new C2639a(mediaFormat);
        if (!m62050d() && !m62051c() && !m62046h() && !m62047g() && !m62049e()) {
            if (!m62052b() && !m62048f()) {
                if (m62053a() && c2639a.m62043b() && c2639a.m62041d(1920, 1080)) {
                    return true;
                }
                return false;
            } else if (c2639a.m62040e() && c2639a.m62041d(3840, 2160)) {
                return true;
            } else {
                return false;
            }
        }
        return c2639a.m62042c();
    }
}