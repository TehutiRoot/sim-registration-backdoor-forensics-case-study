package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* renamed from: a */
    public final FileOpener f42189a;

    /* loaded from: classes3.dex */
    public static class Factory<Data> implements ModelLoaderFactory<File, Data> {

        /* renamed from: a */
        public final FileOpener f42190a;

        public Factory(FileOpener<Data> fileOpener) {
            this.f42190a = fileOpener;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader<File, Data> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new FileLoader(this.f42190a);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    /* loaded from: classes3.dex */
    public static class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory$a */
        /* loaded from: classes3.dex */
        public class C5840a implements FileOpener {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            /* renamed from: a */
            public void close(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            /* renamed from: b */
            public ParcelFileDescriptor open(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public Class getDataClass() {
                return ParcelFileDescriptor.class;
            }
        }

        public FileDescriptorFactory() {
            super(new C5840a());
        }
    }

    /* loaded from: classes3.dex */
    public interface FileOpener<Data> {
        void close(Data data) throws IOException;

        Class<Data> getDataClass();

        Data open(File file) throws FileNotFoundException;
    }

    /* loaded from: classes3.dex */
    public static class StreamFactory extends Factory<InputStream> {

        /* renamed from: com.bumptech.glide.load.model.FileLoader$StreamFactory$a */
        /* loaded from: classes3.dex */
        public class C5841a implements FileOpener {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            /* renamed from: a */
            public void close(InputStream inputStream) {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            /* renamed from: b */
            public InputStream open(File file) {
                return new FileInputStream(file);
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public Class getDataClass() {
                return InputStream.class;
            }
        }

        public StreamFactory() {
            super(new C5841a());
        }
    }

    /* renamed from: com.bumptech.glide.load.model.FileLoader$a */
    /* loaded from: classes3.dex */
    public static final class C5842a implements DataFetcher {

        /* renamed from: a */
        public final File f42191a;

        /* renamed from: b */
        public final FileOpener f42192b;

        /* renamed from: c */
        public Object f42193c;

        public C5842a(File file, FileOpener fileOpener) {
            this.f42191a = file;
            this.f42192b = fileOpener;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            Object obj = this.f42193c;
            if (obj != null) {
                try {
                    this.f42192b.close(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return this.f42192b.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            try {
                Object open = this.f42192b.open(this.f42191a);
                this.f42193c = open;
                dataCallback.onDataReady(open);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                dataCallback.onLoadFailed(e);
            }
        }
    }

    public FileLoader(FileOpener<Data> fileOpener) {
        this.f42189a = fileOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@NonNull File file, int i, int i2, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(file), new C5842a(file, this.f42189a));
    }
}
