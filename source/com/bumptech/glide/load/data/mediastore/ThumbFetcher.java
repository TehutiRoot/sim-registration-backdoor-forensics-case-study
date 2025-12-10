package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {

    /* renamed from: a */
    public final Uri f41876a;

    /* renamed from: b */
    public final YS1 f41877b;

    /* renamed from: c */
    public InputStream f41878c;

    /* renamed from: com.bumptech.glide.load.data.mediastore.ThumbFetcher$a */
    /* loaded from: classes3.dex */
    public static class C5767a implements XS1 {

        /* renamed from: b */
        public static final String[] f41879b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f41880a;

        public C5767a(ContentResolver contentResolver) {
            this.f41880a = contentResolver;
        }

        @Override // p000.XS1
        /* renamed from: a */
        public Cursor mo50487a(Uri uri) {
            return this.f41880a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f41879b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.mediastore.ThumbFetcher$b */
    /* loaded from: classes3.dex */
    public static class C5768b implements XS1 {

        /* renamed from: b */
        public static final String[] f41881b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f41882a;

        public C5768b(ContentResolver contentResolver) {
            this.f41882a = contentResolver;
        }

        @Override // p000.XS1
        /* renamed from: a */
        public Cursor mo50487a(Uri uri) {
            return this.f41882a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f41881b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public ThumbFetcher(Uri uri, YS1 ys1) {
        this.f41876a = uri;
        this.f41877b = ys1;
    }

    /* renamed from: a */
    public static ThumbFetcher m50489a(Context context, Uri uri, XS1 xs1) {
        return new ThumbFetcher(uri, new YS1(Glide.get(context).getRegistry().getImageHeaderParsers(), xs1, Glide.get(context).getArrayPool(), context.getContentResolver()));
    }

    public static ThumbFetcher buildImageFetcher(Context context, Uri uri) {
        return m50489a(context, uri, new C5767a(context.getContentResolver()));
    }

    public static ThumbFetcher buildVideoFetcher(Context context, Uri uri) {
        return m50489a(context, uri, new C5768b(context.getContentResolver()));
    }

    /* renamed from: b */
    public final InputStream m50488b() {
        int i;
        InputStream m65350d = this.f41877b.m65350d(this.f41876a);
        if (m65350d != null) {
            i = this.f41877b.m65353a(this.f41876a);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new ExifOrientationStream(m65350d, i);
        }
        return m65350d;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.f41878c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) {
        try {
            InputStream m50488b = m50488b();
            this.f41878c = m50488b;
            dataCallback.onDataReady(m50488b);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            dataCallback.onLoadFailed(e);
        }
    }
}
