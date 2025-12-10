package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: SJ1 */
/* loaded from: classes4.dex */
public abstract class SJ1 extends LinearLayoutManager {

    /* renamed from: SJ1$a */
    /* loaded from: classes4.dex */
    public class C1304a extends LinearSmoothScroller {
        public C1304a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public SJ1(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C1304a c1304a = new C1304a(recyclerView.getContext());
        c1304a.setTargetPosition(i);
        startSmoothScroll(c1304a);
    }
}
