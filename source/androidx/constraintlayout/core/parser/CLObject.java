package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    /* renamed from: androidx.constraintlayout.core.parser.CLObject$a */
    /* loaded from: classes2.dex */
    public class C3685a implements Iterator {

        /* renamed from: a */
        public CLObject f32297a;

        /* renamed from: b */
        public int f32298b = 0;

        public C3685a(CLObject cLObject) {
            this.f32297a = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f32298b < this.f32297a.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            CLKey cLKey = (CLKey) this.f32297a.f32292c.get(this.f32298b);
            this.f32298b++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new C3685a(this);
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "{ ");
        Iterator it = this.f32292c.iterator();
        boolean z = true;
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(cLElement.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder(getDebugName());
        sb.append("{\n");
        Iterator it = this.f32292c.iterator();
        boolean z = true;
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(",\n");
            }
            sb.append(cLElement.toFormattedJSON(CLElement.BASE_INDENT + i, i2 - 1));
        }
        sb.append("\n");
        addIndent(sb, i);
        sb.append("}");
        return sb.toString();
    }
}
