package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public class COSArrayList<E> implements List<E> {

    /* renamed from: a */
    public final COSArray f60144a;

    /* renamed from: b */
    public final List f60145b;

    /* renamed from: c */
    public boolean f60146c;

    /* renamed from: d */
    public COSDictionary f60147d;

    /* renamed from: e */
    public COSName f60148e;

    public COSArrayList() {
        this.f60146c = false;
        this.f60144a = new COSArray();
        this.f60145b = new ArrayList();
    }

    public static List<String> convertCOSNameCOSArrayToList(COSArray cOSArray) {
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(((COSName) cOSArray.getObject(i)).getName());
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public static List<String> convertCOSStringCOSArrayToList(COSArray cOSArray) {
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(((COSString) cOSArray.getObject(i)).getString());
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public static List<Float> convertFloatCOSArrayToList(COSArray cOSArray) {
        if (cOSArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(cOSArray.size());
        for (int i = 0; i < cOSArray.size(); i++) {
            COSBase object = cOSArray.getObject(i);
            if (object instanceof COSNumber) {
                arrayList.add(Float.valueOf(((COSNumber) object).floatValue()));
            } else {
                arrayList.add(null);
            }
        }
        return new COSArrayList(arrayList, cOSArray);
    }

    public static List<Integer> convertIntegerCOSArrayToList(COSArray cOSArray) {
        COSBase cOSBase;
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                if (cOSArray.get(i) instanceof COSObject) {
                    cOSBase = ((COSObject) cOSArray.get(i)).getObject();
                } else {
                    cOSBase = cOSArray.get(i);
                }
                arrayList.add(Integer.valueOf(((COSNumber) cOSBase).intValue()));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public static COSArray convertStringListToCOSNameCOSArray(List<String> list) {
        COSArray cOSArray = new COSArray();
        for (String str : list) {
            cOSArray.add((COSBase) COSName.getPDFName(str));
        }
        return cOSArray;
    }

    public static COSArray convertStringListToCOSStringCOSArray(List<String> list) {
        COSArray cOSArray = new COSArray();
        for (String str : list) {
            cOSArray.add((COSBase) new COSString(str));
        }
        return cOSArray;
    }

    public static COSArray converterToCOSArray(List<?> list) {
        if (list != null) {
            if (list instanceof COSArrayList) {
                return ((COSArrayList) list).f60144a;
            }
            COSArray cOSArray = new COSArray();
            for (Object obj : list) {
                if (obj instanceof String) {
                    cOSArray.add((COSBase) new COSString((String) obj));
                } else if (!(obj instanceof Integer) && !(obj instanceof Long)) {
                    if (!(obj instanceof Float) && !(obj instanceof Double)) {
                        if (obj instanceof COSObjectable) {
                            cOSArray.add(((COSObjectable) obj).getCOSObject());
                        } else if (obj == null) {
                            cOSArray.add((COSBase) COSNull.NULL);
                        } else {
                            throw new IllegalArgumentException("Error: Don't know how to convert type to COSBase '" + obj.getClass().getName() + OperatorName.SHOW_TEXT_LINE);
                        }
                    } else {
                        cOSArray.add((COSBase) new COSFloat(((Number) obj).floatValue()));
                    }
                } else {
                    cOSArray.add((COSBase) COSInteger.get(((Number) obj).longValue()));
                }
            }
            return cOSArray;
        }
        return null;
    }

    /* renamed from: a */
    public final List m32567a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (E e : collection) {
            if (e instanceof String) {
                arrayList.add(new COSString((String) e));
            } else {
                arrayList.add(((COSObjectable) e).getCOSObject());
            }
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        COSDictionary cOSDictionary = this.f60147d;
        if (cOSDictionary != null) {
            cOSDictionary.setItem(this.f60148e, (COSBase) this.f60144a);
            this.f60147d = null;
        }
        if (e instanceof String) {
            this.f60144a.add((COSBase) new COSString((String) e));
        } else {
            COSArray cOSArray = this.f60144a;
            if (cOSArray != null) {
                cOSArray.add(((COSObjectable) e).getCOSObject());
            }
        }
        return this.f60145b.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        if (!this.f60146c) {
            if (this.f60147d != null && collection.size() > 0) {
                this.f60147d.setItem(this.f60148e, (COSBase) this.f60144a);
                this.f60147d = null;
            }
            this.f60144a.addAll(m32567a(collection));
            return this.f60145b.addAll(collection);
        }
        throw new UnsupportedOperationException("Adding to a filtered List is not permitted");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        COSDictionary cOSDictionary = this.f60147d;
        if (cOSDictionary != null) {
            cOSDictionary.setItem(this.f60148e, (COSBase) null);
        }
        this.f60145b.clear();
        this.f60144a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f60145b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f60145b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f60145b.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return (E) this.f60145b.get(i);
    }

    public COSArray getCOSArray() {
        return this.f60144a;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f60145b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f60145b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f60145b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f60145b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f60145b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f60145b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        if (!this.f60146c) {
            int indexOf = this.f60145b.indexOf(obj);
            if (indexOf >= 0) {
                this.f60145b.remove(indexOf);
                this.f60144a.remove(indexOf);
                return true;
            }
            return false;
        }
        throw new UnsupportedOperationException("removing entries from a filtered List is not permitted");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            COSBase cOSObject = ((COSObjectable) it.next()).getCOSObject();
            for (int size = this.f60144a.size() - 1; size >= 0; size--) {
                if (cOSObject.equals(this.f60144a.getObject(size))) {
                    this.f60144a.remove(size);
                }
            }
        }
        return this.f60145b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            COSBase cOSObject = ((COSObjectable) it.next()).getCOSObject();
            for (int size = this.f60144a.size() - 1; size >= 0; size--) {
                if (!cOSObject.equals(this.f60144a.getObject(size))) {
                    this.f60144a.remove(size);
                }
            }
        }
        return this.f60145b.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        if (!this.f60146c) {
            if (e instanceof String) {
                COSString cOSString = new COSString((String) e);
                COSDictionary cOSDictionary = this.f60147d;
                if (cOSDictionary != null && i == 0) {
                    cOSDictionary.setItem(this.f60148e, (COSBase) cOSString);
                }
                this.f60144a.set(i, (COSBase) cOSString);
            } else {
                COSDictionary cOSDictionary2 = this.f60147d;
                if (cOSDictionary2 != null && i == 0) {
                    cOSDictionary2.setItem(this.f60148e, ((COSObjectable) e).getCOSObject());
                }
                this.f60144a.set(i, ((COSObjectable) e).getCOSObject());
            }
            return (E) this.f60145b.set(i, e);
        }
        throw new UnsupportedOperationException("Replacing an element in a filtered List is not permitted");
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f60145b.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f60145b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f60145b.toArray();
    }

    @Deprecated
    public COSArray toList() {
        return this.f60144a;
    }

    public String toString() {
        return "COSArrayList{" + this.f60144a.toString() + "}";
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f60145b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public <X> X[] toArray(X[] xArr) {
        return (X[]) this.f60145b.toArray(xArr);
    }

    public COSArrayList(List<E> list, COSArray cOSArray) {
        this.f60146c = false;
        this.f60145b = list;
        this.f60144a = cOSArray;
        if (list.size() != cOSArray.size()) {
            this.f60146c = true;
        }
    }

    @Override // java.util.List
    public E remove(int i) {
        if (!this.f60146c) {
            this.f60144a.remove(i);
            return (E) this.f60145b.remove(i);
        }
        throw new UnsupportedOperationException("removing entries from a filtered List is not permitted");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        if (!this.f60146c) {
            if (this.f60147d != null && collection.size() > 0) {
                this.f60147d.setItem(this.f60148e, (COSBase) this.f60144a);
                this.f60147d = null;
            }
            this.f60144a.addAll(i, m32567a(collection));
            return this.f60145b.addAll(i, collection);
        }
        throw new UnsupportedOperationException("Inserting to a filtered List is not permitted");
    }

    @Override // java.util.List
    public void add(int i, E e) {
        if (!this.f60146c) {
            COSDictionary cOSDictionary = this.f60147d;
            if (cOSDictionary != null) {
                cOSDictionary.setItem(this.f60148e, (COSBase) this.f60144a);
                this.f60147d = null;
            }
            this.f60145b.add(i, e);
            if (e instanceof String) {
                this.f60144a.add(i, new COSString((String) e));
                return;
            } else {
                this.f60144a.add(i, ((COSObjectable) e).getCOSObject());
                return;
            }
        }
        throw new UnsupportedOperationException("Adding an element in a filtered List is not permitted");
    }

    public COSArrayList(COSDictionary cOSDictionary, COSName cOSName) {
        this.f60146c = false;
        this.f60144a = new COSArray();
        this.f60145b = new ArrayList();
        this.f60147d = cOSDictionary;
        this.f60148e = cOSName;
    }

    public COSArrayList(E e, COSBase cOSBase, COSDictionary cOSDictionary, COSName cOSName) {
        this.f60146c = false;
        COSArray cOSArray = new COSArray();
        this.f60144a = cOSArray;
        cOSArray.add(cOSBase);
        ArrayList arrayList = new ArrayList();
        this.f60145b = arrayList;
        arrayList.add(e);
        this.f60147d = cOSDictionary;
        this.f60148e = cOSName;
    }
}
