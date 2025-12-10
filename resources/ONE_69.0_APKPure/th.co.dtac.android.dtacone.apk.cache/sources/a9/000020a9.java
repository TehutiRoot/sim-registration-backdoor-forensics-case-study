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
    public final AbstractC2584b f11710a;

    /* renamed from: androidx.camera.video.OutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2583a {

        /* renamed from: a */
        public final AbstractC2584b.AbstractC2585a f11711a;

        public AbstractC2583a(AbstractC2584b.AbstractC2585a abstractC2585a) {
            this.f11711a = abstractC2585a;
            abstractC2585a.mo62193b(0L);
            abstractC2585a.mo62194a(0L);
        }

        public Object setDurationLimitMillis(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "The specified duration limit can't be negative.");
            this.f11711a.mo62194a(j);
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
            this.f11711a.mo62193b(j);
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
            this.f11711a.mo62192c(location);
            return this;
        }
    }

    /* renamed from: androidx.camera.video.OutputOptions$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2584b {

        /* renamed from: androidx.camera.video.OutputOptions$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2585a {
            /* renamed from: a */
            public abstract Object mo62194a(long j);

            /* renamed from: b */
            public abstract Object mo62193b(long j);

            /* renamed from: c */
            public abstract Object mo62192c(Location location);
        }

        /* renamed from: a */
        public abstract long mo62200a();

        /* renamed from: b */
        public abstract long mo62199b();

        /* renamed from: c */
        public abstract Location mo62198c();
    }

    public OutputOptions(AbstractC2584b abstractC2584b) {
        this.f11710a = abstractC2584b;
    }

    @IntRange(from = 0)
    public long getDurationLimitMillis() {
        return this.f11710a.mo62200a();
    }

    @IntRange(from = 0)
    public long getFileSizeLimit() {
        return this.f11710a.mo62199b();
    }

    @Nullable
    public Location getLocation() {
        return this.f11710a.mo62198c();
    }
}