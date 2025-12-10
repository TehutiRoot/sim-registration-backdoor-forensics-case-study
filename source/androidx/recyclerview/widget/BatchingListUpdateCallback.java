package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {

    /* renamed from: a */
    public final ListUpdateCallback f36604a;

    /* renamed from: b */
    public int f36605b = 0;

    /* renamed from: c */
    public int f36606c = -1;

    /* renamed from: d */
    public int f36607d = -1;

    /* renamed from: e */
    public Object f36608e = null;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback) {
        this.f36604a = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i = this.f36605b;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f36604a.onChanged(this.f36606c, this.f36607d, this.f36608e);
                }
            } else {
                this.f36604a.onRemoved(this.f36606c, this.f36607d);
            }
        } else {
            this.f36604a.onInserted(this.f36606c, this.f36607d);
        }
        this.f36608e = null;
        this.f36605b = 0;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.f36605b == 3) {
            int i4 = this.f36606c;
            int i5 = this.f36607d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f36608e == obj) {
                this.f36606c = Math.min(i, i4);
                this.f36607d = Math.max(i5 + i4, i3) - this.f36606c;
                return;
            }
        }
        dispatchLastEvent();
        this.f36606c = i;
        this.f36607d = i2;
        this.f36608e = obj;
        this.f36605b = 3;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        int i3;
        if (this.f36605b == 1 && i >= (i3 = this.f36606c)) {
            int i4 = this.f36607d;
            if (i <= i3 + i4) {
                this.f36607d = i4 + i2;
                this.f36606c = Math.min(i, i3);
                return;
            }
        }
        dispatchLastEvent();
        this.f36606c = i;
        this.f36607d = i2;
        this.f36605b = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        dispatchLastEvent();
        this.f36604a.onMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.f36605b == 2 && (i3 = this.f36606c) >= i && i3 <= i + i2) {
            this.f36607d += i2;
            this.f36606c = i;
            return;
        }
        dispatchLastEvent();
        this.f36606c = i;
        this.f36607d = i2;
        this.f36605b = 2;
    }
}
