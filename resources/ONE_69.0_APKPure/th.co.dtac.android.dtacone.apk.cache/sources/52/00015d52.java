package th.p047co.dtac.android.dtacone.widget.view;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;
import th.p047co.dtac.android.dtacone.util.TypefaceUtil;

/* renamed from: th.co.dtac.android.dtacone.widget.view.DtacCacheFont */
/* loaded from: classes9.dex */
public class DtacCacheFont {

    /* renamed from: a */
    public static Hashtable f107416a = new Hashtable();

    /* renamed from: a */
    public static boolean m1447a(String str) {
        return f107416a.containsKey(str);
    }

    public static Typeface getFonts(Context context, String str) {
        if (m1447a(str)) {
            return (Typeface) f107416a.get(str);
        }
        f107416a.put(str, TypefaceUtil.getTypefaceRegular(context));
        return TypefaceUtil.getTypefaceRegular(context);
    }
}