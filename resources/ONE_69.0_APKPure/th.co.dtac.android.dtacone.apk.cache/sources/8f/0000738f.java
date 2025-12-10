package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;

/* loaded from: classes2.dex */
public interface StableIdStorage {

    /* loaded from: classes2.dex */
    public static class IsolatedStableIdStorage implements StableIdStorage {

        /* renamed from: a */
        public long f37112a = 0;

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage$a */
        /* loaded from: classes2.dex */
        public class C4914a implements StableIdLookup {

            /* renamed from: a */
            public final LongSparseArray f37113a = new LongSparseArray();

            public C4914a() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                Long l = (Long) this.f37113a.get(j);
                if (l == null) {
                    l = Long.valueOf(IsolatedStableIdStorage.this.m53218a());
                    this.f37113a.put(j, l);
                }
                return l.longValue();
            }
        }

        /* renamed from: a */
        public long m53218a() {
            long j = this.f37112a;
            this.f37112a = 1 + j;
            return j;
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return new C4914a();
        }
    }

    /* loaded from: classes2.dex */
    public static class NoStableIdStorage implements StableIdStorage {

        /* renamed from: a */
        public final StableIdLookup f37115a = new C4915a();

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$a */
        /* loaded from: classes2.dex */
        public class C4915a implements StableIdLookup {
            public C4915a() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.f37115a;
        }
    }

    /* loaded from: classes2.dex */
    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* renamed from: a */
        public final StableIdLookup f37117a = new C4916a();

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$a */
        /* loaded from: classes2.dex */
        public class C4916a implements StableIdLookup {
            public C4916a() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.f37117a;
        }
    }

    /* loaded from: classes2.dex */
    public interface StableIdLookup {
        long localToGlobal(long j);
    }

    StableIdLookup createStableIdLookup();
}