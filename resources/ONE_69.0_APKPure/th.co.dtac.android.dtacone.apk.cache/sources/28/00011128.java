package th.p047co.dtac.android.dtacone.app_one.util.font;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;

/* renamed from: th.co.dtac.android.dtacone.app_one.util.font.OneCacheFont */
/* loaded from: classes7.dex */
public class OneCacheFont {

    /* renamed from: a */
    public static Hashtable f82478a = new Hashtable();

    /* renamed from: a */
    public static boolean m20263a(String str) {
        return f82478a.containsKey(str);
    }

    public static Typeface getFonts(Context context, String str) {
        if (m20263a(str)) {
            return (Typeface) f82478a.get(str);
        }
        f82478a.put(str, OneTypefaceUtil.getTypefaceRegular(context));
        return OneTypefaceUtil.getTypefaceRegular(context);
    }
}