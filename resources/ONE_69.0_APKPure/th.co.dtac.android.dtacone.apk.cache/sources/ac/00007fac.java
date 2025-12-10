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
    public final LottieNetworkCacheProvider f41533a;

    public NetworkCache(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.f41533a = lottieNetworkCacheProvider;
    }

    /* renamed from: b */
    public static String m50725b(String str, FileExtension fileExtension, boolean z) {
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
    public Pair m50726a(String str) {
        FileExtension fileExtension;
        try {
            File m50724c = m50724c(str);
            if (m50724c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m50724c);
            if (m50724c.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            Logger.debug("Cache hit for " + str + " at " + m50724c.getAbsolutePath());
            return new Pair(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final File m50724c(String str) {
        File file = new File(m50723d(), m50725b(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m50723d(), m50725b(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public void clear() {
        File m50723d = m50723d();
        if (m50723d.exists()) {
            File[] listFiles = m50723d.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : m50723d.listFiles()) {
                    file.delete();
                }
            }
            m50723d.delete();
        }
    }

    /* renamed from: d */
    public final File m50723d() {
        File cacheDir = this.f41533a.getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    /* renamed from: e */
    public void m50722e(String str, FileExtension fileExtension) {
        File file = new File(m50723d(), m50725b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        Logger.debug("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            Logger.warning("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* renamed from: f */
    public File m50721f(String str, InputStream inputStream, FileExtension fileExtension) {
        File file = new File(m50723d(), m50725b(str, fileExtension, true));
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