package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.DragStartHelper;

/* loaded from: classes2.dex */
public class DragStartHelper {

    /* renamed from: a */
    public final View f34153a;

    /* renamed from: b */
    public final OnDragStartListener f34154b;

    /* renamed from: c */
    public int f34155c;

    /* renamed from: d */
    public int f34156d;

    /* renamed from: e */
    public boolean f34157e;

    /* renamed from: f */
    public final View.OnLongClickListener f34158f = new View.OnLongClickListener() { // from class: eK
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return DragStartHelper.this.onLongClick(view);
        }
    };

    /* renamed from: g */
    public final View.OnTouchListener f34159g = new View.OnTouchListener() { // from class: fK
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return DragStartHelper.this.onTouch(view, motionEvent);
        }
    };

    /* loaded from: classes2.dex */
    public interface OnDragStartListener {
        boolean onDragStart(@NonNull View view, @NonNull DragStartHelper dragStartHelper);
    }

    public DragStartHelper(@NonNull View view, @NonNull OnDragStartListener onDragStartListener) {
        this.f34153a = view;
        this.f34154b = onDragStartListener;
    }

    public void attach() {
        this.f34153a.setOnLongClickListener(this.f34158f);
        this.f34153a.setOnTouchListener(this.f34159g);
    }

    public void detach() {
        this.f34153a.setOnLongClickListener(null);
        this.f34153a.setOnTouchListener(null);
    }

    public void getTouchPosition(@NonNull Point point) {
        point.set(this.f34155c, this.f34156d);
    }

    public boolean onLongClick(@NonNull View view) {
        return this.f34154b.onDragStart(view, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(@androidx.annotation.NonNull android.view.View r7, @androidx.annotation.NonNull android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.MotionEventCompat.isFromSource(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f34157e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f34155c
            if (r8 != r0) goto L39
            int r8 = r6.f34156d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f34155c = r0
            r6.f34156d = r1
            androidx.core.view.DragStartHelper$OnDragStartListener r8 = r6.f34154b
            boolean r7 = r8.onDragStart(r7, r6)
            r6.f34157e = r7
            return r7
        L46:
            r6.f34157e = r3
            goto L4d
        L49:
            r6.f34155c = r0
            r6.f34156d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.DragStartHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
