package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.MessagePassingQueue */
/* loaded from: classes7.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m);

    M peek();

    M poll();

    int size();
}
