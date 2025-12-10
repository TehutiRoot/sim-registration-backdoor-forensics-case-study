package com.chuckerteam.chucker.internal.support;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001+B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0018\u0010*\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/ReportingSink;", "Lokio/Sink;", "Ljava/io/File;", "downstreamFile", "Lcom/chuckerteam/chucker/internal/support/ReportingSink$Callback;", "callback", "", "writeByteLimit", "<init>", "(Ljava/io/File;Lcom/chuckerteam/chucker/internal/support/ReportingSink$Callback;J)V", "Lokio/Buffer;", "source", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "close", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "Ljava/io/IOException;", "exception", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/io/IOException;)V", "d", "()Lkotlin/Unit;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/io/File;", "Lcom/chuckerteam/chucker/internal/support/ReportingSink$Callback;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "totalByteCount", "", "e", "Z", "isFailure", OperatorName.FILL_NON_ZERO, "isClosed", OperatorName.NON_STROKING_GRAY, "Lokio/Sink;", "downstream", "Callback", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ReportingSink implements Sink {

    /* renamed from: a */
    public final File f42951a;

    /* renamed from: b */
    public final Callback f42952b;

    /* renamed from: c */
    public final long f42953c;

    /* renamed from: d */
    public long f42954d;

    /* renamed from: e */
    public boolean f42955e;

    /* renamed from: f */
    public boolean f42956f;

    /* renamed from: g */
    public Sink f42957g;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/ReportingSink$Callback;", "", "onClosed", "", "file", "Ljava/io/File;", "sourceByteCount", "", "onFailure", "exception", "Ljava/io/IOException;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public interface Callback {
        void onClosed(@Nullable File file, long j);

        void onFailure(@Nullable File file, @NotNull IOException iOException);
    }

    public ReportingSink(@Nullable File file, @NotNull Callback callback, long j) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f42951a = file;
        this.f42952b = callback;
        this.f42953c = j;
        Sink sink = null;
        if (file != null) {
            try {
                sink = AbstractC20711kK0.m28940q(file, false, 1, null);
            } catch (IOException e) {
                File file2 = this.f42951a;
                m49913b(new IOException("Failed to use file " + file2 + " by Chucker", e));
            }
        }
        this.f42957g = sink;
    }

    /* renamed from: b */
    public final void m49913b(IOException iOException) {
        if (!this.f42955e) {
            this.f42955e = true;
            m49912d();
            this.f42952b.onFailure(this.f42951a, iOException);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42956f) {
            return;
        }
        this.f42956f = true;
        m49912d();
        this.f42952b.onClosed(this.f42951a, this.f42954d);
    }

    /* renamed from: d */
    public final Unit m49912d() {
        try {
            Sink sink = this.f42957g;
            if (sink != null) {
                sink.close();
                return Unit.INSTANCE;
            }
            return null;
        } catch (IOException e) {
            m49913b(e);
            return Unit.INSTANCE;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        if (this.f42955e) {
            return;
        }
        try {
            Sink sink = this.f42957g;
            if (sink != null) {
                sink.flush();
            }
        } catch (IOException e) {
            m49913b(e);
        }
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        Timeout timeout;
        Sink sink = this.f42957g;
        if (sink == null || (timeout = sink.timeout()) == null) {
            return Timeout.NONE;
        }
        return timeout;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = this.f42954d;
        this.f42954d = j2 + j;
        if (!this.f42955e) {
            long j3 = this.f42953c;
            if (j2 < j3) {
                if (j2 + j > j3) {
                    j = j3 - j2;
                }
                if (j == 0) {
                    return;
                }
                try {
                    Sink sink = this.f42957g;
                    if (sink != null) {
                        sink.write(source, j);
                    }
                } catch (IOException e) {
                    m49913b(e);
                }
            }
        }
    }

    public /* synthetic */ ReportingSink(File file, Callback callback, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, callback, (i & 4) != 0 ? Long.MAX_VALUE : j);
    }
}
