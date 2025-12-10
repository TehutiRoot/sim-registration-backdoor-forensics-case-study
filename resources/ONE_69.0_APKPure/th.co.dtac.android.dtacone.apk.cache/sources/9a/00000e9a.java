package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: PK1 */
/* loaded from: classes4.dex */
public abstract class PK1 extends LinearLayoutManager {

    /* renamed from: PK1$a */
    /* loaded from: classes4.dex */
    public class C1082a extends LinearSmoothScroller {
        public C1082a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public PK1(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C1082a c1082a = new C1082a(recyclerView.getContext());
        c1082a.setTargetPosition(i);
        startSmoothScroll(c1082a);
    }
}