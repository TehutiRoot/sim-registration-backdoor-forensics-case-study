package androidx.camera.video;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.C2613c;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class FileDescriptorOutputOptions extends OutputOptions {

    /* renamed from: b */
    public final AbstractC2577a f11704b;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static final class Builder extends OutputOptions.AbstractC2583a {

        /* renamed from: b */
        public final AbstractC2577a.AbstractC2578a f11705b;

        public Builder(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            super(new C2613c.C2615b());
            Preconditions.checkNotNull(parcelFileDescriptor, "File descriptor can't be null.");
            AbstractC2577a.AbstractC2578a abstractC2578a = (AbstractC2577a.AbstractC2578a) this.f11711a;
            this.f11705b = abstractC2578a;
            abstractC2578a.mo62212e(parcelFileDescriptor);
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
        public FileDescriptorOutputOptions m69373build() {
            return new FileDescriptorOutputOptions(this.f11705b.mo62213d());
        }
    }

    /* renamed from: androidx.camera.video.FileDescriptorOutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2577a extends OutputOptions.AbstractC2584b {

        /* renamed from: androidx.camera.video.FileDescriptorOutputOptions$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2578a extends OutputOptions.AbstractC2584b.AbstractC2585a {
            /* renamed from: d */
            public abstract AbstractC2577a mo62213d();

            /* renamed from: e */
            public abstract AbstractC2578a mo62212e(ParcelFileDescriptor parcelFileDescriptor);
        }

        /* renamed from: d */
        public abstract ParcelFileDescriptor mo62214d();
    }

    public FileDescriptorOutputOptions(AbstractC2577a abstractC2577a) {
        super(abstractC2577a);
        this.f11704b = abstractC2577a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileDescriptorOutputOptions)) {
            return false;
        }
        return this.f11704b.equals(((FileDescriptorOutputOptions) obj).f11704b);
    }

    @NonNull
    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.f11704b.mo62214d();
    }

    public int hashCode() {
        return this.f11704b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f11704b.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }
}