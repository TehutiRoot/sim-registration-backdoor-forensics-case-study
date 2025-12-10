package androidx.camera.video;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;

@RequiresApi(21)
/* loaded from: classes.dex */
public class Quality {
    public static final Quality FHD;

    /* renamed from: HD */
    public static final Quality f11631HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;

    /* renamed from: SD */
    public static final Quality f11632SD;
    public static final Quality UHD;

    /* renamed from: a */
    public static final Quality f11633a;

    /* renamed from: b */
    public static final Set f11634b;

    /* renamed from: c */
    public static final List f11635c;

    /* renamed from: androidx.camera.video.Quality$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2605b extends Quality {
        public AbstractC2605b() {
            super();
        }

        /* renamed from: e */
        public static AbstractC2605b m62516e(int i, String str) {
            return new C2643g(i, str);
        }

        /* renamed from: c */
        public abstract String mo62236c();

        /* renamed from: d */
        public abstract int mo62235d();
    }

    static {
        AbstractC2605b m62516e = AbstractC2605b.m62516e(4, "SD");
        f11632SD = m62516e;
        AbstractC2605b m62516e2 = AbstractC2605b.m62516e(5, "HD");
        f11631HD = m62516e2;
        AbstractC2605b m62516e3 = AbstractC2605b.m62516e(6, "FHD");
        FHD = m62516e3;
        AbstractC2605b m62516e4 = AbstractC2605b.m62516e(8, "UHD");
        UHD = m62516e4;
        AbstractC2605b m62516e5 = AbstractC2605b.m62516e(0, "LOWEST");
        LOWEST = m62516e5;
        AbstractC2605b m62516e6 = AbstractC2605b.m62516e(1, "HIGHEST");
        HIGHEST = m62516e6;
        f11633a = AbstractC2605b.m62516e(-1, TopUpMixpanel.OFFER_NONE);
        f11634b = new HashSet(Arrays.asList(m62516e5, m62516e6, m62516e, m62516e2, m62516e3, m62516e4));
        f11635c = Arrays.asList(m62516e4, m62516e3, m62516e2, m62516e);
    }

    /* renamed from: a */
    public static boolean m62518a(Quality quality) {
        return f11634b.contains(quality);
    }

    /* renamed from: b */
    public static List m62517b() {
        return new ArrayList(f11635c);
    }

    public Quality() {
    }
}
