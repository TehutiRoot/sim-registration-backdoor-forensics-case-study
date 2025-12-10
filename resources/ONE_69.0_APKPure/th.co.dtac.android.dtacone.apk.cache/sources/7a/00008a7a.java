package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.p005os.EnvironmentCompat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

@VisibleForTesting
/* loaded from: classes3.dex */
public class StandardExceptionParser implements ExceptionParser {

    /* renamed from: a */
    public final TreeSet f44398a = new TreeSet();

    public StandardExceptionParser(@NonNull Context context, @NonNull Collection<String> collection) {
        setIncludedPackages(context, collection);
    }

    @Nullable
    public StackTraceElement getBestStackTraceElement(@NonNull Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        if (stackTrace != null && (r0 = stackTrace.length) != 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Iterator it = this.f44398a.iterator();
                while (it.hasNext()) {
                    if (className.startsWith((String) it.next())) {
                        return stackTraceElement;
                    }
                }
            }
            return stackTrace[0];
        }
        return null;
    }

    @NonNull
    public Throwable getCause(@NonNull Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    @Override // com.google.android.gms.analytics.ExceptionParser
    @NonNull
    public String getDescription(@Nullable String str, @NonNull Throwable th2) {
        return getDescription(getCause(th2), getBestStackTraceElement(getCause(th2)), str);
    }

    public void setIncludedPackages(@NonNull Context context, @NonNull Collection<String> collection) {
        this.f44398a.clear();
        HashSet<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            Iterator it = this.f44398a.iterator();
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (!str.startsWith(str2)) {
                    if (str2.startsWith(str)) {
                        this.f44398a.remove(str2);
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f44398a.add(str);
            }
        }
    }

    @NonNull
    public String getDescription(@NonNull Throwable th2, @Nullable StackTraceElement stackTraceElement, @Nullable String str) {
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append(th2.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            sb.append(String.format(" (@%s:%s:%s)", (split == null || (length = split.length) <= 0) ? EnvironmentCompat.MEDIA_UNKNOWN : split[length - 1], stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
        }
        if (str != null) {
            sb.append(String.format(" {%s}", str));
        }
        return sb.toString();
    }
}