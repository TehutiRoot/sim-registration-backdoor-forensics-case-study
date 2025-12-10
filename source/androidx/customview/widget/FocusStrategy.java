package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class FocusStrategy {

    /* loaded from: classes2.dex */
    public interface BoundsAdapter<T> {
        void obtainBounds(T t, Rect rect);
    }

    /* loaded from: classes2.dex */
    public interface CollectionAdapter<T, V> {
        V get(T t, int i);

        int size(T t);
    }

    /* renamed from: androidx.customview.widget.FocusStrategy$a */
    /* loaded from: classes2.dex */
    public static class C4257a implements Comparator {

        /* renamed from: a */
        public final Rect f34454a = new Rect();

        /* renamed from: b */
        public final Rect f34455b = new Rect();

        /* renamed from: c */
        public final boolean f34456c;

        /* renamed from: d */
        public final BoundsAdapter f34457d;

        public C4257a(boolean z, BoundsAdapter boundsAdapter) {
            this.f34456c = z;
            this.f34457d = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f34454a;
            Rect rect2 = this.f34455b;
            this.f34457d.obtainBounds(obj, rect);
            this.f34457d.obtainBounds(obj2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (!this.f34456c) {
                    return -1;
                }
                return 1;
            } else if (i3 > i4) {
                if (this.f34456c) {
                    return -1;
                }
                return 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (!this.f34456c) {
                        return -1;
                    }
                    return 1;
                } else if (i7 > i8) {
                    if (this.f34456c) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m56403a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m56402b = m56402b(i, rect, rect2);
        if (m56402b(i, rect, rect3) || !m56402b) {
            return false;
        }
        if (m56394j(i, rect, rect3) && i != 17 && i != 66 && m56393k(i, rect, rect2) >= m56391m(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m56402b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Object m56401c(Object obj, CollectionAdapter collectionAdapter, BoundsAdapter boundsAdapter, Object obj2, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect2.offset(0, -(rect.height() + 1));
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect2.offset(-(rect.width() + 1), 0);
                }
            } else {
                rect2.offset(0, rect.height() + 1);
            }
        } else {
            rect2.offset(rect.width() + 1, 0);
        }
        int size = collectionAdapter.size(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj4 = collectionAdapter.get(obj, i2);
            if (obj4 != obj2) {
                boundsAdapter.obtainBounds(obj4, rect3);
                if (m56396h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = obj4;
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    public static Object m56400d(Object obj, CollectionAdapter collectionAdapter, BoundsAdapter boundsAdapter, Object obj2, int i, boolean z, boolean z2) {
        int size = collectionAdapter.size(obj);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(collectionAdapter.get(obj, i2));
        }
        Collections.sort(arrayList, new C4257a(z, boundsAdapter));
        if (i != 1) {
            if (i == 2) {
                return m56399e(obj2, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return m56398f(obj2, arrayList, z2);
    }

    /* renamed from: e */
    public static Object m56399e(Object obj, ArrayList arrayList, boolean z) {
        int lastIndexOf;
        int size = arrayList.size();
        if (obj == null) {
            lastIndexOf = -1;
        } else {
            lastIndexOf = arrayList.lastIndexOf(obj);
        }
        int i = lastIndexOf + 1;
        if (i < size) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(0);
        }
        return null;
    }

    /* renamed from: f */
    public static Object m56398f(Object obj, ArrayList arrayList, boolean z) {
        int indexOf;
        int size = arrayList.size();
        if (obj == null) {
            indexOf = size;
        } else {
            indexOf = arrayList.indexOf(obj);
        }
        int i = indexOf - 1;
        if (i >= 0) {
            return arrayList.get(i);
        }
        if (z && size > 0) {
            return arrayList.get(size - 1);
        }
        return null;
    }

    /* renamed from: g */
    public static int m56397g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    public static boolean m56396h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m56395i(rect, rect2, i)) {
            return false;
        }
        if (!m56395i(rect, rect3, i) || m56403a(i, rect, rect2, rect3)) {
            return true;
        }
        if (m56403a(i, rect, rect3, rect2) || m56397g(m56393k(i, rect, rect2), m56389o(i, rect, rect2)) >= m56397g(m56393k(i, rect, rect3), m56389o(i, rect, rect3))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m56395i(Rect rect, Rect rect2, int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 >= i3 && rect.bottom > i3) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 >= i5 && rect.right > i5) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 <= i7 && rect.top < i7) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 <= i9 && rect.left < i9) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m56394j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        if (rect.bottom > rect2.top) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right > rect2.left) {
                    return false;
                } else {
                    return true;
                }
            } else if (rect.top < rect2.bottom) {
                return false;
            } else {
                return true;
            }
        } else if (rect.left < rect2.right) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: k */
    public static int m56393k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m56392l(i, rect, rect2));
    }

    /* renamed from: l */
    public static int m56392l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return i2 - i3;
    }

    /* renamed from: m */
    public static int m56391m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m56390n(i, rect, rect2));
    }

    /* renamed from: n */
    public static int m56390n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.bottom;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.right;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.top;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.left;
        }
        return i2 - i3;
    }

    /* renamed from: o */
    public static int m56389o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
