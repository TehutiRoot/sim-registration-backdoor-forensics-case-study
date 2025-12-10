package p000;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

/* renamed from: Kx1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17960Kx1 {
    /* renamed from: a */
    public static boolean m67574a(Context context, Map map) {
        ResourcesLoader m67264a = AbstractC0905Ms.m67264a(context, map);
        if (m67264a != null) {
            context.getResources().addLoaders(m67264a);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m67573b(int i) {
        if (28 <= i && i <= 31) {
            return true;
        }
        return false;
    }
}
