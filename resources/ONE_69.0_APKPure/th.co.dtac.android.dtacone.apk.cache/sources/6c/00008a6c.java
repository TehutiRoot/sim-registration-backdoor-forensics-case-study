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
    public final Thread.UncaughtExceptionHandler f44381a;

    /* renamed from: b */
    public final Tracker f44382b;

    /* renamed from: c */
    public final Context f44383c;

    /* renamed from: d */
    public ExceptionParser f44384d;

    /* renamed from: e */
    public GoogleAnalytics f44385e;

    public ExceptionReporter(@NonNull Tracker tracker, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull Context context) {
        String name;
        if (tracker != null) {
            if (context != null) {
                this.f44381a = uncaughtExceptionHandler;
                this.f44382b = tracker;
                this.f44384d = new StandardExceptionParser(context, new ArrayList());
                this.f44383c = context.getApplicationContext();
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
    public final Thread.UncaughtExceptionHandler m48761a() {
        return this.f44381a;
    }

    @Nullable
    public ExceptionParser getExceptionParser() {
        return this.f44384d;
    }

    public void setExceptionParser(@Nullable ExceptionParser exceptionParser) {
        this.f44384d = exceptionParser;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        String str;
        String str2;
        if (this.f44384d != null) {
            if (thread != null) {
                str2 = thread.getName();
            } else {
                str2 = null;
            }
            str = this.f44384d.getDescription(str2, th2);
        } else {
            str = "UncaughtException";
        }
        zzfc.zzd("Reporting uncaught exception: ".concat(String.valueOf(str)));
        Tracker tracker = this.f44382b;
        HitBuilders.ExceptionBuilder exceptionBuilder = new HitBuilders.ExceptionBuilder();
        exceptionBuilder.setDescription(str);
        exceptionBuilder.setFatal(true);
        tracker.send(exceptionBuilder.build());
        if (this.f44385e == null) {
            this.f44385e = GoogleAnalytics.getInstance(this.f44383c);
        }
        GoogleAnalytics googleAnalytics = this.f44385e;
        googleAnalytics.dispatchLocalHits();
        googleAnalytics.m48738a().zzf().zzn();
        if (this.f44381a != null) {
            zzfc.zzd("Passing exception to the original handler");
            this.f44381a.uncaughtException(thread, th2);
        }
    }
}