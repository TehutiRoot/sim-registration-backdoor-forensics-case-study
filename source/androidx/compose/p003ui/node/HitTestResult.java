package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0018\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0086\bø\u0001\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\rJ\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010+J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b2\u00104J%\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0005¢\u0006\u0004\b9\u0010\u0004R\u001e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010?R\u0016\u0010B\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010AR$\u0010G\u001a\u00020&2\u0006\u0010C\u001a\u00020&8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010F\u0082\u0002\u0016\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006H"}, m28850d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", OperatorName.CURVE_TO, "LsJ;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()J", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "hasHit", "()Z", "acceptHits", "", "distanceFromEdge", "isInLayer", "isHitInMinimumTouchTargetBetter", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "hit", "(Landroidx/compose/ui/Modifier$Node;ZLkotlin/jvm/functions/Function0;)V", "hitInMinimumTouchTarget", "(Landroidx/compose/ui/Modifier$Node;FZLkotlin/jvm/functions/Function0;)V", "speculativeHit", "block", "siblingHits", "(Lkotlin/jvm/functions/Function0;)V", "element", "contains", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Landroidx/compose/ui/Modifier$Node;", "indexOf", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "", "", "[Ljava/lang/Object;", "values", "", "[J", "distanceFromEdgeAndInLayer", "I", "hitDepth", "<set-?>", "d", "getSize", "()I", "size", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1855#2,2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n195#1:342,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.HitTestResult */
/* loaded from: classes2.dex */
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {

    /* renamed from: a */
    public Object[] f30220a = new Object[16];

    /* renamed from: b */
    public long[] f30221b = new long[16];

    /* renamed from: c */
    public int f30222c = -1;

    /* renamed from: d */
    public int f30223d;

    /* renamed from: androidx.compose.ui.node.HitTestResult$b */
    /* loaded from: classes2.dex */
    public final class C3512b implements List, KMappedMarker {

        /* renamed from: a */
        public final int f30228a;

        /* renamed from: b */
        public final int f30229b;

        public C3512b(int i, int i2) {
            this.f30228a = i;
            this.f30229b = i2;
        }

        /* renamed from: a */
        public boolean m59500a(Modifier.Node element) {
            Intrinsics.checkNotNullParameter(element, "element");
            if (indexOf(element) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        /* renamed from: b */
        public Modifier.Node get(int i) {
            Object obj = HitTestResult.this.f30220a[i + this.f30228a];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        /* renamed from: c */
        public int m59498c() {
            return this.f30229b - this.f30228a;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return false;
            }
            return m59500a((Modifier.Node) obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((Modifier.Node) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public int m59497e(Modifier.Node element) {
            Intrinsics.checkNotNullParameter(element, "element");
            int i = this.f30228a;
            int i2 = this.f30229b;
            if (i <= i2) {
                while (!Intrinsics.areEqual(HitTestResult.this.f30220a[i], element)) {
                    if (i != i2) {
                        i++;
                    } else {
                        return -1;
                    }
                }
                return i - this.f30228a;
            }
            return -1;
        }

        /* renamed from: f */
        public int m59496f(Modifier.Node element) {
            Intrinsics.checkNotNullParameter(element, "element");
            int i = this.f30229b;
            int i2 = this.f30228a;
            if (i2 <= i) {
                while (!Intrinsics.areEqual(HitTestResult.this.f30220a[i], element)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.f30228a;
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            return m59497e((Modifier.Node) obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.f30228a;
            return new C3511a(i, i, this.f30229b);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Modifier.Node)) {
                return -1;
            }
            return m59496f((Modifier.Node) obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i = this.f30228a;
            return new C3511a(i, i, this.f30229b);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m59498c();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i3 = this.f30228a;
            return new C3512b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.f30228a;
            return new C3511a(i + i2, i2, this.f30229b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return CollectionToArray.toArray(this, array);
        }
    }

    /* renamed from: a */
    public final void m59505a() {
        int i = this.f30222c;
        Object[] objArr = this.f30220a;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30220a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f30221b, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f30221b = copyOf2;
        }
    }

    public final void acceptHits() {
        this.f30222c = size() - 1;
    }

    /* renamed from: add  reason: avoid collision after fix types in other method */
    public void add2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final long m59504b() {
        long m59495a;
        m59495a = HitTestResultKt.m59495a(Float.POSITIVE_INFINITY, false);
        int i = this.f30222c + 1;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                long m22641b = AbstractC13913sJ.m22641b(this.f30221b[i]);
                if (AbstractC13913sJ.m22642a(m22641b, m59495a) < 0) {
                    m59495a = m22641b;
                }
                if (AbstractC13913sJ.m22640c(m59495a) < 0.0f && AbstractC13913sJ.m22639d(m59495a)) {
                    return m59495a;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return m59495a;
    }

    /* renamed from: c */
    public final void m59503c() {
        int i = this.f30222c + 1;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i <= lastIndex) {
            while (true) {
                this.f30220a[i] = null;
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        this.f30223d = this.f30222c + 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f30222c = -1;
        m59503c();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((Object) ((Modifier.Node) it.next()))) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f30223d;
    }

    public final boolean hasHit() {
        long m59504b = m59504b();
        if (AbstractC13913sJ.m22640c(m59504b) < 0.0f && AbstractC13913sJ.m22639d(m59504b)) {
            return true;
        }
        return false;
    }

    public final void hit(@NotNull Modifier.Node node, boolean z, @NotNull Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        hitInMinimumTouchTarget(node, -1.0f, z, childHitTest);
    }

    public final void hitInMinimumTouchTarget(@NotNull Modifier.Node node, float f, boolean z, @NotNull Function0<Unit> childHitTest) {
        long m59495a;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i = this.f30222c;
        this.f30222c = i + 1;
        m59505a();
        Object[] objArr = this.f30220a;
        int i2 = this.f30222c;
        objArr[i2] = node;
        long[] jArr = this.f30221b;
        m59495a = HitTestResultKt.m59495a(f, z);
        jArr[i2] = m59495a;
        m59503c();
        childHitTest.invoke();
        this.f30222c = i;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        long m59495a;
        if (this.f30222c != CollectionsKt__CollectionsKt.getLastIndex(this)) {
            m59495a = HitTestResultKt.m59495a(f, z);
            if (AbstractC13913sJ.m22642a(m59504b(), m59495a) > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Modifier.Node> iterator() {
        return new C3511a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Modifier.Node> listIterator() {
        return new C3511a(this, 0, 0, 0, 7, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set  reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int i = this.f30222c;
        block.invoke();
        this.f30222c = i;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(@NotNull Modifier.Node node, float f, boolean z, @NotNull Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        if (this.f30222c == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            hitInMinimumTouchTarget(node, f, z, childHitTest);
            if (this.f30222c + 1 == CollectionsKt__CollectionsKt.getLastIndex(this)) {
                m59503c();
                return;
            }
            return;
        }
        long m59504b = m59504b();
        int i = this.f30222c;
        this.f30222c = CollectionsKt__CollectionsKt.getLastIndex(this);
        hitInMinimumTouchTarget(node, f, z, childHitTest);
        if (this.f30222c + 1 < CollectionsKt__CollectionsKt.getLastIndex(this) && AbstractC13913sJ.m22642a(m59504b, m59504b()) > 0) {
            int i2 = this.f30222c + 1;
            int i3 = i + 1;
            Object[] objArr = this.f30220a;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i3, i2, size());
            long[] jArr = this.f30221b;
            ArraysKt___ArraysJvmKt.copyInto(jArr, jArr, i3, i2, size());
            this.f30222c = ((size() + i) - this.f30222c) - 1;
        }
        m59503c();
        this.f30222c = i;
    }

    @Override // java.util.List
    @NotNull
    public List<Modifier.Node> subList(int i, int i2) {
        return new C3512b(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Modifier.Node element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf((Object) element) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @NotNull
    public Modifier.Node get(int i) {
        Object obj = this.f30220a[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(@NotNull Modifier.Node element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (lastIndex >= 0) {
            int i = 0;
            while (!Intrinsics.areEqual(this.f30220a[i], element)) {
                if (i == lastIndex) {
                    return -1;
                }
                i++;
            }
            return i;
        }
        return -1;
    }

    public int lastIndexOf(@NotNull Modifier.Node element) {
        Intrinsics.checkNotNullParameter(element, "element");
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.f30220a[lastIndex], element)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<Modifier.Node> listIterator(int i) {
        return new C3511a(this, i, 0, 0, 6, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: androidx.compose.ui.node.HitTestResult$a */
    /* loaded from: classes2.dex */
    public final class C3511a implements ListIterator, KMappedMarker {

        /* renamed from: a */
        public int f30224a;

        /* renamed from: b */
        public final int f30225b;

        /* renamed from: c */
        public final int f30226c;

        public C3511a(int i, int i2, int i3) {
            this.f30224a = i;
            this.f30225b = i2;
            this.f30226c = i3;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: a */
        public Modifier.Node next() {
            Object[] objArr = HitTestResult.this.f30220a;
            int i = this.f30224a;
            this.f30224a = i + 1;
            Object obj = objArr[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* renamed from: b */
        public Modifier.Node previous() {
            Object[] objArr = HitTestResult.this.f30220a;
            int i = this.f30224a - 1;
            this.f30224a = i;
            Object obj = objArr[i];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f30224a < this.f30226c) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f30224a > this.f30225b) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f30224a - this.f30225b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f30224a - this.f30225b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ C3511a(HitTestResult hitTestResult, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
