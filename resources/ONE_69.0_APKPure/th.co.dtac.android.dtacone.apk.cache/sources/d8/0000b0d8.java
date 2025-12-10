package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ImageDownload;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public class ImageDownload implements Closeable {

    /* renamed from: a */
    public final URL f55646a;

    /* renamed from: b */
    public volatile Future f55647b;

    /* renamed from: c */
    public Task f55648c;

    public ImageDownload(URL url) {
        this.f55646a = url;
    }

    @Nullable
    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w(Constants.TAG, "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap blockingDownload() throws IOException {
        if (Log.isLoggable(Constants.TAG, 4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Starting download of: ");
            sb.append(this.f55646a);
        }
        byte[] m38479d = m38479d();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m38479d, 0, m38479d.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successfully downloaded image: ");
                sb2.append(this.f55646a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f55646a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f55647b.cancel(true);
    }

    /* renamed from: d */
    public final byte[] m38479d() {
        URLConnection openConnection = this.f55646a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] m65690d = AbstractC1615Wf.m65690d(AbstractC1615Wf.m65692b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(Constants.TAG, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Downloaded ");
                    sb.append(m65690d.length);
                    sb.append(" bytes from ");
                    sb.append(this.f55646a);
                }
                if (m65690d.length <= 1048576) {
                    return m65690d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    /* renamed from: g */
    public final /* synthetic */ void m38478g(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingDownload());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.f55648c);
    }

    public void start(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f55647b = executorService.submit(new Runnable() { // from class: ld0
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownload.this.m38478g(taskCompletionSource);
            }
        });
        this.f55648c = taskCompletionSource.getTask();
    }
}