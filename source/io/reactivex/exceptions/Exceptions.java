package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.util.ExceptionHelper;

/* loaded from: classes5.dex */
public final class Exceptions {
    @NonNull
    public static RuntimeException propagate(@NonNull Throwable th2) {
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    public static void throwIfFatal(@NonNull Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (!(th2 instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th2);
            }
            throw ((ThreadDeath) th2);
        }
        throw ((VirtualMachineError) th2);
    }
}
