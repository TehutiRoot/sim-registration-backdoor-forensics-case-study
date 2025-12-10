package com.chuckerteam.chucker.internal.support;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/LimitingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "delegate", "", "bytesCountThreshold", "<init>", "(Lokio/Source;J)V", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "bytesRead", "", "isThresholdReached", "()Z", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLimitingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitingSource.kt\ncom/chuckerteam/chucker/internal/support/LimitingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
/* loaded from: classes3.dex */
public final class LimitingSource extends ForwardingSource {

    /* renamed from: a */
    public final long f42940a;

    /* renamed from: b */
    public long f42941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitingSource(@NotNull Source delegate, long j) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f42940a = j;
    }

    public final boolean isThresholdReached() {
        if (this.f42941b >= this.f42940a) {
            return true;
        }
        return false;
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!isThresholdReached()) {
            long read = super.read(sink, j);
            this.f42941b += read;
            return read;
        }
        return -1L;
    }
}
