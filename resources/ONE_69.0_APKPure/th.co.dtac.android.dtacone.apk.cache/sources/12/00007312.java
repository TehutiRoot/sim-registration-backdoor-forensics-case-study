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
    public final Class f36666a;

    /* renamed from: b */
    public final int f36667b;

    /* renamed from: c */
    public final DataCallback f36668c;

    /* renamed from: d */
    public final ViewCallback f36669d;

    /* renamed from: e */
    public final TileList f36670e;

    /* renamed from: f */
    public final ThreadUtil.MainThreadCallback f36671f;

    /* renamed from: g */
    public final ThreadUtil.BackgroundCallback f36672g;

    /* renamed from: k */
    public boolean f36676k;

    /* renamed from: q */
    public final ThreadUtil.MainThreadCallback f36682q;

    /* renamed from: r */
    public final ThreadUtil.BackgroundCallback f36683r;

    /* renamed from: h */
    public final int[] f36673h = new int[2];

    /* renamed from: i */
    public final int[] f36674i = new int[2];

    /* renamed from: j */
    public final int[] f36675j = new int[2];

    /* renamed from: l */
    public int f36677l = 0;

    /* renamed from: m */
    public int f36678m = 0;

    /* renamed from: n */
    public int f36679n = 0;

    /* renamed from: o */
    public int f36680o = 0;

    /* renamed from: p */
    public final SparseIntArray f36681p = new SparseIntArray();

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
    public class C4861a implements ThreadUtil.MainThreadCallback {
        public C4861a() {
        }

        /* renamed from: a */
        public final boolean m53616a(int i) {
            if (i == AsyncListUtil.this.f36680o) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void addTile(int i, TileList.Tile tile) {
            if (!m53616a(i)) {
                AsyncListUtil.this.f36672g.recycleTile(tile);
                return;
            }
            TileList.Tile<T> m53111a = AsyncListUtil.this.f36670e.m53111a(tile);
            if (m53111a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("duplicate tile @");
                sb.append(m53111a.mStartPosition);
                AsyncListUtil.this.f36672g.recycleTile(m53111a);
            }
            int i2 = tile.mStartPosition + tile.mItemCount;
            int i3 = 0;
            while (i3 < AsyncListUtil.this.f36681p.size()) {
                int keyAt = AsyncListUtil.this.f36681p.keyAt(i3);
                if (tile.mStartPosition <= keyAt && keyAt < i2) {
                    AsyncListUtil.this.f36681p.removeAt(i3);
                    AsyncListUtil.this.f36669d.onItemLoaded(keyAt);
                } else {
                    i3++;
                }
            }
        }

        /* renamed from: b */
        public final void m53615b() {
            for (int i = 0; i < AsyncListUtil.this.f36670e.m53106f(); i++) {
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                asyncListUtil.f36672g.recycleTile(asyncListUtil.f36670e.m53109c(i));
            }
            AsyncListUtil.this.f36670e.m53110b();
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void removeTile(int i, int i2) {
            if (!m53616a(i)) {
                return;
            }
            TileList.Tile<T> m53107e = AsyncListUtil.this.f36670e.m53107e(i2);
            if (m53107e == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("tile not found @");
                sb.append(i2);
                return;
            }
            AsyncListUtil.this.f36672g.recycleTile(m53107e);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void updateItemCount(int i, int i2) {
            if (!m53616a(i)) {
                return;
            }
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            asyncListUtil.f36678m = i2;
            asyncListUtil.f36669d.onDataRefresh();
            AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
            asyncListUtil2.f36679n = asyncListUtil2.f36680o;
            m53615b();
            AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
            asyncListUtil3.f36676k = false;
            asyncListUtil3.m53617b();
        }
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$b */
    /* loaded from: classes2.dex */
    public class C4862b implements ThreadUtil.BackgroundCallback {

        /* renamed from: a */
        public TileList.Tile f36685a;

        /* renamed from: b */
        public final SparseBooleanArray f36686b = new SparseBooleanArray();

        /* renamed from: c */
        public int f36687c;

        /* renamed from: d */
        public int f36688d;

        /* renamed from: e */
        public int f36689e;

        /* renamed from: f */
        public int f36690f;

        public C4862b() {
        }

        /* renamed from: a */
        public final TileList.Tile m53614a() {
            TileList.Tile tile = this.f36685a;
            if (tile != null) {
                this.f36685a = tile.f37178a;
                return tile;
            }
            AsyncListUtil asyncListUtil = AsyncListUtil.this;
            return new TileList.Tile(asyncListUtil.f36666a, asyncListUtil.f36667b);
        }

        /* renamed from: b */
        public final void m53613b(TileList.Tile tile) {
            this.f36686b.put(tile.mStartPosition, true);
            AsyncListUtil.this.f36671f.addTile(this.f36687c, tile);
        }

        /* renamed from: c */
        public final void m53612c(int i) {
            int maxCachedTiles = AsyncListUtil.this.f36668c.getMaxCachedTiles();
            while (this.f36686b.size() >= maxCachedTiles) {
                int keyAt = this.f36686b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f36686b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.f36689e - keyAt;
                int i3 = keyAt2 - this.f36690f;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    m53609f(keyAt);
                } else if (i3 > 0) {
                    if (i2 < i3 || i == 1) {
                        m53609f(keyAt2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: d */
        public final int m53611d(int i) {
            return i - (i % AsyncListUtil.this.f36667b);
        }

        /* renamed from: e */
        public final boolean m53610e(int i) {
            return this.f36686b.get(i);
        }

        /* renamed from: f */
        public final void m53609f(int i) {
            this.f36686b.delete(i);
            AsyncListUtil.this.f36671f.removeTile(this.f36687c, i);
        }

        /* renamed from: g */
        public final void m53608g(int i, int i2, int i3, boolean z) {
            int i4;
            int i5 = i;
            while (i5 <= i2) {
                if (z) {
                    i4 = (i2 + i) - i5;
                } else {
                    i4 = i5;
                }
                AsyncListUtil.this.f36672g.loadTile(i4, i3);
                i5 += AsyncListUtil.this.f36667b;
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void loadTile(int i, int i2) {
            if (m53610e(i)) {
                return;
            }
            TileList.Tile m53614a = m53614a();
            m53614a.mStartPosition = i;
            int min = Math.min(AsyncListUtil.this.f36667b, this.f36688d - i);
            m53614a.mItemCount = min;
            AsyncListUtil.this.f36668c.fillData(m53614a.mItems, m53614a.mStartPosition, min);
            m53612c(i2);
            m53613b(m53614a);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void recycleTile(TileList.Tile tile) {
            AsyncListUtil.this.f36668c.recycleData(tile.mItems, tile.mItemCount);
            tile.f37178a = this.f36685a;
            this.f36685a = tile;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void refresh(int i) {
            this.f36687c = i;
            this.f36686b.clear();
            int refreshData = AsyncListUtil.this.f36668c.refreshData();
            this.f36688d = refreshData;
            AsyncListUtil.this.f36671f.updateItemCount(this.f36687c, refreshData);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void updateRange(int i, int i2, int i3, int i4, int i5) {
            if (i > i2) {
                return;
            }
            int m53611d = m53611d(i);
            int m53611d2 = m53611d(i2);
            this.f36689e = m53611d(i3);
            int m53611d3 = m53611d(i4);
            this.f36690f = m53611d3;
            if (i5 == 1) {
                m53608g(this.f36689e, m53611d2, i5, true);
                m53608g(m53611d2 + AsyncListUtil.this.f36667b, this.f36690f, i5, false);
                return;
            }
            m53608g(m53611d, m53611d3, i5, false);
            m53608g(this.f36689e, m53611d - AsyncListUtil.this.f36667b, i5, true);
        }
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        C4861a c4861a = new C4861a();
        this.f36682q = c4861a;
        C4862b c4862b = new C4862b();
        this.f36683r = c4862b;
        this.f36666a = cls;
        this.f36667b = i;
        this.f36668c = dataCallback;
        this.f36669d = viewCallback;
        this.f36670e = new TileList(i);
        C4946g c4946g = new C4946g();
        this.f36671f = c4946g.mo52952a(c4861a);
        this.f36672g = c4946g.mo52951b(c4862b);
        refresh();
    }

    /* renamed from: a */
    public final boolean m53618a() {
        if (this.f36680o != this.f36679n) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m53617b() {
        int i;
        this.f36669d.getItemRangeInto(this.f36673h);
        int[] iArr = this.f36673h;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 > i3 || i2 < 0 || i3 >= this.f36678m) {
            return;
        }
        if (!this.f36676k) {
            this.f36677l = 0;
        } else {
            int[] iArr2 = this.f36674i;
            if (i2 <= iArr2[1] && (i = iArr2[0]) <= i3) {
                if (i2 < i) {
                    this.f36677l = 1;
                } else if (i2 > i) {
                    this.f36677l = 2;
                }
            } else {
                this.f36677l = 0;
            }
        }
        int[] iArr3 = this.f36674i;
        iArr3[0] = i2;
        iArr3[1] = i3;
        this.f36669d.extendRangeInto(iArr, this.f36675j, this.f36677l);
        int[] iArr4 = this.f36675j;
        iArr4[0] = Math.min(this.f36673h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f36675j;
        iArr5[1] = Math.max(this.f36673h[1], Math.min(iArr5[1], this.f36678m - 1));
        ThreadUtil.BackgroundCallback backgroundCallback = this.f36672g;
        int[] iArr6 = this.f36673h;
        int i4 = iArr6[0];
        int i5 = iArr6[1];
        int[] iArr7 = this.f36675j;
        backgroundCallback.updateRange(i4, i5, iArr7[0], iArr7[1], this.f36677l);
    }

    @Nullable
    public T getItem(int i) {
        if (i >= 0 && i < this.f36678m) {
            T t = (T) this.f36670e.m53108d(i);
            if (t == null && !m53618a()) {
                this.f36681p.put(i, 0);
            }
            return t;
        }
        throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.f36678m);
    }

    public int getItemCount() {
        return this.f36678m;
    }

    public void onRangeChanged() {
        if (m53618a()) {
            return;
        }
        m53617b();
        this.f36676k = true;
    }

    public void refresh() {
        this.f36681p.clear();
        ThreadUtil.BackgroundCallback backgroundCallback = this.f36672g;
        int i = this.f36680o + 1;
        this.f36680o = i;
        backgroundCallback.refresh(i);
    }
}