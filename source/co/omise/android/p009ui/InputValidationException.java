package co.omise.android.p009ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m28850d2 = {"Lco/omise/android/ui/InputValidationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "EmptyInputException", "InvalidInputException", "Lco/omise/android/ui/InputValidationException$EmptyInputException;", "Lco/omise/android/ui/InputValidationException$InvalidInputException;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.InputValidationException */
/* loaded from: classes3.dex */
public abstract class InputValidationException extends Exception {

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InputValidationException$EmptyInputException;", "Lco/omise/android/ui/InputValidationException;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InputValidationException$EmptyInputException */
    /* loaded from: classes3.dex */
    public static final class EmptyInputException extends InputValidationException {
        @NotNull
        public static final EmptyInputException INSTANCE = new EmptyInputException();

        private EmptyInputException() {
            super(null);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lco/omise/android/ui/InputValidationException$InvalidInputException;", "Lco/omise/android/ui/InputValidationException;", "()V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.InputValidationException$InvalidInputException */
    /* loaded from: classes3.dex */
    public static final class InvalidInputException extends InputValidationException {
        @NotNull
        public static final InvalidInputException INSTANCE = new InvalidInputException();

        private InvalidInputException() {
            super(null);
        }
    }

    public /* synthetic */ InputValidationException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InputValidationException() {
    }
}
