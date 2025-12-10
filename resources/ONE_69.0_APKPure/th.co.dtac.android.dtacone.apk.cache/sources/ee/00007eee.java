package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes3.dex */
public class MergePathsContent implements InterfaceC18284Pi1, InterfaceC19863f70 {

    /* renamed from: d */
    public final String f41111d;

    /* renamed from: f */
    public final MergePaths f41113f;

    /* renamed from: a */
    public final Path f41108a = new Path();

    /* renamed from: b */
    public final Path f41109b = new Path();

    /* renamed from: c */
    public final Path f41110c = new Path();

    /* renamed from: e */
    public final List f41112e = new ArrayList();

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5671a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41114a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f41114a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41114a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41114a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41114a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41114a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        this.f41111d = mergePaths.getName();
        this.f41113f = mergePaths;
    }

    /* renamed from: a */
    public final void m50886a() {
        for (int i = 0; i < this.f41112e.size(); i++) {
            this.f41110c.addPath(((InterfaceC18284Pi1) this.f41112e.get(i)).getPath());
        }
    }

    @Override // p000.InterfaceC19863f70
    public void absorbContent(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content previous = listIterator.previous();
            if (previous instanceof InterfaceC18284Pi1) {
                this.f41112e.add((InterfaceC18284Pi1) previous);
                listIterator.remove();
            }
        }
    }

    /* renamed from: b */
    public final void m50885b(Path.Op op) {
        this.f41109b.reset();
        this.f41108a.reset();
        for (int size = this.f41112e.size() - 1; size >= 1; size--) {
            InterfaceC18284Pi1 interfaceC18284Pi1 = (InterfaceC18284Pi1) this.f41112e.get(size);
            if (interfaceC18284Pi1 instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) interfaceC18284Pi1;
                List m50898c = contentGroup.m50898c();
                for (int size2 = m50898c.size() - 1; size2 >= 0; size2--) {
                    Path path = ((InterfaceC18284Pi1) m50898c.get(size2)).getPath();
                    path.transform(contentGroup.m50897d());
                    this.f41109b.addPath(path);
                }
            } else {
                this.f41109b.addPath(interfaceC18284Pi1.getPath());
            }
        }
        InterfaceC18284Pi1 interfaceC18284Pi12 = (InterfaceC18284Pi1) this.f41112e.get(0);
        if (interfaceC18284Pi12 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) interfaceC18284Pi12;
            List m50898c2 = contentGroup2.m50898c();
            for (int i = 0; i < m50898c2.size(); i++) {
                Path path2 = ((InterfaceC18284Pi1) m50898c2.get(i)).getPath();
                path2.transform(contentGroup2.m50897d());
                this.f41108a.addPath(path2);
            }
        } else {
            this.f41108a.set(interfaceC18284Pi12.getPath());
        }
        this.f41110c.op(this.f41108a, this.f41109b, op);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41111d;
    }

    @Override // p000.InterfaceC18284Pi1
    public Path getPath() {
        this.f41110c.reset();
        if (this.f41113f.isHidden()) {
            return this.f41110c;
        }
        int i = C5671a.f41114a[this.f41113f.getMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m50885b(Path.Op.XOR);
                        }
                    } else {
                        m50885b(Path.Op.INTERSECT);
                    }
                } else {
                    m50885b(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                m50885b(Path.Op.UNION);
            }
        } else {
            m50886a();
        }
        return this.f41110c;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < this.f41112e.size(); i++) {
            ((InterfaceC18284Pi1) this.f41112e.get(i)).setContents(list, list2);
        }
    }
}