package p000;

import kotlinx.coroutines.scheduling.TaskContext;

/* renamed from: aR1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19003aR1 implements TaskContext {

    /* renamed from: a */
    public final int f8332a;

    public C19003aR1(int i) {
        this.f8332a = i;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public int getTaskMode() {
        return this.f8332a;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public void afterTask() {
    }
}
