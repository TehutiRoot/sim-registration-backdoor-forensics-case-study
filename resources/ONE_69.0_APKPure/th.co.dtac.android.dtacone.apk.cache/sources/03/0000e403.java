package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

/* renamed from: kotlin.time.a */
/* loaded from: classes6.dex */
public final class C12005a implements TimeMark {

    /* renamed from: a */
    public final TimeMark f70606a;

    /* renamed from: b */
    public final long f70607b;

    public /* synthetic */ C12005a(TimeMark timeMark, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: elapsedNow-UwyO8pc */
    public long mo74706elapsedNowUwyO8pc() {
        return Duration.m74743minusLRDsOJo(this.f70606a.mo74706elapsedNowUwyO8pc(), this.f70607b);
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
    public TimeMark mo74707minusLRDsOJo(long j) {
        return TimeMark.DefaultImpls.m74819minusLRDsOJo(this, j);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: plus-LRDsOJo */
    public TimeMark mo74709plusLRDsOJo(long j) {
        return new C12005a(this.f70606a, Duration.m74744plusLRDsOJo(this.f70607b, j), null);
    }

    public C12005a(TimeMark mark, long j) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.f70606a = mark;
        this.f70607b = j;
    }
}