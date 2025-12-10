package androidx.camera.core;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.lifecycle.CoroutineLiveDataKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class FocusMeteringAction {
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;

    /* renamed from: a */
    public final List f10877a;

    /* renamed from: b */
    public final List f10878b;

    /* renamed from: c */
    public final List f10879c;

    /* renamed from: d */
    public final long f10880d;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        public final List f10881a;

        /* renamed from: b */
        public final List f10882b;

        /* renamed from: c */
        public final List f10883c;

        /* renamed from: d */
        public long f10884d;

        public Builder(@NonNull MeteringPoint meteringPoint) {
            this(meteringPoint, 7);
        }

        @NonNull
        public Builder addPoint(@NonNull MeteringPoint meteringPoint) {
            return addPoint(meteringPoint, 7);
        }

        @NonNull
        public FocusMeteringAction build() {
            return new FocusMeteringAction(this);
        }

        @NonNull
        public Builder disableAutoCancel() {
            this.f10884d = 0L;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder removePoints(int i) {
            if ((i & 1) != 0) {
                this.f10881a.clear();
            }
            if ((i & 2) != 0) {
                this.f10882b.clear();
            }
            if ((i & 4) != 0) {
                this.f10883c.clear();
            }
            return this;
        }

        @NonNull
        public Builder setAutoCancelDuration(@IntRange(from = 1) long j, @NonNull TimeUnit timeUnit) {
            boolean z;
            if (j >= 1) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "autoCancelDuration must be at least 1");
            this.f10884d = timeUnit.toMillis(j);
            return this;
        }

        public Builder(@NonNull MeteringPoint meteringPoint, int i) {
            this.f10881a = new ArrayList();
            this.f10882b = new ArrayList();
            this.f10883c = new ArrayList();
            this.f10884d = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
            addPoint(meteringPoint, i);
        }

        @NonNull
        public Builder addPoint(@NonNull MeteringPoint meteringPoint, int i) {
            boolean z = false;
            Preconditions.checkArgument(meteringPoint != null, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z = true;
            }
            Preconditions.checkArgument(z, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.f10881a.add(meteringPoint);
            }
            if ((i & 2) != 0) {
                this.f10882b.add(meteringPoint);
            }
            if ((i & 4) != 0) {
                this.f10883c.add(meteringPoint);
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder(@NonNull FocusMeteringAction focusMeteringAction) {
            ArrayList arrayList = new ArrayList();
            this.f10881a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f10882b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f10883c = arrayList3;
            this.f10884d = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
            arrayList.addAll(focusMeteringAction.getMeteringPointsAf());
            arrayList2.addAll(focusMeteringAction.getMeteringPointsAe());
            arrayList3.addAll(focusMeteringAction.getMeteringPointsAwb());
            this.f10884d = focusMeteringAction.getAutoCancelDurationInMillis();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface MeteringMode {
    }

    public FocusMeteringAction(Builder builder) {
        this.f10877a = Collections.unmodifiableList(builder.f10881a);
        this.f10878b = Collections.unmodifiableList(builder.f10882b);
        this.f10879c = Collections.unmodifiableList(builder.f10883c);
        this.f10880d = builder.f10884d;
    }

    public long getAutoCancelDurationInMillis() {
        return this.f10880d;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAe() {
        return this.f10878b;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAf() {
        return this.f10877a;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAwb() {
        return this.f10879c;
    }

    public boolean isAutoCancelEnabled() {
        if (this.f10880d > 0) {
            return true;
        }
        return false;
    }
}