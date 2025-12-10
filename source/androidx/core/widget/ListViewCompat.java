package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ListViewCompat {

    /* renamed from: androidx.core.widget.ListViewCompat$a */
    /* loaded from: classes2.dex */
    public static class C4219a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56518a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m56517b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    public static boolean canScrollList(@NonNull ListView listView, int i) {
        return C4219a.m56518a(listView, i);
    }

    public static void scrollListBy(@NonNull ListView listView, int i) {
        C4219a.m56517b(listView, i);
    }
}
