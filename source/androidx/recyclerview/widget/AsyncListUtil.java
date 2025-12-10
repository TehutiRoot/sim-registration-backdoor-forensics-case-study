package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* loaded from: classes2.dex */
public class AsyncListUtil<T> {

    /* renamed from: a */
    public final Class f36578a;

    /* renamed from: b */
    public final int f36579b;

    /* renamed from: c */
    public final DataCallback f36580c;

    /* renamed from: d */
    public final ViewCallback f36581d;

    /* renamed from: e */
    public final TileList f36582e;

    /* renamed from: f */
    public final ThreadUtil.MainThreadCallback f36583f;

    /* renamed from: g */
    public final ThreadUtil.BackgroundCallback f36584g;

    /* renamed from: k */
    public boolean f36588k;

    /* renamed from: q */
    public final ThreadUtil.MainThreadCallback f36594q;

    /* renamed from: r */
    public final ThreadUtil.BackgroundCallback f36595r;

    /* renamed from: h */
    public final int[] f36585h = new int[2];

    /* renamed from: i */
    public final int[] f36586i = new int[2];

    /* renamed from: j */
    public final int[] f36587j = new int[2];

    /* renamed from: l */
    public int f36589l = 0;

    /* renamed from: m */
    public int f36590m = 0;

    /* renamed from: n */
    public int f36591n = 0;

    /* renamed from: o */
    public int f36592o = 0;

    /* renamed from: p */
    public final SparseIntArray f36593p = new SparseIntArray();

