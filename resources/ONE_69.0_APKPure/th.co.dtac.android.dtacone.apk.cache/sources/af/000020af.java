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
    public static final Quality f11719HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;

    /* renamed from: SD */
    public static final Quality f11720SD;
    public static final Quality UHD;

    /* renamed from: a */
    public static final Quality f11721a;

    /* renamed from: b */
    public static final Set f11722b;

    /* renamed from: c */
    public static final List f11723c;

    /* renamed from: androidx.camera.video.Quality$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2587b extends Quality {
        public AbstractC2587b() {
            super();
        }

        /* renamed from: e */
        public static AbstractC2587b m62464e(int i, String str) {
            return new C2625g(i, str);
        }

        /* renamed from: c */
        public abstract String mo62184c();

        /* renamed from: d */
        public abstract int mo62183d();
    }

    static {
        AbstractC2587b m62464e = AbstractC2587b.m62464e(4, "SD");
        f11720SD = m62464e;
        AbstractC2587b m62464e2 = AbstractC2587b.m62464e(5, "HD");
        f11719HD = m62464e2;
        AbstractC2587b m62464e3 = AbstractC2587b.m62464e(6, "FHD");
        FHD = m62464e3;
        AbstractC2587b m62464e4 = AbstractC2587b.m62464e(8, "UHD");
        UHD = m62464e4;
        AbstractC2587b m62464e5 = AbstractC2587b.m62464e(0, "LOWEST");
        LOWEST = m62464e5;
        AbstractC2587b m62464e6 = AbstractC2587b.m62464e(1, "HIGHEST");
        HIGHEST = m62464e6;
        f11721a = AbstractC2587b.m62464e(-1, TopUpMixpanel.OFFER_NONE);
        f11722b = new HashSet(Arrays.asList(m62464e5, m62464e6, m62464e, m62464e2, m62464e3, m62464e4));
        f11723c = Arrays.asList(m62464e4, m62464e3, m62464e2, m62464e);
    }

    /* renamed from: a */
    public static boolean m62466a(Quality quality) {
        return f11722b.contains(quality);
    }

    /* renamed from: b */
    public static List m62465b() {
        return new ArrayList(f11723c);
    }

    public Quality() {
    }
}