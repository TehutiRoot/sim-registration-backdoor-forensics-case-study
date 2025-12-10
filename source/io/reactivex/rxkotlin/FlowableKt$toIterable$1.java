package io.reactivex.rxkotlin;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28852bv = {1, 0, 3}, m28851d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, m28850d2 = {"io/reactivex/rxkotlin/FlowableKt$toIterable$1", "", "iterator", "", "rxkotlin"}, m28849k = 1, m28848mv = {1, 1, 15})
/* loaded from: classes5.dex */
public final class FlowableKt$toIterable$1 implements Iterable<Object>, KMappedMarker {

    /* renamed from: a */
    public final /* synthetic */ Iterator f66264a;

    public FlowableKt$toIterable$1(Iterator it) {
        this.f66264a = it;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this.f66264a;
    }
}
