package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;

/* loaded from: classes2.dex */
public interface StableIdStorage {

    /* loaded from: classes2.dex */
    public static class IsolatedStableIdStorage implements StableIdStorage {

        /* renamed from: a */
        public long f37024a = 0;

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage$a */
        /* loaded from: classes2.dex */
        public class C4932a implements StableIdLookup {

            /* renamed from: a */
            public final LongSparseArray f37025a = new LongSparseArray();

            public C4932a() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                Long l = (Long) this.f37025a.get(j);
                if (l == null) {
                    l = Long.valueOf(IsolatedStableIdStorage.this.m53267a());
                    this.f37025a.put(j, l);
                }
                return l.longValue();
            }
        }

        /* renamed from: a */
        public long m53267a() {
            long j = this.f37024a;
            this.f37024a = 1 + j;
            return j;
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return new C4932a();
        }
    }

    /* loaded from: classes2.dex */
    public static class NoStableIdStorage implements StableIdStorage {

        /* renamed from: a */
        public final StableIdLookup f37027a = new C4933a();

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$a */
        /* loaded from: classes2.dex */
        public class C4933a implements StableIdLookup {
            public C4933a() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.f37027a;
        }
    }

    /* loaded from: classes2.dex */
    public static class SharedPoolStableIdStorage implements StableIdStorage {

        /* renamed from: a */
        public final StableIdLookup f37029a = new C4934a();

        /* renamed from: androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$a */
        /* loaded from: classes2.dex */
        public class C4934a implements StableIdLookup {
            public C4934a() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.f37029a;
        }
    }

    /* loaded from: classes2.dex */
    public interface StableIdLookup {
        long localToGlobal(long j);
    }

    StableIdLookup createStableIdLookup();
}
