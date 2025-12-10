package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.internal.gtm.zzfc;
import java.lang.Thread;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@VisibleForTesting
/* loaded from: classes3.dex */
public class ExceptionReporter implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f44369a;

    /* renamed from: b */
    public final Tracker f44370b;

    /* renamed from: c */
    public final Context f44371c;

    /* renamed from: d */
    public ExceptionParser f44372d;

    /* renamed from: e */
    public GoogleAnalytics f44373e;

    public ExceptionReporter(@NonNull Tracker tracker, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull Context context) {
        String name;
        if (tracker != null) {
            if (context != null) {
                this.f44369a = uncaughtExceptionHandler;
                this.f44370b = tracker;
                this.f44372d = new StandardExceptionParser(context, new ArrayList());
                this.f44371c = context.getApplicationContext();
                if (uncaughtExceptionHandler == null) {
                    name = AbstractJsonLexerKt.NULL;
                } else {
                    name = uncaughtExceptionHandler.getClass().getName();
                }
                zzfc.zzd("ExceptionReporter created, original handler is ".concat(name));
                return;
            }
            throw new NullPointerException("context cannot be null");
        }
        throw new NullPointerException("tracker cannot be null");
    }

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler m48764a() {
        return this.f44369a;
    }

    @Nullable
    public ExceptionParser getExceptionParser() {
        return this.f44372d;
    }

    public void setExceptionParser(@Nullable ExceptionParser exceptionParser) {
        this.f44372d = exceptionParser;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        String str;
        String str2;
        if (this.f44372d != null) {
            if (thread != null) {
                str2 = thread.getName();
            } else {
                str2 = null;
            }
            str = this.f44372d.getDescription(str2, th2);
        } else {
            str = "UncaughtException";
        }
        zzfc.zzd("Reporting uncaught exception: ".concat(String.valueOf(str)));
        Tracker tracker = this.f44370b;
        HitBuilders.ExceptionBuilder exceptionBuilder = new HitBuilders.ExceptionBuilder();
        exceptionBuilder.setDescription(str);
        exceptionBuilder.setFatal(true);
        tracker.send(exceptionBuilder.build());
        if (this.f44373e == null) {
            this.f44373e = GoogleAnalytics.getInstance(this.f44371c);
        }
        GoogleAnalytics googleAnalytics = this.f44373e;
        googleAnalytics.dispatchLocalHits();
        googleAnalytics.m48741a().zzf().zzn();
        if (this.f44369a != null) {
            zzfc.zzd("Passing exception to the original handler");
            this.f44369a.uncaughtException(thread, th2);
        }
    }
}
