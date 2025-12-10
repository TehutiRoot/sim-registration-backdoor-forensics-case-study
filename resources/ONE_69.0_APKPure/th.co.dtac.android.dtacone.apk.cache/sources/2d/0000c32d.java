package com.tom_roush.pdfbox.util;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public final class IterativeMergeSort {
    /* renamed from: a */
    public static void m32074a(Object[] objArr, Comparator comparator) {
        Object[] objArr2 = (Object[]) objArr.clone();
        for (int i = 1; i < objArr.length; i <<= 1) {
            int i2 = 0;
            while (i2 < objArr.length) {
                int i3 = i2 + (i << 1);
                m32073b(objArr, objArr2, i2, i2 + i, i3, comparator);
                i2 = i3;
            }
        }
    }

    /* renamed from: b */
    public static void m32073b(Object[] objArr, Object[] objArr2, int i, int i2, int i3, Comparator comparator) {
        int i4;
        int i5;
        if (i2 >= objArr.length) {
            return;
        }
        if (i3 > objArr.length) {
            i3 = objArr.length;
        }
        int i6 = i;
        int i7 = i6;
        int i8 = i2;
        while (i6 < i3) {
            if (i7 == i2) {
                i5 = i8 + 1;
                objArr2[i6] = objArr[i8];
            } else {
                if (i8 == i3) {
                    i4 = i7 + 1;
                    objArr2[i6] = objArr[i7];
                } else if (comparator.compare(objArr[i8], objArr[i7]) < 0) {
                    i5 = i8 + 1;
                    objArr2[i6] = objArr[i8];
                } else {
                    i4 = i7 + 1;
                    objArr2[i6] = objArr[i7];
                }
                i7 = i4;
                i6++;
            }
            i8 = i5;
            i6++;
        }
        System.arraycopy(objArr2, i, objArr, i, i3 - i);
    }

    public static <T> void sort(List<T> list, Comparator<? super T> comparator) {
        if (list.size() < 2) {
            return;
        }
        Object[] array = list.toArray();
        m32074a(array, comparator);
        ListIterator<T> listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set((T) obj);
        }
    }
}