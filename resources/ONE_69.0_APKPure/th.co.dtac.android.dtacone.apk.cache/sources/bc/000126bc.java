package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import th.p047co.dtac.android.dtacone.util.constant.type_face.TypeFace;
import th.p047co.dtac.android.dtacone.widget.view.DtacCacheFont;

/* renamed from: th.co.dtac.android.dtacone.util.TypefaceUtil */
/* loaded from: classes8.dex */
public class TypefaceUtil {
    public static final String BOLD = "BOLD";
    public static final String REGULAR = "REGULAR";

    /* renamed from: a */
    public static Typeface m16787a(String str, AssetManager assetManager) {
        if (str.equals("BOLD")) {
            return Typeface.createFromAsset(assetManager, "fonts/DTAC2013_Bl.ttf");
        }
        return Typeface.createFromAsset(assetManager, "fonts/DTAC2013_Rg.ttf");
    }

    public static Typeface getTypefaceRegular(Context context) {
        return Typeface.createFromAsset(context.getAssets(), TypeFace.getTypeOneFacePathRegular());
    }

    public static void setTypeFace(TextView textView, Context context, AttributeSet attributeSet) {
        if (!textView.isInEditMode()) {
            int i = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842903});
                i = obtainStyledAttributes.getInt(0, 0);
                obtainStyledAttributes.recycle();
            }
            Typeface typeface = textView.getTypeface();
            AssetManager assets = context.getAssets();
            if (typeface != null) {
                if ((typeface.getStyle() & 1) != 1 && (i & 1) != 1) {
                    textView.setTypeface(DtacCacheFont.getFonts(context, "REGULAR"));
                } else {
                    textView.setTypeface(m16787a("BOLD", assets));
                }
            }
            textView.setTypeface(DtacCacheFont.getFonts(context, "REGULAR"));
        }
        textView.invalidate();
    }
}