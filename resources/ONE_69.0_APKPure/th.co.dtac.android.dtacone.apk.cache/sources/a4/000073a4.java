package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class TileList {

    /* renamed from: a */
    public final int f37175a;

    /* renamed from: b */
    public final SparseArray f37176b = new SparseArray(10);

    /* renamed from: c */
    public Tile f37177c;

    /* loaded from: classes2.dex */
    public static class Tile<T> {

        /* renamed from: a */
        public Tile f37178a;
        public int mItemCount;
        public final T[] mItems;
        public int mStartPosition;

        public Tile(Class cls, int i) {
            this.mItems = (T[]) ((Object[]) Array.newInstance(cls, i));
        }

        /* renamed from: a */
        public boolean m53105a(int i) {
            int i2 = this.mStartPosition;
            if (i2 <= i && i < i2 + this.mItemCount) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public Object m53104b(int i) {
            return this.mItems[i - this.mStartPosition];
        }
    }

    public TileList(int i) {
        this.f37175a = i;
    }

    /* renamed from: a */
    public Tile m53111a(Tile tile) {
        int indexOfKey = this.f37176b.indexOfKey(tile.mStartPosition);
        if (indexOfKey < 0) {
            this.f37176b.put(tile.mStartPosition, tile);
            return null;
        }
        Tile tile2 = (Tile) this.f37176b.valueAt(indexOfKey);
        this.f37176b.setValueAt(indexOfKey, tile);
        if (this.f37177c == tile2) {
            this.f37177c = tile;
        }
        return tile2;
    }

    /* renamed from: b */
    public void m53110b() {
        this.f37176b.clear();
    }

    /* renamed from: c */
    public Tile m53109c(int i) {
        if (i >= 0 && i < this.f37176b.size()) {
            return (Tile) this.f37176b.valueAt(i);
        }
        return null;
    }

    /* renamed from: d */
    public Object m53108d(int i) {
        Tile tile = this.f37177c;
        if (tile == null || !tile.m53105a(i)) {
            int indexOfKey = this.f37176b.indexOfKey(i - (i % this.f37175a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f37177c = (Tile) this.f37176b.valueAt(indexOfKey);
        }
        return this.f37177c.m53104b(i);
    }

    /* renamed from: e */
    public Tile m53107e(int i) {
        Tile tile = (Tile) this.f37176b.get(i);
        if (this.f37177c == tile) {
            this.f37177c = null;
        }
        this.f37176b.delete(i);
        return tile;
    }

    /* renamed from: f */
    public int m53106f() {
        return this.f37176b.size();
    }
}