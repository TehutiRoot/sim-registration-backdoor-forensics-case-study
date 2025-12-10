package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class COSArray extends COSBase implements Iterable<COSBase>, COSUpdateInfo {

    /* renamed from: b */
    public final List f59724b = new ArrayList();

    /* renamed from: c */
    public boolean f59725c;

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromArray(this);
    }

    public void add(COSBase cOSBase) {
        this.f59724b.add(cOSBase);
    }

    public void addAll(Collection<COSBase> collection) {
        this.f59724b.addAll(collection);
    }

    public void clear() {
        this.f59724b.clear();
    }

    public COSBase get(int i) {
        return (COSBase) this.f59724b.get(i);
    }

    public int getInt(int i) {
        return getInt(i, -1);
    }

    public String getName(int i) {
        return getName(i, null);
    }

    public COSBase getObject(int i) {
        COSBase cOSBase = (COSBase) this.f59724b.get(i);
        if (cOSBase instanceof COSObject) {
            cOSBase = ((COSObject) cOSBase).getObject();
        }
        if (cOSBase instanceof COSNull) {
            return null;
        }
        return cOSBase;
    }

    public String getString(int i) {
        return getString(i, null);
    }

    public void growToSize(int i) {
        growToSize(i, null);
    }

    public int indexOf(COSBase cOSBase) {
        for (int i = 0; i < size(); i++) {
            COSBase cOSBase2 = get(i);
            if (cOSBase2 == null) {
                if (cOSBase == null) {
                    return i;
                }
            } else if (cOSBase2.equals(cOSBase)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfObject(COSBase cOSBase) {
        for (int i = 0; i < size(); i++) {
            COSBase cOSBase2 = get(i);
            if (cOSBase2 == null) {
                if (cOSBase2 == cOSBase) {
                    return i;
                }
            } else if (cOSBase2.equals(cOSBase) || ((cOSBase2 instanceof COSObject) && ((COSObject) cOSBase2).getObject().equals(cOSBase))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public boolean isNeedToBeUpdated() {
        return this.f59725c;
    }

    @Override // java.lang.Iterable
    public Iterator<COSBase> iterator() {
        return this.f59724b.iterator();
    }

    public COSBase remove(int i) {
        return (COSBase) this.f59724b.remove(i);
    }

    public void removeAll(Collection<COSBase> collection) {
        this.f59724b.removeAll(collection);
    }

    public boolean removeObject(COSBase cOSBase) {
        boolean remove = remove(cOSBase);
        if (!remove) {
            for (int i = 0; i < size(); i++) {
                COSBase cOSBase2 = get(i);
                if ((cOSBase2 instanceof COSObject) && ((COSObject) cOSBase2).getObject().equals(cOSBase)) {
                    return remove(cOSBase2);
                }
            }
        }
        return remove;
    }

    public void retainAll(Collection<COSBase> collection) {
        this.f59724b.retainAll(collection);
    }

    public void set(int i, COSBase cOSBase) {
        this.f59724b.set(i, cOSBase);
    }

    public void setFloatArray(float[] fArr) {
        clear();
        for (float f : fArr) {
            add((COSBase) new COSFloat(f));
        }
    }

    public void setInt(int i, int i2) {
        set(i, (COSBase) COSInteger.get(i2));
    }

    public void setName(int i, String str) {
        set(i, (COSBase) COSName.getPDFName(str));
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public void setNeedToBeUpdated(boolean z) {
        this.f59725c = z;
    }

    public void setString(int i, String str) {
        if (str != null) {
            set(i, (COSBase) new COSString(str));
        } else {
            set(i, (COSBase) null);
        }
    }

    public int size() {
        return this.f59724b.size();
    }

    public float[] toFloatArray() {
        float f;
        float[] fArr = new float[size()];
        for (int i = 0; i < size(); i++) {
            COSBase object = getObject(i);
            if (object instanceof COSNumber) {
                f = ((COSNumber) object).floatValue();
            } else {
                f = 0.0f;
            }
            fArr[i] = f;
        }
        return fArr;
    }

    public List<? extends COSBase> toList() {
        return new ArrayList(this.f59724b);
    }

    public String toString() {
        return "COSArray{" + this.f59724b + "}";
    }

    public void add(COSObjectable cOSObjectable) {
        this.f59724b.add(cOSObjectable.getCOSObject());
    }

    public void addAll(COSArray cOSArray) {
        if (cOSArray != null) {
            this.f59724b.addAll(cOSArray.f59724b);
        }
    }

    public int getInt(int i, int i2) {
        if (i < size()) {
            Object obj = this.f59724b.get(i);
            return obj instanceof COSNumber ? ((COSNumber) obj).intValue() : i2;
        }
        return i2;
    }

    public String getName(int i, String str) {
        if (i < size()) {
            Object obj = this.f59724b.get(i);
            return obj instanceof COSName ? ((COSName) obj).getName() : str;
        }
        return str;
    }

    public String getString(int i, String str) {
        if (i < size()) {
            Object obj = this.f59724b.get(i);
            return obj instanceof COSString ? ((COSString) obj).getString() : str;
        }
        return str;
    }

    public void growToSize(int i, COSBase cOSBase) {
        while (size() < i) {
            add(cOSBase);
        }
    }

    public boolean remove(COSBase cOSBase) {
        return this.f59724b.remove(cOSBase);
    }

    public void set(int i, int i2) {
        this.f59724b.set(i, COSInteger.get(i2));
    }

    public void add(int i, COSBase cOSBase) {
        this.f59724b.add(i, cOSBase);
    }

    public void addAll(int i, Collection<COSBase> collection) {
        this.f59724b.addAll(i, collection);
    }

    public void set(int i, COSObjectable cOSObjectable) {
        this.f59724b.set(i, cOSObjectable != null ? cOSObjectable.getCOSObject() : null);
    }
}
