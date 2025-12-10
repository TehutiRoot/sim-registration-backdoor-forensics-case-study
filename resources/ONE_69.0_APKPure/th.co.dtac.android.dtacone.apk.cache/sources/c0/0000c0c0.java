package com.tom_roush.fontbox.util.autodetect;

import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public class FontFileFinder {

    /* renamed from: a */
    public FontDirFinder f59702a = null;

    /* renamed from: a */
    public final boolean m32799a(File file) {
        String lowerCase = file.getName().toLowerCase(Locale.US);
        if ((lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf") || lowerCase.endsWith(".pfb") || lowerCase.endsWith(".ttc")) && !lowerCase.startsWith("fonts.")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final FontDirFinder m32798b() {
        if (System.getProperty("java.vendor").equals("The Android Project")) {
            return new AndroidFontDirFinder();
        }
        String property = System.getProperty("os.name");
        if (property.startsWith("Windows")) {
            return new WindowsFontDirFinder();
        }
        if (property.startsWith("Mac")) {
            return new MacFontDirFinder();
        }
        if (property.startsWith("OS/400")) {
            return new OS400FontDirFinder();
        }
        return new UnixFontDirFinder();
    }

    /* renamed from: c */
    public final void m32797c(File file, List list) {
        File[] listFiles;
        if (!file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                if (!file2.getName().startsWith(".")) {
                    m32797c(file2, list);
                }
            } else {
                if (PDFBoxConfig.isDebugEnabled()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkFontfile check ");
                    sb.append(file2);
                }
                if (m32799a(file2)) {
                    if (PDFBoxConfig.isDebugEnabled()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("checkFontfile found ");
                        sb2.append(file2);
                    }
                    list.add(file2.toURI());
                }
            }
        }
    }

    public List<URI> find() {
        if (this.f59702a == null) {
            this.f59702a = m32798b();
        }
        List<File> find = this.f59702a.find();
        ArrayList arrayList = new ArrayList();
        for (File file : find) {
            m32797c(file, arrayList);
        }
        return arrayList;
    }

    public List<URI> find(String str) {
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (file.isDirectory()) {
            m32797c(file, arrayList);
        }
        return arrayList;
    }
}