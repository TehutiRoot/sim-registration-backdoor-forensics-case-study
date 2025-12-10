package com.tom_roush.pdfbox.android;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class PDFBoxResourceLoader {

    /* renamed from: a */
    public static AssetManager f59721a;

    public static InputStream getStream(String str) throws IOException {
        return f59721a.open(str);
    }

    public static void init(Context context) {
        f59721a = context.getApplicationContext().getAssets();
    }

    public static boolean isReady() {
        if (f59721a != null) {
            return true;
        }
        return false;
    }
}