package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RequiresApi(29)
/* loaded from: classes3.dex */
public final class QMediaStoreUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* renamed from: a */
    public final Context f42272a;

    /* renamed from: b */
    public final ModelLoader f42273b;

    /* renamed from: c */
    public final ModelLoader f42274c;

    /* renamed from: d */
    public final Class f42275d;

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    public static final class FileDescriptorFactory extends AbstractC5858a {
        public FileDescriptorFactory(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    public static final class InputStreamFactory extends AbstractC5858a {
        public InputStreamFactory(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC5858a implements ModelLoaderFactory {

        /* renamed from: a */
        public final Context f42276a;

        /* renamed from: b */
        public final Class f42277b;

        public AbstractC5858a(Context context, Class cls) {
            this.f42276a = context;
            this.f42277b = cls;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<Uri, Object> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new QMediaStoreUriLoader(this.f42276a, multiModelLoaderFactory.build(File.class, this.f42277b), multiModelLoaderFactory.build(Uri.class, this.f42277b), this.f42277b);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.stream.QMediaStoreUriLoader$b */
    /* loaded from: classes3.dex */
    public static final class C5859b implements DataFetcher {

        /* renamed from: k */
        public static final String[] f42278k = {"_data"};

        /* renamed from: a */
        public final Context f42279a;

        /* renamed from: b */
        public final ModelLoader f42280b;

        /* renamed from: c */
        public final ModelLoader f42281c;

        /* renamed from: d */
        public final Uri f42282d;

        /* renamed from: e */
        public final int f42283e;

        /* renamed from: f */
        public final int f42284f;

        /* renamed from: g */
        public final Options f42285g;

        /* renamed from: h */
        public final Class f42286h;

        /* renamed from: i */
        public volatile boolean f42287i;

        /* renamed from: j */
        public volatile DataFetcher f42288j;

        public C5859b(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Uri uri, int i, int i2, Options options, Class cls) {
            this.f42279a = context.getApplicationContext();
            this.f42280b = modelLoader;
            this.f42281c = modelLoader2;
            this.f42282d = uri;
            this.f42283e = i;
            this.f42284f = i2;
            this.f42285g = options;
            this.f42286h = cls;
        }

        /* renamed from: a */
        public final ModelLoader.LoadData m50255a() {
            boolean isExternalStorageLegacy;
            Uri uri;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f42280b.buildLoadData(m50252d(this.f42282d), this.f42283e, this.f42284f, this.f42285g);
            }
            if (MediaStoreUtil.isAndroidPickerUri(this.f42282d)) {
                return this.f42281c.buildLoadData(this.f42282d, this.f42283e, this.f42284f, this.f42285g);
            }
            if (m50253c()) {
                uri = MediaStore.setRequireOriginal(this.f42282d);
            } else {
                uri = this.f42282d;
            }
            return this.f42281c.buildLoadData(uri, this.f42283e, this.f42284f, this.f42285g);
        }

        /* renamed from: b */
        public final DataFetcher m50254b() {
            ModelLoader.LoadData m50255a = m50255a();
            if (m50255a != null) {
                return m50255a.fetcher;
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m50253c() {
            int checkSelfPermission;
            checkSelfPermission = this.f42279a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            if (checkSelfPermission == 0) {
                return true;
            }
            return false;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
            this.f42287i = true;
            DataFetcher dataFetcher = this.f42288j;
            if (dataFetcher != null) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            DataFetcher dataFetcher = this.f42288j;
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
        }

        /* renamed from: d */
        public final File m50252d(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor query = this.f42279a.getContentResolver().query(uri, f42278k, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return this.f42286h;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            try {
                DataFetcher m50254b = m50254b();
                if (m50254b == null) {
                    dataCallback.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.f42282d));
                    return;
                }
                this.f42288j = m50254b;
                if (this.f42287i) {
                    cancel();
                } else {
                    m50254b.loadData(priority, dataCallback);
                }
            } catch (FileNotFoundException e) {
                dataCallback.onLoadFailed(e);
            }
        }
    }

    public QMediaStoreUriLoader(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Class cls) {
        this.f42272a = context.getApplicationContext();
        this.f42273b = modelLoader;
        this.f42274c = modelLoader2;
        this.f42275d = cls;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<DataT> buildLoadData(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(uri), new C5859b(this.f42272a, this.f42273b, this.f42274c, uri, i, i2, options, this.f42275d));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && MediaStoreUtil.isMediaStoreUri(uri);
    }
}