    /* loaded from: classes2.dex */
    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i, int i2);

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i) {
        }

        @WorkerThread
        public abstract int refreshData();
    }

    /* loaded from: classes2.dex */
    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i) {
            int i2;
            int i3 = iArr[1];
            int i4 = iArr[0];
            int i5 = (i3 - i4) + 1;
            int i6 = i5 / 2;
            if (i == 1) {
                i2 = i5;
            } else {
                i2 = i6;
            }
            iArr2[0] = i4 - i2;
            if (i != 2) {
                i5 = i6;
            }
            iArr2[1] = i3 + i5;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i);
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$a */
    /* loaded from: classes2.dex */
    public class C4879a implements ThreadUtil.MainThreadCallback {
        public C4879a() {
        }

        /* renamed from: a */
        public final boolean m53665a(int i) {
            if (i == AsyncListUtil.this.f36592o) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, TileList.Tile tile) {
            if (!m53665a(i)) {
                AsyncListUtil.this.f36584g.recycleTile(tile);
                return;
            }
            TileList.Tile<T> m53160a = AsyncListUtil.this.f36582e.m53160a(tile);
            if (m53160a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("duplicate tile @");
                sb.append(m53160a.mStartPosition);
                AsyncListUtil.this.f36584g.recycleTile(m53160a);
            }
            int i2 = tile.mStartPosition + tile.mItemCount;
            int i3 = 0;
            while (i3 < AsyncListUtil.this.f36593p.size()) {
                int keyAt = AsyncListUtil.this.f36593p.keyAt(i3);
                if (tile.mStartPosition <= keyAt && keyAt < i2) {
                    AsyncListUtil.this.f36593p.removeAt(i3);
                    AsyncListUtil.this.f36581d.onItemLoaded(keyAt);
                } else {
                    i3++;
                }
            }
        }

        /* renamed from: b */
        public final void m53664b() {
            for (int i = 0; i < AsyncListUtil.this.f36582e.m53155f(); i++) {
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                asyncListUtil.f36584g.recycleTile(asyncListUtil.f36582e.m53158c(i));
            }
            AsyncListUtil.this.f36582e.m53159b();
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            if (!m53665a(i)) {
                return;
            }
            TileList.Tile<T> m53156e = AsyncListUtil.this.f36582e.m53156e(i2);
            if (m53156e == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("tile not found @");
                sb.append(i2);
                return;
            }
            AsyncListUtil.this.f36584g.recycleTile(m53156e);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            if (!m53665a(i)) {
                return;
            }
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            asyncListUtil.f36590m = i2;
            asyncListUtil.f36581d.onDataRefresh();
            AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
            asyncListUtil2.f36591n = asyncListUtil2.f36592o;
            m53664b();
            AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
            asyncListUtil3.f36588k = false;
            asyncListUtil3.m53666b();
        }
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$b */
    /* loaded from: classes2.dex */
    public class C4880b implements ThreadUtil.BackgroundCallback {

        /* renamed from: a */
        public TileList.Tile f36597a;

        /* renamed from: b */
        public final SparseBooleanArray f36598b = new SparseBooleanArray();

        /* renamed from: c */
        public int f36599c;

        /* renamed from: d */
        public int f36600d;

        /* renamed from: e */
        public int f36601e;

        /* renamed from: f */
        public int f36602f;

        public C4880b() {
        }

        /* renamed from: a */
        public final TileList.Tile m53663a() {
            TileList.Tile tile = this.f36597a;
            if (tile != null) {
                this.f36597a = tile.f37090a;
                return tile;
            }
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            return new TileList.Tile(asyncListUtil.f36578a, asyncListUtil.f36579b);
        }

        /* renamed from: b */
        public final void m53662b(TileList.Tile tile) {
            this.f36598b.put(tile.mStartPosition, true);
            AsyncListUtil.this.f36583f.addTile(this.f36599c, tile);
        }

        /* renamed from: c */
        public final void m53661c(int i) {
            int maxCachedTiles = AsyncListUtil.this.f36580c.getMaxCachedTiles();
            while (this.f36598b.size() >= maxCachedTiles) {
                int keyAt = this.f36598b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f36598b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.f36601e - keyAt;
                int i3 = keyAt2 - this.f36602f;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    m53658f(keyAt);
                } else if (i3 > 0) {
                    if (i2 < i3 || i == 1) {
                        m53658f(keyAt2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: d */
        public final int m53660d(int i) {
            return i - (i % AsyncListUtil.this.f36579b);
        }

        /* renamed from: e */
        public final boolean m53659e(int i) {
            return this.f36598b.get(i);
        }

        /* renamed from: f */
        public final void m53658f(int i) {
            this.f36598b.delete(i);
            AsyncListUtil.this.f36583f.removeTile(this.f36599c, i);
        }

        /* renamed from: g */
        public final void m53657g(int i, int i2, int i3, boolean z) {
            int i4;
            int i5 = i;
            while (i5 <= i2) {
                if (z) {
                    i4 = (i2 + i) - i5;
                } else {
                    i4 = i5;
                }
                AsyncListUtil.this.f36584g.loadTile(i4, i3);
                i5 += AsyncListUtil.this.f36579b;
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            if (m53659e(i)) {
                return;
            }
            TileList.Tile m53663a = m53663a();
            m53663a.mStartPosition = i;
            int min = Math.min(AsyncListUtil.this.f36579b, this.f36600d - i);
            m53663a.mItemCount = min;
            AsyncListUtil.this.f36580c.fillData(m53663a.mItems, m53663a.mStartPosition, min);
            m53661c(i2);
            m53662b(m53663a);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile tile) {
            AsyncListUtil.this.f36580c.recycleData(tile.mItems, tile.mItemCount);
            tile.f37090a = this.f36597a;
            this.f36597a = tile;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            this.f36599c = i;
            this.f36598b.clear();
            int refreshData = AsyncListUtil.this.f36580c.refreshData();
            this.f36600d = refreshData;
            AsyncListUtil.this.f36583f.updateItemCount(this.f36599c, refreshData);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            if (i > i2) {
                return;
            }
            int m53660d = m53660d(i);
            int m53660d2 = m53660d(i2);
            this.f36601e = m53660d(i3);
            int m53660d3 = m53660d(i4);
            this.f36602f = m53660d3;
            if (i5 == 1) {
                m53657g(this.f36601e, m53660d2, i5, true);
                m53657g(m53660d2 + AsyncListUtil.this.f36579b, this.f36602f, i5, false);
                return;
            }
            m53657g(m53660d, m53660d3, i5, false);
            m53657g(this.f36601e, m53660d - AsyncListUtil.this.f36579b, i5, true);
        }
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        C4879a c4879a = new C4879a();
        this.f36594q = c4879a;
        C4880b c4880b = new C4880b();
        this.f36595r = c4880b;
        this.f36578a = cls;
        this.f36579b = i;
        this.f36580c = dataCallback;
        this.f36581d = viewCallback;
        this.f36582e = new TileList(i);
        C4964g c4964g = new C4964g();
        this.f36583f = c4964g.mo53001a(c4879a);
        this.f36584g = c4964g.mo53000b(c4880b);
        refresh();
    }

    /* renamed from: a */
    public final boolean m53667a() {
        if (this.f36592o != this.f36591n) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m53666b() {
        int i;
        this.f36581d.getItemRangeInto(this.f36585h);
        int[] iArr = this.f36585h;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.f36590m) {
            return;
        }
        if (!this.f36588k) {
            this.f36589l = 0;
        } else {
            int[] iArr2 = this.f36586i;
            if (i2 <= iArr2[1] && (i = iArr2[0]) <= i3) {
                if (i2 < i) {
                    this.f36589l = 1;
                } else if (i2 > i) {
                    this.f36589l = 2;
                }
            } else {
                this.f36589l = 0;
            }
        }
        int[] iArr3 = this.f36586i;
        iArr3[0] = i2;
        iArr3[1] = i3;
        this.f36581d.extendRangeInto(iArr, this.f36587j, this.f36589l);
        int[] iArr4 = this.f36587j;
        iArr4[0] = Math.min(this.f36585h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f36587j;
        iArr5[1] = Math.max(this.f36585h[1], Math.min(iArr5[1], this.f36590m - 1));
        ThreadUtil.BackgroundCallback backgroundCallback = this.f36584g;
        int[] iArr6 = this.f36585h;
        int i4 = iArr6[0];
        int i5 = iArr6[1];
        int[] iArr7 = this.f36587j;
        backgroundCallback.updateRange(i4, i5, iArr7[0], iArr7[1], this.f36589l);
    }

    @Nullable
    public T getItem(int i) {
        if (i >= 0 && i < this.f36590m) {
            T t = (T) this.f36582e.m53157d(i);
            if (t == null && !m53667a()) {
                this.f36593p.put(i, 0);
            }
            return t;
        }
        throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.f36590m);
    }

    public int getItemCount() {
        return this.f36590m;
    }

    public void onRangeChanged() {
        if (m53667a()) {
            return;
        }
        m53666b();
        this.f36588k = true;
    }

    public void refresh() {
        this.f36593p.clear();
        ThreadUtil.BackgroundCallback backgroundCallback = this.f36584g;
        int i = this.f36592o + 1;
        this.f36592o = i;
        backgroundCallback.refresh(i);
    }
}
