package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class FontAssetManager {

    /* renamed from: d */
    public final AssetManager f41280d;

    /* renamed from: e */
    public FontAssetDelegate f41281e;

    /* renamed from: a */
    public final MutablePair f41277a = new MutablePair();

    /* renamed from: b */
    public final Map f41278b = new HashMap();

    /* renamed from: c */
    public final Map f41279c = new HashMap();

    /* renamed from: f */
    public String f41282f = ".ttf";

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
        this.f41281e = fontAssetDelegate;
        if (!(callback instanceof View)) {
            Logger.warning("LottieDrawable must be inside of a view for images to work.");
            this.f41280d = null;
            return;
        }
        this.f41280d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public final Typeface m50802a(Font font) {
        Typeface typeface;
        String family = font.getFamily();
        Typeface typeface2 = (Typeface) this.f41279c.get(family);
        if (typeface2 != null) {
            return typeface2;
        }
        String style = font.getStyle();
        String name = font.getName();
        FontAssetDelegate fontAssetDelegate = this.f41281e;
        if (fontAssetDelegate != null) {
            typeface = fontAssetDelegate.fetchFont(family, style, name);
            if (typeface == null) {
                typeface = this.f41281e.fetchFont(family);
            }
        } else {
            typeface = null;
        }
        FontAssetDelegate fontAssetDelegate2 = this.f41281e;
        if (fontAssetDelegate2 != null && typeface == null) {
            String fontPath = fontAssetDelegate2.getFontPath(family, style, name);
            if (fontPath == null) {
                fontPath = this.f41281e.getFontPath(family);
            }
            if (fontPath != null) {
                typeface = Typeface.createFromAsset(this.f41280d, fontPath);
            }
        }
        if (font.getTypeface() != null) {
            return font.getTypeface();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f41280d, "fonts/" + family + this.f41282f);
        }
        this.f41279c.put(family, typeface);
        return typeface;
    }

    /* renamed from: b */
    public final Typeface m50801b(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    public Typeface getTypeface(Font font) {
        this.f41277a.set(font.getFamily(), font.getStyle());
        Typeface typeface = (Typeface) this.f41278b.get(this.f41277a);
        if (typeface != null) {
            return typeface;
        }
        Typeface m50801b = m50801b(m50802a(font), font.getStyle());
        this.f41278b.put(this.f41277a, m50801b);
        return m50801b;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f41282f = str;
    }

    public void setDelegate(@Nullable FontAssetDelegate fontAssetDelegate) {
        this.f41281e = fontAssetDelegate;
    }
}
