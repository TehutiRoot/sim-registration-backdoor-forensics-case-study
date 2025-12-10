package com.mobsandgeeks.saripaar;

import com.mobsandgeeks.saripaar.annotation.Order;
import java.lang.reflect.Field;
import java.util.Comparator;

/* loaded from: classes5.dex */
final class SaripaarFieldsComparator implements Comparator<Field> {
    private boolean mOrderedFields = true;

    public boolean areOrderedFields() {
        return this.mOrderedFields;
    }

    @Override // java.util.Comparator
    public int compare(Field field, Field field2) {
        Order order = (Order) field.getAnnotation(Order.class);
        Order order2 = (Order) field2.getAnnotation(Order.class);
        if (order != null && order2 != null) {
            int value = order.value();
            int value2 = order2.value();
            if (value == value2) {
                return 0;
            }
            return value > value2 ? 1 : -1;
        }
        this.mOrderedFields = false;
        return 0;
    }
}
