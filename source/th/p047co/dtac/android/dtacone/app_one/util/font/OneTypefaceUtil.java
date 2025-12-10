package th.p047co.dtac.android.dtacone.app_one.util.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import th.p047co.dtac.android.dtacone.util.constant.type_face.TypeFace;

/* renamed from: th.co.dtac.android.dtacone.app_one.util.font.OneTypefaceUtil */
/* loaded from: classes7.dex */
public class OneTypefaceUtil {
    public static final String BOLD = "BOLD";
    public static final String REGULAR = "REGULAR";

    public static Typeface getTypeface(String str, AssetManager assetManager) {
        if (str.equals("BOLD")) {
            return Typeface.createFromAsset(assetManager, "fonts/better_together_bold.ttf");
        }
        return Typeface.createFromAsset(assetManager, "fonts/better_together_regular.ttf");
    }

    public static Typeface getTypefaceMedium(Context context) {
        return Typeface.createFromAsset(context.getAssets(), TypeFace.getTypeOneFacePathMedium());
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
                    textView.setTypeface(OneCacheFont.getFonts(context, "REGULAR"));
                } else {
                    textView.setTypeface(getTypeface("BOLD", assets));
                }
            }
            textView.setTypeface(OneCacheFont.getFonts(context, "REGULAR"));
        }
        textView.invalidate();
    }
}
