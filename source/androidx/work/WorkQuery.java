package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class WorkQuery {

    /* renamed from: a */
    public final List f38265a;

    /* renamed from: b */
    public final List f38266b;

    /* renamed from: c */
    public final List f38267c;

    /* renamed from: d */
    public final List f38268d;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public List f38269a = new ArrayList();

        /* renamed from: b */
        public List f38270b = new ArrayList();

        /* renamed from: c */
        public List f38271c = new ArrayList();

        /* renamed from: d */
        public List f38272d = new ArrayList();

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromIds(@NonNull List<UUID> list) {
            Builder builder = new Builder();
            builder.addIds(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromStates(@NonNull List<WorkInfo.State> list) {
            Builder builder = new Builder();
            builder.addStates(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromTags(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addTags(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromUniqueWorkNames(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addUniqueWorkNames(list);
            return builder;
        }

        @NonNull
        public Builder addIds(@NonNull List<UUID> list) {
            this.f38269a.addAll(list);
            return this;
        }

        @NonNull
        public Builder addStates(@NonNull List<WorkInfo.State> list) {
            this.f38272d.addAll(list);
            return this;
        }

        @NonNull
        public Builder addTags(@NonNull List<String> list) {
            this.f38271c.addAll(list);
            return this;
        }

        @NonNull
        public Builder addUniqueWorkNames(@NonNull List<String> list) {
            this.f38270b.addAll(list);
            return this;
        }

        @NonNull
        public WorkQuery build() {
            if (this.f38269a.isEmpty() && this.f38270b.isEmpty() && this.f38271c.isEmpty() && this.f38272d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this);
        }
    }

    public WorkQuery(Builder builder) {
        this.f38265a = builder.f38269a;
        this.f38266b = builder.f38270b;
        this.f38267c = builder.f38271c;
        this.f38268d = builder.f38272d;
    }

    @NonNull
    public static WorkQuery fromIds(@NonNull List<UUID> list) {
        return Builder.fromIds(list).build();
    }

    @NonNull
    public static WorkQuery fromStates(@NonNull List<WorkInfo.State> list) {
        return Builder.fromStates(list).build();
    }

    @NonNull
    public static WorkQuery fromTags(@NonNull List<String> list) {
        return Builder.fromTags(list).build();
    }

    @NonNull
    public static WorkQuery fromUniqueWorkNames(@NonNull String... strArr) {
        return Builder.fromUniqueWorkNames(Arrays.asList(strArr)).build();
    }

    @NonNull
    public List<UUID> getIds() {
        return this.f38265a;
    }

    @NonNull
    public List<WorkInfo.State> getStates() {
        return this.f38268d;
    }

    @NonNull
    public List<String> getTags() {
        return this.f38267c;
    }

    @NonNull
    public List<String> getUniqueWorkNames() {
        return this.f38266b;
    }

    @NonNull
    public static WorkQuery fromIds(@NonNull UUID... uuidArr) {
        return fromIds(Arrays.asList(uuidArr));
    }

    @NonNull
    public static WorkQuery fromStates(@NonNull WorkInfo.State... stateArr) {
        return Builder.fromStates(Arrays.asList(stateArr)).build();
    }

    @NonNull
    public static WorkQuery fromTags(@NonNull String... strArr) {
        return fromTags(Arrays.asList(strArr));
    }

    @NonNull
    public static WorkQuery fromUniqueWorkNames(@NonNull List<String> list) {
        return Builder.fromUniqueWorkNames(list).build();
    }
}
