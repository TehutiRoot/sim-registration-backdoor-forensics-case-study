package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class ListViewCompat {

    /* renamed from: androidx.core.widget.ListViewCompat$a */
    /* loaded from: classes2.dex */
    public static class C4201a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56468a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m56467b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    public static boolean canScrollList(@NonNull ListView listView, int i) {
        return C4201a.m56468a(listView, i);
    }

    public static void scrollListBy(@NonNull ListView listView, int i) {
        C4201a.m56467b(listView, i);
    }
}