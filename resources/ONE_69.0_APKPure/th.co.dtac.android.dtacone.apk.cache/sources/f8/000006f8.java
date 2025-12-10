package p000;

import androidx.collection.ArrayMap;
import com.google.android.cameraview.AspectRatio;
import com.google.android.cameraview.Size;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: HK1 */
/* loaded from: classes3.dex */
public class HK1 {

    /* renamed from: a */
    public final ArrayMap f2364a = new ArrayMap();

    /* renamed from: a */
    public boolean m68126a(Size size) {
        for (AspectRatio aspectRatio : this.f2364a.keySet()) {
            if (aspectRatio.matches(size)) {
                SortedSet sortedSet = (SortedSet) this.f2364a.get(aspectRatio);
                if (sortedSet.contains(size)) {
                    return false;
                }
                sortedSet.add(size);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(size);
        this.f2364a.put(AspectRatio.m49245of(size.getWidth(), size.getHeight()), treeSet);
        return true;
    }

    /* renamed from: b */
    public void m68125b() {
        this.f2364a.clear();
    }

    /* renamed from: c */
    public boolean m68124c() {
        return this.f2364a.isEmpty();
    }

    /* renamed from: d */
    public Set m68123d() {
        return this.f2364a.keySet();
    }

    /* renamed from: e */
    public void m68122e(AspectRatio aspectRatio) {
        this.f2364a.remove(aspectRatio);
    }

    /* renamed from: f */
    public SortedSet m68121f(AspectRatio aspectRatio) {
        return (SortedSet) this.f2364a.get(aspectRatio);
    }
}