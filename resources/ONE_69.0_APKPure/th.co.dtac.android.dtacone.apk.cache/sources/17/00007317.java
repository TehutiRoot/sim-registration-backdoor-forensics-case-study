package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {

    /* renamed from: a */
    public final ListUpdateCallback f36692a;

    /* renamed from: b */
    public int f36693b = 0;

    /* renamed from: c */
    public int f36694c = -1;

    /* renamed from: d */
    public int f36695d = -1;

    /* renamed from: e */
    public Object f36696e = null;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback) {
        this.f36692a = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i = this.f36693b;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f36692a.onChanged(this.f36694c, this.f36695d, this.f36696e);
                }
            } else {
                this.f36692a.onRemoved(this.f36694c, this.f36695d);
            }
        } else {
            this.f36692a.onInserted(this.f36694c, this.f36695d);
        }
        this.f36696e = null;
        this.f36693b = 0;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.f36693b == 3) {
            int i4 = this.f36694c;
            int i5 = this.f36695d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f36696e == obj) {
                this.f36694c = Math.min(i, i4);
                this.f36695d = Math.max(i5 + i4, i3) - this.f36694c;
                return;
            }
        }
        dispatchLastEvent();
        this.f36694c = i;
        this.f36695d = i2;
        this.f36696e = obj;
        this.f36693b = 3;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        int i3;
        if (this.f36693b == 1 && i >= (i3 = this.f36694c)) {
            int i4 = this.f36695d;
            if (i <= i3 + i4) {
                this.f36695d = i4 + i2;
                this.f36694c = Math.min(i, i3);
                return;
            }
        }
        dispatchLastEvent();
        this.f36694c = i;
        this.f36695d = i2;
        this.f36693b = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        dispatchLastEvent();
        this.f36692a.onMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.f36693b == 2 && (i3 = this.f36694c) >= i && i3 <= i + i2) {
            this.f36695d += i2;
            this.f36694c = i;
            return;
        }
        dispatchLastEvent();
        this.f36694c = i;
        this.f36695d = i2;
        this.f36693b = 2;
    }
}