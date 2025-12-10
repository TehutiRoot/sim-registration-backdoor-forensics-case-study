package com.mixpanel.android.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.collection.LruCache;
import com.mixpanel.android.mpmetrics.MPConfig;
import com.mixpanel.android.util.RemoteService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public class ImageStore {

    /* renamed from: e */
    public static LruCache f58753e;

    /* renamed from: a */
    public final File f58754a;

    /* renamed from: b */
    public final RemoteService f58755b;

    /* renamed from: c */
    public final MessageDigest f58756c;

    /* renamed from: d */
    public final MPConfig f58757d;

    /* loaded from: classes5.dex */
    public static class CantGetImageException extends Exception {
        public CantGetImageException(String str) {
            super(str);
        }

        public CantGetImageException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: com.mixpanel.android.util.ImageStore$a */
    /* loaded from: classes5.dex */
    public class C9202a extends LruCache {
        public C9202a(int i) {
            super(i);
        }

        @Override // androidx.collection.LruCache
        /* renamed from: b */
        public int sizeOf(String str, Bitmap bitmap) {
            return (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
        }
    }

    public ImageStore(Context context, String str) {
        this(context, "MixpanelAPI.Images." + str, new HttpService());
    }

    /* renamed from: a */
    public static Bitmap m33464a(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outHeight * options.outWidth <= m33463b()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            if (decodeFile != null) {
                return decodeFile;
            }
            file.delete();
            throw new CantGetImageException("Bitmap on disk can't be opened or was corrupt");
        }
        throw new CantGetImageException("Do not have enough memory for the image");
    }

    public static void addBitmapToMemoryCache(String str, Bitmap bitmap) {
        if (getBitmapFromMemCache(str) == null) {
            synchronized (f58753e) {
                f58753e.put(str, bitmap);
            }
        }
    }

    /* renamed from: b */
    public static float m33463b() {
        Runtime runtime = Runtime.getRuntime();
        return ((float) runtime.maxMemory()) - ((float) (runtime.totalMemory() - runtime.freeMemory()));
    }

    public static void clearMemCache() {
        synchronized (f58753e) {
            f58753e.evictAll();
        }
    }

    public static Bitmap getBitmapFromMemCache(String str) {
        Bitmap bitmap;
        synchronized (f58753e) {
            bitmap = (Bitmap) f58753e.get(str);
        }
        return bitmap;
    }

    public static void removeBitmapFromMemCache(String str) {
        synchronized (f58753e) {
            f58753e.remove(str);
        }
    }

    /* renamed from: c */
    public final File m33462c(String str) {
        MessageDigest messageDigest = this.f58756c;
        if (messageDigest == null) {
            return null;
        }
        byte[] digest = messageDigest.digest(str.getBytes());
        return new File(this.f58754a, "MP_IMG_" + Base64.encodeToString(digest, 10));
    }

    public void clearStorage() {
        File[] listFiles;
        for (File file : this.f58754a.listFiles()) {
            if (file.getName().startsWith("MP_IMG_")) {
                file.delete();
            }
        }
        clearMemCache();
    }

    public void deleteStorage(String str) {
        File m33462c = m33462c(str);
        if (m33462c != null) {
            m33462c.delete();
            removeBitmapFromMemCache(str);
        }
    }

    public Bitmap getImage(String str) throws CantGetImageException {
        Bitmap bitmapFromMemCache = getBitmapFromMemCache(str);
        if (bitmapFromMemCache == null) {
            Bitmap m33464a = m33464a(getImageFile(str));
            addBitmapToMemoryCache(str, m33464a);
            return m33464a;
        }
        return bitmapFromMemCache;
    }

    public File getImageFile(String str) throws CantGetImageException {
        File m33462c = m33462c(str);
        if (m33462c == null || !m33462c.exists()) {
            try {
                FileOutputStream fileOutputStream = null;
                byte[] performRequest = this.f58755b.performRequest(str, null, this.f58757d.getSSLSocketFactory());
                if (performRequest != null && m33462c != null) {
                    try {
                        if (performRequest.length < 10000000) {
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(m33462c);
                                try {
                                    fileOutputStream2.write(performRequest);
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e) {
                                        MPLog.m33450w("MixpanelAPI.ImageStore", "Problem closing output file", e);
                                    }
                                } catch (FileNotFoundException e2) {
                                    e = e2;
                                    throw new CantGetImageException("It appears that ImageStore is misconfigured, or disk storage is unavailable- can't write to bitmap directory", e);
                                } catch (IOException e3) {
                                    e = e3;
                                    throw new CantGetImageException("Can't store bitmap", e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = fileOutputStream2;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e4) {
                                            MPLog.m33450w("MixpanelAPI.ImageStore", "Problem closing output file", e4);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (FileNotFoundException e5) {
                                e = e5;
                            } catch (IOException e6) {
                                e = e6;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (RemoteService.ServiceUnavailableException e7) {
                throw new CantGetImageException("Couldn't download image due to service availability", e7);
            } catch (IOException e8) {
                throw new CantGetImageException("Can't download bitmap", e8);
            }
        }
        return m33462c;
    }

    public ImageStore(Context context, String str, RemoteService remoteService) {
        MessageDigest messageDigest;
        this.f58754a = context.getDir(str, 0);
        this.f58755b = remoteService;
        this.f58757d = MPConfig.getInstance(context);
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException unused) {
            MPLog.m33451w("MixpanelAPI.ImageStore", "Images won't be stored because this platform doesn't supply a SHA1 hash function");
            messageDigest = null;
        }
        this.f58756c = messageDigest;
        if (f58753e == null) {
            synchronized (ImageStore.class) {
                try {
                    if (f58753e == null) {
                        f58753e = new C9202a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / this.f58757d.getImageCacheMaxMemoryFactor());
                    }
                } finally {
                }
            }
        }
    }
}
