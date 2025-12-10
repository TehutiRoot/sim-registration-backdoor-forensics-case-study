package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import androidx.core.util.AtomicFile;
import com.google.common.util.concurrent.ListenableFuture;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@Deprecated
/* loaded from: classes.dex */
public final class BrowserServiceFileProvider extends FileProvider {

    /* renamed from: f */
    public static Object f10122f = new Object();

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$a */
    /* loaded from: classes.dex */
    public class RunnableC2302a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ContentResolver f10123a;

        /* renamed from: b */
        public final /* synthetic */ Uri f10124b;

        /* renamed from: c */
        public final /* synthetic */ ResolvableFuture f10125c;

        public RunnableC2302a(ContentResolver contentResolver, Uri uri, ResolvableFuture resolvableFuture) {
            this.f10123a = contentResolver;
            this.f10124b = uri;
            this.f10125c = resolvableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f10123a.openFileDescriptor(this.f10124b, PDPageLabelRange.STYLE_ROMAN_LOWER);
                if (openFileDescriptor == null) {
                    this.f10125c.setException(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    this.f10125c.setException(new IOException("File could not be decoded."));
                } else {
                    this.f10125c.set(decodeFileDescriptor);
                }
            } catch (IOException e) {
                this.f10125c.setException(e);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$b */
    /* loaded from: classes.dex */
    public static class AsyncTaskC2303b extends AsyncTask {

        /* renamed from: b */
        public static final long f10126b;

        /* renamed from: c */
        public static final long f10127c;

        /* renamed from: d */
        public static final long f10128d;

        /* renamed from: a */
        public final Context f10129a;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            f10126b = timeUnit.toMillis(7L);
            f10127c = timeUnit.toMillis(7L);
            f10128d = timeUnit.toMillis(1L);
        }

        public AsyncTaskC2303b(Context context) {
            this.f10129a = context.getApplicationContext();
        }

        /* renamed from: b */
        public static boolean m64063b(File file) {
            return file.getName().endsWith("..png");
        }

        /* renamed from: c */
        public static boolean m64062c(SharedPreferences sharedPreferences) {
            if (System.currentTimeMillis() > sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + f10127c) {
                return true;
            }
            return false;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            long currentTimeMillis;
            SharedPreferences sharedPreferences = this.f10129a.getSharedPreferences(this.f10129a.getPackageName() + ".image_provider", 0);
            if (!m64062c(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.f10122f) {
                try {
                    File file = new File(this.f10129a.getFilesDir(), "image_provider");
                    if (!file.exists()) {
                        return null;
                    }
                    File[] listFiles = file.listFiles();
                    long currentTimeMillis2 = System.currentTimeMillis() - f10126b;
                    boolean z = true;
                    for (File file2 : listFiles) {
                        if (m64063b(file2) && file2.lastModified() < currentTimeMillis2 && !file2.delete()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Fail to delete image: ");
                            sb.append(file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                    if (z) {
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        currentTimeMillis = (System.currentTimeMillis() - f10127c) + f10128d;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong("last_cleanup_time", currentTimeMillis);
                    edit.apply();
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.BrowserServiceFileProvider$c */
    /* loaded from: classes.dex */
    public static class AsyncTaskC2304c extends AsyncTask {

        /* renamed from: a */
        public final Context f10130a;

        /* renamed from: b */
        public final String f10131b;

        /* renamed from: c */
        public final Bitmap f10132c;

        /* renamed from: d */
        public final Uri f10133d;

        /* renamed from: e */
        public final ResolvableFuture f10134e;

        public AsyncTaskC2304c(Context context, String str, Bitmap bitmap, Uri uri, ResolvableFuture resolvableFuture) {
            this.f10130a = context.getApplicationContext();
            this.f10131b = str;
            this.f10132c = bitmap;
            this.f10133d = uri;
            this.f10134e = resolvableFuture;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            m64058d();
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Void r3) {
            new AsyncTaskC2303b(this.f10130a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        /* renamed from: c */
        public final void m64059c(File file) {
            FileOutputStream fileOutputStream;
            if (Build.VERSION.SDK_INT >= 22) {
                AtomicFile atomicFile = new AtomicFile(file);
                try {
                    fileOutputStream = atomicFile.startWrite();
                    try {
                        this.f10132c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        atomicFile.finishWrite(fileOutputStream);
                        this.f10134e.set(this.f10133d);
                    } catch (IOException e) {
                        e = e;
                        atomicFile.failWrite(fileOutputStream);
                        this.f10134e.setException(e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                }
            } else {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    this.f10132c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.close();
                    this.f10134e.set(this.f10133d);
                } catch (IOException e3) {
                    this.f10134e.setException(e3);
                }
            }
        }

        /* renamed from: d */
        public final void m64058d() {
            File file = new File(this.f10130a.getFilesDir(), "image_provider");
            synchronized (BrowserServiceFileProvider.f10122f) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.f10134e.setException(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.f10131b + ".png");
                    if (file2.exists()) {
                        this.f10134e.set(this.f10133d);
                    } else {
                        m64059c(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void grantReadPermission(@NonNull Intent intent, @Nullable List<Uri> list, @NonNull Context context) {
        if (list != null && list.size() != 0) {
            ContentResolver contentResolver = context.getContentResolver();
            intent.addFlags(1);
            ClipData newUri = ClipData.newUri(contentResolver, "image_provider_uris", list.get(0));
            for (int i = 1; i < list.size(); i++) {
                newUri.addItem(new ClipData.Item(list.get(i)));
            }
            intent.setClipData(newUri);
        }
    }

    /* renamed from: h */
    public static Uri m64065h(Context context, String str) {
        return new Uri.Builder().scheme("content").authority(context.getPackageName() + ".image_provider").path("image_provider_images/" + str + ".png").build();
    }

    @NonNull
    public static ListenableFuture<Bitmap> loadBitmap(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
        ResolvableFuture create = ResolvableFuture.create();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new RunnableC2302a(contentResolver, uri, create));
        return create;
    }

    @NonNull
    @UiThread
    public static ResolvableFuture<Uri> saveBitmap(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull String str, int i) {
        String str2 = str + "_" + Integer.toString(i);
        Uri m64065h = m64065h(context, str2);
        ResolvableFuture<Uri> create = ResolvableFuture.create();
        new AsyncTaskC2304c(context, str2, bitmap, m64065h, create).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return create;
    }
}
