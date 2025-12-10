package androidx.camera.video;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class OutputOptions {
    public static final int DURATION_UNLIMITED = 0;
    public static final int FILE_SIZE_UNLIMITED = 0;

    /* renamed from: a */
    public final AbstractC2602b f11622a;

    /* renamed from: androidx.camera.video.OutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2601a {

        /* renamed from: a */
        public final AbstractC2602b.AbstractC2603a f11623a;

        public AbstractC2601a(AbstractC2602b.AbstractC2603a abstractC2603a) {
            this.f11623a = abstractC2603a;
            abstractC2603a.mo62245b(0L);
            abstractC2603a.mo62246a(0L);
        }

        public Object setDurationLimitMillis(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "The specified duration limit can't be negative.");
            this.f11623a.mo62246a(j);
            return this;
        }

        public Object setFileSizeLimit(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "The specified file size limit can't be negative.");
            this.f11623a.mo62245b(j);
            return this;
        }

        public Object setLocation(Location location) {
            boolean z;
            if (location != null) {
                boolean z2 = false;
                if (location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Latitude must be in the range [-90, 90]");
                if (location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d) {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "Longitude must be in the range [-180, 180]");
            }
            this.f11623a.mo62244c(location);
            return this;
        }
    }

    /* renamed from: androidx.camera.video.OutputOptions$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2602b {

        /* renamed from: androidx.camera.video.OutputOptions$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2603a {
            /* renamed from: a */
            public abstract Object mo62246a(long j);

            /* renamed from: b */
            public abstract Object mo62245b(long j);

            /* renamed from: c */
            public abstract Object mo62244c(Location location);
        }

        /* renamed from: a */
        public abstract long mo62252a();

        /* renamed from: b */
        public abstract long mo62251b();

        /* renamed from: c */
        public abstract Location mo62250c();
    }

    public OutputOptions(AbstractC2602b abstractC2602b) {
        this.f11622a = abstractC2602b;
    }

    @IntRange(from = 0)
    public long getDurationLimitMillis() {
        return this.f11622a.mo62252a();
    }

    @IntRange(from = 0)
    public long getFileSizeLimit() {
        return this.f11622a.mo62251b();
    }

    @Nullable
    public Location getLocation() {
        return this.f11622a.mo62250c();
    }
}
