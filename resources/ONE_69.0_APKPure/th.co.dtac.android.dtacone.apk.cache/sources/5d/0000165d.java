package p000;

import kotlinx.coroutines.scheduling.TaskContext;

/* renamed from: XR1 */
/* loaded from: classes6.dex */
public final class XR1 implements TaskContext {

    /* renamed from: a */
    public final int f7558a;

    public XR1(int i) {
        this.f7558a = i;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public int getTaskMode() {
        return this.f7558a;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    public void afterTask() {
    }
}