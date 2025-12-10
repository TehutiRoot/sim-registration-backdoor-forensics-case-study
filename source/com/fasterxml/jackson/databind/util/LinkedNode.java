package com.fasterxml.jackson.databind.util;

/* loaded from: classes3.dex */
public final class LinkedNode<T> {

    /* renamed from: a */
    public final Object f43466a;

    /* renamed from: b */
    public LinkedNode f43467b;

    public LinkedNode(T t, LinkedNode<T> linkedNode) {
        this.f43466a = t;
        this.f43467b = linkedNode;
    }

    public static <ST> boolean contains(LinkedNode<ST> linkedNode, ST st) {
        while (linkedNode != null) {
            if (linkedNode.value() == st) {
                return true;
            }
            linkedNode = linkedNode.next();
        }
        return false;
    }

    public void linkNext(LinkedNode<T> linkedNode) {
        if (this.f43467b == null) {
            this.f43467b = linkedNode;
            return;
        }
        throw new IllegalStateException();
    }

    public LinkedNode<T> next() {
        return this.f43467b;
    }

    public T value() {
        return (T) this.f43466a;
    }
}
