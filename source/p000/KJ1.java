package p000;

import androidx.collection.ArrayMap;
import com.google.android.cameraview.AspectRatio;
import com.google.android.cameraview.Size;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: KJ1 */
/* loaded from: classes3.dex */
public class KJ1 {

    /* renamed from: a */
    public final ArrayMap f3168a = new ArrayMap();

    /* renamed from: a */
    public boolean m67626a(Size size) {
        for (AspectRatio aspectRatio : this.f3168a.keySet()) {
            if (aspectRatio.matches(size)) {
                SortedSet sortedSet = (SortedSet) this.f3168a.get(aspectRatio);
                if (sortedSet.contains(size)) {
                    return false;
                }
                sortedSet.add(size);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(size);
        this.f3168a.put(AspectRatio.m49248of(size.getWidth(), size.getHeight()), treeSet);
        return true;
    }

    /* renamed from: b */
    public void m67625b() {
        this.f3168a.clear();
    }

    /* renamed from: c */
    public boolean m67624c() {
        return this.f3168a.isEmpty();
    }

    /* renamed from: d */
    public Set m67623d() {
        return this.f3168a.keySet();
    }

    /* renamed from: e */
    public void m67622e(AspectRatio aspectRatio) {
        this.f3168a.remove(aspectRatio);
    }

    /* renamed from: f */
    public SortedSet m67621f(AspectRatio aspectRatio) {
        return (SortedSet) this.f3168a.get(aspectRatio);
    }
}
