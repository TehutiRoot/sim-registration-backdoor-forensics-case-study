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
    public static class C2657a {

        /* renamed from: a */
        public final MediaFormat f11951a;

        public C2657a(MediaFormat mediaFormat) {
            this.f11951a = mediaFormat;
        }

        /* renamed from: a */
        public final String m62096a() {
            return this.f11951a.getString("mime");
        }

        /* renamed from: b */
        public boolean m62095b() {
            return "video/avc".equalsIgnoreCase(m62096a());
        }

        /* renamed from: c */
        public boolean m62094c() {
            return "video/mp4v-es".equalsIgnoreCase(m62096a());
        }

        /* renamed from: d */
        public boolean m62093d(int i, int i2) {
            int integer = this.f11951a.getInteger("width");
            int integer2 = this.f11951a.getInteger("height");
            if (integer == i && integer2 == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean m62092e() {
            String m62096a = m62096a();
            if (m62096a != null && m62096a.contains("video/")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m62105a() {
        return INCORRECT_FHD_PROFILE_MODEL_LIST.contains(Build.MODEL.toLowerCase(Locale.US));
    }

    /* renamed from: b */
    private static boolean m62104b() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m62103c() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62102d() {
        if ("Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m62101e() {
        if ("positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m62100f() {
        if ("Redmi".equalsIgnoreCase(Build.BRAND) && "Redmi Note 8 Pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m62099g() {
        if ("LGE".equalsIgnoreCase(Build.BRAND) && "LG-X230".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Set<Size> getExtraSupportedSizes() {
        if (m62105a()) {
            return Collections.singleton(new Size(1920, 1080));
        }
        return Collections.emptySet();
    }

    /* renamed from: h */
    public static boolean m62098h() {
        if ("infinix".equalsIgnoreCase(Build.BRAND) && "infinix x650".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m62097i() {
        if (!m62102d() && !m62103c() && !m62098h() && !m62099g() && !m62104b() && !m62100f() && !m62101e() && !m62105a()) {
            return false;
        }
        return true;
    }

    public boolean isUnSupportMediaCodecInfo(@NonNull MediaFormat mediaFormat) {
        C2657a c2657a = new C2657a(mediaFormat);
        if (!m62102d() && !m62103c() && !m62098h() && !m62099g() && !m62101e()) {
            if (!m62104b() && !m62100f()) {
                if (m62105a() && c2657a.m62095b() && c2657a.m62093d(1920, 1080)) {
                    return true;
                }
                return false;
            } else if (c2657a.m62092e() && c2657a.m62093d(3840, 2160)) {
                return true;
            } else {
                return false;
            }
        }
        return c2657a.m62094c();
    }
}
