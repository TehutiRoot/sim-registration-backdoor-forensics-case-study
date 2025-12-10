package androidx.camera.video;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.C2634d;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;
import java.io.File;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class FileOutputOptions extends OutputOptions {

    /* renamed from: b */
    public final AbstractC2597a f11618b;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Builder extends OutputOptions.AbstractC2601a {

        /* renamed from: b */
        public final AbstractC2597a.AbstractC2598a f11619b;

        public Builder(@NonNull File file) {
            super(new C2634d.C2636b());
            Preconditions.checkNotNull(file, "File can't be null.");
            AbstractC2597a.AbstractC2598a abstractC2598a = (AbstractC2597a.AbstractC2598a) this.f11623a;
            this.f11619b = abstractC2598a;
            abstractC2598a.mo62258e(file);
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
        public FileOutputOptions m69188build() {
            return new FileOutputOptions(this.f11619b.mo62259d());
        }
    }

    /* renamed from: androidx.camera.video.FileOutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2597a extends OutputOptions.AbstractC2602b {

        /* renamed from: androidx.camera.video.FileOutputOptions$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2598a extends OutputOptions.AbstractC2602b.AbstractC2603a {
            /* renamed from: d */
            public abstract AbstractC2597a mo62259d();

            /* renamed from: e */
            public abstract AbstractC2598a mo62258e(File file);
        }

        /* renamed from: d */
        public abstract File mo62260d();
    }

    public FileOutputOptions(AbstractC2597a abstractC2597a) {
        super(abstractC2597a);
        this.f11618b = abstractC2597a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions)) {
            return false;
        }
        return this.f11618b.equals(((FileOutputOptions) obj).f11618b);
    }

    @NonNull
    public File getFile() {
        return this.f11618b.mo62260d();
    }

    public int hashCode() {
        return this.f11618b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f11618b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
