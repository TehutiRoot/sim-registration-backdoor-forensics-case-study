package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class TileList {

    /* renamed from: a */
    public final int f37087a;

    /* renamed from: b */
    public final SparseArray f37088b = new SparseArray(10);

    /* renamed from: c */
    public Tile f37089c;

    /* loaded from: classes2.dex */
    public static class Tile<T> {

        /* renamed from: a */
        public Tile f37090a;
        public int mItemCount;
        public final T[] mItems;
        public int mStartPosition;

        public Tile(Class cls, int i) {
            this.mItems = (T[]) ((Object[]) Array.newInstance(cls, i));
        }

        /* renamed from: a */
        public boolean m53154a(int i) {
            int i2 = this.mStartPosition;
            if (i2 <= i && i < i2 + this.mItemCount) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public Object m53153b(int i) {
            return this.mItems[i - this.mStartPosition];
        }
    }

    public TileList(int i) {
        this.f37087a = i;
    }

    /* renamed from: a */
    public Tile m53160a(Tile tile) {
        int indexOfKey = this.f37088b.indexOfKey(tile.mStartPosition);
        if (indexOfKey < 0) {
            this.f37088b.put(tile.mStartPosition, tile);
            return null;
        }
        Tile tile2 = (Tile) this.f37088b.valueAt(indexOfKey);
        this.f37088b.setValueAt(indexOfKey, tile);
        if (this.f37089c == tile2) {
            this.f37089c = tile;
        }
        return tile2;
    }

    /* renamed from: b */
    public void m53159b() {
        this.f37088b.clear();
    }

    /* renamed from: c */
    public Tile m53158c(int i) {
        if (i >= 0 && i < this.f37088b.size()) {
            return (Tile) this.f37088b.valueAt(i);
        }
        return null;
    }

    /* renamed from: d */
    public Object m53157d(int i) {
        Tile tile = this.f37089c;
        if (tile == null || !tile.m53154a(i)) {
            int indexOfKey = this.f37088b.indexOfKey(i - (i % this.f37087a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f37089c = (Tile) this.f37088b.valueAt(indexOfKey);
        }
        return this.f37089c.m53153b(i);
    }

    /* renamed from: e */
    public Tile m53156e(int i) {
        Tile tile = (Tile) this.f37088b.get(i);
        if (this.f37089c == tile) {
            this.f37089c = null;
        }
        this.f37088b.delete(i);
        return tile;
    }

    /* renamed from: f */
    public int m53155f() {
        return this.f37088b.size();
    }
}
