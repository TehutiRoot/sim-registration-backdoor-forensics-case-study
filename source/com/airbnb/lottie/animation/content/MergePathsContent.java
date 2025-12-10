package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes3.dex */
public class MergePathsContent implements InterfaceC18435Sh1, Z60 {

    /* renamed from: d */
    public final String f41099d;

    /* renamed from: f */
    public final MergePaths f41101f;

    /* renamed from: a */
    public final Path f41096a = new Path();

    /* renamed from: b */
    public final Path f41097b = new Path();

    /* renamed from: c */
    public final Path f41098c = new Path();

    /* renamed from: e */
    public final List f41100e = new ArrayList();

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5682a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41102a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f41102a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41102a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41102a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41102a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41102a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        this.f41099d = mergePaths.getName();
        this.f41101f = mergePaths;
    }

    /* renamed from: a */
    public final void m50889a() {
        for (int i = 0; i < this.f41100e.size(); i++) {
            this.f41098c.addPath(((InterfaceC18435Sh1) this.f41100e.get(i)).getPath());
        }
    }

    @Override // p000.Z60
    public void absorbContent(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content previous = listIterator.previous();
            if (previous instanceof InterfaceC18435Sh1) {
                this.f41100e.add((InterfaceC18435Sh1) previous);
                listIterator.remove();
            }
        }
    }

    /* renamed from: b */
    public final void m50888b(Path.Op op) {
        this.f41097b.reset();
        this.f41096a.reset();
        for (int size = this.f41100e.size() - 1; size >= 1; size--) {
            InterfaceC18435Sh1 interfaceC18435Sh1 = (InterfaceC18435Sh1) this.f41100e.get(size);
            if (interfaceC18435Sh1 instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) interfaceC18435Sh1;
                List m50901c = contentGroup.m50901c();
                for (int size2 = m50901c.size() - 1; size2 >= 0; size2--) {
                    Path path = ((InterfaceC18435Sh1) m50901c.get(size2)).getPath();
                    path.transform(contentGroup.m50900d());
                    this.f41097b.addPath(path);
                }
            } else {
                this.f41097b.addPath(interfaceC18435Sh1.getPath());
            }
        }
        InterfaceC18435Sh1 interfaceC18435Sh12 = (InterfaceC18435Sh1) this.f41100e.get(0);
        if (interfaceC18435Sh12 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) interfaceC18435Sh12;
            List m50901c2 = contentGroup2.m50901c();
            for (int i = 0; i < m50901c2.size(); i++) {
                Path path2 = ((InterfaceC18435Sh1) m50901c2.get(i)).getPath();
                path2.transform(contentGroup2.m50900d());
                this.f41096a.addPath(path2);
            }
        } else {
            this.f41096a.set(interfaceC18435Sh12.getPath());
        }
        this.f41098c.op(this.f41096a, this.f41097b, op);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41099d;
    }

    @Override // p000.InterfaceC18435Sh1
    public Path getPath() {
        this.f41098c.reset();
        if (this.f41101f.isHidden()) {
            return this.f41098c;
        }
        int i = C5682a.f41102a[this.f41101f.getMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m50888b(Path.Op.XOR);
                        }
                    } else {
                        m50888b(Path.Op.INTERSECT);
                    }
                } else {
                    m50888b(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                m50888b(Path.Op.UNION);
            }
        } else {
            m50889a();
        }
        return this.f41098c;
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < this.f41100e.size(); i++) {
            ((InterfaceC18435Sh1) this.f41100e.get(i)).setContents(list, list2);
        }
    }
}
