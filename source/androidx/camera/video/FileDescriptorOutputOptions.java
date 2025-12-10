package androidx.camera.video;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.C2631c;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class FileDescriptorOutputOptions extends OutputOptions {

    /* renamed from: b */
    public final AbstractC2595a f11616b;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Builder extends OutputOptions.AbstractC2601a {

        /* renamed from: b */
        public final AbstractC2595a.AbstractC2596a f11617b;

        public Builder(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            super(new C2631c.C2633b());
            Preconditions.checkNotNull(parcelFileDescriptor, "File descriptor can't be null.");
            AbstractC2595a.AbstractC2596a abstractC2596a = (AbstractC2595a.AbstractC2596a) this.f11623a;
            this.f11617b = abstractC2596a;
            abstractC2596a.mo62264e(parcelFileDescriptor);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2601a
        @NonNull
        public /* bridge */ /* synthetic */ Object setDurationLimitMillis(@IntRange(from = 0) long j) {
            return super.setDurationLimitMillis(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2601a
        @NonNull
        public /* bridge */ /* synthetic */ Object setFileSizeLimit(@IntRange(from = 0) long j) {
            return super.setFileSizeLimit(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2601a
        @NonNull
        public /* bridge */ /* synthetic */ Object setLocation(@Nullable Location location) {
            return super.setLocation(location);
        }

        @NonNull
        /* renamed from: build */
        public FileDescriptorOutputOptions m69187build() {
            return new FileDescriptorOutputOptions(this.f11617b.mo62265d());
        }
    }

    /* renamed from: androidx.camera.video.FileDescriptorOutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2595a extends OutputOptions.AbstractC2602b {

        /* renamed from: androidx.camera.video.FileDescriptorOutputOptions$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2596a extends OutputOptions.AbstractC2602b.AbstractC2603a {
            /* renamed from: d */
            public abstract AbstractC2595a mo62265d();

            /* renamed from: e */
            public abstract AbstractC2596a mo62264e(ParcelFileDescriptor parcelFileDescriptor);
        }

        /* renamed from: d */
        public abstract ParcelFileDescriptor mo62266d();
    }

    public FileDescriptorOutputOptions(AbstractC2595a abstractC2595a) {
        super(abstractC2595a);
        this.f11616b = abstractC2595a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDescriptorOutputOptions)) {
            return false;
        }
        return this.f11616b.equals(((FileDescriptorOutputOptions) obj).f11616b);
    }

    @NonNull
    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.f11616b.mo62266d();
    }

    public int hashCode() {
        return this.f11616b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f11616b.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }
}
