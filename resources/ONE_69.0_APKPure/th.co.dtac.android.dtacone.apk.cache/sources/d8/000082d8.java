package com.chuckerteam.chucker.internal.support;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006 "}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/support/TeeSource;", "Lokio/Source;", "upstream", "Lokio/Sink;", "sideStream", "<init>", "(Lokio/Source;Lokio/Sink;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "", "close", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "bytesRead", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lokio/Buffer;J)V", "d", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokio/Source;", "Lokio/Sink;", OperatorName.CURVE_TO, "Lokio/Buffer;", "tempBuffer", "", "Z", "isFailure", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class TeeSource implements Source {

    /* renamed from: a */
    public final Source f42991a;

    /* renamed from: b */
    public final Sink f42992b;

    /* renamed from: c */
    public final Buffer f42993c;

    /* renamed from: d */
    public boolean f42994d;

    public TeeSource(@NotNull Source upstream, @NotNull Sink sideStream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(sideStream, "sideStream");
        this.f42991a = upstream;
        this.f42992b = sideStream;
        this.f42993c = new Buffer();
    }

    /* renamed from: b */
    public final void m49891b(Buffer buffer, long j) {
        buffer.copyTo(this.f42993c, buffer.size() - j, j);
        try {
            this.f42992b.write(this.f42993c, j);
        } catch (IOException unused) {
            this.f42994d = true;
            m49890d();
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m49890d();
        this.f42991a.close();
    }

    /* renamed from: d */
    public final void m49890d() {
        try {
            this.f42992b.close();
        } catch (IOException unused) {
            this.f42994d = true;
        }
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long read = this.f42991a.read(sink, j);
        if (read == -1) {
            m49890d();
            return -1L;
        }
        if (!this.f42994d) {
            m49891b(sink, read);
        }
        return read;
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.f42991a.timeout();
    }
}