package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

/* renamed from: kotlin.time.a */
/* loaded from: classes6.dex */
public final class C12029a implements TimeMark {

    /* renamed from: a */
    public final TimeMark f70572a;

    /* renamed from: b */
    public final long f70573b;

    public /* synthetic */ C12029a(TimeMark timeMark, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: elapsedNow-UwyO8pc */
    public long mo74522elapsedNowUwyO8pc() {
        return Duration.m74559minusLRDsOJo(this.f70572a.mo74522elapsedNowUwyO8pc(), this.f70573b);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: minus-LRDsOJo */
    public TimeMark mo74523minusLRDsOJo(long j) {
        return TimeMark.DefaultImpls.m74635minusLRDsOJo(this, j);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: plus-LRDsOJo */
    public TimeMark mo74525plusLRDsOJo(long j) {
        return new C12029a(this.f70572a, Duration.m74560plusLRDsOJo(this.f70573b, j), null);
    }

    public C12029a(TimeMark mark, long j) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.f70572a = mark;
        this.f70573b = j;
    }
}
