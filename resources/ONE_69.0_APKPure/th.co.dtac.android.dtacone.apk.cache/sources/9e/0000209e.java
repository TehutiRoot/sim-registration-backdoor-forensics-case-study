package androidx.camera.video;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.C2616d;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;
import java.io.File;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class FileOutputOptions extends OutputOptions {

    /* renamed from: b */
    public final AbstractC2579a f11706b;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Builder extends OutputOptions.AbstractC2583a {

        /* renamed from: b */
        public final AbstractC2579a.AbstractC2580a f11707b;

        public Builder(@NonNull File file) {
            super(new C2616d.C2618b());
            Preconditions.checkNotNull(file, "File can't be null.");
            AbstractC2579a.AbstractC2580a abstractC2580a = (AbstractC2579a.AbstractC2580a) this.f11711a;
            this.f11707b = abstractC2580a;
            abstractC2580a.mo62206e(file);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2583a
        @NonNull
        public /* bridge */ /* synthetic */ Object setDurationLimitMillis(@IntRange(from = 0) long j) {
            return super.setDurationLimitMillis(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2583a
        @NonNull
        public /* bridge */ /* synthetic */ Object setFileSizeLimit(@IntRange(from = 0) long j) {
            return super.setFileSizeLimit(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2583a
        @NonNull
        public /* bridge */ /* synthetic */ Object setLocation(@Nullable Location location) {
            return super.setLocation(location);
        }

        @NonNull
        /* renamed from: build */
        public FileOutputOptions m69374build() {
            return new FileOutputOptions(this.f11707b.mo62207d());
        }
    }

    /* renamed from: androidx.camera.video.FileOutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2579a extends OutputOptions.AbstractC2584b {

        /* renamed from: androidx.camera.video.FileOutputOptions$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2580a extends OutputOptions.AbstractC2584b.AbstractC2585a {
            /* renamed from: d */
            public abstract AbstractC2579a mo62207d();

            /* renamed from: e */
            public abstract AbstractC2580a mo62206e(File file);
        }

        /* renamed from: d */
        public abstract File mo62208d();
    }

    public FileOutputOptions(AbstractC2579a abstractC2579a) {
        super(abstractC2579a);
        this.f11706b = abstractC2579a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions)) {
            return false;
        }
        return this.f11706b.equals(((FileOutputOptions) obj).f11706b);
    }

    @NonNull
    public File getFile() {
        return this.f11706b.mo62208d();
    }

    public int hashCode() {
        return this.f11706b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f11706b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}