package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class NetworkCache {

    /* renamed from: a */
    public final LottieNetworkCacheProvider f41521a;

    public NetworkCache(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.f41521a = lottieNetworkCacheProvider;
    }

    /* renamed from: b */
    public static String m50728b(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = fileExtension.tempExtension();
        } else {
            str2 = fileExtension.extension;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public Pair m50729a(String str) {
        FileExtension fileExtension;
        try {
            File m50727c = m50727c(str);
            if (m50727c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m50727c);
            if (m50727c.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            Logger.debug("Cache hit for " + str + " at " + m50727c.getAbsolutePath());
            return new Pair(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final File m50727c(String str) {
        File file = new File(m50726d(), m50728b(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m50726d(), m50728b(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public void clear() {
        File m50726d = m50726d();
        if (m50726d.exists()) {
            File[] listFiles = m50726d.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : m50726d.listFiles()) {
                    file.delete();
                }
            }
            m50726d.delete();
        }
    }

    /* renamed from: d */
    public final File m50726d() {
        File cacheDir = this.f41521a.getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    /* renamed from: e */
    public void m50725e(String str, FileExtension fileExtension) {
        File file = new File(m50726d(), m50728b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        Logger.debug("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            Logger.warning("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* renamed from: f */
    public File m50724f(String str, InputStream inputStream, FileExtension fileExtension) {
        File file = new File(m50726d(), m50728b(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
