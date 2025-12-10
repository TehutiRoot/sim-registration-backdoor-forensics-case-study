package com.google.android.gms.internal.measurement;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzat implements Iterable, zzap {

    /* renamed from: a */
    public final String f46240a;

    public zzat(String str) {
        if (str != null) {
            this.f46240a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        return this.f46240a.equals(((zzat) obj).f46240a);
    }

    public final int hashCode() {
        return this.f46240a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C22645vc2(this);
    }

    public final String toString() {
        String str = this.f46240a;
        return OperatorName.SHOW_TEXT_LINE_AND_SPACE + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0630  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzap zzbN(java.lang.String r21, com.google.android.gms.internal.measurement.zzg r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzbN(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.f46240a);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.f46240a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.f46240a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f46240a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.f46240a;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new C22473uc2(this);
    }
}
