package com.tom_roush.pdfbox.android;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class PDFBoxResourceLoader {

    /* renamed from: a */
    public static AssetManager f59709a;

    public static InputStream getStream(String str) throws IOException {
        return f59709a.open(str);
    }

    public static void init(Context context) {
        f59709a = context.getApplicationContext().getAssets();
    }

    public static boolean isReady() {
        if (f59709a != null) {
            return true;
        }
        return false;
    }
}
