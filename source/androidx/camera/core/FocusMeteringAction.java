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
    public final List f10789a;

    /* renamed from: b */
    public final List f10790b;

    /* renamed from: c */
    public final List f10791c;

    /* renamed from: d */
    public final long f10792d;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        public final List f10793a;

        /* renamed from: b */
        public final List f10794b;

        /* renamed from: c */
        public final List f10795c;

        /* renamed from: d */
        public long f10796d;

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
            this.f10796d = 0L;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder removePoints(int i) {
            if ((i & 1) != 0) {
                this.f10793a.clear();
            }
            if ((i & 2) != 0) {
                this.f10794b.clear();
            }
            if ((i & 4) != 0) {
                this.f10795c.clear();
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
            this.f10796d = timeUnit.toMillis(j);
            return this;
        }

        public Builder(@NonNull MeteringPoint meteringPoint, int i) {
            this.f10793a = new ArrayList();
            this.f10794b = new ArrayList();
            this.f10795c = new ArrayList();
            this.f10796d = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
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
                this.f10793a.add(meteringPoint);
            }
            if ((i & 2) != 0) {
                this.f10794b.add(meteringPoint);
            }
            if ((i & 4) != 0) {
                this.f10795c.add(meteringPoint);
            }
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder(@NonNull FocusMeteringAction focusMeteringAction) {
            ArrayList arrayList = new ArrayList();
            this.f10793a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f10794b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f10795c = arrayList3;
            this.f10796d = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
            arrayList.addAll(focusMeteringAction.getMeteringPointsAf());
            arrayList2.addAll(focusMeteringAction.getMeteringPointsAe());
            arrayList3.addAll(focusMeteringAction.getMeteringPointsAwb());
            this.f10796d = focusMeteringAction.getAutoCancelDurationInMillis();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface MeteringMode {
    }

    public FocusMeteringAction(Builder builder) {
        this.f10789a = Collections.unmodifiableList(builder.f10793a);
        this.f10790b = Collections.unmodifiableList(builder.f10794b);
        this.f10791c = Collections.unmodifiableList(builder.f10795c);
        this.f10792d = builder.f10796d;
    }

    public long getAutoCancelDurationInMillis() {
        return this.f10792d;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAe() {
        return this.f10790b;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAf() {
        return this.f10789a;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAwb() {
        return this.f10791c;
    }

    public boolean isAutoCancelEnabled() {
        if (this.f10792d > 0) {
            return true;
        }
        return false;
    }
}
