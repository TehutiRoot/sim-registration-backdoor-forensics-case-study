package com.fasterxml.jackson.databind.util;

/* loaded from: classes3.dex */
public final class LinkedNode<T> {

    /* renamed from: a */
    public final Object f43478a;

    /* renamed from: b */
    public LinkedNode f43479b;

    public LinkedNode(T t, LinkedNode<T> linkedNode) {
        this.f43478a = t;
        this.f43479b = linkedNode;
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
        if (this.f43479b == null) {
            this.f43479b = linkedNode;
            return;
        }
        throw new IllegalStateException();
    }

    public LinkedNode<T> next() {
        return this.f43479b;
    }

    public T value() {
        return (T) this.f43478a;
    }
}