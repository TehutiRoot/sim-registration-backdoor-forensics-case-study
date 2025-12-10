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
    public final Uri f41888a;

    /* renamed from: b */
    public final VT1 f41889b;

    /* renamed from: c */
    public InputStream f41890c;

    /* renamed from: com.bumptech.glide.load.data.mediastore.ThumbFetcher$a */
    /* loaded from: classes3.dex */
    public static class C5756a implements UT1 {

        /* renamed from: b */
        public static final String[] f41891b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f41892a;

        public C5756a(ContentResolver contentResolver) {
            this.f41892a = contentResolver;
        }

        @Override // p000.UT1
        /* renamed from: a */
        public Cursor mo50484a(Uri uri) {
            return this.f41892a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f41891b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.mediastore.ThumbFetcher$b */
    /* loaded from: classes3.dex */
    public static class C5757b implements UT1 {

        /* renamed from: b */
        public static final String[] f41893b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f41894a;

        public C5757b(ContentResolver contentResolver) {
            this.f41894a = contentResolver;
        }

        @Override // p000.UT1
        /* renamed from: a */
        public Cursor mo50484a(Uri uri) {
            return this.f41894a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f41893b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public ThumbFetcher(Uri uri, VT1 vt1) {
        this.f41888a = uri;
        this.f41889b = vt1;
    }

    /* renamed from: a */
    public static ThumbFetcher m50486a(Context context, Uri uri, UT1 ut1) {
        return new ThumbFetcher(uri, new VT1(Glide.get(context).getRegistry().getImageHeaderParsers(), ut1, Glide.get(context).getArrayPool(), context.getContentResolver()));
    }

    public static ThumbFetcher buildImageFetcher(Context context, Uri uri) {
        return m50486a(context, uri, new C5756a(context.getContentResolver()));
    }

    public static ThumbFetcher buildVideoFetcher(Context context, Uri uri) {
        return m50486a(context, uri, new C5757b(context.getContentResolver()));
    }

    /* renamed from: b */
    public final InputStream m50485b() {
        int i;
        InputStream m65979d = this.f41889b.m65979d(this.f41888a);
        if (m65979d != null) {
            i = this.f41889b.m65982a(this.f41888a);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new ExifOrientationStream(m65979d, i);
        }
        return m65979d;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.f41890c;
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
            InputStream m50485b = m50485b();
            this.f41890c = m50485b;
            dataCallback.onDataReady(m50485b);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            dataCallback.onLoadFailed(e);
        }
    }
}